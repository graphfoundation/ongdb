package io.github.onograph.cluster.raft.akkamsg;

import io.netty.buffer.ByteBuf;
import org.neo4j.io.fs.WritableChecksumChannel;


public class DefaultWritableChecksumChannel implements WritableChecksumChannel, HasNettyByteBuf {


  private final ByteBuf dlgtByteBuf;

  public DefaultWritableChecksumChannel(ByteBuf _byteBuf) {
    this.dlgtByteBuf = _byteBuf;
  }

  @Override
  public void beginChecksum() {
  }

  @Override
  public ByteBuf byebfByteBuf() {
    return this.dlgtByteBuf;
  }

  @Override
  public WritableChecksumChannel put(byte val) {
    this.dlgtByteBuf.writeByte(val);
    return this;
  }

  @Override
  public WritableChecksumChannel put(byte[] val, int len) {
    this.dlgtByteBuf.writeBytes(val, 0, len);
    return this;
  }

  @Override
  public int putChecksum() {
    return 0;
  }

  @Override
  public WritableChecksumChannel putDouble(double val) {
    this.dlgtByteBuf.writeDouble(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putFloat(float val) {
    this.dlgtByteBuf.writeFloat(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putInt(int val) {
    this.dlgtByteBuf.writeInt(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putLong(long val) {
    this.dlgtByteBuf.writeLong(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putShort(short val) {
    this.dlgtByteBuf.writeShort(val);
    return this;
  }
}
