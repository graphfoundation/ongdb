package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionAttemptWatcher;
import java.util.concurrent.atomic.AtomicLong;


class TransactionAttempt implements TransactionAttemptWatcher {


  private final AtomicLong cnt = new AtomicLong(0L);

  @Override
  public void rer() {
    this.cnt.incrementAndGet();
  }

  @Override
  public long tranrr() {
    return this.cnt.get();
  }
}
