package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.api.exceptions.Status.General;


public class ClusterRoleBasicProcedureCoreImpl extends AbstractClusterRoleBasicProcedure {

  public ClusterRoleBasicProcedureCoreImpl(DatabaseManager<?> _databaseManagerMdObject) {
    super(_databaseManagerMdObject);
  }

  @Override
  ClusterNodeRoleType rolClusterNodeRoleType(DatabaseContext _databaseContext)
      throws ProcedureException {

    ConsensusOperationsManager consensusOperationsManager = _databaseContext.dependencies()
        .resolveDependency(ConsensusOperationsManager.class);
    if (consensusOperationsManager == null) {

      throw new ProcedureException(General.UnknownError,
          "*** Error:  5ea20c0f-282f-4a2d-8313-1e0ee915f13b");
    } else {
      return consensusOperationsManager.isLee() ? ClusterNodeRoleType.LEADER
          : ClusterNodeRoleType.FOLLOWER;
    }
  }
}
