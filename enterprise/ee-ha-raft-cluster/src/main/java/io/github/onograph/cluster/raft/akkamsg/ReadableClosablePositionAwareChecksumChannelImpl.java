package io.github.onograph.cluster.raft.akkamsg;

import java.io.IOException;
import org.neo4j.io.fs.ReadPastEndException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;
import org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel;


public class ReadableClosablePositionAwareChecksumChannelImpl implements
    ReadableClosablePositionAwareChecksumChannel {


  private final ReadableClosablePositionAwareChecksumChannelPassThruImpl dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl;


  private final int sizeCnt;


  private int iBr;

  public ReadableClosablePositionAwareChecksumChannelImpl(ReadableChannel _dlgtReadableChannel,
      int sizeCnt) {
    this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl =
        new ReadableClosablePositionAwareChecksumChannelPassThruImpl(_dlgtReadableChannel);
    this.sizeCnt = sizeCnt;
  }


  private void _enube(int _iCb) throws ReadPastEndException {
    if (this.sizeCnt - this.iBr < _iCb) {
      throw ReadPastEndException.INSTANCE;
    } else {
      this.iBr += _iCb;
    }
  }

  @Override
  public void beginChecksum() {
    this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.beginChecksum();
  }

  @Override
  public void close() {
    this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.close();
  }

  @Override
  public int endChecksumAndValidate() {
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.endChecksumAndValidate();
  }

  @Override
  public byte get() throws IOException {
    this._enube(1);
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.get();
  }

  @Override
  public void get(byte[] btCnt, int len) throws IOException {
    this._enube(len);
    this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.get(btCnt, len);
  }

  @Override
  public LogPositionMarker getCurrentPosition(LogPositionMarker _logPositionMarker) {
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.getCurrentPosition(
        _logPositionMarker);
  }

  @Override
  public LogPosition getCurrentPosition() {
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.getCurrentPosition();
  }

  @Override
  public double getDouble() throws IOException {
    this._enube(8);
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.getDouble();
  }

  @Override
  public float getFloat() throws IOException {
    this._enube(4);
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.getFloat();
  }

  @Override
  public int getInt() throws IOException {
    this._enube(4);
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.getInt();
  }

  @Override
  public long getLong() throws IOException {
    this._enube(8);
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.getLong();
  }

  @Override
  public short getShort() throws IOException {
    this._enube(2);
    return this.dlgtrReadableClosablePositionAwareChecksumChannelPassThruImpl.getShort();
  }
}
