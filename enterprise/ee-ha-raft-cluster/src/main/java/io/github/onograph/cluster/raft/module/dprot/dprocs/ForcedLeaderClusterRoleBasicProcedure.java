package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;


public class ForcedLeaderClusterRoleBasicProcedure extends AbstractClusterRoleBasicProcedure {

  public ForcedLeaderClusterRoleBasicProcedure(DatabaseManager<?> _databaseManagerMdObject) {
    super(_databaseManagerMdObject);
  }

  @Override
  ClusterNodeRoleType rolClusterNodeRoleType(DatabaseContext _idnDatabaseContext) {
    return ClusterNodeRoleType.LEADER;
  }
}
