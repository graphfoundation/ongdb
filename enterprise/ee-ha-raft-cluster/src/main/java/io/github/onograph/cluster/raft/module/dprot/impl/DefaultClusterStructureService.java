package io.github.onograph.cluster.raft.module.dprot.impl;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.client.ClusterClientReceptionist;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceHandler;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.directory.DiscoveryManagementActor;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbMetaActor;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.DatabaseReadReplicaClusterStructureLoggingActor;
import io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterStructureManager;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructureActor;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterMembersWatcher;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.dbms.crash.CrashSignaler;
import io.github.onograph.dbms.crash.SysCrashCauseInfo;
import io.github.onograph.dbms.crash.SysCrashEvent;
import java.time.Clock;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.SafeLifecycle;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.CallableExecutor;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.util.VisibleForTesting;


public abstract class DefaultClusterStructureService extends SafeLifecycle implements
    ClusterStructureService, StartScheduler {


  protected final ActorStackManager acsmlcActorStackManager;


  protected final AkkaActorSystemRetry akkaActorSystemRetry;


  protected final CallableExecutor callableExecutor;


  protected final DiscoveryRetryManager cauarrestgDiscoveryRetryManager;


  protected final Config config;


  protected final CrashSignaler crashSignaler;


  protected final DatabaseStateService databaseStateService;


  protected final JobScheduler jobScheduler;


  protected final CoreClusterStructureServiceHandler linsrCoreClusterStructureServiceHandler = new CoreClusterStructureServiceHandler();


  protected final Log log;


  protected final ServerIdentity myidtyServerIdentity;


  protected final PointInTimeBackupService pointInTimeBackupService;


  protected final Log useLog;


  private final Clock clock;


  private final LogProvider logProvider;


  private final ClusterDataWatcher mdrClusterDataWatcher;


  private final ClusterMembersWatcher mscClusterMembersWatcher;


  protected volatile ActorRef coetpoActorRef;


  protected volatile ActorRef daassteActorRef;


  protected volatile ActorRef dieoActorRef;


  protected volatile ClusterStructureMeta glltlstClusterStructureMeta;


  protected volatile boolean isreai;


  public DefaultClusterStructureService(AkkaActorSystemRetry akkaActorSystemRetry, Clock _clock,
      Config _config, CrashSignaler crashSignaler, DatabaseStateService _databaseStateService,
      ServerIdentity _imServerIdentity, JobScheduler _jobScheduler, LogProvider _logProvider,
      ActorStackManager _lsaActorStackManager, Monitors _monitors,
      PointInTimeBackupService pointInTimeBackupService,
      DiscoveryRetryManager _sracDiscoveryRetryManager, LogProvider _useLogProvider) {
    this.acsmlcActorStackManager = _lsaActorStackManager;
    this.logProvider = _logProvider;
    this.cauarrestgDiscoveryRetryManager = _sracDiscoveryRetryManager;
    this.akkaActorSystemRetry = akkaActorSystemRetry;
    this.pointInTimeBackupService = pointInTimeBackupService;
    this.jobScheduler = _jobScheduler;
    this.callableExecutor = _jobScheduler.executor(Group.AKKA_HELPER);
    this.clock = _clock;
    this.config = _config;
    this.myidtyServerIdentity = _imServerIdentity;
    this.log = _logProvider.getLog(this.getClass());
    this.useLog = _useLogProvider.getLog(this.getClass());
    this.mdrClusterDataWatcher = _monitors.newMonitor(ClusterDataWatcher.class, new String[0]);
    this.glltlstClusterStructureMeta = this._negotogstClusterStructureMeta(_logProvider,
        this.linsrCoreClusterStructureServiceHandler);
    this.mscClusterMembersWatcher = _monitors.newMonitor(ClusterMembersWatcher.class,
        new String[0]);
    this.databaseStateService = _databaseStateService;
    this.crashSignaler = crashSignaler;
  }


  private ActorRef _cotogaoActorRef(ActorRef _atrActorRef, Cluster _cluster, ActorRef _dsaActorRef,
      ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<ConsensusGdbServerCoordinator> _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
      SourceQueueWithComplete<ClusterInitMeta> _sourceQueueWithCompleteSsbClusterInitMeta,
      SourceQueueWithComplete<CoreClusterStructure> _sourceQueueWithCompleteStCoreClusterStructure) {

    ClusterStructureManager _btClusterStructureManager = new ClusterStructureManager();

    Props _tcProps = CoreClusterStructureActor
        .prpProps(_atrActorRef, _btClusterStructureManager, _cluster, this.config, _dsaActorRef,
            this.myidtyServerIdentity, this.mdrClusterDataWatcher,
            this.mscClusterMembersWatcher,
            _rpiaoActorRef, _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
            _sourceQueueWithCompleteSsbClusterInitMeta,
            _sourceQueueWithCompleteStCoreClusterStructure);
    return this.acsmlcActorStackManager.apcnaroActorRef(_tcProps,
        io.github.onograph.TokenConstants.CC_CORE_TOPOLOGY_ACTOR);
  }


  private ActorRef _daasaatActorRef(ActorRef _atrActorRef, Cluster _cluster,
      ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsReadReplicateGdbMeta) {

    Props _saeProps =
        DiscoveryGdbMetaActor.prpProps(_atrActorRef, _cluster, this.mdrClusterDataWatcher,
            this.myidtyServerIdentity.serverId(), _rpiaoActorRef,
            _sourceQueueWithCompleteSsReadReplicateGdbMeta);
    return this.acsmlcActorStackManager.apcnaroActorRef(_saeProps,
        io.github.onograph.TokenConstants.CC_DATABASE_STATUS_ACTOR);
  }


  private ActorRef _dieoaoActorRef(ActorRef _atrActorRef, Cluster _cluster, ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> _sourceQueueWithCompleteSdMap) {

    Props _drcoyProps =
        DiscoveryManagementActor.prpProps(_atrActorRef, _cluster, this.mdrClusterDataWatcher,
            _rpiaoActorRef, _sourceQueueWithCompleteSdMap);
    return this.acsmlcActorStackManager.apcnaroActorRef(_drcoyProps,
        io.github.onograph.TokenConstants.CC_DIRECTORY_ACTOR);
  }


  private boolean _isDorea() {

    boolean _isVa;
    try {
      this.isreai = true;
      this.stop();
      this.start();

      boolean _isVa2 = true;
      return _isVa2;
    } catch (

        Throwable _throwable) {

      _isVa = false;
    } finally {
      this.isreai = false;
    }

    return _isVa;
  }


  private ClusterStructureMeta _negotogstClusterStructureMeta(LogProvider _logProvider,
      CoreClusterStructureServiceHandler _lsCoreClusterStructureServiceHandler) {
    Objects.requireNonNull(_lsCoreClusterStructureServiceHandler);
    return new ClusterStructureMeta(_lsCoreClusterStructureServiceHandler::noyleForDaSe,
        this.jobScheduler, _logProvider);
  }


  private void _oncetlmeeForCo(CoreClusterStructure _mtcCoreClusterStructure) {
    this.glltlstClusterStructureMeta.ontoueForDa(
        _mtcCoreClusterStructure.getTcDatabaseCoreClusterStructure());
    this.acsmlcActorStackManager.adsearsForCo(_mtcCoreClusterStructure.getCollectionMaAddress());
  }


  private void _pusitdaForAc(ActorRef... _sActorRefArray) {

    GdbServerPointInTime gdbServerPointInTime = this.cresespGdbServerPointInTime();

    ActorRef[] _actorRefArray = _sActorRefArray;

    int _iVar = _sActorRefArray.length;

    for (

        int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

      ActorRef _actorRef = _actorRefArray[_iVar2];
      _actorRef.tell(new ClusterDiscoveryInitiator(gdbServerPointInTime), ActorRef.noSender());
    }
  }


  private ActorRef _rereatlacActorRef(
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
      SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure) {

    ClusterClientReceptionist _clusterClientReceptionist = this.acsmlcActorStackManager.clecercoClusterClientReceptionist();

    Props _trrProps = DatabaseReadReplicaClusterStructureLoggingActor.prpProps(this.clock,
        _clusterClientReceptionist, this.config,
        _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
        _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure);
    return this.acsmlcActorStackManager.apcnaroActorRef(_trrProps,
        io.github.onograph.TokenConstants.CC_RR_TOPOLOGY_ACTOR);
  }

  @Override
  public Map<ServerId, GdbDiscoveryMetaCoreImpl> alcesrrMap() {
    return this.glltlstClusterStructureMeta.getMapIsbcsg();
  }

  @Override
  public Map<ServerId, DiscoveryGdbOperatorMetaWrapper> alcrstfrdbMap(
      NamedDatabaseId _namedDatabaseId) {
    return Map.copyOf(
        this.glltlstClusterStructureMeta.costfdteReadReplicateGdbMeta(_namedDatabaseId)
            .getMapMssd());
  }

  @Override
  public Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> alrarlMap() {
    return this.glltlstClusterStructureMeta.getMapIsbrrsg();
  }

  @Override
  public Map<ServerId, DiscoveryGdbOperatorMetaWrapper> alrarlstfdteMap(
      NamedDatabaseId _namedDatabaseId) {
    return Map.copyOf(
        this.glltlstClusterStructureMeta.rereasefdaReadReplicateGdbMeta(_namedDatabaseId)
            .getMapMssd());
  }

  @Override
  public DatabaseCoreClusterStructure cotogfdaDatabaseCoreClusterStructure(
      NamedDatabaseId _namedDatabaseId) {
    return this.glltlstClusterStructureMeta.cotogfdaDatabaseCoreClusterStructure(_namedDatabaseId);
  }


  protected abstract GdbServerPointInTime cresespGdbServerPointInTime();


  @VisibleForTesting
  public Cluster geaacueCluster() {
    return this.acsmlcActorStackManager.clsrCluster();
  }

  @Override
  public NodeServerMemberLeaderMeta geldNodeServerMemberLeaderMeta(
      NamedDatabaseId _namedDatabaseId) {
    return this.glltlstClusterStructureMeta.geldNodeServerMemberLeaderMeta(_namedDatabaseId);
  }


  @VisibleForTesting
  ClusterStructureMeta getGlltlstClusterStructureMeta() {
    return this.glltlstClusterStructureMeta;
  }

  @Override
  public boolean isHet() {
    return this.akkaActorSystemRetry.getIsHaty();
  }


  @VisibleForTesting
  public synchronized boolean isRerseta() {
    if (!State.RUN.equals(this.state())) {

      return false;
    } else {

      try {
        this.akkaActorSystemRetry.rettForStCa(this::_isDorea, io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.DefaultClusterStructureService.rettForStCa"));
        return true;
      } catch (

          Throwable _throwable) {

        this.crashSignaler.signal(
            new SysCrashEvent(_throwable, SysCrashCauseInfo.CCI_UNREC_DISC_ERR));
        return false;
      }
    }
  }

  @Override
  public abstract ClusterNodeRoleType lokreClusterNodeRoleType(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId);

  @Override
  public SocketAddress lopchadSocketAddress(ServerId _usraServerId)
      throws CatchupNodeNotFoundException {
    try {
      return this.cauarrestgDiscoveryRetryManager.apl(Objects::nonNull, () ->
      {
        return this.glltlstClusterStructureMeta.reectsraeSocketAddress(_usraServerId);
      });
    } catch (

        TimeoutException _timeoutException) {
      throw new CatchupNodeNotFoundException(_usraServerId);
    }
  }

  @Override
  public DiscoveryGdbOperatorMetaWrapper lopdbstDiscoveryGdbOperatorMetaWrapper(
      NamedDatabaseId _namedDatabaseId, ServerId _serverId) {
    return this.glltlstClusterStructureMeta.sttfoDiscoveryGdbOperatorMetaWrapper(_namedDatabaseId,
        _serverId);
  }

  @Override
  public void ondabesoForNa(NamedDatabaseId _namedDatabaseId) {
    this.reeleioForNa(_namedDatabaseId);

    ActorRef _ctaActorRef = this.coetpoActorRef;
    if (_ctaActorRef != null) {
      _ctaActorRef.tell(new GdbOffline(_namedDatabaseId), ActorRef.noSender());
    }
  }

  @Override
  public void ondasForNa(NamedDatabaseId _namedDatabaseId) {

    ActorRef _atcActorRef = this.coetpoActorRef;
    if (_atcActorRef != null) {
      _atcActorRef.tell(new GdbOnline(_namedDatabaseId), ActorRef.noSender());
    }
  }


  protected abstract void reeleioForNa(NamedDatabaseId _namedDatabaseId);

  @Override
  public DatabaseReadReplicaClusterStructure rereatlfodaDatabaseReadReplicaClusterStructure(
      NamedDatabaseId _namedDatabaseId) {
    return this.glltlstClusterStructureMeta.rereatlfodaDatabaseReadReplicaClusterStructure(
        _namedDatabaseId);
  }

  @Override
  public Future<?> restartNow() {
    if (this.isreai) {

    }

    return this.callableExecutor.submit(this::isRerseta);
  }

  @Override
  public ConsensusNodeId revrtmefsrConsensusNodeId(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId) {
    return this.glltlstClusterStructureMeta.revrtmefsrConsensusNodeId(_namedDatabaseId.databaseId(),
        _serverId);
  }

  @Override
  public ServerId revsvfrrmrServerId(ConsensusNodeId consensusNodeId) {
    return this.glltlstClusterStructureMeta.revsvfrrmrServerId(consensusNodeId);
  }

  @Override
  public ServerId seviServerId() {
    return this.myidtyServerIdentity.serverId();
  }

  @Override
  public void start0() {
    this.acsmlcActorStackManager.crectatssForSt(this);

    SourceQueueWithComplete<CoreClusterStructure> _sourceQueueWithCompleteCtsCoreClusterStructure =
        this.acsmlcActorStackManager.qumreSourceQueueWithComplete(this::_oncetlmeeForCo);

    ActorStackManager _actorStackManager = this.acsmlcActorStackManager;

    ClusterStructureMeta _clusterStructureMeta = this.glltlstClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> _sourceQueueWithCompleteSdMap =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::ondleueForMa);
    _actorStackManager = this.acsmlcActorStackManager;
    _clusterStructureMeta = this.glltlstClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<ClusterInitMeta> _sourceQueueWithCompleteSsbClusterInitMeta =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::onbtpseutForCl);
    _actorStackManager = this.acsmlcActorStackManager;
    _clusterStructureMeta = this.glltlstClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsdReadReplicateGdbMeta =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::ondstupForRe);
    _actorStackManager = this.acsmlcActorStackManager;
    _clusterStructureMeta = this.glltlstClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteStrDatabaseReadReplicaClusterStructure =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::ontoueForDa);
    _actorStackManager = this.acsmlcActorStackManager;
    _clusterStructureMeta = this.glltlstClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<ConsensusGdbServerCoordinator> _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::handleChange);

    Cluster _cluster = this.acsmlcActorStackManager.clsrCluster();

    ActorRef _rpiaoActorRef = this.acsmlcActorStackManager.relarActorRef();

    ActorRef _atrActorRef =
        this._rereatlacActorRef(_sourceQueueWithCompleteSsdReadReplicateGdbMeta,
            _sourceQueueWithCompleteStrDatabaseReadReplicaClusterStructure);
    this.daassteActorRef = this._daasaatActorRef(_atrActorRef, _cluster, _rpiaoActorRef,
        _sourceQueueWithCompleteSsdReadReplicateGdbMeta);
    this.coetpoActorRef =
        this._cotogaoActorRef(_atrActorRef, _cluster, this.daassteActorRef, _rpiaoActorRef,
            _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
            _sourceQueueWithCompleteSsbClusterInitMeta,
            _sourceQueueWithCompleteCtsCoreClusterStructure);
    this.dieoActorRef = this._dieoaoActorRef(_atrActorRef, _cluster, _rpiaoActorRef,
        _sourceQueueWithCompleteSdMap);
    this._pusitdaForAc(this.coetpoActorRef, this.dieoActorRef, this.daassteActorRef);
  }

  @Override
  public synchronized void stop0() throws Exception {
    this.coetpoActorRef = null;
    this.dieoActorRef = null;
    this.daassteActorRef = null;
    this.acsmlcActorStackManager.shtw();
    if (this.isreai) {
      this.glltlstClusterStructureMeta.clredForSe(this.seviServerId());
    } else {
      this.glltlstClusterStructureMeta = this._negotogstClusterStructureMeta(this.logProvider,
          this.linsrCoreClusterStructureServiceHandler);
    }
  }

  @Override
  public void sttchgForDaDa(DatabaseState _spDatabaseState, DatabaseState _snDatabaseState) {

    ActorRef _asActorRef = this.daassteActorRef;
    if (_asActorRef != null) {
      _asActorRef.tell(
          DiscoveryGdbOperatorMetaWrapper.froDiscoveryGdbOperatorMetaWrapper(_snDatabaseState),
          ActorRef.noSender());
    }
  }
}
