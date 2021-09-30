package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.Ref;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import java.util.function.Supplier;
import org.neo4j.logging.LogProvider;


public class MessageRequestCIHAManager extends
    MessageRequestChannelInboundHandlerAdapter<MessageDataType> {

  public MessageRequestCIHAManager(Ref<MessageDataType> _refPoooMessageDataType,
      LogProvider _logProvider, ConsensusByteToMessageDecoder _consensusByteToMessageDecoder,
      Supplier<SyncableDataByteToMessageDecoder> _supplierDccSyncableDataByteToMessageDecoder) {
    super(_logProvider, _refPoooMessageDataType);
    this.reieForECh(new ByteToMessageDecoder() {
      @Override
      protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
          List<Object> _listOObject) {
        if (_iByteBuf.readableBytes() > 0) {

          throw new IllegalStateException("*** Error:  6eb7b30a-86ac-46bc-934c-8094fd3b2495");
        }
      }
    }, MessageDataType.CT);
    this.reieForECh(new TransactionLogElectionTermByteToMessageDecoder(_refPoooMessageDataType),
        MessageDataType.CON_ENT_TMS);
    this.reieForECh(_supplierDccSyncableDataByteToMessageDecoder.get(), MessageDataType.DUPD_MD);
    this.reieForECh(_consensusByteToMessageDecoder, MessageDataType.MSG);
  }
}
