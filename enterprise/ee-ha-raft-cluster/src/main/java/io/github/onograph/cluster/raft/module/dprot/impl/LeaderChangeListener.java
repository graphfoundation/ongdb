package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Map;
import org.neo4j.kernel.database.DatabaseId;


public interface LeaderChangeListener {


  void ondleueForMa(Map<DatabaseId, NodeServerMemberLeaderMeta> _mapVadn);
}
