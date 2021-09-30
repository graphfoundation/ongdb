package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.Test;

class ChangeComProReplyImplTest {

  @Test
  void testConstructor() {
    assertEquals(HandshakeStateType.OK,
        (new ChangeComProReplyImpl(HandshakeStateType.OK)).getStat());
  }

  @Test
  void testDipcForHa() {

    ChangeComProReplyImpl changeComProReplyImpl = new ChangeComProReplyImpl(HandshakeStateType.OK);
    changeComProReplyImpl
        .dipcForHa(new HandshakeClientMessageProcessorDefaultImpl(
            new CompletableFuture<ComProFamilyWrapper>()));
  }

  @Test
  void testDipcForHa2() {

    ChangeComProReplyImpl changeComProReplyImpl = new ChangeComProReplyImpl(HandshakeStateType.OK);
    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    changeComProReplyImpl
        .dipcForHa(serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3)));
  }

  @Test
  void testDipcForHa3() {

    ChangeComProReplyImpl changeComProReplyImpl = new ChangeComProReplyImpl(HandshakeStateType.OK);
    ServerMessageToByteEncoder serverMessageToByteEncoder = new ServerMessageToByteEncoder();
    changeComProReplyImpl.dipcForHa(
        serverMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)));
  }

  @Test
  void testEquals() {
    assertFalse((new ChangeComProReplyImpl(HandshakeStateType.OK)).equals(null));
    assertFalse((new ChangeComProReplyImpl(HandshakeStateType.OK)).equals(
        "Different type to ChangeComProReplyImpl"));
  }

  @Test
  void testEquals2() {
    ChangeComProReplyImpl changeComProReplyImpl = new ChangeComProReplyImpl(HandshakeStateType.OK);
    assertTrue(changeComProReplyImpl.equals(changeComProReplyImpl));
    int expectedHashCodeResult = changeComProReplyImpl.hashCode();
    assertEquals(expectedHashCodeResult, changeComProReplyImpl.hashCode());
  }

  @Test
  void testEquals3() {
    ChangeComProReplyImpl changeComProReplyImpl = new ChangeComProReplyImpl(HandshakeStateType.OK);
    ChangeComProReplyImpl changeComProReplyImpl1 = new ChangeComProReplyImpl(HandshakeStateType.OK);
    assertTrue(changeComProReplyImpl.equals(changeComProReplyImpl1));
    int expectedHashCodeResult = changeComProReplyImpl.hashCode();
    assertEquals(expectedHashCodeResult, changeComProReplyImpl1.hashCode());
  }

  @Test
  void testEquals4() {
    ChangeComProReplyImpl changeComProReplyImpl = new ChangeComProReplyImpl(null);
    assertFalse(changeComProReplyImpl.equals(new ChangeComProReplyImpl(HandshakeStateType.OK)));
  }
}

