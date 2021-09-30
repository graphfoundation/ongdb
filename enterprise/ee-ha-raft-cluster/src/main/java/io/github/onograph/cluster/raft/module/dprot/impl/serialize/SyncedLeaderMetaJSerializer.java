package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta;


public class SyncedLeaderMetaJSerializer extends AbstractJSerializer<SyncedLeaderMeta> {


  private static final int SIEN = 25;

  public SyncedLeaderMetaJSerializer() {
    super(SyncedLeaderMetaSafeChannelMarshal.IT, 25, 1011);
  }
}
