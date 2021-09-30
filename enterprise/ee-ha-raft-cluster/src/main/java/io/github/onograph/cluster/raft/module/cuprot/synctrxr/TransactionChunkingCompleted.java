package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import java.util.Objects;


public class TransactionChunkingCompleted {


  private final long lgItl;


  private final CatchupStatusType stat;


  public TransactionChunkingCompleted(long _lgItl, CatchupStatusType stat) {
    this.lgItl = _lgItl;
    this.stat = stat;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      TransactionChunkingCompleted _thaTransactionChunkingCompleted = (TransactionChunkingCompleted) obj;
      return this.lgItl == _thaTransactionChunkingCompleted.lgItl
          && this.stat == _thaTransactionChunkingCompleted.stat;
    } else {
      return false;
    }
  }


  public long getLgItl() {
    return this.lgItl;
  }


  public CatchupStatusType getStat() {
    return this.stat;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.stat, this.lgItl);
  }


}
