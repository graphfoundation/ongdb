package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.config.NodeGroupIdentifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.OperatorState;
import org.neo4j.dbms.identity.ServerId;

class ServerMetaManagerTest {

  @Test
  void testConstructor() {
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper1 = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager actualServerMetaManager = new ServerMetaManager(_ilaServerId,
        serverMetaAllWrapper,
        serverMetaAllWrapper1);

    assertSame(serverMetaAllWrapper1, actualServerMetaManager.getRtServerMetaAllWrapper());
    assertSame(serverMetaAllWrapper, actualServerMetaManager.getTcServerMetaAllWrapper());
  }

  @Test
  void testConstructor2() {
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper1 = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager actualServerMetaManager = new ServerMetaManager(_ilaServerId,
        serverMetaAllWrapper,
        serverMetaAllWrapper1);

    assertSame(serverMetaAllWrapper, actualServerMetaManager.getTcServerMetaAllWrapper());
    assertSame(serverMetaAllWrapper1, actualServerMetaManager.getRtServerMetaAllWrapper());
  }

  @Test
  void testConstructor3() {
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper1 = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager actualServerMetaManager = new ServerMetaManager(null, serverMetaAllWrapper,
        serverMetaAllWrapper1);

    assertSame(serverMetaAllWrapper, actualServerMetaManager.getTcServerMetaAllWrapper());
    assertSame(serverMetaAllWrapper1, actualServerMetaManager.getRtServerMetaAllWrapper());
  }

  @Test
  void testConstructor4() {
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());

    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap);
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper1 = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager actualServerMetaManager = new ServerMetaManager(_ilaServerId,
        serverMetaAllWrapper,
        serverMetaAllWrapper1);

    assertSame(serverMetaAllWrapper, actualServerMetaManager.getTcServerMetaAllWrapper());
    assertSame(serverMetaAllWrapper1, actualServerMetaManager.getRtServerMetaAllWrapper());
  }

  @Test
  void testConstructor5() {
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());

    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap);
    ServerMetaManager.ServerMetaAllWrapper serverMetaAllWrapper1 = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    ServerMetaManager actualServerMetaManager = new ServerMetaManager(_ilaServerId,
        serverMetaAllWrapper,
        serverMetaAllWrapper1);

    assertSame(serverMetaAllWrapper, actualServerMetaManager.getTcServerMetaAllWrapper());
    assertSame(serverMetaAllWrapper1, actualServerMetaManager.getRtServerMetaAllWrapper());
  }

  @Test
  void testIsEmy() {
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    ServerMetaManager.ServerMetaAllWrapper _tcServerMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    assertTrue((new ServerMetaManager(_ilaServerId, _tcServerMetaAllWrapper,
        new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1)))).isEmy());
  }

  @Test
  void testIsEmy2() {
    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    ServerMetaManager.ServerMetaAllWrapper _tcServerMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap);
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    assertFalse((new ServerMetaManager(_ilaServerId, _tcServerMetaAllWrapper,
        new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1)))).isEmy());
  }

  @Test
  void testIsEmy3() {
    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    ServerMetaManager.ServerMetaAllWrapper _trServerMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap);
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    assertFalse((new ServerMetaManager(_ilaServerId,
        new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1)),
        _trServerMetaAllWrapper)).isEmy());
  }

  @Test
  void testIsOismr() {
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    ServerMetaManager.ServerMetaAllWrapper _tcServerMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
    assertFalse((new ServerMetaManager(_ilaServerId, _tcServerMetaAllWrapper,
        new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1)))).isOismr());
  }

  @Test
  void testIsOismr2() {
    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    ServerMetaManager.ServerMetaAllWrapper _tcServerMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap);
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    assertFalse((new ServerMetaManager(_ilaServerId, _tcServerMetaAllWrapper,
        new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1)))).isOismr());
  }

  @Test
  void testIsOismr3() {
    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    ServerMetaManager.ServerMetaAllWrapper _tcServerMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap);
    ServerId _ilaServerId = new ServerId(UUID.randomUUID());
    assertFalse((new ServerMetaManager(_ilaServerId, _tcServerMetaAllWrapper,
        new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1)))).isOismr());
  }

  @Test
  void testServerMetaAllWrapperAlsvsSet() {
    assertTrue(
        (new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1))).alsvsSet()
            .isEmpty());
  }

  @Test
  void testServerMetaAllWrapperConstructor() {

    new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap<LoadBalanceServerMeta, OperatorState>(1));
  }

  @Test
  void testServerMetaAllWrapperOnvsSet() {
    assertTrue(
        (new ServerMetaManager.ServerMetaAllWrapper(
            new HashMap<LoadBalanceServerMeta, OperatorState>(1))).onvsSet()
            .isEmpty());
  }

  @Test
  void testServerMetaAllWrapperOnvsSet2() {
    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    assertTrue((new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap)).onvsSet().isEmpty());
  }

  @Test
  void testServerMetaAllWrapperOnvsSet3() {
    HashMap<LoadBalanceServerMeta, OperatorState> loadBalanceServerMetaOperatorStateMap = new HashMap<LoadBalanceServerMeta, OperatorState>(
        1);
    SocketAddress _baSocketAddress = new SocketAddress("localhost");
    ServerId _serverId = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress, _serverId, new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    SocketAddress _baSocketAddress1 = new SocketAddress("localhost");
    ServerId _serverId1 = new ServerId(UUID.randomUUID());
    loadBalanceServerMetaOperatorStateMap.put(
        new LoadBalanceServerMeta(_baSocketAddress1, _serverId1,
            new HashSet<NodeGroupIdentifier>()),
        mock(OperatorState.class));
    assertTrue((new ServerMetaManager.ServerMetaAllWrapper(
        loadBalanceServerMetaOperatorStateMap)).onvsSet().isEmpty());
  }
}

