package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Set;


public class ConsensusNodesFactoryDefaultImpl
    implements
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodes.ConsensusNodesFactory<ConsensusNodeId> {

  @Override
  public ConsensusNodes<ConsensusNodeId> bulConsensusNodes(Set<ConsensusNodeId> mbrs) {
    return new ConsensusNodeServerMemberIdWrapper(mbrs);
  }
}
