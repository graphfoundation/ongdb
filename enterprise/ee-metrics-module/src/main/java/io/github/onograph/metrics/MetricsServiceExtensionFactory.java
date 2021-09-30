package io.github.onograph.metrics;

import java.util.function.Supplier;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.database.DatabaseOperationCounts;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.monitoring.PageCacheCounters;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.monitoring.DatabaseEventListeners;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.MemoryPools;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.server.web.WebContainerThreadInfo;


public class MetricsServiceExtensionFactory extends
    ExtensionFactory<MetricsServiceExtensionFactory.RequiredComponents> {

  public MetricsServiceExtensionFactory() {
    super(io.github.onograph.TokenConstants.GLOBAL_METRICS);
  }

  @Override
  public Lifecycle newInstance(ExtensionContext _extensionContext,
      MetricsServiceExtensionFactory.RequiredComponents _dpnecRequiredComponents) {
    return new MetricsServiceLifecycle(_dpnecRequiredComponents, _extensionContext);
  }


  public interface RequiredComponents {


    Config cofutnConfig();


    DatabaseEventListeners daaeelsrDatabaseEventListeners();


    DatabaseOperationCounts daaoeocnDatabaseOperationCounts();


    FileSystemAbstraction fyaanFileSystemAbstraction();


    LogService losveLogService();


    MemoryPools meoplMemoryPools();


    Monitors moirMonitors();


    PageCacheCounters pacacorPageCacheCounters();


    ConnectorPortRegister potrgtConnectorPortRegister();


    JobScheduler scelJobScheduler();


    Supplier<WebContainerThreadInfo> wecneteifSupplier();
  }
}
