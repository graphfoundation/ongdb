package io.github.onograph.cluster.raft.module.dprot.impl.watch;


public enum ClusterDataType {


  CDT_META(io.github.onograph.TokenConstants.MEMBER_DATA),

  CDT_CONS_ID_HDLR(io.github.onograph.TokenConstants.RAFT_ID_PUBLISHED_BY_MEMBER),

  CDT_DIR(io.github.onograph.TokenConstants.PER_DB_LEADER_NAME),

  CDT_GDB_STATUS(io.github.onograph.TokenConstants.MEMBER_DB_STATE),

  CDT_CONS_NODE_MAP(io.github.onograph.TokenConstants.RAFT_MEMBER_MAPPING);


  private final String tokenKey;

  ClusterDataType(String _tokKeyName) {
    this.tokenKey = _tokKeyName;
  }


  public String getTokenKey() {
    return this.tokenKey;
  }
}
