package io.github.onograph.cluster.raft.module.cuprot.current.core;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.ArrayList;
import java.util.List;


public class AuthMetaByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws Exception {

    DefaultReadableChecksumChannel _defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        _iByteBuf);

    long sz = _defaultReadableChecksumChannel.getLong();

    List<String> _listCmadString = new ArrayList();

    for (

        int cur = 0; (long) cur < sz; ++cur) {
      _listCmadString.add(BasicStringSerializationHandler.unahString(_iByteBuf));
    }

    _listOObject.add(new AuthMeta(_listCmadString));
  }
}
