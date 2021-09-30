package io.github.onograph.cluster.raft.share.calg.nltof;

import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


class LeaderElect {


  static final LeaderElect NOAE_LEADER_ELECT = new LeaderElect(null, null);


  private final NamedDatabaseId namedDatabaseId;


  private final ServerId serverId;

  LeaderElect(NamedDatabaseId _namedDatabaseId, ServerId _serverId) {
    this.namedDatabaseId = _namedDatabaseId;
    this.serverId = _serverId;
  }


  NamedDatabaseId getNamedDatabaseId() {
    return this.namedDatabaseId;
  }


  ServerId getServerId() {
    return this.serverId;
  }
}
