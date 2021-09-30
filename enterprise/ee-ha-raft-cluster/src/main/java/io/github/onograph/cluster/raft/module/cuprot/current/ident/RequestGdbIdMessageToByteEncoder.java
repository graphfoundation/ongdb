package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestGdbIdMessageToByteEncoder extends MessageToByteEncoder<RequestGdbId> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, RequestGdbId m,
      ByteBuf _oByteBuf) throws Exception {
    BasicStringSerializationHandler.maslForBySt(_oByteBuf, m.getGdbName());
  }
}
