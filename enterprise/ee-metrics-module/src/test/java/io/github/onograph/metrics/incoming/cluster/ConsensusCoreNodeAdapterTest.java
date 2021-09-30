package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck;
import io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.GlobbingPattern;

class ConsensusCoreNodeAdapterTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER, (new ConsensusCoreNodeAdapter()).getGrp());
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER,
        (new ConsensusCoreNodeAdapter("Mprnm", null,
            new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
            (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER,
        (new ConsensusCoreNodeAdapter("", null,
            new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
            (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).getGrp());
  }

  @Test
  void testStart() {
    MonitorsClusterConsensusImpl monitorsClusterConsensusImpl = mock(
        MonitorsClusterConsensusImpl.class);
    doNothing().when(monitorsClusterConsensusImpl)
        .addMonitorListener((Object) any(), (String[]) any());
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new ConsensusCoreNodeAdapter("Mprnm", monitorsClusterConsensusImpl,
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
        (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).start();
    verify(monitorsClusterConsensusImpl, atLeast(1)).addMonitorListener((Object) any(),
        (String[]) any());
  }

  @Test
  void testStart2() {
    MonitorsClusterConsensusImpl monitorsClusterConsensusImpl = mock(
        MonitorsClusterConsensusImpl.class);
    doNothing().when(monitorsClusterConsensusImpl)
        .addMonitorListener((Object) any(), (String[]) any());

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    (new ConsensusCoreNodeAdapter("Mprnm", monitorsClusterConsensusImpl,
        new MetricRegistryManager(globbingPatternList, new MetricRegistry()),
        (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).start();
    verify(monitorsClusterConsensusImpl, atLeast(1)).addMonitorListener((Object) any(),
        (String[]) any());
  }

  @Test
  void testStart3() {
    MonitorsClusterConsensusImpl monitorsClusterConsensusImpl = mock(
        MonitorsClusterConsensusImpl.class);
    doNothing().when(monitorsClusterConsensusImpl)
        .addMonitorListener((Object) any(), (String[]) any());

    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    (new ConsensusCoreNodeAdapter("Mprnm", monitorsClusterConsensusImpl,
        new MetricRegistryManager(globbingPatternList, new MetricRegistry()),
        (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).start();
    verify(monitorsClusterConsensusImpl, atLeast(1)).addMonitorListener((Object) any(),
        (String[]) any());
  }

  @Test
  void testStart4() {
    MonitorsClusterConsensusImpl monitorsClusterConsensusImpl = mock(
        MonitorsClusterConsensusImpl.class);
    doNothing().when(monitorsClusterConsensusImpl)
        .addMonitorListener((Object) any(), (String[]) any());
    MetricRegistryManager metricRegistryManager = mock(MetricRegistryManager.class);
    doNothing().when(metricRegistryManager)
        .reieForStSu((String) any(), (Supplier<com.codahale.metrics.Metric>) any());
    (new ConsensusCoreNodeAdapter("Mprnm", monitorsClusterConsensusImpl, metricRegistryManager,
        (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).start();
    verify(monitorsClusterConsensusImpl, atLeast(1)).addMonitorListener((Object) any(),
        (String[]) any());
    verify(metricRegistryManager, atLeast(1)).reieForStSu((String) any(),
        (Supplier<com.codahale.metrics.Metric>) any());
  }

  @Test
  void testStop() {
    MonitorsClusterConsensusImpl monitorsClusterConsensusImpl = mock(
        MonitorsClusterConsensusImpl.class);
    doNothing().when(monitorsClusterConsensusImpl).removeMonitorListener((Object) any());
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    (new ConsensusCoreNodeAdapter("Mprnm", monitorsClusterConsensusImpl,
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()),
        (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).stop();
    verify(monitorsClusterConsensusImpl, atLeast(1)).removeMonitorListener((Object) any());
  }

  @Test
  void testStop2() {
    MonitorsClusterConsensusImpl monitorsClusterConsensusImpl = mock(
        MonitorsClusterConsensusImpl.class);
    doNothing().when(monitorsClusterConsensusImpl).removeMonitorListener((Object) any());
    MetricRegistryManager metricRegistryManager = mock(MetricRegistryManager.class);
    doNothing().when(metricRegistryManager).reoForSt((String) any());
    (new ConsensusCoreNodeAdapter("Mprnm", monitorsClusterConsensusImpl, metricRegistryManager,
        (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).stop();
    verify(monitorsClusterConsensusImpl, atLeast(1)).removeMonitorListener((Object) any());
    verify(metricRegistryManager, atLeast(1)).reoForSt((String) any());
  }
}

