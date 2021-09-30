package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.UniqueAddress;
import akka.cluster.ddata.LWWMap;
import akka.cluster.ddata.LWWMapKey;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.AbstractAkkaSyncableDataActor;
import io.github.onograph.cluster.raft.module.dprot.impl.GdbOffline;
import io.github.onograph.cluster.raft.module.dprot.impl.GdbOnline;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbMetaActor;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import java.util.HashSet;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class DiscoveryMetaActor extends
    AbstractAkkaSyncableDataActor.AbstractASDALWWMap<UniqueAddress, GdbDiscoveryMetaCoreWrapper> {


  private final ActorRef asdActorRef;


  private final ActorRef atActorRef;


  private final Config config;


  private final ServerId mslServerId;


  private final ActorRef rmaActorRef;


  private final Set<DatabaseId> setDsDatabaseId = new HashSet();


  private DiscoveryMetaActor(ActorRef _amrActorRef, ActorRef _asdActorRef, ActorRef _atActorRef,
      Cluster _cluster, Config _config, ClusterDataWatcher _mntrClusterDataWatcher,
      ServerId _mslServerId, ActorRef _rpiaoActorRef) {
    super(_cluster, LWWMapKey::create, ClusterDataType.CDT_META, _mntrClusterDataWatcher,
        _rpiaoActorRef, LWWMap::empty);
    this.atActorRef = _atActorRef;
    this.asdActorRef = _asdActorRef;
    this.rmaActorRef = _amrActorRef;
    this.config = _config;
    this.mslServerId = _mslServerId;
  }


  static Props prpProps(ActorRef _amrActorRef, ActorRef _asdActorRef, ActorRef _atActorRef,
      Cluster _cluster, Config _config, ClusterDataWatcher _mntrClusterDataWatcher,
      ServerId _mslServerId, ActorRef _rpiaoActorRef) {
    return Props.create(DiscoveryMetaActor.class, () ->
    {
      return new DiscoveryMetaActor(_amrActorRef, _asdActorRef, _atActorRef, _cluster, _config,
          _mntrClusterDataWatcher, _mslServerId, _rpiaoActorRef);
    });
  }


  private void _haedbstdmaForGd(GdbOnline m) {
    if (this.setDsDatabaseId.add(m.getNamedDatabaseId().databaseId())) {
      this._secosrin();
    }
  }


  private void _haedbstdmaForGd(GdbOffline m) {
    if (this.setDsDatabaseId.remove(m.getNamedDatabaseId().databaseId())) {
      this._secosrin();
    }
  }


  private void _reedfreaForFi(FinishClear m) {

    GdbDiscoveryMetaCoreWrapper _iscGdbDiscoveryMetaCoreWrapper =
        (GdbDiscoveryMetaCoreWrapper) ((LWWMap) this.tDat).getEntries().get(m.getUniqueAddress());
    this.moyriddForKeFuM((map) ->
    {
      return map.remove(this.cluster, m.getUniqueAddress());
    }, this.k);
    if (_iscGdbDiscoveryMetaCoreWrapper != null) {
      this.rmaActorRef.tell(
          new io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusNodeCoordinatorActor.FinishClear(
              _iscGdbDiscoveryMetaCoreWrapper.getServerId()), this.getSelf());
      this.asdActorRef.tell(
          new DiscoveryGdbMetaActor.FinalizeMInfo(_iscGdbDiscoveryMetaCoreWrapper.getServerId()),
          this.getSelf());
    }
  }


  private void _secosrin() {

    Set<DatabaseId> _setDsDatabaseId = Set.copyOf(this.setDsDatabaseId);

    GdbDiscoveryMetaCoreImpl _iGdbDiscoveryMetaCoreImpl = GdbDiscoveryMetaCoreImpl.froGdbDiscoveryMetaCoreImpl(
        this.config, _setDsDatabaseId);

    GdbDiscoveryMetaCoreWrapper _mtdtGdbDiscoveryMetaCoreWrapper = new GdbDiscoveryMetaCoreWrapper(
        _iGdbDiscoveryMetaCoreImpl, this.mslServerId);
    this.moyriddForKeFuM((map) ->
    {
      return map.put(this.cluster, this.cluster.selfUniqueAddress(),
          _mtdtGdbDiscoveryMetaCoreWrapper);
    }, this.k);
  }

  @Override
  protected int dameii() {
    return ((LWWMap) this.tDat).underlying().keys().vvector().size();
  }

  @Override
  protected int damevl() {
    return this.tDat.size();
  }

  @Override
  protected void haecoenForRe(ReceiveBuilder _receiveBuilder) {
    _receiveBuilder.match(FinishClear.class, this::_reedfreaForFi)
        .match(GdbOnline.class, this::_haedbstdmaForGd)
        .match(GdbOffline.class, this::_haedbstdmaForGd);
  }

  @Override
  protected void haeimdaForT(LWWMap<UniqueAddress, GdbDiscoveryMetaCoreWrapper> _lWWMapDnug) {
    this.tDat = _lWWMapDnug;
    this.atActorRef.tell(new StructureInfo(this.tDat), this.getSelf());
  }

  @Override
  public void seinldtrloForGd(GdbServerPointInTime gdbServerPointInTime) {

    Set<DatabaseId> _setIdDatabaseId = gdbServerPointInTime.divldasSet();
    this.setDsDatabaseId.addAll(_setIdDatabaseId);
    this._secosrin();
  }
}
