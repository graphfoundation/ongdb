package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.time.Clock;
import java.time.Duration;


class StoreCopyRetryableTimeoutableImpl implements StoreCopyRetryable {


  private final Clock clock;


  private final long lgTmot;


  private long lgTa = -1L;


  StoreCopyRetryableTimeoutableImpl(Clock _clock, Duration _tmotDuration) {
    this.lgTmot = _tmotDuration.toMillis();
    this.clock = _clock;
  }

  @Override
  public boolean isCactu() {
    if (this.lgTa == -1L) {
      this.lgTa = this.clock.millis() + this.lgTmot;
      return true;
    } else {
      return this.lgTa > this.clock.millis();
    }
  }

  @Override
  public void ree() {
    this.lgTa = -1L;
  }
}
