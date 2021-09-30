package io.github.onograph.cluster.raft.shared;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class ClusterGdbSeedValidator {


  public static void alcnwiForSeNaCl(ClusterStructureService clusterStructureService,
      NamedDatabaseId _namedDatabaseId, ServerId _sdServerId)
      throws IllegalStateException {
    if (clusterStructureService.lopdbstDiscoveryGdbOperatorMetaWrapper(_namedDatabaseId,
        _sdServerId).isHafl() &&
        clusterStructureService.alcrstfrdbMap(_namedDatabaseId).values().stream()
            .allMatch(DiscoveryGdbOperatorMetaWrapper::isHafl) &&
        clusterStructureService.alrarlstfdteMap(_namedDatabaseId).values().stream()
            .allMatch(DiscoveryGdbOperatorMetaWrapper::isHafl)) {

      throw new IllegalStateException("*** Error: b921cb30-4223-40a9-9501-1b402f492c7f");
    }
  }
}
