package io.github.onograph.cluster.raft.control.connect;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class ClientHandshakeSimpleChannelInboundHandler extends
    SimpleChannelInboundHandler<HandshakeClientMessageService> {


  private final HandshakeClientMessageProcessorDefaultImpl hnlrHandshakeClientMessageProcessorDefaultImpl;

  public ClientHandshakeSimpleChannelInboundHandler(
      HandshakeClientMessageProcessorDefaultImpl _hnlrHandshakeClientMessageProcessorDefaultImpl) {
    this.hnlrHandshakeClientMessageProcessorDefaultImpl = _hnlrHandshakeClientMessageProcessorDefaultImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      HandshakeClientMessageService m) {
    m.dipcForHa(this.hnlrHandshakeClientMessageProcessorDefaultImpl);
  }
}
