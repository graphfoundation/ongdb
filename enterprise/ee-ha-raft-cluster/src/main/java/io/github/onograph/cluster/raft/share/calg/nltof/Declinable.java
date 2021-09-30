package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import org.neo4j.kernel.database.NamedDatabaseId;


@FunctionalInterface
public interface Declinable {


  void haercForCoNa(
      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted _leaderNotAccepted,
      NamedDatabaseId _namedDatabaseId);
}
