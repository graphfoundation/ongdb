package io.github.onograph.dbms.gdb;

import io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService;
import io.github.onograph.cluster.raft.shared.DistributedGdb;
import java.util.Optional;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.monitoring.Monitors;


public interface EnterpriseClusterDbContext extends DefaultDatabaseContext {


  NamedDatabaseId daasidNamedDatabaseId();


  DatabaseLayout daaslauDatabaseLayout();

  @Override
  DistributedGdb enpdaGdb();


  Optional<ConsensusLeaderNodeService> ledlarOptional();


  Monitors moirMonitors();
}
