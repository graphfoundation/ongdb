package io.github.onograph.cluster.raft.module.cuprot;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class AskMessageTypeMessageToByteEncoder extends MessageToByteEncoder<AskMessageType> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      AskMessageType _rqetAskMessageType, ByteBuf _oByteBuf) {
    _oByteBuf.writeByte(_rqetAskMessageType.getTmByte());
  }
}
