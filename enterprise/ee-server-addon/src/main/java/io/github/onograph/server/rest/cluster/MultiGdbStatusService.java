package io.github.onograph.server.rest.cluster;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.cluster.raft.share.calg.ResettableMessageTimerMessageSpacingImpl;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeTypeFI;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import io.github.onograph.cluster.raft.watch.PerformanceWatcher;
import java.time.Duration;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.neo4j.common.DependencyResolver;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Health;
import org.neo4j.util.Id;


class MultiGdbStatusService {


  private final ClusterStructureService clusterStructureService;


  private final ConsensusOperationsManager consensusOperationsManager;


  private final Health dtbsHealth;


  private final MemberNodesService mmrMemberNodesService;


  private final ResettableMessageTimerMessageSpacingImpl mrtmrResettableMessageTimerMessageSpacingImpl;


  private final PerformanceWatcher mtPerformanceWatcher;


  private final ConsensusNodeTypeFI prConsensusNodeTypeFI;


  private final ActionIdxMonitor ticActionIdxMonitor;

  MultiGdbStatusService(GraphDatabaseAPI _dGraphDatabaseAPI) {

    DependencyResolver _dependencyResolver = _dGraphDatabaseAPI.getDependencyResolver();
    this.mmrMemberNodesService = _dependencyResolver.resolveDependency(MemberNodesService.class);
    this.dtbsHealth = _dependencyResolver.resolveDependency(DatabaseHealth.class);
    this.clusterStructureService = _dependencyResolver.resolveDependency(
        ClusterStructureService.class);
    this.consensusOperationsManager = _dependencyResolver.resolveDependency(
        ConsensusOperationsManager.class);
    this.mrtmrResettableMessageTimerMessageSpacingImpl = _dependencyResolver.resolveDependency(
        ResettableMessageTimerMessageSpacingImpl.class);
    this.ticActionIdxMonitor = _dependencyResolver.resolveDependency(ActionIdxMonitor.class);
    this.mtPerformanceWatcher = _dependencyResolver.resolveDependency(PerformanceWatcher.class);
    this.prConsensusNodeTypeFI = _dependencyResolver.resolveDependency(ConsensusNodeTypeFI.class);
  }


  private Optional<ConsensusNodeId> _geldOptional() {
    return this.consensusOperationsManager.geldioOptional()
        .map(NodeServerMemberLeaderMeta::getImConsensusNodeId);
  }


  ConsensusNodeType curtrlConsensusNodeType() {
    return this.prConsensusNodeTypeFI.curtrlConsensusNodeType();
  }


  ClusterGdbStatusMeta curtsasClusterGdbStatusMeta() {

    ConsensusNodeId _myiConsensusNodeId = this.consensusOperationsManager.mebiConsensusNodeId();

    Optional<ConsensusNodeId> _optionalIloConsensusNodeId = this._geldOptional();

    Set<ConsensusNodeId> _setMvConsensusNodeId = Set.copyOf(this.mmrMemberNodesService.voimbsSet());

    boolean _isGrip = _optionalIloConsensusNodeId.isPresent() && _setMvConsensusNodeId.contains(
        _myiConsensusNodeId);

    long _lgIral = this.ticActionIdxMonitor.getLgAci();

    Duration _mllsmDuration =
        Objects.equals(_myiConsensusNodeId, _optionalIloConsensusNodeId.orElse(null))
            ? Duration.ZERO
            : this.mrtmrResettableMessageTimerMessageSpacingImpl.dunlsmsDuration();

    Double _spcrDouble = this.mtPerformanceWatcher.thohtOptional().orElse(null);
    return new ClusterGdbStatusMeta(_setMvConsensusNodeId,
        _myiConsensusNodeId.uuid(), true, _isGrip, this.clusterStructureService.isHet(),
        this.dtbsHealth.isHealthy(),
        _optionalIloConsensusNodeId.map(Id::uuid).orElse(null), _lgIral, _mllsmDuration,
        _spcrDouble);
  }
}
