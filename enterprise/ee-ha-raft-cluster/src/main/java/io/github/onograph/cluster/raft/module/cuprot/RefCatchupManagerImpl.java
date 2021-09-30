package io.github.onograph.cluster.raft.module.cuprot;


public class RefCatchupManagerImpl extends
    Ref<io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType> {

  public RefCatchupManagerImpl() {
    super(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT);
  }


  public enum CatchupManagerStatusType {


    MSG_TYPE_IDNT,

    STORE_GUID,

    CS,

    TRF_IN_ANSWER,

    SC_COMPLETE,

    TRX_STM_COMPLETE,

    F_HDR_VAL,

    FPART,

    SETUP_SC_ANSWER,

    IDX_SS_ANSWER,

    ERR_ANSWER,

    GDB_UUID,

    REQ_GDB_UIDS,

    REQ_META,

    REQ_INFO
  }
}
