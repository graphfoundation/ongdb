package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.akkamsg.ConsensusNettyChannelPoolLifecycleAdapter;
import io.github.onograph.cluster.raft.akkamsg.ConsensusOutDirectionMessageProcessor;
import io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder;
import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService;
import io.github.onograph.cluster.raft.akkamsg.serialization.current.CurrentMessageProcessorImpl;
import io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder;
import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.CPFProComFamilyProvider;
import io.github.onograph.cluster.raft.control.MutableProtocols;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.NettyChannelInitializerClientImpl;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ClientNettyChannelInitializer;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerMutableImpl;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderImpl;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.id.CoreNodeClusterIdentModImpl;
import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogService;
import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl;
import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceNOOPImpl;
import io.github.onograph.cluster.raft.module.cuprot.AdapterChannelHandlerServiceMGDBImpl;
import io.github.onograph.cluster.raft.module.cuprot.CatchupManagerCoordinator;
import io.github.onograph.cluster.raft.module.cuprot.ClusterCatchupNodeManager;
import io.github.onograph.cluster.raft.module.cuprot.ClusteredGdbManager;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.ClusteredGdb;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter;
import io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker;
import io.github.onograph.cluster.raft.netty.ClusterAdapter;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.share.calg.ConsensusClientConfigurator;
import io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder;
import io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper;
import io.github.onograph.cluster.raft.share.calg.nltof.NodeMemberFinderDefaultImpl;
import io.github.onograph.cluster.raft.share.meta.ClusterDiscoveryService;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta;
import io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer;
import io.github.onograph.cluster.raft.share.meta.cm.ClusterMetaSyncManager;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import io.github.onograph.cluster.raft.shared.AbstractClusterModule;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import io.github.onograph.cluster.raft.shared.ClusterTxConfiguratorApproach;
import io.github.onograph.cluster.raft.watch.ConsensusServiceWatcherRAFTImpl;
import io.github.onograph.cluster.raft.watch.DiagnosticsProviderClusterStructureImpl;
import io.github.onograph.cluster.raft.watch.PerformanceTrackingLifecycleAdapter;
import io.github.onograph.config.NodeGroupIdentifierSetSupplier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
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
import io.netty.channel.socket.SocketChannel;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.neo4j.bolt.dbapi.BoltGraphDatabaseManagementServiceSPI;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.cypher.internal.javacompat.EnhancedCypherEngineProvider;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphComponents;
import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.context.EditionDatabaseComponents;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.Neo4jLayout;
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
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.kernel.recovery.Recovery;
import org.neo4j.kernel.recovery.RecoveryFacade;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.config.SslPolicyLoader;
import org.neo4j.time.SystemNanoClock;


public class CoreModule extends AbstractClusterModule implements EnterpriseModule {


  private final AbstractFabricServicesBootstrap abstractFabricServicesBootstrap;


  private final CatchupManagerCoordinator catchupManagerCoordinator;


  private final Collection<MutatingCurrentActiveComProFamilyWrapper> collectionPmsMutatingCurrentActiveComProFamilyWrapper;


  private final CrashManager crashManager;


  private final DefaultSecurityLog defaultSecurityLog;


  private final GdbUtilWrapperServiceImpl fdtGdbUtilWrapperServiceImpl;


  private final ClusterSimpleStorageFacade fsClusterSimpleStorageFacade;


  private final ClusterDiscoveryManager fsdClusterDiscoveryManager;


  private final GlobalModule globalModule;


  private final Config goaConfig;


  private final CurrentProtocolStackManager hpisCurrentProtocolStackManager;


  private final CoreNodeClusterIdentModImpl imCoreNodeClusterIdentModImpl;


  private final LogProvider logProvider;


  private final ClusterMetaTopologyInfo lscClusterMetaTopologyInfo;


  private final ApplicationCurrentActiveComProFamilyWrapper prsApplicationCurrentActiveComProFamilyWrapper;


  private final ConsensusOutDirectionMessageProcessor rsConsensusOutDirectionMessageProcessor;


  private final ConsensusCommandReaderFactoryProvider sfrcConsensusCommandReaderFactoryProvider;


  private final NodeGroupIdentifierSetSupplier sgsNodeGroupIdentifierSetSupplier;


  private final SslPolicyLoader sslPolicyLoader;


  private final Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> supplierPicStream;


  private DatabaseStartupControllerAbortableImpl asdDatabaseStartupControllerAbortableImpl;


  private ClusterCoreGdbManager fdcClusterCoreGdbManager;


  private ClusteredDbmsReconcilerLifecycleAdapter mrClusteredDbmsReconcilerLifecycleAdapter;


  private ClusterLeader slClusterLeader;


  private CoreClusterStructureService stCoreClusterStructureService;


  public CoreModule(ClusterDiscoveryManager _fsdClusterDiscoveryManager,
      GlobalModule _globalModule) {
    super(_globalModule);

    Dependencies _goaDependencies = _globalModule.getGlobalDependencies();

    LogService _logService = _globalModule.getLogService();

    LifeSupport _lgLifeSupport = _globalModule.getGlobalLife();
    this.globalModule = _globalModule;
    this.goaConfig = _globalModule.getGlobalConfig();
    this.logProvider = _logService.getInternalLogProvider();

    DocumentedAllowedConfigs _lwsDocumentedAllowedConfigs = new DocumentedAllowedConfigs(
        this.goaConfig);
    _goaDependencies.satisfyDependency(_lwsDocumentedAllowedConfigs);
    this.sgsNodeGroupIdentifierSetSupplier = NodeGroupIdentifierSetSupplier.litNodeGroupIdentifierSetSupplier(
        this.goaConfig);
    ConsensusServiceWatcherRAFTImpl.reieForLoMoCl(_globalModule.getGlobalClock(), _logService,
        _globalModule.getGlobalMonitors());

    FileSystemAbstraction _fileSystemAbstraction = _globalModule.getFileSystem();

    MemoryTracker _memoryTracker = _globalModule.getOtherMemoryPool().getPoolMemoryTracker();

    Path _pscPath = this.goaConfig.get(SettingsDeclarationClusterImpl.settingCleteyPath);
    this.lscClusterMetaTopologyInfo = ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(_pscPath);
    _goaDependencies.satisfyDependency(this.lscClusterMetaTopologyInfo);
    this.fsClusterSimpleStorageFacade =
        new ClusterSimpleStorageFacade(this.goaConfig, _fileSystemAbstraction, this.logProvider,
            this.lscClusterMetaTopologyInfo, _memoryTracker);

    ClusterMetaSyncManager clusterMetaSyncManager =
        _crectsamgrClusterMetaSyncManager(this.fsClusterSimpleStorageFacade, _globalModule,
            this.lscClusterMetaTopologyInfo, _memoryTracker);
    _lgLifeSupport.add(clusterMetaSyncManager);
    this.fdtGdbUtilWrapperServiceImpl = new GdbUtilWrapperServiceImpl(_globalModule.getFileSystem(),
        _globalModule.getPageCache());
    this.crashManager =
        new CrashManagerImpl(GdbCrashGenerator.bulfoGdbCrashGenerator(this.goaConfig, _logService),
            _globalModule.getJobScheduler(), _logService);
    _goaDependencies.satisfyDependencies(this.crashManager);
    this.watcherServiceFactory = (layout) ->
    {
      return this.createDatabaseFileSystemWatcher(_globalModule.getFileWatcher(), layout,
          _logService, fiwarfnfiPredicate());
    };
    this.imCoreNodeClusterIdentModImpl = _lgLifeSupport
        .add(new CoreNodeClusterIdentModImpl(_fileSystemAbstraction,
            this.fsClusterSimpleStorageFacade, this.logProvider, _memoryTracker,
            _globalModule.getNeo4jLayout()));
    _lgLifeSupport.add(LifecycleAdapter.onInit(() ->
    {

      _logService.getUserLog(CoreNodeClusterIdentModImpl.class)
          .info(io.github.onograph.I18N.format(
                  "io.github.onograph.cluster.raft.share.CoreModule.info"),
              this.imCoreNodeClusterIdentModImpl
                  .serverId().uuid());
    }));
    _goaDependencies.satisfyDependency(this.imCoreNodeClusterIdentModImpl);
    _lgLifeSupport.add(LifecycleAdapter.onInit(() ->
    {
      _globalModule.getJobScheduler().setTopLevelGroupName(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.CoreModule.setTopLevelGroupName",
          this.imCoreNodeClusterIdentModImpl.serverId()));
    }));
    this.fsdClusterDiscoveryManager = _fsdClusterDiscoveryManager;
    this.sslPolicyLoader = SslPolicyLoader.create(this.goaConfig, this.logProvider);
    _goaDependencies.satisfyDependency(this.sslPolicyLoader);
    this.catchupManagerCoordinator = CatchupManagerCoordinator.crechciCatchupManagerCoordinator(
        _globalModule, this.sslPolicyLoader);

    ProFamilyManagementService proFamilyManagementService = new ProFamilyManagementService(
        this.goaConfig, this.logProvider);
    this.prsApplicationCurrentActiveComProFamilyWrapper = proFamilyManagementService.surrapolApplicationCurrentActiveComProFamilyWrapper();
    this.collectionPmsMutatingCurrentActiveComProFamilyWrapper = proFamilyManagementService.surmoeptsList();
    this.sfrcConsensusCommandReaderFactoryProvider = ConsensusCommandReaderFactoryProvider.frmcngConsensusCommandReaderFactoryProvider(
        this.goaConfig);

    Config _config = _globalModule.getGlobalConfig();

    Integer _iCm = _config.get(SettingsDeclarationClusterImpl.settingMafnInteger);

    ConsensusNettyChannelPoolLifecycleAdapter _spcdrConsensusNettyChannelPoolLifecycleAdapter =
        this._burchlpscConsensusNettyChannelPoolLifecycleAdapter(_globalModule, _iCm);
    _lgLifeSupport.add(_spcdrConsensusNettyChannelPoolLifecycleAdapter);

    ConsensusNettyChannelPoolLifecycleAdapter _spccrConsensusNettyChannelPoolLifecycleAdapter =
        this._burchlpscConsensusNettyChannelPoolLifecycleAdapter(_globalModule, 1);
    _lgLifeSupport.add(_spccrConsensusNettyChannelPoolLifecycleAdapter);
    Objects.requireNonNull(_spcdrConsensusNettyChannelPoolLifecycleAdapter);

    Supplier _supplier = _spcdrConsensusNettyChannelPoolLifecycleAdapter::inlproStream;
    Objects.requireNonNull(_spccrConsensusNettyChannelPoolLifecycleAdapter);
    this.supplierPicStream = _conitdpoSupplier(_supplier,
        _spccrConsensusNettyChannelPoolLifecycleAdapter::inlproStream);
    this.hpisCurrentProtocolStackManager = new CurrentProtocolStackManager();
    this.rsConsensusOutDirectionMessageProcessor =
        new ConsensusOutDirectionMessageProcessor(this.logProvider,
            _spccrConsensusNettyChannelPoolLifecycleAdapter,
            _spcdrConsensusNettyChannelPoolLifecycleAdapter);
    this.safeesoydniForGl(this.globalModule);
    this.edoiatForGlDe(_goaDependencies, _globalModule);
    this.defaultSecurityLog = new DefaultSecurityLog(_globalModule.getGlobalConfig(),
        _globalModule.getFileSystem());
    _globalModule.getGlobalLife().add(this.defaultSecurityLog);
    this.abstractFabricServicesBootstrap =
        new AbstractFabricServicesBootstrap.CoreClusterNode(this.defaultSecurityLog,
            _goaDependencies, _lgLifeSupport, _logService);
    _sejbsdplmForGlCo(_globalModule, this.goaConfig);
  }


  private static Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> _conitdpoSupplier(
      Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> _supplierPooosStream,
      Supplier<Stream<Pair<SocketAddress, ComProFamilyWrapper>>> _supplierPooosStream2) {
    return () ->
    {
      return Stream.concat((Stream) _supplierPooosStream.get(),
          (Stream) _supplierPooosStream2.get());
    };
  }


  private static ClusterMetaSyncManager _crectsamgrClusterMetaSyncManager(
      ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade, GlobalModule _globalModule,
      ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo, MemoryTracker _memoryTracker) {

    FileSystemAbstraction _fFileSystemAbstraction = _globalModule.getFileSystem();

    LogProvider _logProvider = _globalModule.getLogService().getInternalLogProvider();

    Neo4jLayout _neo4jLayout = _globalModule.getNeo4jLayout();
    return ClusterMetaSyncManager.bulClusterMetaSyncManagerRequiresComponents()
        .asComponents(_lscClusterMetaTopologyInfo, _fsClusterSimpleStorageFacade,
            _fFileSystemAbstraction, _logProvider)
        .asVersioned(ClusterMetaFormat.CURT_CLUSTER_META_FORMAT)
        .wihseClusterMetaSyncManagerRequiresActionOrInit(new ClusterMetaFormat(1, 0),
            new ClearStaleClusterMeta())
        .wihseClusterMetaSyncManagerRequiresActionOrInit(new ClusterMetaFormat(1, 1),
            new ClusterMemberSyncer(_memoryTracker, _neo4jLayout))
        .wihseClusterMetaSyncManagerRequiresActionOrInit(new ClusterMetaFormat(1, 2),
            new MetaUpgradeFlowActionStagingImpl(_neo4jLayout))
        .bulClusterMetaSyncManager();
  }


  private static ConsensusMessageLogService<ConsensusNodeId> _crerlrConsensusMessageLogService(
      GlobalModule _globalModule) {

    Config _config = _globalModule.getGlobalConfig();

    Object _obLmr;
    if (_config.get(SettingsDeclarationClusterSystemImpl.settingRaeeeeBoolean)) {

      Path _plPath = _config.get(SettingsDeclarationClusterSystemImpl.settingRaeepPath);

      ConsensusMessageLogServiceDefaultImpl<ConsensusNodeId> _consensusMessageLogServiceDefaultImplLgeConsensusNodeId =
          new ConsensusMessageLogServiceDefaultImpl(_globalModule.getGlobalClock(),
              _globalModule.getFileSystem(), _plPath);
      _obLmr = _globalModule.getGlobalLife()
          .add(_consensusMessageLogServiceDefaultImplLgeConsensusNodeId);
    } else {
      _obLmr = new ConsensusMessageLogServiceNOOPImpl();
    }

    return (ConsensusMessageLogService) _obLmr;
  }


  private static void _sejbsdplmForGlCo(GlobalModule _globalModule, Config _goaConfig) {

    JobScheduler _jobScheduler = _globalModule.getJobScheduler();
    _jobScheduler.setParallelism(Group.CORE_STATE_APPLIER,
        _goaConfig.get(SettingsDeclarationClusterImpl.settingConlaeInteger));
    _jobScheduler.setParallelism(Group.RAFT_HANDLER,
        _goaConfig.get(SettingsDeclarationClusterImpl.settingRaarlsInteger));
    _jobScheduler.setParallelism(Group.STORE_COPY_CLIENT,
        _goaConfig.get(SettingsDeclarationClusterImpl.settingStcaeInteger));
  }


  private void _adtrpmnsc() {

    JobScheduler _jobScheduler = this.globalModule.getJobScheduler();
    _jobScheduler.setParallelism(Group.THROUGHPUT_MONITOR, 1);

    Duration _wtDuration = this.globalModule.getGlobalConfig()
        .get(SettingsDeclarationClusterImpl.settingStsutoDuration);

    PerformanceTrackingLifecycleAdapter _tmsPerformanceTrackingLifecycleAdapter =
        new PerformanceTrackingLifecycleAdapter(this.globalModule.getGlobalClock(), _jobScheduler,
            this.logProvider, _wtDuration);
    this.globalModule.getGlobalLife().add(_tmsPerformanceTrackingLifecycleAdapter);
    this.globalModule.getGlobalDependencies()
        .satisfyDependencies(_tmsPerformanceTrackingLifecycleAdapter);
  }


  private NettyChannelInitializerClientImpl _buctcniiiNettyChannelInitializerClientImpl(
      LogService _logService) {

    ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl =
        new ComProFamilyManagerAppImpl(ApplicationComProFamilyType.values(),
            this.prsApplicationCurrentActiveComProFamilyWrapper);

    ComProFamilyManagerMutableImpl _rpmComProFamilyManagerMutableImpl =
        new ComProFamilyManagerMutableImpl(MutableProtocols.values(),
            this.collectionPmsMutatingCurrentActiveComProFamilyWrapper);

    SslPolicy _sslPolicy = this._clespySslPolicy();

    PipelineBuilderManager _fbpnPipelineBuilderManager = new PipelineBuilderManager(_sslPolicy);

    CPFProComFamilyProvider<CPFConfigurator.CPFDirection.OutProcessor> _cPFProComFamilyProviderRipOutProcessor =
        new CPFProComFamilyProvider(this._crepoliList(_fbpnPipelineBuilderManager),
            MutatingProComClientManager.listAlciinlMutatingProComClientManager);

    Duration _thDuration = this.goaConfig.get(SettingsDeclarationClusterImpl.settingHahitDuration);

    ClientNettyChannelInitializer _ihClientNettyChannelInitializer =
        new ClientNettyChannelInitializer(_rpaComProFamilyManagerAppImpl,
            _rpmComProFamilyManagerMutableImpl, _cPFProComFamilyProviderRipOutProcessor,
            _fbpnPipelineBuilderManager, _thDuration, this.logProvider,
            _logService.getUserLogProvider());
    return new NettyChannelInitializerClientImpl(_ihClientNettyChannelInitializer,
        _fbpnPipelineBuilderManager, this.logProvider, _thDuration);
  }


  private ConsensusNettyChannelPoolLifecycleAdapter _burchlpscConsensusNettyChannelPoolLifecycleAdapter(
      GlobalModule _globalModule, int _iCm) {

    NettyChannelInitializerClientImpl _iccNettyChannelInitializerClientImpl =
        this._buctcniiiNettyChannelInitializerClientImpl(_globalModule.getLogService());

    NettyChannelClusterSettings<? extends SocketChannel> _nettyChannelClusterSettingsCbSocketChannel =
        NettyChannelClusterSettings.clecfNettyChannelClusterSettings(this.goaConfig);
    return new ConsensusNettyChannelPoolLifecycleAdapter(
        _globalModule.getCentralBufferMangerHolder().getNettyBufferAllocator(), _iCm,
        _globalModule.getJobScheduler(), this.logProvider,
        _nettyChannelClusterSettingsCbSocketChannel, _iccNettyChannelInitializerClientImpl);
  }


  private SslPolicy _clespySslPolicy() {
    return this.sslPolicyLoader.hasPolicyForSource(SslPolicyScope.CLUSTER)
        ? this.sslPolicyLoader.getPolicy(SslPolicyScope.CLUSTER) : null;
  }


  private Function<ApplicationComProFamilyType, Supplier<DepartingMessageManagerMessageToMessageEncoder>> _creceecFunction() {
    return (protocol) ->
    {
      return () ->
      {
        return new DepartingMessageManagerMessageToMessageEncoder(
            new SyncableDataEncodingService(protocol));
      };
    };
  }


  private void _crecsrForLiDaDaFi(DatabaseManager<?> _databaseManagerMdObject,
      DatabaseStateService _databaseStateService, FileSystemAbstraction _fileSystemAbstraction,
      LifeSupport _lifeSupport) {

    int largest = this.goaConfig.get(SettingsDeclarationClusterImpl.settingStchiInteger);

    AdapterChannelHandlerServiceMGDBImpl _hscAdapterChannelHandlerServiceMGDBImpl = AdapterChannelHandlerServiceMGDBImpl
        .causvhnAdapterChannelHandlerServiceMGDBImpl(_databaseManagerMdObject,
            _databaseStateService, this.globalModule.getGlobalDependencies(),
            _fileSystemAbstraction, largest,
            this.logProvider);

    ClusterTxConfiguratorApproach _sstbClusterTxConfiguratorApproach = ClusterTxConfiguratorApproach.craClusterTxConfiguratorApproach(
        this.goaConfig);

    AdapterChannelHandlerServiceMGDBImpl _hsbAdapterChannelHandlerServiceMGDBImpl = AdapterChannelHandlerServiceMGDBImpl
        .bapsehdAdapterChannelHandlerServiceMGDBImpl(_databaseManagerMdObject,
            _databaseStateService, this.globalModule.getGlobalDependencies(),
            _fileSystemAbstraction, largest,
            this.logProvider, _sstbClusterTxConfiguratorApproach);

    ClusterCatchupNodeManager clusterCatchupNodeManager =
        ClusterCatchupNodeManager.fatyClusterCatchupNodeManager(this.globalModule,
            this.sslPolicyLoader);

    ClusterAdapter _scClusterAdapter =
        clusterCatchupNodeManager.crechsrClusterAdapter(this.hpisCurrentProtocolStackManager,
            _hscAdapterChannelHandlerServiceMGDBImpl);
    _lifeSupport.add(_scClusterAdapter);
    this.globalModule.getGlobalDependencies().satisfyDependencies(_scClusterAdapter);
    if (ClusterCatchupNodeManager.isBapieaForCo(this.goaConfig)) {

      ClusterAdapter _sbClusterAdapter =
          clusterCatchupNodeManager.crebusvClusterAdapter(_hsbAdapterChannelHandlerServiceMGDBImpl,
              this.hpisCurrentProtocolStackManager);
      _lifeSupport.add(_sbClusterAdapter);
    }
  }


  private void _credbmardnmeForCo(
      CoreClusteredMultipleGdbDatabaseManager _coreClusteredMultipleGdbDatabaseManager) {

    SystemDbOnlyGdbReplicator _sedSystemDbOnlyGdbReplicator = new SystemDbOnlyGdbReplicator(
        this.logProvider);

    LifeSupport _glLifeSupport = this.globalModule.getGlobalLife();

    FileSystemAbstraction _fileSystemAbstraction = this.globalModule.getFileSystem();
    this.mrClusteredDbmsReconcilerLifecycleAdapter =
        new ClusteredDbmsReconcilerLifecycleAdapter(_coreClusteredMultipleGdbDatabaseManager,
            this.fsClusterSimpleStorageFacade, this.globalModule,
            this.healthMonitorService, this.recotClusteringMediationDbmsManagers,
            _sedSystemDbOnlyGdbReplicator,
            this.systemGraphDbmsModelClusterImpl, this.recttcReconciledTransactionTracker);
    this.asdDatabaseStartupControllerAbortableImpl =
        new DatabaseStartupControllerAbortableImpl(this.globalModule.getGlobalClock(),
            this.systemGraphDbmsModelClusterImpl,
            this.globalModule.getGlobalAvailabilityGuard(),
            Duration.ofSeconds(5L));

    Dependencies _dependencies = this.globalModule.getGlobalDependencies();
    _dependencies.satisfyDependencies(_sedSystemDbOnlyGdbReplicator);
    _dependencies.satisfyDependency(this.recttcReconciledTransactionTracker);
    this.stCoreClusterStructureService =
        this._cretlseeCoreClusterStructureService(
            this.mrClusteredDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl());
    _dependencies.satisfyDependency(
        new DiagnosticsProviderClusterStructureImpl(this.stCoreClusterStructureService));
    this.mrClusteredDbmsReconcilerLifecycleAdapter.retdtesecglsrForDa(
        this.stCoreClusterStructureService);
    this.slClusterLeader = new ClusterLeaderImpl(this.stCoreClusterStructureService,
        this.logProvider);
    _dependencies.satisfyDependencies(this.slClusterLeader);

    ConsensusMessageLogService<ConsensusNodeId> _consensusMessageLogServiceRlConsensusNodeId = _crerlrConsensusMessageLogService(
        this.globalModule);

    ConsensusIncomingMessageManager _rmdConsensusIncomingMessageManager =
        new ConsensusIncomingMessageManager(this.globalModule.getGlobalClock(), this.logProvider);

    MemoryTracker _togMemoryTracker = this.globalModule.getOtherMemoryPool().getPoolMemoryTracker();

    Duration _itlDuration = this.goaConfig.get(
        SettingsDeclarationClusterSystemImpl.settingLersnaDuration);

    Duration _btlDuration = this.goaConfig.get(
        SettingsDeclarationClusterSystemImpl.settingLersebfDuration);

    NodeMemberFinderDefaultImpl _rmNodeMemberFinderDefaultImpl =
        new NodeMemberFinderDefaultImpl(this.stCoreClusterStructureService,
            _coreClusteredMultipleGdbDatabaseManager);

    LeaderGatekeeper _stlLeaderGatekeeper =
        new LeaderGatekeeper(this.globalModule.getJobScheduler(), this.goaConfig, _itlDuration,
            _coreClusteredMultipleGdbDatabaseManager,
            _rmdConsensusIncomingMessageManager, this.imCoreNodeClusterIdentModImpl, _btlDuration,
            this.logProvider,
            this.globalModule.getGlobalClock(), this.slClusterLeader,
            this.sgsNodeGroupIdentifierSetSupplier,
            _rmNodeMemberFinderDefaultImpl,
            this.globalModule.getDbmsReadOnlyChecker());

    ConsensusNodeGroupWrapperBuilder _fgrConsensusNodeGroupWrapperBuilder =
        new ConsensusNodeGroupWrapperBuilder(this.fsClusterSimpleStorageFacade, (namedDatabaseId) ->
        {
          return ((ClusterLeaderImpl) this.slClusterLeader).cralteLeaderNodeEventHandlers(
              namedDatabaseId);
        }, this.globalModule, _togMemoryTracker, this.lscClusterMetaTopologyInfo,
            this.sgsNodeGroupIdentifierSetSupplier, _stlLeaderGatekeeper);

    PageCache _pageCache = this.globalModule.getPageCache();

    RecoveryFacade _recoveryFacade =
        Recovery.recoveryFacade(this.globalModule.getFileSystem(), _pageCache,
            this.globalModule.getTracers(), this.goaConfig, _togMemoryTracker);
    this._adtrpmnsc();

    SyncRecoveryLifecycleAdapter _rscSyncRecoveryLifecycleAdapter = this.globalModule.getGlobalLife()
        .add(new SyncRecoveryLifecycleAdapter(
            new DatabaseTracers(
                this.globalModule
                    .getTracers()),
            _fileSystemAbstraction,
            this.globalModule
                .getOtherMemoryPool()
                .getPoolMemoryTracker(), _pageCache));

    ClusteredGdb _srClusteredGdb =
        ClusteredGdbManager.crertsrClusteredGdb(this.catchupManagerCoordinator.stcclStoreService(),
            this.globalModule,
            this.catchupManagerCoordinator.txpuceTransactionSyncManager());

    CatchupClusteredGdbManageService catchupClusteredGdbManageService =
        new CatchupClusteredGdbManageService(_fileSystemAbstraction, this.logProvider, _pageCache,
            _rscSyncRecoveryLifecycleAdapter, _srClusteredGdb);
    this.fdcClusterCoreGdbManager =
        new ClusterCoreGdbManager(this.globalModule, this.crashManager,
            _coreClusteredMultipleGdbDatabaseManager, this.stCoreClusterStructureService,
            this.fsClusterSimpleStorageFacade,
            this.fdtGdbUtilWrapperServiceImpl, this.imCoreNodeClusterIdentModImpl,
            _fgrConsensusNodeGroupWrapperBuilder,
            _rmdConsensusIncomingMessageManager,
            this.catchupManagerCoordinator.snhdwdCoreGdbSyncManager(), _recoveryFacade,
            _consensusMessageLogServiceRlConsensusNodeId,
            this.rsConsensusOutDirectionMessageProcessor,
            _sedSystemDbOnlyGdbReplicator, this.systemGraphDbmsModelClusterImpl,
            this.asdDatabaseStartupControllerAbortableImpl,
            catchupClusteredGdbManageService);

    ClusterAdapterNodeBuilder _fsrClusterAdapterNodeBuilder =
        new ClusterAdapterNodeBuilder(
            this.collectionPmsMutatingCurrentActiveComProFamilyWrapper,
            _consensusMessageLogServiceRlConsensusNodeId,
            _coreClusteredMultipleGdbDatabaseManager.databaseIdRepository(), this.globalModule,
            this.prsApplicationCurrentActiveComProFamilyWrapper,
            new PipelineBuilderManager(this._clespySslPolicy()),
            this.sfrcConsensusCommandReaderFactoryProvider);

    ClusterAdapter _srClusterAdapter =
        _fsrClusterAdapterNodeBuilder.crersrClusterAdapter(_rmdConsensusIncomingMessageManager,
            this.hpisCurrentProtocolStackManager);
    this.globalModule.getGlobalDependencies().satisfyDependencies(_srClusterAdapter);
    _glLifeSupport.add(_srClusterAdapter);
    this._crecsrForLiDaDaFi(_coreClusteredMultipleGdbDatabaseManager,
        this.mrClusteredDbmsReconcilerLifecycleAdapter.getDatabaseStateServiceDefaultEnterpriseImpl(),
        _fileSystemAbstraction,
        _glLifeSupport);
    _glLifeSupport.add(this.mrClusteredDbmsReconcilerLifecycleAdapter);
    _glLifeSupport.add(_stlLeaderGatekeeper);
  }


  private List<io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFConfigurator.CPFDirection.OutProcessor, ?>> _crepoliList(
      PipelineBuilderManager _fbpnPipelineBuilderManager) {

    Function<ApplicationComProFamilyType, Supplier<DepartingMessageManagerMessageToMessageEncoder>> _functionCeas = this._creceecFunction();

    ConsensusClientConfigurator.CPFConfiguratorBuilder _fvCPFConfiguratorBuilder =
        new ConsensusClientConfigurator.CPFConfiguratorBuilder(_fbpnPipelineBuilderManager,
            this.logProvider, new CurrentMessageProcessorImpl(),
            CurrentDepartingMessageManagerMessageToByteEncoder::new,
            _functionCeas.apply(ApplicationComProFamilyType.RC), ApplicationComProFamilyType.RC);

    return List.of(_fvCPFConfiguratorBuilder);
  }


  private CoreClusterStructureService _cretlseeCoreClusterStructureService(
      DatabaseStateService _databaseStateService) {

    DefaultDiscoveryInitialProcChecker _dsfDefaultDiscoveryInitialProcChecker = new DefaultDiscoveryInitialProcChecker(
        this.lscClusterMetaTopologyInfo);

    ClusterDiscoveryService clusterDiscoveryService = new ClusterDiscoveryService(
        this.crashManager.paieCrashSignaler(), _databaseStateService,
        this.fsdClusterDiscoveryManager, this.globalModule, this.sslPolicyLoader);
    return clusterDiscoveryService.cotogsvCoreClusterStructureService(
        this.imCoreNodeClusterIdentModImpl, _dsfDefaultDiscoveryInitialProcChecker);
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

    throw new UnsupportedOperationException("*** Error:  a15dc13a-df15-49f5-9270-7b82e04dbeb8");
  }

  @Override
  public DatabaseManager<EnterpriseClusterDbContext> createDatabaseManager(
      GlobalModule _globalModule) {

    CoreClusteredMultipleGdbDatabaseManager _coreClusteredMultipleGdbDatabaseManager =
        new CoreClusteredMultipleGdbDatabaseManager(
            _globalModule.getGlobalConfig(), this.lscClusterMetaTopologyInfo, this,
            _globalModule.getFileSystem(), _globalModule, this.logProvider,
            this.recotClusteringMediationDbmsManagers, _globalModule.getPageCache(),
            this.sfrcConsensusCommandReaderFactoryProvider);
    _globalModule.getGlobalLife().add(_coreClusteredMultipleGdbDatabaseManager);
    _globalModule.getGlobalDependencies()
        .satisfyDependency(_coreClusteredMultipleGdbDatabaseManager);
    this.abstractMultipleGdbDatabaseManagerDaamnObject = _coreClusteredMultipleGdbDatabaseManager;
    this._credbmardnmeForCo(_coreClusteredMultipleGdbDatabaseManager);
    return _coreClusteredMultipleGdbDatabaseManager;
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

    LogProvider _logProvider = _globalModule.getLogService().getInternalLogProvider();

    Config _config = _globalModule.getGlobalConfig();
    return new DefaultBaseRoutingProcedureInstaller(_clientRoutingDomainChecker,
        this.stCoreClusterStructureService, _config,
        _databaseManagerMdObject, _logProvider, this.serverSideRoutingTableProvider(_globalModule),
        this.slClusterLeader);
  }

  @Override
  public void createSecurityModule(GlobalModule _globalModule) {
    this.setSecurityProvider(
        EnterpriseModule.maenrsetmuSecurityProvider(this.defaultDatabaseResolver,
            this.defaultSecurityLog, _globalModule));
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
  public DatabaseStartupController getDatabaseStartupController() {
    return this.asdDatabaseStartupControllerAbortableImpl;
  }


  ClusterCoreGdbManager getFdcClusterCoreGdbManager() {
    return this.fdcClusterCoreGdbManager;
  }

  @Override
  public QueryEngineProvider getQueryEngineProvider() {
    return new EnhancedCypherEngineProvider();
  }

  @Override
  public void registerEditionSpecificProcedures(GlobalProcedures _globalProcedures,
      DatabaseManager<?> _databaseManagerMdObject) throws KernelException {
    (new CoreProcedureManagerService(this.stCoreClusterStructureService, _databaseManagerMdObject,
        this.globalModule, _globalProcedures,
        this.hpisCurrentProtocolStackManager, this.imCoreNodeClusterIdentModImpl,
        this.mrClusteredDbmsReconcilerLifecycleAdapter,
        this.recotClusteringMediationDbmsManagers.getOqDbmsManagerWatchTagImpl(),
        this.catchupManagerCoordinator.reeictRemoteMetaService(),
        this.supplierPicStream)).reie();
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
