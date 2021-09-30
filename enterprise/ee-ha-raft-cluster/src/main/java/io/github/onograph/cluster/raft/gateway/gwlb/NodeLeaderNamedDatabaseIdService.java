package io.github.onograph.cluster.raft.gateway.gwlb;

import io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService;
import java.util.Optional;
import org.neo4j.kernel.database.NamedDatabaseId;


public interface NodeLeaderNamedDatabaseIdService {


  Optional<ConsensusLeaderNodeService> geldOptional(NamedDatabaseId _namedDatabaseId);
}
