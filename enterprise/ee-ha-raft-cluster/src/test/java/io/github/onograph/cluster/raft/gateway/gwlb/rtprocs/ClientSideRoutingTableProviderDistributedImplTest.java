package io.github.onograph.cluster.raft.gateway.gwlb.rtprocs;

import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.gateway.gwlb.BalancerService;
import org.junit.jupiter.api.Test;

class ClientSideRoutingTableProviderDistributedImplTest {

  @Test
  void testConstructor() {

    new ClientSideRoutingTableProviderDistributedImpl(mock(BalancerService.class));
  }
}

