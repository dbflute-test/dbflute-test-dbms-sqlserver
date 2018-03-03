package org.docksidestage.sqlserver.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.sqlserver.dbflute.cbean.*;
import org.docksidestage.sqlserver.dbflute.cbean.cq.bs.*;
import org.docksidestage.sqlserver.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginCIQ extends AbstractBsMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMemberLoginCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberLoginCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMemberLoginCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueMemberLoginId() { return _myCQ.xdfgetMemberLoginId(); }
    protected ConditionValue xgetCValueMemberId() { return _myCQ.xdfgetMemberId(); }
    public String keepMemberId_InScopeRelation_Member(MemberCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_Member(sq); }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_Member(sq); }
    protected ConditionValue xgetCValueLoginDatetime() { return _myCQ.xdfgetLoginDatetime(); }
    protected ConditionValue xgetCValueMobileLoginFlg() { return _myCQ.xdfgetMobileLoginFlg(); }
    protected ConditionValue xgetCValueLoginMemberStatusCode() { return _myCQ.xdfgetLoginMemberStatusCode(); }
    public String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepLoginMemberStatusCode_InScopeRelation_MemberStatus(sq); }
    public String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MemberLoginCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MemberLoginCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MemberLoginCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MemberLoginCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MemberLoginCB.class.getName(); }
    protected String xinCQ() { return MemberLoginCQ.class.getName(); }
}
