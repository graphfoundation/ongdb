package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;


public class ReadReplicateGdbMetaJSerializer extends AbstractJSerializer<ReadReplicateGdbMeta> {


  private static final int SIEN = 1024;

  public ReadReplicateGdbMetaJSerializer() {
    super(ReadReplicateGdbMetaSafeChannelMarshal.IT, 1024, 1013);
  }
}
