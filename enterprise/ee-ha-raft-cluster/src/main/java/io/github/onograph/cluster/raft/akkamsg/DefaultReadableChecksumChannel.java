package io.github.onograph.cluster.raft.akkamsg;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.neo4j.io.fs.ReadPastEndException;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;
import org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel;


public class DefaultReadableChecksumChannel implements
    ReadableClosablePositionAwareChecksumChannel {


  private final ByteBuf dlgtByteBuf;


  private final int iIs;

  public DefaultReadableChecksumChannel(ByteBuf _iptByteBuf) {
    this.dlgtByteBuf = _iptByteBuf;
    this.iIs = _iptByteBuf.readerIndex();
  }


  private void _enube(int _iBc) throws ReadPastEndException {
    if (this.dlgtByteBuf.readableBytes() < _iBc) {
      throw ReadPastEndException.INSTANCE;
    }
  }


  public int avibbe() {
    return this.dlgtByteBuf.readableBytes();
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
    this._enube(1);
    return this.dlgtByteBuf.readByte();
  }

  @Override
  public void get(byte[] btCnt, int len) throws IOException {
    this._enube(len);
    this.dlgtByteBuf.readBytes(btCnt, 0, len);
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
    this._enube(8);
    return this.dlgtByteBuf.readDouble();
  }

  @Override
  public float getFloat() throws IOException {
    this._enube(4);
    return this.dlgtByteBuf.readFloat();
  }

  @Override
  public int getInt() throws IOException {
    this._enube(4);
    return this.dlgtByteBuf.readInt();
  }

  @Override
  public long getLong() throws IOException {
    this._enube(8);
    return this.dlgtByteBuf.readLong();
  }

  @Override
  public short getShort() throws IOException {
    this._enube(2);
    return this.dlgtByteBuf.readShort();
  }


  public int redbt() {
    return this.dlgtByteBuf.readerIndex() - this.iIs;
  }


  public void serdbt(int _iBr) {
    if (_iBr < 0) {

      throw new IllegalArgumentException("*** Error: 7b1d7a0e-ec76-42e1-8800-79333f1b9064");
    } else if (this.iIs + _iBr > this.dlgtByteBuf.writerIndex()) {

      throw new IllegalStateException("*** Error: 9adef217-9417-418b-9f35-2ea915d5c9b0");
    } else {
      this.dlgtByteBuf.readerIndex(this.iIs + _iBr);
    }
  }
}
