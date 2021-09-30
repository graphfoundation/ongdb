package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import java.util.Objects;


public interface TransactionBlockLimiters {


  TransactionBlockLimiters UNOD_TRANSACTION_BLOCK_LIMITERS = (ignored) ->
  {
    return false;
  };


  boolean isCole(long _lgVar);


  class Configured implements TransactionBlockLimiters {


    private final long lgStitl;

    public Configured(long _lgStitl) {
      this.lgStitl = _lgStitl;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        Configured configured = (Configured) obj;
        return this.lgStitl == configured.lgStitl;
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.lgStitl);
    }

    @Override
    public boolean isCole(long _lgLsti) {
      return _lgLsti >= this.lgStitl;
    }
  }
}
