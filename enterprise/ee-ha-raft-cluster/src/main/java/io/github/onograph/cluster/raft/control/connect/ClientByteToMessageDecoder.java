package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.config.EntProVer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.neo4j.function.TriFunction;


public class ClientByteToMessageDecoder extends ByteToMessageDecoder {


  private <U extends Comparable<U>, T extends AbstractComProFamilyReplyService<U>> T _deepores(
      Function<ByteBuf, U> RNME, ByteBuf _iByteBuf,
      TriFunction<HandshakeStateType, String, U, T> _triFunctionCntuthsut)
      throws ClientException {

    int _iVcs = _iByteBuf.readInt();

    String _strIetfe = BasicStringSerializationHandler.unahString(_iByteBuf);

    U _uVrin = RNME.apply(_iByteBuf);

    Optional<HandshakeStateType> _optionalScHandshakeStateType = HandshakeStateType.frmcdvaeOptional(
        _iVcs);
    return _optionalScHandshakeStateType.map((status) ->
    {
      return _triFunctionCntuthsut.apply(status, _strIetfe, _uVrin);
    }).orElseThrow(() ->
    {
      return new ClientException("*** Error: d0b9d052-5744-4373-a445-5d011b812ab9");
    });
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws ClientException {

    int _iCm = _iByteBuf.readInt();
    switch (_iCm) {
      case 0:

        ComProFamilyReplyServiceImpl _rpaComProFamilyReplyServiceImpl =
            this._deepores(EntProVer::deoEntProVer, _iByteBuf, ComProFamilyReplyServiceImpl::new);
        _listOObject.add(_rpaComProFamilyReplyServiceImpl);
        return;
      case 1:

        MutatingComProReply _rpmMutatingComProReply =
            this._deepores(BasicStringSerializationHandler::unahString, _iByteBuf,
                MutatingComProReply::new);
        _listOObject.add(_rpmMutatingComProReply);
        return;
      case 2:

        int _iScv = _iByteBuf.readInt();

        Optional<HandshakeStateType> _optionalCsHandshakeStateType = HandshakeStateType.frmcdvaeOptional(
            _iScv);
        if (_optionalCsHandshakeStateType.isPresent()) {
          _listOObject.add(new ChangeComProReplyImpl(_optionalCsHandshakeStateType.get()));
        }

        return;
      default:
    }
  }
}
