package org.docksidestage.sqlserver.dbflute.vendor;

import java.lang.reflect.Method;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.dbflute.bhv.core.BehaviorCommandMeta;
import org.dbflute.bhv.proposal.callback.SimpleTraceableSqlStringFilter;
import org.dbflute.bhv.proposal.callback.TraceableSqlAdditionalInfoProvider;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.docksidestage.sqlserver.dbflute.allcommon.CDef;
import org.docksidestage.sqlserver.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.sqlserver.dbflute.cbean.MemberCB;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlserver.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import org.docksidestage.sqlserver.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import org.docksidestage.sqlserver.dbflute.exentity.Member;
import org.docksidestage.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4D (2013/06/16 Sunday)
 */
public class VendorJDBCTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       Query Timeout
    //                                                                       =============
    public void test_QueryTimeout_insert() throws Exception {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                final long threadId = Thread.currentThread().getId();
                if (threadId % 2 == 0) {
                    Member member = new Member();
                    member.setMemberName("lock");
                    member.setMemberAccount("same");
                    member.setMemberStatusCode_Formalized();
                    memberBhv.insert(member);
                    sleep(5000); // more 2 seconds because of Oracle in VM
                } else {
                    Member member = new Member();
                    member.setMemberName("wait");
                    member.setMemberAccount("same"); // same value to wait for lock
                    member.setMemberStatusCode_Formalized();
                    sleep(1000);
                    memberBhv.varyingInsert(member, op -> op.configure(conf -> conf.queryTimeout(1)));
                }
            }
        }, new CannonballOption().threadCount(2).repeatCount(1).expectExceptionAny("\u30bf\u30a4\u30e0\u30a2\u30a6\u30c8")); // timeout in KATAKANA
    }

    // ===================================================================================
    //                                                                  First Line Comment 
    //                                                                  ==================
    public void test_FirstLineComment_all_front() throws Exception {
        doTest_FirstLineComment_all(true);
    }

    public void test_FirstLineComment_all_rear() throws Exception {
        doTest_FirstLineComment_all(false);
    }

    protected void doTest_FirstLineComment_all(boolean front) throws Exception {
        // ## Arrange ##
        final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                infoList.add(info);
            }
        });
        Method actionMethod = MemberDbm.getInstance().columnBirthdate().getWriteMethod();
        SimpleTraceableSqlStringFilter filter = new SimpleTraceableSqlStringFilter(actionMethod, new TraceableSqlAdditionalInfoProvider() {
            public String provide() {
                return "marks:{?*@;+()[]'&%$#\"!\\>=<_^~-|.,}1234567890";
            }
        }) {

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }
        };
        if (front) {
            filter.markingAtFront();
        }
        CallbackContext.setSqlStringFilterOnThread(filter);

        try {
            // ## Act ##
            {
                MemberCB cb = new MemberCB();
                memberBhv.selectList(cb);
            }
            {
                Member member = new Member();
                member.setMemberId(3);
                member.setBirthdate(currentTimestamp());
                memberBhv.updateNonstrict(member);
            }
            {
                MemberCB cb = new MemberCB();
                cb.query().setMemberStatusCode_Equal_Provisional();
                Member member = new Member();
                memberBhv.queryUpdate(member, cb);
            }
            {
                PurchaseMaxPriceMemberPmb pmb = new PurchaseMaxPriceMemberPmb();
                pmb.paging(3, 2);
                memberBhv.outsideSql().manualPaging().selectPage(pmb);
            }
            {
                SpInOutParameterPmb spPmb = new SpInOutParameterPmb();
                spPmb.setVInVarchar("foo");
                spPmb.setVInoutVarchar("bar");
                try {
                    memberBhv.outsideSql().call(spPmb);
                    if (front) {
                        fail();
                    }
                } catch (SQLFailureException e) {
                    if (!front) {
                        throw e;
                    }
                    log(e.getMessage());
                }
            }
            // ## Assert ##
        } finally {
            CallbackContext.clearSqlStringFilterOnThread();
        }
    }

    // ===================================================================================
    //                                                                  Plain ENUM Binding
    //                                                                  ==================
    public void test_plain_enum_binding() throws SQLException {
        // ## Arrange ##
        List<Integer> prepared = executeEnumBindSql(CDef.MemberStatus.Formalized.code());
        assertFalse(prepared.isEmpty());
        log(prepared);

        // ## Act ##
        try {
            executeEnumBindSql(TestPlainStatus.FML);

            // ## Assert ##
            fail();
        } catch (SQLException e) {
            // OK
            log(e.getMessage());
        }
    }

    private List<Integer> executeEnumBindSql(Object value) throws SQLException {
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = ds.getConnection();
            String sql = "select * from MEMBER where MEMBER_STATUS_CODE = ?";
            log(sql);
            ps = conn.prepareStatement(sql);
            ps.setObject(1, value);
            rs = ps.executeQuery();
            List<Integer> idList = new ArrayList<Integer>();
            while (rs.next()) {
                idList.add(rs.getInt("MEMBER_ID"));
            }
            return idList;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private static enum TestPlainStatus {
        FML, PRV, WDL
    }

    // ===================================================================================
    //                                                                   CallableStatement
    //                                                                   =================
    public void test_CallableStatement_ResultSet_parameter() throws SQLException {
        doTest_CallableResultSet("{call SP_RESULT_SET_PARAMETER(?)}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.setNull(1, Types.OTHER);
                cs.registerOutParameter(1, Types.OTHER);
                try {
                    boolean executed = cs.execute();

                    fail("executed = " + executed);
                } catch (SQLException e) {
                    // may be unsupported
                    // refer to ProcedureTest for details
                    log(e.getMessage());
                }
                return null; //cs.getObject(1);
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertNull(rs);
            }
        });
    }

    public void test_CallableStatement_ResultSet_returnValue() throws SQLException {
        doTest_CallableResultSet("{call SP_RETURN_RESULT_SET()}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertTrue(executed);
                return cs.getResultSet();
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertFalse(cs.getMoreResults());
                assertNull(cs.getResultSet());
            }
        });
    }

    public void test_CallableStatement_ResultSet_returnValue_more() throws SQLException {
        doTest_CallableResultSet("{? = call SP_RETURN_RESULT_SET_MORE('FML')}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.registerOutParameter(1, Types.INTEGER);
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertTrue(executed);
                assertNotNull(cs.getResultSet());
                assertTrue(cs.getMoreResults());
                return cs.getResultSet();
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertFalse(cs.getMoreResults());
                assertNull(cs.getResultSet());
                String returnValue = cs.getString(1);
                log("returnValue = " + returnValue);
                assertEquals("0", returnValue);
            }
        });
    }

    public void test_CallableStatement_ResultSet_tableFunction_with() throws SQLException {
        doTest_CallableResultSet("select * from FN_RETURN_TABLE(?)", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.setString(1, "FML");
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertTrue(executed);
                return cs.getResultSet();
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertFalse(cs.getMoreResults());
                assertNull(cs.getResultSet());
            }
        });
    }

    private void doTest_CallableResultSet(String sql, CallableResultSetCallback callback) throws SQLException {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall(sql);
            rs = callback.call(cs);
            if (rs != null) { // null means the procedure cannot be called
                assertNotNull(rs);
                boolean exists = false;
                StringBuilder sb = new StringBuilder();
                while (rs.next()) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(rs.getString(1));
                    exists = true;
                }
                log("first columns = " + sb);
                assertTrue(exists);
            }
            callback.post(cs, rs);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private static interface CallableResultSetCallback {
        ResultSet call(CallableStatement cs) throws SQLException;

        void post(CallableStatement cs, ResultSet rs) throws SQLException;
    }

    // ===================================================================================
    //                                                                           ResultSet
    //                                                                           =========
    public void test_ResultSet_defaultResultSetType() throws SQLException {
        String sql = "select * from VENDOR_CHECK";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int resultSetType = rs.getType();
            log("/* * * * * * * * * * * * * * * * * *");
            if (resultSetType == ResultSet.TYPE_FORWARD_ONLY) {
                log("resultSetType=TYPE_FORWARD_ONLY");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_INSENSITIVE) {
                log("resultSetType=TYPE_SCROLL_INSENSITIVE");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_SENSITIVE) {
                log("resultSetType=TYPE_SCROLL_SENSITIVE");
            } else {
                log("resultSetType=UNKNOWN:" + resultSetType);
            }
            log("* * * * * * * * * */");
            assertEquals(ResultSet.TYPE_FORWARD_ONLY, resultSetType);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
