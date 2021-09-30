package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper;


public class GdbServerIdWrapperSerializer extends AbstractJSerializer<GdbServerIdWrapper> {


  private static final int SIEN = 96;

  public GdbServerIdWrapperSerializer() {
    super(GdbServerIdWrapperSafeChannelMarshal.IT, 96, 1014);
  }
}
