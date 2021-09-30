package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class TransferElectApproachSemiImpl implements TransferElectApproach {


  private final CoreNodeServerIdentity imCoreNodeServerIdentity;


  private final ClusterLeader slClusterLeader;


  private final Supplier<Set<NamedDatabaseId>> supplierSdSet;


  TransferElectApproachSemiImpl(CoreNodeServerIdentity _imCoreNodeServerIdentity,
      ClusterLeader _slClusterLeader, Supplier<Set<NamedDatabaseId>> _supplierSdSet) {
    this.imCoreNodeServerIdentity = _imCoreNodeServerIdentity;
    this.slClusterLeader = _slClusterLeader;
    this.supplierSdSet = _supplierSdSet;
  }


  private Set<ServerId> _fivamesftogSet(Set<ServerId> _setMvServerId, NodeOptions _ttNodeOptions) {

    Stream _stream = _ttNodeOptions.getSetSresServerId().stream();
    Objects.requireNonNull(_setMvServerId);
    return (Set) _stream.filter(_setMvServerId::contains).collect(Collectors.toSet());
  }


  private Set<ServerId> _serwhfrlepSet(Set<ServerId> _setSaServerId) {

    Set<NamedDatabaseId> _setIdNamedDatabaseId = this.supplierSdSet.get();

    Map<ServerId, Long> _mapClsl = _setIdNamedDatabaseId.stream().flatMap((dbId) ->
        {
          return this.slClusterLeader.geldiOptional(dbId).stream();
        })
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    _setSaServerId.forEach((serverId) ->
    {
      _mapClsl.putIfAbsent(serverId, 0L);
    });

    Long _lgClm = _mapClsl.getOrDefault(this.imCoreNodeServerIdentity.serverId(), 0L);
    return _mapClsl.entrySet().stream().filter((e) ->
    {
      return e.getValue() < _lgClm - 1L;
    }).map(Entry::getKey).collect(Collectors.toSet());
  }

  @Override
  public LeaderElect seeLeaderElect(List<NodeOptions> _listTvNodeOptions) {
    if (_listTvNodeOptions.isEmpty()) {
      return LeaderElect.NOAE_LEADER_ELECT;
    } else {

      Set<ServerId> _setSaServerId = _listTvNodeOptions.stream().flatMap((t) ->
      {
        return t.getSetSresServerId().stream();
      }).collect(Collectors.toSet());

      Set<ServerId> _setSvServerId = this._serwhfrlepSet(_setSaServerId);

      List<NodeOptions> _listTtNodeOptions = _listTvNodeOptions.stream().filter((t) ->
      {
        return !Collections.disjoint(_setSvServerId,
            t.getSetSresServerId());
      }).collect(Collectors.toList());

      Optional<NodeOptions> _optionalTrNodeOptions = ApproachManager.seerdOptional(
          _listTtNodeOptions);

      Optional<LeaderElect> _optionalTrLeaderElect = _optionalTrNodeOptions.flatMap((t) ->
      {

        Set<ServerId> _setTimvServerId =
            this._fivamesftogSet(_setSvServerId, t);
        return ApproachManager.seerdOptional(_setTimvServerId)
            .map((serverId) ->
            {
              return new LeaderElect(
                  t.getNamedDatabaseId(),
                  serverId);
            });
      });
      return _optionalTrLeaderElect.orElse(LeaderElect.NOAE_LEADER_ELECT);
    }
  }
}
