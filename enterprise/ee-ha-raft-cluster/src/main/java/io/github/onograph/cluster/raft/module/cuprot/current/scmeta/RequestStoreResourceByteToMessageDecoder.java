package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.nio.file.Path;
import java.util.List;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.util.Preconditions;


public class RequestStoreResourceByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws Exception {

    DefaultReadableChecksumChannel _defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        _iByteBuf);

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(
        _defaultReadableChecksumChannel);

    StoreId _storeId = StoreIdSafeChannelMarshal.IT.unmarshal(_defaultReadableChecksumChannel);

    long _lgItr = _iByteBuf.readLong();

    String _strNf = BasicStringSerializationHandler.unahString(_iByteBuf);
    Preconditions.checkState(_strNf != null, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResourceByteToMessageDecoder.checkState"));

    RequestStoreResource _requestStoreResource = new RequestStoreResource(_databaseId, _storeId,
        _lgItr, Path.of(_strNf));
    _listOObject.add(_requestStoreResource);
  }
}
