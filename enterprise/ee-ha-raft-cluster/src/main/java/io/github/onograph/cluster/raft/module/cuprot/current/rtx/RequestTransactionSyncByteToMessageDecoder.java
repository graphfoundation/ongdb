package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.storageengine.api.StoreId;


public class RequestTransactionSyncByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _byteBuf,
      List<Object> _listOObject) throws Exception {

    DefaultReadableChecksumChannel _defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        _byteBuf);

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(
        _defaultReadableChecksumChannel);

    long transIdx = _byteBuf.readLong();

    StoreId _storeId = StoreIdSafeChannelMarshal.IT.unmarshal(_defaultReadableChecksumChannel);
    _listOObject.add(new RequestTransactionSync(_databaseId, _storeId, transIdx));
  }
}
