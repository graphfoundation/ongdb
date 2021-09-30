package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import org.neo4j.storageengine.api.StoreId;


public class StoreDatabaseIdByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf m,
      List<Object> _listOObject) throws Exception {

    StoreId _storeId = StoreIdSafeChannelMarshal.IT.unmarshal(
        new DefaultReadableChecksumChannel(m));
    _listOObject.add(new StoreDatabaseId(_storeId));
  }
}
