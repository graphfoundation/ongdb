package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta;


public class LeaderMetaJSerializer extends AbstractJSerializer<LeaderMeta> {

  protected LeaderMetaJSerializer() {
    super(LeaderMetaSafeChannelMarshal.IT, 384, 1010);
  }
}
