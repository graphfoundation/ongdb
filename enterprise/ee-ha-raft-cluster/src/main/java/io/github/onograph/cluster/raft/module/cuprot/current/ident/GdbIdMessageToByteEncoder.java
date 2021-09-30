package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.neo4j.kernel.database.DatabaseId;


public class GdbIdMessageToByteEncoder extends MessageToByteEncoder<DatabaseId> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, DatabaseId m,
      ByteBuf _oByteBuf) throws Exception {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(m, new DefaultWritableChecksumChannel(_oByteBuf));
  }
}
