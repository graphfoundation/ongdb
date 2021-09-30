package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.share.sync.ConsensusSyncWatcherService;
import java.util.concurrent.atomic.AtomicLong;


public class SyncStat implements ConsensusSyncWatcherService {


  private final AtomicLong atmtAtomicLong = new AtomicLong();


  private final AtomicLong rmAtomicLong = new AtomicLong();


  private final AtomicLong rnAtomicLong = new AtomicLong();


  private final AtomicLong rnAtomicLong2 = new AtomicLong();


  private final AtomicLong rsAtomicLong = new AtomicLong();


  long atetcu() {
    return this.atmtAtomicLong.get();
  }

  @Override
  public void clerut() {
    this.rnAtomicLong.getAndIncrement();
  }


  long falcu() {
    return this.rnAtomicLong2.get();
  }


  long mabcot() {
    return this.rmAtomicLong.get();
  }

  @Override
  public void marc() {
    this.rmAtomicLong.getAndIncrement();
  }


  long nerptco() {
    return this.rnAtomicLong.get();
  }

  @Override
  public void norlad() {
    this.rnAtomicLong2.getAndIncrement();
  }

  @Override
  public void recnam() {
    this.atmtAtomicLong.getAndIncrement();
  }


  long sucscu() {
    return this.rsAtomicLong.get();
  }

  @Override
  public void suslrle() {
    this.rsAtomicLong.getAndIncrement();
  }
}
