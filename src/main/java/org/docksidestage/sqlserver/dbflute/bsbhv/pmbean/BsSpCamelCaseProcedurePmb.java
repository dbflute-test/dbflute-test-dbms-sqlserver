package org.docksidestage.sqlserver.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.sqlserver.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpCamelCaseProcedure. <br>
 * This is related to "<span style="color: #AD4747">SpCamelCaseProcedure</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpCamelCaseProcedurePmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String returnValue_PROCEDURE_PARAMETER = "return, -1";
    public static final String fooParam_PROCEDURE_PARAMETER = "in, 0";
    public static final String barParam_PROCEDURE_PARAMETER = "in, 1";
    public static final String VDonParam_PROCEDURE_PARAMETER = "inout, 2";
    public static final String VHeeParam_PROCEDURE_PARAMETER = "in, 3";
    public static final String pooParamName_PROCEDURE_PARAMETER = "inout, 4";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of returnValue: {int(10) as Return}. */
    protected Integer _returnValue;

    /** The parameter of fooParam: {varchar(10) as In}. */
    protected String _fooParam;

    /** The parameter of barParam: {varchar(10) as In}. */
    protected String _barParam;

    /** The parameter of VDonParam: {varchar(10) as InOut}. */
    protected String _vDonParam;

    /** The parameter of VHeeParam: {varchar(10) as In}. */
    protected String _vHeeParam;

    /** The parameter of pooParamName: {varchar(10) as InOut}. */
    protected String _pooParamName;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpCamelCaseProcedure. <br>
     * This is related to "<span style="color: #AD4747">SpCamelCaseProcedure</span>".
     */
    public BsSpCamelCaseProcedurePmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "SpCamelCaseProcedure"; }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() { return true; } // as default

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() { return false; } // resolved by generator

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }
    
    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_returnValue);
        sb.append(dm).append(_fooParam);
        sb.append(dm).append(_barParam);
        sb.append(dm).append(_vDonParam);
        sb.append(dm).append(_vHeeParam);
        sb.append(dm).append(_pooParamName);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] returnValue: {int(10) as Return} <br>
     * @return The value of returnValue. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getReturnValue() {
        return _returnValue;
    }

    /**
     * [set] returnValue: {int(10) as Return} <br>
     * @param returnValue The value of returnValue. (NullAllowed)
     */
    public void setReturnValue(Integer returnValue) {
        _returnValue = returnValue;
    }

    /**
     * [get] fooParam: {varchar(10) as In} <br>
     * @return The value of fooParam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getFooParam() {
        return filterStringParameter(_fooParam);
    }

    /**
     * [set] fooParam: {varchar(10) as In} <br>
     * @param fooParam The value of fooParam. (NullAllowed)
     */
    public void setFooParam(String fooParam) {
        _fooParam = fooParam;
    }

    /**
     * [get] barParam: {varchar(10) as In} <br>
     * @return The value of barParam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBarParam() {
        return filterStringParameter(_barParam);
    }

    /**
     * [set] barParam: {varchar(10) as In} <br>
     * @param barParam The value of barParam. (NullAllowed)
     */
    public void setBarParam(String barParam) {
        _barParam = barParam;
    }

    /**
     * [get] VDonParam: {varchar(10) as InOut} <br>
     * @return The value of VDonParam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVDonParam() {
        return filterStringParameter(_vDonParam);
    }

    /**
     * [set] VDonParam: {varchar(10) as InOut} <br>
     * @param vDonParam The value of VDonParam. (NullAllowed)
     */
    public void setVDonParam(String vDonParam) {
        _vDonParam = vDonParam;
    }

    /**
     * [get] VHeeParam: {varchar(10) as In} <br>
     * @return The value of VHeeParam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVHeeParam() {
        return filterStringParameter(_vHeeParam);
    }

    /**
     * [set] VHeeParam: {varchar(10) as In} <br>
     * @param vHeeParam The value of VHeeParam. (NullAllowed)
     */
    public void setVHeeParam(String vHeeParam) {
        _vHeeParam = vHeeParam;
    }

    /**
     * [get] pooParamName: {varchar(10) as InOut} <br>
     * @return The value of pooParamName. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPooParamName() {
        return filterStringParameter(_pooParamName);
    }

    /**
     * [set] pooParamName: {varchar(10) as InOut} <br>
     * @param pooParamName The value of pooParamName. (NullAllowed)
     */
    public void setPooParamName(String pooParamName) {
        _pooParamName = pooParamName;
    }
}
