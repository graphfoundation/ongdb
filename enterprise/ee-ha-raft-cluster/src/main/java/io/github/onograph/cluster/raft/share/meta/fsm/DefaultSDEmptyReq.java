package io.github.onograph.cluster.raft.share.meta.fsm;

import io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService;
import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.CoreNodeSyncableData;
import io.netty.buffer.ByteBuf;
import io.netty.handler.stream.ChunkedInput;
import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalLong;
import java.util.function.Consumer;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class DefaultSDEmptyReq implements CoreNodeSyncableData, EmptyReq {


  private final byte[] daByteArray;

  public DefaultSDEmptyReq(byte[] _daByteArray) {
    this.daByteArray = _daByteArray;
  }


  public long byecu() {
    return this.daByteArray != null ? (long) this.daByteArray.length : 0L;
  }

  @Override
  public DatabaseId daasidDatabaseId() {
    return null;
  }

  @Override
  public void dipcForSy(AutoCloseableActionProcessor _dcAutoCloseableActionProcessor,
      Consumer<FSMData> _consumerClbcFSMData, long caIdx) {
    _dcAutoCloseableActionProcessor.dipcForSyCo(_consumerClbcFSMData, this, caIdx);
  }

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
  }


  public ChunkedInput<ByteBuf> enorChunkedInput(boolean _isPsh) {

    byte[] _aryByteArray = this.daByteArray;
    if (_aryByteArray == null) {
      _aryByteArray = new byte[0];
    }

    return new ChunkedInputEncodingService(_aryByteArray, _isPsh);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DefaultSDEmptyReq _thaDefaultSDEmptyReq = (DefaultSDEmptyReq) obj;
      return Arrays.equals(this.daByteArray, _thaDefaultSDEmptyReq.daByteArray);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.daByteArray);
  }

  @Override
  public OptionalLong sizOptionalLong() {
    return OptionalLong.of(this.daByteArray.length);
  }


  public static class DefaultSDEmptyReqSafeChannelMarshal extends
      SafeChannelMarshal<DefaultSDEmptyReq> {


    public static final DefaultSDEmptyReq.DefaultSDEmptyReqSafeChannelMarshal IT = new DefaultSDEmptyReq.DefaultSDEmptyReqSafeChannelMarshal();

    @Override
    public void marshal(DefaultSDEmptyReq _dmyDefaultSDEmptyReq, WritableChannel _writableChannel)
        throws IOException {
      if (_dmyDefaultSDEmptyReq.daByteArray != null) {
        _writableChannel.putInt(_dmyDefaultSDEmptyReq.daByteArray.length);
        _writableChannel.put(_dmyDefaultSDEmptyReq.daByteArray,
            _dmyDefaultSDEmptyReq.daByteArray.length);
      } else {
        _writableChannel.putInt(0);
      }
    }

    @Override
    protected DefaultSDEmptyReq unmarshal0(ReadableChannel _readableChannel) throws IOException {

      int len = _readableChannel.getInt();

      byte[] _datByteArray;
      if (len > 0) {
        _datByteArray = new byte[len];
        _readableChannel.get(_datByteArray, len);
      } else {
        _datByteArray = null;
      }

      return new DefaultSDEmptyReq(_datByteArray);
    }
  }
}
