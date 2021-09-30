package io.github.onograph.cluster.raft.gateway.gwlb;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;

class LoadBalancingResourceIntegratorTest {

  @Test
  void testHapgSettingConstraint() {

    LoadBalancingResourceIntegrator.hapgSettingConstraint();
  }

  @Test
  void testVaitForCoLo() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    assertThrows(IllegalArgumentException.class,
        () -> LoadBalancingResourceIntegrator.vaitForCoLo(config, new BufferingLog()));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testVaitForCoLo2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(
        "server_policies");
    LoadBalancingResourceIntegrator.vaitForCoLo(config, new BufferingLog());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testVaitForCoLo3() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("foo");
    assertThrows(IllegalArgumentException.class,
        () -> LoadBalancingResourceIntegrator.vaitForCoLo(config, new BufferingLog()));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

