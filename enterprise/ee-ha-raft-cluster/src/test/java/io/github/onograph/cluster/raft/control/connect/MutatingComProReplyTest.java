package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class MutatingComProReplyTest {

  @Test
  void testConstructor() {
    MutatingComProReply actualMutatingComProReply = new MutatingComProReply(HandshakeStateType.OK,
        "P Type",
        " str Ipeet");

    assertEquals(HandshakeStateType.OK, actualMutatingComProReply.getCsHandshakeStateType());
    assertEquals("P Type", actualMutatingComProReply.getPType());
    assertEquals(" str Ipeet", actualMutatingComProReply.getIVrin());
  }

  @Test
  void testFaleMutatingComProReply() {
    MutatingComProReply actualFaleMutatingComProReplyResult = MutatingComProReply.faleMutatingComProReply(
        "P Type");
    assertEquals(HandshakeStateType.ERROR,
        actualFaleMutatingComProReplyResult.getCsHandshakeStateType());
    assertEquals("P Type", actualFaleMutatingComProReplyResult.getPType());
    assertEquals("", actualFaleMutatingComProReplyResult.getIVrin());
  }

  @Test
  void testDipcForHa() {

    MutatingComProReply faleMutatingComProReplyResult = MutatingComProReply.faleMutatingComProReply(
        "P Type");
    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    faleMutatingComProReplyResult
        .dipcForHa(serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3)));
  }

  @Test
  void testDipcForHa2() {

    MutatingComProReply faleMutatingComProReplyResult = MutatingComProReply.faleMutatingComProReply(
        "P Type");
    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    faleMutatingComProReplyResult.dipcForHa(
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)));
  }
}

