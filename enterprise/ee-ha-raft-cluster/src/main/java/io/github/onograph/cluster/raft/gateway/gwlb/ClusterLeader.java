package io.github.onograph.cluster.raft.gateway.gwlb;

import java.util.Optional;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public interface ClusterLeader {


  Optional<SocketAddress> gelaboadOptional(NamedDatabaseId _namedDatabaseId);


  Optional<ServerId> geldiOptional(NamedDatabaseId _namedDatabaseId);
}
