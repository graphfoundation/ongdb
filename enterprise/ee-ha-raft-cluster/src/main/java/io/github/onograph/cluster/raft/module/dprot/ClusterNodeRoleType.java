package io.github.onograph.cluster.raft.module.dprot;


/*
 * Needs to be named exact for backwards compat.
 */

public enum ClusterNodeRoleType {


  LEADER,

  FOLLOWER,

  READ_REPLICA,

  UNKNOWN
}
