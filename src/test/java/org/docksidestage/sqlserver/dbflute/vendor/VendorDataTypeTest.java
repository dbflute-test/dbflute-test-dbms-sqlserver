package org.docksidestage.sqlserver.dbflute.vendor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.UUID;

import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.sqlserver.dbflute.cbean.MemberCB;
import org.docksidestage.sqlserver.dbflute.cbean.VendorCheckCB;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlserver.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.sqlserver.dbflute.exentity.Member;
import org.docksidestage.sqlserver.dbflute.exentity.VendorCheck;
import org.docksidestage.sqlserver.dbflute.exentity.customize.VendorCheckDecimalSum;
import org.docksidestage.sqlserver.dbflute.exentity.customize.VendorCheckIntegerSum;
import org.docksidestage.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorDataTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                         Number Type
    //                                                                         ===========

    // ===================================================================================
    //                                                                           Date Type
    //                                                                           =========
    public void test_typeHadling_datetime_millisecondMagic() throws Exception {
        // ## Arrange ##
        Timestamp datetimeNonMillis = DfTypeUtil.toTimestamp("2009/12/24 00:00:00.000");
        Timestamp datetimeFullMillis = DfTypeUtil.toTimestamp("2009/12/23 23:59:59.999");
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfDatetime(datetimeNonMillis);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfDatetime_LessEqual(datetimeFullMillis);
        try {
            vendorCheckBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            log(e.getMessage());
        }
        // changed by new JDBC driveer
        // becomes '2009/12/24 00:00:00.000' by SQLServer
        //VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        //assertEquals(datetimeNonMillis, actual.getTypeOfDatetime());
    }

    // -----------------------------------------------------
    //                                               DATE BC
    //                                               -------
    public void test_DATE_BC_date() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_IsNotNull();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        Member member = memberBhv.selectEntity(cb);
        member.setBirthdate(DfTypeUtil.toTimestamp("-2009/12/25"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPKValue(member.getMemberId());
        DateFormat df = new SimpleDateFormat("Gyyyy/MM/dd");
        log(df.format(actual.getBirthdate()));
        assertFalse(DfTypeUtil.isDateBC(actual.getBirthdate())); // cannot handle BC date
        assertTrue(df.format(actual.getBirthdate()).contains("2010/12/25")); // Oops?
    }

    public void test_DATE_BC_datetime() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setFormalizedDatetime_IsNotNull();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        Member member = memberBhv.selectEntity(cb);
        member.setFormalizedDatetime(DfTypeUtil.toTimestamp("-2009/12/25 12:34:56.147"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPKValue(member.getMemberId());
        DateFormat df = new SimpleDateFormat("Gyyyy/MM/dd HH:mm:dd.SSS");
        log(df.format(actual.getFormalizedDatetime()));
        assertFalse(DfTypeUtil.isDateBC(actual.getFormalizedDatetime())); // cannot handle BC date
        assertTrue(df.format(actual.getFormalizedDatetime()).contains("2010/12/25")); // Oops?
    }

    // ===================================================================================
    //                                                                        Boolean Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                                   BIT
    //                                                   ---
    public void test_BIT_insert_select() throws Exception {
        // ## Arrange ##
        boolean expected = true;
        vendorCheckBhv.varyingQueryDelete(new VendorCheckCB(), op -> op.allowNonQueryDelete());
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfBit(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfBit_Equal(expected);
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(expected, selected.getTypeOfBit().booleanValue());
    }

    // ===================================================================================
    //                                                                         Binary Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                BINARY
    //                                                ------
    public void test_BINARY_insert_select() {
        // ## Arrange ##
        String expected = "foo";
        Member member = memberBhv.selectByPKValue(3);
        member.setMemberName(expected);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfBinary(serialize(member));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] bytes = selected.getTypeOfBinary();
        assertNotNull(bytes);
        Member deserialized = (Member) deserialize(bytes);
        log("deserialized=" + deserialized);
        assertEquals(expected, deserialized.getMemberName());
    }

    public void test_VARBINARY_insert_select() {
        // ## Arrange ##
        String expected = "foo";
        Member member = memberBhv.selectByPKValue(3);
        member.setMemberName(expected);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfVarbinary(serialize(member));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] bytes = selected.getTypeOfVarbinary();
        assertNotNull(bytes);
        Member deserialized = (Member) deserialize(bytes);
        log("deserialized=" + deserialized);
        assertEquals(expected, deserialized.getMemberName());
    }

    // ===================================================================================
    //                                                                        Various Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                                  UUID
    //                                                  ----
    public void test_UniqueIdentifier_insert_select() throws Exception {
        // ## Arrange ##
        UUID expected = UUID.fromString("FD8C7155-3A0A-DB11-BAC4-0011F5099158");
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfUniqueidentifier(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfUniqueidentifier_Equal(expected);
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(expected, selected.getTypeOfUniqueidentifier());
    }

    // -----------------------------------------------------
    //                                                   XML
    //                                                   ---
    public void test_XML_insert_select() {
        // ## Arrange ##
        String expected = "<foo/>";
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfXml(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actual = selected.getTypeOfXml();
        assertNotNull(actual);
        log("actual=" + actual);
        assertEquals(expected, actual);
    }

    // -----------------------------------------------------
    //                                         SUM(function)
    //                                         -------------
    @SuppressWarnings("unused")
    public void test_SUM_of_function() throws Exception {
        {
            VendorCheckDecimalSum vendorCheck = new VendorCheckDecimalSum();
            BigDecimal integerNonDigit = vendorCheck.getDecimalDigitSum();
        }
        {
            VendorCheckIntegerSum vendorCheck = new VendorCheckIntegerSum();
            BigDecimal integerNonDigit = vendorCheck.getIntegerNonDigitSum();
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected VendorCheck createVendorCheck() {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(99999));
        return vendorCheck;
    }

    protected VendorCheck createVendorCheck(Integer id) {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(id));
        return vendorCheck;
    }

    protected byte[] serialize(Serializable obj) {
        return DfTypeUtil.toBinary(obj);
    }

    protected Serializable deserialize(byte[] bytes) {
        return DfTypeUtil.toSerializable(bytes);
    }
}
