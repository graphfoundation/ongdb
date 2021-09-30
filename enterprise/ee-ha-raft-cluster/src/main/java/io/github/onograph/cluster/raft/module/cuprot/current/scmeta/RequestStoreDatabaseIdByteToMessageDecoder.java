package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;


public class RequestStoreDatabaseIdByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _byteBuf,
      List<Object> _listOObject)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(
        new DefaultReadableChecksumChannel(_byteBuf));
    _listOObject.add(new RequestStoreDatabaseIdCatchupManagement(_databaseId));
  }
}
