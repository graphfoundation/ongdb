package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class SnapshotDataMessageToByteEncoder extends MessageToByteEncoder<SnapshotData> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, SnapshotData _scSnapshotData,
      ByteBuf _oByteBuf) throws Exception {
    (new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData.MarshalChannelImplCMS()).marshal(
        _scSnapshotData,
        new DefaultWritableChecksumChannel(
            _oByteBuf));
  }
}
