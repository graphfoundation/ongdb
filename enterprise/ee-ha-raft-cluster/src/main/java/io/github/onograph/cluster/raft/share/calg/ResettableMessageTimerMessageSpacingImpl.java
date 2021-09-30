package io.github.onograph.cluster.raft.share.calg;

import java.time.Duration;
import org.neo4j.time.Stopwatch;
import org.neo4j.time.SystemNanoClock;


public class ResettableMessageTimerMessageSpacingImpl implements ResettableMessageTimer {


  private final SystemNanoClock systemNanoClock;


  private Stopwatch mlStopwatch;

  public ResettableMessageTimerMessageSpacingImpl(SystemNanoClock _systemNanoClock) {
    this.systemNanoClock = _systemNanoClock;
  }


  public Duration dunlsmsDuration() {
    return this.mlStopwatch == null ? null : this.mlStopwatch.elapsed();
  }

  @Override
  public void tieret() {
    this.mlStopwatch = this.systemNanoClock.startStopWatch();
  }
}
