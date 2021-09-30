package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestTransactionSyncMessageToByteEncoder extends
    MessageToByteEncoder<RequestTransactionSync> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      RequestTransactionSync _requestTransactionSync, ByteBuf _oByteBuf)
      throws Exception {

    DefaultWritableChecksumChannel _defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        _oByteBuf);
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_requestTransactionSync.getDatabaseId(),
        _defaultWritableChecksumChannel);
    _defaultWritableChecksumChannel.putLong(_requestTransactionSync.getLgItp());
    StoreIdSafeChannelMarshal.IT.marshal(_requestTransactionSync.getEpceStoreId(),
        _defaultWritableChecksumChannel);
  }
}
