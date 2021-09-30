package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.config.EntProVer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.internal.helpers.collection.Pair;


public class ServerByteToMessageDecoder extends ByteToMessageDecoder {


  private <U extends Comparable<U>, T extends AbstractComProFamilyRequestService<U>> T _deeporet(
      BiFunction<String, Set<U>, T> _biFunctionCntutsst, Function<ByteBuf, U> _functionDvbu,
      ByteBuf _iByteBuf) {

    String pType = BasicStringSerializationHandler.unahString(_iByteBuf);

    int _iLav = _iByteBuf.readInt();

    Set<U> _setVrinU = (Set) Stream.generate(() ->
    {
      return (Comparable) _functionDvbu.apply(_iByteBuf);
    }).limit(_iLav).collect(Collectors.toSet());
    return _biFunctionCntutsst.apply(pType, _setVrinU);
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) {

    int _iCm = _iByteBuf.readInt();
    switch (_iCm) {
      case 1:

        ComProFamilyRequestServiceImpl _rpaComProFamilyRequestServiceImpl =
            this._deeporet(ComProFamilyRequestServiceImpl::new, EntProVer::deoEntProVer, _iByteBuf);
        _listOObject.add(_rpaComProFamilyRequestServiceImpl);
        return;
      case 2:

        MutatingComProFamilyRequestService _rpmMutatingComProFamilyRequestService =
            this._deeporet(MutatingComProFamilyRequestService::new,
                BasicStringSerializationHandler::unahString, _iByteBuf);
        _listOObject.add(_rpmMutatingComProFamilyRequestService);
        return;
      case 3:

        String pType = BasicStringSerializationHandler.unahString(_iByteBuf);

        EntProVer _vrinEntProVer = EntProVer.deoEntProVer(_iByteBuf);

        int _iNomp = _iByteBuf.readInt();

        List<Pair<String, String>> _listPmPair = Stream.generate(() ->
        {
          return Pair.of(BasicStringSerializationHandler.unahString(_iByteBuf),
              BasicStringSerializationHandler.unahString(_iByteBuf));
        }).limit(_iNomp).collect(Collectors.toList());
        _listOObject.add(new ChangeComProRequestImpl(_listPmPair, pType, _vrinEntProVer));
        return;
      default:
        throw new IllegalStateException();
    }
  }
}
