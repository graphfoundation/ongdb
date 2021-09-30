package io.github.onograph.cluster.raft.control.connect;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.config.EntProVer;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class ServerMessageToByteEncoderTest {

  @Test
  void testEncode() {
    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    HandshakeClientMessageService handshakeClientMessageService = mock(
        HandshakeClientMessageService.class);
    doNothing().when(handshakeClientMessageService)
        .dipcForHa((HandshakeClientMessageProcessor) any());
    serverMessageToByteEncoder.encode(null, handshakeClientMessageService,
        Unpooled.compositeBuffer(3));
    verify(handshakeClientMessageService).dipcForHa((HandshakeClientMessageProcessor) any());
  }

  @Test
  void testServerMessageHandlerClientEncoderImplConstructor() {

    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
        Unpooled.compositeBuffer(3));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForCh() {

    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    ServerMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));
    serverMessageHandlerClientEncoderImpl.hadForCh(
        new ChangeComProReplyImpl(HandshakeStateType.OK));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForCh2() {

    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    ServerMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    serverMessageHandlerClientEncoderImpl.hadForCh(
        new ChangeComProReplyImpl(HandshakeStateType.OK));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForCh3() {

    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    ServerMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));
    serverMessageHandlerClientEncoderImpl
        .hadForCh(
            new ComProFamilyReplyServiceImpl(HandshakeStateType.OK, "P Type", new EntProVer(1, 1)));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForCh4() {

    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    ServerMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));
    serverMessageHandlerClientEncoderImpl
        .hadForCh(new ComProFamilyReplyServiceImpl(HandshakeStateType.OK, "P Type",
            new EntProVer(1, 1, 1)));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForCh5() {

    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    ServerMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));
    serverMessageHandlerClientEncoderImpl.hadForCh(
        MutatingComProReply.faleMutatingComProReply("P Type"));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForCh6() {

    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    ServerMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    serverMessageHandlerClientEncoderImpl.hadForCh(
        MutatingComProReply.faleMutatingComProReply("P Type"));
  }
}

