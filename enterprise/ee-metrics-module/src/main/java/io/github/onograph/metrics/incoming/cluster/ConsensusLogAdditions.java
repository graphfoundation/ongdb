package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.share.calg.cle.watch.ConensusLogEntryWatcher;
import java.util.concurrent.atomic.AtomicLong;


public class ConsensusLogAdditions implements ConensusLogEntryWatcher {


  private final AtomicLong iaAtomicLong = new AtomicLong(0L);

  @Override
  public long apeie() {
    return this.iaAtomicLong.get();
  }

  @Override
  public void apeie(long _lgAi) {
    this.iaAtomicLong.set(_lgAi);
  }
}
