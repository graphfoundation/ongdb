package io.github.onograph.cluster.raft.gateway.gwlb.rtprocs;

import io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManagerFunction;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.builtin.routing.BaseRoutingTableProcedureValidator;
import org.neo4j.procedure.builtin.routing.LocalRoutingTableProcedureValidator;
import org.neo4j.procedure.builtin.routing.RoutingOption;
import org.neo4j.procedure.builtin.routing.RoutingTableProcedureValidator;


public class BaseRoutingTableProcedureValidatorReadReplicaImpl extends
    BaseRoutingTableProcedureValidator {


  private final RoutingTableProcedureValidator routingTableProcedureValidator;


  public BaseRoutingTableProcedureValidatorReadReplicaImpl(
      DatabaseManager<?> _databaseManagerMdObject,
      ServerMetaManagerFunction _piscServerMetaManagerFunction, RoutingOption _routingOption) {
    super(_databaseManagerMdObject);
    switch (_routingOption) {
      case ROUTE_AND_READ_ONLY:
        this.routingTableProcedureValidator = new LocalRoutingTableProcedureValidator(
            _databaseManagerMdObject);
        break;
      case ROUTE_WRITE_AND_READ:
        this.routingTableProcedureValidator = new RoutingTableProcedureValidatorClusteringImpl(
            _databaseManagerMdObject, _piscServerMetaManagerFunction);
        break;
      default:

        throw new IllegalStateException("*** Error: 8d1f17ad-8121-48a7-b2de-09d06a7e93db");
    }
  }

  @Override
  public void isValidForClientSideRouting(NamedDatabaseId _namedDatabaseId)
      throws ProcedureException {
    this.routingTableProcedureValidator.isValidForClientSideRouting(_namedDatabaseId);
  }

  @Override
  public void isValidForServerSideRouting(NamedDatabaseId _namedDatabaseId)
      throws ProcedureException {
    this.routingTableProcedureValidator.isValidForServerSideRouting(_namedDatabaseId);
  }
}
