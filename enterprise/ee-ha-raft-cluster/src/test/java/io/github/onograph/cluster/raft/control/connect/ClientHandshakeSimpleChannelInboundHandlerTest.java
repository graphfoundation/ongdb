package io.github.onograph.cluster.raft.control.connect;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.Test;

class ClientHandshakeSimpleChannelInboundHandlerTest {

  @Test
  void testConstructor() {

    new ClientHandshakeSimpleChannelInboundHandler(
        new HandshakeClientMessageProcessorDefaultImpl(
            new CompletableFuture<ComProFamilyWrapper>()));
  }

  @Test
  void testChannelRead0() {
    ClientHandshakeSimpleChannelInboundHandler clientHandshakeSimpleChannelInboundHandler = new ClientHandshakeSimpleChannelInboundHandler(
        new HandshakeClientMessageProcessorDefaultImpl(
            new CompletableFuture<ComProFamilyWrapper>()));
    HandshakeClientMessageService handshakeClientMessageService = mock(
        HandshakeClientMessageService.class);
    doNothing().when(handshakeClientMessageService)
        .dipcForHa((HandshakeClientMessageProcessor) any());
    clientHandshakeSimpleChannelInboundHandler.channelRead0(null, handshakeClientMessageService);
    verify(handshakeClientMessageService).dipcForHa((HandshakeClientMessageProcessor) any());
  }
}

