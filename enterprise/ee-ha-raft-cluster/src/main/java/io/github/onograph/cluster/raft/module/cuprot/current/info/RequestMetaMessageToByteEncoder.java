package io.github.onograph.cluster.raft.module.cuprot.current.info;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.NamedDatabaseIdSloSafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestMetaMessageToByteEncoder extends MessageToByteEncoder<RequestMeta> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, RequestMeta m,
      ByteBuf _oByteBuf) throws Exception {
    NamedDatabaseIdSloSafeChannelMarshal.IT.marshal(m.getNamedDatabaseId(),
        new DefaultWritableChecksumChannel(_oByteBuf));
  }
}
