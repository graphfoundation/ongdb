package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;


public class ConsensusGdbServerCoordinatorSerializer extends
    AbstractJSerializer<ConsensusGdbServerCoordinator> {


  private static final int SIEN = 1024;

  public ConsensusGdbServerCoordinatorSerializer() {
    super(ConsensusGdbServerCoordinatorSafeChannelMarshal.IT, 1024, 1016);
  }
}
