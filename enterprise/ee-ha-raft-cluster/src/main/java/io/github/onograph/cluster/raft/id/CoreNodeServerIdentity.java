package io.github.onograph.cluster.raft.id;

import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;


public interface CoreNodeServerIdentity extends ServerIdentity {


  void crambiForNaCo(ConsensusNodeId _consensusNodeId, NamedDatabaseId _namedDatabaseId);


  ConsensusNodeId lodmmriConsensusNodeId(NamedDatabaseId _namedDatabaseId);


  ConsensusNodeId ratmmriConsensusNodeId(DatabaseId _databaseId);


  ConsensusNodeId ratmmriConsensusNodeId(NamedDatabaseId _namedDatabaseId);
}
