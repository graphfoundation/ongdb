package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.share.calg.cle.watch.ElectionTimeWatcher;
import java.util.concurrent.atomic.AtomicLong;


public class ConsensusElectionTerm implements ElectionTimeWatcher {


  private final AtomicLong tAtomicLong = new AtomicLong(0L);

  @Override
  public long getTermLength() {
    return this.tAtomicLong.get();
  }

  @Override
  public void termLength(long _lgTe) {
    this.tAtomicLong.set(_lgTe);
  }
}
