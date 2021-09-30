package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.neo4j.logging.Log;


public class SliceMetaSimpleChannelInboundHandler extends SimpleChannelInboundHandler<SliceMeta> {


  private final CatchupAnswerLimitHandler catchupAnswerLimitHandler;


  private final Log log;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;


  public SliceMetaSimpleChannelInboundHandler(CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
      Log _log, RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.catchupAnswerLimitHandler = _catchupAnswerLimitHandler;
    this.log = _log;
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      SliceMeta _fhSliceMeta) {

    this.catchupAnswerLimitHandler.onfihdForSl(_fhSliceMeta);
    this.poooRefCatchupManagerImpl.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.FPART);
  }
}
