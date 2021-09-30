package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class CatchupIncomingTransactionReplySimpleChannelInboundHandler extends
    SimpleChannelInboundHandler<CatchupIncomingTransactionReply> {


  private final CatchupAnswerLimitHandler catchupAnswerLimitHandler;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;


  public CatchupIncomingTransactionReplySimpleChannelInboundHandler(
      CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.catchupAnswerLimitHandler = _catchupAnswerLimitHandler;
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      CatchupIncomingTransactionReply m) {
    if (this.poooRefCatchupManagerImpl.isExcnForE(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRF_IN_ANSWER)) {
      if (m.equals(CatchupIncomingTransactionReply.EMT_CATCHUP_INCOMING_TRANSACTION_REPLY)) {
        this.poooRefCatchupManagerImpl.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT);
      } else {
        this.catchupAnswerLimitHandler.ontpurseForCa(m);
      }
    } else {
      _cChannelHandlerContext.fireChannelRead(m);
    }
  }
}
