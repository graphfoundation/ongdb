package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;

class ReplyTest {

  @Test
  void testCaguReply() {
    ServerId serverId = new ServerId(UUID.randomUUID());
    SocketAddress socketAddress = new SocketAddress("localhost");
    Reply actualCaguReplyResult = Reply.caguReply(serverId, socketAddress);
    assertEquals("caught up", actualCaguReplyResult.getM());
    assertEquals(WaitingReplyMetaType.CaughtUp, actualCaguReplyResult.getSrwWaitingReplyMetaType());
    assertSame(socketAddress, actualCaguReplyResult.getSocketAddress());
    assertSame(serverId, actualCaguReplyResult.getServerId());
  }

  @Test
  void testFalReply() {
    ServerId serverId = new ServerId(UUID.randomUUID());
    SocketAddress socketAddress = new SocketAddress("localhost");
    Reply actualFalReplyResult = Reply.falReply("foo", serverId, socketAddress);
    assertEquals("foo", actualFalReplyResult.getM());
    assertEquals(WaitingReplyMetaType.Failed, actualFalReplyResult.getSrwWaitingReplyMetaType());
    assertSame(socketAddress, actualFalReplyResult.getSocketAddress());
    assertSame(serverId, actualFalReplyResult.getServerId());
  }

  @Test
  void testInoleReply() {
    ServerId serverId = new ServerId(UUID.randomUUID());
    SocketAddress socketAddress = new SocketAddress("localhost");
    Reply actualInoleReplyResult = Reply.inoleReply(serverId, socketAddress);
    assertEquals("server is still catching up", actualInoleReplyResult.getM());
    assertSame(serverId, actualInoleReplyResult.getServerId());
    assertSame(socketAddress, actualInoleReplyResult.getSocketAddress());
    assertEquals(WaitingReplyMetaType.Incomplete,
        actualInoleReplyResult.getSrwWaitingReplyMetaType());
  }

  @Test
  void testInoleReply2() {
    ServerId serverId = new ServerId(UUID.randomUUID());
    SocketAddress socketAddress = new SocketAddress("localhost");
    Reply actualInoleReplyResult = Reply.inoleReply(serverId, socketAddress);
    assertEquals("server is still catching up", actualInoleReplyResult.getM());
    assertEquals(WaitingReplyMetaType.Incomplete,
        actualInoleReplyResult.getSrwWaitingReplyMetaType());
    assertSame(socketAddress, actualInoleReplyResult.getSocketAddress());
    assertSame(serverId, actualInoleReplyResult.getServerId());
  }
}

