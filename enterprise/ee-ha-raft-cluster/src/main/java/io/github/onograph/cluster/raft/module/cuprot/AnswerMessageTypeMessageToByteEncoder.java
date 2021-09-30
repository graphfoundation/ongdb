package io.github.onograph.cluster.raft.module.cuprot;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class AnswerMessageTypeMessageToByteEncoder extends MessageToByteEncoder<AnswerMessageType> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      AnswerMessageType _rsosAnswerMessageType, ByteBuf _oByteBuf) {
    _oByteBuf.writeByte(_rsosAnswerMessageType.getmTypeByte());
  }
}
