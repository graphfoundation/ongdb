package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;


public class NodeServerMemberLeaderMetaJSerializer extends
    AbstractJSerializer<NodeServerMemberLeaderMeta> {


  private static final int SIEN = 25;

  public NodeServerMemberLeaderMetaJSerializer() {
    super(NodeServerMemberLeaderMetaSafeChannelMarshal.IT, 25, 1000);
  }
}
