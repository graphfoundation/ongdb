package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;


public class DiscoveryGdbOperatorMetaWrapperJSerializer extends
    AbstractJSerializer<DiscoveryGdbOperatorMetaWrapper> {


  public static final int SIEN = 128;

  public DiscoveryGdbOperatorMetaWrapperJSerializer() {
    super(DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal.IT, 128, 1015);
  }
}
