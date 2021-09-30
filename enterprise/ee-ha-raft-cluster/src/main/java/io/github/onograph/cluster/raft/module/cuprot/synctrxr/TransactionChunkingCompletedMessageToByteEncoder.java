package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class TransactionChunkingCompletedMessageToByteEncoder extends
    MessageToByteEncoder<TransactionChunkingCompleted> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      TransactionChunkingCompleted _rsosTransactionChunkingCompleted, ByteBuf _oByteBuf) {
    _oByteBuf.writeInt(_rsosTransactionChunkingCompleted.getStat().ordinal());
    _oByteBuf.writeLong(_rsosTransactionChunkingCompleted.getLgItl());
  }
}
