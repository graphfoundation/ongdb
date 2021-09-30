package io.github.onograph.cluster.raft.module.dprot.impl;

import java.util.concurrent.Future;


public interface StartScheduler {


  Future<?> restartNow();
}
