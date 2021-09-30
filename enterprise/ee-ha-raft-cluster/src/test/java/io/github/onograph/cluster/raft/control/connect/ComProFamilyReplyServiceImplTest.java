package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.config.EntProVer;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class ComProFamilyReplyServiceImplTest {

  @Test
  void testDipcForHa() {

    ComProFamilyReplyServiceImpl comProFamilyReplyServiceImpl = new ComProFamilyReplyServiceImpl(
        HandshakeStateType.OK,
        "P Type", new EntProVer(1, 1));
    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    comProFamilyReplyServiceImpl
        .dipcForHa(serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3)));
  }

  @Test
  void testDipcForHa2() {

    ComProFamilyReplyServiceImpl comProFamilyReplyServiceImpl = new ComProFamilyReplyServiceImpl(
        HandshakeStateType.OK,
        "P Type", new EntProVer(1, 1));
    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    comProFamilyReplyServiceImpl.dipcForHa(
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)));
  }
}

