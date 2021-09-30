package io.github.onograph.kernel.srv.transaction.log.checkpoint;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThresholdPolicy;
import org.neo4j.kernel.impl.transaction.log.pruning.LogPruning;
import org.neo4j.logging.LogProvider;
import org.neo4j.time.SystemNanoClock;


public class CheckPointThresholdPolicyContinuousImpl implements CheckPointThresholdPolicy {

  @Override
  public CheckPointThreshold createThreshold(Config _config, SystemNanoClock _systemNanoClock,
      LogPruning _logPruning, LogProvider _logProvider) {
    return new CheckPointThresholdContinuousPolicy();
  }

  @Override
  public String getName() {
    return io.github.onograph.TokenConstants.CONTINUOUS;
  }
}
