package io.github.onograph.kernel.srv.transaction.log.checkpoint;

import org.neo4j.kernel.impl.transaction.log.checkpoint.AbstractCheckPointThreshold;
import org.neo4j.kernel.impl.transaction.log.pruning.LogPruning;


public class CheckPointThresholdVolumetricPolicy extends AbstractCheckPointThreshold {


  private final LogPruning logPruning;

  public CheckPointThresholdVolumetricPolicy(LogPruning _logPruning) {
    super(io.github.onograph.I18N.format(
        "io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy.super"));
    this.logPruning = _logPruning;
  }

  @Override
  public long checkFrequencyMillis() {
    return DEFAULT_CHECKING_FREQUENCY_MILLIS;
  }

  @Override
  public void checkPointHappened(long transIdx) {
  }

  @Override
  protected String createCheckpointThresholdDescription(String desc) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy.createCheckpointThresholdDescription",
        desc, this.logPruning.describeCurrentStrategy());
  }

  @Override
  public void initialize(long transIdx) {
  }

  @Override
  protected boolean thresholdReached(long _lgItcl, long _lgVltcl) {
    return this.logPruning.mightHaveLogsToPrune(_lgVltcl);
  }
}
