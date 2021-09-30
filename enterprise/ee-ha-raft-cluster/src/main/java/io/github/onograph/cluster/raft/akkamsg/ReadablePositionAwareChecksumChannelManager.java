package io.github.onograph.cluster.raft.akkamsg;

import java.io.IOException;
import java.util.Objects;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;
import org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel;


public class ReadablePositionAwareChecksumChannelManager implements
    ReadableClosablePositionAwareChecksumChannel {


  private ReadableClosablePositionAwareChecksumChannel dlgtReadableClosablePositionAwareChecksumChannel;


  private void _aseaie() {
    if (this.dlgtReadableClosablePositionAwareChecksumChannel == null) {

      throw new IllegalArgumentException("*** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    }
  }

  @Override
  public void beginChecksum() {
  }

  @Override
  public void close() throws IOException {
    this._aseaie();
    this.dlgtReadableClosablePositionAwareChecksumChannel.close();
  }


  public void deettoForRe(
      ReadableClosablePositionAwareChecksumChannel _readableClosablePositionAwareChecksumChannel) {
    this.dlgtReadableClosablePositionAwareChecksumChannel = Objects.requireNonNull(
        _readableClosablePositionAwareChecksumChannel);
  }

  @Override
  public int endChecksumAndValidate() throws IOException {
    return 0;
  }

  @Override
  public byte get() throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.get();
  }

  @Override
  public void get(byte[] btCnt, int len) throws IOException {
    this._aseaie();
    this.dlgtReadableClosablePositionAwareChecksumChannel.get(btCnt, len);
  }

  @Override
  public LogPositionMarker getCurrentPosition(LogPositionMarker _logPositionMarker)
      throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.getCurrentPosition(
        _logPositionMarker);
  }

  @Override
  public LogPosition getCurrentPosition() throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.getCurrentPosition();
  }

  @Override
  public double getDouble() throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.getDouble();
  }

  @Override
  public float getFloat() throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.getFloat();
  }

  @Override
  public int getInt() throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.getInt();
  }

  @Override
  public long getLong() throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.getLong();
  }

  @Override
  public short getShort() throws IOException {
    this._aseaie();
    return this.dlgtReadableClosablePositionAwareChecksumChannel.getShort();
  }
}
