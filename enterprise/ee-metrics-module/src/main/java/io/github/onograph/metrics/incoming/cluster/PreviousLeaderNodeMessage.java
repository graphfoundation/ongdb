package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.Gauge;
import io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck;
import io.github.onograph.cluster.raft.share.calg.ResettableMessageTimer;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.neo4j.time.Stopwatch;


class PreviousLeaderNodeMessage implements ResettableMessageTimer, Gauge<Long> {


  private final Supplier<CoreNodeLeaderCheck> supplierDmcCoreNodeLeaderCheck;


  private volatile Stopwatch tlStopwatch;

  PreviousLeaderNodeMessage(Supplier<CoreNodeLeaderCheck> _supplierDmcCoreNodeLeaderCheck) {
    this.supplierDmcCoreNodeLeaderCheck = _supplierDmcCoreNodeLeaderCheck;
  }

  @Override
  public Long getValue() {
    return this.supplierDmcCoreNodeLeaderCheck.get().isLee() ? 0L
        : this.tlStopwatch.elapsed(TimeUnit.MILLISECONDS);
  }

  @Override
  public void tieret() {
    this.tlStopwatch = Stopwatch.start();
  }
}
