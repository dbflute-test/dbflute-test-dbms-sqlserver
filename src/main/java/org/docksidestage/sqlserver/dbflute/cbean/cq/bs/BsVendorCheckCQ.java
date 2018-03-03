package org.docksidestage.sqlserver.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.sqlserver.dbflute.cbean.cq.ciq.*;
import org.docksidestage.sqlserver.dbflute.cbean.*;
import org.docksidestage.sqlserver.dbflute.cbean.cq.*;

/**
 * The base condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from VENDOR_CHECK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorCheckCIQ xcreateCIQ() {
        VendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorCheckCIQ xnewCIQ() {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join VENDOR_CHECK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorCheckId;
    public ConditionValue xdfgetVendorCheckId()
    { if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
      return _vendorCheckId; }
    protected ConditionValue xgetCValueVendorCheckId() { return xdfgetVendorCheckId(); }

    /**
     * Add order-by as ascend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("VENDOR_CHECK_ID"); return this; }

    protected ConditionValue _typeOfVarchar;
    public ConditionValue xdfgetTypeOfVarchar()
    { if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
      return _typeOfVarchar; }
    protected ConditionValue xgetCValueTypeOfVarchar() { return xdfgetTypeOfVarchar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("TYPE_OF_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("TYPE_OF_VARCHAR"); return this; }

    protected ConditionValue _typeOfNvarchar;
    public ConditionValue xdfgetTypeOfNvarchar()
    { if (_typeOfNvarchar == null) { _typeOfNvarchar = nCV(); }
      return _typeOfNvarchar; }
    protected ConditionValue xgetCValueTypeOfNvarchar() { return xdfgetTypeOfNvarchar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNvarchar_Asc() { regOBA("TYPE_OF_NVARCHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNvarchar_Desc() { regOBD("TYPE_OF_NVARCHAR"); return this; }

    protected ConditionValue _typeOfText;
    public ConditionValue xdfgetTypeOfText()
    { if (_typeOfText == null) { _typeOfText = nCV(); }
      return _typeOfText; }
    protected ConditionValue xgetCValueTypeOfText() { return xdfgetTypeOfText(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Asc() { regOBA("TYPE_OF_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Desc() { regOBD("TYPE_OF_TEXT"); return this; }

    protected ConditionValue _typeOfNumericDecimal;
    public ConditionValue xdfgetTypeOfNumericDecimal()
    { if (_typeOfNumericDecimal == null) { _typeOfNumericDecimal = nCV(); }
      return _typeOfNumericDecimal; }
    protected ConditionValue xgetCValueTypeOfNumericDecimal() { return xdfgetTypeOfNumericDecimal(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Asc() { regOBA("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Desc() { regOBD("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    protected ConditionValue _typeOfNumericInteger;
    public ConditionValue xdfgetTypeOfNumericInteger()
    { if (_typeOfNumericInteger == null) { _typeOfNumericInteger = nCV(); }
      return _typeOfNumericInteger; }
    protected ConditionValue xgetCValueTypeOfNumericInteger() { return xdfgetTypeOfNumericInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Asc() { regOBA("TYPE_OF_NUMERIC_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Desc() { regOBD("TYPE_OF_NUMERIC_INTEGER"); return this; }

    protected ConditionValue _typeOfNumericBigint;
    public ConditionValue xdfgetTypeOfNumericBigint()
    { if (_typeOfNumericBigint == null) { _typeOfNumericBigint = nCV(); }
      return _typeOfNumericBigint; }
    protected ConditionValue xgetCValueTypeOfNumericBigint() { return xdfgetTypeOfNumericBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Asc() { regOBA("TYPE_OF_NUMERIC_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Desc() { regOBD("TYPE_OF_NUMERIC_BIGINT"); return this; }

    protected ConditionValue _typeOfSmallinteger;
    public ConditionValue xdfgetTypeOfSmallinteger()
    { if (_typeOfSmallinteger == null) { _typeOfSmallinteger = nCV(); }
      return _typeOfSmallinteger; }
    protected ConditionValue xgetCValueTypeOfSmallinteger() { return xdfgetTypeOfSmallinteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallinteger_Asc() { regOBA("TYPE_OF_SMALLINTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallinteger_Desc() { regOBD("TYPE_OF_SMALLINTEGER"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue xdfgetTypeOfInteger()
    { if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
      return _typeOfInteger; }
    protected ConditionValue xgetCValueTypeOfInteger() { return xdfgetTypeOfInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Desc() { regOBD("TYPE_OF_INTEGER"); return this; }

    protected ConditionValue _typeOfBigint;
    public ConditionValue xdfgetTypeOfBigint()
    { if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
      return _typeOfBigint; }
    protected ConditionValue xgetCValueTypeOfBigint() { return xdfgetTypeOfBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Asc() { regOBA("TYPE_OF_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Desc() { regOBD("TYPE_OF_BIGINT"); return this; }

    protected ConditionValue _typeOfMoney;
    public ConditionValue xdfgetTypeOfMoney()
    { if (_typeOfMoney == null) { _typeOfMoney = nCV(); }
      return _typeOfMoney; }
    protected ConditionValue xgetCValueTypeOfMoney() { return xdfgetTypeOfMoney(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMoney_Asc() { regOBA("TYPE_OF_MONEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMoney_Desc() { regOBD("TYPE_OF_MONEY"); return this; }

    protected ConditionValue _typeOfSmallmoney;
    public ConditionValue xdfgetTypeOfSmallmoney()
    { if (_typeOfSmallmoney == null) { _typeOfSmallmoney = nCV(); }
      return _typeOfSmallmoney; }
    protected ConditionValue xgetCValueTypeOfSmallmoney() { return xdfgetTypeOfSmallmoney(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallmoney_Asc() { regOBA("TYPE_OF_SMALLMONEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallmoney_Desc() { regOBD("TYPE_OF_SMALLMONEY"); return this; }

    protected ConditionValue _typeOfDatetime;
    public ConditionValue xdfgetTypeOfDatetime()
    { if (_typeOfDatetime == null) { _typeOfDatetime = nCV(); }
      return _typeOfDatetime; }
    protected ConditionValue xgetCValueTypeOfDatetime() { return xdfgetTypeOfDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime_Asc() { regOBA("TYPE_OF_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime_Desc() { regOBD("TYPE_OF_DATETIME"); return this; }

    protected ConditionValue _typeOfSmalldatetime;
    public ConditionValue xdfgetTypeOfSmalldatetime()
    { if (_typeOfSmalldatetime == null) { _typeOfSmalldatetime = nCV(); }
      return _typeOfSmalldatetime; }
    protected ConditionValue xgetCValueTypeOfSmalldatetime() { return xdfgetTypeOfSmalldatetime(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmalldatetime_Asc() { regOBA("TYPE_OF_SMALLDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmalldatetime_Desc() { regOBD("TYPE_OF_SMALLDATETIME"); return this; }

    protected ConditionValue _typeOfBit;
    public ConditionValue xdfgetTypeOfBit()
    { if (_typeOfBit == null) { _typeOfBit = nCV(); }
      return _typeOfBit; }
    protected ConditionValue xgetCValueTypeOfBit() { return xdfgetTypeOfBit(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BIT: {bit(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBit_Asc() { regOBA("TYPE_OF_BIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BIT: {bit(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBit_Desc() { regOBD("TYPE_OF_BIT"); return this; }

    protected ConditionValue _typeOfBinary;
    public ConditionValue xdfgetTypeOfBinary()
    { if (_typeOfBinary == null) { _typeOfBinary = nCV(); }
      return _typeOfBinary; }
    protected ConditionValue xgetCValueTypeOfBinary() { return xdfgetTypeOfBinary(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BINARY: {binary(3000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinary_Asc() { regOBA("TYPE_OF_BINARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BINARY: {binary(3000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinary_Desc() { regOBD("TYPE_OF_BINARY"); return this; }

    protected ConditionValue _typeOfVarbinary;
    public ConditionValue xdfgetTypeOfVarbinary()
    { if (_typeOfVarbinary == null) { _typeOfVarbinary = nCV(); }
      return _typeOfVarbinary; }
    protected ConditionValue xgetCValueTypeOfVarbinary() { return xdfgetTypeOfVarbinary(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARBINARY: {varbinary(3000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarbinary_Asc() { regOBA("TYPE_OF_VARBINARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARBINARY: {varbinary(3000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarbinary_Desc() { regOBD("TYPE_OF_VARBINARY"); return this; }

    protected ConditionValue _typeOfUniqueidentifier;
    public ConditionValue xdfgetTypeOfUniqueidentifier()
    { if (_typeOfUniqueidentifier == null) { _typeOfUniqueidentifier = nCV(); }
      return _typeOfUniqueidentifier; }
    protected ConditionValue xgetCValueTypeOfUniqueidentifier() { return xdfgetTypeOfUniqueidentifier(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfUniqueidentifier_Asc() { regOBA("TYPE_OF_UNIQUEIDENTIFIER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfUniqueidentifier_Desc() { regOBD("TYPE_OF_UNIQUEIDENTIFIER"); return this; }

    protected ConditionValue _typeOfXml;
    public ConditionValue xdfgetTypeOfXml()
    { if (_typeOfXml == null) { _typeOfXml = nCV(); }
      return _typeOfXml; }
    protected ConditionValue xgetCValueTypeOfXml() { return xdfgetTypeOfXml(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXml_Asc() { regOBA("TYPE_OF_XML"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXml_Desc() { regOBD("TYPE_OF_XML"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorCheckCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorCheckCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorCheckCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorCheckCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorCheckCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
