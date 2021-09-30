package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.function.Supplier;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.transaction.stats.TransactionCounters;
import org.neo4j.storageengine.api.TransactionIdStore;


@Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED)
public class GlobalTransactionStatsAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_FIN_CLS_TXS_UID_TPX)
  private static final String FIN_CLS_TXS_UID_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.LAST_CLOSED_TX_ID);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_FIN_CMTX_TXS_UID_TPX)
  private static final String FIN_CMTX_TXS_UID_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.LAST_COMMITTED_TX_ID);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_RDX_TXS_ACI_TPX)
  private static final String RDX_TXS_ACI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.ACTIVE_READ);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_RDX_TXS_CMTX_TPX)
  private static final String RDX_TXS_CMTX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.COMMITTED_READ);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_RDX_TXS_ROLC_TPX)
  private static final String RDX_TXS_ROLC_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.ROLLBACKS_READ);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_RDX_TXS_TRMX_TPX)
  private static final String RDX_TXS_TRMX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.TERMINATED_READ);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_ACI_TPX)
  private static final String TXS_ACI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.ACTIVE);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_BEG_TPX)
  private static final String TXS_BEG_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.STARTED);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_CMTX_TPX)
  private static final String TXS_CMTX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.COMMITTED);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_PEA_COCRT_TPX)
  private static final String TXS_PEA_COCRT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.PEAK_CONCURRENT);


  private static final String TXS_PRE = io.github.onograph.TokenConstants.TRANSACTION;


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_ROLC_TPX)
  private static final String TXS_ROLC_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.ROLLBACKS);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_SIZ_HEA_TPX)
  private static final String TXS_SIZ_HEA_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.TX_SIZE_HEAP);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_SIZ_NAI_TPX)
  private static final String TXS_SIZ_NAI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.TX_SIZE_NATIVE);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_TXS_TRMX_TPX)
  private static final String TXS_TRMX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.TERMINATED);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_WX_TXS_ACI_TPX)
  private static final String WX_TXS_ACI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.ACTIVE_WRITE);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_WX_TXS_CMTX_TPX)
  private static final String WX_TXS_CMTX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.COMMITTED_WRITE);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_WX_TXS_ROLC_TPX)
  private static final String WX_TXS_ROLC_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.ROLLBACKS_WRITE);


  @Documented(io.github.onograph.TokenConstants.GLOBAL_TRANSACTION_STATS_ADAPTER___DOCUMENTED_WX_TXS_TRMX_TPX)
  private static final String WX_TXS_TRMX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.TRANSACTION,
          io.github.onograph.TokenConstants.TERMINATED_WRITE);


  private final MetricRegistryManager metricRegistryManager;


  private final TransactionSizeMonitorImpl mstTransactionSizeMonitorImpl;


  private final String strAt;


  private final String strAtr;


  private final String strCpt;


  private final String strCt;


  private final String strCtr;


  private final String strCtw;


  private final String strItcl;


  private final String strItcl2;


  private final String strNst;


  private final String strRt;


  private final String strRtr;


  private final String strSt;


  private final String strTsh;


  private final String strTt;


  private final String strTtr;


  private final String strTtw;


  private final String strWta;


  private final String strWtr;


  private final Supplier<TransactionIdStore> supplierSsitTransactionIdStore;


  private final TransactionCounters transactionCounters;

  public GlobalTransactionStatsAdapter() {
    this("", null, null, null);
  }

  public GlobalTransactionStatsAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      Supplier<TransactionIdStore> _supplierSsitTransactionIdStore,
      TransactionCounters _transactionCounters) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.mstTransactionSizeMonitorImpl = new TransactionSizeMonitorImpl();
    this.strSt = MetricRegistry.name(mprnm, TXS_BEG_TPX);
    this.strCpt = MetricRegistry.name(mprnm, TXS_PEA_COCRT_TPX);
    this.strAt = MetricRegistry.name(mprnm, TXS_ACI_TPX);
    this.strAtr = MetricRegistry.name(mprnm, RDX_TXS_ACI_TPX);
    this.strWta = MetricRegistry.name(mprnm, WX_TXS_ACI_TPX);
    this.strCt = MetricRegistry.name(mprnm, TXS_CMTX_TPX);
    this.strCtr = MetricRegistry.name(mprnm, RDX_TXS_CMTX_TPX);
    this.strCtw = MetricRegistry.name(mprnm, WX_TXS_CMTX_TPX);
    this.strRt = MetricRegistry.name(mprnm, TXS_ROLC_TPX);
    this.strRtr = MetricRegistry.name(mprnm, RDX_TXS_ROLC_TPX);
    this.strWtr = MetricRegistry.name(mprnm, WX_TXS_ROLC_TPX);
    this.strTt = MetricRegistry.name(mprnm, TXS_TRMX_TPX);
    this.strTtr = MetricRegistry.name(mprnm, RDX_TXS_TRMX_TPX);
    this.strTtw = MetricRegistry.name(mprnm, WX_TXS_TRMX_TPX);
    this.strItcl = MetricRegistry.name(mprnm, FIN_CMTX_TXS_UID_TPX);
    this.strItcl2 = MetricRegistry.name(mprnm, FIN_CLS_TXS_UID_TPX);
    this.strTsh = MetricRegistry.name(mprnm, TXS_SIZ_HEA_TPX);
    this.strNst = MetricRegistry.name(mprnm, TXS_SIZ_NAI_TPX);
    this.metricRegistryManager = _metricRegistryManager;
    this.supplierSsitTransactionIdStore = _supplierSsitTransactionIdStore;
    this.transactionCounters = _transactionCounters;
  }

  @Override
  public void start() {
    this.transactionCounters.setTransactionSizeCallback(this.mstTransactionSizeMonitorImpl);

    this.metricRegistryManager.reieForStSu(this.strSt, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfStartedTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strCpt, () ->
    {

      return new MetricsMeter(transactionCounters::getPeakConcurrentNumberOfTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strAt, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfActiveTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strAtr, () ->
    {
      return new MetricsMeter(transactionCounters::getNumberOfActiveReadTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strWta, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfActiveWriteTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strCt, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfCommittedTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strCtr, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfCommittedReadTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strCtw, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfCommittedWriteTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strRt, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfRolledBackTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strRtr, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfRolledBackReadTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strWtr, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfRolledBackWriteTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strTt, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfTerminatedTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strTtr, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfTerminatedReadTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strTtw, () ->
    {

      return new MetricsMeter(transactionCounters::getNumberOfTerminatedWriteTransactions);
    });
    this.metricRegistryManager.reieForStSu(this.strItcl, () ->
    {
      return new MetricsMeter(() ->
      {
        return this.supplierSsitTransactionIdStore.get().getLastCommittedTransactionId();
      });
    });
    this.metricRegistryManager.reieForStSu(this.strItcl2, () ->
    {
      return new MetricsMeter(() ->
      {
        return this.supplierSsitTransactionIdStore.get().getLastClosedTransactionId();
      });
    });
    this.metricRegistryManager.reieForStSu(this.strTsh, () ->
    {
      return this.mstTransactionSizeMonitorImpl.getSthHistogram();
    });
    this.metricRegistryManager.reieForStSu(this.strNst, () ->
    {
      return this.mstTransactionSizeMonitorImpl.getStnHistogram();
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strSt);
    this.metricRegistryManager.reoForSt(this.strCpt);
    this.metricRegistryManager.reoForSt(this.strAt);
    this.metricRegistryManager.reoForSt(this.strAtr);
    this.metricRegistryManager.reoForSt(this.strWta);
    this.metricRegistryManager.reoForSt(this.strCt);
    this.metricRegistryManager.reoForSt(this.strCtr);
    this.metricRegistryManager.reoForSt(this.strCtw);
    this.metricRegistryManager.reoForSt(this.strRt);
    this.metricRegistryManager.reoForSt(this.strRtr);
    this.metricRegistryManager.reoForSt(this.strWtr);
    this.metricRegistryManager.reoForSt(this.strTt);
    this.metricRegistryManager.reoForSt(this.strTtr);
    this.metricRegistryManager.reoForSt(this.strTtw);
    this.metricRegistryManager.reoForSt(this.strItcl);
    this.metricRegistryManager.reoForSt(this.strItcl2);
    this.metricRegistryManager.reoForSt(this.strTsh);
    this.metricRegistryManager.reoForSt(this.strNst);
    this.transactionCounters.setTransactionSizeCallback(null);
  }
}
