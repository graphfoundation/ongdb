package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestAllGdbIdsMessageToByteEncoder extends MessageToByteEncoder<RequestAllGdbIds> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, RequestAllGdbIds m,
      ByteBuf _oByteBuf) throws Exception {
    _oByteBuf.writeByte(1);
  }
}
