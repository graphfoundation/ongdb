package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.TokenConstants;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeChannelMarshal;


class PartRecordDataHeaderSafeChannelMarshal extends SafeChannelMarshal<PartRecordDataHeader> {

  @Override
  public void marshal(PartRecordDataHeader hdrByte, WritableChannel _writableChannel)
      throws IOException {
    if (hdrByte.getIVf() < 3) {

      throw new IllegalArgumentException("*** Error: 59391863-8027-4d79-9adb-b83586ba4dc4");
    } else {
      VersionType.wrtheeForPaWr(hdrByte, _writableChannel);
    }
  }

  @Override
  public PartRecordDataHeader unmarshal0(ReadableChannel _readableChannel) throws IOException {
    return VersionType.redharPartRecordDataHeader(_readableChannel);
  }


  enum VersionType {


    SCM_2(2) {
      @Override
      PartRecordDataHeader rehecnPartRecordDataHeader(ReadableChannel _readableChannel)
          throws IOException {

        int _iOr = _readableChannel.getInt();
        this.assertProperOffset(_iOr);

        long lstFIdx = _readableChannel.getLong();

        long _lgNs = _readableChannel.getLong();

        long befIdx = _readableChannel.getLong();

        long befTLng = _readableChannel.getLong();
        return new PartRecordDataHeader(befIdx, befTLng, _iOr, this.getdVers(), _lgNs, lstFIdx);
      }

      @Override
      void wrhrceForWrPa(PartRecordDataHeader _shPartRecordDataHeader,
          WritableChannel _writableChannel) throws IOException {
        _writableChannel.putInt(this.reoos());
        _writableChannel.putLong(_shPartRecordDataHeader.getLstFIdx());
        _writableChannel.putLong(_shPartRecordDataHeader.getLgNs());
        _writableChannel.putLong(_shPartRecordDataHeader.getBefIdx());
        _writableChannel.putLong(_shPartRecordDataHeader.getBefTLng());
      }

      @Override
      int reoos() {
        return TokenConstants._NEO4J_RAFT_LOG_.length() + 8 + 32;
      }


      private void assertProperOffset(int _iOr) {
        if (_iOr != this.reoos()) {

          throw new IllegalStateException("*** Error:  55641030-24d6-456f-8b72-a8acf6a08f07");
        }
      }
    },

    SCM_3(3) {
      @Override
      PartRecordDataHeader rehecnPartRecordDataHeader(ReadableChannel _readableChannel)
          throws IOException {

        long lstFIdx = _readableChannel.getLong();

        long _lgNs = _readableChannel.getLong();

        long befIdx = _readableChannel.getLong();

        long befTLng = _readableChannel.getLong();
        return new PartRecordDataHeader(befIdx, befTLng, this.reoos(), this.getdVers(), _lgNs,
            lstFIdx);
      }

      @Override
      void wrhrceForWrPa(PartRecordDataHeader _hsPartRecordDataHeader,
          WritableChannel _writableChannel) throws IOException {
        _writableChannel.putLong(_hsPartRecordDataHeader.getLstFIdx());
        _writableChannel.putLong(_hsPartRecordDataHeader.getLgNs());
        _writableChannel.putLong(_hsPartRecordDataHeader.getBefIdx());
        _writableChannel.putLong(_hsPartRecordDataHeader.getBefTLng());
      }

      @Override
      int reoos() {
        return TokenConstants._NEO4J_RAFT_LOG_.length() + 4 + 32;
      }
    };


    private final int dVers;

    VersionType(int _iNv) {
      this.dVers = _iNv;
    }


    private static VersionType _vesnfrPartRecordDataHeaderSafeChannelMarshalVersionType(int _iNv) {

      VersionType[] _versionTypeArray = values();

      int _iVar = _versionTypeArray.length;

      for (

          int _iV = 0; _iV < _iVar; ++_iV) {

        VersionType val = _versionTypeArray[_iV];
        if (val.dVers == _iNv) {
          return val;
        }
      }

      throw new IllegalArgumentException("*** Error: 5c19a6db-97cf-420a-b02a-90c34efab906");
    }


    static PartRecordDataHeader redharPartRecordDataHeader(ReadableChannel _readableChannel)
        throws IOException {

      byte[] _hasByteArray = new byte[HeaderCrumb.LEN];
      _readableChannel.get(_hasByteArray, HeaderCrumb.LEN);
      if (!Arrays.equals(_hasByteArray, HeaderCrumb.BT_CNT)) {

        throw new IllegalStateException("*** Error:  9af50ffe-951c-43bc-8f74-c4da38d68e0c");
      } else {

        int _iVf = _readableChannel.getInt();
        return _vesnfrPartRecordDataHeaderSafeChannelMarshalVersionType(
            _iVf).rehecnPartRecordDataHeader(_readableChannel);
      }
    }


    static void wrtheeForPaWr(PartRecordDataHeader hdrByte, WritableChannel _writableChannel)
        throws IOException {
      _writableChannel.put(HeaderCrumb.BT_CNT, HeaderCrumb.BT_CNT.length);
      _writableChannel.putInt(hdrByte.getIVf());
      _vesnfrPartRecordDataHeaderSafeChannelMarshalVersionType(hdrByte.getIVf()).wrhrceForWrPa(
          hdrByte, _writableChannel);
    }


    public int getdVers() {
      return this.dVers;
    }


    abstract PartRecordDataHeader rehecnPartRecordDataHeader(ReadableChannel _readableChannel)
        throws IOException;


    abstract int reoos();


    abstract void wrhrceForWrPa(PartRecordDataHeader _partRecordDataHeader,
        WritableChannel _writableChannel)
        throws IOException;
  }


  static final class HeaderCrumb {


    static final byte[] BT_CNT;


    static final int LEN;


    static final String STI = io.github.onograph.TokenConstants._NEO4J_RAFT_LOG_;

    static {
      BT_CNT = TokenConstants._NEO4J_RAFT_LOG_.getBytes(StandardCharsets.UTF_8);
      LEN = BT_CNT.length;
    }

    private HeaderCrumb() {
    }
  }
}
