package io.github.onograph.metrics.gdb;

import io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck;
import io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl;
import io.github.onograph.metrics.MetricsService;
import java.util.function.Supplier;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;
import org.neo4j.kernel.impl.transaction.stats.CheckpointCounters;
import org.neo4j.kernel.impl.transaction.stats.TransactionCounters;
import org.neo4j.kernel.impl.transaction.stats.TransactionLogCounters;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.memory.MemoryPools;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.TransactionIdStore;


public class ExtensionFactoryGdbMetricsImpl extends
    ExtensionFactory<io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents> {

  public ExtensionFactoryGdbMetricsImpl() {
    super(ExtensionType.DATABASE, io.github.onograph.TokenConstants.DATABASE_METRICS);
  }

  @Override
  public Lifecycle newInstance(ExtensionContext _extensionContext,
      io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents _dpnecDependentComponents) {
    return new GdbMetricsLifecycle(_dpnecDependentComponents, _extensionContext);
  }


  public interface DependentComponents {


    CheckpointCounters chpceCheckpointCounters();


    Config cofutnConfig();


    Supplier<CoreNodeLeaderCheck> cometspSupplier();


    Database daasDatabase();


    FileSystemAbstraction fiessmFileSystemAbstraction();


    MemoryPools meoplMemoryPools();


    MetricsService mersmneMetricsService();


    Monitors moirMonitors();


    MonitorsClusterConsensusImpl ratmnoMonitorsClusterConsensusImpl();


    JobScheduler scelJobScheduler();


    Supplier<StoreEntityCounters> steyctSupplier();


    TransactionCounters tranctTransactionCounters();


    TransactionLogCounters tranlcorTransactionLogCounters();


    Supplier<TransactionIdStore> tranosprSupplier();


    Tracers trcsTracers();
  }
}
