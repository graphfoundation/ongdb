package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.gateway.gwlb.BalancerService;
import org.junit.jupiter.api.Test;

class ServerPoliciesPluginTest {

  @Test
  void testConstructor() {

    new ServerPoliciesPlugin(mock(BalancerService.class));
  }
}

