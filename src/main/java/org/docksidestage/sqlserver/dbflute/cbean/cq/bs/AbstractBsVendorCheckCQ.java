package org.docksidestage.sqlserver.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.sqlserver.dbflute.allcommon.*;
import org.docksidestage.sqlserver.dbflute.cbean.*;
import org.docksidestage.sqlserver.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_NotEqual(Long vendorCheckId) {
        doSetVendorCheckId_NotEqual(vendorCheckId);
    }

    protected void doSetVendorCheckId_NotEqual(Long vendorCheckId) {
        regVendorCheckId(CK_NES, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param minNumber The min number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVendorCheckId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param minNumber The min number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    protected abstract ConditionValue xgetCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_Equal(String typeOfVarchar) {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_Equal(String typeOfVarchar) {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_NotEqual(String typeOfVarchar) {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_NotEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_GreaterThan(String typeOfVarchar) {
        regTypeOfVarchar(CK_GT, fRES(typeOfVarchar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_LessThan(String typeOfVarchar) {
        regTypeOfVarchar(CK_LT, fRES(typeOfVarchar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_GreaterEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_GE, fRES(typeOfVarchar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_LessEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_LE, fRES(typeOfVarchar));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_InScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        regINS(CK_INS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_NotInScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        regINS(CK_NINS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_NotLikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @param typeOfVarchar The value of typeOfVarchar as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_PrefixSearch(String typeOfVarchar) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     */
    public void setTypeOfVarchar_IsNull() { regTypeOfVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     */
    public void setTypeOfVarchar_IsNullOrEmpty() { regTypeOfVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {varchar(32)}
     */
    public void setTypeOfVarchar_IsNotNull() { regTypeOfVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfVarchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_Equal(String typeOfNvarchar) {
        doSetTypeOfNvarchar_Equal(fRES(typeOfNvarchar));
    }

    protected void doSetTypeOfNvarchar_Equal(String typeOfNvarchar) {
        regTypeOfNvarchar(CK_EQ, typeOfNvarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_NotEqual(String typeOfNvarchar) {
        doSetTypeOfNvarchar_NotEqual(fRES(typeOfNvarchar));
    }

    protected void doSetTypeOfNvarchar_NotEqual(String typeOfNvarchar) {
        regTypeOfNvarchar(CK_NES, typeOfNvarchar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_GreaterThan(String typeOfNvarchar) {
        regTypeOfNvarchar(CK_GT, fRES(typeOfNvarchar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_LessThan(String typeOfNvarchar) {
        regTypeOfNvarchar(CK_LT, fRES(typeOfNvarchar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_GreaterEqual(String typeOfNvarchar) {
        regTypeOfNvarchar(CK_GE, fRES(typeOfNvarchar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_LessEqual(String typeOfNvarchar) {
        regTypeOfNvarchar(CK_LE, fRES(typeOfNvarchar));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarcharList The collection of typeOfNvarchar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_InScope(Collection<String> typeOfNvarcharList) {
        doSetTypeOfNvarchar_InScope(typeOfNvarcharList);
    }

    protected void doSetTypeOfNvarchar_InScope(Collection<String> typeOfNvarcharList) {
        regINS(CK_INS, cTL(typeOfNvarcharList), xgetCValueTypeOfNvarchar(), "TYPE_OF_NVARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarcharList The collection of typeOfNvarchar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_NotInScope(Collection<String> typeOfNvarcharList) {
        doSetTypeOfNvarchar_NotInScope(typeOfNvarcharList);
    }

    protected void doSetTypeOfNvarchar_NotInScope(Collection<String> typeOfNvarcharList) {
        regINS(CK_NINS, cTL(typeOfNvarcharList), xgetCValueTypeOfNvarchar(), "TYPE_OF_NVARCHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)} <br>
     * <pre>e.g. setTypeOfNvarchar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfNvarchar The value of typeOfNvarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNvarchar_LikeSearch(String typeOfNvarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNvarchar_LikeSearch(typeOfNvarchar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)} <br>
     * <pre>e.g. setTypeOfNvarchar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfNvarchar The value of typeOfNvarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfNvarchar_LikeSearch(String typeOfNvarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfNvarchar), xgetCValueTypeOfNvarchar(), "TYPE_OF_NVARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNvarchar_NotLikeSearch(String typeOfNvarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNvarchar_NotLikeSearch(typeOfNvarchar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfNvarchar_NotLikeSearch(String typeOfNvarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfNvarchar), xgetCValueTypeOfNvarchar(), "TYPE_OF_NVARCHAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @param typeOfNvarchar The value of typeOfNvarchar as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNvarchar_PrefixSearch(String typeOfNvarchar) {
        setTypeOfNvarchar_LikeSearch(typeOfNvarchar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     */
    public void setTypeOfNvarchar_IsNull() { regTypeOfNvarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     */
    public void setTypeOfNvarchar_IsNullOrEmpty() { regTypeOfNvarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     */
    public void setTypeOfNvarchar_IsNotNull() { regTypeOfNvarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfNvarchar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNvarchar(), "TYPE_OF_NVARCHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfNvarchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_Equal(String typeOfText) {
        doSetTypeOfText_Equal(fRES(typeOfText));
    }

    protected void doSetTypeOfText_Equal(String typeOfText) {
        regTypeOfText(CK_EQ, typeOfText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_NotEqual(String typeOfText) {
        doSetTypeOfText_NotEqual(fRES(typeOfText));
    }

    protected void doSetTypeOfText_NotEqual(String typeOfText) {
        regTypeOfText(CK_NES, typeOfText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_GreaterThan(String typeOfText) {
        regTypeOfText(CK_GT, fRES(typeOfText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_LessThan(String typeOfText) {
        regTypeOfText(CK_LT, fRES(typeOfText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_GreaterEqual(String typeOfText) {
        regTypeOfText(CK_GE, fRES(typeOfText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_LessEqual(String typeOfText) {
        regTypeOfText(CK_LE, fRES(typeOfText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfTextList The collection of typeOfText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_InScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_InScope(typeOfTextList);
    }

    protected void doSetTypeOfText_InScope(Collection<String> typeOfTextList) {
        regINS(CK_INS, cTL(typeOfTextList), xgetCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfTextList The collection of typeOfText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_NotInScope(typeOfTextList);
    }

    protected void doSetTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        regINS(CK_NINS, cTL(typeOfTextList), xgetCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)} <br>
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfText_LikeSearch(typeOfText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)} <br>
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfText), xgetCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfText_NotLikeSearch(typeOfText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfText), xgetCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     * @param typeOfText The value of typeOfText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_PrefixSearch(String typeOfText) {
        setTypeOfText_LikeSearch(typeOfText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     */
    public void setTypeOfText_IsNull() { regTypeOfText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     */
    public void setTypeOfText_IsNullOrEmpty() { regTypeOfText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {text(2147483647)}
     */
    public void setTypeOfText_IsNotNull() { regTypeOfText(CK_ISNN, DOBJ); }

    protected void regTypeOfText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfText(), "TYPE_OF_TEXT"); }
    protected abstract ConditionValue xgetCValueTypeOfText();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        doSetTypeOfNumericDecimal_Equal(typeOfNumericDecimal);
    }

    protected void doSetTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_EQ, typeOfNumericDecimal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_NotEqual(java.math.BigDecimal typeOfNumericDecimal) {
        doSetTypeOfNumericDecimal_NotEqual(typeOfNumericDecimal);
    }

    protected void doSetTypeOfNumericDecimal_NotEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_NES, typeOfNumericDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_GreaterThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GT, typeOfNumericDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_LessThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LT, typeOfNumericDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_GreaterEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GE, typeOfNumericDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_LessEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LE, typeOfNumericDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericDecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_InScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_INS, cTL(typeOfNumericDecimalList), xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_NotInScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_NINS, cTL(typeOfNumericDecimalList), xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNull() { regTypeOfNumericDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNotNull() { regTypeOfNumericDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        doSetTypeOfNumericInteger_Equal(typeOfNumericInteger);
    }

    protected void doSetTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_EQ, typeOfNumericInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_NotEqual(Integer typeOfNumericInteger) {
        doSetTypeOfNumericInteger_NotEqual(typeOfNumericInteger);
    }

    protected void doSetTypeOfNumericInteger_NotEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_NES, typeOfNumericInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_GreaterThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GT, typeOfNumericInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_LessThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LT, typeOfNumericInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_GreaterEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GE, typeOfNumericInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_LessEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LE, typeOfNumericInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param minNumber The min number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param minNumber The min number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_InScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_INS, cTL(typeOfNumericIntegerList), xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_NotInScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_NINS, cTL(typeOfNumericIntegerList), xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     */
    public void setTypeOfNumericInteger_IsNull() { regTypeOfNumericInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     */
    public void setTypeOfNumericInteger_IsNotNull() { regTypeOfNumericInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        doSetTypeOfNumericBigint_Equal(typeOfNumericBigint);
    }

    protected void doSetTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_EQ, typeOfNumericBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_NotEqual(Long typeOfNumericBigint) {
        doSetTypeOfNumericBigint_NotEqual(typeOfNumericBigint);
    }

    protected void doSetTypeOfNumericBigint_NotEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_NES, typeOfNumericBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_GreaterThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GT, typeOfNumericBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_LessThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LT, typeOfNumericBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_GreaterEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GE, typeOfNumericBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_LessEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LE, typeOfNumericBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param minNumber The min number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param minNumber The min number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_InScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_INS, cTL(typeOfNumericBigintList), xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_NotInScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_NINS, cTL(typeOfNumericBigintList), xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     */
    public void setTypeOfNumericBigint_IsNull() { regTypeOfNumericBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     */
    public void setTypeOfNumericBigint_IsNotNull() { regTypeOfNumericBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallinteger The value of typeOfSmallinteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_Equal(Integer typeOfSmallinteger) {
        doSetTypeOfSmallinteger_Equal(typeOfSmallinteger);
    }

    protected void doSetTypeOfSmallinteger_Equal(Integer typeOfSmallinteger) {
        regTypeOfSmallinteger(CK_EQ, typeOfSmallinteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallinteger The value of typeOfSmallinteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_NotEqual(Integer typeOfSmallinteger) {
        doSetTypeOfSmallinteger_NotEqual(typeOfSmallinteger);
    }

    protected void doSetTypeOfSmallinteger_NotEqual(Integer typeOfSmallinteger) {
        regTypeOfSmallinteger(CK_NES, typeOfSmallinteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallinteger The value of typeOfSmallinteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_GreaterThan(Integer typeOfSmallinteger) {
        regTypeOfSmallinteger(CK_GT, typeOfSmallinteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallinteger The value of typeOfSmallinteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_LessThan(Integer typeOfSmallinteger) {
        regTypeOfSmallinteger(CK_LT, typeOfSmallinteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallinteger The value of typeOfSmallinteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_GreaterEqual(Integer typeOfSmallinteger) {
        regTypeOfSmallinteger(CK_GE, typeOfSmallinteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallinteger The value of typeOfSmallinteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_LessEqual(Integer typeOfSmallinteger) {
        regTypeOfSmallinteger(CK_LE, typeOfSmallinteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param minNumber The min number of typeOfSmallinteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfSmallinteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfSmallinteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfSmallinteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param minNumber The min number of typeOfSmallinteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfSmallinteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfSmallinteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfSmallinteger(), "TYPE_OF_SMALLINTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallintegerList The collection of typeOfSmallinteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_InScope(Collection<Integer> typeOfSmallintegerList) {
        doSetTypeOfSmallinteger_InScope(typeOfSmallintegerList);
    }

    protected void doSetTypeOfSmallinteger_InScope(Collection<Integer> typeOfSmallintegerList) {
        regINS(CK_INS, cTL(typeOfSmallintegerList), xgetCValueTypeOfSmallinteger(), "TYPE_OF_SMALLINTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @param typeOfSmallintegerList The collection of typeOfSmallinteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfSmallinteger_NotInScope(Collection<Integer> typeOfSmallintegerList) {
        doSetTypeOfSmallinteger_NotInScope(typeOfSmallintegerList);
    }

    protected void doSetTypeOfSmallinteger_NotInScope(Collection<Integer> typeOfSmallintegerList) {
        regINS(CK_NINS, cTL(typeOfSmallintegerList), xgetCValueTypeOfSmallinteger(), "TYPE_OF_SMALLINTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     */
    public void setTypeOfSmallinteger_IsNull() { regTypeOfSmallinteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     */
    public void setTypeOfSmallinteger_IsNotNull() { regTypeOfSmallinteger(CK_ISNN, DOBJ); }

    protected void regTypeOfSmallinteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfSmallinteger(), "TYPE_OF_SMALLINTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfSmallinteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfInteger The value of typeOfInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_Equal(Integer typeOfInteger) {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected void doSetTypeOfInteger_Equal(Integer typeOfInteger) {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfInteger The value of typeOfInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_NotEqual(Integer typeOfInteger) {
        doSetTypeOfInteger_NotEqual(typeOfInteger);
    }

    protected void doSetTypeOfInteger_NotEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_NES, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfInteger The value of typeOfInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfInteger The value of typeOfInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param minNumber The min number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param minNumber The min number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_InScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_INS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_NotInScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_NINS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     */
    public void setTypeOfInteger_IsNull() { regTypeOfInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {int(10)}
     */
    public void setTypeOfInteger_IsNotNull() { regTypeOfInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigint The value of typeOfBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_Equal(Long typeOfBigint) {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected void doSetTypeOfBigint_Equal(Long typeOfBigint) {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigint The value of typeOfBigint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_NotEqual(Long typeOfBigint) {
        doSetTypeOfBigint_NotEqual(typeOfBigint);
    }

    protected void doSetTypeOfBigint_NotEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_NES, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterThan(Long typeOfBigint) {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigint The value of typeOfBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessThan(Long typeOfBigint) {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigint The value of typeOfBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param minNumber The min number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param minNumber The min number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigintList The collection of typeOfBigint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_InScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        regINS(CK_INS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     * @param typeOfBigintList The collection of typeOfBigint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_NotInScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        regINS(CK_NINS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     */
    public void setTypeOfBigint_IsNull() { regTypeOfBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {bigint(19)}
     */
    public void setTypeOfBigint_IsNotNull() { regTypeOfBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoney The value of typeOfMoney as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_Equal(java.math.BigDecimal typeOfMoney) {
        doSetTypeOfMoney_Equal(typeOfMoney);
    }

    protected void doSetTypeOfMoney_Equal(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_EQ, typeOfMoney);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoney The value of typeOfMoney as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_NotEqual(java.math.BigDecimal typeOfMoney) {
        doSetTypeOfMoney_NotEqual(typeOfMoney);
    }

    protected void doSetTypeOfMoney_NotEqual(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_NES, typeOfMoney);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoney The value of typeOfMoney as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_GreaterThan(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_GT, typeOfMoney);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoney The value of typeOfMoney as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_LessThan(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_LT, typeOfMoney);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoney The value of typeOfMoney as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_GreaterEqual(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_GE, typeOfMoney);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoney The value of typeOfMoney as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_LessEqual(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_LE, typeOfMoney);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param minNumber The min number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfMoney_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfMoney_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param minNumber The min number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfMoney_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfMoney(), "TYPE_OF_MONEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoneyList The collection of typeOfMoney as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfMoney_InScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        doSetTypeOfMoney_InScope(typeOfMoneyList);
    }

    protected void doSetTypeOfMoney_InScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        regINS(CK_INS, cTL(typeOfMoneyList), xgetCValueTypeOfMoney(), "TYPE_OF_MONEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     * @param typeOfMoneyList The collection of typeOfMoney as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfMoney_NotInScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        doSetTypeOfMoney_NotInScope(typeOfMoneyList);
    }

    protected void doSetTypeOfMoney_NotInScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        regINS(CK_NINS, cTL(typeOfMoneyList), xgetCValueTypeOfMoney(), "TYPE_OF_MONEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     */
    public void setTypeOfMoney_IsNull() { regTypeOfMoney(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_MONEY: {money(19, 4)}
     */
    public void setTypeOfMoney_IsNotNull() { regTypeOfMoney(CK_ISNN, DOBJ); }

    protected void regTypeOfMoney(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfMoney(), "TYPE_OF_MONEY"); }
    protected abstract ConditionValue xgetCValueTypeOfMoney();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoney The value of typeOfSmallmoney as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_Equal(java.math.BigDecimal typeOfSmallmoney) {
        doSetTypeOfSmallmoney_Equal(typeOfSmallmoney);
    }

    protected void doSetTypeOfSmallmoney_Equal(java.math.BigDecimal typeOfSmallmoney) {
        regTypeOfSmallmoney(CK_EQ, typeOfSmallmoney);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoney The value of typeOfSmallmoney as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_NotEqual(java.math.BigDecimal typeOfSmallmoney) {
        doSetTypeOfSmallmoney_NotEqual(typeOfSmallmoney);
    }

    protected void doSetTypeOfSmallmoney_NotEqual(java.math.BigDecimal typeOfSmallmoney) {
        regTypeOfSmallmoney(CK_NES, typeOfSmallmoney);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoney The value of typeOfSmallmoney as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_GreaterThan(java.math.BigDecimal typeOfSmallmoney) {
        regTypeOfSmallmoney(CK_GT, typeOfSmallmoney);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoney The value of typeOfSmallmoney as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_LessThan(java.math.BigDecimal typeOfSmallmoney) {
        regTypeOfSmallmoney(CK_LT, typeOfSmallmoney);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoney The value of typeOfSmallmoney as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_GreaterEqual(java.math.BigDecimal typeOfSmallmoney) {
        regTypeOfSmallmoney(CK_GE, typeOfSmallmoney);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoney The value of typeOfSmallmoney as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_LessEqual(java.math.BigDecimal typeOfSmallmoney) {
        regTypeOfSmallmoney(CK_LE, typeOfSmallmoney);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param minNumber The min number of typeOfSmallmoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfSmallmoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfSmallmoney_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfSmallmoney_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param minNumber The min number of typeOfSmallmoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfSmallmoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfSmallmoney_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfSmallmoney(), "TYPE_OF_SMALLMONEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoneyList The collection of typeOfSmallmoney as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_InScope(Collection<java.math.BigDecimal> typeOfSmallmoneyList) {
        doSetTypeOfSmallmoney_InScope(typeOfSmallmoneyList);
    }

    protected void doSetTypeOfSmallmoney_InScope(Collection<java.math.BigDecimal> typeOfSmallmoneyList) {
        regINS(CK_INS, cTL(typeOfSmallmoneyList), xgetCValueTypeOfSmallmoney(), "TYPE_OF_SMALLMONEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @param typeOfSmallmoneyList The collection of typeOfSmallmoney as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfSmallmoney_NotInScope(Collection<java.math.BigDecimal> typeOfSmallmoneyList) {
        doSetTypeOfSmallmoney_NotInScope(typeOfSmallmoneyList);
    }

    protected void doSetTypeOfSmallmoney_NotInScope(Collection<java.math.BigDecimal> typeOfSmallmoneyList) {
        regINS(CK_NINS, cTL(typeOfSmallmoneyList), xgetCValueTypeOfSmallmoney(), "TYPE_OF_SMALLMONEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     */
    public void setTypeOfSmallmoney_IsNull() { regTypeOfSmallmoney(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     */
    public void setTypeOfSmallmoney_IsNotNull() { regTypeOfSmallmoney(CK_ISNN, DOBJ); }

    protected void regTypeOfSmallmoney(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfSmallmoney(), "TYPE_OF_SMALLMONEY"); }
    protected abstract ConditionValue xgetCValueTypeOfSmallmoney();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @param typeOfDatetime The value of typeOfDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_Equal(java.sql.Timestamp typeOfDatetime) {
        regTypeOfDatetime(CK_EQ,  typeOfDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @param typeOfDatetime The value of typeOfDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_GreaterThan(java.sql.Timestamp typeOfDatetime) {
        regTypeOfDatetime(CK_GT,  typeOfDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @param typeOfDatetime The value of typeOfDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_LessThan(java.sql.Timestamp typeOfDatetime) {
        regTypeOfDatetime(CK_LT,  typeOfDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @param typeOfDatetime The value of typeOfDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_GreaterEqual(java.sql.Timestamp typeOfDatetime) {
        regTypeOfDatetime(CK_GE,  typeOfDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @param typeOfDatetime The value of typeOfDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_LessEqual(java.sql.Timestamp typeOfDatetime) {
        regTypeOfDatetime(CK_LE, typeOfDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * <pre>e.g. setTypeOfDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfDatetime_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * <pre>e.g. setTypeOfDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueTypeOfDatetime(), "TYPE_OF_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTypeOfDatetime_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     */
    public void setTypeOfDatetime_IsNull() { regTypeOfDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     */
    public void setTypeOfDatetime_IsNotNull() { regTypeOfDatetime(CK_ISNN, DOBJ); }

    protected void regTypeOfDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDatetime(), "TYPE_OF_DATETIME"); }
    protected abstract ConditionValue xgetCValueTypeOfDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @param typeOfSmalldatetime The value of typeOfSmalldatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmalldatetime_Equal(java.sql.Timestamp typeOfSmalldatetime) {
        regTypeOfSmalldatetime(CK_EQ,  typeOfSmalldatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @param typeOfSmalldatetime The value of typeOfSmalldatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmalldatetime_GreaterThan(java.sql.Timestamp typeOfSmalldatetime) {
        regTypeOfSmalldatetime(CK_GT,  typeOfSmalldatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @param typeOfSmalldatetime The value of typeOfSmalldatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmalldatetime_LessThan(java.sql.Timestamp typeOfSmalldatetime) {
        regTypeOfSmalldatetime(CK_LT,  typeOfSmalldatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @param typeOfSmalldatetime The value of typeOfSmalldatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmalldatetime_GreaterEqual(java.sql.Timestamp typeOfSmalldatetime) {
        regTypeOfSmalldatetime(CK_GE,  typeOfSmalldatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @param typeOfSmalldatetime The value of typeOfSmalldatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmalldatetime_LessEqual(java.sql.Timestamp typeOfSmalldatetime) {
        regTypeOfSmalldatetime(CK_LE, typeOfSmalldatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * <pre>e.g. setTypeOfSmalldatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfSmalldatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfSmalldatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfSmalldatetime_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfSmalldatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * <pre>e.g. setTypeOfSmalldatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfSmalldatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfSmalldatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfSmalldatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueTypeOfSmalldatetime(), "TYPE_OF_SMALLDATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfSmalldatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfSmalldatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTypeOfSmalldatetime_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfSmalldatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     */
    public void setTypeOfSmalldatetime_IsNull() { regTypeOfSmalldatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     */
    public void setTypeOfSmalldatetime_IsNotNull() { regTypeOfSmalldatetime(CK_ISNN, DOBJ); }

    protected void regTypeOfSmalldatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfSmalldatetime(), "TYPE_OF_SMALLDATETIME"); }
    protected abstract ConditionValue xgetCValueTypeOfSmalldatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIT: {bit(1)}
     * @param typeOfBit The value of typeOfBit as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBit_Equal(Boolean typeOfBit) {
        regTypeOfBit(CK_EQ, typeOfBit);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIT: {bit(1)}
     */
    public void setTypeOfBit_IsNull() { regTypeOfBit(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIT: {bit(1)}
     */
    public void setTypeOfBit_IsNotNull() { regTypeOfBit(CK_ISNN, DOBJ); }

    protected void regTypeOfBit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBit(), "TYPE_OF_BIT"); }
    protected abstract ConditionValue xgetCValueTypeOfBit();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY: {binary(3000)}
     */
    public void setTypeOfBinary_IsNull() { regTypeOfBinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY: {binary(3000)}
     */
    public void setTypeOfBinary_IsNotNull() { regTypeOfBinary(CK_ISNN, DOBJ); }

    protected void regTypeOfBinary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBinary(), "TYPE_OF_BINARY"); }
    protected abstract ConditionValue xgetCValueTypeOfBinary();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARBINARY: {varbinary(3000)}
     */
    public void setTypeOfVarbinary_IsNull() { regTypeOfVarbinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARBINARY: {varbinary(3000)}
     */
    public void setTypeOfVarbinary_IsNotNull() { regTypeOfVarbinary(CK_ISNN, DOBJ); }

    protected void regTypeOfVarbinary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarbinary(), "TYPE_OF_VARBINARY"); }
    protected abstract ConditionValue xgetCValueTypeOfVarbinary();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     * @param typeOfUniqueidentifier The value of typeOfUniqueidentifier as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfUniqueidentifier_Equal(java.util.UUID typeOfUniqueidentifier) {
        regTypeOfUniqueidentifier(CK_EQ, typeOfUniqueidentifier);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     * @param typeOfUniqueidentifierList The collection of typeOfUniqueidentifier as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfUniqueidentifier_InScope(Collection<java.util.UUID> typeOfUniqueidentifierList) {
        regINS(CK_INS, cTL(typeOfUniqueidentifierList), xgetCValueTypeOfUniqueidentifier(), "TYPE_OF_UNIQUEIDENTIFIER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     */
    public void setTypeOfUniqueidentifier_IsNull() { regTypeOfUniqueidentifier(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     */
    public void setTypeOfUniqueidentifier_IsNotNull() { regTypeOfUniqueidentifier(CK_ISNN, DOBJ); }

    protected void regTypeOfUniqueidentifier(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfUniqueidentifier(), "TYPE_OF_UNIQUEIDENTIFIER"); }
    protected abstract ConditionValue xgetCValueTypeOfUniqueidentifier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_Equal(String typeOfXml) {
        doSetTypeOfXml_Equal(fRES(typeOfXml));
    }

    protected void doSetTypeOfXml_Equal(String typeOfXml) {
        regTypeOfXml(CK_EQ, typeOfXml);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_NotEqual(String typeOfXml) {
        doSetTypeOfXml_NotEqual(fRES(typeOfXml));
    }

    protected void doSetTypeOfXml_NotEqual(String typeOfXml) {
        regTypeOfXml(CK_NES, typeOfXml);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_GreaterThan(String typeOfXml) {
        regTypeOfXml(CK_GT, fRES(typeOfXml));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_LessThan(String typeOfXml) {
        regTypeOfXml(CK_LT, fRES(typeOfXml));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_GreaterEqual(String typeOfXml) {
        regTypeOfXml(CK_GE, fRES(typeOfXml));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_LessEqual(String typeOfXml) {
        regTypeOfXml(CK_LE, fRES(typeOfXml));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXmlList The collection of typeOfXml as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_InScope(Collection<String> typeOfXmlList) {
        doSetTypeOfXml_InScope(typeOfXmlList);
    }

    protected void doSetTypeOfXml_InScope(Collection<String> typeOfXmlList) {
        regINS(CK_INS, cTL(typeOfXmlList), xgetCValueTypeOfXml(), "TYPE_OF_XML");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXmlList The collection of typeOfXml as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_NotInScope(Collection<String> typeOfXmlList) {
        doSetTypeOfXml_NotInScope(typeOfXmlList);
    }

    protected void doSetTypeOfXml_NotInScope(Collection<String> typeOfXmlList) {
        regINS(CK_NINS, cTL(typeOfXmlList), xgetCValueTypeOfXml(), "TYPE_OF_XML");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)} <br>
     * <pre>e.g. setTypeOfXml_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfXml The value of typeOfXml as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfXml_LikeSearch(String typeOfXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfXml_LikeSearch(typeOfXml, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)} <br>
     * <pre>e.g. setTypeOfXml_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfXml The value of typeOfXml as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfXml_LikeSearch(String typeOfXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfXml), xgetCValueTypeOfXml(), "TYPE_OF_XML", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfXml_NotLikeSearch(String typeOfXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfXml_NotLikeSearch(typeOfXml, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfXml_NotLikeSearch(String typeOfXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfXml), xgetCValueTypeOfXml(), "TYPE_OF_XML", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     * @param typeOfXml The value of typeOfXml as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfXml_PrefixSearch(String typeOfXml) {
        setTypeOfXml_LikeSearch(typeOfXml, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     */
    public void setTypeOfXml_IsNull() { regTypeOfXml(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     */
    public void setTypeOfXml_IsNullOrEmpty() { regTypeOfXml(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_XML: {xml(2147483647)}
     */
    public void setTypeOfXml_IsNotNull() { regTypeOfXml(CK_ISNN, DOBJ); }

    protected void regTypeOfXml(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfXml(), "TYPE_OF_XML"); }
    protected abstract ConditionValue xgetCValueTypeOfXml();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorCheckCQ sq);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "VENDOR_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorCheckCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected VendorCheckCB newMyCB() {
        return new VendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
