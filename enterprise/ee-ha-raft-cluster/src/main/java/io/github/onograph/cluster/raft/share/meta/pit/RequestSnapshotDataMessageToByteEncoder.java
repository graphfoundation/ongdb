package io.github.onograph.cluster.raft.share.meta.pit;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class RequestSnapshotDataMessageToByteEncoder extends
    MessageToByteEncoder<RequestSnapshotData> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, RequestSnapshotData m,
      ByteBuf _oByteBuf) {
    _oByteBuf.writeByte(0);
  }
}
