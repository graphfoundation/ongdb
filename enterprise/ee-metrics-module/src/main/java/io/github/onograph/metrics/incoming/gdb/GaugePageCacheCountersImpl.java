package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.Clock;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.SlidingTimeWindowArrayReservoir;
import com.codahale.metrics.Snapshot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.neo4j.internal.helpers.MathUtil;
import org.neo4j.io.pagecache.monitoring.PageCacheCounters;


class GaugePageCacheCountersImpl implements Gauge<Double> {


  private final SlidingTimeWindowArrayReservoir mwSlidingTimeWindowArrayReservoir;


  private final PageCacheCounters pageCacheCounters;


  private final SlidingTimeWindowArrayReservoir whSlidingTimeWindowArrayReservoir;

  GaugePageCacheCountersImpl(PageCacheCounters _pageCacheCounters, Duration _wnoDuration,
      Clock _clock) {

    long _lgSw = _wnoDuration.getSeconds();
    this.whSlidingTimeWindowArrayReservoir = new SlidingTimeWindowArrayReservoir(_lgSw,
        TimeUnit.SECONDS, _clock);
    this.mwSlidingTimeWindowArrayReservoir = new SlidingTimeWindowArrayReservoir(_lgSw,
        TimeUnit.SECONDS, _clock);
    this.pageCacheCounters = _pageCacheCounters;
  }

  GaugePageCacheCountersImpl(PageCacheCounters _pageCacheCounters) {
    this(_pageCacheCounters, Duration.ofMinutes(1L), Clock.defaultClock());
  }


  private long _gehs() {

    Snapshot _snapshot = this.whSlidingTimeWindowArrayReservoir.getSnapshot();
    return Math.subtractExact(_snapshot.getMax(), _snapshot.getMin());
  }


  private long _gems() {

    Snapshot _snapshot = this.mwSlidingTimeWindowArrayReservoir.getSnapshot();
    return Math.subtractExact(_snapshot.getMax(), _snapshot.getMin());
  }

  @Override
  public Double getValue() {
    this.whSlidingTimeWindowArrayReservoir.update(this.pageCacheCounters.hits());
    this.mwSlidingTimeWindowArrayReservoir.update(this.pageCacheCounters.faults());

    long _lgHit = this._gehs();

    long _lgMse = this._gems();
    return MathUtil.portion((double) _lgHit, (double) _lgMse);
  }
}
