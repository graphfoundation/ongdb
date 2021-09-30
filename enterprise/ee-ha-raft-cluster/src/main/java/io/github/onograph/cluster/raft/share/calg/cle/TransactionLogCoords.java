package io.github.onograph.cluster.raft.share.calg.cle;

import java.util.Objects;


public class TransactionLogCoords {


  public long byeoft;


  public long lgIdx;

  public TransactionLogCoords(long lgIdx, long _lgOb) {
    this.byeoft = _lgOb;
    this.lgIdx = lgIdx;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      TransactionLogCoords _pstoTransactionLogCoords = (TransactionLogCoords) obj;
      return this.lgIdx == _pstoTransactionLogCoords.lgIdx
          && this.byeoft == _pstoTransactionLogCoords.byeoft;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.lgIdx, this.byeoft);
  }
}
