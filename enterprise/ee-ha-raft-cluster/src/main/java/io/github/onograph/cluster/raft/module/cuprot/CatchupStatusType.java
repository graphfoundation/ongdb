package io.github.onograph.cluster.raft.module.cuprot;


public enum CatchupStatusType {


  CST_OK_STREAM_COMPLETE,

  CST_STORE_NOT_SAME_ERR,

  CST_STORE_NOT_REACHABLE_ERR,

  CST_TRX_PRN_ERR,

  CST_BAD_REQ,

  CST_UNKNOWN_GDB_ERR,

  CST_ERR
}
