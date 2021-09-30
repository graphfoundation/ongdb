package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.config.NodeGroupIdentifier;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DefaultConnectionServiceManager {


  private final ClusterStructureService clusterStructureService;


  private final ServerId mslServerId;


  private final Random random = new Random();


  private final Supplier<Set<NodeGroupIdentifier>> supplierPgSet;


  DefaultConnectionServiceManager(ClusterStructureService clusterStructureService,
      ServerId _mslServerId, Supplier<Set<NodeGroupIdentifier>> _supplierPgSet) {
    this.clusterStructureService = clusterStructureService;
    this.mslServerId = _mslServerId;
    this.supplierPgSet = _supplierPgSet;
  }


  private List<ServerId> _chList(NamedDatabaseId _namedDatabaseId) {

    Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> _mapRpiasg =
        this.clusterStructureService.rereatlfodaDatabaseReadReplicaClusterStructure(
            _namedDatabaseId).sevsMap();
    return (this.supplierPgSet.get()).stream().flatMap((group) ->
    {
      return _mapRpiasg.entrySet().stream().filter(this._mgrannmPredicate(group));
    }).map(Entry::getKey).collect(Collectors.toList());
  }


  private Predicate<Entry<ServerId, GdbDiscoveryMetaReadReplicaImpl>> _mgrannmPredicate(
      NodeGroupIdentifier grp) {
    return (entry) ->
    {
      return entry.getValue().gruSet().contains(grp) && !entry.getKey().equals(this.mslServerId);
    };
  }


  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId) {

    List<ServerId> _listCocsServerId = this._chList(_namedDatabaseId);
    Collections.shuffle(_listCocsServerId);
    return _listCocsServerId;
  }


  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId) {

    List<ServerId> _listCocsServerId = this._chList(_namedDatabaseId);
    return _listCocsServerId.isEmpty() ? Optional.empty()
        : Optional.of(_listCocsServerId.get(this.random.nextInt(_listCocsServerId.size())));
  }
}
