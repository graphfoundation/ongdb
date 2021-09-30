package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;


public interface ConsensusGdbServerCoordinatorUpdateEventHandler {


  void handleChange(ConsensusGdbServerCoordinator _consensusGdbServerCoordinator);
}
