package io.github.onograph.cluster.raft.module.dprot;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.neo4j.internal.helpers.DefaultTimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;


public class DiscoveryRetryManager {


  private final long lgRtis;


  private final TimeoutStrategy timeoutStrategy;

  public DiscoveryRetryManager(long _lgMid, long _lgRtis) {
    this(_lgRtis, DefaultTimeoutStrategy.constant(_lgMid, TimeUnit.MILLISECONDS));
  }


  public DiscoveryRetryManager(long _lgRtis, TimeoutStrategy _timeoutStrategy) {
    this.lgRtis = _lgRtis;
    this.timeoutStrategy = _timeoutStrategy;
  }


  public <T> T apl(Predicate<T> _predicateVldtrT, Supplier<T> _supplierAtoT)
      throws TimeoutException {

    Timeout _timeout = this.timeoutStrategy.newTimeout();

    T _tRsl = _supplierAtoT.get();

    for (

        int _iVar = 0; !_predicateVldtrT.test(_tRsl); _tRsl = _supplierAtoT.get()) {
      if (this.lgRtis > 0L && (long) (_iVar++) == this.lgRtis) {

        throw new TimeoutException("*** Error: 9f51f7ab-28fe-4899-88e9-d252a0567a2c");
      }

      try {
        Thread.sleep(_timeout.getAndIncrement());
      } catch (

          InterruptedException _interruptedException) {
        Thread.currentThread().interrupt();
        throw new RuntimeException(_interruptedException);
      }
    }

    return _tRsl;
  }
}
