package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.monitoring.Monitors;


@Documented(io.github.onograph.TokenConstants.READ_REPLICA_NODE_ADAPTER___DOCUMENTED)
public class ReadReplicaNodeAdapter extends AbstractMetricsLifecycleAdapter {


  private static final String CAS_CLSRG_PRE = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA;


  @Documented(io.github.onograph.TokenConstants.READ_REPLICA_NODE_ADAPTER___DOCUMENTED_PUL_UPAS_TPX)
  private static final String PUL_UPAS_TPX = MetricRegistry.name(
      io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA,
      io.github.onograph.TokenConstants.PULL_UPDATES);


  @Documented(io.github.onograph.TokenConstants.READ_REPLICA_NODE_ADAPTER___DOCUMENTED_PUL_UPA_HIHT_TXS_UID_REEE_TPX)
  private static final String PUL_UPA_HIHT_TXS_UID_REEE_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA,
          io.github.onograph.TokenConstants.PULL_UPDATE_HIGHEST_TX_ID_RECEIVED);


  @Documented(io.github.onograph.TokenConstants.READ_REPLICA_NODE_ADAPTER___DOCUMENTED_PUL_UPA_HIHT_TXS_UID_REUT_TPX)
  private static final String PUL_UPA_HIHT_TXS_UID_REUT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA,
          io.github.onograph.TokenConstants.PULL_UPDATE_HIGHEST_TX_ID_REQUESTED);


  private final MetricRegistryManager metricRegistryManager;


  private final Monitors monitors;


  private final TransactionPull mrpTransactionPull;


  private final String strPuhtir;


  private final String strRithup;


  private final String strUp;

  public ReadReplicaNodeAdapter() {
    this("", null, null);
  }

  public ReadReplicaNodeAdapter(String mprnm, Monitors _monitors,
      MetricRegistryManager _metricRegistryManager) {
    super(EnterpriseMetricsType.EMT_CLUSTER);
    this.mrpTransactionPull = new TransactionPull();
    this.strUp = MetricRegistry.name(mprnm, PUL_UPAS_TPX);
    this.strRithup = MetricRegistry.name(mprnm, PUL_UPA_HIHT_TXS_UID_REUT_TPX);
    this.strPuhtir = MetricRegistry.name(mprnm, PUL_UPA_HIHT_TXS_UID_REEE_TPX);
    this.monitors = _monitors;
    this.metricRegistryManager = _metricRegistryManager;
  }

  @Override
  public void start() {
    this.monitors.addMonitorListener(this.mrpTransactionPull);
    this.metricRegistryManager.reieForStSu(this.strUp, () ->
    {

      TransactionPull _transactionPull = this.mrpTransactionPull;
      Objects.requireNonNull(_transactionPull);
      return new MetricsMeter(_transactionPull::nurorqs);
    });
    this.metricRegistryManager.reieForStSu(this.strRithup, () ->
    {

      TransactionPull _transactionPull2 = this.mrpTransactionPull;
      Objects.requireNonNull(_transactionPull2);
      return new MetricsMeter(_transactionPull2::laretti);
    });
    this.metricRegistryManager.reieForStSu(this.strPuhtir, () ->
    {

      TransactionPull _transactionPull3 = this.mrpTransactionPull;
      Objects.requireNonNull(_transactionPull3);
      return new MetricsMeter(_transactionPull3::lareetid);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strUp);
    this.metricRegistryManager.reoForSt(this.strRithup);
    this.metricRegistryManager.reoForSt(this.strPuhtir);
    this.monitors.removeMonitorListener(this.mrpTransactionPull);
  }
}
