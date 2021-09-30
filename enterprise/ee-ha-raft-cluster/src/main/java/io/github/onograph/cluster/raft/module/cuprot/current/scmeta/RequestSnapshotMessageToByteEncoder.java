package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;


public class RequestSnapshotMessageToByteEncoder extends MessageToByteEncoder<RequestSnapshotData> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, RequestSnapshotData m,
      ByteBuf _oByteBuf) throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(m.getDatabaseId(),
        new DefaultWritableChecksumChannel(_oByteBuf));
  }
}
