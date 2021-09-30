package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class TransactionChunkingCompletedByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf m,
      List<Object> _listOObject) {

    int _iOdnl = m.readInt();

    long _lgTl = m.readLong();

    CatchupStatusType stat = CatchupStatusType.values()[_iOdnl];
    _listOObject.add(new TransactionChunkingCompleted(_lgTl, stat));
  }
}
