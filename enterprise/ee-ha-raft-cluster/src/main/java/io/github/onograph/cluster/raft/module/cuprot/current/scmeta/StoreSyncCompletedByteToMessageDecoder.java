package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class StoreSyncCompletedByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf m,
      List<Object> _listOObject) {

    int _iOs = m.readInt();

    long _lgTcl = m.readLong();
    _listOObject.add(new StoreSyncCompleted(_lgTcl,
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.values()[_iOs]));
  }
}
