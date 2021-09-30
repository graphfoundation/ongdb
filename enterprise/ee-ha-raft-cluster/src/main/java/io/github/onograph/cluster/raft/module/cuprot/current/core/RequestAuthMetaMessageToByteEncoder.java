package io.github.onograph.cluster.raft.module.cuprot.current.core;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestAuthMetaMessageToByteEncoder extends MessageToByteEncoder<RequestAuthMeta> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, RequestAuthMeta m,
      ByteBuf _oByteBuf) throws Exception {
    BasicStringSerializationHandler.maslForBySt(_oByteBuf, m.gdbName);
    BasicStringSerializationHandler.maslForBySt(_oByteBuf, m.indmaAuthMetaOptions.name());
  }
}
