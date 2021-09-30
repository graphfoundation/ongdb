package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.CompositeByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.stream.ChunkedInput;
import java.io.IOException;
import org.neo4j.function.ThrowingConsumer;
import org.neo4j.io.fs.WritableChannel;


public class ByteBufChunkedInputSyncDataImpl implements ChunkedInput<ByteBuf> {


  private static final int MEATI = 1;


  private final ChunkedInput<ByteBuf> chunkedInputMabbByteBuf;


  private final byte tcByte;


  private int iPors;


  private boolean isIoe;


  private ByteBufChunkedInputSyncDataImpl(ChunkedInput<ByteBuf> _chunkedInputMabbByteBuf,
      byte _tcByte) {
    this.chunkedInputMabbByteBuf = _chunkedInputMabbByteBuf;
    this.tcByte = _tcByte;
  }


  private static int _meatsi(boolean _isCfi) {
    return 1 + (_isCfi ? 1 : 0);
  }


  private static ByteBuf _wrtmedaByteBuf(ByteBuf _bfeByteBuf, boolean _isCfi, boolean _isCli,
      byte _tcByte) {
    _bfeByteBuf.writeBoolean(_isCli);
    if (_isCfi) {
      _bfeByteBuf.writeByte(_tcByte);
    }

    return _bfeByteBuf;
  }


  static ChunkedInput<ByteBuf> chndChunkedInput(ChunkedInput<ByteBuf> _chunkedInputIcByteBuf,
      byte _ctByte) {
    return new ByteBufChunkedInputSyncDataImpl(_chunkedInputIcByteBuf, _ctByte);
  }


  static ChunkedInput<ByteBuf> sigChunkedInput(boolean _isIsh, byte _tcByte,
      ThrowingConsumer<WritableChannel, IOException> _throwingConsumerMrhlewi) {
    return chndChunkedInput(
        new io.github.onograph.cluster.raft.akkamsg.serialization.ByteBufChunkedInputSyncDataImpl.ByteBufChunkedInputDefaultImpl(
            _isIsh,
            _throwingConsumerMrhlewi),
        _tcByte);
  }

  @Override
  public void close() {
  }

  @Override
  public boolean isEndOfInput() {
    return this.isIoe;
  }

  @Override
  public long length() {
    return -1L;
  }

  @Override
  public long progress() {
    return this.iPors;
  }

  @Override
  public ByteBuf readChunk(ChannelHandlerContext _cChannelHandlerContext) throws Exception {
    return this.readChunk(_cChannelHandlerContext.alloc());
  }

  @Override
  public ByteBuf readChunk(ByteBufAllocator _byteBufAllocator) throws Exception {
    if (this.isIoe) {
      return null;
    } else {

      ByteBuf _daByteBuf = this.chunkedInputMabbByteBuf.readChunk(_byteBufAllocator);
      if (_daByteBuf == null) {
        return null;
      } else {
        this.isIoe = this.chunkedInputMabbByteBuf.isEndOfInput();

        CompositeByteBuf _daCompositeByteBuf = new CompositeByteBuf(_byteBufAllocator, false, 2);
        _daCompositeByteBuf.addComponent(true, _daByteBuf);

        try {

          boolean _isCfi = this.progress() == 0L;

          int _iCdm = _meatsi(_isCfi);

          ByteBuf _mdbByteBuf = _byteBufAllocator.buffer(_iCdm, _iCdm);
          _daCompositeByteBuf.addComponent(true, 0,
              _wrtmedaByteBuf(_mdbByteBuf, _isCfi, this.chunkedInputMabbByteBuf.isEndOfInput(),
                  this.tcByte));
          this.iPors += _daCompositeByteBuf.readableBytes();

          assert this.iPors > 0;

          return _daCompositeByteBuf;
        } catch (

            Throwable _throwable) {
          _daCompositeByteBuf.release();
          throw _throwable;
        }
      }
    }
  }


  private static class ByteBufChunkedInputDefaultImpl implements ChunkedInput<ByteBuf> {


    private final boolean isIsh;


    private final ThrowingConsumer<WritableChannel, IOException> throwingConsumerMrhlewi;


    boolean isenofip;


    int ofst;


    private ByteBufChunkedInputDefaultImpl(boolean _isIsh,
        ThrowingConsumer<WritableChannel, IOException> _throwingConsumerMrhlewi) {
      this.isIsh = _isIsh;
      this.throwingConsumerMrhlewi = _throwingConsumerMrhlewi;
    }


    private ByteBuf _crabebfByteBuf(ByteBufAllocator _byteBufAllocator) {

      ByteBuf _bfeByteBuf = _byteBufAllocator.buffer();
      if (this.isIsh) {
        _bfeByteBuf.writeInt(-1);
      }

      return _bfeByteBuf;
    }


    private void _seraepoForBy(ByteBuf _bfeByteBuf) {
      if (this.isIsh) {
        _bfeByteBuf.setInt(0, this.ofst - 4);
      }
    }

    @Override
    public void close() {
      this.isenofip = true;
    }

    @Override
    public boolean isEndOfInput() {
      return this.isenofip;
    }

    @Override
    public long length() {
      return -1L;
    }

    @Override
    public long progress() {
      return this.ofst;
    }

    @Override
    public ByteBuf readChunk(ChannelHandlerContext _cChannelHandlerContext) throws Exception {
      return this.readChunk(_cChannelHandlerContext.alloc());
    }

    @Override
    public ByteBuf readChunk(ByteBufAllocator _byteBufAllocator) throws Exception {
      if (this.isenofip) {
        return null;
      } else {

        ByteBuf _bfeByteBuf = this._crabebfByteBuf(_byteBufAllocator);
        this.throwingConsumerMrhlewi.accept(new WritableChecksumChannelStandardImpl(_bfeByteBuf));
        this.isenofip = true;
        this.ofst = _bfeByteBuf.readableBytes();
        this._seraepoForBy(_bfeByteBuf);
        return _bfeByteBuf;
      }
    }
  }
}
