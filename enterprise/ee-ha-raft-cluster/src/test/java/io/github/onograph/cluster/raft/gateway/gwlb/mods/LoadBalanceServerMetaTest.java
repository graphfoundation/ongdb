package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.config.NodeGroupIdentifier;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;

class LoadBalanceServerMetaTest {

  @Test
  void testConstructor() {
    SocketAddress socketAddress = new SocketAddress("localhost");
    ServerId serverId = new ServerId(UUID.randomUUID());
    HashSet<NodeGroupIdentifier> nodeGroupIdentifierSet = new HashSet<NodeGroupIdentifier>();
    LoadBalanceServerMeta actualLoadBalanceServerMeta = new LoadBalanceServerMeta(socketAddress,
        serverId,
        nodeGroupIdentifierSet);

    assertSame(socketAddress, actualLoadBalanceServerMeta.getAbSocketAddress());
    assertSame(serverId, actualLoadBalanceServerMeta.getServerId());
    assertSame(nodeGroupIdentifierSet, actualLoadBalanceServerMeta.getSetGopNodeGroupIdentifier());
  }

  @Test
  void testEquals() {
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    assertFalse(
        (new LoadBalanceServerMeta(_baSocketAddress, _serverId,
            new HashSet<NodeGroupIdentifier>())).equals(null));
  }

  @Test
  void testEquals2() {
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    assertFalse(
        (new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()))
            .equals("Different type to LoadBalanceServerMeta"));
  }

  @Test
  void testEquals3() {
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    LoadBalanceServerMeta loadBalanceServerMeta = new LoadBalanceServerMeta(_baSocketAddress,
        _serverId,
        new HashSet<NodeGroupIdentifier>());
    assertTrue(loadBalanceServerMeta.equals(loadBalanceServerMeta));
    int expectedHashCodeResult = loadBalanceServerMeta.hashCode();
    assertEquals(expectedHashCodeResult, loadBalanceServerMeta.hashCode());
  }

  @Test
  void testEquals4() {
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    LoadBalanceServerMeta loadBalanceServerMeta = new LoadBalanceServerMeta(_baSocketAddress,
        _serverId,
        new HashSet<NodeGroupIdentifier>());
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    assertFalse(loadBalanceServerMeta
        .equals(new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testEquals5() {
    SocketAddress _baSocketAddress = new SocketAddress((String) null);
    ServerId _serverId = new ServerId(UUID.randomUUID());
    LoadBalanceServerMeta loadBalanceServerMeta = new LoadBalanceServerMeta(_baSocketAddress,
        _serverId,
        new HashSet<NodeGroupIdentifier>());
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    assertFalse(loadBalanceServerMeta
        .equals(new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testEquals6() {
    SocketAddress _baSocketAddress = mock(SocketAddress.class);
    ServerId _serverId = new ServerId(UUID.randomUUID());
    LoadBalanceServerMeta loadBalanceServerMeta = new LoadBalanceServerMeta(_baSocketAddress,
        _serverId,
        new HashSet<NodeGroupIdentifier>());
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    assertFalse(loadBalanceServerMeta
        .equals(new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>())));
  }
}

