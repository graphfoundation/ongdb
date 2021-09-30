package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestStoreResourceMessageToByteEncoder extends
    MessageToByteEncoder<RequestStoreResource> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, RequestStoreResource m,
      ByteBuf _oByteBuf) throws Exception {

    DefaultWritableChecksumChannel _defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        _oByteBuf);
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(m.getDatabaseId(), _defaultWritableChecksumChannel);
    StoreIdSafeChannelMarshal.IT.marshal(m.getEpceStoreId(), _defaultWritableChecksumChannel);
    _oByteBuf.writeLong(m.getLgItr());

    String title = m.getPath().getFileName().toString();
    BasicStringSerializationHandler.maslForBySt(_oByteBuf, title);
  }
}
