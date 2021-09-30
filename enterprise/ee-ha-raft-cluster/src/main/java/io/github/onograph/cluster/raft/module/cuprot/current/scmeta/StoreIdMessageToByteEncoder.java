package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.neo4j.storageengine.api.StoreId;


public class StoreIdMessageToByteEncoder extends MessageToByteEncoder<StoreId> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, StoreId _storeId,
      ByteBuf _oByteBuf) throws Exception {
    StoreIdSafeChannelMarshal.IT.marshal(_storeId, new DefaultWritableChecksumChannel(_oByteBuf));
  }
}
