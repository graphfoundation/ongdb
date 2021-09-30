package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.MonitoredConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import io.github.onograph.cluster.raft.share.calg.cle.parts.ConsensusTransactionLogSpreadImpl;
import io.github.onograph.cluster.raft.share.calg.cle.parts.PartClipperService;
import io.github.onograph.cluster.raft.share.calg.cle.parts.PartClipperServiceFactory;
import io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta;
import io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMetaStateStorageImpl;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment;
import io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodesFactoryDefaultImpl;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService;
import io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta;
import io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper;
import io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.sync.SyncToManager;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import io.github.onograph.cluster.raft.shared.ConsensusStrategyType;
import io.github.onograph.config.ConsensusLogCacheServiceBuilder;
import io.github.onograph.config.NodeGroupIdentifierSetSupplier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.DbmsReadOnlyChecker;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.state.StateStorage;
import org.neo4j.kernel.availability.AvailabilityGuard;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.logging.internal.DatabaseLogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.time.SystemNanoClock;


public class ConsensusNodeGroupWrapper {


  private final ConsensusLogCacheService cfiConsensusLogCacheService;


  private final ConsensusOperationsManager consensusOperationsManager;


  private final MonitoredConsensusTransactionLog lrMonitoredConsensusTransactionLog;


  private final MemberNodesService mmrMemberNodesService;


  private final LeaderNodeScheduleWrapper talLeaderNodeScheduleWrapper;


  ConsensusNodeGroupWrapper(DbmsReadOnlyChecker _cdorDbmsReadOnlyChecker, Config _config,
      Consumer<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> _consumerCrsInfoReplyMessage,
      LifeSupport _crLifeSupport, DatabaseLogService _databaseLogService,
      Dependencies _dependencies, FileSystemAbstraction _fileSystemAbstraction,
      ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade,
      AvailabilityGuard _goaAvailabilityGuard, JobScheduler _jobScheduler,
      Lazy<ConsensusNodeId> _lazyMslConsensusNodeId,
      LeaderNodeEventHandlers _llLeaderNodeEventHandlers,
      SyncableDataChannelMarshal _mcSyncableDataChannelMarshal, MemoryTracker _memoryTracker,
      Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOtoncc,
      ClusterMetaTopologyInfo _scClusterMetaTopologyInfo,
      NodeGroupIdentifierSetSupplier _sgsNodeGroupIdentifierSetSupplier,
      LeaderGatekeeper _stlLeaderGatekeeper, SystemNanoClock _systemNanoClock) {

    DatabaseLogProvider _databaseLogProvider = _databaseLogService.getInternalLogProvider();

    ScHolderJobScheduler _stScHolderJobScheduler = new ScHolderJobScheduler(_jobScheduler,
        _databaseLogProvider);

    ConsensusTransactionLog _luConsensusTransactionLog =
        _crartlgConsensusTransactionLog(_config, _fileSystemAbstraction, _jobScheduler,
            _crLifeSupport, _databaseLogProvider,
            _scClusterMetaTopologyInfo, _memoryTracker, _namedDatabaseId,
            _mcSyncableDataChannelMarshal,
            _systemNanoClock);
    this.lrMonitoredConsensusTransactionLog = new MonitoredConsensusTransactionLog(
        _luConsensusTransactionLog, _monitors);

    StateStorage<CandidateTermMeta> _stateStorageDtsCandidateTermMeta =
        _fsClusterSimpleStorageFacade.crertsteStateStorage(_databaseLogProvider,
            _namedDatabaseId.name(), _crLifeSupport);

    StateStorage<CandidateTermMeta> _stateStorageStCandidateTermMeta =
        new CandidateTermMetaStateStorageImpl(_monitors, _stateStorageDtsCandidateTermMeta);

    StateStorage<CandidateTallyMeta> _stateStorageSvCandidateTallyMeta =
        _fsClusterSimpleStorageFacade.crervsteStateStorage(_databaseLogProvider,
            _namedDatabaseId.name(), _crLifeSupport);

    StateStorage<NodeServerMemberTransactionLogDataMeta> _stateStorageRmsNodeServerMemberTransactionLogDataMeta =
        _fsClusterSimpleStorageFacade.crermrsgStateStorage(_databaseLogProvider,
            _namedDatabaseId.name(), _crLifeSupport);

    ConsensusSchedulerTimingSettings _ctrConsensusSchedulerTimingSettings = new ConsensusSchedulerTimingSettings(
        _config);
    this.talLeaderNodeScheduleWrapper =
        new LeaderNodeScheduleWrapper(_systemNanoClock, _ctrConsensusSchedulerTimingSettings,
            _databaseLogProvider, _stScHolderJobScheduler);

    SyncToManager _rolSyncToManager = new SyncToManager(_lazyMslConsensusNodeId,
        _outDirectionOtoncc);

    Integer _iSgcm = _config.get(SettingsDeclarationClusterImpl.settingMiuetzueInteger);

    ConsensusNodesFactoryDefaultImpl _bsmConsensusNodesFactoryDefaultImpl = new ConsensusNodesFactoryDefaultImpl();
    this.mmrMemberNodesService =
        new MemberNodesService(_systemNanoClock, _bsmConsensusNodesFactoryDefaultImpl, _iSgcm,
            _lazyMslConsensusNodeId,
            _config.get(SettingsDeclarationClusterImpl.settingJoapoDuration).toMillis(),
            _config.get(SettingsDeclarationClusterImpl.settingJoapaDuration).toMillis(),
            _databaseLogProvider,
            this.lrMonitoredConsensusTransactionLog, _rolSyncToManager,
            _stateStorageRmsNodeServerMemberTransactionLogDataMeta);
    _dependencies.satisfyDependency(this.mmrMemberNodesService);
    _crLifeSupport.add(this.mmrMemberNodesService);
    this.cfiConsensusLogCacheService = ConsensusLogCacheServiceBuilder.craConsensusLogCacheService(
        _config, _monitors);

    ConsensusProcessorService _slConsensusProcessorService =
        new ConsensusProcessorService(this.cfiConsensusLogCacheService, _systemNanoClock,
            _config.get(SettingsDeclarationClusterImpl.settingLoigaInteger),
            _config.get(SettingsDeclarationClusterImpl.settingCauceInteger),
            _lazyMslConsensusNodeId,
            _config.get(SettingsDeclarationClusterImpl.settingLoigyoDuration).toMillis(),
            _databaseLogProvider,
            this.lrMonitoredConsensusTransactionLog, this.mmrMemberNodesService,
            _outDirectionOtoncc,
            _stScHolderJobScheduler);

    TransferCollection<ConsensusNodeId> _transferCollectionTlConsensusNodeId =
        new TransferCollection(_systemNanoClock,
            _config.get(SettingsDeclarationClusterSystemImpl.settingLersitDuration));

    ConsensusMeta _saeConsensusMeta =
        new ConsensusMeta(this.cfiConsensusLogCacheService, _lazyMslConsensusNodeId,
            this.lrMonitoredConsensusTransactionLog, _databaseLogProvider,
            this.mmrMemberNodesService, _stateStorageStCandidateTermMeta,
            _stateStorageSvCandidateTallyMeta,
            _transferCollectionTlConsensusNodeId);

    BooleanSupplier _iroBooleanSupplier = () ->
    {
      return _cdorDbmsReadOnlyChecker.isReadOnly(_namedDatabaseId.name());
    };
    Objects.requireNonNull(_goaAvailabilityGuard);

    ConsensusMetaManagingEnvironment _chmConsensusMetaManagingEnvironment =
        new ConsensusMetaManagingEnvironment(_config, _iroBooleanSupplier, _saeConsensusMeta,
            _sgsNodeGroupIdentifierSetSupplier,
            _goaAvailabilityGuard::isShutdown);

    ResettableMessageTimer _rmtrmResettableMessageTimer =
        _monitors.newMonitor(ResettableMessageTimer.class, new String[0]);

    ConsensusProcessor _aorConsensusProcessor =
        new ConsensusProcessor((rejection) ->
        {
          _stlLeaderGatekeeper.haercForCoNa(rejection, _namedDatabaseId);
        }, _consumerCrsInfoReplyMessage,
            _databaseLogProvider, this.mmrMemberNodesService, _rmtrmResettableMessageTimer,
            _outDirectionOtoncc, _saeConsensusMeta,
            _slConsensusProcessorService, this.talLeaderNodeScheduleWrapper);
    this.consensusOperationsManager =
        new ConsensusOperationsManager(_aorConsensusProcessor, this.cfiConsensusLogCacheService,
            this.talLeaderNodeScheduleWrapper,
            _lazyMslConsensusNodeId, _databaseLogProvider,
            _chmConsensusMetaManagingEnvironment, this.mmrMemberNodesService, _saeConsensusMeta);
    this.consensusOperationsManager.retlsrForLe(_llLeaderNodeEventHandlers);

    ResettableMessageTimerMessageSpacingImpl _mmlsdResettableMessageTimerMessageSpacingImpl =
        new ResettableMessageTimerMessageSpacingImpl(_systemNanoClock);
    _monitors.addMonitorListener(_mmlsdResettableMessageTimerMessageSpacingImpl);
    _dependencies.satisfyDependency(_mmlsdResettableMessageTimerMessageSpacingImpl);
    _crLifeSupport.add(_slConsensusProcessorService);
  }


  private static ConsensusTransactionLog _crartlgConsensusTransactionLog(Config _config,
      FileSystemAbstraction _fileSystemAbstraction, JobScheduler _jobScheduler,
      LifeSupport _lifeSupport, LogProvider _logProvider,
      ClusterMetaTopologyInfo _lyuClusterMetaTopologyInfo, MemoryTracker _memoryTracker,
      NamedDatabaseId _namedDatabaseId, SyncableDataChannelMarshal _smSyncableDataChannelMarshal,
      SystemNanoClock _systemNanoClock) {

    ConsensusStrategyType _rliConsensusStrategyType = ConsensusStrategyType.valueOf(
        _config.get(SettingsDeclarationClusterImpl.settingRaoltnString));
    switch (_rliConsensusStrategyType) {
      case IN_MEMORY:
        return new InMemoryConsensusTransactionLog();
      case SEGMENTED:

        long _lgRas = _config.get(SettingsDeclarationClusterImpl.settingRaoasLong);

        int _iSpr = _config.get(SettingsDeclarationClusterImpl.settingRaodoeInteger);

        PartClipperService _spPartClipperService =
            (new PartClipperServiceFactory(_logProvider,
                _config.get(SettingsDeclarationClusterImpl.settingRaontgString))).newInstance();

        Path _pdPath = _lyuClusterMetaTopologyInfo.ralodeyPath(_namedDatabaseId.name());
        return _lifeSupport
            .add(new ConsensusTransactionLogSpreadImpl(_systemNanoClock, _fileSystemAbstraction,
                _smSyncableDataChannelMarshal, _iSpr, _jobScheduler,
                _lgRas, _logProvider, _memoryTracker, _pdPath,
                _spPartClipperService));
      default:

        throw new IllegalStateException("*** Error: 0aff0e15-3fba-4184-bdca-2f6d60d3ffa9");
    }
  }


  public ConsensusLogCacheService getCfiConsensusLogCacheService() {
    return this.cfiConsensusLogCacheService;
  }


  public ConsensusOperationsManager getConsensusOperationsManager() {
    return this.consensusOperationsManager;
  }


  public ConsensusTransactionLog getLrMonitoredConsensusTransactionLog() {
    return this.lrMonitoredConsensusTransactionLog;
  }


  public MemberNodesService getMmrMemberNodesService() {
    return this.mmrMemberNodesService;
  }


  public LeaderNodeScheduleWrapper getTalLeaderNodeScheduleWrapper() {
    return this.talLeaderNodeScheduleWrapper;
  }
}
