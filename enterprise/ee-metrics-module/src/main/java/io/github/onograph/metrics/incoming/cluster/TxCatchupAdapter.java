package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.monitoring.Monitors;


@Documented(io.github.onograph.TokenConstants.TX_CATCHUP_ADAPTER___DOCUMENTED)
public class TxCatchupAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.TX_CATCHUP_ADAPTER___DOCUMENTED_TXS_PUL_REUT_REEE_TPX)
  private static final String TXS_PUL_REUT_REEE_TPX =
      MetricRegistry.name(
          io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCHUP__TX_PULL_REQUESTS_RECEIVED);


  private final MetricRegistryManager metricRegistryManager;


  private final Monitors monitors;


  private final GlobalTransactionPullRequests mrptGlobalTransactionPullRequests;


  private final String strRrpt;

  public TxCatchupAdapter() {
    this("", null, null);
  }

  public TxCatchupAdapter(String mprnm, Monitors _monitors,
      MetricRegistryManager _metricRegistryManager) {
    super(EnterpriseMetricsType.EMT_CLUSTER);
    this.mrptGlobalTransactionPullRequests = new GlobalTransactionPullRequests();
    this.strRrpt = MetricRegistry.name(mprnm, TXS_PUL_REUT_REEE_TPX);
    this.monitors = _monitors;
    this.metricRegistryManager = _metricRegistryManager;
  }

  @Override
  public void start() {
    this.monitors.addMonitorListener(this.mrptGlobalTransactionPullRequests);
    this.metricRegistryManager.reieForStSu(this.strRrpt, () ->
    {

      GlobalTransactionPullRequests _globalTransactionPullRequests = this.mrptGlobalTransactionPullRequests;
      Objects.requireNonNull(_globalTransactionPullRequests);
      return new MetricsMeter(_globalTransactionPullRequests::txplreree);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strRrpt);
    this.monitors.removeMonitorListener(this.mrptGlobalTransactionPullRequests);
  }
}
