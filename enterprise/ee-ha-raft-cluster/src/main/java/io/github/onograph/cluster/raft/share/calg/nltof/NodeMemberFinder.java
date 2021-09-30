package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Set;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


interface NodeMemberFinder {


  ConsensusNodeId revrtmefsrConsensusNodeId(NamedDatabaseId _namedDatabaseId, ServerId _serverId);


  ServerId revsvfrrmrServerId(ConsensusNodeId _consensusNodeId);


  Set<ServerId> vovsSet(NamedDatabaseId _namedDatabaseId);
}
