package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class ReadReplicaNodeNamedServiceClusterApproach extends
    AbstractNamedServiceClusterApproach {


  public static final String IDNT = io.github.onograph.TokenConstants.TYPICALLY_CONNECT_TO_RANDOM_READ_REPLICA;


  private final io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach.ReadReplicaSumUtil iCutr;

  public ReadReplicaNodeNamedServiceClusterApproach() {
    this(10);
  }

  public ReadReplicaNodeNamedServiceClusterApproach(int _iIctc) {
    super(io.github.onograph.TokenConstants.TYPICALLY_CONNECT_TO_RANDOM_READ_REPLICA);
    this.iCutr = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach.ReadReplicaSumUtil(
        _iIctc);
  }


  private List<ServerId> _otcsesList(NamedDatabaseId _namedDatabaseId) {

    Stream _stream = this.clusterStructureService.cotogfdaDatabaseCoreClusterStructure(
        _namedDatabaseId).sevsMap().keySet().stream();

    ServerId _serverId = this.myeServerId;
    Objects.requireNonNull(_serverId);
    return (List) _stream.filter(Predicate.not(_serverId::equals)).collect(Collectors.toList());
  }


  private List<ServerId> _otrreaList(NamedDatabaseId _namedDatabaseId) {

    Stream _stream = this.clusterStructureService.rereatlfodaDatabaseReadReplicaClusterStructure(
        _namedDatabaseId).sevsMap().keySet().stream();

    ServerId _serverId = this.myeServerId;
    Objects.requireNonNull(_serverId);
    return (List) _stream.filter(Predicate.not(_serverId::equals)).collect(Collectors.toList());
  }


  private Optional<ServerId> _ramcsrOptional(NamedDatabaseId _namedDatabaseId) {

    Stream _stream = this.clusterStructureService.cotogfdaDatabaseCoreClusterStructure(
        _namedDatabaseId).sevsMap().keySet().stream();

    ServerId _serverId = this.myeServerId;
    Objects.requireNonNull(_serverId);

    List<ServerId> _listSnmcServerId = (List) _stream.filter(Predicate.not(_serverId::equals))
        .collect(Collectors.toList());
    if (_listSnmcServerId.isEmpty()) {
      return Optional.empty();
    } else {

      int _iIr = ThreadLocalRandom.current().nextInt(_listSnmcServerId.size());
      return Optional.of(_listSnmcServerId.get(_iIr));
    }
  }

  @Override
  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId) {

    List<ServerId> _listCrsServerId = this._otcsesList(_namedDatabaseId);

    List<ServerId> _listRrServerId = this._otrreaList(_namedDatabaseId);
    if (!this.iCutr.isShdrroycs() && !_listRrServerId.isEmpty()) {
      Collections.shuffle(_listRrServerId);
      return _listRrServerId;
    } else {
      Collections.shuffle(_listCrsServerId);
      return _listCrsServerId;
    }
  }

  @Override
  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId) {
    if (this.iCutr.isShdrroycs()) {
      return this._ramcsrOptional(_namedDatabaseId);
    } else {

      List<ServerId> _listSrrServerId =
          new ArrayList(this.clusterStructureService.rereatlfodaDatabaseReadReplicaClusterStructure(
              _namedDatabaseId).sevsMap().keySet());
      Collections.shuffle(_listSrrServerId);

      List<ServerId> _listScServerId =
          new ArrayList(
              this.clusterStructureService.cotogfdaDatabaseCoreClusterStructure(_namedDatabaseId)
                  .sevsMap().keySet());
      Collections.shuffle(_listScServerId);

      Stream _stream = Stream.concat(_listSrrServerId.stream(), _listScServerId.stream());

      ServerId _serverId = this.myeServerId;
      Objects.requireNonNull(_serverId);
      return _stream.filter(Predicate.not(_serverId::equals)).findFirst();
    }
  }


  private static class ReadReplicaSumUtil {


    private final int iMdl;


    private int iCutr;

    ReadReplicaSumUtil(int _iMdl) {
      this.iMdl = _iMdl;
    }


    boolean isShdrroycs() {
      this.iCutr = (this.iCutr + 1) % this.iMdl;
      return this.iCutr == 0;
    }
  }
}
