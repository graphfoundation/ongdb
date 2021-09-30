package io.github.onograph.cluster.raft.module.dprot.impl;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor;
import io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.time.Clock;
import java.util.Map;
import java.util.Objects;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.SafeLifecycle;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.util.VisibleForTesting;


public class AkkaClusterStructureClient extends SafeLifecycle implements ClusterStructureService {


  private final Clock clock;


  private final Config config;


  private final DatabaseStateService databaseStateService;


  private final ServerIdentity imServerIdentity;


  private final JobScheduler jobScheduler;


  private final LogProvider logProvider;


  private final ActorStackManager lsaActorStackManager;


  private final PointInTimeBackupService pointInTimeBackupService;


  private volatile ClusterStructureMeta gtsClusterStructureMeta;


  private volatile ActorRef tcActorRef;


  AkkaClusterStructureClient(Clock _clock, Config _config,
      DatabaseStateService _databaseStateService, ServerIdentity _imServerIdentity,
      JobScheduler _jobScheduler, LogProvider _logProvider, ActorStackManager _lsaActorStackManager,
      PointInTimeBackupService pointInTimeBackupService) {
    this.config = _config;
    this.imServerIdentity = _imServerIdentity;
    this.lsaActorStackManager = _lsaActorStackManager;
    this.pointInTimeBackupService = pointInTimeBackupService;
    this.logProvider = _logProvider;
    this.jobScheduler = _jobScheduler;
    this.gtsClusterStructureMeta = _negotogstClusterStructureMeta(_jobScheduler, _logProvider);
    this.clock = _clock;
    this.databaseStateService = _databaseStateService;
  }


  private static ClusterStructureMeta _negotogstClusterStructureMeta(JobScheduler _jobScheduler,
      LogProvider _logProvider) {
    return new ClusterStructureMeta((ignored1, ignored2) ->
    {
    }, _jobScheduler, _logProvider);
  }


  private void _sttoat() {

    ActorStackManager _actorStackManager = this.lsaActorStackManager;
    Objects.requireNonNull(_actorStackManager);

    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.ClusterActorBuilder _fccClusterActorBuilder =
        ClusterActorService.cleceporClusterActorServiceClusterActorBuilder(
            _actorStackManager::clecestsClusterClientSettings);

    ActorRef _mccActorRef =
        this.lsaActorStackManager.apcnaroActorRef(
            ClusterActorService.prpProps(_fccClusterActorBuilder),
            io.github.onograph.TokenConstants.RESTARTING_CLUSTER_CLIENT);
    _actorStackManager = this.lsaActorStackManager;

    ClusterStructureMeta _clusterStructureMeta = this.gtsClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<DatabaseCoreClusterStructure> _sourceQueueWithCompleteStcDatabaseCoreClusterStructure =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::ontoueForDa);
    _actorStackManager = this.lsaActorStackManager;
    _clusterStructureMeta = this.gtsClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteStrDatabaseReadReplicaClusterStructure =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::ontoueForDa);
    _actorStackManager = this.lsaActorStackManager;
    _clusterStructureMeta = this.gtsClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> _sourceQueueWithCompleteSdMap =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::ondleueForMa);
    _actorStackManager = this.lsaActorStackManager;
    _clusterStructureMeta = this.gtsClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsdReadReplicateGdbMeta =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::ondstupForRe);
    _actorStackManager = this.lsaActorStackManager;
    _clusterStructureMeta = this.gtsClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);

    SourceQueueWithComplete<ConsensusGdbServerCoordinator> _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator =
        _actorStackManager.qumreSourceQueueWithComplete(_clusterStructureMeta::handleChange);

    GdbServerPointInTime gdbServerPointInTime = this.pointInTimeBackupService.takePointInTimeImage(
        this.databaseStateService, Map.of());

    Props _tcProps = ReadReplicaClientStructureActor
        .prpProps(_mccActorRef, this.clock, this.config, gdbServerPointInTime, this.logProvider,
            this.imServerIdentity.serverId(),
            _sourceQueueWithCompleteSdMap, _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
            _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
            _sourceQueueWithCompleteStcDatabaseCoreClusterStructure,
            _sourceQueueWithCompleteStrDatabaseReadReplicaClusterStructure);
    this.tcActorRef = this.lsaActorStackManager.apcnaroActorRef(_tcProps,
        io.github.onograph.TokenConstants.CC_CLIENT_TOPOLOGY_ACTOR);
  }

  @Override
  public Map<ServerId, GdbDiscoveryMetaCoreImpl> alcesrrMap() {
    return this.gtsClusterStructureMeta.getMapIsbcsg();
  }

  @Override
  public Map<ServerId, DiscoveryGdbOperatorMetaWrapper> alcrstfrdbMap(
      NamedDatabaseId _namedDatabaseId) {
    return Map.copyOf(
        this.gtsClusterStructureMeta.costfdteReadReplicateGdbMeta(_namedDatabaseId).getMapMssd());
  }

  @Override
  public Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> alrarlMap() {
    return this.gtsClusterStructureMeta.getMapIsbrrsg();
  }

  @Override
  public Map<ServerId, DiscoveryGdbOperatorMetaWrapper> alrarlstfdteMap(
      NamedDatabaseId _namedDatabaseId) {
    return Map.copyOf(
        this.gtsClusterStructureMeta.rereasefdaReadReplicateGdbMeta(_namedDatabaseId).getMapMssd());
  }

  @Override
  public DatabaseCoreClusterStructure cotogfdaDatabaseCoreClusterStructure(
      NamedDatabaseId _namedDatabaseId) {
    return this.gtsClusterStructureMeta.cotogfdaDatabaseCoreClusterStructure(_namedDatabaseId);
  }

  @Override
  public NodeServerMemberLeaderMeta geldNodeServerMemberLeaderMeta(
      NamedDatabaseId _namedDatabaseId) {
    return this.gtsClusterStructureMeta.geldNodeServerMemberLeaderMeta(_namedDatabaseId);
  }


  @VisibleForTesting
  ClusterStructureMeta getGtsClusterStructureMeta() {
    return this.gtsClusterStructureMeta;
  }

  @Override
  public boolean isHet() {
    return true;
  }

  @Override
  public ClusterNodeRoleType lokreClusterNodeRoleType(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId) {
    return this.gtsClusterStructureMeta.rolClusterNodeRoleType(_namedDatabaseId, _serverId);
  }

  @Override
  public SocketAddress lopchadSocketAddress(ServerId _usraServerId)
      throws CatchupNodeNotFoundException {

    SocketAddress _avrieSocketAddress = this.gtsClusterStructureMeta.reectsraeSocketAddress(
        _usraServerId);
    if (_avrieSocketAddress == null) {
      throw new CatchupNodeNotFoundException(_usraServerId);
    } else {
      return _avrieSocketAddress;
    }
  }

  @Override
  public DiscoveryGdbOperatorMetaWrapper lopdbstDiscoveryGdbOperatorMetaWrapper(
      NamedDatabaseId _namedDatabaseId, ServerId _serverId) {
    return this.gtsClusterStructureMeta.sttfoDiscoveryGdbOperatorMetaWrapper(_namedDatabaseId,
        _serverId);
  }

  @Override
  public void ondabesoForNa(NamedDatabaseId _namedDatabaseId) {

    ActorRef _atcActorRef = this.tcActorRef;
    if (_atcActorRef != null) {
      _atcActorRef.tell(new GdbOffline(_namedDatabaseId), ActorRef.noSender());
    }
  }

  @Override
  public void ondasForNa(NamedDatabaseId _namedDatabaseId) {

    ActorRef _atcActorRef = this.tcActorRef;
    if (_atcActorRef != null) {
      _atcActorRef.tell(new GdbOnline(_namedDatabaseId), ActorRef.noSender());
    }
  }

  @Override
  public DatabaseReadReplicaClusterStructure rereatlfodaDatabaseReadReplicaClusterStructure(
      NamedDatabaseId _namedDatabaseId) {
    return this.gtsClusterStructureMeta.rereatlfodaDatabaseReadReplicaClusterStructure(
        _namedDatabaseId);
  }

  @Override
  public ConsensusNodeId revrtmefsrConsensusNodeId(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId) {
    return this.gtsClusterStructureMeta.revrtmefsrConsensusNodeId(_namedDatabaseId.databaseId(),
        _serverId);
  }

  @Override
  public ServerId revsvfrrmrServerId(ConsensusNodeId consensusNodeId) {
    return this.gtsClusterStructureMeta.revsvfrrmrServerId(consensusNodeId);
  }

  @Override
  public ServerId seviServerId() {
    return this.imServerIdentity.serverId();
  }

  @Override
  public void start0() {
    this.lsaActorStackManager.crecnaost();
    this._sttoat();
  }

  @Override
  public void stop0() throws Exception {
    this.tcActorRef = null;
    this.lsaActorStackManager.shtw();
    this.gtsClusterStructureMeta = _negotogstClusterStructureMeta(this.jobScheduler,
        this.logProvider);
  }

  @Override
  public void sttchgForDaDa(DatabaseState _psDatabaseState, DatabaseState _snDatabaseState) {

    ActorRef _atcActorRef = this.tcActorRef;
    if (_atcActorRef != null) {
      _atcActorRef.tell(
          DiscoveryGdbOperatorMetaWrapper.froDiscoveryGdbOperatorMetaWrapper(_snDatabaseState),
          ActorRef.noSender());
    }
  }
}
