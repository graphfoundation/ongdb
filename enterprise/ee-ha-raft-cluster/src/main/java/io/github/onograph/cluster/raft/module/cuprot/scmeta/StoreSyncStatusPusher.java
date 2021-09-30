package io.github.onograph.cluster.raft.module.cuprot.scmeta;


@FunctionalInterface
interface StoreSyncStatusPusher {


  void pushStatus();
}
