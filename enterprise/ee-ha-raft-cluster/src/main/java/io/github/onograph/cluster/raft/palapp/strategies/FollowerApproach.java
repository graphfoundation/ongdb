package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachException;
import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.DefaultOperatorState;
import org.neo4j.dbms.OperatorState;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class FollowerApproach extends AbstractNamedServiceClusterApproach {


  static final Set<OperatorState> SET_ALEFDOT_OPERATOR_STATE;


  private static final String IDNT = io.github.onograph.TokenConstants.PREFER_FOLLOWER;

  static {
    SET_ALEFDOT_OPERATOR_STATE = Set.of(DefaultOperatorState.STARTED,
        OperatorStateEnterpriseTypeImpl.SETI_RUNNING);
  }

  public FollowerApproach() {
    super(io.github.onograph.TokenConstants.PREFER_FOLLOWER);
  }


  private Collector<ServerId, ?, List<ServerId>> _toshfdlsCollector() {
    return Collectors.collectingAndThen(Collectors.toCollection(ArrayList::new), (list) ->
    {
      Collections.shuffle(list);
      return list;
    });
  }

  @Override
  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {

    Stream<ServerId> _streamVr00ServerId = this.clusterStructureService.alcrstfrdbMap(
            _namedDatabaseId).entrySet().stream().filter((entry) ->
        {
          return SET_ALEFDOT_OPERATOR_STATE
              .contains(
                  entry
                      .getValue()
                      .getOperatorState());
        })
        .map(Entry::getKey);

    ServerId _serverId = this.myeServerId;
    Objects.requireNonNull(_serverId);

    List<ServerId> _listFoServerId = _streamVr00ServerId.filter(Predicate.not(_serverId::equals))
        .filter((serverId) ->
        {
          return ClusterNodeRoleType.FOLLOWER.equals(
              this.clusterStructureService
                  .lokreClusterNodeRoleType(
                      _namedDatabaseId,
                      serverId));
        }).collect(this._toshfdlsCollector());
    if (!_listFoServerId.isEmpty()) {
      return _listFoServerId;
    } else {

      Set<ServerId> _setDfcaServerId = this.clusterStructureService.cotogfdaDatabaseCoreClusterStructure(
          _namedDatabaseId).sevsMap().keySet();

      Set<ServerId> _setDfrraServerId =
          this.clusterStructureService.rereatlfodaDatabaseReadReplicaClusterStructure(
              _namedDatabaseId).sevsMap().keySet();
      _streamVr00ServerId = Stream.concat(_setDfcaServerId.stream(), _setDfrraServerId.stream());
      _serverId = this.myeServerId;
      Objects.requireNonNull(_serverId);

      List<ServerId> _listDfmaServerId = _streamVr00ServerId.filter(
          Predicate.not(_serverId::equals)).collect(this._toshfdlsCollector());
      if (_listDfmaServerId.isEmpty()) {

        throw new NamedServiceApproachException("*** Error: bb4a3009-13ae-4749-b64a-8eae53b545d6");
      } else {
        return _listDfmaServerId;
      }
    }
  }

  @Override
  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {
    return this.upesrfdteCollection(_namedDatabaseId).stream().findFirst();
  }
}
