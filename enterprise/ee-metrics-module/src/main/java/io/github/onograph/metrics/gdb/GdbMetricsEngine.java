package io.github.onograph.metrics.gdb;

import io.github.onograph.config.Metrics;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter;
import io.github.onograph.metrics.incoming.cluster.ReadReplicaNodeAdapter;
import io.github.onograph.metrics.incoming.cluster.TxCatchupAdapter;
import io.github.onograph.metrics.incoming.gdb.CheckpointCounterAdapter;
import io.github.onograph.metrics.incoming.gdb.CypherPlanAdapter;
import io.github.onograph.metrics.incoming.gdb.GdbElementStatsAdapter;
import io.github.onograph.metrics.incoming.gdb.GdbStatsAdapter;
import io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter;
import io.github.onograph.metrics.incoming.gdb.GdbTransactionLogAdapter;
import io.github.onograph.metrics.incoming.gdb.GlobalTransactionStatsAdapter;
import io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl;
import io.github.onograph.metrics.incoming.gdb.QueryExecutionMonitorMetricsImpl;
import org.neo4j.common.Edition;
import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.factory.OperationalMode;
import org.neo4j.kernel.lifecycle.LifeSupport;


public class GdbMetricsEngine {


  private final Config config;


  private final io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dpnecDependentComponents;


  private final ExtensionContext extensionContext;


  private final LifeSupport lifeSupport;


  private final MetricRegistryManager metricRegistryManager;


  GdbMetricsEngine(Config _config,
      io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents _dpnecDependentComponents,
      ExtensionContext _extensionContext, LifeSupport _lifeSupport,
      MetricRegistryManager _metricRegistryManager) {
    this.config = _config;
    this.dpnecDependentComponents = _dpnecDependentComponents;
    this.extensionContext = _extensionContext;
    this.lifeSupport = _lifeSupport;
    this.metricRegistryManager = _metricRegistryManager;
  }


  public static String daamtpxString(Config _config, String title) {

    String _strSnd =
        _config.get(Metrics.settingMeceebBoolean) ? io.github.onograph.TokenConstants.__DATABASE__
            : ".";
    return _config.get(Metrics.settingMersexString) + _strSnd + title;
  }


  public void exo() {

    String mprnm = daamtpxString(this.config,
        this.dpnecDependentComponents.daasDatabase().getNamedDatabaseId().name());
    this.lifeSupport.add(new GlobalTransactionStatsAdapter(mprnm, this.metricRegistryManager,
        this.dpnecDependentComponents.tranosprSupplier(),
        this.dpnecDependentComponents.tranctTransactionCounters()));
    this.lifeSupport.add(new CheckpointCounterAdapter(mprnm, this.metricRegistryManager,
        this.dpnecDependentComponents.chpceCheckpointCounters()));
    this.lifeSupport.add(
        new GdbTransactionLogAdapter(mprnm, this.metricRegistryManager,
            this.dpnecDependentComponents.tranlcorTransactionLogCounters()));
    if (this.extensionContext.dbmsInfo().edition != Edition.COMMUNITY
        && this.extensionContext.dbmsInfo().edition != Edition.UNKNOWN) {
      this.lifeSupport.add(new GdbElementStatsAdapter(mprnm, this.metricRegistryManager,
          this.dpnecDependentComponents.steyctSupplier()));

      PageCacheTracer _pageCacheTracer = this.dpnecDependentComponents.trcsTracers()
          .getPageCacheTracer();
      this.lifeSupport.add(new GdbStatsAdapter(mprnm, this.metricRegistryManager,
          this.dpnecDependentComponents.steyctSupplier(), _pageCacheTracer));
    }

    this.lifeSupport.add(new GdbStoreStatsAdapter(mprnm, this.metricRegistryManager,
        this.dpnecDependentComponents.scelJobScheduler(),
        this.dpnecDependentComponents.fiessmFileSystemAbstraction(),
        this.dpnecDependentComponents.daasDatabase().getDatabaseLayout()));
    this.lifeSupport.add(new CypherPlanAdapter(mprnm, this.metricRegistryManager,
        this.dpnecDependentComponents.moirMonitors()));
    this.lifeSupport.add(new MemoryPoolsAdapterGdbImpl(mprnm, this.metricRegistryManager,
        this.dpnecDependentComponents.meoplMemoryPools(),
        this.dpnecDependentComponents.daasDatabase().getNamedDatabaseId().name()));
    this.lifeSupport.add(new QueryExecutionMonitorMetricsImpl(mprnm, this.metricRegistryManager,
        this.dpnecDependentComponents.moirMonitors()));

    OperationalMode mdstr = this.extensionContext.dbmsInfo().operationalMode;
    if (mdstr == OperationalMode.CORE) {
      this.lifeSupport.add(
          new ConsensusCoreNodeAdapter(mprnm,
              this.dpnecDependentComponents.ratmnoMonitorsClusterConsensusImpl(),
              this.metricRegistryManager,
              this.dpnecDependentComponents.cometspSupplier()));
      this.lifeSupport.add(new TxCatchupAdapter(mprnm, this.dpnecDependentComponents.moirMonitors(),
          this.metricRegistryManager));
    } else if (mdstr == OperationalMode.READ_REPLICA) {
      this.lifeSupport.add(
          new ReadReplicaNodeAdapter(mprnm,
              this.dpnecDependentComponents.ratmnoMonitorsClusterConsensusImpl(),
              this.metricRegistryManager));
      this.lifeSupport.add(new TxCatchupAdapter(mprnm, this.dpnecDependentComponents.moirMonitors(),
          this.metricRegistryManager));
    }
  }
}
