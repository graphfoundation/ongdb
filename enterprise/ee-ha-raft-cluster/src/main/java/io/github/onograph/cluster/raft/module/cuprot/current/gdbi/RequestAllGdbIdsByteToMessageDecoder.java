package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class RequestAllGdbIdsByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws Exception {
    _iByteBuf.readByte();
    _listOObject.add(new RequestAllGdbIds());
  }
}
