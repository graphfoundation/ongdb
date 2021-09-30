package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.share.calg.cle.watch.PetConsensusLogEntryWatcher;
import java.util.concurrent.atomic.AtomicLong;


public class PetConsensusLogApplied implements PetConsensusLogEntryWatcher {


  private final AtomicLong iaAtomicLong = new AtomicLong(0L);

  @Override
  public long apldid() {
    return this.iaAtomicLong.get();
  }

  @Override
  public void apldid(long _lgIa) {
    this.iaAtomicLong.set(_lgIa);
  }
}
