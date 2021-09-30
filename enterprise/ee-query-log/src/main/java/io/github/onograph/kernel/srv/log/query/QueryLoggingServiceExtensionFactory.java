package io.github.onograph.kernel.srv.log.query;

import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.monitoring.Monitors;


public class QueryLoggingServiceExtensionFactory
    extends
    ExtensionFactory<io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies> {

  public QueryLoggingServiceExtensionFactory() {
    super(ExtensionType.GLOBAL, io.github.onograph.TokenConstants.QUERY_LOGGING);
  }

  @Override
  public Lifecycle newInstance(ExtensionContext _extensionContext,
      io.github.onograph.kernel.srv.log.query.QueryLoggingServiceExtensionFactory.QueryLoggingServiceDependencies _queryLoggingServiceDependencies) {

    final FileSystemAbstraction _fileSystemAbstraction = _queryLoggingServiceDependencies.fiessmFileSystemAbstraction();

    final Config _config = _queryLoggingServiceDependencies.cofConfig();

    final Monitors _mntrnMonitors = _queryLoggingServiceDependencies.moirgMonitors();
    return new LifecycleAdapter() {


      EnterpriseQueryExecutionMonitor eqMonitorLog;

      @Override
      public void init() {
        this.eqMonitorLog = new EnterpriseQueryExecutionMonitor(_config, _fileSystemAbstraction);
        this.eqMonitorLog.init();
        _mntrnMonitors.addMonitorListener(this.eqMonitorLog);
      }

      @Override
      public void shutdown() {
        this.eqMonitorLog.shutdown();
      }
    };
  }


  public interface QueryLoggingServiceDependencies {


    Config cofConfig();


    FileSystemAbstraction fiessmFileSystemAbstraction();


    Monitors moirgMonitors();
  }
}
