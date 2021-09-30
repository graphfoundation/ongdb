package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.kernel.impl.api.tracer.DefaultTracer;

class CheckpointCounterAdapterTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, (new CheckpointCounterAdapter()).getGrp());
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new CheckpointCounterAdapter("Mprnm", _metricRegistryManager,
            new DefaultTracer())).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new CheckpointCounterAdapter("", _metricRegistryManager, new DefaultTracer())).getGrp());
  }

  @Test
  void testStart() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    (new CheckpointCounterAdapter("Mprnm", _metricRegistryManager, new DefaultTracer())).start();
  }

  @Test
  void testStart2() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    (new CheckpointCounterAdapter("Mprnm", _metricRegistryManager, new DefaultTracer())).start();
  }

  @Test
  void testStart3() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    (new CheckpointCounterAdapter("Mprnm", _metricRegistryManager, new DefaultTracer())).start();
  }

  @Test
  void testStop() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    (new CheckpointCounterAdapter("Mprnm", _metricRegistryManager, new DefaultTracer())).stop();
  }
}

