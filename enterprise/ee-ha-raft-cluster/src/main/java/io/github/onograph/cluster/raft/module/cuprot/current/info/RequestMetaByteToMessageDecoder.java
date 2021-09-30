package io.github.onograph.cluster.raft.module.cuprot.current.info;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.NamedDatabaseIdSloSafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class RequestMetaByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws Exception {
    _listOObject.add(new RequestMeta(NamedDatabaseIdSloSafeChannelMarshal.IT.unmarshal(
        new DefaultReadableChecksumChannel(_iByteBuf))));
  }
}
