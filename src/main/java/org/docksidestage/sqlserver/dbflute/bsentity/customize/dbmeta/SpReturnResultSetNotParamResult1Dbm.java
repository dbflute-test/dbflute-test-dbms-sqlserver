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
 * The DB meta of SpReturnResultSetNotParamResult1. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpReturnResultSetNotParamResult1Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpReturnResultSetNotParamResult1Dbm _instance = new SpReturnResultSetNotParamResult1Dbm();
    private SpReturnResultSetNotParamResult1Dbm() {}
    public static SpReturnResultSetNotParamResult1Dbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
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
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getMemberId(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getMemberName(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getMemberAccount(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setMemberAccount((String)vl), "memberAccount");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getMemberStatusCode(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setMemberStatusCode((String)vl), "memberStatusCode");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getFormalizedDatetime(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setFormalizedDatetime(cttp(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getBirthdate(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setBirthdate(ctdt(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getRegisterDatetime(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setRegisterDatetime(cttp(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getRegisterUser(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getRegisterProcess(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getUpdateDatetime(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setUpdateDatetime(cttp(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getUpdateUser(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getUpdateProcess(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((SpReturnResultSetNotParamResult1)et).getVersionNo(), (et, vl) -> ((SpReturnResultSetNotParamResult1)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpReturnResultSetNotParamResult1";
    protected final String _tableDispName = "SpReturnResultSetNotParamResult1";
    protected final String _tablePropertyName = "spReturnResultSetNotParamResult1";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpReturnResultSetNotParamResult1", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, false, "nvarchar", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, null, String.class, "memberAccount", null, false, false, false, "nvarchar", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, false, "char", 3, 0, null, null, false, null, null, null, null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, java.sql.Timestamp.class, "formalizedDatetime", null, false, false, false, "datetime", 23, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, java.util.Date.class, "birthdate", null, false, false, false, "date", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, false, "datetime", 23, 3, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, false, "nvarchar", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, false, "nvarchar", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, false, "datetime", 23, 3, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, false, "nvarchar", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, false, "nvarchar", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

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
     * MEMBER_ACCOUNT: {nvarchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    /**
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * FORMALIZED_DATETIME: {datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * BIRTHDATE: {date(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * REGISTER_DATETIME: {datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * REGISTER_PROCESS: {nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * UPDATE_DATETIME: {datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * UPDATE_PROCESS: {nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
        ls.add(columnVersionNo());
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlserver.dbflute.exentity.customize.SpReturnResultSetNotParamResult1"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpReturnResultSetNotParamResult1> getEntityType() { return SpReturnResultSetNotParamResult1.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SpReturnResultSetNotParamResult1 newEntity() { return new SpReturnResultSetNotParamResult1(); }
    public SpReturnResultSetNotParamResult1 newMyEntity() { return new SpReturnResultSetNotParamResult1(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SpReturnResultSetNotParamResult1)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SpReturnResultSetNotParamResult1)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
