package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.neo4j.string.UTF8;


public class SliceMetaMessageToByteEncoder extends MessageToByteEncoder<SliceMeta> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, SliceMeta m,
      ByteBuf _oByteBuf) {

    String title = m.getStrNf();

    byte[] btCnt = UTF8.encode(title);
    _oByteBuf.writeInt(btCnt.length);
    _oByteBuf.writeBytes(btCnt);
    _oByteBuf.writeInt(m.getIAr());
  }
}
