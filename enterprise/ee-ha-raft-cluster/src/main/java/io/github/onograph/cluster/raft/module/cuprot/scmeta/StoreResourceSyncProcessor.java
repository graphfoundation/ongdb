package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.Future;


public class StoreResourceSyncProcessor {


  private final int largest;

  public StoreResourceSyncProcessor(int largest) {
    this.largest = largest;
  }


  public Future<Void> endFuture(ChannelHandlerContext _cChannelHandlerContext, long _lgTcl,
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType stat) {
    _cChannelHandlerContext.write(AnswerMessageType.AMT_SC_COMPLETE);
    return _cChannelHandlerContext.writeAndFlush(new StoreSyncCompleted(_lgTcl, stat));
  }


  public void steForChSt(ChannelHandlerContext _cChannelHandlerContext,
      StoreElementFacade _rsucStoreElementFacade) {
    _cChannelHandlerContext.write(AnswerMessageType.AMT_FP);
    _cChannelHandlerContext.write(
        new SliceMeta(_rsucStoreElementFacade.getRLeng(), _rsucStoreElementFacade.getStrPr()));
    _cChannelHandlerContext.write(new ChunkedInputSliceImpl(this.largest, _rsucStoreElementFacade));
  }
}
