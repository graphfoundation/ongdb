package io.github.onograph.cluster.raft.akkamsg;

import io.netty.buffer.ByteBuf;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.WritableChecksumChannel;


public class WritableChecksumChannelStandardImpl implements WritableChecksumChannel,
    HasNettyByteBuf {


  private static final long STD_SIZ_LII = ByteUnit.mebiBytes(2L);


  private final ByteBuf dlgtByteBuf;


  private final int iIwi;


  private final long lgLs;

  public WritableChecksumChannelStandardImpl(ByteBuf _dlgtByteBuf) {
    this(_dlgtByteBuf, STD_SIZ_LII);
  }

  public WritableChecksumChannelStandardImpl(ByteBuf _dlgtByteBuf, long _lgLs) {
    this.dlgtByteBuf = _dlgtByteBuf;
    this.iIwi = _dlgtByteBuf.writerIndex();
    this.lgLs = _lgLs;
  }


  private void _chcsi(int _iAdtoa) throws MessageSizeException {

    int _iFsw = this.dlgtByteBuf.writerIndex() - this.iIwi;

    int _iCtc = _iFsw + _iAdtoa;
    if ((long) _iCtc > this.lgLs) {

      throw new MessageSizeException("*** Error: 984ff32b-4887-4c33-9b91-5ebd217cbf22");
    }
  }

  @Override
  public void beginChecksum() {
  }

  @Override
  public ByteBuf byebfByteBuf() {
    return this.dlgtByteBuf;
  }

  @Override
  public WritableChecksumChannel put(byte val) throws MessageSizeException {
    this._chcsi(1);
    this.dlgtByteBuf.writeByte(val);
    return this;
  }

  @Override
  public WritableChecksumChannel put(byte[] val, int len) throws MessageSizeException {
    this._chcsi(len);
    this.dlgtByteBuf.writeBytes(val, 0, len);
    return this;
  }

  @Override
  public int putChecksum() {
    return 0;
  }

  @Override
  public WritableChecksumChannel putDouble(double val) throws MessageSizeException {
    this._chcsi(8);
    this.dlgtByteBuf.writeDouble(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putFloat(float val) throws MessageSizeException {
    this._chcsi(4);
    this.dlgtByteBuf.writeFloat(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putInt(int val) throws MessageSizeException {
    this._chcsi(4);
    this.dlgtByteBuf.writeInt(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putLong(long val) throws MessageSizeException {
    this._chcsi(8);
    this.dlgtByteBuf.writeLong(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putShort(short val) throws MessageSizeException {
    this._chcsi(2);
    this.dlgtByteBuf.writeShort(val);
    return this;
  }
}
