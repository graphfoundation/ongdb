package io.github.onograph.cluster.raft.module.dprot.impl.gdb;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.cluster.Cluster;
import akka.cluster.ddata.LWWMap;
import akka.cluster.ddata.LWWMapKey;
import akka.japi.pf.ReceiveBuilder;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.AbstractAkkaSyncableDataActor;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class DiscoveryGdbMetaActor extends
    AbstractAkkaSyncableDataActor.AbstractASDALWWMap<GdbServerIdWrapper, DiscoveryGdbOperatorMetaWrapper> {


  public static final String TITLE = io.github.onograph.TokenConstants.CC_DATABASE_STATUS_ACTOR;


  private final ActorRef atrActorRef;


  private final ServerId mslServerId;


  private final SourceQueueWithComplete<ReadReplicateGdbMeta> sourceQueueWithCompleteSusReadReplicateGdbMeta;


  private DiscoveryGdbMetaActor(ActorRef _atrActorRef, Cluster _cluster,
      ClusterDataWatcher _mntrClusterDataWatcher, ServerId _mslServerId, ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSusReadReplicateGdbMeta) {
    super(_cluster, LWWMapKey::create, ClusterDataType.CDT_GDB_STATUS, _mntrClusterDataWatcher,
        _rpiaoActorRef, LWWMap::create);
    this.sourceQueueWithCompleteSusReadReplicateGdbMeta = _sourceQueueWithCompleteSusReadReplicateGdbMeta;
    this.atrActorRef = _atrActorRef;
    this.mslServerId = _mslServerId;
  }


  private static <K, V> Collector<Entry<K, V>, ?, Map<K, V>> _enrstmCollector() {
    return Collectors.toMap(Entry::getKey, Entry::getValue);
  }


  public static Props prpProps(ActorRef _atrActorRef, Cluster _cluster,
      ClusterDataWatcher _mntrClusterDataWatcher, ServerId _mslServerId, ActorRef _rpiaoActorRef,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSudReadReplicateGdbMeta) {
    return Props.create(DiscoveryGdbMetaActor.class, () ->
    {
      return new DiscoveryGdbMetaActor(_atrActorRef, _cluster, _mntrClusterDataWatcher,
          _mslServerId, _rpiaoActorRef,
          _sourceQueueWithCompleteSudReadReplicateGdbMeta);
    });
  }


  private LWWMap<GdbServerIdWrapper, DiscoveryGdbOperatorMetaWrapper> _adstLWWMap(
      LWWMap<GdbServerIdWrapper, DiscoveryGdbOperatorMetaWrapper> _lWWMapAgd,
      Entry<DatabaseId, DatabaseState> _entryEtydd) {

    DatabaseId _databaseId = _entryEtydd.getKey();

    DatabaseState _sdDatabaseState = _entryEtydd.getValue();

    DiscoveryGdbOperatorMetaWrapper _sdDiscoveryGdbOperatorMetaWrapper =
        new DiscoveryGdbOperatorMetaWrapper(_databaseId, _sdDatabaseState.failure().orElse(null),
            _sdDatabaseState.operatorState());
    return _lWWMapAgd.put(this.cluster, new GdbServerIdWrapper(_databaseId, this.mslServerId),
        _sdDiscoveryGdbOperatorMetaWrapper);
  }


  private void _haedbstForDi(DiscoveryGdbOperatorMetaWrapper _udtDiscoveryGdbOperatorMetaWrapper) {
    if (_udtDiscoveryGdbOperatorMetaWrapper.getOperatorState().terminal()) {

      this.moyriddForKeFuM((map) ->
      {
        return map.remove(this.cluster,
            new GdbServerIdWrapper(_udtDiscoveryGdbOperatorMetaWrapper.getDatabaseId(),
                this.mslServerId));
      }, this.k);
    } else {

      this.moyriddForKeFuM((map) ->
      {
        return map.put(this.cluster,
            new GdbServerIdWrapper(_udtDiscoveryGdbOperatorMetaWrapper.getDatabaseId(),
                this.mslServerId),
            _udtDiscoveryGdbOperatorMetaWrapper);
      }, this.k);
    }
  }


  private void _reedfreaForDi(DiscoveryGdbMetaActor.FinalizeMInfo m) {
    (this.tDat).getEntries().keySet().stream().filter((ds) ->
    {
      return ds.getServerId().equals(m.serverId);
    }).peek((ds) ->
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
    _receiveBuilder.match(DiscoveryGdbMetaActor.FinalizeMInfo.class, this::_reedfreaForDi)
        .match(DiscoveryGdbOperatorMetaWrapper.class, this::_haedbstForDi);
  }

  @Override
  protected void haeimdaForT(
      LWWMap<GdbServerIdWrapper, DiscoveryGdbOperatorMetaWrapper> _lWWMapDngd) {

    this.tDat = _lWWMapDngd;

    Map<DatabaseId, Map<ServerId, DiscoveryGdbOperatorMetaWrapper>> _mapDbgsdm = (this.tDat).getEntries()
        .entrySet().stream().map((e) ->
        {
          return Map
              .entry(e
                      .getKey()
                      .getServerId(),
                  e
                      .getValue());
        })
        .collect(Collectors.groupingBy((e) ->
        {
          return e
              .getValue()
              .getDatabaseId();
        }, _enrstmCollector()));

    List<ReadReplicateGdbMeta> _listArsReadReplicateGdbMeta = _mapDbgsdm.entrySet().stream()
        .map((e) ->
        {
          return ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(
              e.getKey(),
              e.getValue());
        }).collect(Collectors.toList());

    SourceQueueWithComplete _sourceQueueWithComplete = this.sourceQueueWithCompleteSusReadReplicateGdbMeta;
    Objects.requireNonNull(_sourceQueueWithComplete);
    _listArsReadReplicateGdbMeta.forEach(_sourceQueueWithComplete::offer);
    this.atrActorRef.tell(new ReadReplicateGdbMetaManager(_listArsReadReplicateGdbMeta),
        this.getSelf());
  }

  @Override
  protected void seinldtrloForGd(GdbServerPointInTime gdbServerPointInTime) {

    LWWMap<GdbServerIdWrapper, DiscoveryGdbOperatorMetaWrapper> _lWWMapMslgd =
        gdbServerPointInTime.daassteMap().entrySet().stream()
            .reduce(LWWMap.create(), this::_adstLWWMap, LWWMap::merge);

    if (!_lWWMapMslgd.isEmpty()) {
      this.moyriddForKeFuM((map) ->
      {
        return map.merge(_lWWMapMslgd);
      }, this.k);
    }
  }


  public static class FinalizeMInfo {


    private final ServerId serverId;

    public FinalizeMInfo(ServerId _serverId) {
      this.serverId = _serverId;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        DiscoveryGdbMetaActor.FinalizeMInfo _thaFinalizeMInfo = (DiscoveryGdbMetaActor.FinalizeMInfo) obj;
        return Objects.equals(this.serverId, _thaFinalizeMInfo.serverId);
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
