package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.monitoring.Monitors;

class ReadReplicaNodeAdapterTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER, (new ReadReplicaNodeAdapter()).getGrp());
  }

  @Test
  void testConstructor2() {
    Monitors _monitors = new Monitors();
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER, (new ReadReplicaNodeAdapter("Mprnm", _monitors,
        new MetricRegistryManager(_listFmGlobbingPattern,
            new MetricRegistry()))).getGrp());
  }

  @Test
  void testConstructor3() {
    Monitors _monitors = new Monitors();
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER, (new ReadReplicaNodeAdapter("", _monitors,
        new MetricRegistryManager(_listFmGlobbingPattern,
            new MetricRegistry()))).getGrp());
  }

  @Test
  void testStart() {

    Monitors _monitors = new Monitors();
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new ReadReplicaNodeAdapter("Mprnm", _monitors,
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()))).start();
  }

  @Test
  void testStart2() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    (new ReadReplicaNodeAdapter("Mprnm", new Monitors(), _metricRegistryManager)).start();
  }

  @Test
  void testStart3() {

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    (new ReadReplicaNodeAdapter("Mprnm", new Monitors(), _metricRegistryManager)).start();
  }

  @Test
  void testStop() {

    Monitors _monitors = new Monitors();
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new ReadReplicaNodeAdapter("Mprnm", _monitors,
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()))).stop();
  }
}

