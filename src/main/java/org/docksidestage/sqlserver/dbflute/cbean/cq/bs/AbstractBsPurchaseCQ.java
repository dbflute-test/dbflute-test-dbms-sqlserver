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
 * The abstract condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPurchaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "PURCHASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseId The value of purchaseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_Equal(Long purchaseId) {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected void doSetPurchaseId_Equal(Long purchaseId) {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseId The value of purchaseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_NotEqual(Long purchaseId) {
        doSetPurchaseId_NotEqual(purchaseId);
    }

    protected void doSetPurchaseId_NotEqual(Long purchaseId) {
        regPurchaseId(CK_NES, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseId The value of purchaseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_GreaterThan(Long purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseId The value of purchaseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_LessThan(Long purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseId The value of purchaseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_GreaterEqual(Long purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseId The value of purchaseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_LessEqual(Long purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseId(), "PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseIdList The collection of purchaseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseId_InScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected void doSetPurchaseId_InScope(Collection<Long> purchaseIdList) {
        regINS(CK_INS, cTL(purchaseIdList), xgetCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param purchaseIdList The collection of purchaseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), xgetCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPurchaseId_IsNull() { regPurchaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPurchaseId_IsNotNull() { regPurchaseId(CK_ISNN, DOBJ); }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseId(), "PURCHASE_ID"); }
    protected abstract ConditionValue xgetCValuePurchaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subCBLambda The callback for sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMemberId_InScopeRelation_Member(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member", false);
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subCBLambda The callback for sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMemberId_NotInScopeRelation_Member(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member", true);
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ sq);

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Integer productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Integer productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Integer productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Integer productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Integer> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Integer> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Integer> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Integer> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from PRODUCT where ...)} <br />
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @param subCBLambda The callback for sub-query of Product for 'in-scope'. (NotNull)
     */
    public void inScopeProduct(SubQuery<ProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_Product(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "product", false);
    }
    public abstract String keepProductId_InScopeRelation_Product(ProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from PRODUCT where ...)} <br />
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @param subCBLambda The callback for sub-query of Product for 'not in-scope'. (NotNull)
     */
    public void notInScopeProduct(SubQuery<ProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_Product(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "product", true);
    }
    public abstract String keepProductId_NotInScopeRelation_Product(ProductCQ sq);

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_Equal(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_EQ,  purchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_GreaterThan(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_GT,  purchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_LessThan(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_LT,  purchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_GreaterEqual(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_GE,  purchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_LessEqual(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_LE, purchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPurchaseDatetime_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPurchaseDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePurchaseDatetime(), "PURCHASE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of purchaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of purchaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPurchaseDatetime_DateFromTo(Date fromDate, Date toDate) {
        setPurchaseDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regPurchaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseDatetime(), "PURCHASE_DATETIME"); }
    protected abstract ConditionValue xgetCValuePurchaseDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCount The value of purchaseCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_Equal(Integer purchaseCount) {
        doSetPurchaseCount_Equal(purchaseCount);
    }

    protected void doSetPurchaseCount_Equal(Integer purchaseCount) {
        regPurchaseCount(CK_EQ, purchaseCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCount The value of purchaseCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_NotEqual(Integer purchaseCount) {
        doSetPurchaseCount_NotEqual(purchaseCount);
    }

    protected void doSetPurchaseCount_NotEqual(Integer purchaseCount) {
        regPurchaseCount(CK_NES, purchaseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCount The value of purchaseCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_GreaterThan(Integer purchaseCount) {
        regPurchaseCount(CK_GT, purchaseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCount The value of purchaseCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_LessThan(Integer purchaseCount) {
        regPurchaseCount(CK_LT, purchaseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCount The value of purchaseCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_GreaterEqual(Integer purchaseCount) {
        regPurchaseCount(CK_GE, purchaseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCount The value of purchaseCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_LessEqual(Integer purchaseCount) {
        regPurchaseCount(CK_LE, purchaseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param minNumber The min number of purchaseCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchaseCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param minNumber The min number of purchaseCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchaseCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseCount(), "PURCHASE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCountList The collection of purchaseCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_InScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        regINS(CK_INS, cTL(purchaseCountList), xgetCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @param purchaseCountList The collection of purchaseCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_NotInScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        regINS(CK_NINS, cTL(purchaseCountList), xgetCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    protected void regPurchaseCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseCount(), "PURCHASE_COUNT"); }
    protected abstract ConditionValue xgetCValuePurchaseCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePrice The value of purchasePrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_Equal(Integer purchasePrice) {
        doSetPurchasePrice_Equal(purchasePrice);
    }

    protected void doSetPurchasePrice_Equal(Integer purchasePrice) {
        regPurchasePrice(CK_EQ, purchasePrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePrice The value of purchasePrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_NotEqual(Integer purchasePrice) {
        doSetPurchasePrice_NotEqual(purchasePrice);
    }

    protected void doSetPurchasePrice_NotEqual(Integer purchasePrice) {
        regPurchasePrice(CK_NES, purchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePrice The value of purchasePrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_GreaterThan(Integer purchasePrice) {
        regPurchasePrice(CK_GT, purchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePrice The value of purchasePrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_LessThan(Integer purchasePrice) {
        regPurchasePrice(CK_LT, purchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePrice The value of purchasePrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_GreaterEqual(Integer purchasePrice) {
        regPurchasePrice(CK_GE, purchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePrice The value of purchasePrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_LessEqual(Integer purchasePrice) {
        regPurchasePrice(CK_LE, purchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param minNumber The min number of purchasePrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchasePrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchasePrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param minNumber The min number of purchasePrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchasePrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchasePrice(), "PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePriceList The collection of purchasePrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_InScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        regINS(CK_INS, cTL(purchasePriceList), xgetCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @param purchasePriceList The collection of purchasePrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_NotInScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        regINS(CK_NINS, cTL(purchasePriceList), xgetCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    protected void regPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchasePrice(), "PURCHASE_PRICE"); }
    protected abstract ConditionValue xgetCValuePurchasePrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_Equal(paymentCompleteFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg} <br>
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetPaymentCompleteFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * はい: 有効を示す
     */
    public void setPaymentCompleteFlg_Equal_True() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * いいえ: 無効を示す
     */
    public void setPaymentCompleteFlg_Equal_False() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_EQ, paymentCompleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_NotEqual(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_NotEqual(paymentCompleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg} <br>
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetPaymentCompleteFlg_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * はい: 有効を示す
     */
    public void setPaymentCompleteFlg_NotEqual_True() {
        setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * いいえ: 無効を示す
     */
    public void setPaymentCompleteFlg_NotEqual_False() {
        setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetPaymentCompleteFlg_NotEqual(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_NES, paymentCompleteFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg} <br>
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_INS, cTL(paymentCompleteFlgList), xgetCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg} <br>
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_NINS, cTL(paymentCompleteFlgList), xgetCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    protected void regPaymentCompleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG"); }
    protected abstract ConditionValue xgetCValuePaymentCompleteFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueRegisterDatetime(), "REGISTER_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setRegisterDatetime_DateFromTo(Date fromDate, Date toDate) {
        setRegisterDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUserList The collection of registerUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    protected void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), xgetCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUserList The collection of registerUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    protected void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), xgetCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_NotLikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), xgetCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, xcLSOPPre());
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_NotEqual(String registerProcess) {
        doSetRegisterProcess_NotEqual(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_NotEqual(String registerProcess) {
        regRegisterProcess(CK_NES, registerProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_GreaterThan(String registerProcess) {
        regRegisterProcess(CK_GT, fRES(registerProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_LessThan(String registerProcess) {
        regRegisterProcess(CK_LT, fRES(registerProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_GreaterEqual(String registerProcess) {
        regRegisterProcess(CK_GE, fRES(registerProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_LessEqual(String registerProcess) {
        regRegisterProcess(CK_LE, fRES(registerProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcessList The collection of registerProcess as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_InScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_InScope(registerProcessList);
    }

    protected void doSetRegisterProcess_InScope(Collection<String> registerProcessList) {
        regINS(CK_INS, cTL(registerProcessList), xgetCValueRegisterProcess(), "REGISTER_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcessList The collection of registerProcess as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_NotInScope(registerProcessList);
    }

    protected void doSetRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        regINS(CK_NINS, cTL(registerProcessList), xgetCValueRegisterProcess(), "REGISTER_PROCESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterProcess_LikeSearch(String registerProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterProcess_LikeSearch(registerProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterProcess_LikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerProcess), xgetCValueRegisterProcess(), "REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterProcess_NotLikeSearch(String registerProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterProcess_NotLikeSearch(registerProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterProcess_NotLikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerProcess), xgetCValueRegisterProcess(), "REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_PrefixSearch(String registerProcess) {
        setRegisterProcess_LikeSearch(registerProcess, xcLSOPPre());
    }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterProcess(), "REGISTER_PROCESS"); }
    protected abstract ConditionValue xgetCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueUpdateDatetime(), "UPDATE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setUpdateDatetime_DateFromTo(Date fromDate, Date toDate) {
        setUpdateDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUserList The collection of updateUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    protected void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), xgetCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUserList The collection of updateUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    protected void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), xgetCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_NotLikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), xgetCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, xcLSOPPre());
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_NotEqual(String updateProcess) {
        doSetUpdateProcess_NotEqual(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_NotEqual(String updateProcess) {
        regUpdateProcess(CK_NES, updateProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_GreaterThan(String updateProcess) {
        regUpdateProcess(CK_GT, fRES(updateProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_LessThan(String updateProcess) {
        regUpdateProcess(CK_LT, fRES(updateProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_GreaterEqual(String updateProcess) {
        regUpdateProcess(CK_GE, fRES(updateProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_LessEqual(String updateProcess) {
        regUpdateProcess(CK_LE, fRES(updateProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcessList The collection of updateProcess as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_InScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_InScope(updateProcessList);
    }

    protected void doSetUpdateProcess_InScope(Collection<String> updateProcessList) {
        regINS(CK_INS, cTL(updateProcessList), xgetCValueUpdateProcess(), "UPDATE_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcessList The collection of updateProcess as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_NotInScope(updateProcessList);
    }

    protected void doSetUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        regINS(CK_NINS, cTL(updateProcessList), xgetCValueUpdateProcess(), "UPDATE_PROCESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateProcess_LikeSearch(String updateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateProcess_LikeSearch(updateProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)} <br>
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateProcess_LikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateProcess), xgetCValueUpdateProcess(), "UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateProcess_NotLikeSearch(String updateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateProcess_NotLikeSearch(updateProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateProcess_NotLikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateProcess), xgetCValueUpdateProcess(), "UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_PrefixSearch(String updateProcess) {
        setUpdateProcess_LikeSearch(updateProcess, xcLSOPPre());
    }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateProcess(), "UPDATE_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdateProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_NotEqual(Long versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Long versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNoList The collection of versionNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNoList The collection of versionNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

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
    public HpSLCFunction<PurchaseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PurchaseCB.class);
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
    public HpSLCFunction<PurchaseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PurchaseCB.class);
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
    public HpSLCFunction<PurchaseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PurchaseCB.class);
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
    public HpSLCFunction<PurchaseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PurchaseCB.class);
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
    public HpSLCFunction<PurchaseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PurchaseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PurchaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PurchaseCQ sq);

    protected PurchaseCB xcreateScalarConditionCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PurchaseCB xcreateScalarConditionPartitionByCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PurchaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PURCHASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PurchaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PurchaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PurchaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PURCHASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PurchaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PurchaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PurchaseCQ sq);

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
    protected PurchaseCB newMyCB() {
        return new PurchaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
