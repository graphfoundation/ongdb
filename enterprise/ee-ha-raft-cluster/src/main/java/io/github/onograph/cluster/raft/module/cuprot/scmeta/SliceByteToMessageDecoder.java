package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class SliceByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _faeByteBuf,
      List<Object> _listOObject) {

    int hdrByte = _faeByteBuf.readInt();

    boolean _isLi = Slice.isPashee(hdrByte);

    ByteBuf _pyodByteBuf = _faeByteBuf.readRetainedSlice(_faeByteBuf.readableBytes());

    boolean _isSces = false;

    try {

      Slice _cfSlice = new Slice(_isLi, _pyodByteBuf);
      _listOObject.add(_cfSlice);
      _isSces = true;
    } finally {
      if (!_isSces) {
        _pyodByteBuf.release();
      }
    }
  }
}
