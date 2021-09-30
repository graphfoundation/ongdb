package io.github.onograph.server.rest.cluster;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import io.github.onograph.cluster.raft.watch.PerformanceWatcher;
import java.time.Duration;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.neo4j.common.DependencyResolver;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Health;
import org.neo4j.util.Id;


class ClusterReadReplicaInfoService {


  private static final Duration MIL_SIC_FIN_LED_MSX = null;


  private final ClusterStructureService clusterStructureService;


  private final Health dtbsHealth;


  private final PerformanceWatcher mtPerformanceWatcher;


  private final NamedDatabaseId namedDatabaseId;


  private final ActionIdxMonitor ticActionIdxMonitor;

  ClusterReadReplicaInfoService(GraphDatabaseAPI _dGraphDatabaseAPI) {

    DependencyResolver _dependencyResolver = _dGraphDatabaseAPI.getDependencyResolver();
    this.namedDatabaseId = _dGraphDatabaseAPI.databaseId();
    this.ticActionIdxMonitor = _dependencyResolver.resolveDependency(ActionIdxMonitor.class);
    this.clusterStructureService = _dependencyResolver.resolveDependency(
        ClusterStructureService.class);
    this.dtbsHealth = _dependencyResolver.resolveDependency(DatabaseHealth.class);
    this.mtPerformanceWatcher = _dependencyResolver.resolveDependency(PerformanceWatcher.class);
  }


  ClusterGdbStatusMeta curtsasClusterGdbStatusMeta() {

    boolean _isHaty = this.dtbsHealth.isHealthy();

    ServerId _myServerId = this.clusterStructureService.seviServerId();

    UUID _liUUID =
        Optional.ofNullable(
                this.clusterStructureService.geldNodeServerMemberLeaderMeta(this.namedDatabaseId))
            .map(NodeServerMemberLeaderMeta::getImConsensusNodeId).map(Id::uuid).orElse(null);

    long _lgLari = this.ticActionIdxMonitor.getLgAci();

    Double _spcrDouble = this.mtPerformanceWatcher.thohtOptional().orElse(null);
    return new ClusterGdbStatusMeta(Set.of(), _myServerId.uuid(), false, false,
        this.clusterStructureService.isHet(), _isHaty, _liUUID, _lgLari,
        MIL_SIC_FIN_LED_MSX,
        _spcrDouble);
  }
}
