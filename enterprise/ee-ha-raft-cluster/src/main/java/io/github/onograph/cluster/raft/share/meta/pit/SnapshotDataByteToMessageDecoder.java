package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class SnapshotDataByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf m,
      List<Object> _listOObject) throws Exception {
    _listOObject.add(
        (new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData.MarshalChannelImplCMS()).unmarshal(
            new DefaultReadableChecksumChannel(m)));
  }
}
