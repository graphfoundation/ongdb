package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class CatchupProblemByteToMessageDecoder extends ByteToMessageDecoder {

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) {

    int _iOs = _iByteBuf.readInt();

    CatchupStatusType _rslCatchupStatusType = CatchupStatusType.values()[_iOs];

    String m = BasicStringSerializationHandler.unahString(_iByteBuf);
    _listOObject.add(new CatchupProblem(m, _rslCatchupStatusType));
  }
}
