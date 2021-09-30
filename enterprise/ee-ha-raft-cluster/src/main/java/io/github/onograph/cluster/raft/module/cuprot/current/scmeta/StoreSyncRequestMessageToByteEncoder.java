package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class StoreSyncRequestMessageToByteEncoder extends MessageToByteEncoder<StoreSyncRequest> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      StoreSyncRequest _storeSyncRequest, ByteBuf _byteBuf)
      throws Exception {

    DefaultWritableChecksumChannel _defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        _byteBuf);
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_storeSyncRequest.getDatabaseId(),
        _defaultWritableChecksumChannel);
    StoreIdSafeChannelMarshal.IT.marshal(_storeSyncRequest.getStoreId(),
        _defaultWritableChecksumChannel);
  }
}
