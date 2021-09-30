package io.github.onograph.cluster.raft.gateway.gwlb.rtprocs;

import io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManager;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManagerFunction;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.api.exceptions.Status.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.builtin.routing.BaseRoutingTableProcedureValidator;


public class RoutingTableProcedureValidatorClusteringImpl extends
    BaseRoutingTableProcedureValidator {


  private final ServerMetaManagerFunction csipServerMetaManagerFunction;

  public RoutingTableProcedureValidatorClusteringImpl(DatabaseManager<?> _databaseManagerMdObject,
      ServerMetaManagerFunction _piscServerMetaManagerFunction) {
    super(_databaseManagerMdObject);
    this.csipServerMetaManagerFunction = _piscServerMetaManagerFunction;
  }


  private void _astcttpycadasForNa(NamedDatabaseId _namedDatabaseId) throws ProcedureException {

    ServerMetaManager _iscServerMetaManager = this.csipServerMetaManagerFunction.apply(
        _namedDatabaseId);
    if (_iscServerMetaManager.isEmy() || !_iscServerMetaManager.isOismr()) {

      throw new ProcedureException(Database.DatabaseUnavailable,
          "*** Error: 63ce6a9e-81cd-446f-a3b0-e18a073440ce");
    }
  }

  @Override
  public void isValidForClientSideRouting(NamedDatabaseId _namedDatabaseId)
      throws ProcedureException {
    this._astcttpycadasForNa(_namedDatabaseId);
  }

  @Override
  public void isValidForServerSideRouting(NamedDatabaseId _namedDatabaseId)
      throws ProcedureException {
    this._astcttpycadasForNa(_namedDatabaseId);
  }
}
