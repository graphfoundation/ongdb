package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.ClusterSessionManager;
import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.akkamsg.OutDirectionConsensusMessageImpl;
import io.github.onograph.cluster.raft.akkamsg.OutDirectionLogImpl;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.id.ConsensusServiceSupplier;
import io.github.onograph.cluster.raft.id.CoreNodeClusterIdentModImpl;
import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter;
import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachesService;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachesServiceStandardImpl;
import io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach;
import io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService;
import io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapper;
import io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder;
import io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal;
import io.github.onograph.cluster.raft.share.calg.cle.LogMaintainerLifecycleAdapter;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService;
import io.github.onograph.cluster.raft.share.meta.ActionProcessManager;
import io.github.onograph.cluster.raft.share.meta.ConsensusConfiguratorForRaft;
import io.github.onograph.cluster.raft.share.meta.ConsensusTLogManager;
import io.github.onograph.cluster.raft.share.meta.CoreNodeDbWrapper;
import io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper;
import io.github.onograph.cluster.raft.share.meta.SetupManager;
import io.github.onograph.cluster.raft.share.meta.SnapshotDataManager;
import io.github.onograph.cluster.raft.share.meta.StoreGdbEnvironmentWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService;
import io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq;
import io.github.onograph.cluster.raft.share.meta.fsm.FSMUtils;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.PropertyKeyTokenHolder;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LocksConsensusImpl;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair;
import io.github.onograph.cluster.raft.share.meta.pit.CoreGdbSyncManager;
import io.github.onograph.cluster.raft.share.meta.pit.DataSyncManager;
import io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment;
import io.github.onograph.cluster.raft.share.meta.pit.StoreSyncService;
import io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter;
import io.github.onograph.cluster.raft.share.sync.ClusterConInfoManager;
import io.github.onograph.cluster.raft.share.sync.ClusterSessionBean;
import io.github.onograph.cluster.raft.share.sync.ConsensusSynceratorImpl;
import io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer;
import io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta;
import io.github.onograph.cluster.raft.share.sync.SubCSManager;
import io.github.onograph.cluster.raft.share.sync.SyncStatusMetaService;
import io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl;
import io.github.onograph.cluster.raft.share.sync.Syncerator;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import io.github.onograph.cluster.raft.utils.GdbUtilWrapperService;
import io.github.onograph.cluster.raft.watch.PerformanceTrackingLifecycleAdapter;
import io.github.onograph.cluster.raft.watch.PerformanceWatcher;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.DbmsManagerClusterImpl;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.GdbReplicator;
import io.github.onograph.dbms.StructureMetaService;
import io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl;
import io.github.onograph.dbms.crash.CrashManager;
import io.github.onograph.dbms.crash.CrashSignaler;
import io.github.onograph.dbms.crash.GdbCrashSender;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import java.time.Clock;
import java.time.Duration;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.DatabaseReadOnlyChecker;
import org.neo4j.configuration.helpers.DbmsReadOnlyChecker;
import org.neo4j.configuration.helpers.DbmsReadOnlyChecker.Default;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.DatabasePageCache;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.function.Suppliers;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.graphdb.factory.EditionLocksFactories;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.id.DatabaseIdContext;
import org.neo4j.graphdb.factory.module.id.IdContextFactory;
import org.neo4j.graphdb.factory.module.id.IdContextFactoryBuilder;
import org.neo4j.internal.helpers.DefaultTimeoutStrategy;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.context.VersionContextSupplier;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.io.state.StateStorage;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.factory.AccessCapabilityFactory;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.locking.LocksFactory;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.kernel.recovery.RecoveryFacade;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.logging.internal.DatabaseLogService;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.TokenRegistry;


class ClusterCoreGdbManager {


  private static final String UID_CAH_CLX_CLAP_LT = io.github.onograph.TokenConstants.ID_CACHE_CLUSTER_CLEANUP;


  private final DatabaseStartupControllerAbortableImpl asdDatabaseStartupControllerAbortableImpl;


  private final CatchupClusteredGdbManageService catchupClusteredGdbManageService;


  private final DbmsReadOnlyChecker cdorDbmsReadOnlyChecker;

  private final Clock clock;

  private final Config config;


  private final ConsensusMessageLogService<ConsensusNodeId> consensusMessageLogServiceLrConsensusNodeId;


  private final CoreGdbSyncManager coreGdbSyncManager;


  private final CrashManager crashManager;


  private final DatabaseManager<EnterpriseClusterDbContext> databaseManagerMdEnterpriseClusterDbContext;


  private final GdbUtilWrapperService fdtGdbUtilWrapperService;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final ClusterSimpleStorageFacade fsClusterSimpleStorageFacade;


  private final JobScheduler jobScheduler;


  private final CoreNodeClusterIdentModImpl miCoreNodeClusterIdentModImpl;


  private final OutDirection<SocketAddress, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?>>
      outDirectionRssc;


  private final PageCache pageCache;


  private final PageCacheTracer pageCacheTracer;


  private final RecoveryFacade recoveryFacade;


  private final ConsensusNodeGroupWrapperBuilder rgfConsensusNodeGroupWrapperBuilder;


  private final ConsensusIncomingMessageManager rmdConsensusIncomingMessageManager;


  private final SetupManager sbSetupManager;


  private final GdbReplicator sedGdbReplicator;


  private final CoreClusterStructureService stCoreClusterStructureService;


  private final SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl;


  private final SystemNanoClock systemNanoClock;

  ClusterCoreGdbManager(GlobalModule _globalModule, CrashManager crashManager,
      DatabaseManager<EnterpriseClusterDbContext> _databaseManagerDmEnterpriseClusterDbContext,
      CoreClusterStructureService _stCoreClusterStructureService,
      ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade,
      GdbUtilWrapperService _fdtGdbUtilWrapperService,
      CoreNodeClusterIdentModImpl _imCoreNodeClusterIdentModImpl,
      ConsensusNodeGroupWrapperBuilder _fgrConsensusNodeGroupWrapperBuilder,
      ConsensusIncomingMessageManager _dmrConsensusIncomingMessageManager,
      CoreGdbSyncManager coreGdbSyncManager, RecoveryFacade _recoveryFacade,
      ConsensusMessageLogService<ConsensusNodeId> _consensusMessageLogServiceLrConsensusNodeId,
      OutDirection<SocketAddress, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?>> _outDirectionSrsc,
      GdbReplicator _desGdbReplicator,
      SystemGraphDbmsModelClusterImpl _systemGraphDbmsModelClusterImpl,
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      CatchupClusteredGdbManageService catchupClusteredGdbManageService) {
    this.clock = _globalModule.getGlobalClock();
    this.config = _globalModule.getGlobalConfig();
    this.systemNanoClock = _globalModule.getGlobalClock();
    this.jobScheduler = _globalModule.getJobScheduler();
    this.fileSystemAbstraction = _globalModule.getFileSystem();
    this.pageCache = _globalModule.getPageCache();
    this.databaseManagerMdEnterpriseClusterDbContext = _databaseManagerDmEnterpriseClusterDbContext;
    this.crashManager = crashManager;
    this.stCoreClusterStructureService = _stCoreClusterStructureService;
    this.fsClusterSimpleStorageFacade = _fsClusterSimpleStorageFacade;
    this.fdtGdbUtilWrapperService = _fdtGdbUtilWrapperService;
    this.miCoreNodeClusterIdentModImpl = _imCoreNodeClusterIdentModImpl;
    this.rgfConsensusNodeGroupWrapperBuilder = _fgrConsensusNodeGroupWrapperBuilder;
    this.rmdConsensusIncomingMessageManager = _dmrConsensusIncomingMessageManager;
    this.coreGdbSyncManager = coreGdbSyncManager;
    this.recoveryFacade = _recoveryFacade;
    this.consensusMessageLogServiceLrConsensusNodeId = _consensusMessageLogServiceLrConsensusNodeId;
    this.outDirectionRssc = _outDirectionSrsc;
    this.sedGdbReplicator = _desGdbReplicator;
    this.catchupClusteredGdbManageService = catchupClusteredGdbManageService;

    Tracers _tracers = _globalModule.getTracers();
    this.pageCacheTracer = _tracers.getPageCacheTracer();
    this.systemGraphDbmsModelClusterImpl = _systemGraphDbmsModelClusterImpl;
    this.asdDatabaseStartupControllerAbortableImpl = _asdDatabaseStartupControllerAbortableImpl;
    this.sbSetupManager = new SetupManager(this.fileSystemAbstraction,
        _globalModule.getLogService().getInternalLogProvider());
    this.cdorDbmsReadOnlyChecker = new Default(this.config);
  }


  private static ActionProcessManager _crecaaptprsActionProcessManager(Config _config,
      Dependencies _dependencies, ConsensusNodeGroupWrapper _grConsensusNodeGroupWrapper,
      JobScheduler _jobScheduler, DatabaseLogProvider _ldDatabaseLogProvider,
      LifeSupport _lifeSupport, Monitors _monitors, GdbCrashSender _pnceGdbCrashSender,
      CoreMeta _scCoreMeta, SyncStatusMetaService _tpSyncStatusMetaService,
      ClusterSessionManager _tsClusterSessionManager) {

    ActionProcessManager _pacActionProcessManager =
        new ActionProcessManager(_grConsensusNodeGroupWrapper.getCfiConsensusLogCacheService(),
            _config.get(SettingsDeclarationClusterImpl.settingStmnsdzInteger),
            _config.get(SettingsDeclarationClusterImpl.settingStmnlbsInteger), _jobScheduler,
            _ldDatabaseLogProvider,
            _grConsensusNodeGroupWrapper.getLrMonitoredConsensusTransactionLog(), _monitors,
            _pnceGdbCrashSender,
            _tpSyncStatusMetaService, _scCoreMeta,
            _tsClusterSessionManager);
    _dependencies.satisfyDependency(_pacActionProcessManager);

    ConsensusTLogManager _plrConsensusTLogManager =
        new ConsensusTLogManager(_grConsensusNodeGroupWrapper.getConsensusOperationsManager(),
            _pacActionProcessManager);
    _dependencies.satisfyDependency(_plrConsensusTLogManager);
    _lifeSupport.add(new LogMaintainerLifecycleAdapter(_jobScheduler,
        _config.get(SettingsDeclarationClusterImpl.settingRaonrnDuration).toMillis(),
        _ldDatabaseLogProvider, _plrConsensusTLogManager));
    return _pacActionProcessManager;
  }


  private static Locks _crelmeLocks(Config _config, LogService _logService,
      SystemNanoClock _systemNanoClock) {

    LocksFactory _flLocksFactory = EditionLocksFactories.createLockFactory(_config, _logService);

    Locks _lclLocks = EditionLocksFactories.createLockManager(_flLocksFactory, _config,
        _systemNanoClock);
    return new LocksConsensusImpl(_lclLocks);
  }


  private static void _inassdroepForDeAcLi(LifeSupport _crLifeSupport, Dependencies _dependencies,
      ActionIdxMonitor _ticActionIdxMonitor) {

    PerformanceWatcher _mtPerformanceWatcher =
        _dependencies.resolveDependency(PerformanceTrackingLifecycleAdapter.class)
            .cramirPerformanceWatcher(_ticActionIdxMonitor);
    _crLifeSupport.add(_mtPerformanceWatcher);
    _dependencies.satisfyDependency(_mtPerformanceWatcher);
  }


  private SyncServiceLifecycleAdapter _credlrSyncServiceLifecycleAdapter(
      CatchupClusteredGdbManageService catchupClusteredGdbManageService,
      StoreSyncEnvironment _cdStoreSyncEnvironment, CoreGdbSyncManager coreGdbSyncManager,
      CrashSignaler crashSignaler, DatabaseLogProvider _dlDatabaseLogProvider,
      JobScheduler _jobScheduler, Monitors _monitors, ActionProcessManager _pacActionProcessManager,
      SnapshotDataManager _ssSnapshotDataManager) {

    StoreSyncService _dsStoreSyncService = new StoreSyncService(catchupClusteredGdbManageService,
        _dlDatabaseLogProvider);

    DataSyncManager _dwlaeDataSyncManager = new DataSyncManager(coreGdbSyncManager,
        _dsStoreSyncService);

    DefaultTimeoutStrategy _epnniDefaultTimeoutStrategy = DefaultTimeoutStrategy.exponential(1L,
        30L, TimeUnit.SECONDS);
    return new SyncServiceLifecycleAdapter(this.asdDatabaseStartupControllerAbortableImpl,
        _cdStoreSyncEnvironment, crashSignaler, _dwlaeDataSyncManager,
        _jobScheduler,
        _dlDatabaseLogProvider, _monitors, _pacActionProcessManager, this.sedGdbReplicator,
        _ssSnapshotDataManager,
        _epnniDefaultTimeoutStrategy);
  }


  private DatabaseIdContext _creicnDatabaseIdContext(NamedDatabaseId _namedDatabaseId) {

    Function<NamedDatabaseId, IdGeneratorFactory> _functionPgini =
        IdContextFactoryBuilder.defaultIdGeneratorFactoryProvider(this.fileSystemAbstraction,
            this.config);

    IdContextFactory _idContextFactory = IdContextFactoryBuilder.of(this.fileSystemAbstraction,
            this.jobScheduler, this.config, this.pageCacheTracer)
        .withIdGenerationFactoryProvider(_functionPgini).withFactoryWrapper((generator) ->
        {
          return generator;
        }).build();
    return _idContextFactory.createIdContext(_namedDatabaseId);
  }


  private SyncableLeasableCoreNodeDataFSMImpl _crelesemiSyncableLeasableCoreNodeDataFSMImpl(
      LifeSupport _crLifeSupport, DatabaseLogProvider _databaseLogProvider,
      NamedDatabaseId _namedDatabaseId, PageCacheTracer _pageCacheTracer,
      CoreNodeDbWrapper _rslesCoreNodeDbWrapper) {

    StateStorage<LeasableMeta> _stateStorageSlLeasableMeta =
        this.fsClusterSimpleStorageFacade.crelesaStateStorage(_databaseLogProvider,
            _namedDatabaseId.name(), _crLifeSupport);
    return new SyncableLeasableCoreNodeDataFSMImpl(() ->
    {

      CursorContext _cursorContext = new CursorContext(_pageCacheTracer.createPageCursorTracer(
          io.github.onograph.TokenConstants.ID_CACHE_CLUSTER_CLEANUP));

      try {
        _rslesCoreNodeDbWrapper.idgerfoSupplier().get().clearCache(_cursorContext);
      } catch (

          Throwable _throwable) {
        try {
          _cursorContext.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _cursorContext.close();
    }, _stateStorageSlLeasableMeta);
  }


  private ConsensusServiceSupplier _crerbrConsensusServiceSupplier(
      StoreGdbEnvironmentWrapper _cbStoreGdbEnvironmentWrapper, Config _config,
      CoreNodeClusterIdentModImpl _imCoreNodeClusterIdentModImpl,
      DatabaseLogProvider _ldDatabaseLogProvider, MemoryTracker _memoryTracker, Monitors _monitors,
      NamedDatabaseId _namedDatabaseId,
      SimpleStorage<ConsensusMemberGroupId> _simpleStorageSirConsensusMemberGroupId,
      StorageEngineFactory _storageEngineFactory,
      SystemGraphDbmsModelClusterImpl _systemGraphDbmsModelClusterImpl,
      GdbUtilWrapperService _tdfGdbUtilWrapperService) {

    DatabasePageCache _databasePageCache = new DatabasePageCache(this.pageCache,
        IOController.DISABLED);

    ConsensusConfiguratorForRaft _rbConsensusConfiguratorForRaft =
        new ConsensusConfiguratorForRaft(this.clock, _cbStoreGdbEnvironmentWrapper, _config,
            this.fileSystemAbstraction, _tdfGdbUtilWrapperService,
            _ldDatabaseLogProvider, _memoryTracker, _databasePageCache, this.pageCacheTracer,
            this.sbSetupManager, _storageEngineFactory);

    Integer _iHcm = _config.get(SettingsDeclarationClusterImpl.settingMiuetzoiInteger);

    Duration _tbcDuration = _config.get(SettingsDeclarationClusterImpl.settingCleditDuration);
    return new ConsensusServiceSupplier(_rbConsensusConfiguratorForRaft, this.systemNanoClock,
        _iHcm, _imCoreNodeClusterIdentModImpl, _monitors,
        _namedDatabaseId, _simpleStorageSirConsensusMemberGroupId,
        this.stCoreClusterStructureService,
        _systemGraphDbmsModelClusterImpl, () ->
    {
      Thread.sleep(100L);
    }, _tbcDuration);
  }


  private ConsensusSynceratorImpl _crerirConsensusSynceratorImpl(
      Lazy<ConsensusNodeId> _lazyMiConsensusNodeId, DatabaseLogProvider _ldDatabaseLogProvider,
      ConsensusLeaderNodeService _llConsensusLeaderNodeService, Monitors _monitors,
      NamedDatabaseId _namedDatabaseId,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOrcc,
      SubCSManager _psSubCSManager, SyncStatusMetaService _tpSyncStatusMetaService) {

    Duration _biDuration = this.config.get(SettingsDeclarationClusterImpl.settingRecnyosDuration);

    Duration _bbuDuration = this.config.get(SettingsDeclarationClusterImpl.settingRecnyomDuration);

    DefaultTimeoutStrategy _srpDefaultTimeoutStrategy =
        DefaultTimeoutStrategy.exponential(_biDuration.toMillis(), _bbuDuration.toMillis(),
            TimeUnit.MILLISECONDS);

    long _lgMta = this.config.get(SettingsDeclarationClusterImpl.settingRecnyosDuration).toMillis();

    Duration _alDuration = this.config.get(SettingsDeclarationClusterImpl.settingRecneieDuration);
    return new ConsensusSynceratorImpl(_alDuration,
        this.databaseManagerMdEnterpriseClusterDbContext, _lazyMiConsensusNodeId,
        _lgMta, _llConsensusLeaderNodeService, _ldDatabaseLogProvider, _monitors, _namedDatabaseId,
        _outDirectionOrcc,
        _srpDefaultTimeoutStrategy, _psSubCSManager, _tpSyncStatusMetaService);
  }


  private ClusterSessionManager _cresitaClusterSessionManager(
      DatabaseLogProvider _databaseLogProvider, LifeSupport _lifeSupport,
      NamedDatabaseId _namedDatabaseId) {

    StateStorage<ReplicationSessionManagerMeta> _stateStorageStsReplicationSessionManagerMeta =
        this.fsClusterSimpleStorageFacade.cresitasgStateStorage(_databaseLogProvider,
            _namedDatabaseId.name(), _lifeSupport);
    return new ClusterSessionManager(_stateStorageStsReplicationSessionManagerMeta);
  }


  private NamedServiceApproachManager _creurdassastNamedServiceApproachManager(
      ClusterStructureService clusterStructureService, Config _config, LogProvider _logProvider,
      ServerId _mslServerId,
      AbstractNamedServiceClusterApproach _sdAbstractNamedServiceClusterApproach) {

    Object _obLae;
    if (_config.get(SettingsDeclarationClusterImpl.settingMutccsBoolean)) {
      _obLae = new NamedServiceApproachesService(clusterStructureService, _config, _logProvider,
          _mslServerId);


    } else {
      _obLae = new NamedServiceApproachesServiceStandardImpl();
    }

    return new NamedServiceApproachManager(this.systemNanoClock,
        _sdAbstractNamedServiceClusterApproach, (Iterable) _obLae, _logProvider);
  }


  CoreDistributedGdb cradasCoreDistributedGdb(
      StoreGdbEnvironmentWrapper _cbStoreGdbEnvironmentWrapper,
      StoreSyncEnvironment _cdStoreSyncEnvironment, CoreNodeWrapper _ckCoreNodeWrapper,
      ConsensusCoreEnvWrapper _crConsensusCoreEnvWrapper, LifeSupport _crLifeSupport,
      Dependencies _dependencies, Database _kreDatabase, MemoryTracker _memoryTracker,
      Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      DbmsManagerClusterImpl _oiDbmsManagerClusterImpl,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl) {

    ServerId _imServerId = this.miCoreNodeClusterIdentModImpl.serverId();

    CrashSignaler crashSignaler = this.crashManager.paieCrashSignaler();

    GdbCrashSender gdbCrashSender = this.crashManager.paiefoGdbCrashSender(_namedDatabaseId);

    ConsensusNodeGroupWrapper _grConsensusNodeGroupWrapper = _crConsensusCoreEnvWrapper.getGrConsensusNodeGroupWrapper();

    DatabaseLogProvider _ldDatabaseLogProvider = _kreDatabase.getInternalLogProvider();

    ClusterSessionManager _tsClusterSessionManager = this._cresitaClusterSessionManager(
        _ldDatabaseLogProvider, _crLifeSupport, _namedDatabaseId);

    StateStorage<Long> _stateStorageSsflLong =
        this.fsClusterSimpleStorageFacade.crelfesrStateStorage(_ldDatabaseLogProvider,
            _namedDatabaseId.name(), _crLifeSupport);

    CoreMeta _scCoreMeta = new CoreMeta(_ckCoreNodeWrapper.getMsCoreGdbFSMService(),
        _stateStorageSsflLong, _tsClusterSessionManager);

    ActionProcessManager _paActionProcessManager =
        _crecaaptprsActionProcessManager(this.config, _dependencies, _grConsensusNodeGroupWrapper,
            this.jobScheduler, _ldDatabaseLogProvider,
            _crLifeSupport, _monitors,
            gdbCrashSender, _scCoreMeta, _crConsensusCoreEnvWrapper.getTpSyncStatusMetaService(),
            _tsClusterSessionManager);

    SnapshotDataManager _ssSnapshotDataManager =
        new SnapshotDataManager(this.systemNanoClock,
            _grConsensusNodeGroupWrapper.getConsensusOperationsManager(),
            _kreDatabase.getLogService(),
            _grConsensusNodeGroupWrapper.getLrMonitoredConsensusTransactionLog(), _namedDatabaseId,
            _paActionProcessManager, _scCoreMeta);
    _dependencies.satisfyDependencies(_ssSnapshotDataManager);

    SyncServiceLifecycleAdapter _sdSyncServiceLifecycleAdapter =
        this._credlrSyncServiceLifecycleAdapter(this.catchupClusteredGdbManageService,
            _cdStoreSyncEnvironment, this.coreGdbSyncManager, crashSignaler,
            _ldDatabaseLogProvider, this.jobScheduler, _monitors,
            _paActionProcessManager, _ssSnapshotDataManager);

    ReadReplicaNodeNamedServiceClusterApproach _dsReadReplicaNodeNamedServiceClusterApproach = new ReadReplicaNodeNamedServiceClusterApproach(
        2);
    _dsReadReplicaNodeNamedServiceClusterApproach.ineForClCoLoSe(this.stCoreClusterStructureService,
        this.config, _ldDatabaseLogProvider, _imServerId);

    NamedServiceApproachManager _sscNamedServiceApproachManager =
        this._creurdassastNamedServiceApproachManager(this.stCoreClusterStructureService,
            this.config, _ldDatabaseLogProvider, _imServerId,
            _dsReadReplicaNodeNamedServiceClusterApproach);

    LeaderOperations _plLeaderOperations =
        new LeaderOperations(this.stCoreClusterStructureService,
            _grConsensusNodeGroupWrapper.getConsensusOperationsManager());

    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl _pacSocketAddressServiceLeaderImpl =
        new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
            this.stCoreClusterStructureService, _plLeaderOperations,
            _sscNamedServiceApproachManager);
    _dependencies.satisfyDependency(_grConsensusNodeGroupWrapper.getConsensusOperationsManager());

    MemberNodesService _memberNodesService = _grConsensusNodeGroupWrapper.getMmrMemberNodesService();
    Objects.requireNonNull(_stateStorageSsflLong);
    _memberNodesService.sercfinsueForLo(_stateStorageSsflLong::getInitialState);

    ConsensusMessageOperationsBuilder _fchmrConsensusMessageOperationsBuilder =
        new ConsensusMessageOperationsBuilder(this.systemNanoClock, this.config,
            this.rmdConsensusIncomingMessageManager, this.jobScheduler,
            _ldDatabaseLogProvider, _monitors,
            _pacSocketAddressServiceLeaderImpl, gdbCrashSender);

    FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
        _fLIncomingMessageProcessorMhArrivingMessageManager =
        _fchmrConsensusMessageOperationsBuilder.cremahncFLIncomingMessageProcessor(
            _grConsensusNodeGroupWrapper, _paActionProcessManager,
            _sdSyncServiceLifecycleAdapter);

    LifeSupport _ctLifeSupport = new LifeSupport();

    CoreClusterStructureService _coreClusterStructureService = this.stCoreClusterStructureService;
    Objects.requireNonNull(this.stCoreClusterStructureService);

    _ctLifeSupport.add(
        StructureMetaService.froStructureMetaService(this.stCoreClusterStructureService::ondasForNa,
            this.stCoreClusterStructureService::ondabesoForNa,
            _namedDatabaseId));
    _ctLifeSupport.add(
        new CoreClusterStructureServiceLifecycleAdapter(
            _crConsensusCoreEnvWrapper.getGrConsensusNodeGroupWrapper()
                .getConsensusOperationsManager(),
            _namedDatabaseId, this.stCoreClusterStructureService));

    CoreCrashProcessors _hpCoreCrashProcessors =
        new CoreCrashProcessors(_paActionProcessManager,
            this.asdDatabaseStartupControllerAbortableImpl,
            _grConsensusNodeGroupWrapper.getConsensusOperationsManager(),
            this.crashManager, _kreDatabase, _oqDbmsManagerWatchTagImpl);

    SetupPreparerContainer _dbtSetupPreparerContainer = new SetupPreparerContainer(
        _kreDatabase.getDatabaseLayout(), this.fileSystemAbstraction);

    SimpleStorage<ConsensusMemberGroupId> _simpleStorageSigrConsensusMemberGroupId =
        this.fsClusterSimpleStorageFacade.crergrSimpleStorage(_ldDatabaseLogProvider,
            _namedDatabaseId.name());

    ConsensusServiceSupplier _rbConsensusServiceSupplier =
        this._crerbrConsensusServiceSupplier(_cbStoreGdbEnvironmentWrapper, this.config,
            this.miCoreNodeClusterIdentModImpl, _ldDatabaseLogProvider,
            _memoryTracker, _monitors, _namedDatabaseId,
            _simpleStorageSigrConsensusMemberGroupId, _kreDatabase.getStorageEngineFactory(),
            this.systemGraphDbmsModelClusterImpl, this.fdtGdbUtilWrapperService);

    ConsensusInitializer consensusInitializer =
        new ConsensusInitializer(this.asdDatabaseStartupControllerAbortableImpl,
            _rbConsensusServiceSupplier, this.sbSetupManager,
            _dbtSetupPreparerContainer, _fLIncomingMessageProcessorMhArrivingMessageManager,
            _kreDatabase,
            _oiDbmsManagerClusterImpl, _crLifeSupport, _sdSyncServiceLifecycleAdapter,
            _simpleStorageSigrConsensusMemberGroupId, _ssSnapshotDataManager);
    return CoreDistributedGdb
        .craCoreDistributedGdb(this.asdDatabaseStartupControllerAbortableImpl, consensusInitializer,
            _grConsensusNodeGroupWrapper.getConsensusOperationsManager(), _ctLifeSupport,
            _fLIncomingMessageProcessorMhArrivingMessageManager, _hpCoreCrashProcessors,
            _kreDatabase,
            _paActionProcessManager, this.recoveryFacade, _sdSyncServiceLifecycleAdapter);
  }


  CoreNodeWrapper crekecptCoreNodeWrapper(ConsensusCoreEnvWrapper _crConsensusCoreEnvWrapper,
      LifeSupport _crLifeSupport, DatabaseLogService _databaseLogService,
      DatabaseReadOnlyChecker _databaseReadOnlyChecker, CoreNodeDbWrapper _krCoreNodeDbWrapper,
      NamedDatabaseId _namedDatabaseId, VersionContextSupplier _versionContextSupplier) {

    ConsensusNodeGroupWrapper _grConsensusNodeGroupWrapper = _crConsensusCoreEnvWrapper.getGrConsensusNodeGroupWrapper();

    Syncerator _rpiaoSyncerator = _crConsensusCoreEnvWrapper.getRpiaoSyncerator();

    DatabaseLogProvider _ldDatabaseLogProvider = _databaseLogService.getInternalLogProvider();

    SyncableLeasableCoreNodeDataFSMImpl _mslrSyncableLeasableCoreNodeDataFSMImpl =
        this._crelesemiSyncableLeasableCoreNodeDataFSMImpl(_crLifeSupport, _ldDatabaseLogProvider,
            _namedDatabaseId, this.pageCacheTracer,
            _krCoreNodeDbWrapper);

    DatabaseIdContext _databaseIdContext = this._creicnDatabaseIdContext(_namedDatabaseId);

    Supplier<StorageEngine> _supplierSesStorageEngine = _krCoreNodeDbWrapper.streegeSupplier();

    TokenRegistry _trTokenRegistry = new TokenRegistry(
        io.github.onograph.TokenConstants.RELATIONSHIP_TYPE2);

    RelationshipTypeTokenHolder _relationshipTypeTokenHolder =
        new RelationshipTypeTokenHolder(_databaseReadOnlyChecker,
            _databaseIdContext.getIdGeneratorFactory(), _namedDatabaseId, this.pageCacheTracer,
            _rpiaoSyncerator,
            _supplierSesStorageEngine, _trTokenRegistry);

    TokenRegistry _kpTokenRegistry = new TokenRegistry(
        io.github.onograph.TokenConstants.PROPERTY_KEY);

    PropertyKeyTokenHolder _propertyKeyTokenHolder =
        new PropertyKeyTokenHolder(_namedDatabaseId, _kpTokenRegistry, _rpiaoSyncerator,
            _databaseIdContext.getIdGeneratorFactory(),
            _supplierSesStorageEngine, this.pageCacheTracer, _databaseReadOnlyChecker);

    TokenRegistry _lblTokenRegistry = new TokenRegistry(io.github.onograph.TokenConstants.LABEL);

    LabelTokenHolder _labelTokenHolder =
        new LabelTokenHolder(_namedDatabaseId, _lblTokenRegistry, _rpiaoSyncerator,
            _databaseIdContext.getIdGeneratorFactory(),
            _supplierSesStorageEngine,
            this.pageCacheTracer, _databaseReadOnlyChecker);

    io.github.onograph.dbms.GdbReplicator.FireEvents _dedFireEvents =
        this.sedGdbReplicator.gedteetdaGdbReplicatorFireEvents(_namedDatabaseId);

    FSMUtils _hcFSMUtils =
        new FSMUtils(_crConsensusCoreEnvWrapper.getTicActionIdxMonitor(), _dedFireEvents,
            this.pageCacheTracer, _versionContextSupplier);

    FSMTokenImpl _mstlFSMTokenImpl = new FSMTokenImpl(_hcFSMUtils, _lblTokenRegistry,
        _ldDatabaseLogProvider);

    FSMTokenImpl _mstkpFSMTokenImpl = new FSMTokenImpl(_hcFSMUtils, _kpTokenRegistry,
        _ldDatabaseLogProvider);

    FSMTokenImpl _msttrFSMTokenImpl = new FSMTokenImpl(_hcFSMUtils, _trTokenRegistry,
        _ldDatabaseLogProvider);

    ReplicatedTransactionFSM _mstrReplicatedTransactionFSM = new ReplicatedTransactionFSM(
        _hcFSMUtils,
        this.config
            .get(SettingsDeclarationClusterImpl.settingStmnlbsInteger),
        _ldDatabaseLogProvider,
        _mslrSyncableLeasableCoreNodeDataFSMImpl);

    Locks _mlLocks = _crelmeLocks(this.config, _databaseLogService, this.systemNanoClock);

    TransactionLogIndexRepair _rilcTransactionLogIndexRepair =
        new TransactionLogIndexRepair(_ldDatabaseLogProvider, _krCoreNodeDbWrapper.txidsoSupplier(),
            _krCoreNodeDbWrapper.txsteSupplier());

    CoreGdbFSMService _msCoreGdbFSMService =
        new CoreGdbFSMService(new FSMEmptyReq(),
            _mslrSyncableLeasableCoreNodeDataFSMImpl, _mstkpFSMTokenImpl, _mstlFSMTokenImpl,
            _mstrReplicatedTransactionFSM,
            _msttrFSMTokenImpl, _rilcTransactionLogIndexRepair);

    TokenHolders _tokenHolders = new TokenHolders(_propertyKeyTokenHolder, _labelTokenHolder,
        _relationshipTypeTokenHolder);

    LeaseServiceEnterpriseImpl _clLeaseServiceEnterpriseImpl =
        new LeaseServiceEnterpriseImpl(_grConsensusNodeGroupWrapper.getConsensusOperationsManager(),
            _mslrSyncableLeasableCoreNodeDataFSMImpl,
            _namedDatabaseId, _rpiaoSyncerator, () ->
        {
          return this.miCoreNodeClusterIdentModImpl.ratmmriConsensusNodeId(
              _namedDatabaseId.databaseId());
        });

    CommitProcessFactoryCoreImpl _commitProcessFactoryCoreImpl =
        new CommitProcessFactoryCoreImpl(_clLeaseServiceEnterpriseImpl, _msCoreGdbFSMService,
            _rpiaoSyncerator);

    AccessCapabilityFactory _accessCapabilityFactory =
        AccessCapabilityFactory.fixed(new AccessCapabilityMutatingLeader(
            _grConsensusNodeGroupWrapper.getConsensusOperationsManager()));
    return new CoreNodeWrapper(_accessCapabilityFactory, _commitProcessFactoryCoreImpl,
        _databaseIdContext,
        _clLeaseServiceEnterpriseImpl, _mlLocks, _msCoreGdbFSMService, _tokenHolders);
  }


  ConsensusCoreEnvWrapper crercxConsensusCoreEnvWrapper(LifeSupport _crLifeSupport,
      DatabaseLogService _databaseLogService, Dependencies _dependencies, Monitors _monitors,
      NamedDatabaseId _namedDatabaseId, SyncableDataChannelMarshal syncableDataChannelMarshal) {

    Lazy<ConsensusNodeId> _lazyRmiConsensusNodeId = Suppliers.lazySingleton(() ->
    {
      return this.miCoreNodeClusterIdentModImpl.ratmmriConsensusNodeId(
          _namedDatabaseId);
    });

    DatabaseLogProvider _ldDatabaseLogProvider = _databaseLogService.getInternalLogProvider();

    ActionIdxMonitor _ticActionIdxMonitor = _dependencies.satisfyDependency(new ActionIdxMonitor());
    _inassdroepForDeAcLi(_crLifeSupport, _dependencies, _ticActionIdxMonitor);

    long _lgMtl = this.config.get(SettingsDeclarationClusterImpl.settingUnwrogtDuration).toMillis();

    OutDirectionLogImpl<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage>
        _outDirectionLogImplOrcc = new OutDirectionLogImpl(
        this.consensusMessageLogServiceLrConsensusNodeId, _namedDatabaseId,
        new OutDirectionConsensusMessageImpl(this.systemNanoClock,
            ConsensusMemberGroupId.froConsensusMemberGroupId(
                _namedDatabaseId.databaseId()),
            this.rmdConsensusIncomingMessageManager,
            _lazyRmiConsensusNodeId,
            _lgMtl, _ldDatabaseLogProvider, this.outDirectionRssc,
            this.stCoreClusterStructureService));

    InfoReplyMessageConsumer _crsInfoReplyMessageConsumer = new InfoReplyMessageConsumer();

    ConsensusNodeGroupWrapper _rgConsensusNodeGroupWrapper = this.rgfConsensusNodeGroupWrapperBuilder
        .craConsensusNodeGroupWrapper(this.cdorDbmsReadOnlyChecker, _crsInfoReplyMessageConsumer,
            _databaseLogService, _dependencies,
            _lazyRmiConsensusNodeId, _crLifeSupport, syncableDataChannelMarshal, _monitors,
            _namedDatabaseId, _outDirectionLogImplOrcc);

    UUID _isUUID = UUID.randomUUID();

    ClusterSessionBean _sgmClusterSessionBean = new ClusterSessionBean(_isUUID,
        _lazyRmiConsensusNodeId);

    SubCSManager _psSubCSManager = new SubCSManager(_sgmClusterSessionBean);

    SyncStatusMetaServiceImpl _tpSyncStatusMetaServiceImpl = new SyncStatusMetaServiceImpl(
        _sgmClusterSessionBean);

    ConsensusSynceratorImpl _rpiaoConsensusSynceratorImpl =
        this._crerirConsensusSynceratorImpl(_lazyRmiConsensusNodeId, _ldDatabaseLogProvider,
            _rgConsensusNodeGroupWrapper.getConsensusOperationsManager(), _monitors,
            _namedDatabaseId,
            _outDirectionLogImplOrcc, _psSubCSManager, _tpSyncStatusMetaServiceImpl);

    ClusterConInfoManager _sscClusterConInfoManager =
        new ClusterConInfoManager(_crsInfoReplyMessageConsumer,
            _rgConsensusNodeGroupWrapper.getConsensusOperationsManager(), _databaseLogService,
            this.jobScheduler.executor(Group.CLUSTER_STATUS_CHECK_SERVICE), _lazyRmiConsensusNodeId,
            _namedDatabaseId,
            _rpiaoConsensusSynceratorImpl,
            this.config.get(SettingsDeclarationClusterSystemImpl.settingCletqmutDuration));
    _dependencies.satisfyDependency(_sscClusterConInfoManager);
    return new ConsensusCoreEnvWrapper(_rgConsensusNodeGroupWrapper, _rpiaoConsensusSynceratorImpl,
        _ticActionIdxMonitor, _tpSyncStatusMetaServiceImpl);
  }
}
