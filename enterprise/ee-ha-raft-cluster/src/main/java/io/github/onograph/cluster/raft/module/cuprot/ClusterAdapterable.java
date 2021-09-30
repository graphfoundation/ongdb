package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.netty.ClusterAdapter;


@FunctionalInterface
public interface ClusterAdapterable {


  ClusterAdapter cacpsrrClusterAdapter();
}
