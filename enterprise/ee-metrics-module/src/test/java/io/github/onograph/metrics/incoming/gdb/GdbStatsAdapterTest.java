package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;

class GdbStatsAdapterTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, (new GdbStatsAdapter()).getGrp());
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    Supplier<StoreEntityCounters> _supplierScStoreEntityCounters = (Supplier<StoreEntityCounters>) mock(
        Supplier.class);
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new GdbStatsAdapter("Mprnm", _metricRegistryManager,
            _supplierScStoreEntityCounters, new DefaultPageCacheTracer())).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    Supplier<StoreEntityCounters> _supplierScStoreEntityCounters = (Supplier<StoreEntityCounters>) mock(
        Supplier.class);
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new GdbStatsAdapter("", _metricRegistryManager, _supplierScStoreEntityCounters,
            new DefaultPageCacheTracer()))
            .getGrp());
  }

  @Test
  void testStart() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    Supplier<StoreEntityCounters> _supplierScStoreEntityCounters = (Supplier<StoreEntityCounters>) mock(
        Supplier.class);
    (new GdbStatsAdapter("Mprnm", _metricRegistryManager, _supplierScStoreEntityCounters,
        new DefaultPageCacheTracer()))
        .start();
  }

  @Test
  void testStart2() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    Supplier<StoreEntityCounters> _supplierScStoreEntityCounters = (Supplier<StoreEntityCounters>) mock(
        Supplier.class);
    (new GdbStatsAdapter("Mprnm", _metricRegistryManager, _supplierScStoreEntityCounters,
        new DefaultPageCacheTracer()))
        .start();
  }

  @Test
  void testStart3() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    Supplier<StoreEntityCounters> _supplierScStoreEntityCounters = (Supplier<StoreEntityCounters>) mock(
        Supplier.class);
    (new GdbStatsAdapter("Mprnm", _metricRegistryManager, _supplierScStoreEntityCounters,
        new DefaultPageCacheTracer()))
        .start();
  }

  @Test
  void testStop() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    Supplier<StoreEntityCounters> _supplierScStoreEntityCounters = (Supplier<StoreEntityCounters>) mock(
        Supplier.class);
    (new GdbStatsAdapter("Mprnm", _metricRegistryManager, _supplierScStoreEntityCounters,
        new DefaultPageCacheTracer()))
        .stop();
  }
}

