package io.github.onograph.cluster.raft.akkamsg.serialization;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.neo4j.io.fs.WritableChecksumChannel;


public class WritableChecksumChannelDataOutputStreamImpl implements WritableChecksumChannel {


  private final DataOutputStream dataOutputStream;

  public WritableChecksumChannelDataOutputStreamImpl(OutputStream _outputStream) {
    this.dataOutputStream = new DataOutputStream(_outputStream);
  }

  @Override
  public void beginChecksum() {

    throw new UnsupportedOperationException("*** Error:  4f6083ee-035c-4c7a-ada1-48e19a68db2a");
  }

  @Override
  public WritableChecksumChannel put(byte[] val, int len) throws IOException {
    this.dataOutputStream.write(val, 0, len);
    return this;
  }

  @Override
  public WritableChecksumChannel put(byte val) throws IOException {
    this.dataOutputStream.writeByte(val);
    return this;
  }

  @Override
  public int putChecksum() {

    throw new UnsupportedOperationException("*** Error:  100ffcc2-582f-4a17-bd87-e43d6cb18cfa");
  }

  @Override
  public WritableChecksumChannel putDouble(double val) throws IOException {
    this.dataOutputStream.writeDouble(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putFloat(float val) throws IOException {
    this.dataOutputStream.writeFloat(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putInt(int val) throws IOException {
    this.dataOutputStream.writeInt(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putLong(long val) throws IOException {
    this.dataOutputStream.writeLong(val);
    return this;
  }

  @Override
  public WritableChecksumChannel putShort(short val) throws IOException {
    this.dataOutputStream.writeShort(val);
    return this;
  }
}
