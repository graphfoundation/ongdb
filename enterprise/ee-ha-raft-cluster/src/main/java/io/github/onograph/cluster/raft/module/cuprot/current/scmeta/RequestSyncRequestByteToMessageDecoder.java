package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.storageengine.api.StoreId;


public class RequestSyncRequestByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _channelHandlerContext, ByteBuf _byteBuf,
      List<Object> _listLisObject) throws Exception {

    DefaultReadableChecksumChannel _defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        _byteBuf);

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(
        _defaultReadableChecksumChannel);

    StoreId _storeId = StoreIdSafeChannelMarshal.IT.unmarshal(_defaultReadableChecksumChannel);
    _listLisObject.add(new StoreSyncRequest(_databaseId, _storeId));
  }
}
