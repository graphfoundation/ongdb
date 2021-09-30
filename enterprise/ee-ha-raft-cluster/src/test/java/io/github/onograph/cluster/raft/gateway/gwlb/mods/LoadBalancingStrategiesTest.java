package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class LoadBalancingStrategiesTest {

  @Test
  void testConstructor() {

    new LoadBalancingStrategies(new BufferingLog());
  }

  @Test
  void testAdpiForStLo() {

    (new LoadBalancingStrategies(new BufferingLog())).adpiForStLo(mock(LoadBalancingStrategy.class),
        " str Np");
  }
}

