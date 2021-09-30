package io.github.onograph.metrics.incoming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import java.util.ArrayList;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.server.web.WebContainerThreadInfo;

class JettyAdapterTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, (new JettyAdapter()).getGrp());
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new JettyAdapter("Mprnm",
            new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
            (Supplier<WebContainerThreadInfo>) mock(Supplier.class))).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new JettyAdapter("",
            new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
            (Supplier<WebContainerThreadInfo>) mock(Supplier.class))).getGrp());
  }

  @Test
  void testStart() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new JettyAdapter("Mprnm",
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
        (Supplier<WebContainerThreadInfo>) mock(Supplier.class))).start();
  }

  @Test
  void testStart2() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    (new JettyAdapter("Mprnm", new MetricRegistryManager(globbingPatternList, new MetricRegistry()),
        (Supplier<WebContainerThreadInfo>) mock(Supplier.class))).start();
  }

  @Test
  void testStart3() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    (new JettyAdapter("Mprnm", new MetricRegistryManager(globbingPatternList, new MetricRegistry()),
        (Supplier<WebContainerThreadInfo>) mock(Supplier.class))).start();
  }

  @Test
  void testStop() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new JettyAdapter("Mprnm",
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
        (Supplier<WebContainerThreadInfo>) mock(Supplier.class))).stop();
  }
}

