package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.config.NodeGroupIdentifier;
import java.util.Set;


public interface NodeGroupIdentifiersProvider {


  Set<NodeGroupIdentifier> gruSet();
}
