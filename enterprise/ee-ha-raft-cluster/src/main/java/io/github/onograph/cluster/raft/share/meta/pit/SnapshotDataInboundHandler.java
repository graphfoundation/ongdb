package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class SnapshotDataInboundHandler extends SimpleChannelInboundHandler<SnapshotData> {


  private final CatchupAnswerLimitHandler lseeCatchupAnswerLimitHandler;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;


  public SnapshotDataInboundHandler(CatchupAnswerLimitHandler _lseeCatchupAnswerLimitHandler,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.lseeCatchupAnswerLimitHandler = _lseeCatchupAnswerLimitHandler;
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      SnapshotData _scSnapshotData) {
    if (this.poooRefCatchupManagerImpl.isExcnForE(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.CS)) {
      this.lseeCatchupAnswerLimitHandler.oncospoForSn(_scSnapshotData);
      this.poooRefCatchupManagerImpl.exeForE(
          io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT);
    } else {
      _cChannelHandlerContext.fireChannelRead(_scSnapshotData);
    }
  }
}
