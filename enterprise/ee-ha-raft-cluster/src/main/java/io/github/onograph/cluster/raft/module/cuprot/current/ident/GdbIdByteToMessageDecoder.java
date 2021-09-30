package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import org.neo4j.kernel.database.DatabaseId;


public class GdbIdByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf m,
      List<Object> _listOObject) throws Exception {

    DatabaseId _rDatabaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(
        new DefaultReadableChecksumChannel(m));
    _listOObject.add(new GdbId(_rDatabaseId));
  }
}
