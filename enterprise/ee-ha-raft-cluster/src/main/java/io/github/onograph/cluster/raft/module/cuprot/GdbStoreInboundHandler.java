package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class GdbStoreInboundHandler extends SimpleChannelInboundHandler<SetupGdbStoreSyncReply> {


  private final CatchupAnswerLimitHandler catchupAnswerLimitHandler;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;


  public GdbStoreInboundHandler(CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.catchupAnswerLimitHandler = _catchupAnswerLimitHandler;
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      SetupGdbStoreSyncReply m)
      throws Exception {
    this.catchupAnswerLimitHandler.onsrltresForSe(m);
    this.poooRefCatchupManagerImpl.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT);
  }
}
