package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.function.BiConsumer;


public class ServerMessageToByteEncoder extends
    MessageToByteEncoder<HandshakeClientMessageService> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      HandshakeClientMessageService m, ByteBuf _oByteBuf) {
    m.dipcForHa(
        new io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl(
            _oByteBuf));
  }


  class ServerMessageHandlerClientEncoderImpl implements HandshakeClientMessageProcessor {


    private final ByteBuf oByteBuf;

    ServerMessageHandlerClientEncoderImpl(ByteBuf _oByteBuf) {
      this.oByteBuf = _oByteBuf;
    }


    private <U extends Comparable<U>> void _eneporesForAbBi(
        AbstractComProFamilyReplyService<U> _abstractComProFamilyReplyServiceRpU,
        BiConsumer<ByteBuf, U> _biConsumerWiebu) {
      this.oByteBuf.writeInt(
          _abstractComProFamilyReplyServiceRpU.getCsHandshakeStateType().getHsCodeVal());
      BasicStringSerializationHandler.maslForBySt(this.oByteBuf,
          _abstractComProFamilyReplyServiceRpU.getPType());
      _biConsumerWiebu.accept(this.oByteBuf, _abstractComProFamilyReplyServiceRpU.getIVrin());
    }

    @Override
    public void hadForCh(MutatingComProReply _rpmMutatingComProReply) {
      this.oByteBuf.writeInt(1);
      this._eneporesForAbBi(_rpmMutatingComProReply, BasicStringSerializationHandler::maslForBySt);
    }

    @Override
    public void hadForCh(ChangeComProReplyImpl _rosChangeComProReplyImpl) {
      this.oByteBuf.writeInt(2);
      this.oByteBuf.writeInt(_rosChangeComProReplyImpl.getStat().getHsCodeVal());
    }

    @Override
    public void hadForCh(ComProFamilyReplyServiceImpl _rpaComProFamilyReplyServiceImpl) {
      this.oByteBuf.writeInt(0);
      this._eneporesForAbBi(_rpaComProFamilyReplyServiceImpl, (buf, version) ->
      {
        version.enoForBy(buf);
      });
    }
  }
}
