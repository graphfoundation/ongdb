package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;

class GaugePageCacheCountersImplTest {

  @Test
  void testConstructor() {
    assertEquals(0.0,
        (new GaugePageCacheCountersImpl(new DefaultPageCacheTracer())).getValue().doubleValue());
  }

  @Test
  void testConstructor2() {
    DefaultPageCacheTracer defaultPageCacheTracer = new DefaultPageCacheTracer();
    defaultPageCacheTracer.maxPages(0L, 3L);
    assertEquals(0.0,
        (new GaugePageCacheCountersImpl(defaultPageCacheTracer)).getValue().doubleValue());
  }

  @Test
  void testGetValue() {
    assertEquals(0.0,
        (new GaugePageCacheCountersImpl(new DefaultPageCacheTracer())).getValue().doubleValue());
  }
}

