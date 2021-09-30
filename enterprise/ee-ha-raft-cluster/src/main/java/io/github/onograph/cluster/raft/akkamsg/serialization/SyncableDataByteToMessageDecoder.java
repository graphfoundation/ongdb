package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.AttributeKey;
import java.util.List;
import org.neo4j.storageengine.api.CommandReaderFactory;


public class SyncableDataByteToMessageDecoder extends MessageToMessageDecoder<ByteBuf> {


  public static final AttributeKey<CommandReaderFactory> COPD_COTT_CONCMD_RDXR_GENR =
      AttributeKey.valueOf(io.github.onograph.TokenConstants.COMMAND_READER_FACTORY);


  private final boolean isPsh;


  private final SyncableDataMessageToMessageDecoderController pdcSyncableDataMessageToMessageDecoderController;


  private byte ccByte;


  private ByteBuf dcByteBuf;


  private SyncableDataMessageToMessageDecoder dcrSyncableDataMessageToMessageDecoder;


  private SyncableDataByteToMessageDecoder.State decState;


  public SyncableDataByteToMessageDecoder(boolean _isPsh,
      SyncableDataMessageToMessageDecoderController _pdSyncableDataMessageToMessageDecoderController) {
    this.dcByteBuf = Unpooled.EMPTY_BUFFER;
    this.pdcSyncableDataMessageToMessageDecoderController = _pdSyncableDataMessageToMessageDecoderController;
    this.isPsh = _isPsh;
    this._reeForSy(SyncableDataByteToMessageDecoder.State.WAIT_FOR_START);
  }


  private void _aculeForByBy(ByteBufAllocator _byteBufAllocator, ByteBuf _cukByteBuf) {
    this.dcByteBuf = ByteToMessageDecoder.COMPOSITE_CUMULATOR.cumulate(_byteBufAllocator,
        this.dcByteBuf, _cukByteBuf);
  }


  private void _coseForBy(ByteBuf _byteBuf) throws Exception {
    this.dcrSyncableDataMessageToMessageDecoder.coseForDe(
        new DefaultReadableChecksumChannel(_byteBuf));
  }


  private void _deoForChByLiEnt(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _cukByteBuf,
      List<Object> _listOObject) throws Exception {

    boolean _isLi = _cukByteBuf.readBoolean();
    if (this.decState == SyncableDataByteToMessageDecoder.State.WAIT_FOR_START) {
      this.ccByte = _cukByteBuf.readByte();
      this.dcrSyncableDataMessageToMessageDecoder = this.pdcSyncableDataMessageToMessageDecoderController
          .deorSyncableDataMessageToMessageDecoder(this.ccByte,
              _cChannelHandlerContext.channel().attr(COPD_COTT_CONCMD_RDXR_GENR).get());
      this.decState = SyncableDataByteToMessageDecoder.State.CAL_CUM;
    }

    if (this.decState == SyncableDataByteToMessageDecoder.State.CAL_CUM) {
      this._hadcttForChByLi(_cChannelHandlerContext, _cukByteBuf, _isLi, _listOObject);
    } else {

      throw new IllegalStateException("*** Error: 39821ff8-2b4a-4684-8b0b-a43f2b04d2eb");
    }
  }


  private ByteBuf _genncueseByteBuf(ByteBuf _cukByteBuf, int _iSps) {
    return _cukByteBuf.readerIndex(_cukByteBuf.readerIndex() + _iSps).retainedSlice();
  }


  private ByteBuf _gesesiByteBuf(ByteBuf _cukByteBuf, int _iSps) {
    return _cukByteBuf.slice(_cukByteBuf.readerIndex(), _iSps);
  }


  private int _gesfplsiForBy(ByteBuf _cukByteBuf, boolean _isIl) {
    if (this.isPsh) {
      return _cukByteBuf.readInt();
    } else {
      return _isIl ? _cukByteBuf.readableBytes() : -1;
    }
  }


  private void _hadcttForChByLi(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _cukByteBuf,
      boolean _isLi, List<Object> _listOObject) throws Exception {

    int _iSps = this._gesfplsiForBy(_cukByteBuf, _isLi);
    if (_iSps == -1) {
      _cukByteBuf.retain();
      this._aculeForByBy(_cChannelHandlerContext.alloc(), _cukByteBuf);
    } else {

      ByteBuf _scByteBuf = this._gesesiByteBuf(_cukByteBuf, _iSps);
      if (!this.dcByteBuf.isReadable()) {
        this._coseForBy(_scByteBuf);
      } else {
        _scByteBuf.retain();
        this._aculeForByBy(_cChannelHandlerContext.alloc(), _scByteBuf);
        this._coseForBy(this.dcByteBuf);
        this.dcByteBuf.release();
      }

      this.dcByteBuf = this._genncueseByteBuf(_cukByteBuf, _iSps);
      if (_isLi) {
        if (this.dcByteBuf.isReadable()) {

          throw new IllegalStateException("*** Error:  bd373ec3-ebce-4f99-b0ca-c68a69eec673");
        }

        this.dcByteBuf.release();
        _listOObject.add(this.dcrSyncableDataMessageToMessageDecoder.cracttDataManagerFactory());
        this._reeForSy(SyncableDataByteToMessageDecoder.State.WAIT_FOR_START);
      }
    }
  }


  private void _haedderForTh(Throwable _cueThrowable) {
    this.dcByteBuf.release();
    this._reeForSy(SyncableDataByteToMessageDecoder.State.EX);
    throw new DecoderException(_cueThrowable);
  }


  private void _reeForSy(SyncableDataByteToMessageDecoder.State _nState) {
    this.decState = _nState;
    this.ccByte = -1;
    this.dcByteBuf = Unpooled.EMPTY_BUFFER;
    this.dcrSyncableDataMessageToMessageDecoder = null;
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _cukByteBuf,
      List<Object> _listOObject) {
    if (this.decState != SyncableDataByteToMessageDecoder.State.EX) {
      try {
        this._deoForChByLiEnt(_cChannelHandlerContext, _cukByteBuf, _listOObject);
      } catch (

          Throwable _throwable) {
        this._haedderForTh(_throwable);
      }
    }
  }


  enum State {


    WAIT_FOR_START,

    CAL_CUM,

    EX
  }
}
