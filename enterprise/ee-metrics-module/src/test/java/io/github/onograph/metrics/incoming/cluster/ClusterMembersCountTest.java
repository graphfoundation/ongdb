package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClusterMembersCountTest {

  @Test
  void testCovgGauge() {
    assertEquals(0, (new ClusterMembersCount()).covgGauge().getValue().intValue());
  }

  @Test
  void testCovgGauge2() {
    ClusterMembersCount clusterMembersCount = new ClusterMembersCount();
    clusterMembersCount.secvg(true);
    assertEquals(1, clusterMembersCount.covgGauge().getValue().intValue());
  }

  @Test
  void testMebsGauge() {
    assertEquals(0, (new ClusterMembersCount()).mebsGauge().getValue().intValue());
  }

  @Test
  void testUnehlGauge() {
    assertEquals(0, (new ClusterMembersCount()).unehlGauge().getValue().intValue());
  }

  @Test
  void testConstructor() {

    ClusterMembersCount actualClusterMembersCount = new ClusterMembersCount();
    actualClusterMembersCount.secvg(true);
    actualClusterMembersCount.sembs(1);
    actualClusterMembersCount.seuehl(1);
  }
}

