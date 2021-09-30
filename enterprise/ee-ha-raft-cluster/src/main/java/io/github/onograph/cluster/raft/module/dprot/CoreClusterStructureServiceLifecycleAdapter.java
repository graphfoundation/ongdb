package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Set;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


public class CoreClusterStructureServiceLifecycleAdapter extends LifecycleAdapter
    implements
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler,
    LeaderNodeEventHandlers {


  private final ConsensusOperationsManager consensusOperationsManager;


  private final CoreClusterStructureService ctsCoreClusterStructureService;


  private final NamedDatabaseId namedDatabaseId;


  public CoreClusterStructureServiceLifecycleAdapter(
      ConsensusOperationsManager consensusOperationsManager, NamedDatabaseId _namedDatabaseId,
      CoreClusterStructureService _stcCoreClusterStructureService) {
    this.consensusOperationsManager = consensusOperationsManager;
    this.ctsCoreClusterStructureService = _stcCoreClusterStructureService;
    this.namedDatabaseId = _namedDatabaseId;
  }

  @Override
  public NamedDatabaseId nadaiNamedDatabaseId() {
    return this.namedDatabaseId;
  }

  @Override
  public synchronized void oncetlchForSe(Set<ConsensusNodeId> _setImConsensusNodeId) {
    this.consensusOperationsManager.setrmesseForSe(_setImConsensusNodeId);
  }

  @Override
  public void onldsedn(long _lgTds) {
    this.ctsCoreClusterStructureService.hadspdwForNa(_lgTds, this.namedDatabaseId);
  }

  @Override
  public void onleeswcForNo(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta) {
    this.ctsCoreClusterStructureService.seldForNoNa(this.namedDatabaseId,
        _ilNodeServerMemberLeaderMeta);
  }

  @Override
  public void start() {
    this.ctsCoreClusterStructureService.adlccrtolnForCo(this);
    this.consensusOperationsManager.retlsrForLe(this);
  }

  @Override
  public void stop() {
    this.consensusOperationsManager.unilnForLe(this);
    this.ctsCoreClusterStructureService.reellctolsrForCo(this);
  }
}
