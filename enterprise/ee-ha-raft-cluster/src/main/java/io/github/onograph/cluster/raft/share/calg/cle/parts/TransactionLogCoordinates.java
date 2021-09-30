package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.calg.cle.TransactionLogCoords;
import java.util.Arrays;


class TransactionLogCoordinates {


  static final int CAHI = 8;


  private final TransactionLogCoords[] cceTransactionLogCoordsArray = new TransactionLogCoords[8];


  private final TransactionLogCoords isStrt;


  private int iP;

  TransactionLogCoordinates(long _lgOr) {
    this.isStrt = new TransactionLogCoords(0L, _lgOr);
    Arrays.fill(this.cceTransactionLogCoordsArray, this.isStrt);
  }


  synchronized TransactionLogCoords lokTransactionLogCoords(long _lgIo) {
    if (_lgIo == 0L) {
      return this.isStrt;
    } else {

      TransactionLogCoords _besTransactionLogCoords = this.isStrt;

      for (

          int cur = 0; cur < 8; ++cur) {
        if (this.cceTransactionLogCoordsArray[cur].lgIdx <= _lgIo
            && this.cceTransactionLogCoordsArray[cur].lgIdx > _besTransactionLogCoords.lgIdx) {
          _besTransactionLogCoords = this.cceTransactionLogCoordsArray[cur];
        }
      }

      return _besTransactionLogCoords;
    }
  }


  public synchronized void putForTr(TransactionLogCoords _pstoTransactionLogCoords) {
    this.cceTransactionLogCoordsArray[this.iP] = _pstoTransactionLogCoords;
    this.iP = (this.iP + 1) % 8;
  }
}
