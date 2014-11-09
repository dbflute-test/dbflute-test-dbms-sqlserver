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
 * The condition-query for in-line of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
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
    protected ConditionValue xgetCValueVendorCheckId() { return _myCQ.xdfgetVendorCheckId(); }
    protected ConditionValue xgetCValueTypeOfVarchar() { return _myCQ.xdfgetTypeOfVarchar(); }
    protected ConditionValue xgetCValueTypeOfNvarchar() { return _myCQ.xdfgetTypeOfNvarchar(); }
    protected ConditionValue xgetCValueTypeOfText() { return _myCQ.xdfgetTypeOfText(); }
    protected ConditionValue xgetCValueTypeOfNumericDecimal() { return _myCQ.xdfgetTypeOfNumericDecimal(); }
    protected ConditionValue xgetCValueTypeOfNumericInteger() { return _myCQ.xdfgetTypeOfNumericInteger(); }
    protected ConditionValue xgetCValueTypeOfNumericBigint() { return _myCQ.xdfgetTypeOfNumericBigint(); }
    protected ConditionValue xgetCValueTypeOfSmallinteger() { return _myCQ.xdfgetTypeOfSmallinteger(); }
    protected ConditionValue xgetCValueTypeOfInteger() { return _myCQ.xdfgetTypeOfInteger(); }
    protected ConditionValue xgetCValueTypeOfBigint() { return _myCQ.xdfgetTypeOfBigint(); }
    protected ConditionValue xgetCValueTypeOfMoney() { return _myCQ.xdfgetTypeOfMoney(); }
    protected ConditionValue xgetCValueTypeOfSmallmoney() { return _myCQ.xdfgetTypeOfSmallmoney(); }
    protected ConditionValue xgetCValueTypeOfDatetime() { return _myCQ.xdfgetTypeOfDatetime(); }
    protected ConditionValue xgetCValueTypeOfSmalldatetime() { return _myCQ.xdfgetTypeOfSmalldatetime(); }
    protected ConditionValue xgetCValueTypeOfBit() { return _myCQ.xdfgetTypeOfBit(); }
    protected ConditionValue xgetCValueTypeOfBinary() { return _myCQ.xdfgetTypeOfBinary(); }
    protected ConditionValue xgetCValueTypeOfVarbinary() { return _myCQ.xdfgetTypeOfVarbinary(); }
    protected ConditionValue xgetCValueTypeOfUniqueidentifier() { return _myCQ.xdfgetTypeOfUniqueidentifier(); }
    protected ConditionValue xgetCValueTypeOfXml() { return _myCQ.xdfgetTypeOfXml(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorCheckCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorCheckCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}
