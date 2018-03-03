package org.docksidestage.sqlserver.unit;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.utflute.seasar.ContainerTestCase;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.sqlserver.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.sqlserver.dbflute.exbhv.PurchaseBhv;

/**
 * The test base of the application.
 * @author jflute
 * @since 0.5.6 (2007/10/22 Monday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    private BehaviorSelector _behaviorSelector;

    @Override
    protected boolean isUseTestCaseLooseBinding() {
        return true;
    }

    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        deleteAll(MemberAddressBhv.class);
        // TODO jflute test: SQLServer, MemberFollowing
        //deleteAll(MemberFollowingBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        // TODO jflute test: SQLServer, PurchasePayment
        //deleteAll(PurchasePaymentBhv.class);
        deleteAll(PurchaseBhv.class);
    }
}
