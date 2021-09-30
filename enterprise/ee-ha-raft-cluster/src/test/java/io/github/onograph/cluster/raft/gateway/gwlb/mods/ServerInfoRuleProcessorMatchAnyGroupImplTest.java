package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.config.NodeGroupIdentifier;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;

class ServerInfoRuleProcessorMatchAnyGroupImplTest {

  @Test
  void testConstructor() {
    ServerInfoRuleProcessorMatchAnyGroupImpl actualServerInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());
    assertTrue(
        actualServerInfoRuleProcessorMatchAnyGroupImpl.aplSet(new HashSet<LoadBalanceServerMeta>())
            .isEmpty());
  }

  @Test
  void testConstructor2() {
    ServerInfoRuleProcessorMatchAnyGroupImpl actualServerInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());
    HashSet<LoadBalanceServerMeta> loadBalanceServerMetaSet = new HashSet<LoadBalanceServerMeta>();
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaSet
        .add(new LoadBalanceServerMeta(_baSocketAddress, _serverId,
            new HashSet<NodeGroupIdentifier>()));
    assertTrue(
        actualServerInfoRuleProcessorMatchAnyGroupImpl.aplSet(loadBalanceServerMetaSet).isEmpty());
  }

  @Test
  void testConstructor3() {
    ServerInfoRuleProcessorMatchAnyGroupImpl actualServerInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());
    HashSet<LoadBalanceServerMeta> loadBalanceServerMetaSet = new HashSet<LoadBalanceServerMeta>();
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaSet
        .add(new LoadBalanceServerMeta(_baSocketAddress, _serverId,
            new HashSet<NodeGroupIdentifier>()));
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaSet
        .add(new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>()));
    assertTrue(
        actualServerInfoRuleProcessorMatchAnyGroupImpl.aplSet(loadBalanceServerMetaSet).isEmpty());
  }

  @Test
  void testAplSet() {
    ServerInfoRuleProcessorMatchAnyGroupImpl serverInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());
    assertTrue(serverInfoRuleProcessorMatchAnyGroupImpl.aplSet(new HashSet<LoadBalanceServerMeta>())
        .isEmpty());
  }

  @Test
  void testAplSet2() {
    ServerInfoRuleProcessorMatchAnyGroupImpl serverInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());

    HashSet<LoadBalanceServerMeta> loadBalanceServerMetaSet = new HashSet<LoadBalanceServerMeta>();
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaSet
        .add(new LoadBalanceServerMeta(_baSocketAddress, _serverId,
            new HashSet<NodeGroupIdentifier>()));
    assertTrue(serverInfoRuleProcessorMatchAnyGroupImpl.aplSet(loadBalanceServerMetaSet).isEmpty());
  }

  @Test
  void testAplSet3() {
    ServerInfoRuleProcessorMatchAnyGroupImpl serverInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());

    HashSet<LoadBalanceServerMeta> loadBalanceServerMetaSet = new HashSet<LoadBalanceServerMeta>();
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaSet
        .add(new LoadBalanceServerMeta(_baSocketAddress, _serverId,
            new HashSet<NodeGroupIdentifier>()));
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaSet
        .add(new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>()));
    assertTrue(serverInfoRuleProcessorMatchAnyGroupImpl.aplSet(loadBalanceServerMetaSet).isEmpty());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new ServerInfoRuleProcessorMatchAnyGroupImpl(new HashSet<NodeGroupIdentifier>())).equals(
            null));
    assertFalse((new ServerInfoRuleProcessorMatchAnyGroupImpl(new HashSet<NodeGroupIdentifier>()))
        .equals("Different type to ServerInfoRuleProcessorMatchAnyGroupImpl"));
  }

  @Test
  void testEquals2() {
    ServerInfoRuleProcessorMatchAnyGroupImpl serverInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());
    assertTrue(
        serverInfoRuleProcessorMatchAnyGroupImpl.equals(serverInfoRuleProcessorMatchAnyGroupImpl));
    int expectedHashCodeResult = serverInfoRuleProcessorMatchAnyGroupImpl.hashCode();
    assertEquals(expectedHashCodeResult, serverInfoRuleProcessorMatchAnyGroupImpl.hashCode());
  }

  @Test
  void testEquals3() {
    ServerInfoRuleProcessorMatchAnyGroupImpl serverInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());
    ServerInfoRuleProcessorMatchAnyGroupImpl serverInfoRuleProcessorMatchAnyGroupImpl1 = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        new HashSet<NodeGroupIdentifier>());
    assertTrue(
        serverInfoRuleProcessorMatchAnyGroupImpl.equals(serverInfoRuleProcessorMatchAnyGroupImpl1));
    int expectedHashCodeResult = serverInfoRuleProcessorMatchAnyGroupImpl.hashCode();
    assertEquals(expectedHashCodeResult, serverInfoRuleProcessorMatchAnyGroupImpl1.hashCode());
  }

  @Test
  void testEquals4() {
    HashSet<NodeGroupIdentifier> nodeGroupIdentifierSet = new HashSet<NodeGroupIdentifier>();
    nodeGroupIdentifierSet.add(new NodeGroupIdentifier("Dr"));
    ServerInfoRuleProcessorMatchAnyGroupImpl serverInfoRuleProcessorMatchAnyGroupImpl = new ServerInfoRuleProcessorMatchAnyGroupImpl(
        nodeGroupIdentifierSet);
    assertFalse(serverInfoRuleProcessorMatchAnyGroupImpl
        .equals(new ServerInfoRuleProcessorMatchAnyGroupImpl(new HashSet<NodeGroupIdentifier>())));
  }
}

