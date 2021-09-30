package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.Iterator;
import org.neo4j.kernel.database.NamedDatabaseId;


public class AllGdbIdsMessageToByteEncoder extends MessageToByteEncoder<AllGdbIds> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, AllGdbIds _rsosAllGdbIds,
      ByteBuf _oByteBuf) throws Exception {

    DefaultWritableChecksumChannel _defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        _oByteBuf);
    _defaultWritableChecksumChannel.putLong(_rsosAllGdbIds.getSz());

    Iterator _iterator = _rsosAllGdbIds.getSetDiNamedDatabaseId().iterator();

    while (_iterator.hasNext()) {

      NamedDatabaseId _namedDatabaseId = (NamedDatabaseId) _iterator.next();
      BasicStringSerializationHandler.maslForBySt(_namedDatabaseId.name(),
          _defaultWritableChecksumChannel);
      DatabaseIdOnlySafeChannelMarshal.IT.marshal(_namedDatabaseId.databaseId(),
          _defaultWritableChecksumChannel);
    }
  }
}
