package org.docksidestage.sqlserver.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.sqlserver.dbflute.exentity.customize.*;

/**
 * The entity of PurchaseMaxPriceMember. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PURCHASE_MAX_PRICE, MEMBER_STATUS_NAME, rn
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * Integer purchaseMaxPrice = entity.getPurchaseMaxPrice();
 * String memberStatusName = entity.getMemberStatusName();
 * Long rn = entity.getRn();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setPurchaseMaxPrice(purchaseMaxPrice);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setRn(rn);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchaseMaxPriceMember extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {int(10)} */
    protected Integer _memberId;

    /** MEMBER_NAME: {nvarchar(200)} */
    protected String _memberName;

    /** PURCHASE_MAX_PRICE: {int(10)} */
    protected Integer _purchaseMaxPrice;

    /** MEMBER_STATUS_NAME: {nvarchar(50)} */
    protected String _memberStatusName;

    /** rn: {bigint(19)} */
    protected Long _rn;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.sqlserver.dbflute.bsentity.customize.dbmeta.PurchaseMaxPriceMemberDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "PurchaseMaxPriceMember";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPurchaseMaxPriceMember) {
            BsPurchaseMaxPriceMember other = (BsPurchaseMaxPriceMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_purchaseMaxPrice, other._purchaseMaxPrice)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
            if (!xSV(_rn, other._rn)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        hs = xCH(hs, _memberName);
        hs = xCH(hs, _purchaseMaxPrice);
        hs = xCH(hs, _memberStatusName);
        hs = xCH(hs, _rn);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_purchaseMaxPrice));
        sb.append(dm).append(xfND(_memberStatusName));
        sb.append(dm).append(xfND(_rn));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public PurchaseMaxPriceMember clone() {
        return (PurchaseMaxPriceMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {int(10)} <br>
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {int(10)} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {nvarchar(200)} <br>
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {nvarchar(200)} <br>
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] PURCHASE_MAX_PRICE: {int(10)} <br>
     * @return The value of the column 'PURCHASE_MAX_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPurchaseMaxPrice() {
        checkSpecifiedProperty("purchaseMaxPrice");
        return _purchaseMaxPrice;
    }

    /**
     * [set] PURCHASE_MAX_PRICE: {int(10)} <br>
     * @param purchaseMaxPrice The value of the column 'PURCHASE_MAX_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseMaxPrice(Integer purchaseMaxPrice) {
        registerModifiedProperty("purchaseMaxPrice");
        _purchaseMaxPrice = purchaseMaxPrice;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {nvarchar(50)} <br>
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {nvarchar(50)} <br>
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] rn: {bigint(19)} <br>
     * @return The value of the column 'rn'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRn() {
        checkSpecifiedProperty("rn");
        return _rn;
    }

    /**
     * [set] rn: {bigint(19)} <br>
     * @param rn The value of the column 'rn'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRn(Long rn) {
        registerModifiedProperty("rn");
        _rn = rn;
    }
}
