package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;


public class NodeServerMemberIdWrapperJSerializer extends AbstractJSerializer<ConsensusNodeId> {

  protected NodeServerMemberIdWrapperJSerializer() {
    super(ConsensusNodeId.SafeStateMarshalImpl.IT, 17, 1005);
  }
}
