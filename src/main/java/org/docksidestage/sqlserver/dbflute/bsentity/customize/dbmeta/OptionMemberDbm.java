package org.docksidestage.sqlserver.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.sqlserver.dbflute.allcommon.*;
import org.docksidestage.sqlserver.dbflute.exentity.customize.*;

/**
 * The DB meta of OptionMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class OptionMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OptionMemberDbm _instance = new OptionMemberDbm();
    private OptionMemberDbm() {}
    public static OptionMemberDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberId(), (et, vl) -> ((OptionMember)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberName(), (et, vl) -> ((OptionMember)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((OptionMember)et).getBirthdate(), (et, vl) -> ((OptionMember)et).setBirthdate((java.util.Date)vl), "birthdate");
        setupEpg(_epgMap, et -> ((OptionMember)et).getFormalizedDatetime(), (et, vl) -> ((OptionMember)et).setFormalizedDatetime((java.sql.Timestamp)vl), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberStatusCode(), (et, vl) -> ((OptionMember)et).setMemberStatusCode((String)vl), "memberStatusCode");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberStatusName(), (et, vl) -> ((OptionMember)et).setMemberStatusName((String)vl), "memberStatusName");
        setupEpg(_epgMap, et -> ((OptionMember)et).getStatusDisplayOrder(), (et, vl) -> ((OptionMember)et).setStatusDisplayOrder(cti(vl)), "statusDisplayOrder");
        setupEpg(_epgMap, et -> ((OptionMember)et).getDummyFlg(), (et, vl) -> ((OptionMember)et).setDummyFlg(cti(vl)), "dummyFlg");
        setupEpg(_epgMap, et -> ((OptionMember)et).getDummyNoflg(), (et, vl) -> ((OptionMember)et).setDummyNoflg(cti(vl)), "dummyNoflg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "OptionMember";
    protected final String _tablePropertyName = "optionMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("OptionMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, false, "int", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, false, "nvarchar", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, java.util.Date.class, "birthdate", null, false, false, false, "date", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, java.sql.Timestamp.class, "formalizedDatetime", null, false, false, false, "datetime", 23, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, false, "char", 3, 0, null, false, null, null, null, null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, String.class, "memberStatusName", null, false, false, false, "nvarchar", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatusDisplayOrder = cci("STATUS_DISPLAY_ORDER", "STATUS_DISPLAY_ORDER", null, null, Integer.class, "statusDisplayOrder", null, false, false, false, "int", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDummyFlg = cci("DUMMY_FLG", "DUMMY_FLG", null, null, Integer.class, "dummyFlg", null, false, false, false, "int", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnDummyNoflg = cci("DUMMY_NOFLG", "DUMMY_NOFLG", null, null, Integer.class, "dummyNoflg", null, false, false, false, "int", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * MEMBER_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * BIRTHDATE: {date(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * FORMALIZED_DATETIME: {datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * MEMBER_STATUS_NAME: {nvarchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * STATUS_DISPLAY_ORDER: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatusDisplayOrder() { return _columnStatusDisplayOrder; }
    /**
     * DUMMY_FLG: {int(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyFlg() { return _columnDummyFlg; }
    /**
     * DUMMY_NOFLG: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyNoflg() { return _columnDummyNoflg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnStatusDisplayOrder());
        ls.add(columnDummyFlg());
        ls.add(columnDummyNoflg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlserver.dbflute.exentity.customize.OptionMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<OptionMember> getEntityType() { return OptionMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public OptionMember newEntity() { return new OptionMember(); }
    public OptionMember newMyEntity() { return new OptionMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((OptionMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((OptionMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
