package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class AllGdbIdsInboundHandler extends SimpleChannelInboundHandler<AllGdbIds> {


  private final CatchupAnswerLimitHandler catchupAnswerLimitHandler;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;

  public AllGdbIdsInboundHandler(CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.catchupAnswerLimitHandler = _catchupAnswerLimitHandler;
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      AllGdbIds _rsosAllGdbIds)
      throws Exception {
    this.catchupAnswerLimitHandler.ongadteiresForAl(_rsosAllGdbIds);
    this.poooRefCatchupManagerImpl.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT);
  }
}
