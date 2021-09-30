package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.stream.ChunkedInput;
import java.util.Objects;
import org.neo4j.util.Preconditions;


public class ChunkedInputEncodingService implements ChunkedInput<ByteBuf> {


  private static final int STD_CHN_SIZ = 32768;


  private final byte[] btval;


  private final int iSc;


  private final boolean isIsh;


  private int iP;


  private boolean isRh;

  ChunkedInputEncodingService(byte[] btval, int _iCs, boolean _isPsh) {
    Objects.requireNonNull(btval, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService.requireNonNull"));
    Preconditions.requireNonNegative(btval.length);
    Preconditions.requirePositive(_iCs);
    this.btval = btval;
    this.iSc = _iCs;
    this.isIsh = _isPsh;
  }

  public ChunkedInputEncodingService(byte[] btval, boolean _isPsh) {
    this(btval, 32768, _isPsh);
  }


  private int _avib() {
    return this.btval.length - this.iP;
  }


  private ByteBuf _crabebfByteBuf(ByteBufAllocator _byteBufAllocator, int _iWt) {

    ByteBuf _bfeByteBuf = _byteBufAllocator.buffer(_iWt);
    if (this.isIsh) {
      _bfeByteBuf.writeInt(-1);
    }

    return _bfeByteBuf;
  }

  @Override
  public void close() {
    this.iP = this.btval.length;
  }

  @Override
  public boolean isEndOfInput() {
    return this.iP == this.btval.length && this.isRh;
  }

  @Override
  public long length() {
    return this.btval.length;
  }

  @Override
  public long progress() {
    return this.iP;
  }

  @Override
  public ByteBuf readChunk(ByteBufAllocator _byteBufAllocator) {
    this.isRh = true;
    if (this.isEndOfInput()) {
      return null;
    } else {

      int _iWt = Math.min(this._avib(), this.iSc);

      ByteBuf _bfeByteBuf = this._crabebfByteBuf(_byteBufAllocator, _iWt);

      try {
        _bfeByteBuf.writeBytes(this.btval, this.iP, _iWt);
        this.iP += _iWt;
        if (this.isEndOfInput()) {
          this.seraepoForBy(_bfeByteBuf, _iWt);
        }

        return _bfeByteBuf;
      } catch (

          Throwable _throwable) {
        _bfeByteBuf.release();
        throw _throwable;
      }
    }
  }

  @Override
  public ByteBuf readChunk(ChannelHandlerContext _cChannelHandlerContext) {
    return this.readChunk(_cChannelHandlerContext.alloc());
  }


  public void seraepoForBy(ByteBuf _bfeByteBuf, int _iWt) {
    if (this.isIsh) {
      _bfeByteBuf.setInt(0, _iWt);
    }
  }
}
