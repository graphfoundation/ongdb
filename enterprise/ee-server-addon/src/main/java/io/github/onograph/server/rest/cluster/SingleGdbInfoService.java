package io.github.onograph.server.rest.cluster;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import java.util.Set;
import java.util.UUID;
import org.neo4j.common.DependencyResolver;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Health;


class SingleGdbInfoService {


  private final ClusterStructureService clusterStructureService;


  private final Health dtbsHealth;

  SingleGdbInfoService(GraphDatabaseAPI _dGraphDatabaseAPI) {

    DependencyResolver _dependencyResolver = _dGraphDatabaseAPI.getDependencyResolver();
    this.dtbsHealth = _dependencyResolver.resolveDependency(DatabaseHealth.class);
    this.clusterStructureService = _dependencyResolver.resolveDependency(
        ClusterStructureService.class);
  }


  ClusterGdbStatusMeta curtsasClusterGdbStatusMeta() {

    UUID _myUUID = this.clusterStructureService.seviServerId().uuid();
    return new ClusterGdbStatusMeta(Set.of(), _myUUID, false, false,
        this.clusterStructureService.isHet(), this.dtbsHealth.isHealthy(), _myUUID, 0L, null, null);
  }
}
