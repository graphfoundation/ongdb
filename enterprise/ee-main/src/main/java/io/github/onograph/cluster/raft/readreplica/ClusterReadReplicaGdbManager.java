package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncFacade;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachesService;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachesServiceStandardImpl;
import io.github.onograph.cluster.raft.palapp.strategies.FollowerApproach;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaAsyncTransactionAdapter;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaBulkTransactionManager;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
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
import java.time.Clock;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.internal.helpers.DefaultTimeoutStrategy;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.pagecache.context.VersionContextSupplier;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.logging.internal.DatabaseLogService;
import org.neo4j.scheduler.JobScheduler;


class ClusterReadReplicaGdbManager {


  private final DatabaseStartupControllerAbortableImpl asdDatabaseStartupControllerAbortableImpl;


  private final CatchupClusteredGdbManageService catchupClusteredGdbManageService;


  private final Clock clock;


  private final ClusterStructureService clusterStructureService;


  private final Config config;


  private final TransactionSyncManager cptTransactionSyncManager;


  private final CrashManager crashManager;


  private final ClusterSimpleStorageFacade fscClusterSimpleStorageFacade;


  private final JobScheduler jobScheduler;


  private final SystemGraphDbmsModelClusterImpl mdsSystemGraphDbmsModelClusterImpl;


  private final PageCacheTracer pageCacheTracer;


  private final ReadReplicaAsyncTransactionAdapter readReplicaAsyncTransactionAdapter;


  private final GdbReplicator sedGdbReplicator;


  private final ServerId serverId;


  ClusterReadReplicaGdbManager(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      CatchupClusteredGdbManageService catchupClusteredGdbManageService, Clock _clock,
      ClusterStructureService clusterStructureService, Config _config,
      TransactionSyncManager _cptTransactionSyncManager, CrashManager crashManager,
      ClusterSimpleStorageFacade _fscClusterSimpleStorageFacade, JobScheduler _jobScheduler,
      SystemGraphDbmsModelClusterImpl _mdsSystemGraphDbmsModelClusterImpl,
      PageCacheTracer _pageCacheTracer,
      ReadReplicaAsyncTransactionAdapter readReplicaAsyncTransactionAdapter,
      GdbReplicator _sedGdbReplicator, ServerId _serverId) {
    this.asdDatabaseStartupControllerAbortableImpl = _asdDatabaseStartupControllerAbortableImpl;
    this.catchupClusteredGdbManageService = catchupClusteredGdbManageService;
    this.clock = _clock;
    this.clusterStructureService = clusterStructureService;
    this.config = _config;
    this.cptTransactionSyncManager = _cptTransactionSyncManager;
    this.crashManager = crashManager;
    this.fscClusterSimpleStorageFacade = _fscClusterSimpleStorageFacade;
    this.jobScheduler = _jobScheduler;
    this.mdsSystemGraphDbmsModelClusterImpl = _mdsSystemGraphDbmsModelClusterImpl;
    this.pageCacheTracer = _pageCacheTracer;
    this.readReplicaAsyncTransactionAdapter = readReplicaAsyncTransactionAdapter;
    this.sedGdbReplicator = _sedGdbReplicator;
    this.serverId = _serverId;
  }


  private static void _inassdroepForAcLiDe(Dependencies _dependencies, LifeSupport _lifeSupport,
      ActionIdxMonitor _ticActionIdxMonitor) {

    PerformanceWatcher _tmPerformanceWatcher =
        _dependencies.resolveDependency(PerformanceTrackingLifecycleAdapter.class)
            .cramirPerformanceWatcher(_ticActionIdxMonitor);
    _lifeSupport.add(_tmPerformanceWatcher);
    _dependencies.satisfyDependency(_tmPerformanceWatcher);
  }


  private ReadReplicateCatchupManager _crechplpsReadReplicateCatchupManager(
      ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment,
      NamedDatabaseId _namedDatabaseId, StoreSyncFacade _pcsStoreSyncFacade,
      DatabaseLogProvider _pliDatabaseLogProvider,
      NamedServiceApproachManager _ssduNamedServiceApproachManager,
      ActionIdxMonitor _ticActionIdxMonitor, VersionContextSupplier _versionContextSupplier) {

    CrashSignaler crashSignaler = this.crashManager.paieCrashSignaler();

    io.github.onograph.dbms.GdbReplicator.FireEvents _dedFireEvents =
        this.sedGdbReplicator.gedteetdaGdbReplicatorFireEvents(_namedDatabaseId);

    long _lgAbs =
        ByteUnit.mebiBytes(
            (long) this.config.get(SettingsDeclarationClusterSystemImpl.settingReeasolaiInteger));

    long _lgSqm =
        ByteUnit.mebiBytes(
            (long) this.config.get(SettingsDeclarationClusterSystemImpl.settingReeasolaueInteger));

    ReadReplicaBulkTransactionManager readReplicaBulkTransactionManager =
        new ReadReplicaBulkTransactionManager(_cdReadReplicaGdbWrapperEnvironment, _dedFireEvents,
            _pliDatabaseLogProvider, this.pageCacheTracer,
            this.readReplicaAsyncTransactionAdapter, _ticActionIdxMonitor,
            _versionContextSupplier);

    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl _puSocketAddressServiceLocatorImpl =
        new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl(
            this.clusterStructureService,
            _ssduNamedServiceApproachManager);

    ReadReplicateCatchupManager _ppcReadReplicateCatchupManager =
        new ReadReplicateCatchupManager(_cdReadReplicaGdbWrapperEnvironment,
            this.cptTransactionSyncManager,
            crashSignaler, _dedFireEvents, readReplicaBulkTransactionManager, _lgAbs, _lgSqm,
            _pliDatabaseLogProvider,
            _pcsStoreSyncFacade, _puSocketAddressServiceLocatorImpl);
    _cdReadReplicaGdbWrapperEnvironment.getDependencies()
        .satisfyDependency(_ppcReadReplicateCatchupManager);
    return _ppcReadReplicateCatchupManager;
  }


  private AbstractNamedServiceClusterApproach _credusryAbstractNamedServiceClusterApproach(
      DatabaseLogProvider _ilpDatabaseLogProvider) {

    FollowerApproach _sdFollowerApproach = new FollowerApproach();
    _sdFollowerApproach.ineForClCoLoSe(this.clusterStructureService, this.config,
        _ilpDatabaseLogProvider, this.serverId);
    return _sdFollowerApproach;
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

    return new NamedServiceApproachManager(this.clock, _sdAbstractNamedServiceClusterApproach,
        (Iterable) _obLae, _logProvider);
  }


  ReadReplicaDistributedGdb cradasReadReplicaDistributedGdb(
      ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment,
      DbmsManagerClusterImpl _oicDbmsManagerClusterImpl,
      DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl) {

    NamedDatabaseId _namedDatabaseId = _cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId();

    Database _kreDatabase = _cdReadReplicaGdbWrapperEnvironment.getKreDatabase();

    DatabaseLogService _databaseLogService = _kreDatabase.getLogService();

    DatabaseLogProvider _pliDatabaseLogProvider = _databaseLogService.getInternalLogProvider();

    DatabaseLogProvider _pluDatabaseLogProvider = _databaseLogService.getUserLogProvider();

    LifeSupport _ccLifeSupport = new LifeSupport();

    ActionIdxMonitor _ticActionIdxMonitor = _cdReadReplicaGdbWrapperEnvironment.getDependencies()
        .satisfyDependency(new ActionIdxMonitor());
    _inassdroepForAcLiDe(_cdReadReplicaGdbWrapperEnvironment.getDependencies(), _ccLifeSupport,
        _ticActionIdxMonitor);

    AbstractNamedServiceClusterApproach _dsAbstractNamedServiceClusterApproach =
        this._credusryAbstractNamedServiceClusterApproach(_pliDatabaseLogProvider);

    NamedServiceApproachManager _ssduNamedServiceApproachManager =
        this._creurdassastNamedServiceApproachManager(this.clusterStructureService, this.config,
            _pliDatabaseLogProvider, this.serverId,
            _dsAbstractNamedServiceClusterApproach);

    StoreSyncFacade _pcsStoreSyncFacade =
        this.catchupClusteredGdbManageService.stcprsStoreSyncFacade(
            _cdReadReplicaGdbWrapperEnvironment.stdocnStoreSyncEnvironment());

    ReadReplicateCatchupManager _ppcReadReplicateCatchupManager =
        this._crechplpsReadReplicateCatchupManager(_cdReadReplicaGdbWrapperEnvironment,
            _namedDatabaseId, _pcsStoreSyncFacade, _pliDatabaseLogProvider,
            _ssduNamedServiceApproachManager,
            _ticActionIdxMonitor, _kreDatabase.getVersionContextSupplier());

    ScHolderJobScheduler _stScHolderJobScheduler = new ScHolderJobScheduler(this.jobScheduler,
        _pliDatabaseLogProvider);

    Duration _iptDuration = this.config.get(SettingsDeclarationClusterImpl.settingPultvDuration);

    CatchupNodeTaskCoordinator catchupNodeTaskCoordinator =
        new CatchupNodeTaskCoordinator(_ppcReadReplicateCatchupManager, _iptDuration,
            _stScHolderJobScheduler);

    SimpleStorage<ConsensusMemberGroupId> _simpleStorageSirConsensusMemberGroupId =
        this.fscClusterSimpleStorageFacade.crergrSimpleStorage(_pliDatabaseLogProvider,
            _cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId().name());

    DefaultTimeoutStrategy _sbDefaultTimeoutStrategy = DefaultTimeoutStrategy.constant(1L,
        TimeUnit.SECONDS);

    ReadReplicateIntegrator _bosrpReadReplicateIntegrator =
        new ReadReplicateIntegrator(this.asdDatabaseStartupControllerAbortableImpl,
            this.catchupClusteredGdbManageService, _cdReadReplicaGdbWrapperEnvironment,
            this.clusterStructureService,
            _pliDatabaseLogProvider, this.mdsSystemGraphDbmsModelClusterImpl,
            _oicDbmsManagerClusterImpl, _sbDefaultTimeoutStrategy, _ssduNamedServiceApproachManager,
            _pluDatabaseLogProvider);

    ConsensusIdStorageWrapper _ricConsensusIdStorageWrapper = new ConsensusIdStorageWrapper(
        _namedDatabaseId, _simpleStorageSirConsensusMemberGroupId);

    Objects.requireNonNull(this.clusterStructureService);

    StructureMetaService structureMetaService =
        StructureMetaService.froStructureMetaService(this.clusterStructureService::ondasForNa,
            this.clusterStructureService::ondabesoForNa,
            _namedDatabaseId);

    ReadReplicaCrashServiceAdapter _hpReadReplicaCrashServiceAdapter =
        new ReadReplicaCrashServiceAdapter(this.crashManager,
            this.asdDatabaseStartupControllerAbortableImpl, _kreDatabase,
            _oqDbmsManagerWatchTagImpl);
    return ReadReplicaDistributedGdb
        .craReadReplicaDistributedGdb(this.asdDatabaseStartupControllerAbortableImpl,
            _bosrpReadReplicateIntegrator, catchupNodeTaskCoordinator,
            _ccLifeSupport, _ricConsensusIdStorageWrapper, _kreDatabase,
            _hpReadReplicaCrashServiceAdapter,
            _ppcReadReplicateCatchupManager,
            structureMetaService);
  }
}
