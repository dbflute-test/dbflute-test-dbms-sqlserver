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
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckDbm _instance = new VendorCheckDbm();
    private VendorCheckDbm() {}
    public static VendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorCheck)et).getVendorCheckId(), (et, vl) -> ((VendorCheck)et).setVendorCheckId(ctl(vl)), "vendorCheckId");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfVarchar(), (et, vl) -> ((VendorCheck)et).setTypeOfVarchar((String)vl), "typeOfVarchar");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNvarchar(), (et, vl) -> ((VendorCheck)et).setTypeOfNvarchar((String)vl), "typeOfNvarchar");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfText(), (et, vl) -> ((VendorCheck)et).setTypeOfText((String)vl), "typeOfText");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumericDecimal(), (et, vl) -> ((VendorCheck)et).setTypeOfNumericDecimal(ctb(vl)), "typeOfNumericDecimal");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumericInteger(), (et, vl) -> ((VendorCheck)et).setTypeOfNumericInteger(cti(vl)), "typeOfNumericInteger");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumericBigint(), (et, vl) -> ((VendorCheck)et).setTypeOfNumericBigint(ctl(vl)), "typeOfNumericBigint");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfSmallinteger(), (et, vl) -> ((VendorCheck)et).setTypeOfSmallinteger(cti(vl)), "typeOfSmallinteger");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInteger(), (et, vl) -> ((VendorCheck)et).setTypeOfInteger(cti(vl)), "typeOfInteger");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBigint(), (et, vl) -> ((VendorCheck)et).setTypeOfBigint(ctl(vl)), "typeOfBigint");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfMoney(), (et, vl) -> ((VendorCheck)et).setTypeOfMoney(ctb(vl)), "typeOfMoney");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfSmallmoney(), (et, vl) -> ((VendorCheck)et).setTypeOfSmallmoney(ctb(vl)), "typeOfSmallmoney");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfDatetime(), (et, vl) -> ((VendorCheck)et).setTypeOfDatetime((java.sql.Timestamp)vl), "typeOfDatetime");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfSmalldatetime(), (et, vl) -> ((VendorCheck)et).setTypeOfSmalldatetime((java.sql.Timestamp)vl), "typeOfSmalldatetime");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBit(), (et, vl) -> ((VendorCheck)et).setTypeOfBit((Boolean)vl), "typeOfBit");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBinary(), (et, vl) -> ((VendorCheck)et).setTypeOfBinary((byte[])vl), "typeOfBinary");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfVarbinary(), (et, vl) -> ((VendorCheck)et).setTypeOfVarbinary((byte[])vl), "typeOfVarbinary");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfUniqueidentifier(), (et, vl) -> ((VendorCheck)et).setTypeOfUniqueidentifier((java.util.UUID)vl), "typeOfUniqueidentifier");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfXml(), (et, vl) -> ((VendorCheck)et).setTypeOfXml((String)vl), "typeOfXml");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CHECK";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, Long.class, "vendorCheckId", null, true, false, true, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, String.class, "typeOfVarchar", null, false, false, false, "varchar", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNvarchar = cci("TYPE_OF_NVARCHAR", "TYPE_OF_NVARCHAR", null, null, String.class, "typeOfNvarchar", null, false, false, false, "nvarchar", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, String.class, "typeOfText", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumericDecimal", null, false, false, false, "numeric", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "numeric", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, Long.class, "typeOfNumericBigint", null, false, false, false, "numeric", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallinteger = cci("TYPE_OF_SMALLINTEGER", "TYPE_OF_SMALLINTEGER", null, null, Integer.class, "typeOfSmallinteger", null, false, false, false, "smallint", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, Integer.class, "typeOfInteger", null, false, false, false, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, Long.class, "typeOfBigint", null, false, false, false, "bigint", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMoney = cci("TYPE_OF_MONEY", "TYPE_OF_MONEY", null, null, java.math.BigDecimal.class, "typeOfMoney", null, false, false, false, "money", 19, 4, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallmoney = cci("TYPE_OF_SMALLMONEY", "TYPE_OF_SMALLMONEY", null, null, java.math.BigDecimal.class, "typeOfSmallmoney", null, false, false, false, "smallmoney", 10, 4, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDatetime = cci("TYPE_OF_DATETIME", "TYPE_OF_DATETIME", null, null, java.sql.Timestamp.class, "typeOfDatetime", null, false, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmalldatetime = cci("TYPE_OF_SMALLDATETIME", "TYPE_OF_SMALLDATETIME", null, null, java.sql.Timestamp.class, "typeOfSmalldatetime", null, false, false, false, "smalldatetime", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBit = cci("TYPE_OF_BIT", "TYPE_OF_BIT", null, null, Boolean.class, "typeOfBit", null, false, false, false, "bit", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinary = cci("TYPE_OF_BINARY", "TYPE_OF_BINARY", null, null, byte[].class, "typeOfBinary", null, false, false, false, "binary", 3000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarbinary = cci("TYPE_OF_VARBINARY", "TYPE_OF_VARBINARY", null, null, byte[].class, "typeOfVarbinary", null, false, false, false, "varbinary", 3000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfUniqueidentifier = cci("TYPE_OF_UNIQUEIDENTIFIER", "TYPE_OF_UNIQUEIDENTIFIER", null, null, java.util.UUID.class, "typeOfUniqueidentifier", null, false, false, false, "uniqueidentifier", 36, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfXml = cci("TYPE_OF_XML", "TYPE_OF_XML", null, null, String.class, "typeOfXml", null, false, false, false, "xml", 2147483647, 0, null, false, null, null, null, null, null);

    /**
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNvarchar() { return _columnTypeOfNvarchar; }
    /**
     * TYPE_OF_TEXT: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    /**
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    /**
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    /**
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSmallinteger() { return _columnTypeOfSmallinteger; }
    /**
     * TYPE_OF_INTEGER: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_BIGINT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * TYPE_OF_MONEY: {money(19, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfMoney() { return _columnTypeOfMoney; }
    /**
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSmallmoney() { return _columnTypeOfSmallmoney; }
    /**
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDatetime() { return _columnTypeOfDatetime; }
    /**
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSmalldatetime() { return _columnTypeOfSmalldatetime; }
    /**
     * TYPE_OF_BIT: {bit(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    /**
     * TYPE_OF_BINARY: {binary(3000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinary() { return _columnTypeOfBinary; }
    /**
     * TYPE_OF_VARBINARY: {varbinary(3000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarbinary() { return _columnTypeOfVarbinary; }
    /**
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfUniqueidentifier() { return _columnTypeOfUniqueidentifier; }
    /**
     * TYPE_OF_XML: {xml(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfXml() { return _columnTypeOfXml; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfNvarchar());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfSmallinteger());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfMoney());
        ls.add(columnTypeOfSmallmoney());
        ls.add(columnTypeOfDatetime());
        ls.add(columnTypeOfSmalldatetime());
        ls.add(columnTypeOfBit());
        ls.add(columnTypeOfBinary());
        ls.add(columnTypeOfVarbinary());
        ls.add(columnTypeOfUniqueidentifier());
        ls.add(columnTypeOfXml());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorCheckId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.sqlserver.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlserver.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlserver.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheck> getEntityType() { return VendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorCheck newEntity() { return new VendorCheck(); }
    public VendorCheck newMyEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
