package org.docksidestage.sqlserver.dbflute.nogen;

import org.dbflute.cbean.cipher.CipherFunctionFilter;
import org.dbflute.cbean.cipher.GearedCipherManager;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.docksidestage.sqlserver.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.sqlserver.dbflute.allcommon.DBFluteInitializer;
import org.docksidestage.sqlserver.dbflute.bsentity.dbmeta.VendorSymmetricDbm;
import org.docksidestage.sqlserver.mytype.valuetype.MyTypeOfBytesString;

/**
 * @author jflute
 */
public class ExtendedDBFluteInitializer extends DBFluteInitializer {

    public ExtendedDBFluteInitializer() {
    }

    @Override
    protected void prologue() { // the example for fixed DBFluteConfig settings
        super.prologue(); // you need to call this

        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();

        final GearedCipherManager manager = new GearedCipherManager();
        final ColumnInfo encryptedData = VendorSymmetricDbm.getInstance().columnEncryptedData();
        manager.addFunctionFilter(encryptedData, new CipherFunctionFilter() {
            public String encrypt(String valueExp) {
                String exp = "EncryptByKey(Key_GUID('SYMMETRIC_CHECK_KEY'), %1$s)";
                return String.format(exp, valueExp);
            }

            public String decrypt(String valueExp) {
                String exp = "convert(nvarchar(max), DecryptByKey(%1$s))";
                return String.format(exp, valueExp);
            }
        });
        config.setGearedCipherManager(manager);

        config.registerPluginValueType("bytesString", new MyTypeOfBytesString());

        config.lock();
    }
}
