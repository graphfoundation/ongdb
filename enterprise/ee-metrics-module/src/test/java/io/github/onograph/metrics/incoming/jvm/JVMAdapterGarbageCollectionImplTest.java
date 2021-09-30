package io.github.onograph.metrics.incoming.jvm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;

class JVMAdapterGarbageCollectionImplTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_JVM, (new JVMAdapterGarbageCollectionImpl()).getGrp());
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_JVM, (new JVMAdapterGarbageCollectionImpl("Mprnm",
        new MetricRegistryManager(_listFmGlobbingPattern,
            new MetricRegistry()))).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_JVM, (new JVMAdapterGarbageCollectionImpl("",
        new MetricRegistryManager(_listFmGlobbingPattern,
            new MetricRegistry()))).getGrp());
  }

  @Test
  void testMoydmdmineString() {
    assertEquals(" str Mti", (new JVMAdapterGarbageCollectionImpl()).moydmdmineString(" str Mti"));
  }

  @Test
  void testStart() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new JVMAdapterGarbageCollectionImpl("Mprnm",
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()))).start();
  }

  @Test
  void testStart2() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    (new JVMAdapterGarbageCollectionImpl("Mprnm",
        new MetricRegistryManager(globbingPatternList, new MetricRegistry())))
        .start();
  }

  @Test
  void testStart3() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    (new JVMAdapterGarbageCollectionImpl("Mprnm",
        new MetricRegistryManager(globbingPatternList, new MetricRegistry())))
        .start();
  }

  @Test
  void testStop() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new JVMAdapterGarbageCollectionImpl("Mprnm",
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()))).stop();
  }
}

