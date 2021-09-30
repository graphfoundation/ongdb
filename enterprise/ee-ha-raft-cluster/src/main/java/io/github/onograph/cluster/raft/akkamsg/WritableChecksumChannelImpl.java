package io.github.onograph.cluster.raft.akkamsg;

import java.io.IOException;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.fs.WritableChecksumChannel;


public class WritableChecksumChannelImpl implements WritableChecksumChannel {


  private final WritableChannel dlgtWritableChannel;

  public WritableChecksumChannelImpl(WritableChannel _dlgtWritableChannel) {
    this.dlgtWritableChannel = _dlgtWritableChannel;
  }

  @Override
  public void beginChecksum() {
  }

  @Override
  public WritableChecksumChannel put(byte[] val, int len) throws IOException {
    this.dlgtWritableChannel.put(val, len);
    return this;
  }

  @Override
  public WritableChecksumChannel put(byte val) throws IOException {
    this.dlgtWritableChannel.put(val);
    return this;
  }

  @Override
  public int putChecksum() {
    return 0;
  }

  @Override
  public WritableChecksumChannel putDouble(double val) throws IOException {
    this.dlgtWritableChannel.putDouble(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putFloat(float val) throws IOException {
    this.dlgtWritableChannel.putFloat(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putInt(int val) throws IOException {
    this.dlgtWritableChannel.putInt(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putLong(long val) throws IOException {
    this.dlgtWritableChannel.putLong(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putShort(short val) throws IOException {
    this.dlgtWritableChannel.putShort(val);
    return this;
  }
}
