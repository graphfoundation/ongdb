package io.github.onograph.module.edition;

import io.github.onograph.cluster.raft.module.cuprot.AdapterChannelHandlerServiceMGDBImpl;
import io.github.onograph.cluster.raft.module.cuprot.CatchupManagerCoordinator;
import io.github.onograph.cluster.raft.module.cuprot.ClusterCatchupNodeManager;
import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl;
import io.github.onograph.cluster.raft.netty.ClusterAdapter;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.cluster.raft.share.meta.ClusterDiscoveryService;
import io.github.onograph.cluster.raft.shared.ClusterTxConfiguratorApproach;
import io.github.onograph.config.EnterpriseClusterSettings;
import io.github.onograph.config.EnterpriseFabricConfiguration;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.DefaultDbmsReconcilerLifecycleAdapter;
import io.github.onograph.dbms.DefaultSystemGraphDbmsModel;
import io.github.onograph.dbms.HealthMonitorService;
import io.github.onograph.dbms.MediationDbmsManagers;
import io.github.onograph.dbms.StructureMetaService;
import io.github.onograph.dbms.crash.CrashManager;
import io.github.onograph.dbms.crash.CrashManagerImpl;
import io.github.onograph.dbms.crash.GdbCrashGenerator;
import io.github.onograph.dbms.gdb.AbstractMultipleGdbDatabaseManager;
import io.github.onograph.dbms.gdb.DefaultStandaloneDatabaseContext;
import io.github.onograph.dbms.gdb.MultipleGdbDatabaseManagerEnterpriseImpl;
import io.github.onograph.fabric.RoutingProcedureInstaller;
import io.github.onograph.fabric.SystemGraphComponentEnterpriseFabricImpl;
import io.github.onograph.fabric.bootstrap.AbstractFabricServicesBootstrap;
import io.github.onograph.fabric.security.AuthManagerFabricImpl;
import io.github.onograph.kernel.api.security.DefaultAuthManager;
import io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl;
import io.github.onograph.procedure.builtin.DocumentedAllowedConfigs;
import io.github.onograph.server.NeoWebServerEnterpriseImpl;
import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.systemgraph.EnhancedDefaultDatabaseResolver;
import java.time.Duration;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.neo4j.bolt.dbapi.BoltGraphDatabaseManagementServiceSPI;
import org.neo4j.bolt.txtracking.DefaultReconciledTransactionTracker;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.collection.Dependencies;
import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.cypher.internal.javacompat.EnhancedCypherEngineProvider;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.StandaloneDatabaseContext;
import org.neo4j.dbms.database.SystemGraphComponents;
import org.neo4j.dbms.identity.StandaloneIdentityModule;
import org.neo4j.exceptions.KernelException;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.function.Predicates;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.CommunityEditionModule;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.Kernel;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.constraints.ConstraintSemantics;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.kernel.impl.query.QueryEngineProvider;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesHelper;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.token.DelegatingTokenHolder;
import org.neo4j.token.TokenHolders;


public class DefaultEnterpriseModule extends CommunityEditionModule implements EnterpriseModule {


  private final AbstractFabricServicesBootstrap abstractFabricServicesBootstrap;


  private final CrashManager crashManager;


  private final DefaultSecurityLog defaultSecurityLog;


  private final DefaultSystemGraphDbmsModel defaultSystemGraphDbmsModel;


  private final Dependencies dependencies;


  private final HealthMonitorService healthMonitorService;


  private final CurrentProtocolStackManager hpiCurrentProtocolStackManager;


  private final MediationDbmsManagers mediationDbmsManagers;


  private final StandaloneIdentityModule standaloneIdentityModule;


  private final ReconciledTransactionTracker ttrReconciledTransactionTracker;


  private AbstractMultipleGdbDatabaseManager<?> abstractMultipleGdbDatabaseManagerMdObject;


  private DatabaseStartupControllerAbortableImpl asdDatabaseStartupControllerAbortableImpl;


  private ClusterStructureService clusterStructureService;


  private DefaultDbmsReconcilerLifecycleAdapter mrDefaultDbmsReconcilerLifecycleAdapter;


  private RemoteMetaService remoteMetaService;

  public DefaultEnterpriseModule(GlobalModule _globalModule) {
    this(_globalModule.getGlobalDependencies(), _globalModule);
  }


  protected DefaultEnterpriseModule(Dependencies _dependencies, GlobalModule _globalModule) {
    super(_globalModule);
    this.dependencies = _dependencies;
    this.safeesoydniForGl(_globalModule);
    this.ttrReconciledTransactionTracker = new DefaultReconciledTransactionTracker(
        _globalModule.getLogService());
    this.defaultSecurityLog = new DefaultSecurityLog(_globalModule.getGlobalConfig(),
        _globalModule.getFileSystem());
    _globalModule.getGlobalLife().add(this.defaultSecurityLog);
    this.abstractFabricServicesBootstrap =
        new AbstractFabricServicesBootstrap.DefaultFabricServicesBootstrap(this.defaultSecurityLog,
            _dependencies, _globalModule.getGlobalLife(),
            _globalModule.getLogService());

    DocumentedAllowedConfigs _lwsDocumentedAllowedConfigs = new DocumentedAllowedConfigs(
        _globalModule.getGlobalConfig());
    _dependencies.satisfyDependency(_lwsDocumentedAllowedConfigs);
    this.crashManager = new CrashManagerImpl(
        GdbCrashGenerator.bulfoGdbCrashGenerator(_globalModule.getGlobalConfig(),
            _globalModule.getLogService()), _globalModule.getJobScheduler(),
        _globalModule.getLogService());
    this.standaloneIdentityModule = StandaloneIdentityModule.fromGlobalModule(_globalModule);
    _dependencies.satisfyDependency(this.standaloneIdentityModule);
    this.hpiCurrentProtocolStackManager = new CurrentProtocolStackManager();
    this.healthMonitorService =
        new HealthMonitorService(_globalModule.getFileSystem(),
            _globalModule.getLogService().getInternalLogProvider(),
            _globalModule.getOtherMemoryPool().getPoolMemoryTracker(),
            _globalModule.getNeo4jLayout());

    Supplier<GraphDatabaseService> _supplierSdsGraphDatabaseService = () ->
    {
      return this.abstractMultipleGdbDatabaseManagerMdObject.getDatabaseContext(
              DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID).orElseThrow()
          .databaseFacade();
    };
    this.defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        _supplierSdsGraphDatabaseService);
    this.mediationDbmsManagers =
        new MediationDbmsManagers(this.defaultSystemGraphDbmsModel, _globalModule,
            this.healthMonitorService, this.ttrReconciledTransactionTracker);
  }


  private void _crechsrForAb(
      AbstractMultipleGdbDatabaseManager<DefaultStandaloneDatabaseContext> _abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext) {

    Config _config = this.globalModule.getGlobalConfig();

    LogProvider _logProvider = this.globalModule.getLogService().getInternalLogProvider();

    int largest = _config.get(SettingsDeclarationClusterImpl.settingStchiInteger);

    AdapterChannelHandlerServiceMGDBImpl _hscAdapterChannelHandlerServiceMGDBImpl = AdapterChannelHandlerServiceMGDBImpl
        .causvhnAdapterChannelHandlerServiceMGDBImpl(
            _abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext,
            this.databaseStateService,
            this.globalModule.getGlobalDependencies(), this.globalModule.getFileSystem(), largest,
            _logProvider);

    ClusterAdapter _scClusterAdapter = ClusterCatchupNodeManager.fatyClusterCatchupNodeManager(
            this.globalModule, this.sslPolicyLoader)
        .crechsrClusterAdapter(this.hpiCurrentProtocolStackManager,
            _hscAdapterChannelHandlerServiceMGDBImpl);
    this.remoteMetaService =
        CatchupManagerCoordinator.crechciCatchupManagerCoordinator(this.globalModule,
            this.sslPolicyLoader).reeictRemoteMetaService();
    this.globalModule.getGlobalLife().add(_scClusterAdapter);
    this.globalModule.getGlobalDependencies().satisfyDependencies(_scClusterAdapter);
  }


  private void _credbmardnmeForAbDe(
      AbstractMultipleGdbDatabaseManager<DefaultStandaloneDatabaseContext> _abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext,
      DefaultDbmsReconcilerLifecycleAdapter _rmDefaultDbmsReconcilerLifecycleAdapter) {
    this._indieadchindForAbDe(_abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext,
        _rmDefaultDbmsReconcilerLifecycleAdapter);
    this._inbaindForGlCoAb(_abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext,
        this.globalModule.getGlobalConfig(), this.globalModule);
  }


  private void _cretlseeForDe(
      DefaultDbmsReconcilerLifecycleAdapter _mrDefaultDbmsReconcilerLifecycleAdapter) {

    ClusterDiscoveryService clusterDiscoveryService =
        new ClusterDiscoveryService(
            this.crashManager.paieCrashSignaler(), this.databaseStateService,
            new ClusterDiscoveryManagerAkkaImpl(), this.globalModule,
            this.sslPolicyLoader);
    this.clusterStructureService = clusterDiscoveryService.statosrClusterStructureService(
        this.standaloneIdentityModule);
    _mrDefaultDbmsReconcilerLifecycleAdapter.retdtesecglsrForDa(this.clusterStructureService);
  }


  private StructureMetaService _getpypiStructureMetaService(NamedDatabaseId _namedDatabaseId) {
    if (this.clusterStructureService == null) {
      return StructureMetaService.NOO_STRUCTURE_META_SERVICE;
    } else {

      Objects.requireNonNull(this.clusterStructureService);

      return StructureMetaService.froStructureMetaService(this.clusterStructureService::ondasForNa,
          this.clusterStructureService::ondabesoForNa,
          _namedDatabaseId);
    }
  }


  private void _inbaindForGlCoAb(
      AbstractMultipleGdbDatabaseManager<DefaultStandaloneDatabaseContext> _abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext,
      Config _config, GlobalModule _globalModule) {
    if (ClusterCatchupNodeManager.isBapieaForCo(_config)) {

      FileSystemAbstraction _fFileSystemAbstraction = _globalModule.getFileSystem();

      LogProvider _itraLogProvider = _globalModule.getLogService().getInternalLogProvider();

      int largest = _config.get(SettingsDeclarationClusterImpl.settingStchiInteger);

      ClusterTxConfiguratorApproach _bspClusterTxConfiguratorApproach = ClusterTxConfiguratorApproach.craClusterTxConfiguratorApproach(
          _config);

      AdapterChannelHandlerServiceMGDBImpl _cshAdapterChannelHandlerServiceMGDBImpl = AdapterChannelHandlerServiceMGDBImpl
          .bapsehdAdapterChannelHandlerServiceMGDBImpl(
              _abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext,
              this.databaseStateService, _globalModule.getGlobalDependencies(),
              _fFileSystemAbstraction,
              largest,
              _itraLogProvider, _bspClusterTxConfiguratorApproach);

      ClusterAdapter _sbClusterAdapter = ClusterCatchupNodeManager.fatyClusterCatchupNodeManager(
              _globalModule, this.sslPolicyLoader)
          .crebusvClusterAdapter(_cshAdapterChannelHandlerServiceMGDBImpl,
              this.hpiCurrentProtocolStackManager);
      _globalModule.getGlobalLife().add(_sbClusterAdapter);
    }
  }


  private void _indieadchindForAbDe(
      AbstractMultipleGdbDatabaseManager<DefaultStandaloneDatabaseContext> _abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext,
      DefaultDbmsReconcilerLifecycleAdapter _mrDefaultDbmsReconcilerLifecycleAdapter) {
    if (EnterpriseClusterSettings.isCleeeForCo(this.globalModule.getGlobalConfig())) {
      this._cretlseeForDe(_mrDefaultDbmsReconcilerLifecycleAdapter);
      this._crechsrForAb(_abstractMultipleGdbDatabaseManagerMdDefaultStandaloneDatabaseContext);
    }
  }

  @Override
  public void bootstrapFabricServices() {
    this.abstractFabricServicesBootstrap.bootstrapServices();
  }

  @Override
  public BoltGraphDatabaseManagementServiceSPI createBoltDatabaseManagementServiceProvider(
      Dependencies _dependencies, DatabaseManagementService _databaseManagementService,
      Monitors _monitors, SystemNanoClock _systemNanoClock, LogService _logService) {

    BoltGraphDatabaseManagementServiceSPI _smdkBoltGraphDatabaseManagementServiceSPI =
        this.createBoltKernelDatabaseManagementServiceProvider(_dependencies,
            _databaseManagementService, _monitors, _systemNanoClock, _logService);
    return this.abstractFabricServicesBootstrap.createBoltDatabaseManagementServiceProvider(
        _smdkBoltGraphDatabaseManagementServiceSPI,
        _databaseManagementService, _monitors, _systemNanoClock);
  }

  @Override
  public DatabaseManager<? extends StandaloneDatabaseContext> createDatabaseManager(
      GlobalModule _globalModule) {

    MultipleGdbDatabaseManagerEnterpriseImpl _multipleGdbDatabaseManagerEnterpriseImpl =
        new MultipleGdbDatabaseManagerEnterpriseImpl(this, _globalModule,
            this::_getpypiStructureMetaService);
    _globalModule.getGlobalLife().add(_multipleGdbDatabaseManagerEnterpriseImpl);
    _globalModule.getGlobalDependencies()
        .satisfyDependency(_multipleGdbDatabaseManagerEnterpriseImpl);
    this.mrDefaultDbmsReconcilerLifecycleAdapter =
        new DefaultDbmsReconcilerLifecycleAdapter(_multipleGdbDatabaseManagerEnterpriseImpl,
            this.defaultSystemGraphDbmsModel, _globalModule,
            this.healthMonitorService, this.mediationDbmsManagers,
            this.ttrReconciledTransactionTracker);
    this.databaseStateService = this.mrDefaultDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl();
    this.asdDatabaseStartupControllerAbortableImpl =
        new DatabaseStartupControllerAbortableImpl(_globalModule.getGlobalClock(),
            this.defaultSystemGraphDbmsModel,
            _globalModule.getGlobalAvailabilityGuard(), Duration.ofSeconds(5L));
    _globalModule.getGlobalLife().add(this.mrDefaultDbmsReconcilerLifecycleAdapter);
    _globalModule.getGlobalDependencies().satisfyDependency(this.ttrReconciledTransactionTracker);
    this._credbmardnmeForAbDe(_multipleGdbDatabaseManagerEnterpriseImpl,
        this.mrDefaultDbmsReconcilerLifecycleAdapter);
    this.abstractMultipleGdbDatabaseManagerMdObject = _multipleGdbDatabaseManagerEnterpriseImpl;
    return _multipleGdbDatabaseManagerEnterpriseImpl;
  }

  @Override
  public void createDefaultDatabaseResolver(GlobalModule _globalModule) {

    EnhancedDefaultDatabaseResolver _enhancedDefaultDatabaseResolver = EnterpriseModule.madetdbreeEnhancedDefaultDatabaseResolver(
        _globalModule);
    _globalModule.getTransactionEventListeners()
        .registerTransactionEventListener(io.github.onograph.TokenConstants.SYSTEM,
            _enhancedDefaultDatabaseResolver);
    this.setDefaultDatabaseResolver(_enhancedDefaultDatabaseResolver);
  }

  @Override
  protected AbstractRoutingProcedureInstaller createRoutingProcedureInstaller(
      GlobalModule _globalModule, DatabaseManager<?> _databaseManagerDmObject,
      ClientRoutingDomainChecker _clientRoutingDomainChecker) {

    Config _config = _globalModule.getGlobalConfig();

    ConnectorPortRegister _connectorPortRegister = _globalModule.getConnectorPortRegister();

    LogProvider _logProvider = _globalModule.getLogService().getInternalLogProvider();
    if (EnterpriseClusterSettings.isCleeeForCo(_config)) {
      return new DefaultRoutingProcedureInstaller(_clientRoutingDomainChecker,
          this.clusterStructureService, _config,
          _connectorPortRegister, _databaseManagerDmObject, _logProvider);
    } else {

      EnterpriseFabricConfiguration _enterpriseFabricConfiguration = this.dependencies.resolveDependency(
          EnterpriseFabricConfiguration.class);

      FabricDatabaseManager _fabricDatabaseManager = this.dependencies.resolveDependency(
          FabricDatabaseManager.class);
      return new RoutingProcedureInstaller(_clientRoutingDomainChecker, _config,
          _connectorPortRegister, _databaseManagerDmObject,
          _enterpriseFabricConfiguration, _fabricDatabaseManager,
          _logProvider);
    }
  }

  @Override
  protected ConstraintSemantics createSchemaRuleVerifier() {
    return new ConstraintSemanticsEnterpriseImpl();
  }

  @Override
  public void createSecurityModule(GlobalModule _globalModule) {
    this.setSecurityProvider(
        EnterpriseModule.maenrsetmuSecurityProvider(this.defaultDatabaseResolver,
            this.defaultSecurityLog, _globalModule));
  }

  @Override
  protected Function<NamedDatabaseId, TokenHolders> createTokenHolderProvider(
      GlobalModule _pafrGlobalModule) {
    return (databaseId) ->
    {

      DatabaseManager<?> _databaseManagerMdObject =
          (DatabaseManager) _pafrGlobalModule.getGlobalDependencies()
              .resolveDependency(DatabaseManager.class);

      Supplier<Kernel> _supplierSkKernel = () ->
      {

        DatabaseContext _databaseContext = _databaseManagerMdObject.getDatabaseContext(databaseId)
            .orElseThrow(() ->
            {
              return new IllegalStateException(
                  "*** Error: 0ca24ff3-0c84-4161-b3c5-21a0ce80142a");
            });
        return (Kernel) _databaseContext.dependencies().resolveDependency(Kernel.class);
      };
      return new TokenHolders(
          new DelegatingTokenHolder(createPropertyKeyCreator(_supplierSkKernel),
              io.github.onograph.TokenConstants.PROPERTY_KEY),
          new DelegatingTokenHolder(createLabelIdCreator(_supplierSkKernel),
              io.github.onograph.TokenConstants.LABEL),
          new DelegatingTokenHolder(createRelationshipTypeCreator(_supplierSkKernel),
              io.github.onograph.TokenConstants.RELATIONSHIP_TYPE2));
    };
  }

  @Override
  public Lifecycle createWebServer(DatabaseManagementService _databaseManagementService,
      Dependencies _goaDependencies, Config _config, LogProvider _uLogProvider,
      DbmsInfo _dbmsInfo) {
    return new NeoWebServerEnterpriseImpl(_config, _databaseManagementService, _dbmsInfo,
        _goaDependencies, this.globalModule.getMemoryPools(),
        _uLogProvider);
  }

  @Override
  protected Predicate<String> fileWatcherFileNameFilter() {
    return Predicates.any(TransactionLogFilesHelper.DEFAULT_FILENAME_PREDICATE, (filename) ->
    {
      return filename.endsWith(io.github.onograph.TokenConstants.__CACHEPROF);
    });
  }

  @Override
  public AuthManager getBoltAuthManager(DependencyResolver _dependencyResolver) {

    AuthManager _authManager = super.getBoltAuthManager(_dependencyResolver);

    FabricDatabaseManager _fabricDatabaseManager = _dependencyResolver.resolveDependency(
        FabricDatabaseManager.class);
    if (!_fabricDatabaseManager.isFabricDatabasePresent()) {
      return _authManager;
    } else if (!(_authManager instanceof DefaultAuthManager)) {

      throw new IllegalStateException("*** Error: a2b151ad-ba34-40f2-82b8-8d5621e0caf3");
    } else {
      return new AuthManagerFabricImpl((DefaultAuthManager) _authManager);
    }
  }

  @Override
  public DatabaseStartupController getDatabaseStartupController() {
    return this.asdDatabaseStartupControllerAbortableImpl;
  }

  @Override
  public QueryEngineProvider getQueryEngineProvider() {
    return new EnhancedCypherEngineProvider();
  }

  @Override
  public void registerEditionSpecificProcedures(GlobalProcedures _globalProcedures,
      DatabaseManager<?> _databaseManagerMdObject) throws KernelException {
    (new DefaultProcedureManagerServiceImpl(this.clusterStructureService, _databaseManagerMdObject,
        this.globalModule, _globalProcedures,
        this.hpiCurrentProtocolStackManager, this.standaloneIdentityModule,
        this.mrDefaultDbmsReconcilerLifecycleAdapter,
        this.mediationDbmsManagers.getOqDbmsManagerWatchTagImpl(), this.remoteMetaService)).reie();
    this.abstractFabricServicesBootstrap.retporForGl(_globalProcedures);
  }

  @Override
  public void registerSystemGraphComponents(SystemGraphComponents _systemGraphComponents,
      GlobalModule _globalModule) {

    FabricDatabaseManager _fabricDatabaseManager = this.dependencies.resolveDependency(
        FabricDatabaseManager.class);

    SystemGraphComponentEnterpriseFabricImpl _systemGraphComponentEnterpriseFabricImpl =
        new SystemGraphComponentEnterpriseFabricImpl(_globalModule.getGlobalConfig(),
            _fabricDatabaseManager);
    _systemGraphComponents.register(_systemGraphComponentEnterpriseFabricImpl);
    this.retscycosForSyGlDe(this.defaultSecurityLog, _globalModule, _systemGraphComponents);
  }
}
