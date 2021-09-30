package io.github.onograph.cluster.raft.akkamsg;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import java.util.Objects;
import java.util.Queue;
import org.neo4j.io.fs.WritableChecksumChannel;


public class WritableChecksumChannelDefaultImpl implements WritableChecksumChannel, AutoCloseable {


  static final int NOT_SET_END_IDX = -1;


  private static final byte[] NOEDA_BYTE_ARRAY = new byte[0];


  private static final int STD_INI_CHN_SIZ = 512;


  private final ByteBufAllocator byteBufAllocator;


  private final byte[] dmdByteArray;


  private final int iIs;


  private final int largest;


  private final Queue<ByteBuf> queueBbByteBuf;


  private ByteBuf cretByteBuf;


  private boolean isCi;

  public WritableChecksumChannelDefaultImpl(ByteBufAllocator _byteBufAllocator, int largest,
      Queue<ByteBuf> _queueQoByteBuf) {
    this(_byteBufAllocator, NOEDA_BYTE_ARRAY, largest, _queueQoByteBuf);
  }


  public WritableChecksumChannelDefaultImpl(ByteBufAllocator _byteBufAllocator,
      byte[] _dmdByteArray, int largest, Queue<ByteBuf> _queueQoByteBuf) {
    Objects.requireNonNull(_byteBufAllocator, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl.requireNonNull"));
    Objects.requireNonNull(_queueQoByteBuf, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl.requireNonNull2"));
    if (_dmdByteArray.length + 8 > largest) {

      throw new IllegalArgumentException("*** Error: dda0677f-b2ed-40f3-b1c6-f670bca13af7");
    } else {
      this.dmdByteArray = _dmdByteArray;
      this.byteBufAllocator = _byteBufAllocator;
      this.largest = largest;
      this.iIs = Integer.min(512, largest);
      if (largest < 8) {

        throw new IllegalArgumentException("*** Error: 0ca3269e-4ac1-4726-b4a6-8bf8ed9de261");
      } else {
        this.queueBbByteBuf = _queueQoByteBuf;
      }
    }
  }


  private ByteBuf _alanwbeByteBuf() {

    ByteBuf _bfeByteBuf = this.byteBufAllocator.buffer(this.iIs, this.largest);
    if (this.dmdByteArray.length != 0) {
      _bfeByteBuf.writeBytes(this.dmdByteArray);
    }

    return _bfeByteBuf;
  }


  private void _chcste() {
    if (this.isCi) {

      throw new IllegalStateException("*** Error:  59345d44-3936-46b8-af07-58f348e793ee");
    }
  }


  private ByteBuf _geoceceByteBuf() {
    if (this.cretByteBuf == null) {
      this.cretByteBuf = this._alanwbeByteBuf();
    }

    return this.cretByteBuf;
  }


  private int _prpegny(int sz) {
    if (this._geoceceByteBuf().writerIndex() == this.largest) {
      this._prpewi(sz);
    }

    return Integer.min(this.largest - this.cretByteBuf.writerIndex(), sz);
  }


  private void _prpewi(int sz) {
    if (this._geoceceByteBuf().writerIndex() + sz > this.largest) {
      this._strcue();
    }

    this._geoceceByteBuf();
  }


  private void _reeecrn() {
    if (this.cretByteBuf != null) {
      this.cretByteBuf.release();
    }
  }


  private void _strcue() {
    if (this.cretByteBuf != null) {
      this.queueBbByteBuf.add(this.cretByteBuf);
      this.cretByteBuf = null;
    }
  }

  @Override
  public void beginChecksum() {
  }

  @Override
  public void close() {
    try {
      this.flsWritableChecksumChannel();
    } finally {
      this.isCi = true;
      this._reeecrn();
    }
  }


  public int curtid() {
    return this.cretByteBuf != null ? this.cretByteBuf.writerIndex() : 0;
  }


  public WritableChecksumChannel flsWritableChecksumChannel() {
    this._strcue();
    return this;
  }


  public boolean getIsCi() {
    return this.isCi;
  }

  @Override
  public WritableChecksumChannel put(byte val) {
    this._chcste();
    this._prpewi(1);
    this.cretByteBuf.writeByte(val);
    return this;
  }

  @Override
  public WritableChecksumChannel put(byte[] val, int len) {
    this._chcste();

    int _iIw = 0;

    for (

        int _iRmiig = len; _iRmiig != 0; _iRmiig = len - _iIw) {

      int _iWt = this._prpegny(_iRmiig);

      ByteBuf _cretByteBuf = this._geoceceByteBuf();
      _cretByteBuf.writeBytes(val, _iIw, _iWt);
      _iIw += _iWt;
    }

    return this;
  }

  @Override
  public int putChecksum() {
    return 0;
  }

  @Override
  public WritableChecksumChannel putDouble(double val) {
    this._chcste();
    this._prpewi(8);
    this.cretByteBuf.writeDouble(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putFloat(float val) {
    this._chcste();
    this._prpewi(4);
    this.cretByteBuf.writeFloat(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putInt(int val) {
    this._chcste();
    this._prpewi(4);
    this.cretByteBuf.writeInt(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putLong(long val) {
    this._chcste();
    this._prpewi(8);
    this.cretByteBuf.writeLong(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putShort(short val) {
    this._chcste();
    this._prpewi(2);
    this.cretByteBuf.writeShort(val);
    return this;
  }


  public void semat(byte[] _dmnByteArray) {
    if (_dmnByteArray.length != this.dmdByteArray.length) {

      throw new IllegalArgumentException("*** Error: 9873dd35-fa71-45e1-87b6-7a6c6a3ec45c");
    } else {

      ByteBuf _cgByteBuf = this._geoceceByteBuf();
      _cgByteBuf.setBytes(0, _dmnByteArray);
    }
  }
}
