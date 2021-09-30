package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.graphdb.config.Configuration;

class ClusteringBalancerServiceImplTest {

  @Test
  void testPlgneString() {
    assertEquals(ClusteringBalancerServiceImpl.PLGX_NME,
        (new ClusteringBalancerServiceImpl()).plgneString());
  }

  @Test
  void testConstructor() {
    ClusteringBalancerServiceImpl actualClusteringBalancerServiceImpl = new ClusteringBalancerServiceImpl();
    Configuration _configuration = mock(Configuration.class);
    actualClusteringBalancerServiceImpl.vaitForCoLo(_configuration, new BufferingLog());
    assertTrue(actualClusteringBalancerServiceImpl.isSfgpi());
  }
}

