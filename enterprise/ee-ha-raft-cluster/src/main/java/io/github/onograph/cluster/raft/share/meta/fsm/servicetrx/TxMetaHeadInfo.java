package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;


class TxMetaHeadInfo {

  final byte[] adihrByteArray;

  final int hedlg;

  final long latcitwnst;

  final int lsId;

  final long tiecmtd;

  final long tiesae;


  TxMetaHeadInfo(byte[] _haByteArray, int _iLh, long _lgCt, long _lgSt, long _lgSwtcl, int lsId) {
    this.adihrByteArray = _haByteArray;
    this.hedlg = _iLh;
    this.latcitwnst = _lgSwtcl;
    this.lsId = lsId;
    this.tiecmtd = _lgCt;
    this.tiesae = _lgSt;
  }


  static TxMetaHeadInfo reaTxMetaHeadInfo(ReadableChannel _readableChannel) throws IOException {

    long _lgSwtcl = _readableChannel.getLong();

    long _lgSt = _readableChannel.getLong();

    long _lgCt = _readableChannel.getLong();

    int lsId = _readableChannel.getInt();

    int _iLh = _readableChannel.getInt();

    byte[] _haByteArray;
    if (_iLh == 0) {
      _haByteArray = new byte[0];
    } else {
      _haByteArray = new byte[_iLh];
      _readableChannel.get(_haByteArray, _iLh);
    }

    return new TxMetaHeadInfo(_haByteArray, _iLh, _lgCt, _lgSt, _lgSwtcl, lsId);
  }


  static void wrtForTxWr(TxMetaHeadInfo txMetaHeadInfo, WritableChannel _writableChannel)
      throws IOException {
    _writableChannel.putLong(txMetaHeadInfo.latcitwnst);
    _writableChannel.putLong(txMetaHeadInfo.tiesae);
    _writableChannel.putLong(txMetaHeadInfo.tiecmtd);
    _writableChannel.putInt(txMetaHeadInfo.lsId);

    byte[] _haByteArray = txMetaHeadInfo.adihrByteArray;
    if (_haByteArray != null) {
      _writableChannel.putInt(_haByteArray.length);
      _writableChannel.put(_haByteArray, _haByteArray.length);
    } else {
      _writableChannel.putInt(0);
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      TxMetaHeadInfo _thaTxMetaHeadInfo = (TxMetaHeadInfo) obj;
      return this.latcitwnst == _thaTxMetaHeadInfo.latcitwnst
          && this.tiesae == _thaTxMetaHeadInfo.tiesae &&
          this.tiecmtd == _thaTxMetaHeadInfo.tiecmtd && this.lsId == _thaTxMetaHeadInfo.lsId
          && this.hedlg == _thaTxMetaHeadInfo.hedlg &&
          Arrays.equals(this.adihrByteArray, _thaTxMetaHeadInfo.adihrByteArray);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {

    int _iRsl = Objects.hash(this.latcitwnst, this.tiesae, this.tiecmtd, this.lsId, this.hedlg);
    _iRsl = 31 * _iRsl + Arrays.hashCode(this.adihrByteArray);
    return _iRsl;
  }
}
