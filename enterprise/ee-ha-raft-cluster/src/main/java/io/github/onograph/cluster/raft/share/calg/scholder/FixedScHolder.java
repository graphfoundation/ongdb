package io.github.onograph.cluster.raft.share.calg.scholder;

import java.util.concurrent.TimeUnit;


public class FixedScHolder implements ScHolder {


  private final ScHold dlyScHold;

  FixedScHolder(long _lgAon, TimeUnit _timeUnit) {
    this.dlyScHold = new ScHold(_lgAon, _timeUnit);
  }

  @Override
  public ScHold nexScHold() {
    return this.dlyScHold;
  }
}
