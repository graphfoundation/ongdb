package io.github.onograph.cluster.raft.control.connect;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.config.EntProVer;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.helpers.collection.Pair;

class ClientMessageToByteEncoderTest {

  @Test
  void testEncode() {
    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    HandshakeMessageService handshakeMessageService = mock(HandshakeMessageService.class);
    doNothing().when(handshakeMessageService).dipcForSe((ServerComProMessageProcessor) any());
    clientMessageToByteEncoder.encode(null, handshakeMessageService, Unpooled.compositeBuffer(3));
    verify(handshakeMessageService).dipcForSe((ServerComProMessageProcessor) any());
  }

  @Test
  void testServerMessageHandlerClientEncoderImplConstructor() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
        Unpooled.compositeBuffer(3));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForMu() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));
    ArrayList<Pair<String, String>> _listPmPair = new ArrayList<Pair<String, String>>();
    serverMessageHandlerClientEncoderImpl
        .hadForMu(new ChangeComProRequestImpl(_listPmPair, " str Npa", new EntProVer(1, 1)));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForMu2() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));
    serverMessageHandlerClientEncoderImpl
        .hadForMu(new ComProFamilyRequestServiceImpl("P Type", new HashSet<EntProVer>()));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForMu3() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    serverMessageHandlerClientEncoderImpl
        .hadForMu(new ComProFamilyRequestServiceImpl("P Type", new HashSet<EntProVer>()));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForMu4() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));
    serverMessageHandlerClientEncoderImpl
        .hadForMu(new MutatingComProFamilyRequestService("P Type", new HashSet<String>()));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForMu5() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    serverMessageHandlerClientEncoderImpl
        .hadForMu(new MutatingComProFamilyRequestService("P Type", new HashSet<String>()));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForMu6() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));

    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("foo");
    serverMessageHandlerClientEncoderImpl.hadForMu(
        new MutatingComProFamilyRequestService("P Type", stringSet));
  }

  @Test
  void testServerMessageHandlerClientEncoderImplHadForMu7() {

    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl serverMessageHandlerClientEncoderImpl =
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3));

    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("42");
    stringSet.add("foo");
    serverMessageHandlerClientEncoderImpl.hadForMu(
        new MutatingComProFamilyRequestService("P Type", stringSet));
  }
}

