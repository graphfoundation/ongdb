package io.github.onograph.cluster.raft.module.cuprot.current.core;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class AuthMetaMessageToByteEncoder extends MessageToByteEncoder<AuthMeta> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, AuthMeta m,
      ByteBuf _oByteBuf) throws Exception {

    DefaultWritableChecksumChannel _defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        _oByteBuf);
    _defaultWritableChecksumChannel.putLong(m.getListCmadString().size());
    m.getListCmadString().forEach((command) ->
    {
      BasicStringSerializationHandler.maslForBySt(_oByteBuf, command);
    });
  }
}
