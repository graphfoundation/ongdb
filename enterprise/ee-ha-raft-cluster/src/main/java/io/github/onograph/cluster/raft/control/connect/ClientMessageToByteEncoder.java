package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.function.BiConsumer;


public class ClientMessageToByteEncoder extends MessageToByteEncoder<HandshakeMessageService> {

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext, HandshakeMessageService m,
      ByteBuf _oByteBuf) {
    m.dipcForSe(
        new io.github.onograph.cluster.raft.control.connect.ClientMessageToByteEncoder.ServerMessageHandlerClientEncoderImpl(
            _oByteBuf));
  }


  class ServerMessageHandlerClientEncoderImpl implements ServerComProMessageProcessor {


    private final ByteBuf oByteBuf;

    ServerMessageHandlerClientEncoderImpl(ByteBuf _oByteBuf) {
      this.oByteBuf = _oByteBuf;
    }


    private <U extends Comparable<U>> void _eneporetForAbBi(
        AbstractComProFamilyRequestService<U> _abstractComProFamilyRequestServicePrU,
        BiConsumer<ByteBuf, U> _biConsumerWiebu) {
      BasicStringSerializationHandler.maslForBySt(this.oByteBuf,
          _abstractComProFamilyRequestServicePrU.getPType());
      this.oByteBuf.writeInt(_abstractComProFamilyRequestServicePrU.getSetVrinIMPL().size());
      _abstractComProFamilyRequestServicePrU.getSetVrinIMPL().forEach((version) ->
      {
        _biConsumerWiebu.accept(this.oByteBuf, version);
      });
    }

    @Override
    public void hadForMu(
        MutatingComProFamilyRequestService _rpmMutatingComProFamilyRequestService) {
      this.oByteBuf.writeInt(2);
      this._eneporetForAbBi(_rpmMutatingComProFamilyRequestService,
          BasicStringSerializationHandler::maslForBySt);
    }

    @Override
    public void hadForMu(ChangeComProRequestImpl _rosChangeComProRequestImpl) {
      this.oByteBuf.writeInt(3);
      BasicStringSerializationHandler.maslForBySt(this.oByteBuf,
          _rosChangeComProRequestImpl.getPType());
      _rosChangeComProRequestImpl.getVrinEntProVer().enoForBy(this.oByteBuf);
      this.oByteBuf.writeInt(_rosChangeComProRequestImpl.getListPmPair().size());
      _rosChangeComProRequestImpl.getListPmPair().forEach((pair) ->
      {
        BasicStringSerializationHandler.maslForBySt(this.oByteBuf, pair.first());
        BasicStringSerializationHandler.maslForBySt(this.oByteBuf, pair.other());
      });
    }

    @Override
    public void hadForMu(ComProFamilyRequestServiceImpl _rpaComProFamilyRequestServiceImpl) {
      this.oByteBuf.writeInt(1);
      this._eneporetForAbBi(_rpaComProFamilyRequestServiceImpl, (buf, version) ->
      {
        version.enoForBy(buf);
      });
    }
  }
}
