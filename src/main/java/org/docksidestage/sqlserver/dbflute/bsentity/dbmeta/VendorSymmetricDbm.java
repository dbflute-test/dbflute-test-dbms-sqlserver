package org.docksidestage.sqlserver.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.sqlserver.dbflute.allcommon.*;
import org.docksidestage.sqlserver.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_SYMMETRIC. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorSymmetricDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorSymmetricDbm _instance = new VendorSymmetricDbm();
    private VendorSymmetricDbm() {}
    public static VendorSymmetricDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorSymmetric)et).getVendorSymmetricId(), (et, vl) -> ((VendorSymmetric)et).setVendorSymmetricId(ctl(vl)), "vendorSymmetricId");
        setupEpg(_epgMap, et -> ((VendorSymmetric)et).getPlainText(), (et, vl) -> ((VendorSymmetric)et).setPlainText((String)vl), "plainText");
        setupEpg(_epgMap, et -> ((VendorSymmetric)et).getEncryptedData(), (et, vl) -> ((VendorSymmetric)et).setEncryptedData((String)vl), "encryptedData");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_SYMMETRIC";
    protected final String _tableDispName = "VENDOR_SYMMETRIC";
    protected final String _tablePropertyName = "vendorSymmetric";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_SYMMETRIC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorSymmetricId = cci("VENDOR_SYMMETRIC_ID", "VENDOR_SYMMETRIC_ID", null, null, Long.class, "vendorSymmetricId", null, true, false, true, "numeric", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlainText = cci("PLAIN_TEXT", "PLAIN_TEXT", null, null, String.class, "plainText", null, false, false, false, "nvarchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEncryptedData = cci("ENCRYPTED_DATA", "ENCRYPTED_DATA", null, null, String.class, "encryptedData", null, false, false, false, "varbinary", 2147483647, 0, null, false, null, null, null, null, null, false);

    /**
     * VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorSymmetricId() { return _columnVendorSymmetricId; }
    /**
     * PLAIN_TEXT: {nvarchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlainText() { return _columnPlainText; }
    /**
     * ENCRYPTED_DATA: {varbinary(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEncryptedData() { return _columnEncryptedData; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorSymmetricId());
        ls.add(columnPlainText());
        ls.add(columnEncryptedData());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorSymmetricId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public String getEntityTypeName() { return "org.docksidestage.sqlserver.dbflute.exentity.VendorSymmetric"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlserver.dbflute.cbean.VendorSymmetricCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlserver.dbflute.exbhv.VendorSymmetricBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorSymmetric> getEntityType() { return VendorSymmetric.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorSymmetric newEntity() { return new VendorSymmetric(); }
    public VendorSymmetric newMyEntity() { return new VendorSymmetric(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorSymmetric)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorSymmetric)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
