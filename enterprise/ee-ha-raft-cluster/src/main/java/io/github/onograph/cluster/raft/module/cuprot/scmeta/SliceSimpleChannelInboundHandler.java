package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.ReferenceCountUtil;


public class SliceSimpleChannelInboundHandler extends SimpleChannelInboundHandler<Slice> {


  private final CatchupAnswerLimitHandler catchupAnswerLimitHandler;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;


  public SliceSimpleChannelInboundHandler(CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.catchupAnswerLimitHandler = _catchupAnswerLimitHandler;
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext, Slice _cfSlice)
      throws Exception {
    try {
      if (this.catchupAnswerLimitHandler.isOnficttForSl(_cfSlice)) {
        this.poooRefCatchupManagerImpl.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT);
      }
    } finally {
      ReferenceCountUtil.release(_cfSlice.getPyodByteBuf());
    }
  }
}
