package io.github.onograph.module.edition;

import io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl;
import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.SecurityModuleEnterpriseImpl;
import io.github.onograph.server.security.systemgraph.DefaultSecuritySystemGraphComponent;
import io.github.onograph.server.security.systemgraph.EnhancedDefaultDatabaseResolver;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.neo4j.collection.Dependencies;
import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.cypher.internal.cache.CaffeineCacheFactory;
import org.neo4j.cypher.internal.cache.ExecutorBasedCaffeineCacheFactory;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphComponents;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.api.security.provider.SecurityProvider;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.DefaultDatabaseResolver;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.MonitoredJobExecutor;
import org.neo4j.server.security.auth.CommunitySecurityModule;
import org.neo4j.server.security.systemgraph.UserSecurityGraphComponent;


public interface EnterpriseModule {


  private static Executor _geatchecExecutor(GlobalModule _globalModule) {

    MonitoredJobExecutor _monitoredJobExecutor = _globalModule.getJobScheduler()
        .monitoredJobExecutor(Group.AUTH_CACHE);
    return (job) ->
    {
      _monitoredJobExecutor.execute(JobMonitoringParams.systemJob(
          io.github.onograph.I18N.format(
              "io.github.onograph.module.edition.EnterpriseModule.systemJob")), job);
    };
  }


  private static Supplier<GraphDatabaseService> _sytspeSupplier(
      DependencyResolver _dpnecDependencyResolver) {
    return () ->
    {

      DatabaseManager<?> _databaseManagerMdObject = (DatabaseManager) _dpnecDependencyResolver.resolveDependency(
          DatabaseManager.class);
      return _databaseManagerMdObject.getDatabaseContext(
          DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID).orElseThrow(() ->

      {
        return new RuntimeException(
            "*** Error:  9c97c63d-585f-4e6e-a8bb-d1c6b8e7ab8b");
      }).databaseFacade();
    };
  }


  static EnhancedDefaultDatabaseResolver madetdbreeEnhancedDefaultDatabaseResolver(
      GlobalModule _globalModule) {

    Executor _caExecutor = _geatchecExecutor(_globalModule);

    CaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(_caExecutor);
    return new EnhancedDefaultDatabaseResolver(_caffeineCacheFactory,
        _globalModule.getGlobalConfig(),
        _sytspeSupplier(_globalModule.getGlobalDependencies()));
  }


  static SecurityProvider maenrsetmuSecurityProvider(
      DefaultDatabaseResolver _defaultDatabaseResolver, DefaultSecurityLog _defaultSecurityLog,
      GlobalModule _globalModule) {

    Config _config = _globalModule.getGlobalConfig();

    LogProvider _usLogProvider = _globalModule.getLogService().getUserLogProvider();

    Dependencies _dependencies = _globalModule.getGlobalDependencies();

    Executor _caExecutor = _geatchecExecutor(_globalModule);

    ExecutorBasedCaffeineCacheFactory _executorBasedCaffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        _caExecutor);
    _dependencies.satisfyDependency(_defaultSecurityLog);
    if (_config.get(GraphDatabaseSettings.auth_enabled)) {

      DefaultSecuritySystemGraphComponent _csDefaultSecuritySystemGraphComponent =
          _dependencies.resolveDependency(DefaultSecuritySystemGraphComponent.class);

      SecurityModuleEnterpriseImpl _securityModuleEnterpriseImpl =
          new SecurityModuleEnterpriseImpl(_executorBasedCaffeineCacheFactory, _config,
              _defaultDatabaseResolver, _defaultSecurityLog,
              _csDefaultSecuritySystemGraphComponent, _dependencies, _globalModule.getFileSystem(),
              _globalModule.getTransactionEventListeners(), _usLogProvider);
      _securityModuleEnterpriseImpl.setup();
      _globalModule.getGlobalLife().add(_securityModuleEnterpriseImpl.authManager());

      AuthManager _lobcAuthManager = _securityModuleEnterpriseImpl.loopbackAuthManager();
      if (_lobcAuthManager != null) {
        _globalModule.getGlobalLife().add(_lobcAuthManager);
      }

      return _securityModuleEnterpriseImpl;
    } else {
      return SecurityProviderAuthDisabledImpl.IT;
    }
  }


  default void retscycosForSyGlDe(DefaultSecurityLog _defaultSecurityLog,
      GlobalModule _globalModule, SystemGraphComponents _systemGraphComponents) {

    Config _config = _globalModule.getGlobalConfig();

    FileSystemAbstraction _fileSystemAbstraction = _globalModule.getFileSystem();

    LogProvider _logProvider = _globalModule.getLogService().getUserLogProvider();

    UserSecurityGraphComponent _csuUserSecurityGraphComponent =
        CommunitySecurityModule.createSecurityComponent(_defaultSecurityLog, _config,
            _fileSystemAbstraction, _logProvider);

    DefaultSecuritySystemGraphComponent _cparDefaultSecuritySystemGraphComponent =
        SecurityModuleEnterpriseImpl.cresrcoeDefaultSecuritySystemGraphComponent(_config,
            _defaultSecurityLog, _fileSystemAbstraction, _logProvider);
    _systemGraphComponents.register(_csuUserSecurityGraphComponent);
    _systemGraphComponents.register(_cparDefaultSecuritySystemGraphComponent);

    Dependencies _dependencies = _globalModule.getGlobalDependencies();
    _dependencies.satisfyDependency(_cparDefaultSecuritySystemGraphComponent);
  }


  default void safeesoydniForGl(GlobalModule _globalModule) {

    Config _goaConfig = _globalModule.getGlobalConfig();

    int _iWc = _goaConfig.get(GraphDatabaseInternalSettings.cypher_worker_count);

    int _iTon = _iWc == -1 ? 0 : (_iWc == 0 ? Runtime.getRuntime().availableProcessors() : _iWc);


  }
}
