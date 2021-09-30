package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.string.UTF8;


public class SetupGdbStoreSyncReply {


  private final long lgItpcl;


  private final Path[] ptsPathArray;


  private final io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType stat;


  private SetupGdbStoreSyncReply(long _lgLcpti, Path[] _ptsPathArray,
      io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType stat) {
    this.lgItpcl = _lgLcpti;
    this.ptsPathArray = _ptsPathArray;
    this.stat = stat;
  }


  public static SetupGdbStoreSyncReply eroSetupGdbStoreSyncReply(
      io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType _seSetupGdbSyncReplyStateType) {
    if (_seSetupGdbSyncReplyStateType
        == io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK) {

      throw new IllegalStateException("*** Error: dc84a2e0-5034-419e-9d90-791845d2cebd");
    } else {
      return new SetupGdbStoreSyncReply(0L, new Path[0], _seSetupGdbSyncReplyStateType);
    }
  }


  public static SetupGdbStoreSyncReply sucsSetupGdbStoreSyncReply(long _lgItpcl,
      Path[] _spPathArray) {
    return new SetupGdbStoreSyncReply(_lgItpcl, _spPathArray,
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      SetupGdbStoreSyncReply _tSetupGdbStoreSyncReply = (SetupGdbStoreSyncReply) obj;
      return this.lgItpcl == _tSetupGdbStoreSyncReply.lgItpcl
          && this.stat == _tSetupGdbStoreSyncReply.stat &&
          Arrays.equals(this.ptsPathArray, _tSetupGdbStoreSyncReply.ptsPathArray);
    } else {
      return false;
    }
  }


  public long getLgItpcl() {
    return this.lgItpcl;
  }


  public Path[] getPtsPathArray() {
    return this.ptsPathArray;
  }


  public io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType getStat() {
    return this.stat;
  }

  @Override
  public int hashCode() {

    int _iRsl = Objects.hash(this.lgItpcl, this.stat);
    _iRsl = 31 * _iRsl + Arrays.hashCode(this.ptsPathArray);
    return _iRsl;
  }


  public enum SetupGdbSyncReplyStateType {


    OK,

    SYNC_SGUID_NOT_MATCHING_ERR,

    SYNC_TLS_S_ERR,

    SYNC_BAD_GDB_ERR


  }


  public static class SetupGdbStoreSyncReplyByteToMessageDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext _channelHandlerContext, ByteBuf _byteBuf,
        List<Object> _listLisObject) throws Exception {
      _listLisObject.add(
          (new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal()).unmarshal(
              new DefaultReadableChecksumChannel(_byteBuf)));
    }
  }


  public static class SetupGdbStoreSyncReplyMessageToByteEncoder extends
      MessageToByteEncoder<SetupGdbStoreSyncReply> {

    @Override
    protected void encode(ChannelHandlerContext _channelHandlerContext,
        SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply, ByteBuf _byteBuf)
        throws Exception {
      (new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal())
          .marshal(_rcspSetupGdbStoreSyncReply, new WritableChecksumChannelStandardImpl(_byteBuf));
    }
  }


  public static class SetupGdbStoreSyncReplySafeChannelMarshal extends
      SafeChannelMarshal<SetupGdbStoreSyncReply> {


    private static void _maslptForWrPa(WritableChannel _bfeWritableChannel, Path[] _pfPathArray)
        throws IOException {
      _bfeWritableChannel.putInt(_pfPathArray.length);

      Path[] _vaPathArray = _pfPathArray;

      int _iVa = _pfPathArray.length;

      for (

          int _iVar = 0; _iVar < _iVa; ++_iVar) {

        Path _pfPath = _vaPathArray[_iVar];
        _pubeForWrSt(_bfeWritableChannel, _pfPath.getFileName().toString());
      }
    }


    private static void _pubeForWrSt(WritableChannel _bfeWritableChannel, String val)
        throws IOException {

      byte[] btCnt = UTF8.encode(val);
      _bfeWritableChannel.putInt(btCnt.length);
      _bfeWritableChannel.put(btCnt, btCnt.length);
    }


    private static byte[] _redbtForRe(ReadableChannel _readableChannel) throws IOException {

      int _iLb = _readableChannel.getInt();

      byte[] btCnt = new byte[_iLb];
      _readableChannel.get(btCnt, _iLb);
      return btCnt;
    }


    private static Path[] _unahphPath(ReadableChannel _readableChannel) throws IOException {

      int _iFon = _readableChannel.getInt();

      Path[] _ptsPathArray = new Path[_iFon];

      for (

          int cur = 0; cur < _iFon; ++cur) {
        _ptsPathArray[cur] = toPath(_readableChannel);
      }

      return _ptsPathArray;
    }


    private static Path toPath(ReadableChannel _readableChannel) throws IOException {

      byte[] title = _redbtForRe(_readableChannel);
      return Path.of(UTF8.decode(title));
    }

    @Override
    public void marshal(SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply,
        WritableChannel _bfeWritableChannel) throws IOException {
      _bfeWritableChannel.putInt(_rcspSetupGdbStoreSyncReply.stat.ordinal());
      _bfeWritableChannel.putLong(_rcspSetupGdbStoreSyncReply.lgItpcl);
      _maslptForWrPa(_bfeWritableChannel, _rcspSetupGdbStoreSyncReply.ptsPathArray);
    }

    @Override
    protected SetupGdbStoreSyncReply unmarshal0(ReadableChannel _readableChannel)
        throws IOException {

      int _iOdnl = _readableChannel.getInt();

      io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType stat =
          io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.values()[_iOdnl];

      long transIdx = _readableChannel.getLong();

      Path[] _fpPathArray = _unahphPath(_readableChannel);
      return new SetupGdbStoreSyncReply(transIdx, _fpPathArray, stat);
    }
  }
}
