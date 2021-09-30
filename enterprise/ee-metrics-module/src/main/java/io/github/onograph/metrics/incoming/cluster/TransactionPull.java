package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncWatcherProvider;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;


class TransactionPull implements TransactionSyncWatcherProvider {


  private final LongAdder eetLongAdder = new LongAdder();


  private final AtomicLong itrlAtomicLong = new AtomicLong(0L);


  private final AtomicLong lrtiAtomicLong = new AtomicLong(0L);

  @Override
  public long lareetid() {
    return this.itrlAtomicLong.get();
  }

  @Override
  public long laretti() {
    return this.lrtiAtomicLong.get();
  }

  @Override
  public long nurorqs() {
    return this.eetLongAdder.longValue();
  }

  @Override
  public void txpurps(long transIdx) {
    this.itrlAtomicLong.set(transIdx);
  }

  @Override
  public void txpurut(long transIdx) {
    this.eetLongAdder.increment();
    this.lrtiAtomicLong.set(transIdx);
  }
}
