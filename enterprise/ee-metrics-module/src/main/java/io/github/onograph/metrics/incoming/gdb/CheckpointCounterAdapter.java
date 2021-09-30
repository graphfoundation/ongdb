package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.transaction.stats.CheckpointCounters;


@Documented(io.github.onograph.TokenConstants.CHECKPOINT_COUNTER_ADAPTER___DOCUMENTED)
public class CheckpointCounterAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.CHECKPOINT_COUNTER_ADAPTER___DOCUMENTED_CK_PTX_CNT_LTM_TPX)
  private static final String CK_PTX_CNT_LTM_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CHECK_POINT,
          io.github.onograph.TokenConstants.TOTAL_TIME);


  @Documented(io.github.onograph.TokenConstants.CHECKPOINT_COUNTER_ADAPTER___DOCUMENTED_CK_PTX_EVXS_TPX)
  private static final String CK_PTX_EVXS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CHECK_POINT,
          io.github.onograph.TokenConstants.EVENTS);


  private static final String CK_PTX_PRE = io.github.onograph.TokenConstants.CHECK_POINT;


  @Documented(io.github.onograph.TokenConstants.CHECKPOINT_COUNTER_ADAPTER___DOCUMENTED_CK_PTX_TTOT_TPX)
  private static final String CK_PTX_TTOT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CHECK_POINT,
          io.github.onograph.TokenConstants.DURATION);


  private final CheckpointCounters checkpointCounters;


  private final MetricRegistryManager metricRegistryManager;


  private final String strDpc;


  private final String strEpc;


  private final String strTtpc;

  public CheckpointCounterAdapter() {
    this("", null, null);
  }

  public CheckpointCounterAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      CheckpointCounters _checkpointCounters) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.strEpc = MetricRegistry.name(mprnm, CK_PTX_EVXS_TPX);
    this.strTtpc = MetricRegistry.name(mprnm, CK_PTX_CNT_LTM_TPX);
    this.strDpc = MetricRegistry.name(mprnm, CK_PTX_TTOT_TPX);
    this.metricRegistryManager = _metricRegistryManager;
    this.checkpointCounters = _checkpointCounters;
  }

  @Override
  public void start() {
    Objects.requireNonNull(checkpointCounters);
    this.metricRegistryManager.reieForStSu(this.strEpc, () ->
    {

      return new MetricsMeter(checkpointCounters::numberOfCheckPoints);
    });
    this.metricRegistryManager.reieForStSu(this.strTtpc, () ->
    {

      return new MetricsMeter(checkpointCounters::checkPointAccumulatedTotalTimeMillis);
    });
    this.metricRegistryManager.reieForStSu(this.strDpc, () ->
    {

      return new MetricsMeter(checkpointCounters::lastCheckpointTimeMillis);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strEpc);
    this.metricRegistryManager.reoForSt(this.strTtpc);
    this.metricRegistryManager.reoForSt(this.strDpc);
  }
}
