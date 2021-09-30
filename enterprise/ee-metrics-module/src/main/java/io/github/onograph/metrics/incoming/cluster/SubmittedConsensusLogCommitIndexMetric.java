package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.share.calg.cle.watch.SubmittedConsensusLogEntryWatcher;
import java.util.concurrent.atomic.AtomicLong;


public class SubmittedConsensusLogCommitIndexMetric implements SubmittedConsensusLogEntryWatcher {


  private final AtomicLong ciAtomicLong = new AtomicLong(0L);

  @Override
  public long comie() {
    return this.ciAtomicLong.get();
  }

  @Override
  public void comie(long _lgIc) {
    this.ciAtomicLong.set(_lgIc);
  }
}
