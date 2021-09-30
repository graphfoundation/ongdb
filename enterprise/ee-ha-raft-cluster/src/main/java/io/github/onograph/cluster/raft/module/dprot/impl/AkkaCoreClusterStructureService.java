package io.github.onograph.cluster.raft.module.dprot.impl;

import akka.actor.ActorRef;
import akka.pattern.AskTimeoutException;
import akka.pattern.Patterns;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.directory.SetupLeaderMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import io.github.onograph.dbms.crash.CrashSignaler;
import java.time.Clock;
import java.time.Duration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;


public class AkkaCoreClusterStructureService extends DefaultClusterStructureService implements
    CoreClusterStructureService {


  private final CoreNodeServerIdentity imCoreNodeServerIdentity;


  private final Map<NamedDatabaseId, NodeServerMemberLeaderMeta> mapIdbllnn = new ConcurrentHashMap();

  public AkkaCoreClusterStructureService(Config _config,
      CoreNodeServerIdentity _imCoreNodeServerIdentity, ActorStackManager _lsaActorStackManager,
      LogProvider _logProvider, LogProvider _usLogProvider,
      DiscoveryRetryManager _sracDiscoveryRetryManager, AkkaActorSystemRetry akkaActorSystemRetry,
      PointInTimeBackupService pointInTimeBackupService, JobScheduler _jobScheduler, Clock _clock,
      Monitors _monitors, DatabaseStateService _databaseStateService, CrashSignaler crashSignaler) {
    super(akkaActorSystemRetry, _clock, _config, crashSignaler, _databaseStateService,
        _imCoreNodeServerIdentity, _jobScheduler, _logProvider,
        _lsaActorStackManager, _monitors, pointInTimeBackupService, _sracDiscoveryRetryManager,
        _usLogProvider);
    this.imCoreNodeServerIdentity = _imCoreNodeServerIdentity;
  }


  private ConsensusIdStatusType _chcouoConsensusIdStatusType(Object _obRsos) {
    if (!(_obRsos instanceof ConsensusIdStatusType)) {

      throw new IllegalArgumentException("*** Error: 24e68117-1153-46b3-8381-1f24f2b105d1");
    } else {
      return (ConsensusIdStatusType) _obRsos;
    }
  }


  private Map<DatabaseId, NodeServerMemberLeaderMeta> _lolrsssMap() {
    return this.mapIdbllnn.entrySet().stream().collect(Collectors.toUnmodifiableMap((entry) ->
    {
      return entry.getKey()
          .databaseId();
    }, Entry::getValue));
  }


  private void _sedlarifForNoNa(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta,
      NamedDatabaseId _namedDatabaseId) {

    ActorRef _adActorRef = this.dieoActorRef;
    if (_adActorRef != null) {
      _adActorRef.tell(new SetupLeaderMeta(_ilNodeServerMemberLeaderMeta, _namedDatabaseId),
          ActorRef.noSender());
    }
  }

  @Override
  public void adlccrtolnForCo(
      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler _lseeCoreStructureHandler) {
    this.linsrCoreClusterStructureServiceHandler.adcrtolnForCo(_lseeCoreStructureHandler);

    DatabaseCoreClusterStructure _databaseCoreClusterStructure =
        this.cotogfdaDatabaseCoreClusterStructure(_lseeCoreStructureHandler.nadaiNamedDatabaseId());

    ClusterStructureMeta _clusterStructureMeta = this.glltlstClusterStructureMeta;
    Objects.requireNonNull(_clusterStructureMeta);
    _lseeCoreStructureHandler.oncetlchForSe(
        _databaseCoreClusterStructure.reoeSet(_clusterStructureMeta::revrtmefsrConsensusNodeId));
  }

  @Override
  protected GdbServerPointInTime cresespGdbServerPointInTime() {
    return this.pointInTimeBackupService.takePointInTimeImage(this.databaseStateService,
        this._lolrsssMap());
  }

  @Override
  public void hadspdwForNa(long _lgT, NamedDatabaseId _namedDatabaseId) {
    this.mapIdbllnn.computeIfPresent(_namedDatabaseId, (databaseId, currentLeaderInfo) ->
    {

      boolean _isTflw =
          Objects.equals(this.imCoreNodeServerIdentity.ratmmriConsensusNodeId(_namedDatabaseId),
              currentLeaderInfo.getImConsensusNodeId()) &&
              _lgT == currentLeaderInfo.getLgT();
      if (_isTflw) {

        NodeServerMemberLeaderMeta _ilnNodeServerMemberLeaderMeta = currentLeaderInfo.stpdwNodeServerMemberLeaderMeta();
        this._sedlarifForNoNa(_ilnNodeServerMemberLeaderMeta, _namedDatabaseId);
        return _ilnNodeServerMemberLeaderMeta;
      } else {
        return currentLeaderInfo;
      }
    });
  }

  @Override
  public boolean isCaboadaForNa(NamedDatabaseId _namedDatabaseId) {
    return this.glltlstClusterStructureMeta.getSbClusterInitMeta().isCaboartForNa(_namedDatabaseId);
  }

  @Override
  public boolean isDiboadaForNa(NamedDatabaseId _namedDatabaseId) {

    ConsensusNodeId _mrtConsensusNodeId = this.revrtmefsrConsensusNodeId(_namedDatabaseId,
        this.imCoreNodeServerIdentity.serverId());
    return this.glltlstClusterStructureMeta.getSbClusterInitMeta()
        .isMerbsprfForNaCo(_mrtConsensusNodeId, _namedDatabaseId);
  }

  @Override
  public ClusterNodeRoleType lokreClusterNodeRoleType(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId) {

    NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta = this.mapIdbllnn.get(
        _namedDatabaseId);

    ConsensusNodeId consensusNodeId = this.glltlstClusterStructureMeta.revrtmefsrConsensusNodeId(
        _namedDatabaseId.databaseId(), _serverId);
    return _ilNodeServerMemberLeaderMeta != null && Objects.equals(consensusNodeId,
        _ilNodeServerMemberLeaderMeta.getImConsensusNodeId())
        ? ClusterNodeRoleType.LEADER
        : this.glltlstClusterStructureMeta.rolClusterNodeRoleType(_namedDatabaseId, _serverId);
  }

  @Override
  public SocketAddress loprasSocketAddress(ConsensusNodeId _treConsensusNodeId) {
    return this.glltlstClusterStructureMeta.gecrsvifOptional(_treConsensusNodeId)
        .map(GdbDiscoveryMetaCoreImpl::getSrSocketAddress).orElse(null);
  }

  @Override
  public void onrtmekwForNaCo(ConsensusNodeId consensusNodeId, NamedDatabaseId _namedDatabaseId) {

    ActorRef _atcActorRef = this.coetpoActorRef;
    if (_atcActorRef != null) {
      _atcActorRef.tell(new ConsensusNodeMessage(consensusNodeId, _namedDatabaseId),
          ActorRef.noSender());
    }
  }

  @Override
  public ConsensusIdStatusType pulhrfidConsensusIdStatusType(
      ConsensusMemberGroupId consensusMemberGroupId, ConsensusNodeId _imConsensusNodeId)
      throws TimeoutException {

    ActorRef _atcActorRef = this.coetpoActorRef;
    if (_atcActorRef != null) {

      Duration _tmotDuration = this.config.get(
          SettingsDeclarationClusterSystemImpl.settingRadimDuration);

      SetupConsensusDatabaseId _rqetSetupConsensusDatabaseId = new SetupConsensusDatabaseId(
          consensusMemberGroupId, _imConsensusNodeId, _tmotDuration);

      CompletableFuture _jsiCompletableFuture =
          Patterns.ask(_atcActorRef, _rqetSetupConsensusDatabaseId, _tmotDuration)
              .thenApplyAsync(this::_chcouoConsensusIdStatusType, this.callableExecutor)
              .toCompletableFuture();

      try {
        return (ConsensusIdStatusType) _jsiCompletableFuture.get(_tmotDuration.toNanos(),
            TimeUnit.NANOSECONDS);
      } catch (

          InterruptedException | ExecutionException | CompletionException _exception) {
        if (_exception.getCause() instanceof AskTimeoutException) {

          throw new TimeoutException("*** Error: 5888ed1d-f165-4013-843d-eab4a76bcd5b");
        } else {
          throw new RuntimeException(_exception.getCause());
        }
      }
    } else {
      return ConsensusIdStatusType.POS_COMPUB;
    }
  }

  @Override
  protected void reeleioForNa(NamedDatabaseId _namedDatabaseId) {

    NodeServerMemberLeaderMeta _irNodeServerMemberLeaderMeta = this.mapIdbllnn.remove(
        _namedDatabaseId);
    if (_irNodeServerMemberLeaderMeta != null) {

    }
  }

  @Override
  public void reellctolsrForCo(
      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler _lseeCoreStructureHandler) {
    this.linsrCoreClusterStructureServiceHandler.reectolsrForCo(_lseeCoreStructureHandler);
  }

  @Override
  public void seldForNoNa(NamedDatabaseId _namedDatabaseId,
      NodeServerMemberLeaderMeta _ilnNodeServerMemberLeaderMeta) {
    this.mapIdbllnn.compute(_namedDatabaseId, (databaseId, leaderInfo) ->
    {

      NodeServerMemberLeaderMeta _ilcNodeServerMemberLeaderMeta =
          leaderInfo != null ? leaderInfo
              : NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
      if (_ilcNodeServerMemberLeaderMeta.getLgT() < _ilnNodeServerMemberLeaderMeta.getLgT()) {

        this._sedlarifForNoNa(_ilnNodeServerMemberLeaderMeta, _namedDatabaseId);
        return _ilnNodeServerMemberLeaderMeta;
      } else {
        return _ilcNodeServerMemberLeaderMeta;
      }
    });
  }
}
