package io.github.onograph.cluster.raft.module.dprot.impl.directory;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ddata.ORMap;
import akka.cluster.ddata.ORMapKey;
import akka.japi.pf.ReceiveBuilder;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.module.dprot.impl.AbstractAkkaSyncableDataActor;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.neo4j.kernel.database.DatabaseId;


public class DiscoveryManagementActor extends
    AbstractAkkaSyncableDataActor<ORMap<DatabaseId, SyncedLeaderMeta>> {


  public static final String TITLE = io.github.onograph.TokenConstants.CC_DIRECTORY_ACTOR;


  private final ActorRef atrActorRef;


  private final SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> sourceQueueWithCompleteSudMap;


  private DiscoveryManagementActor(ActorRef _atrActorRef, Cluster _cluster,
      ClusterDataWatcher _mntrClusterDataWatcher, ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> _sourceQueueWithCompleteSudMap) {
    super(_cluster, ORMapKey::create, ClusterDataType.CDT_DIR, _mntrClusterDataWatcher,
        _rpiaoActorRef, ORMap::create);
    this.sourceQueueWithCompleteSudMap = _sourceQueueWithCompleteSudMap;
    this.atrActorRef = _atrActorRef;
  }


  public static Props prpProps(ActorRef _atrActorRef, Cluster _cluster,
      ClusterDataWatcher _mntrClusterDataWatcher, ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<Map<DatabaseId, NodeServerMemberLeaderMeta>> _sourceQueueWithCompleteSudMap) {
    return Props.create(DiscoveryManagementActor.class, () ->
    {
      return new DiscoveryManagementActor(_atrActorRef, _cluster, _mntrClusterDataWatcher,
          _rpiaoActorRef, _sourceQueueWithCompleteSudMap);
    });
  }


  private ORMap<DatabaseId, SyncedLeaderMeta> _adldspORMap(
      ORMap<DatabaseId, SyncedLeaderMeta> _oRMapAds,
      Entry<DatabaseId, NodeServerMemberLeaderMeta> _entryEtydn) {

    DatabaseId _databaseId = _entryEtydn.getKey();

    SyncedLeaderMeta _irSyncedLeaderMeta = new SyncedLeaderMeta(_entryEtydn.getValue());
    return _oRMapAds.put(this.cluster, _databaseId, _irSyncedLeaderMeta);
  }


  private void _haeleiosForSe(SetupLeaderMeta m) {
    if (this._isPlblainForNo(m.getLiNodeServerMemberLeaderMeta())) {
      this.moyriddForKeFuM((map) ->
      {
        return map.put(this.cluster, m.getDatabaseId(),
            new SyncedLeaderMeta(m.getLiNodeServerMemberLeaderMeta()));
      }, this.k);
    }
  }


  private boolean _isPlblainForNo(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta) {
    return _ilNodeServerMemberLeaderMeta.getImConsensusNodeId() != null
        || _ilNodeServerMemberLeaderMeta.getIsDsi();
  }

  @Override
  protected int dameii() {
    return ((ORMap) this.tDat).keys().vvector().size();
  }

  @Override
  protected int damevl() {
    return this.tDat.size();
  }

  @Override
  protected void haecoenForRe(ReceiveBuilder _receiveBuilder) {
    _receiveBuilder.match(SetupLeaderMeta.class, this::_haeleiosForSe);
  }

  @Override
  protected void haeimdaForT(ORMap<DatabaseId, SyncedLeaderMeta> _oRMapDnds) {
    this.tDat = _oRMapDnds;

    Map<DatabaseId, NodeServerMemberLeaderMeta> _mapIldn = (this.tDat).getEntries().entrySet()
        .stream().collect(Collectors.toMap(Entry::getKey, (e) ->
        {
          return (e.getValue()).getIlNodeServerMemberLeaderMeta();
        }));
    this.sourceQueueWithCompleteSudMap.offer(_mapIldn);
    this.atrActorRef.tell(new LeaderMeta(_mapIldn), this.getSelf());
  }

  @Override
  protected boolean isDacndForT(ORMap<DatabaseId, SyncedLeaderMeta> _oRMapDnds) {
    return this.tDat.size() != _oRMapDnds.size() || !((ORMap) this.tDat).getEntries()
        .equals(_oRMapDnds.getEntries());
  }

  @Override
  protected void seinldtrloForGd(GdbServerPointInTime gdbServerPointInTime) {

    ORMap<DatabaseId, SyncedLeaderMeta> _oRMapLlds = gdbServerPointInTime.daalahMap().entrySet()
        .stream().filter((entry) ->
        {
          return this
              ._isPlblainForNo(
                  entry
                      .getValue());
        })
        .reduce(ORMap.create(), this::_adldspORMap, ORMap::merge);
    if (!_oRMapLlds.isEmpty()) {
      this.moyriddForKeFuM((map) ->
      {
        return map.merge(_oRMapLlds);
      }, this.k);
    }
  }
}
