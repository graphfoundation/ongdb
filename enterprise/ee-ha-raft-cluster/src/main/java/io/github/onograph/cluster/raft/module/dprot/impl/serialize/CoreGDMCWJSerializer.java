package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper;


public class CoreGDMCWJSerializer extends AbstractJSerializer<GdbDiscoveryMetaCoreWrapper> {


  private static final int SIEN = 512;

  public CoreGDMCWJSerializer() {
    super(CoreGDMCWSafeChannelMarshal.IT, 512, 1003);
  }
}
