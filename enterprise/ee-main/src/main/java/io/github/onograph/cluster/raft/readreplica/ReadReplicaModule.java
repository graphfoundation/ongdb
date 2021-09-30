package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderDistributedImpl;
import io.github.onograph.cluster.raft.module.cuprot.AdapterChannelHandlerServiceMGDBImpl;
import io.github.onograph.cluster.raft.module.cuprot.CatchupManagerCoordinator;
import io.github.onograph.cluster.raft.module.cuprot.ClusterCatchupNodeManager;
import io.github.onograph.cluster.raft.module.cuprot.ClusteredGdbManager;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter;
import io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl;
import io.github.onograph.cluster.raft.netty.ClusterAdapter;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaAsyncTransactionAdapter;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.shared.AbstractClusterModule;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import io.github.onograph.cluster.raft.shared.ClusterTxConfiguratorApproach;
import io.github.onograph.cluster.raft.watch.PerformanceTrackingLifecycleAdapter;
import io.github.onograph.config.MemberNodeServiceFinder;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.dbms.ClusteredDbmsReconcilerLifecycleAdapter;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.GdbReplicator;
import io.github.onograph.dbms.MetaUpgradeFlowActionStagingImpl;
import io.github.onograph.dbms.SystemDbOnlyGdbReplicator;
import io.github.onograph.dbms.SystemGraphComponentEnterpriseImpl;
import io.github.onograph.dbms.crash.CrashManager;
import io.github.onograph.dbms.crash.CrashManagerImpl;
import io.github.onograph.dbms.crash.GdbCrashGenerator;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import io.github.onograph.fabric.bootstrap.AbstractFabricServicesBootstrap;
import io.github.onograph.module.edition.EnterpriseModule;
import io.github.onograph.procedure.builtin.DocumentedAllowedConfigs;
import io.github.onograph.server.NeoWebServerEnterpriseImpl;
import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.systemgraph.EnhancedDefaultDatabaseResolver;
import java.nio.file.Path;
import java.time.Duration;
import org.neo4j.bolt.dbapi.BoltGraphDatabaseManagementServiceSPI;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.cypher.internal.javacompat.EnhancedCypherEngineProvider;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphComponents;
import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.context.EditionDatabaseComponents;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.kernel.impl.query.QueryEngineProvider;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.procedure.builtin.routing.RoutingOption;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.config.SslPolicyLoader;
import org.neo4j.time.SystemNanoClock;


public class ReadReplicaModule extends AbstractClusterModule implements EnterpriseModule {


  protected final LogProvider logProvider;


  private final AbstractFabricServicesBootstrap abstractFabricServicesBootstrap;


  private final CatchupManagerCoordinator catchupManagerCoordinator;


  private final CrashManager crashManager;


  private final DefaultSecurityLog defaultSecurityLog;


  private final ClusterSimpleStorageFacade fsClusterSimpleStorageFacade;


  private final ClusterDiscoveryManager fsdClusterDiscoveryManager;


  private final GlobalModule globalModule;


  private final Config goaConfig;


  private final IdentityModuleReadReplicaNodeImpl identityModuleReadReplicaNodeImpl;


  private final CurrentProtocolStackManager iphCurrentProtocolStackManager;


  private final JobScheduler jobScheduler;


  private final ClusterMetaTopologyInfo lscClusterMetaTopologyInfo;


  private final SslPolicyLoader sslPolicyLoader;


  private ClusterStructureService clusterStructureService;


  private DatabaseStartupControllerAbortableImpl dsaDatabaseStartupControllerAbortableImpl;


  private ClusterReadReplicaGdbManager fdrrClusterReadReplicaGdbManager;


  private ClusteredDbmsReconcilerLifecycleAdapter mrClusteredDbmsReconcilerLifecycleAdapter;


  private ClusterLeader slClusterLeader;


  public ReadReplicaModule(ClusterDiscoveryManager _fsdClusterDiscoveryManager,
      GlobalModule _globalModule) {
    super(_globalModule);
    this.globalModule = _globalModule;
    this.fsdClusterDiscoveryManager = _fsdClusterDiscoveryManager;

    LogService _logService = _globalModule.getLogService();
    this.goaConfig = _globalModule.getGlobalConfig();
    this.logProvider = _logService.getInternalLogProvider();
    this.jobScheduler = _globalModule.getJobScheduler();
    this.jobScheduler.setParallelism(Group.STORE_COPY_CLIENT,
        this.goaConfig.get(SettingsDeclarationClusterImpl.settingStcaeInteger));

    Dependencies _goaDependencies = _globalModule.getGlobalDependencies();

    DocumentedAllowedConfigs _lwsDocumentedAllowedConfigs = new DocumentedAllowedConfigs(
        this.goaConfig);
    _goaDependencies.satisfyDependency(_lwsDocumentedAllowedConfigs);
    this.crashManager = new CrashManagerImpl(
        GdbCrashGenerator.bulfoGdbCrashGenerator(this.goaConfig, _logService), this.jobScheduler,
        _logService);
    _goaDependencies.satisfyDependencies(this.crashManager);
    this.watcherServiceFactory = (layout) ->
    {
      return this.createDatabaseFileSystemWatcher(_globalModule.getFileWatcher(), layout,
          _logService, fiwarfnfiPredicate());
    };
    this.sslPolicyLoader = SslPolicyLoader.create(this.goaConfig, this.logProvider);
    _goaDependencies.satisfyDependency(this.sslPolicyLoader);
    this.catchupManagerCoordinator = CatchupManagerCoordinator.crechciCatchupManagerCoordinator(
        _globalModule, this.sslPolicyLoader);

    FileSystemAbstraction _fileSystemAbstraction = _globalModule.getFileSystem();

    Path _pscPath = this.goaConfig.get(SettingsDeclarationClusterImpl.settingCleteyPath);
    this.lscClusterMetaTopologyInfo = ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(_pscPath);
    this.fsClusterSimpleStorageFacade =
        new ClusterSimpleStorageFacade(this.goaConfig, _fileSystemAbstraction, this.logProvider,
            this.lscClusterMetaTopologyInfo,
            _globalModule.getOtherMemoryPool().getPoolMemoryTracker());

    MetaUpgradeFlowActionStagingImpl.LifecycleAdapterDefaultImpl _mmqLifecycleAdapterDefaultImpl =
        new MetaUpgradeFlowActionStagingImpl.LifecycleAdapterDefaultImpl(_fileSystemAbstraction,
            this.logProvider, this.lscClusterMetaTopologyInfo,
            _globalModule.getNeo4jLayout());
    _globalModule.getGlobalLife().add(_mmqLifecycleAdapterDefaultImpl);
    this.identityModuleReadReplicaNodeImpl = IdentityModuleReadReplicaNodeImpl.craIdentityModuleReadReplicaNodeImpl(
        this.logProvider);
    _goaDependencies.satisfyDependency(this.identityModuleReadReplicaNodeImpl);
    this.jobScheduler.setTopLevelGroupName(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.readreplica.ReadReplicaModule.setTopLevelGroupName",
            this.identityModuleReadReplicaNodeImpl.serverId()));
    this._adtrpmnsc();
    this.safeesoydniForGl(this.globalModule);
    this.edoiatForGlDe(_goaDependencies, _globalModule);
    this.defaultSecurityLog = new DefaultSecurityLog(_globalModule.getGlobalConfig(),
        _globalModule.getFileSystem());
    _globalModule.getGlobalLife().add(this.defaultSecurityLog);
    this.abstractFabricServicesBootstrap =
        new AbstractFabricServicesBootstrap.ReadReplicaClusterNode(this.defaultSecurityLog,
            _goaDependencies, _globalModule.getGlobalLife(),
            _logService);
    this.iphCurrentProtocolStackManager = new CurrentProtocolStackManager();
  }


  private void _adtrpmnsc() {
    this.jobScheduler.setParallelism(Group.THROUGHPUT_MONITOR, 1);

    Duration _wtDuration = this.globalModule.getGlobalConfig()
        .get(SettingsDeclarationClusterImpl.settingStsutoDuration);

    PerformanceTrackingLifecycleAdapter _smtPerformanceTrackingLifecycleAdapter =
        new PerformanceTrackingLifecycleAdapter(this.globalModule.getGlobalClock(),
            this.jobScheduler, this.logProvider, _wtDuration);
    this.globalModule.getGlobalLife().add(_smtPerformanceTrackingLifecycleAdapter);
    this.globalModule.getGlobalDependencies()
        .satisfyDependencies(_smtPerformanceTrackingLifecycleAdapter);
  }


  private void _credbmardnmeForRe(
      ReadReplicaClusteredMultipleGdbDatabaseManager _readReplicaClusteredMultipleGdbDatabaseManager) {

    SystemDbOnlyGdbReplicator _sedSystemDbOnlyGdbReplicator = new SystemDbOnlyGdbReplicator(
        this.logProvider);

    LifeSupport _lgLifeSupport = this.globalModule.getGlobalLife();

    LogService _goaLogService = this.globalModule.getLogService();

    FileSystemAbstraction _fileSystemAbstraction = this.globalModule.getFileSystem();

    Dependencies _dependencies = this.globalModule.getGlobalDependencies();
    _dependencies.satisfyDependency(this.recttcReconciledTransactionTracker);
    _dependencies.satisfyDependencies(_sedSystemDbOnlyGdbReplicator);
    this.mrClusteredDbmsReconcilerLifecycleAdapter =
        new ClusteredDbmsReconcilerLifecycleAdapter(_readReplicaClusteredMultipleGdbDatabaseManager,
            this.fsClusterSimpleStorageFacade,
            this.globalModule, this.healthMonitorService, this.recotClusteringMediationDbmsManagers,
            _sedSystemDbOnlyGdbReplicator,
            this.systemGraphDbmsModelClusterImpl, this.recttcReconciledTransactionTracker);
    this.clusterStructureService =
        this._cretlseeClusterStructureService(
            this.mrClusteredDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl(),
            _goaLogService);
    this.mrClusteredDbmsReconcilerLifecycleAdapter.retdtesecglsrForDa(this.clusterStructureService);
    _lgLifeSupport.add(_dependencies.satisfyDependency(this.clusterStructureService));
    this.slClusterLeader = new ClusterLeaderDistributedImpl(this.clusterStructureService,
        this.logProvider);
    _dependencies.satisfyDependency(this.slClusterLeader);

    int largest = this.goaConfig.get(SettingsDeclarationClusterImpl.settingStchiInteger);

    AdapterChannelHandlerServiceMGDBImpl _hscAdapterChannelHandlerServiceMGDBImpl = AdapterChannelHandlerServiceMGDBImpl
        .causvhnAdapterChannelHandlerServiceMGDBImpl(
            _readReplicaClusteredMultipleGdbDatabaseManager,
            this.mrClusteredDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl(),
            this.globalModule.getGlobalDependencies(), _fileSystemAbstraction, largest,
            this.logProvider);

    ClusterTxConfiguratorApproach _sstbClusterTxConfiguratorApproach = ClusterTxConfiguratorApproach.craClusterTxConfiguratorApproach(
        this.goaConfig);

    AdapterChannelHandlerServiceMGDBImpl _hsbAdapterChannelHandlerServiceMGDBImpl = AdapterChannelHandlerServiceMGDBImpl
        .bapsehdAdapterChannelHandlerServiceMGDBImpl(
            _readReplicaClusteredMultipleGdbDatabaseManager,
            this.mrClusteredDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl(),
            this.globalModule.getGlobalDependencies(), _fileSystemAbstraction, largest,
            this.logProvider, _sstbClusterTxConfiguratorApproach);

    ClusterCatchupNodeManager clusterCatchupNodeManager =
        ClusterCatchupNodeManager.fatyClusterCatchupNodeManager(this.globalModule,
            this.sslPolicyLoader);

    ClusterAdapter _scClusterAdapter =
        clusterCatchupNodeManager.crechsrClusterAdapter(this.iphCurrentProtocolStackManager,
            _hscAdapterChannelHandlerServiceMGDBImpl);
    _lgLifeSupport.add(_scClusterAdapter);

    ReadReplicaAsyncTransactionAdapter readReplicaAsyncTransactionAdapter = new ReadReplicaAsyncTransactionAdapter(
        this.jobScheduler, this.logProvider);
    _lgLifeSupport.add(readReplicaAsyncTransactionAdapter);
    if (ClusterCatchupNodeManager.isBapieaForCo(this.goaConfig)) {

      ClusterAdapter _sbClusterAdapter =
          clusterCatchupNodeManager.crebusvClusterAdapter(_hsbAdapterChannelHandlerServiceMGDBImpl,
              this.iphCurrentProtocolStackManager);
      _lgLifeSupport.add(_sbClusterAdapter);
    }

    _lgLifeSupport.add(this.mrClusteredDbmsReconcilerLifecycleAdapter);
    this.dsaDatabaseStartupControllerAbortableImpl =
        new DatabaseStartupControllerAbortableImpl(this.globalModule.getGlobalClock(),
            this.systemGraphDbmsModelClusterImpl,
            this.globalModule.getGlobalAvailabilityGuard(),
            Duration.ofSeconds(5L));

    PageCache _pageCache = this.globalModule.getPageCache();

    SyncRecoveryLifecycleAdapter _rscSyncRecoveryLifecycleAdapter = _lgLifeSupport
        .add(new SyncRecoveryLifecycleAdapter(new DatabaseTracers(this.globalModule.getTracers()),
            _fileSystemAbstraction,
            this.globalModule.getOtherMemoryPool().getPoolMemoryTracker(), _pageCache));

    CatchupClusteredGdbManageService catchupClusteredGdbManageService =
        new CatchupClusteredGdbManageService(_fileSystemAbstraction, this.logProvider, _pageCache,
            _rscSyncRecoveryLifecycleAdapter,
            ClusteredGdbManager.crertsrClusteredGdb(this.catchupManagerCoordinator
                    .stcclStoreService(),
                this.globalModule,
                this.catchupManagerCoordinator
                    .txpuceTransactionSyncManager()));
    this.fdrrClusterReadReplicaGdbManager =
        new ClusterReadReplicaGdbManager(
            this.dsaDatabaseStartupControllerAbortableImpl,
            catchupClusteredGdbManageService, this.globalModule.getGlobalClock(),
            this.clusterStructureService, this.goaConfig,
            this.catchupManagerCoordinator.txpuceTransactionSyncManager(), this.crashManager,
            this.fsClusterSimpleStorageFacade, this.jobScheduler,
            this.systemGraphDbmsModelClusterImpl,
            this.globalModule.getTracers().getPageCacheTracer(), readReplicaAsyncTransactionAdapter,
            _sedSystemDbOnlyGdbReplicator, this.identityModuleReadReplicaNodeImpl.serverId());
  }


  private ClusterStructureService _cretlseeClusterStructureService(
      DatabaseStateService _databaseStateService, LogService _logService) {

    MemberNodeService _rhMemberNodeService = MemberNodeServiceFinder.choroeMemberNodeService(
        this.goaConfig, _logService);
    return this.fsdClusterDiscoveryManager
        .rereatlseeClusterStructureService(this.globalModule.getGlobalClock(), this.goaConfig,
            _databaseStateService, this.jobScheduler,
            this.logProvider,
            _rhMemberNodeService, GdbServerPointInTimeImpl::rrsnstGdbServerPointInTimeImpl,
            this.identityModuleReadReplicaNodeImpl,
            this.sslPolicyLoader);
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
        super.createBoltDatabaseManagementServiceProvider(_dependencies, _databaseManagementService,
            _monitors, _systemNanoClock, _logService);
    return this.abstractFabricServicesBootstrap.createBoltDatabaseManagementServiceProvider(
        _smdkBoltGraphDatabaseManagementServiceSPI,
        _databaseManagementService, _monitors, _systemNanoClock);
  }

  @Override
  public EditionDatabaseComponents createDatabaseComponents(NamedDatabaseId _namedDatabaseId) {
    return new EditionDatabaseComponentsReadReplicaClusterGdbImpl(this, this.globalModule,
        _namedDatabaseId);
  }

  @Override
  public DatabaseManager<EnterpriseClusterDbContext> createDatabaseManager(
      GlobalModule _globalModule) {

    PageCache _pageCache = _globalModule.getPageCache();

    FileSystemAbstraction _fileSystemAbstraction = _globalModule.getFileSystem();

    ReadReplicaClusteredMultipleGdbDatabaseManager _readReplicaClusteredMultipleGdbDatabaseManager =
        new ReadReplicaClusteredMultipleGdbDatabaseManager(this.goaConfig, this,
            _fileSystemAbstraction, _globalModule, this.logProvider,
            this.lscClusterMetaTopologyInfo,
            this.recotClusteringMediationDbmsManagers, _pageCache);
    _globalModule.getGlobalLife().add(_readReplicaClusteredMultipleGdbDatabaseManager);
    _globalModule.getGlobalDependencies()
        .satisfyDependency(_readReplicaClusteredMultipleGdbDatabaseManager);
    this.abstractMultipleGdbDatabaseManagerDaamnObject = _readReplicaClusteredMultipleGdbDatabaseManager;
    this._credbmardnmeForRe(_readReplicaClusteredMultipleGdbDatabaseManager);
    return _readReplicaClusteredMultipleGdbDatabaseManager;
  }

  @Override
  public void createDefaultDatabaseResolver(GlobalModule _globalModule) {

    EnhancedDefaultDatabaseResolver _enhancedDefaultDatabaseResolver = EnterpriseModule.madetdbreeEnhancedDefaultDatabaseResolver(
        _globalModule);

    GdbReplicator _sedrGdbReplicator =
        _globalModule.getGlobalDependencies().resolveDependency(GdbReplicator.class);
    _sedrGdbReplicator.retlsrForNaGd(_enhancedDefaultDatabaseResolver,
        DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
    this.setDefaultDatabaseResolver(_enhancedDefaultDatabaseResolver);
  }

  @Override
  protected AbstractRoutingProcedureInstaller createRoutingProcedureInstaller(
      GlobalModule _globalModule, DatabaseManager<?> _databaseManagerMdObject,
      ClientRoutingDomainChecker _clientRoutingDomainChecker) {

    ConnectorPortRegister _connectorPortRegister = _globalModule.getConnectorPortRegister();

    Config _config = _globalModule.getGlobalConfig();

    LogProvider _logProvider = _globalModule.getLogService().getInternalLogProvider();

    Boolean _isEr = _config.get(GraphDatabaseSettings.routing_enabled);

    RoutingOption _routingOption =
        _isEr ? RoutingOption.ROUTE_WRITE_AND_READ : RoutingOption.ROUTE_AND_READ_ONLY;
    return new ReadReplicaClusterSingleInstanceRoutingProcedureInstaller(
        _clientRoutingDomainChecker, this.clusterStructureService, _config, _connectorPortRegister,
        _databaseManagerMdObject, _logProvider,
        _routingOption, this.slClusterLeader);
  }

  @Override
  public void createSecurityModule(GlobalModule _globalModule) {
    this.setSecurityProvider(
        EnterpriseModule.maenrsetmuSecurityProvider(this.defaultDatabaseResolver,
            this.defaultSecurityLog, _globalModule));
  }

  @Override
  public Lifecycle createWebServer(DatabaseManagementService _databaseManagementService,
      Dependencies _goaDependencies, Config _config, LogProvider _usLogProvider,
      DbmsInfo _dbmsInfo) {
    return new NeoWebServerEnterpriseImpl(_config, _databaseManagementService, _dbmsInfo,
        _goaDependencies, this.globalModule.getMemoryPools(),
        _usLogProvider);
  }

  @Override
  public DatabaseStartupController getDatabaseStartupController() {
    return this.dsaDatabaseStartupControllerAbortableImpl;
  }


  ClusterReadReplicaGdbManager getFdrrClusterReadReplicaGdbManager() {
    return this.fdrrClusterReadReplicaGdbManager;
  }

  @Override
  public QueryEngineProvider getQueryEngineProvider() {
    return new EnhancedCypherEngineProvider();
  }

  @Override
  public void registerEditionSpecificProcedures(GlobalProcedures _globalProcedures,
      DatabaseManager<?> _databaseManagerMdObject) throws KernelException {
    (new ReadReplicaProcedureManagerService(this.clusterStructureService, _databaseManagerMdObject,
        this.globalModule, _globalProcedures,
        this.identityModuleReadReplicaNodeImpl,
        this.iphCurrentProtocolStackManager, this.mrClusteredDbmsReconcilerLifecycleAdapter,
        this.recotClusteringMediationDbmsManagers.getOqDbmsManagerWatchTagImpl(),
        this.catchupManagerCoordinator.reeictRemoteMetaService())).reie();
  }

  @Override
  public void registerSystemGraphComponents(SystemGraphComponents _systemGraphComponents,
      GlobalModule _globalModule) {

    SystemGraphComponentEnterpriseImpl _systemGraphComponentEnterpriseImpl = new SystemGraphComponentEnterpriseImpl(
        _globalModule.getGlobalConfig());
    _systemGraphComponents.register(_systemGraphComponentEnterpriseImpl);
    this.retscycosForSyGlDe(this.defaultSecurityLog, _globalModule, _systemGraphComponents);
  }
}
