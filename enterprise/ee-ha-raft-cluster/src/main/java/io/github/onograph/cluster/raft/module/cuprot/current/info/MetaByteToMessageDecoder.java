package io.github.onograph.cluster.raft.module.cuprot.current.info;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class MetaByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) {

    long _lgIr = _iByteBuf.readLong();

    boolean _isFh = _iByteBuf.readBoolean();

    String _strFr = _isFh ? BasicStringSerializationHandler.unahString(_iByteBuf) : null;
    _listOObject.add(Meta.craMeta(_lgIr, _strFr));
  }
}
