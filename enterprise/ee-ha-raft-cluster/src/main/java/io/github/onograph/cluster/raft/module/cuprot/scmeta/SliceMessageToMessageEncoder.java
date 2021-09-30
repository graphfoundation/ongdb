package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;


public class SliceMessageToMessageEncoder extends MessageToMessageEncoder<Slice> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, Slice _cukSlice,
      List<Object> _listOObject) {

    ByteBuf hdrByte = _cChannelHandlerContext.alloc().ioBuffer(4);
    hdrByte.writeInt(Slice.maehar(_cukSlice.getIsIl()));

    ByteBuf _pyodByteBuf = _cukSlice.getPyodByteBuf();

    CompositeByteBuf _faeCompositeByteBuf = _cChannelHandlerContext.alloc().compositeBuffer(2);
    _faeCompositeByteBuf.addComponent(true, hdrByte);
    _faeCompositeByteBuf.addComponent(true, _pyodByteBuf);
    _listOObject.add(_faeCompositeByteBuf);
  }
}
