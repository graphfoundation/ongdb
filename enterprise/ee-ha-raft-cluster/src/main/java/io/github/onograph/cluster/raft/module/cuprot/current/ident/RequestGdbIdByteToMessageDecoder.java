package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class RequestGdbIdByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws Exception {

    String gdbName = BasicStringSerializationHandler.unahString(_iByteBuf);
    _listOObject.add(new RequestGdbId(gdbName));
  }
}
