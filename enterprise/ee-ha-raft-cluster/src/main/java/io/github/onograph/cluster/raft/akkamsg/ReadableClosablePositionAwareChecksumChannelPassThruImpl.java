package io.github.onograph.cluster.raft.akkamsg;

import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;
import org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel;


public class ReadableClosablePositionAwareChecksumChannelPassThruImpl implements
    ReadableClosablePositionAwareChecksumChannel {


  private final ReadableChannel dlgtReadableChannel;

  public ReadableClosablePositionAwareChecksumChannelPassThruImpl(
      ReadableChannel _dlgtReadableChannel) {
    this.dlgtReadableChannel = _dlgtReadableChannel;
  }

  @Override
  public void beginChecksum() {
  }

  @Override
  public void close() {
  }

  @Override
  public int endChecksumAndValidate() {
    return 0;
  }

  @Override
  public byte get() throws IOException {
    return this.dlgtReadableChannel.get();
  }

  @Override
  public void get(byte[] btCnt, int len) throws IOException {
    this.dlgtReadableChannel.get(btCnt, len);
  }

  @Override
  public LogPositionMarker getCurrentPosition(LogPositionMarker _logPositionMarker) {
    _logPositionMarker.unspecified();
    return _logPositionMarker;
  }

  @Override
  public LogPosition getCurrentPosition() {
    return LogPosition.UNSPECIFIED;
  }

  @Override
  public double getDouble() throws IOException {
    return this.dlgtReadableChannel.getDouble();
  }

  @Override
  public float getFloat() throws IOException {
    return this.dlgtReadableChannel.getFloat();
  }

  @Override
  public int getInt() throws IOException {
    return this.dlgtReadableChannel.getInt();
  }

  @Override
  public long getLong() throws IOException {
    return this.dlgtReadableChannel.getLong();
  }

  @Override
  public short getShort() throws IOException {
    return this.dlgtReadableChannel.getShort();
  }
}
