package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class StoreSyncCompletedMessageToByteEncoder extends
    MessageToByteEncoder<StoreSyncCompleted> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, StoreSyncCompleted m,
      ByteBuf _oByteBuf) {
    _oByteBuf.writeInt(m.getStat().ordinal());
    _oByteBuf.writeLong(m.getLgTcl());
  }
}
