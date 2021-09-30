package io.github.onograph.cluster.raft.module.cuprot.current.info;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class MetaMessageToByteEncoder extends MessageToByteEncoder<Meta> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, Meta m, ByteBuf _oByteBuf)
      throws Exception {
    _oByteBuf.writeLong(m.getLgIr());
    _oByteBuf.writeBoolean(m.rectfaeOptional().isPresent());
    m.rectfaeOptional().ifPresent((message) ->
    {
      BasicStringSerializationHandler.maslForBySt(_oByteBuf, message);
    });
  }
}
