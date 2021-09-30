package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.config.NodeGroupIdentifier;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;

class ServerEnvWrapperTest {

  @Test
  void testLoaServerEnvWrapper() {
    SocketAddress socketAddress = new SocketAddress("localhost");
    ServerId serverId = new ServerId(UUID.randomUUID());
    ServerEnvWrapper actualLoaServerEnvWrapperResult = ServerEnvWrapper.loaServerEnvWrapper(
        socketAddress, serverId);
    assertSame(socketAddress, actualLoaServerEnvWrapperResult.getAbSocketAddress());
    assertNull(actualLoaServerEnvWrapperResult.getAcSocketAddress());
    assertSame(serverId, actualLoaServerEnvWrapperResult.getServerId());
  }

  @Test
  void testLoaServerEnvWrapper2() {
    SocketAddress socketAddress = new SocketAddress("localhost");
    ServerId serverId = new ServerId(UUID.randomUUID());
    ServerEnvWrapper actualLoaServerEnvWrapperResult = ServerEnvWrapper.loaServerEnvWrapper(
        socketAddress, serverId);
    assertSame(socketAddress, actualLoaServerEnvWrapperResult.getAbSocketAddress());
    assertSame(serverId, actualLoaServerEnvWrapperResult.getServerId());
    assertNull(actualLoaServerEnvWrapperResult.getAcSocketAddress());
  }

  @Test
  void testReoServerEnvWrapper() {
    DiscoverySocketAddresses discoverySocketAddresses = mock(DiscoverySocketAddresses.class);
    when(discoverySocketAddresses.cltbasSocketAddress()).thenReturn(new SocketAddress("localhost"));
    SocketAddress socketAddress = new SocketAddress("localhost");
    HashSet<NodeGroupIdentifier> _setGopNodeGroupIdentifier = new HashSet<NodeGroupIdentifier>();
    GdbDiscoveryMetaReadReplicaImpl _iGdbDiscoveryMeta = new GdbDiscoveryMetaReadReplicaImpl(
        discoverySocketAddresses,
        socketAddress, _setGopNodeGroupIdentifier,
        new HashSet<DatabaseId>());

    ServerId serverId = new ServerId(UUID.randomUUID());
    ServerEnvWrapper actualReoServerEnvWrapperResult = ServerEnvWrapper.reoServerEnvWrapper(
        _iGdbDiscoveryMeta,
        serverId);
    SocketAddress abSocketAddress = actualReoServerEnvWrapperResult.getAbSocketAddress();
    assertEquals(socketAddress, abSocketAddress);
    assertSame(serverId, actualReoServerEnvWrapperResult.getServerId());
    assertEquals(abSocketAddress, actualReoServerEnvWrapperResult.getAcSocketAddress());
    verify(discoverySocketAddresses).cltbasSocketAddress();
  }
}

