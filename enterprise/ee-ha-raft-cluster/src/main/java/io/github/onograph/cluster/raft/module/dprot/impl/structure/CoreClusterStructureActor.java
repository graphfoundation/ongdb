package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.ActorRef;
import akka.actor.Address;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.Member;
import akka.cluster.UniqueAddress;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.AbstractActorLoggingAndTimersImpl;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryInitiator;
import io.github.onograph.cluster.raft.module.dprot.impl.ConsensusNodeMessage;
import io.github.onograph.cluster.raft.module.dprot.impl.GdbOffline;
import io.github.onograph.cluster.raft.module.dprot.impl.GdbOnline;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterMembersWatcher;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.util.VisibleForTesting;


public class CoreClusterStructureActor extends AbstractActorLoggingAndTimersImpl {


  public static final String TITLE = io.github.onograph.TokenConstants.CC_CORE_TOPOLOGY_ACTOR;


  private final UniqueAddress acmUniqueAddress;


  private final ActorRef airActorRef;


  private final ActorRef amActorRef;


  private final ActorRef atrrActorRef;


  private final ClusterStructureManager btClusterStructureManager;


  private final Config config;


  private final ActorRef maActorRef;


  private final SourceQueueWithComplete<ConsensusGdbServerCoordinator> sourceQueueWithCompleteSmrConsensusGdbServerCoordinator;


  private final SourceQueueWithComplete<ClusterInitMeta> sourceQueueWithCompleteSsbClusterInitMeta;


  private final SourceQueueWithComplete<CoreClusterStructure> sourceQueueWithCompleteSutCoreClusterStructure;


  private ConsensusMessageCoordinator dmConsensusMessageCoordinator;


  private StructureInfo dmStructureInfo;


  private boolean isOvcisoh;


  private boolean isUm;


  private Map<ConsensusMemberGroupId, ConsensusNodeId> mapBrcc;


  private Set<DatabaseId> setIdkDatabaseId = Collections.emptySet();


  private Set<ServerId> setSkServerId = Collections.emptySet();


  private ViewClusterInfo vcViewClusterInfo;


  private CoreClusterStructureActor(ActorRef _asdActorRef, ActorRef _atrrActorRef,
      ClusterStructureManager _btClusterStructureManager, Cluster _cluster, Config _config,
      ServerIdentity _imServerIdentity, ClusterDataWatcher _mdrClusterDataWatcher,
      ClusterMembersWatcher _mscClusterMembersWatcher, ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<ConsensusGdbServerCoordinator> _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
      SourceQueueWithComplete<ClusterInitMeta> _sourceQueueWithCompleteSsbClusterInitMeta,
      SourceQueueWithComplete<CoreClusterStructure> _sourceQueueWithCompleteSutCoreClusterStructure) {
    this.sourceQueueWithCompleteSutCoreClusterStructure = _sourceQueueWithCompleteSutCoreClusterStructure;
    this.sourceQueueWithCompleteSsbClusterInitMeta = _sourceQueueWithCompleteSsbClusterInitMeta;
    this.sourceQueueWithCompleteSmrConsensusGdbServerCoordinator = _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator;
    this.atrrActorRef = _atrrActorRef;
    this.btClusterStructureManager = _btClusterStructureManager;

    int _iMchar = _config.get(SettingsDeclarationClusterImpl.settingMiuetzueInteger);
    this.dmStructureInfo = StructureInfo.EMT_STRUCTURE_INFO;
    this.mapBrcc = Map.of();
    this.vcViewClusterInfo = ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    this.acmUniqueAddress = _cluster.selfUniqueAddress();
    this.config = _config;
    this.amActorRef =
        this.getContext().actorOf(
            ConsensusNodeCoordinatorActor.prpProps(this.getSelf(), _cluster,
                _imServerIdentity.serverId(), _mdrClusterDataWatcher,
                _rpiaoActorRef));
    this.maActorRef = this.getContext()
        .actorOf(
            DiscoveryMetaActor.prpProps(this.amActorRef, _asdActorRef, this.getSelf(), _cluster,
                _config, _mdrClusterDataWatcher,
                _imServerIdentity.serverId(), _rpiaoActorRef));

    ActorRef _daActorRef = this.getContext()
        .actorOf(CleanupUnreachableActor.prpProps(_cluster, _config));
    this.getContext().actorOf(
        GlobalMetaActor.prpProps(_daActorRef, this.maActorRef, this.getSelf(), _cluster, _config,
            _mscClusterMembersWatcher));
    this.airActorRef =
        this.getContext().actorOf(
            ConsensusDatabaseIdActor.prpProps(this.getSelf(), _cluster, _iMchar,
                _mdrClusterDataWatcher, _rpiaoActorRef));
    _cluster.registerOnMemberUp(this::onmeeup);
  }


  public static Props prpProps(ActorRef _atrActorRef,
      ClusterStructureManager _btClusterStructureManager, Cluster _cluster, Config _config,
      ActorRef _dsaActorRef, ServerIdentity _imServerIdentity,
      ClusterDataWatcher _mdrClusterDataWatcher, ClusterMembersWatcher _mscClusterMembersWatcher,
      ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<ConsensusGdbServerCoordinator> _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
      SourceQueueWithComplete<ClusterInitMeta> _sourceQueueWithCompleteSsbClusterInitMeta,
      SourceQueueWithComplete<CoreClusterStructure> _sourceQueueWithCompleteSutCoreClusterStructure) {
    return Props.create(CoreClusterStructureActor.class, () ->
    {
      return new CoreClusterStructureActor(_dsaActorRef, _atrActorRef,
          _btClusterStructureManager, _cluster, _config, _imServerIdentity, _mdrClusterDataWatcher,
          _mscClusterMembersWatcher, _rpiaoActorRef,
          _sourceQueueWithCompleteSmrConsensusGdbServerCoordinator,
          _sourceQueueWithCompleteSsbClusterInitMeta,
          _sourceQueueWithCompleteSutCoreClusterStructure);
    });
  }


  private void _bultolyForDa(DatabaseId _databaseId) {

    ConsensusMemberGroupId consensusMemberGroupId = ConsensusMemberGroupId.froConsensusMemberGroupId(
        _databaseId);
    consensusMemberGroupId =
        this.mapBrcc.containsKey(consensusMemberGroupId) ? consensusMemberGroupId : null;

    DatabaseCoreClusterStructure _nctDatabaseCoreClusterStructure =
        this.btClusterStructureManager.buctogDatabaseCoreClusterStructure(consensusMemberGroupId,
            _databaseId, this.dmStructureInfo,
            this.vcViewClusterInfo);

    Collection<Address> _collectionAmaAddress = this.vcViewClusterInfo.getMbrs().stream()
        .map(Member::address).filter((addr) ->
        {
          return !addr.equals(
              this.acmUniqueAddress
                  .address());
        })
        .collect(Collectors.toList());
    this.sourceQueueWithCompleteSutCoreClusterStructure.offer(
        new CoreClusterStructure(_collectionAmaAddress, _nctDatabaseCoreClusterStructure));
    this.atrrActorRef.tell(_nctDatabaseCoreClusterStructure, this.getSelf());
  }


  private void _buto() {
    if (this._isRdtbutog()) {

      Set<DatabaseId> _setIdrDatabaseId = this.dmStructureInfo.geseStream().flatMap((info) ->
      {
        return info.getIscGdbDiscoveryMetaCoreImpl().stedaiSet()
            .stream();
      }).collect(Collectors.toSet());

      Set<DatabaseId> _setIdaDatabaseId = this.setIdkDatabaseId.stream().filter((id) ->
      {
        return !_setIdrDatabaseId.contains(id);
      }).collect(Collectors.toSet());
      _setIdaDatabaseId.forEach(this::_bultolyForDa);
      _setIdrDatabaseId.forEach(this::_bultolyForDa);
      this.setIdkDatabaseId = _setIdrDatabaseId;

      ClusterInitMeta _bosrpClusterInitMeta = new ClusterInitMeta(this.mapBrcc,
          this.dmStructureInfo, this.acmUniqueAddress, this.vcViewClusterInfo);
      this.sourceQueueWithCompleteSsbClusterInitMeta.offer(_bosrpClusterInitMeta);
    }
  }


  private void _haebsprfmsForCo(ConsensusGdbsReady m) {
    this.mapBrcc = m.getMapRbcc();
    this._buto();
  }


  private void _haectvemsForVi(ViewClusterInfo m) {
    this.vcViewClusterInfo = m;
    if (!this.isOvcisoh) {

      Stream _stream = this.vcViewClusterInfo.avamesStream();

      UniqueAddress _uniqueAddress = this.acmUniqueAddress;
      Objects.requireNonNull(_uniqueAddress);
      if (_stream.anyMatch(_uniqueAddress::equals)) {
        this.isOvcisoh = true;
      }
    }

    this._buto();
  }


  private void _haedbstdmaForGd(GdbOnline m) {
    this.maActorRef.forward(m, this.getContext());
  }


  private void _haedbstdmaForGd(GdbOffline m) {
    this.maActorRef.forward(m, this.getContext());
    this.amActorRef.forward(m, this.getContext());
  }


  private void _haemdmeeForSt(StructureInfo m) {
    this.dmStructureInfo = m;
    this._buto();
  }


  private void _haemeumeeForCo(
      io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructureActor.NodeAlive m) {
    this._buto();
  }


  private void _haepiiidmeeForCl(ClusterDiscoveryInitiator m) {
    this.maActorRef.forward(m, this.getContext());
    this.airActorRef.forward(m, this.getContext());
    this.amActorRef.forward(m, this.getContext());
  }


  private void _haermrknmaForCo(ConsensusNodeMessage m) {
    this.amActorRef.forward(m, this.getContext());
  }


  private void _haermrmimsForCo(ConsensusMessageCoordinator m) {
    this.dmConsensusMessageCoordinator = m;
    this._seramps();
  }


  private void _haerrsForSe(SetupConsensusDatabaseId m) {
    this.airActorRef.forward(m, this.getContext());
  }


  private boolean _isRdtbutog() {
    return this.isUm && this.isOvcisoh && this.dmStructureInfo != null;
  }


  private void _seramps() {

    Map<ServerId, ConsensusGdbServerCoordinator> _mapDrsc =
        ConsensusGdbServerCoordinator.ofConsensusGdbServerCoordinator(
            this.dmConsensusMessageCoordinator.getMapMpiggc());

    Set<ServerId> _setSrServerId = _mapDrsc.keySet();

    Set<ServerId> _setSaServerId = this.setSkServerId.stream().filter((id) ->
    {
      return !_setSrServerId.contains(id);
    }).collect(Collectors.toSet());
    this.setSkServerId = _setSrServerId;
    _setSaServerId.forEach((serverId) ->
    {
      this._seramps(ConsensusGdbServerCoordinator.emtofConsensusGdbServerCoordinator(serverId));
    });
    _setSrServerId.forEach((serverId) ->
    {
      this._seramps(_mapDrsc.get(serverId));
    });
  }


  private void _seramps(ConsensusGdbServerCoordinator _mpigConsensusGdbServerCoordinator) {

    this.sourceQueueWithCompleteSmrConsensusGdbServerCoordinator.offer(
        _mpigConsensusGdbServerCoordinator);
    this.atrrActorRef.tell(_mpigConsensusGdbServerCoordinator, this.getSelf());
  }

  @Override
  public Receive createReceive() {
    return this.receiveBuilder().match(ViewClusterInfo.class, this::_haectvemsForVi)
        .match(StructureInfo.class, this::_haemdmeeForSt)
        .match(ConsensusGdbsReady.class, this::_haebsprfmsForCo)
        .match(SetupConsensusDatabaseId.class, this::_haerrsForSe)
        .match(GdbOnline.class, this::_haedbstdmaForGd)
        .match(ConsensusNodeMessage.class, this::_haermrknmaForCo)
        .match(GdbOffline.class, this::_haedbstdmaForGd)
        .match(ClusterDiscoveryInitiator.class, this::_haepiiidmeeForCl)
        .match(ConsensusMessageCoordinator.class, this::_haermrmimsForCo)
        .match(
            io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructureActor.NodeAlive.class,
            this::_haemeumeeForCo)
        .build();
  }


  @VisibleForTesting
  void onmeeup() {
    this.isUm = true;
    this.self().tell(
        new io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructureActor.NodeAlive(),
        ActorRef.noSender());
  }


  private static class NodeAlive {

  }
}
