package io.github.onograph.cluster.raft.share.meta;


public enum MetaType {


  MT_NOOP(-1),

  MT_VERS(0),

  MT_CLST_SES_TRCKR(1),

  MT_LSREN(2),

  MT_CONS_CS(3),

  MT_GDB_TITLE(4),

  MT_CONS_GRP_UID(5),

  MT_CORE_CONMEM_UID(6),

  MT_CONS_LOG_ETR(7),

  MT_CONS_TTIME(8),

  MT_CONS_VOTE(9),

  MT_CONS_MNODE_DIR(10),

  MT_PREV_MDFLSH(11),

  MT_D_QM(12),

  MT_CONMEM_UID(13);


  private final int mTypeIdent;

  MetaType(int _iTi) {
    this.mTypeIdent = _iTi;
  }


  public int getMTypeIdent() {
    return this.mTypeIdent;
  }
}
