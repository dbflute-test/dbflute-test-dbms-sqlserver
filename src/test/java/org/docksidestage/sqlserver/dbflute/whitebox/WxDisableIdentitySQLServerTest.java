package org.docksidestage.sqlserver.dbflute.whitebox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dbflute.bhv.writable.QueryInsertSetupper;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.exception.SQLFailureException;
import org.docksidestage.sqlserver.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.sqlserver.dbflute.cbean.MemberCB;
import org.docksidestage.sqlserver.dbflute.cbean.MemberStatusCB;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlserver.dbflute.exentity.Member;
import org.docksidestage.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.8 (2010/12/16 Thursday)
 */
public class WxDisableIdentitySQLServerTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_varyingInsert_disablePrimaryKeyIdentity_basic_Tx() throws Exception {
        // ## Arrange ##
        Integer directId = 99999;
        Member member = new Member();
        member.setMemberId(directId);
        member.setMemberName("foo");
        member.setMemberAccount("foo");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        if (member.getDBMeta().hasIdentity()) { // mainly
            memberBhv.varyingInsert(member, op -> op.disablePrimaryKeyIdentity());
        } else {
            try {
                memberBhv.varyingInsert(member, op -> op.disablePrimaryKeyIdentity());
                fail();
            } catch (IllegalStateException e) {
                // OK
                log(e.getMessage());
                return;
            }
        }

        // ## Assert ##
        Member actual = memberBhv.selectByPKValueWithDeletedCheck(directId);
        assertEquals(directId, member.getMemberId());
        assertEquals(directId, actual.getMemberId());
        assertEquals("foo", actual.getMemberName());
        assertEquals(actual.getVersionNo(), member.getVersionNo());

        // ## Act ##
        try {
            member.setMemberName("bar");
            member.setMemberAccount("bar");
            memberBhv.varyingInsert(member, op -> op.disablePrimaryKeyIdentity());

            // ## Assert ##
            fail();
        } catch (EntityAlreadyExistsException e) {
            // OK
            log(e.getMessage());
        }

        // ## Act ##
        member.setMemberName("qux");
        member.setMemberAccount("qux");
        memberBhv.varyingInsert(member, op -> {}); // back to identity

        // ## Assert ##
        assertNotNull(member.getMemberId());
        assertNotSame(directId, member.getMemberId());

        // ## Act ##
        member.setMemberName("quux");
        member.setMemberAccount("quux");
        memberBhv.insert(member); // back to identity

        // ## Assert ##
        assertNotNull(member.getMemberId());
        assertNotSame(directId, member.getMemberId());
    }

    // ===================================================================================
    //                                                                        Batch Insert
    //                                                                        ============
    public void test_varyingBatchInsert_disablePrimaryKeyIdentity_Tx() throws Exception {
        // ## Arrange ##
        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = new Member();
            member.setMemberId(99991);
            member.setMemberName("foo1");
            member.setMemberAccount("foo1");
            member.setMemberStatusCode_Formalized();
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberId(99992);
            member.setMemberName("foo2");
            member.setMemberAccount("foo2");
            member.setMemberStatusCode_Formalized();
            memberList.add(member);
        }

        // ## Act ##
        if (MemberDbm.getInstance().hasIdentity()) { // mainly
            memberBhv.varyingBatchInsert(memberList, op -> op.disablePrimaryKeyIdentity());
        } else {
            try {
                memberBhv.varyingBatchInsert(memberList, op -> op.disablePrimaryKeyIdentity());
                fail();
            } catch (IllegalStateException e) {
                // OK
                log(e.getMessage());
                return;
            }
        }

        // ## Assert ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(Arrays.asList(memberList.get(0).getMemberId(), memberList.get(1).getMemberId()));
        ListResultBean<Member> actualList = memberBhv.selectList(cb);
        assertNotSame(0, actualList.size());
        assertEquals(Integer.valueOf(99991), memberList.get(0).getMemberId());
        assertEquals(Integer.valueOf(99992), memberList.get(1).getMemberId());
        assertEquals(Integer.valueOf(99991), actualList.get(0).getMemberId());
        assertEquals(Integer.valueOf(99992), actualList.get(1).getMemberId());

        // ## Act ##
        try {
            int index = 1;
            for (Member member : memberList) {
                member.setMemberName("bar" + index);
                member.setMemberAccount("bar" + index);
                ++index;
            }
            memberBhv.varyingBatchInsert(memberList, op -> op.disablePrimaryKeyIdentity());

            // ## Assert ##
            fail();
        } catch (EntityAlreadyExistsException e) {
            // OK
            log(e.getMessage());
        }

        // ## Act ##
        {
            int index = 1;
            for (Member member : memberList) {
                member.setMemberName("qux" + index);
                member.setMemberAccount("qux" + index);
                ++index;
            }
            memberBhv.varyingBatchInsert(memberList, op -> {}); // back to identity

            // ## Assert ##
            assertEquals(Integer.valueOf(99991), memberList.get(0).getMemberId());
            assertEquals(Integer.valueOf(99992), memberList.get(1).getMemberId());
            assertNotSame(Integer.valueOf(99991), actualList.get(0).getMemberId());
            assertNotSame(Integer.valueOf(99992), actualList.get(1).getMemberId());
        }

        // ## Act ##
        {
            int index = 1;
            for (Member member : memberList) {
                member.setMemberName("quux" + index);
                member.setMemberAccount("quux" + index);
                ++index;
            }
            memberBhv.batchInsert(memberList); // back to identity

            // ## Assert ##
            assertEquals(Integer.valueOf(99991), memberList.get(0).getMemberId());
            assertEquals(Integer.valueOf(99992), memberList.get(1).getMemberId());
            assertNotSame(Integer.valueOf(99991), actualList.get(0).getMemberId());
            assertNotSame(Integer.valueOf(99992), actualList.get(1).getMemberId());
        }
    }

    // ===================================================================================
    //                                                                        Query Insert
    //                                                                        ============
    public void test_queryInsert_IdentityEnabled_Tx() {
        // ## Arrange ##
        // ## Act ##
        try {
            memberBhv.queryInsert(new QueryInsertSetupper<Member, MemberCB>() {
                public ConditionBean setup(Member entity, MemberCB intoCB) {
                    MemberStatusCB cb = new MemberStatusCB();
                    intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnDisplayOrder());
                    intoCB.specify().columnMemberName().mappedFrom(cb.specify().columnMemberStatusName());
                    intoCB.specify().columnMemberAccount().mappedFrom(cb.specify().columnMemberStatusCode());
                    entity.setMemberStatusCode_Provisional();
                    return cb;
                }
            });

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            assertFalse(e instanceof EntityAlreadyExistsException);
            log(e.getMessage());
        }
    }

    public void test_varyingQueryInsert_IdentityDisabled_Tx() {
        // ## Arrange ##
        // ## Act ##
        try {
            memberBhv.varyingQueryInsert(new QueryInsertSetupper<Member, MemberCB>() {
                public ConditionBean setup(Member entity, MemberCB intoCB) {
                    MemberStatusCB cb = new MemberStatusCB();
                    intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnDisplayOrder());
                    intoCB.specify().columnMemberName().mappedFrom(cb.specify().columnMemberStatusName());
                    intoCB.specify().columnMemberAccount().mappedFrom(cb.specify().columnMemberStatusCode());
                    entity.setMemberStatusCode_Provisional();
                    return cb;
                }
            }, op -> op.disablePrimaryKeyIdentity());

            // ## Assert ##
            fail();
        } catch (EntityAlreadyExistsException e) {
            // OK
            log(e.getMessage());
        }
    }
}