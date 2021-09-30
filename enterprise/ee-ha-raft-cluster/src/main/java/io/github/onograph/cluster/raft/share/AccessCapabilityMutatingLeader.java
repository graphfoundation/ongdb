package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import org.neo4j.graphdb.WriteOperationsNotAllowedException;
import org.neo4j.kernel.api.exceptions.Status.Cluster;
import org.neo4j.kernel.impl.factory.AccessCapability;


public class AccessCapabilityMutatingLeader implements AccessCapability {


  public static final String NOARS =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.AccessCapabilityMutatingLeader.var");


  private final ConsensusOperationsManager consensusOperationsManager;

  public AccessCapabilityMutatingLeader(ConsensusOperationsManager consensusOperationsManager) {
    this.consensusOperationsManager = consensusOperationsManager;
  }

  @Override
  public void assertCanWrite() {

    ConsensusNodeType _rcConsensusNodeType = this.consensusOperationsManager.curtrlConsensusNodeType();
    if (!_rcConsensusNodeType.equals(ConsensusNodeType.CNT_NODE_LEADER)) {

      throw new WriteOperationsNotAllowedException(
          "*** Error: 37abcafc-4701-4066-93fc-d6e809347026", Cluster.NotALeader);
    }
  }
}
