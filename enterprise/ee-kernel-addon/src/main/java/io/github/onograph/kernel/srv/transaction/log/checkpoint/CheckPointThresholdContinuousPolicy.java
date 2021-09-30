package io.github.onograph.kernel.srv.transaction.log.checkpoint;

import org.neo4j.kernel.impl.transaction.log.checkpoint.AbstractCheckPointThreshold;


class CheckPointThresholdContinuousPolicy extends AbstractCheckPointThreshold {


  private volatile long lgTitn;

  CheckPointThresholdContinuousPolicy() {
    super(io.github.onograph.I18N.format(
        "io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdContinuousPolicy.super"));
  }

  @Override
  public long checkFrequencyMillis() {
    return 100L;
  }

  @Override
  public void checkPointHappened(long transIdx) {
    this.lgTitn = transIdx + 1L;
  }

  @Override
  public void initialize(long transIdx) {
    this.checkPointHappened(transIdx);
  }

  @Override
  protected boolean thresholdReached(long _lgItcl, long _lgVltcl) {
    return _lgItcl >= this.lgTitn;
  }
}
