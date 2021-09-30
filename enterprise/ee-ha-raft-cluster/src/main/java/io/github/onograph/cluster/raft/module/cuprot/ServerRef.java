package io.github.onograph.cluster.raft.module.cuprot;


public class ServerRef extends
    Ref<io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType> {

  public ServerRef() {
    super(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }


  public enum CatchupManagerStatusType {


    STAT_MSG_TYPE,

    REQ_STINFO,

    REQ_SUID,

    REQ_CSS,

    TRX_IN,

    REQ_SF,

    SET_SC,

    REQ_GDB_UID,

    REQ_GDB_UIDS,

    REQ_META,

    REQ_STAT_INFO
  }
}
