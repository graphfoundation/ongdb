package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;


public class AllGdbIdsByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws Exception {

    DefaultReadableChecksumChannel _defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        _iByteBuf);

    long sz = _defaultReadableChecksumChannel.getLong();

    Set<NamedDatabaseId> _setIdNamedDatabaseId = new HashSet();

    for (

        int cur = 0; (long) cur < sz; ++cur) {

      String title = BasicStringSerializationHandler.unahString(_defaultReadableChecksumChannel);

      DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(
          _defaultReadableChecksumChannel);
      _setIdNamedDatabaseId.add(DatabaseIdFactory.from(title, _databaseId.uuid()));
    }

    _listOObject.add(new AllGdbIds(_setIdNamedDatabaseId));
  }
}
