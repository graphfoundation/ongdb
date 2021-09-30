package io.github.onograph.cluster.raft.control.connect;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class ServerHandshakeSimpleChannelInboundHandlerTest {

  @Test
  void testConstructor() {

    new ServerHandshakeSimpleChannelInboundHandler(null);
  }

  @Test
  void testChannelRead0() {
    ServerHandshakeSimpleChannelInboundHandler serverHandshakeSimpleChannelInboundHandler = new ServerHandshakeSimpleChannelInboundHandler(
        null);
    HandshakeMessageService handshakeMessageService = mock(HandshakeMessageService.class);
    doNothing().when(handshakeMessageService).dipcForSe((ServerComProMessageProcessor) any());
    serverHandshakeSimpleChannelInboundHandler.channelRead0(null, handshakeMessageService);
    verify(handshakeMessageService).dipcForSe((ServerComProMessageProcessor) any());
  }
}

