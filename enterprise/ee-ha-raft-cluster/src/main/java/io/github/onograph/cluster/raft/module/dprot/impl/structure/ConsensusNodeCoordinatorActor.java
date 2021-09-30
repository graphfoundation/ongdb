package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ddata.LWWMap;
import akka.cluster.ddata.LWWMapKey;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.impl.AbstractAkkaSyncableDataActor;
import io.github.onograph.cluster.raft.module.dprot.impl.ConsensusNodeMessage;
import io.github.onograph.cluster.raft.module.dprot.impl.GdbOffline;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class ConsensusNodeCoordinatorActor extends
    AbstractAkkaSyncableDataActor.AbstractASDALWWMap<GdbServerIdWrapper, ConsensusNodeId> {


  private final ActorRef atActorRef;


  private final ServerId imServerId;


  private ConsensusNodeCoordinatorActor(ActorRef _atActorRef, Cluster _cluster,
      ServerId _imServerId, ClusterDataWatcher _mntrClusterDataWatcher, ActorRef _rpiaoActorRef) {
    super(_cluster, LWWMapKey::create, ClusterDataType.CDT_CONS_NODE_MAP, _mntrClusterDataWatcher,
        _rpiaoActorRef, LWWMap::empty);
    this.atActorRef = _atActorRef;
    this.imServerId = _imServerId;
  }


  static Props prpProps(ActorRef _atActorRef, Cluster _cluster, ServerId _imServerId,
      ClusterDataWatcher _mntrClusterDataWatcher, ActorRef _rpiaoActorRef) {
    return Props.create(ConsensusNodeCoordinatorActor.class, () ->
    {
      return new ConsensusNodeCoordinatorActor(_atActorRef, _cluster, _imServerId,
          _mntrClusterDataWatcher, _rpiaoActorRef);
    });
  }


  private LWWMap<GdbServerIdWrapper, ConsensusNodeId> _adrtmmrLWWMap(
      LWWMap<GdbServerIdWrapper, ConsensusNodeId> _lWWMapAgc,
      Entry<DatabaseId, ConsensusNodeId> _entryMddc) {

    DatabaseId _dbDatabaseId = _entryMddc.getKey();

    GdbServerIdWrapper _gdbServerIdWrapper = new GdbServerIdWrapper(_dbDatabaseId, this.imServerId);

    ConsensusNodeId consensusNodeId = _entryMddc.getValue();
    return _lWWMapAgc.put(this.cluster, _gdbServerIdWrapper, consensusNodeId);
  }


  private void _haedbstdmaForGd(GdbOffline m) {

    GdbServerIdWrapper _mpigGdbServerIdWrapper = new GdbServerIdWrapper(
        m.getNamedDatabaseId().databaseId(), this.imServerId);

    this.moyriddForKeFuM((map) ->
    {
      return map.remove(this.cluster, _mpigGdbServerIdWrapper);
    }, this.k);
  }


  private void _haermrknmaForCo(ConsensusNodeMessage m) {

    ConsensusNodeId consensusNodeId = m.getConsensusNodeId();

    GdbServerIdWrapper _mpigGdbServerIdWrapper = new GdbServerIdWrapper(
        m.getNamedDatabaseId().databaseId(), this.imServerId);

    this.moyriddForKeFuM((map) ->
    {
      return map.put(this.cluster, _mpigGdbServerIdWrapper, consensusNodeId);
    }, this.k);
  }


  private void _reedfreaForCo(
      io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusNodeCoordinatorActor.FinishClear m) {
    (this.tDat).getEntries().keySet().stream().filter((ds) ->
    {
      return ds.getServerId().equals(m.serverId);
    }).peek((mapping) ->
    {

    }).forEach((ds) ->
    {
      this.moyriddForKeFuM((map) ->
      {
        return map.remove(this.cluster, ds);
      }, this.k);
    });
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
    _receiveBuilder.match(
            io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusNodeCoordinatorActor.FinishClear.class,
            this::_reedfreaForCo)
        .match(ConsensusNodeMessage.class, this::_haermrknmaForCo)
        .match(GdbOffline.class, this::_haedbstdmaForGd);
  }

  @Override
  protected void haeimdaForT(LWWMap<GdbServerIdWrapper, ConsensusNodeId> _lWWMapDngc) {

    this.tDat = _lWWMapDngc;
    this.atActorRef.tell(new ConsensusMessageCoordinator(this.tDat), this.getSelf());
  }

  @Override
  public void seinldtrloForGd(GdbServerPointInTime gdbServerPointInTime) {

    Set<DatabaseId> _setDdlDatabaseId = gdbServerPointInTime.divldasSet();

    LWWMap<GdbServerIdWrapper, ConsensusNodeId> _lWWMapDlpmrgc = gdbServerPointInTime.daammhMap()
        .entrySet().stream().filter((en) ->
        {
          return _setDdlDatabaseId
              .contains(
                  en.getKey());
        })
        .reduce(LWWMap.create(), this::_adrtmmrLWWMap, LWWMap::merge);

    this.moyriddForKeFuM((map) ->
    {
      return map.merge(_lWWMapDlpmrgc);
    }, this.k);
  }


  static class FinishClear {


    private final ServerId serverId;

    FinishClear(ServerId _serverId) {
      this.serverId = _serverId;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusNodeCoordinatorActor.FinishClear _thaFinishClear =
            (io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusNodeCoordinatorActor.FinishClear) obj;
        return Objects.equals(this.serverId, _thaFinishClear.serverId);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.serverId);
    }
  }
}
