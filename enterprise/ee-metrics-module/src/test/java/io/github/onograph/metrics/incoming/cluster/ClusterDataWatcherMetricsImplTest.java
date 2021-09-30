package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import org.junit.jupiter.api.Test;

class ClusterDataWatcherMetricsImplTest {

  @Test
  void testGeivldasGauge() {
    assertEquals(0,
        (new ClusterDataWatcherMetricsImpl()).geivldasGauge(ClusterDataType.CDT_META).getValue()
            .intValue());
  }

  @Test
  void testGevsdsiGauge() {
    assertEquals(0,
        (new ClusterDataWatcherMetricsImpl()).gevsdsiGauge(ClusterDataType.CDT_META).getValue()
            .intValue());
  }

  @Test
  void testSeivldasForCl() {

    (new ClusterDataWatcherMetricsImpl()).seivldasForCl(ClusterDataType.CDT_META, 1);
  }

  @Test
  void testSevsdsiForCl() {

    (new ClusterDataWatcherMetricsImpl()).sevsdsiForCl(ClusterDataType.CDT_META, 1);
  }
}

