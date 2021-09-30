package io.github.onograph.cluster.raft.gateway.gwlb;

import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.builtin.routing.RoutingResult;
import org.neo4j.values.virtual.MapValue;


public interface BalancerService {


  RoutingResult runRoutingResult(NamedDatabaseId _namedDatabaseId, MapValue _mapValue)
      throws ProcedureException;
}
