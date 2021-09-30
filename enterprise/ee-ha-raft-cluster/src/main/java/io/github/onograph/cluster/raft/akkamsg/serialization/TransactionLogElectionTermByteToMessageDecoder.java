package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.module.cuprot.Ref;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;


public class TransactionLogElectionTermByteToMessageDecoder extends ByteToMessageDecoder {


  private final Ref<MessageDataType> refPoooMessageDataType;

  public TransactionLogElectionTermByteToMessageDecoder(
      Ref<MessageDataType> _refPoooMessageDataType) {
    this.refPoooMessageDataType = _refPoooMessageDataType;
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) {

    int sz = _iByteBuf.readInt();

    long[] _lgTrsArray = new long[sz];

    for (

        int cur = 0; cur < sz; ++cur) {
      _lgTrsArray[cur] = _iByteBuf.readLong();
    }

    _listOObject.add(new ConsensusTransactionLogElectionTermsWrapper(_lgTrsArray));
    this.refPoooMessageDataType.exeForE(MessageDataType.CT);
  }
}
