package io.github.onograph.cluster.raft.akkamsg.serialization;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.neo4j.io.fs.ReadableChannel;


public class ReadableChannelDataInputStreamImpl implements ReadableChannel {


  private final DataInputStream dataInputStream;

  public ReadableChannelDataInputStreamImpl(InputStream _inputStream) {
    this.dataInputStream = new DataInputStream(_inputStream);
  }

  @Override
  public void close() throws IOException {
    this.dataInputStream.close();
  }

  @Override
  public void get(byte[] btCnt, int len) throws IOException {
    this.dataInputStream.read(btCnt, 0, len);
  }

  @Override
  public byte get() throws IOException {
    return this.dataInputStream.readByte();
  }

  @Override
  public double getDouble() throws IOException {
    return this.dataInputStream.readDouble();
  }

  @Override
  public float getFloat() throws IOException {
    return this.dataInputStream.readFloat();
  }

  @Override
  public int getInt() throws IOException {
    return this.dataInputStream.readInt();
  }

  @Override
  public long getLong() throws IOException {
    return this.dataInputStream.readLong();
  }

  @Override
  public short getShort() throws IOException {
    return this.dataInputStream.readShort();
  }
}
