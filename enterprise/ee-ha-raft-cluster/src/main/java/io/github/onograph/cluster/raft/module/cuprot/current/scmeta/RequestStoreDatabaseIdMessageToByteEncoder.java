package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestStoreDatabaseIdMessageToByteEncoder extends
    MessageToByteEncoder<RequestStoreDatabaseIdCatchupManagement> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      RequestStoreDatabaseIdCatchupManagement _requestStoreDatabaseIdCatchupManagement,
      ByteBuf _oByteBuf) throws Exception {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(
        _requestStoreDatabaseIdCatchupManagement.getDatabaseId(),
        new DefaultWritableChecksumChannel(_oByteBuf));
  }
}
