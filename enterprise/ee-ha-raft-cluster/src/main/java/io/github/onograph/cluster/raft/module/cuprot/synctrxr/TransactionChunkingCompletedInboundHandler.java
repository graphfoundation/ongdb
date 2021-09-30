package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class TransactionChunkingCompletedInboundHandler extends
    SimpleChannelInboundHandler<TransactionChunkingCompleted> {


  private final CatchupAnswerLimitHandler catchupAnswerLimitHandler;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;


  public TransactionChunkingCompletedInboundHandler(
      CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.catchupAnswerLimitHandler = _catchupAnswerLimitHandler;
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      TransactionChunkingCompleted m) {
    this.catchupAnswerLimitHandler.ontstfhrseForTr(m);
    this.poooRefCatchupManagerImpl.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT);
  }
}
