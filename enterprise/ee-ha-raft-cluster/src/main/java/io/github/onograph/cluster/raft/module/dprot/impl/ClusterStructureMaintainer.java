package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import java.util.Collections;
import java.util.Map;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


class ClusterStructureMaintainer {


  private final ServerId lclServerId;

  ClusterStructureMaintainer(ServerId _lclServerId) {
    this.lclServerId = _lclServerId;
  }


  DatabaseCoreClusterStructure reertdactogDatabaseCoreClusterStructure(DatabaseId _databaseId,
      DatabaseCoreClusterStructure _tcdDatabaseCoreClusterStructure) {
    return new DatabaseCoreClusterStructure(
        _tcdDatabaseCoreClusterStructure.getConsensusMemberGroupId(), _databaseId,
        _tcdDatabaseCoreClusterStructure.sevsMap().containsKey(this.lclServerId) ? Map
            .of(this.lclServerId, _tcdDatabaseCoreClusterStructure.sevsMap().get(this.lclServerId))
            : Collections.emptyMap());
  }


  DatabaseReadReplicaClusterStructure reertdarreatlsDatabaseReadReplicaClusterStructure(
      DatabaseId _databaseId,
      DatabaseReadReplicaClusterStructure _trrDatabaseReadReplicaClusterStructure) {
    return new DatabaseReadReplicaClusterStructure(_databaseId,
        _trrDatabaseReadReplicaClusterStructure.sevsMap().containsKey(this.lclServerId) ? Map
            .of(this.lclServerId,
                _trrDatabaseReadReplicaClusterStructure.sevsMap().get(this.lclServerId))
            : Collections.emptyMap());
  }


  ReadReplicateGdbMeta reertrledasReadReplicateGdbMeta(DatabaseId _databaseId,
      ReadReplicateGdbMeta _scReadReplicateGdbMeta) {
    return _scReadReplicateGdbMeta.sttfoOptional(this.lclServerId).map((coreState) ->
        {
          return ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(_databaseId,
              Map.of(this.lclServerId,
                  coreState));
        })
        .orElse(
            ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(_databaseId, Collections.emptyMap()));
  }
}
