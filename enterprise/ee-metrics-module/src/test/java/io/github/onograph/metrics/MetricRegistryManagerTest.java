package io.github.onograph.metrics;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;

class MetricRegistryManagerTest {

  @Test
  void testConstructor() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry());
  }

  @Test
  void testGeneSortedSet() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertTrue(
        (new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry())).geneSortedSet()
            .isEmpty());
  }

  @Test
  void testIsEnlForSt() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertFalse(
        (new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry())).isEnlForSt(
            " str Nm"));
  }

  @Test
  void testIsEnlForSt2() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    assertFalse((new MetricRegistryManager(globbingPatternList, new MetricRegistry())).isEnlForSt(
        " str Nm"));
  }

  @Test
  void testIsEnlForSt3() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    assertFalse((new MetricRegistryManager(globbingPatternList, new MetricRegistry())).isEnlForSt(
        " str Nm"));
  }

  @Test
  void testIsEnlForSt4() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    assertTrue((new MetricRegistryManager(globbingPatternList, new MetricRegistry())).isEnlForSt(
        "Pattern"));
  }

  @Test
  void testReoForSt() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry())).reoForSt(" str Nm");
  }

  @Test
  void testReomcnForMe() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry())).reomcnForMe(
        mock(MetricFilter.class));
  }
}

