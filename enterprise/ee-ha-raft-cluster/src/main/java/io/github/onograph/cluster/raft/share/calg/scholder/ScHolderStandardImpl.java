package io.github.onograph.cluster.raft.share.calg.scholder;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;


public class ScHolderStandardImpl implements ScHolder {


  private final long lgDm;


  private final long lgDm2;


  private final TimeUnit timeUnit;

  ScHolderStandardImpl(long _lgDm, long _lgDm2, TimeUnit _timeUnit) {
    this.lgDm = _lgDm;
    this.lgDm2 = _lgDm2;
    this.timeUnit = _timeUnit;
  }

  @Override
  public ScHold nexScHold() {

    long _lgDly = ThreadLocalRandom.current().nextLong(this.lgDm, this.lgDm2 + 1L);
    return new ScHold(_lgDly, this.timeUnit);
  }
}
