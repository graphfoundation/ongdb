package io.github.onograph.cluster.raft.module.dprot.impl.directory;

import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class SetupLeaderMeta {


  private final DatabaseId databaseId;


  private final NodeServerMemberLeaderMeta liNodeServerMemberLeaderMeta;

  public SetupLeaderMeta(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta,
      NamedDatabaseId _namedDatabaseId) {
    this.liNodeServerMemberLeaderMeta = _ilNodeServerMemberLeaderMeta;
    this.databaseId = _namedDatabaseId.databaseId();
  }


  public DatabaseId getDatabaseId() {
    return this.databaseId;
  }


  public NodeServerMemberLeaderMeta getLiNodeServerMemberLeaderMeta() {
    return this.liNodeServerMemberLeaderMeta;
  }
}
