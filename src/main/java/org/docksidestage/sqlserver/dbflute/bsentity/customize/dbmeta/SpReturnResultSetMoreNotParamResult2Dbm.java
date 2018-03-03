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
 * The DB meta of SpReturnResultSetMoreNotParamResult2. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpReturnResultSetMoreNotParamResult2Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpReturnResultSetMoreNotParamResult2Dbm _instance = new SpReturnResultSetMoreNotParamResult2Dbm();
    private SpReturnResultSetMoreNotParamResult2Dbm() {}
    public static SpReturnResultSetMoreNotParamResult2Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SpReturnResultSetMoreNotParamResult2)et).getMemberStatusCode(), (et, vl) -> ((SpReturnResultSetMoreNotParamResult2)et).setMemberStatusCode((String)vl), "memberStatusCode");
        setupEpg(_epgMap, et -> ((SpReturnResultSetMoreNotParamResult2)et).getMemberStatusName(), (et, vl) -> ((SpReturnResultSetMoreNotParamResult2)et).setMemberStatusName((String)vl), "memberStatusName");
        setupEpg(_epgMap, et -> ((SpReturnResultSetMoreNotParamResult2)et).getDescription(), (et, vl) -> ((SpReturnResultSetMoreNotParamResult2)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((SpReturnResultSetMoreNotParamResult2)et).getDisplayOrder(), (et, vl) -> ((SpReturnResultSetMoreNotParamResult2)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpReturnResultSetMoreNotParamResult2";
    protected final String _tableDispName = "SpReturnResultSetMoreNotParamResult2";
    protected final String _tablePropertyName = "spReturnResultSetMoreNotParamResult2";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpReturnResultSetMoreNotParamResult2", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, false, "char", 3, 0, null, null, false, null, null, null, null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, String.class, "memberStatusName", null, false, false, false, "nvarchar", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, String.class, "description", null, false, false, false, "nvarchar", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

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
     * DESCRIPTION: {nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * DISPLAY_ORDER: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
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
    public String getEntityTypeName() { return "org.docksidestage.sqlserver.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult2"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpReturnResultSetMoreNotParamResult2> getEntityType() { return SpReturnResultSetMoreNotParamResult2.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SpReturnResultSetMoreNotParamResult2 newEntity() { return new SpReturnResultSetMoreNotParamResult2(); }
    public SpReturnResultSetMoreNotParamResult2 newMyEntity() { return new SpReturnResultSetMoreNotParamResult2(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SpReturnResultSetMoreNotParamResult2)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SpReturnResultSetMoreNotParamResult2)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
