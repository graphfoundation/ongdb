package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import org.neo4j.string.UTF8;


public class SliceMetaByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf m,
      List<Object> _listOObject) {

    int len = m.readInt();

    byte[] btCnt = new byte[len];
    m.readBytes(btCnt);

    String title = UTF8.decode(btCnt);

    int _iAr = m.readInt();
    _listOObject.add(new SliceMeta(_iAr, title));
  }
}
