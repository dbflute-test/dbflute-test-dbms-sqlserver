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
 * The abstract condition-query of SUMMARY_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSummaryWithdrawalCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSummaryWithdrawalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SUMMARY_WITHDRAWAL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {NotNull, int(10)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     * @param memberName The value of memberName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     * @param memberNameList The collection of memberName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    protected void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), xgetCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     * @param memberNameList The collection of memberName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    protected void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), xgetCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_LikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_NotLikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     */
    public void setMemberName_IsNull() { regMemberName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     */
    public void setMemberName_IsNullOrEmpty() { regMemberName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MEMBER_NAME: {nvarchar(200)}
     */
    public void setMemberName_IsNotNull() { regMemberName(CK_ISNN, DOBJ); }

    protected void regMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberName(), "MEMBER_NAME"); }
    protected abstract ConditionValue xgetCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_Equal(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_EQ, withdrawalReasonCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_NotEqual(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_NES, withdrawalReasonCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_InScope(withdrawalReasonCodeList);
    }

    protected void doSetWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_INS, cTL(withdrawalReasonCodeList), xgetCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_NotInScope(withdrawalReasonCodeList);
    }

    protected void doSetWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_NINS, cTL(withdrawalReasonCodeList), xgetCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)} <br>
     * <pre>e.g. setWithdrawalReasonCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param withdrawalReasonCode The value of withdrawalReasonCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_LikeSearch(String withdrawalReasonCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWithdrawalReasonCode_LikeSearch(withdrawalReasonCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)} <br>
     * <pre>e.g. setWithdrawalReasonCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonCode The value of withdrawalReasonCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_LikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonCode), xgetCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_NotLikeSearch(String withdrawalReasonCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWithdrawalReasonCode_NotLikeSearch(withdrawalReasonCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_NotLikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonCode), xgetCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_PrefixSearch(String withdrawalReasonCode) {
        setWithdrawalReasonCode_LikeSearch(withdrawalReasonCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     */
    public void setWithdrawalReasonCode_IsNull() { regWithdrawalReasonCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_CODE: {char(3)}
     */
    public void setWithdrawalReasonCode_IsNotNull() { regWithdrawalReasonCode(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE"); }
    protected abstract ConditionValue xgetCValueWithdrawalReasonCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_Equal(String withdrawalReasonText) {
        doSetWithdrawalReasonText_Equal(fRES(withdrawalReasonText));
    }

    protected void doSetWithdrawalReasonText_Equal(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_EQ, withdrawalReasonText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_NotEqual(String withdrawalReasonText) {
        doSetWithdrawalReasonText_NotEqual(fRES(withdrawalReasonText));
    }

    protected void doSetWithdrawalReasonText_NotEqual(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_NES, withdrawalReasonText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     * @param withdrawalReasonTextList The collection of withdrawalReasonText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_InScope(Collection<String> withdrawalReasonTextList) {
        doSetWithdrawalReasonText_InScope(withdrawalReasonTextList);
    }

    protected void doSetWithdrawalReasonText_InScope(Collection<String> withdrawalReasonTextList) {
        regINS(CK_INS, cTL(withdrawalReasonTextList), xgetCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     * @param withdrawalReasonTextList The collection of withdrawalReasonText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_NotInScope(Collection<String> withdrawalReasonTextList) {
        doSetWithdrawalReasonText_NotInScope(withdrawalReasonTextList);
    }

    protected void doSetWithdrawalReasonText_NotInScope(Collection<String> withdrawalReasonTextList) {
        regINS(CK_NINS, cTL(withdrawalReasonTextList), xgetCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)} <br>
     * <pre>e.g. setWithdrawalReasonText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param withdrawalReasonText The value of withdrawalReasonText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWithdrawalReasonText_LikeSearch(String withdrawalReasonText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWithdrawalReasonText_LikeSearch(withdrawalReasonText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)} <br>
     * <pre>e.g. setWithdrawalReasonText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonText The value of withdrawalReasonText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonText_LikeSearch(String withdrawalReasonText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonText), xgetCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWithdrawalReasonText_NotLikeSearch(String withdrawalReasonText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWithdrawalReasonText_NotLikeSearch(withdrawalReasonText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonText_NotLikeSearch(String withdrawalReasonText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonText), xgetCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonText_PrefixSearch(String withdrawalReasonText) {
        setWithdrawalReasonText_LikeSearch(withdrawalReasonText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonText_IsNull() { regWithdrawalReasonText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonText_IsNullOrEmpty() { regWithdrawalReasonText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonText_IsNotNull() { regWithdrawalReasonText(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT"); }
    protected abstract ConditionValue xgetCValueWithdrawalReasonText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_Equal(String withdrawalReasonInputText) {
        doSetWithdrawalReasonInputText_Equal(fRES(withdrawalReasonInputText));
    }

    protected void doSetWithdrawalReasonInputText_Equal(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_EQ, withdrawalReasonInputText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_NotEqual(String withdrawalReasonInputText) {
        doSetWithdrawalReasonInputText_NotEqual(fRES(withdrawalReasonInputText));
    }

    protected void doSetWithdrawalReasonInputText_NotEqual(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_NES, withdrawalReasonInputText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputTextList The collection of withdrawalReasonInputText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_InScope(Collection<String> withdrawalReasonInputTextList) {
        doSetWithdrawalReasonInputText_InScope(withdrawalReasonInputTextList);
    }

    protected void doSetWithdrawalReasonInputText_InScope(Collection<String> withdrawalReasonInputTextList) {
        regINS(CK_INS, cTL(withdrawalReasonInputTextList), xgetCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputTextList The collection of withdrawalReasonInputText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_NotInScope(Collection<String> withdrawalReasonInputTextList) {
        doSetWithdrawalReasonInputText_NotInScope(withdrawalReasonInputTextList);
    }

    protected void doSetWithdrawalReasonInputText_NotInScope(Collection<String> withdrawalReasonInputTextList) {
        regINS(CK_NINS, cTL(withdrawalReasonInputTextList), xgetCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)} <br>
     * <pre>e.g. setWithdrawalReasonInputText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_LikeSearch(String withdrawalReasonInputText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWithdrawalReasonInputText_LikeSearch(withdrawalReasonInputText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)} <br>
     * <pre>e.g. setWithdrawalReasonInputText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_LikeSearch(String withdrawalReasonInputText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonInputText), xgetCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_NotLikeSearch(String withdrawalReasonInputText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWithdrawalReasonInputText_NotLikeSearch(withdrawalReasonInputText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_NotLikeSearch(String withdrawalReasonInputText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonInputText), xgetCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_PrefixSearch(String withdrawalReasonInputText) {
        setWithdrawalReasonInputText_LikeSearch(withdrawalReasonInputText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNull() { regWithdrawalReasonInputText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNullOrEmpty() { regWithdrawalReasonInputText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNotNull() { regWithdrawalReasonInputText(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonInputText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT"); }
    protected abstract ConditionValue xgetCValueWithdrawalReasonInputText();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_Equal(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_EQ,  withdrawalDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_GreaterThan(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_GT,  withdrawalDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_LessThan(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_LT,  withdrawalDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_GreaterEqual(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_GE,  withdrawalDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_LessEqual(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_LE, withdrawalDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setWithdrawalDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of withdrawalDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of withdrawalDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setWithdrawalDatetime_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setWithdrawalDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setWithdrawalDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of withdrawalDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of withdrawalDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setWithdrawalDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of withdrawalDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of withdrawalDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setWithdrawalDatetime_DateFromTo(Date fromDate, Date toDate) {
        setWithdrawalDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetimeList The collection of withdrawalDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalDatetime_InScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        doSetWithdrawalDatetime_InScope(withdrawalDatetimeList);
    }

    protected void doSetWithdrawalDatetime_InScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        regINS(CK_INS, cTL(withdrawalDatetimeList), xgetCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetimeList The collection of withdrawalDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalDatetime_NotInScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        doSetWithdrawalDatetime_NotInScope(withdrawalDatetimeList);
    }

    protected void doSetWithdrawalDatetime_NotInScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        regINS(CK_NINS, cTL(withdrawalDatetimeList), xgetCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME");
    }

    protected void regWithdrawalDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME"); }
    protected abstract ConditionValue xgetCValueWithdrawalDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br>
     * 会員の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * 仮会員: 仮会員を示す
     */
    public void setMemberStatusCode_Equal_Provisional() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * Equal(=). As Formalized (FML). And OnlyOnceRegistered. <br>
     * 正式会員: 正式会員を示す
     */
    public void setMemberStatusCode_Equal_Formalized() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * 退会会員: 退会会員を示す
     */
    public void setMemberStatusCode_Equal_Withdrawal() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, memberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br>
     * 会員の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * 仮会員: 仮会員を示す
     */
    public void setMemberStatusCode_NotEqual_Provisional() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FML). And OnlyOnceRegistered. <br>
     * 正式会員: 正式会員を示す
     */
    public void setMemberStatusCode_NotEqual_Formalized() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * 退会会員: 退会会員を示す
     */
    public void setMemberStatusCode_NotEqual_Withdrawal() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, memberStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br>
     * 会員の状態を示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br>
     * 会員の状態を示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     */
    public void setMemberStatusCode_IsNull() { regMemberStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     */
    public void setMemberStatusCode_IsNotNull() { regMemberStatusCode(CK_ISNN, DOBJ); }

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueMemberStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @param memberStatusName The value of memberStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_Equal(String memberStatusName) {
        doSetMemberStatusName_Equal(fRES(memberStatusName));
    }

    protected void doSetMemberStatusName_Equal(String memberStatusName) {
        regMemberStatusName(CK_EQ, memberStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @param memberStatusName The value of memberStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_NotEqual(String memberStatusName) {
        doSetMemberStatusName_NotEqual(fRES(memberStatusName));
    }

    protected void doSetMemberStatusName_NotEqual(String memberStatusName) {
        regMemberStatusName(CK_NES, memberStatusName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @param memberStatusNameList The collection of memberStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_InScope(Collection<String> memberStatusNameList) {
        doSetMemberStatusName_InScope(memberStatusNameList);
    }

    protected void doSetMemberStatusName_InScope(Collection<String> memberStatusNameList) {
        regINS(CK_INS, cTL(memberStatusNameList), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @param memberStatusNameList The collection of memberStatusName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_NotInScope(Collection<String> memberStatusNameList) {
        doSetMemberStatusName_NotInScope(memberStatusNameList);
    }

    protected void doSetMemberStatusName_NotInScope(Collection<String> memberStatusNameList) {
        regINS(CK_NINS, cTL(memberStatusNameList), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)} <br>
     * <pre>e.g. setMemberStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberStatusName The value of memberStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberStatusName_LikeSearch(String memberStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberStatusName_LikeSearch(memberStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)} <br>
     * <pre>e.g. setMemberStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberStatusName The value of memberStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberStatusName_LikeSearch(String memberStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberStatusName), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @param memberStatusName The value of memberStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberStatusName_NotLikeSearch(String memberStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberStatusName_NotLikeSearch(memberStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @param memberStatusName The value of memberStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberStatusName_NotLikeSearch(String memberStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberStatusName), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @param memberStatusName The value of memberStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_PrefixSearch(String memberStatusName) {
        setMemberStatusName_LikeSearch(memberStatusName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     */
    public void setMemberStatusName_IsNull() { regMemberStatusName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     */
    public void setMemberStatusName_IsNullOrEmpty() { regMemberStatusName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     */
    public void setMemberStatusName_IsNotNull() { regMemberStatusName(CK_ISNN, DOBJ); }

    protected void regMemberStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueMemberStatusName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as equal. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_Equal(Integer maxPurchasePrice) {
        doSetMaxPurchasePrice_Equal(maxPurchasePrice);
    }

    protected void doSetMaxPurchasePrice_Equal(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_EQ, maxPurchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_GreaterThan(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_GT, maxPurchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_LessThan(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_LT, maxPurchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_GreaterEqual(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_GE, maxPurchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param maxPurchasePrice The value of maxPurchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxPurchasePrice_LessEqual(Integer maxPurchasePrice) {
        regMaxPurchasePrice(CK_LE, maxPurchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param minNumber The min number of maxPurchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of maxPurchasePrice. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMaxPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMaxPurchasePrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param minNumber The min number of maxPurchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of maxPurchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param maxPurchasePriceList The collection of maxPurchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxPurchasePrice_InScope(Collection<Integer> maxPurchasePriceList) {
        doSetMaxPurchasePrice_InScope(maxPurchasePriceList);
    }

    protected void doSetMaxPurchasePrice_InScope(Collection<Integer> maxPurchasePriceList) {
        regINS(CK_INS, cTL(maxPurchasePriceList), xgetCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     * @param maxPurchasePriceList The collection of maxPurchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxPurchasePrice_NotInScope(Collection<Integer> maxPurchasePriceList) {
        doSetMaxPurchasePrice_NotInScope(maxPurchasePriceList);
    }

    protected void doSetMaxPurchasePrice_NotInScope(Collection<Integer> maxPurchasePriceList) {
        regINS(CK_NINS, cTL(maxPurchasePriceList), xgetCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     */
    public void setMaxPurchasePrice_IsNull() { regMaxPurchasePrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_PURCHASE_PRICE: {int(10)}
     */
    public void setMaxPurchasePrice_IsNotNull() { regMaxPurchasePrice(CK_ISNN, DOBJ); }

    protected void regMaxPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxPurchasePrice(), "MAX_PURCHASE_PRICE"); }
    protected abstract ConditionValue xgetCValueMaxPurchasePrice();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;SummaryWithdrawalCB&gt;() {
     *     public void query(SummaryWithdrawalCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryWithdrawalCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, SummaryWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SummaryWithdrawalCB&gt;() {
     *     public void query(SummaryWithdrawalCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryWithdrawalCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, SummaryWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SummaryWithdrawalCB&gt;() {
     *     public void query(SummaryWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryWithdrawalCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, SummaryWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;SummaryWithdrawalCB&gt;() {
     *     public void query(SummaryWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryWithdrawalCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, SummaryWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SummaryWithdrawalCB&gt;() {
     *     public void query(SummaryWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryWithdrawalCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, SummaryWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SummaryWithdrawalCB&gt;() {
     *     public void query(SummaryWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryWithdrawalCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, SummaryWithdrawalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        SummaryWithdrawalCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(SummaryWithdrawalCQ sq);

    protected SummaryWithdrawalCB xcreateScalarConditionCB() {
        SummaryWithdrawalCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SummaryWithdrawalCB xcreateScalarConditionPartitionByCB() {
        SummaryWithdrawalCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
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
    protected SummaryWithdrawalCB newMyCB() {
        return new SummaryWithdrawalCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SummaryWithdrawalCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}