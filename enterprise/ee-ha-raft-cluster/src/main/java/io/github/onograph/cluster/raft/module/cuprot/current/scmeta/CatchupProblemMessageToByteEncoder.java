package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class CatchupProblemMessageToByteEncoder extends MessageToByteEncoder<CatchupProblem> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, CatchupProblem m,
      ByteBuf _oByteBuf) {
    _oByteBuf.writeInt(m.getStat().ordinal());
    BasicStringSerializationHandler.maslForBySt(_oByteBuf, m.getM());
  }
}
