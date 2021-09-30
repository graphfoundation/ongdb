package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.ActorPath;
import akka.actor.ActorRef;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.database.DatabaseId;


class ShowReadReplicaInfo {


  static final ShowReadReplicaInfo EMT_SHOW_READ_REPLICA_INFO = new ShowReadReplicaInfo(
      Collections.emptyMap());


  private final Map<ActorPath, ReadReplicaStructureWrapper> mapRrrtcar;

  ShowReadReplicaInfo(Map<ActorPath, ReadReplicaStructureWrapper> _mapCrrar) {
    this.mapRrrtcar = Map.copyOf(_mapCrrar);
  }


  private Stream<Pair<ServerId, DiscoveryGdbOperatorMetaWrapper>> _gealsefmmeStream(
      ReadReplicaStructureWrapper _rcrReadReplicaStructureWrapper) {
    return _rcrReadReplicaStructureWrapper.getMapSddd().values().stream().map((state) ->
    {
      return Pair.of(_rcrReadReplicaStructureWrapper.getServerId(), state);
    });
  }


  Map<DatabaseId, ReadReplicateGdbMeta> alrarldasstMap() {

    Map<DatabaseId, Map<ServerId, DiscoveryGdbOperatorMetaWrapper>> _mapAmspdmmdm =
        this.mapRrrtcar.values().stream().flatMap(this::_gealsefmmeStream)
            .collect(Collectors.groupingBy((p) ->
            {
              return p
                  .other()
                  .getDatabaseId();
            }, Collectors
                .toMap(Pair::first,
                    Pair::other)));
    return _mapAmspdmmdm.entrySet().stream().collect(Collectors.toMap(Entry::getKey, (e) ->
    {
      return ReadReplicateGdbMeta.ofrerlaReadReplicateGdbMeta(e.getKey(), e.getValue());
    }));
  }


  Set<DatabaseId> daasidSet() {
    return this.mapRrrtcar.values().stream()
        .map(ReadReplicaStructureWrapper::getIrrGdbDiscoveryMetaReadReplicaImpl).flatMap((info) ->
        {
          return info
              .stedaiSet()
              .stream();
        })
        .collect(Collectors.toSet());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ShowReadReplicaInfo _tShowReadReplicaInfo = (ShowReadReplicaInfo) obj;
      return Objects.equals(this.mapRrrtcar, _tShowReadReplicaInfo.mapRrrtcar);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapRrrtcar);
  }


  Stream<ActorRef> tooatfokwceStream(Collection<ActorRef> _collectionCcActorRef) {
    return _collectionCcActorRef.stream().map((client) ->
    {
      return client.path().parent();
    }).flatMap((client) ->
    {
      return Stream.ofNullable(this.mapRrrtcar.get(client));
    }).map(ReadReplicaStructureWrapper::getTcActorRef);
  }


  DatabaseReadReplicaClusterStructure tordritpyDatabaseReadReplicaClusterStructure(
      DatabaseId _databaseId) {

    Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> _mapRrksg = this.mapRrrtcar.values().stream()
        .filter((info) ->
        {
          return info.getIrrGdbDiscoveryMetaReadReplicaImpl()
              .stedaiSet()
              .contains(
                  _databaseId);
        }).map((info) ->
        {
          return Pair
              .of(info.getServerId(),
                  info.getIrrGdbDiscoveryMetaReadReplicaImpl());
        })
        .collect(Collectors.toMap(Pair::first, Pair::other));
    return new DatabaseReadReplicaClusterStructure(_databaseId, _mapRrksg);
  }


}
