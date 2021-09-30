package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.AbstractActorWithTimers;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.client.ClusterClient.Publish;
import akka.japi.pf.ReceiveBuilder;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.ConsensusNodeMessage;
import io.github.onograph.cluster.raft.module.dprot.impl.GdbOffline;
import io.github.onograph.cluster.raft.module.dprot.impl.GdbOnline;
import io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import java.time.Clock;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ReadReplicaClientStructureActor extends AbstractActorWithTimers {


  public static final String TITLE = io.github.onograph.TokenConstants.CC_CLIENT_TOPOLOGY_ACTOR;


  private static final String RERH = io.github.onograph.I18N.format(
      "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.var");


  private static final int RESEREL = 3;


  private final ClusterStructureMetaManager<DatabaseCoreClusterStructure> clusterStructureMetaManagerCtsDatabaseCoreClusterStructure;


  private final ClusterStructureMetaManager<ReadReplicateGdbMeta> clusterStructureMetaManagerSsdcReadReplicateGdbMeta;


  private final ClusterStructureMetaManager<ReadReplicateGdbMeta> clusterStructureMetaManagerSsdrrReadReplicateGdbMeta;


  private final ClusterStructureMetaManager<DatabaseReadReplicaClusterStructure> clusterStructureMetaManagerStrDatabaseReadReplicaClusterStructure;


  private final Config config;


  private final GdbServerPointInTime gdbServerPointInTime;


  private final Log log;


  private final Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> mapSdldd;


  private final ActorRef mccActorRef;


  private final ServerId mslServerId;


  private final Duration rfehDuration;


  private final Set<DatabaseId> setSdDatabaseId = new HashSet();


  private final SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> sourceQueueWithCompleteSdMap;


  private final SourceQueueWithComplete<ConsensusGdbServerCoordinator> sourceQueueWithCompleteSmrConsensusGdbServerCoordinator;


  private ReadReplicaClientStructureActor(ActorRef _ccmActorRef, Clock _clock, Config _config,
      GdbServerPointInTime gdbServerPointInTime, LogProvider _logProvider, ServerId _mslServerId,
      SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteRtsDatabaseReadReplicaClusterStructure,
      SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> _sourceQueueWithCompleteSilMap,
      SourceQueueWithComplete<ConsensusGdbServerCoordinator> _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsReadReplicateGdbMeta,
      SourceQueueWithComplete<DatabaseCoreClusterStructure> _sourceQueueWithCompleteStcDatabaseCoreClusterStructure) {
    this.gdbServerPointInTime = gdbServerPointInTime;
    this.rfehDuration = _config.get(SettingsDeclarationClusterImpl.settingCleorsDuration);
    this.mslServerId = _mslServerId;

    Duration _ltmDuration = this.rfehDuration.multipliedBy(3L);
    this.clusterStructureMetaManagerCtsDatabaseCoreClusterStructure =
        ClusterStructureMetaManager.focrtoeClusterStructureMetaManager(_clock, _logProvider,
            _ltmDuration,
            _sourceQueueWithCompleteStcDatabaseCoreClusterStructure);
    this.clusterStructureMetaManagerStrDatabaseReadReplicaClusterStructure =
        ClusterStructureMetaManager.forarltogClusterStructureMetaManager(_clock, _logProvider,
            _ltmDuration,
            _sourceQueueWithCompleteRtsDatabaseReadReplicaClusterStructure);
    this.clusterStructureMetaManagerSsdcReadReplicateGdbMeta =
        ClusterStructureMetaManager.focrdassClusterStructureMetaManager(_clock, _logProvider,
            _ltmDuration,
            _sourceQueueWithCompleteSsReadReplicateGdbMeta);
    this.clusterStructureMetaManagerSsdrrReadReplicateGdbMeta =
        ClusterStructureMetaManager.forarldasstClusterStructureMetaManager(_clock, _logProvider,
            _ltmDuration,
            _sourceQueueWithCompleteSsReadReplicateGdbMeta);
    this.sourceQueueWithCompleteSdMap = _sourceQueueWithCompleteSilMap;
    this.sourceQueueWithCompleteSmrConsensusGdbServerCoordinator = _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator;
    this.mccActorRef = _ccmActorRef;
    this.mapSdldd = new HashMap();
    this.config = _config;
    this.log = _logProvider.getLog(this.getClass());
  }


  public static Props prpProps(ActorRef _ccmActorRef, Clock _clock, Config _config,
      GdbServerPointInTime gdbServerPointInTime, LogProvider _logProvider, ServerId _mslServerId,
      SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> _sourceQueueWithCompleteSdMap,
      SourceQueueWithComplete<ConsensusGdbServerCoordinator> _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsReadReplicateGdbMeta,
      SourceQueueWithComplete<DatabaseCoreClusterStructure> _sourceQueueWithCompleteStcDatabaseCoreClusterStructure,
      SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteStrDatabaseReadReplicaClusterStructure) {
    return Props.create(ReadReplicaClientStructureActor.class, () ->
    {
      return new ReadReplicaClientStructureActor(_ccmActorRef,
          _clock, _config, gdbServerPointInTime, _logProvider, _mslServerId,
          _sourceQueueWithCompleteStrDatabaseReadReplicaClusterStructure,
          _sourceQueueWithCompleteSdMap,
          _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
          _sourceQueueWithCompleteSsReadReplicateGdbMeta,
          _sourceQueueWithCompleteStcDatabaseCoreClusterStructure);
    });
  }


  private void _hadrrh() {
    this.clusterStructureMetaManagerCtsDatabaseCoreClusterStructure.prss();
    this.clusterStructureMetaManagerStrDatabaseReadReplicaClusterStructure.prss();
    this._sererpi();
  }


  private void _haedbstdmaForGd(GdbOnline m) {
    if (this.setSdDatabaseId.add(m.getNamedDatabaseId().databaseId())) {
      this._sererpi();
    }
  }


  private void _haedbstdmaForGd(GdbOffline m) {
    if (this.setSdDatabaseId.remove(m.getNamedDatabaseId().databaseId())) {
      this._sererpi();
    }
  }


  private void _haelldbstupForDi(
      DiscoveryGdbOperatorMetaWrapper _udtDiscoveryGdbOperatorMetaWrapper) {
    if (_udtDiscoveryGdbOperatorMetaWrapper.getOperatorState()
        == OperatorStateEnterpriseTypeImpl.SETI_D) {
      this.mapSdldd.remove(_udtDiscoveryGdbOperatorMetaWrapper.getDatabaseId());
    } else {
      this.mapSdldd.put(_udtDiscoveryGdbOperatorMetaWrapper.getDatabaseId(),
          _udtDiscoveryGdbOperatorMetaWrapper);
    }
  }


  private void _haeridrmnForCo(ConsensusGdbServerCoordinator _mpigConsensusGdbServerCoordinator) {
    this.sourceQueueWithCompleteSmrConsensusGdbServerCoordinator.offer(
        _mpigConsensusGdbServerCoordinator);
  }


  private void _haermrknmaForCo(ConsensusNodeMessage m) {
    if (this.setSdDatabaseId.add(m.getNamedDatabaseId().databaseId())) {
      this._sererpi();
    }
  }


  private void _haertdasueForRe(ReadReplicateGdbMeta _udtReadReplicateGdbMeta) {
    if (_udtReadReplicateGdbMeta.getIsSc()) {
      this.clusterStructureMetaManagerSsdcReadReplicateGdbMeta.ofeForT(_udtReadReplicateGdbMeta);
    } else {
      this.clusterStructureMetaManagerSsdrrReadReplicateGdbMeta.ofeForT(_udtReadReplicateGdbMeta);
    }
  }


  private void _sedtceForOb(Object m) {
    this.mccActorRef.tell(new Publish(io.github.onograph.TokenConstants.RR_TOPIC, m),
        this.getSelf());
  }


  private void _sererpi() {

    Set<DatabaseId> _setIdDatabaseId = Set.copyOf(this.setSdDatabaseId);

    GdbDiscoveryMetaReadReplicaImpl _rriGdbDiscoveryMetaReadReplicaImpl =
        GdbDiscoveryMetaReadReplicaImpl.froGdbDiscoveryMetaReadReplicaImpl(this.config,
            _setIdDatabaseId);

    UpdateReadReplicaInfo _mrUpdateReadReplicaInfo =
        new UpdateReadReplicaInfo(this.getSelf(), _rriGdbDiscoveryMetaReadReplicaImpl,
            this.mapSdldd, this.mccActorRef, this.mslServerId);
    this._sedtceForOb(_mrUpdateReadReplicaInfo);
  }

  @Override
  public Receive createReceive() {

    ReceiveBuilder _receiveBuilder = ReceiveBuilder.create();

    ClusterStructureMetaManager _clusterStructureMetaManager = this.clusterStructureMetaManagerCtsDatabaseCoreClusterStructure;
    Objects.requireNonNull(_clusterStructureMetaManager);
    _receiveBuilder = _receiveBuilder.match(DatabaseCoreClusterStructure.class,
        _clusterStructureMetaManager::ofeForT);
    _clusterStructureMetaManager = this.clusterStructureMetaManagerStrDatabaseReadReplicaClusterStructure;
    Objects.requireNonNull(_clusterStructureMetaManager);
    return _receiveBuilder.match(DatabaseReadReplicaClusterStructure.class,
            _clusterStructureMetaManager::ofeForT).match(LeaderMeta.class, (msg) ->
        {
          this.sourceQueueWithCompleteSdMap.offer(msg.getMapLaesdn());
        }).match(ReadReplicateGdbMeta.class, this::_haertdasueForRe)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.StackStructureUA.class,
            (ignored) ->
            {
              this._hadrrh();
            }).match(GdbOnline.class, this::_haedbstdmaForGd)
        .match(ConsensusNodeMessage.class, this::_haermrknmaForCo)
        .match(GdbOffline.class, this::_haedbstdmaForGd)
        .match(DiscoveryGdbOperatorMetaWrapper.class, this::_haelldbstupForDi)
        .match(ConsensusGdbServerCoordinator.class, this::_haeridrmnForCo).build();
  }

  @Override
  public void postStop() {

    RemoveReadReplicaNode m = new RemoveReadReplicaNode(this.mccActorRef);

    this._sedtceForOb(m);
  }

  @Override
  public void preStart() {
    this.getTimers().startPeriodicTimer(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.startPeriodicTimer"),
        io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.StackStructureUA.IT,
        this.rfehDuration);

    Set<DatabaseId> _setIdDatabaseId = this.gdbServerPointInTime.divldasSet();
    this.setSdDatabaseId.addAll(_setIdDatabaseId);
    this._sererpi();
  }


  private static class StackStructureUA {


    private static final io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.StackStructureUA IT =
        new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.StackStructureUA();
  }
}
