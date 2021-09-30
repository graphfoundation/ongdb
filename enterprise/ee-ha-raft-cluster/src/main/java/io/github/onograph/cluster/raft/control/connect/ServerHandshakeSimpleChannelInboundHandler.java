package io.github.onograph.cluster.raft.control.connect;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class ServerHandshakeSimpleChannelInboundHandler extends
    SimpleChannelInboundHandler<HandshakeMessageService> {


  private final ServerComProMessageProcessorHandshakeImpl hnlrServerComProMessageProcessorHandshakeImpl;

  public ServerHandshakeSimpleChannelInboundHandler(
      ServerComProMessageProcessorHandshakeImpl _hnlrServerComProMessageProcessorHandshakeImpl) {
    this.hnlrServerComProMessageProcessorHandshakeImpl = _hnlrServerComProMessageProcessorHandshakeImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      HandshakeMessageService m) {
    m.dipcForSe(this.hnlrServerComProMessageProcessorHandshakeImpl);
  }
}
