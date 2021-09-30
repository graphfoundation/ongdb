package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class MessageDataTypeMessageToByteEncoder extends MessageToByteEncoder<MessageDataType> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, MessageDataType m,
      ByteBuf _oByteBuf) {
    _oByteBuf.writeByte(m.getMcd());
  }
}
