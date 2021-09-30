package io.github.onograph.cluster.raft.share.calg.scholder;

import java.util.concurrent.TimeUnit;


public class ScHold {


  private final long lgAon;


  private final TimeUnit timeUnit;

  ScHold(long _lgAon, TimeUnit _timeUnit) {
    this.lgAon = _lgAon;
    this.timeUnit = _timeUnit;
  }


  public long getLgAon() {
    return this.lgAon;
  }


  public TimeUnit getTimeUnit() {
    return this.timeUnit;
  }
}
