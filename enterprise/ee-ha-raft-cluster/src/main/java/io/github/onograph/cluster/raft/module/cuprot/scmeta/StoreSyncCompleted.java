package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.Objects;


public class StoreSyncCompleted {


  public static final long FIN_CPXR_TXS_UNVLL = -1L;


  private final long lgTcl;


  private final io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType stat;


  public StoreSyncCompleted(long _lgLct,
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType stat) {
    this.stat = stat;
    this.lgTcl = stat
        == io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.OK
        ? _lgLct : -1L;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      StoreSyncCompleted _tStoreSyncCompleted = (StoreSyncCompleted) obj;
      return this.lgTcl == _tStoreSyncCompleted.lgTcl && this.stat == _tStoreSyncCompleted.stat;
    } else {
      return false;
    }
  }


  public long getLgTcl() {
    return this.lgTcl;
  }


  public io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType getStat() {
    return this.stat;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.stat, this.lgTcl);
  }


  public enum SetupGdbSyncReplyStateType {


    OK,

    SYNC_SGUID_NOT_MATCHING_ERR,

    SYNC_NO_CU_ERR,

    SYNC_GENERAL_ERR,

    SYNC_BAD_GDB_ERR


  }
}
