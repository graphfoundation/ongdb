package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters;


@Documented(io.github.onograph.TokenConstants.GDB_TRANSACTION_LOG_ADAPTER___DOCUMENTED)
public class GdbTransactionLogAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.GDB_TRANSACTION_LOG_ADAPTER___DOCUMENTED_LG_APEE_BTXS)
  private static final String LG_APEE_BTXS =
      MetricRegistry.name(io.github.onograph.TokenConstants.LOG,
          io.github.onograph.TokenConstants.APPENDED_BYTES);


  @Documented(io.github.onograph.TokenConstants.GDB_TRANSACTION_LOG_ADAPTER___DOCUMENTED_LG_ROTX_CNT_LTM_TPX)
  private static final String LG_ROTX_CNT_LTM_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.LOG,
          io.github.onograph.TokenConstants.ROTATION_TOTAL_TIME);


  @Documented(io.github.onograph.TokenConstants.GDB_TRANSACTION_LOG_ADAPTER___DOCUMENTED_LG_ROTX_EVXS_TPX)
  private static final String LG_ROTX_EVXS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.LOG,
          io.github.onograph.TokenConstants.ROTATION_EVENTS);


  @Documented(io.github.onograph.TokenConstants.GDB_TRANSACTION_LOG_ADAPTER___DOCUMENTED_LG_ROTX_TTOT_TPX)
  private static final String LG_ROTX_TTOT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.LOG,
          io.github.onograph.TokenConstants.ROTATION_DURATION);


  private static final String TXS_LG_PRE = io.github.onograph.TokenConstants.LOG;


  private final MetricRegistryManager metricRegistryManager;


  private final String strBal;


  private final String strDrl;


  private final String strLre;


  private final String strTtrl;


  private final TransactionLogCounters transactionLogCounters;

  public GdbTransactionLogAdapter() {
    this("", null, null);
  }

  public GdbTransactionLogAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      TransactionLogCounters _transactionLogCounters) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.strLre = MetricRegistry.name(mprnm, LG_ROTX_EVXS_TPX);
    this.strTtrl = MetricRegistry.name(mprnm, LG_ROTX_CNT_LTM_TPX);
    this.strDrl = MetricRegistry.name(mprnm, LG_ROTX_TTOT_TPX);
    this.strBal = MetricRegistry.name(mprnm, LG_APEE_BTXS);
    this.metricRegistryManager = _metricRegistryManager;
    this.transactionLogCounters = _transactionLogCounters;
  }

  @Override
  public void start() {
    this.metricRegistryManager.reieForStSu(this.strLre, () ->
    {

      TransactionLogCounters _transactionLogCounters = this.transactionLogCounters;
      Objects.requireNonNull(_transactionLogCounters);
      return new MetricsMeter(_transactionLogCounters::numberOfLogRotations);
    });
    this.metricRegistryManager.reieForStSu(this.strTtrl, () ->
    {

      TransactionLogCounters _transactionLogCounters2 = this.transactionLogCounters;
      Objects.requireNonNull(_transactionLogCounters2);
      return new MetricsMeter(_transactionLogCounters2::logRotationAccumulatedTotalTimeMillis);
    });
    this.metricRegistryManager.reieForStSu(this.strBal, () ->
    {

      TransactionLogCounters _transactionLogCounters3 = this.transactionLogCounters;
      Objects.requireNonNull(_transactionLogCounters3);
      return new MetricsMeter(_transactionLogCounters3::appendedBytes);
    });
    this.metricRegistryManager.reieForStSu(this.strDrl, () ->
    {
      return new MetricsMeter(transactionLogCounters::lastLogRotationTimeMillis);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strDrl);
    this.metricRegistryManager.reoForSt(this.strLre);
    this.metricRegistryManager.reoForSt(this.strTtrl);
    this.metricRegistryManager.reoForSt(this.strBal);
  }
}
