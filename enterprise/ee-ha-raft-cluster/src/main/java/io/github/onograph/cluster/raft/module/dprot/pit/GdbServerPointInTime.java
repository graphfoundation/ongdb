package io.github.onograph.cluster.raft.module.dprot.pit;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Map;
import java.util.Set;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.kernel.database.DatabaseId;


public interface GdbServerPointInTime {


  Map<DatabaseId, NodeServerMemberLeaderMeta> daalahMap();


  Map<DatabaseId, ConsensusNodeId> daammhMap();


  Map<DatabaseId, DatabaseState> daassteMap();


  Set<DatabaseId> divldasSet();
}
