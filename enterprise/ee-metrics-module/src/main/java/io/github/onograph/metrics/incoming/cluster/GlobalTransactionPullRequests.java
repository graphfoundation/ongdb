package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncRequestWatcher;
import java.util.concurrent.atomic.AtomicLong;


class GlobalTransactionPullRequests implements TransactionSyncRequestWatcher {


  private final AtomicLong cnt = new AtomicLong(0L);

  @Override
  public void inre() {
    this.cnt.incrementAndGet();
  }

  @Override
  public long txplreree() {
    return this.cnt.get();
  }
}
