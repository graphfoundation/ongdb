package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.net.SocketAddress;


public class ServerSimpleChannelInboundHandler extends SimpleChannelInboundHandler<Object> {


  private final IncomingEventService lseeIncomingEventService;

  public ServerSimpleChannelInboundHandler(IncomingEventService _lseeIncomingEventService) {
    this.lseeIncomingEventService = _lseeIncomingEventService;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext, Object m) {

    SocketAddress _arSocketAddress = _cChannelHandlerContext.channel().remoteAddress();
    if (m instanceof RequestTransactionSync) {
      this.lseeIncomingEventService.ontpurqForSoRe(_arSocketAddress, (RequestTransactionSync) m);
    } else if (m instanceof AbstractCatchupManagementMessageWrapper) {
      this.lseeIncomingEventService.onccpromsForSoAb((AbstractCatchupManagementMessageWrapper) m,
          _arSocketAddress);
    } else {
      this.lseeIncomingEventService.onotrmsgForSoOb(m, _arSocketAddress);
    }

    _cChannelHandlerContext.fireChannelRead(m);
  }
}
