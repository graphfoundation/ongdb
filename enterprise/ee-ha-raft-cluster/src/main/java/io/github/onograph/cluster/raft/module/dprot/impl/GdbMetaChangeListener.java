package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;


public interface GdbMetaChangeListener {


  void ondstupForRe(ReadReplicateGdbMeta _readReplicateGdbMeta);
}
