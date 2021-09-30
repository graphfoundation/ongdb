package io.github.onograph.cluster.raft.share.calg;

import org.neo4j.kernel.database.NamedDatabaseId;


public interface MainLeaderNodeEventHandlers {


  void onleeswcForNaNo(NamedDatabaseId _namedDatabaseId,
      NodeServerMemberLeaderMeta _nodeServerMemberLeaderMeta);


  default void onungtForNa(NamedDatabaseId _dfNamedDatabaseId) {
  }
}
