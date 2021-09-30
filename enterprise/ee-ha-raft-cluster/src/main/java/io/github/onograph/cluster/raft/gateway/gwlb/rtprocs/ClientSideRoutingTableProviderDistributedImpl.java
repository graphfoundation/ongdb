package io.github.onograph.cluster.raft.gateway.gwlb.rtprocs;

import io.github.onograph.cluster.raft.gateway.gwlb.BalancerService;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.builtin.routing.ClientSideRoutingTableProvider;
import org.neo4j.procedure.builtin.routing.RoutingResult;
import org.neo4j.values.virtual.MapValue;


public class ClientSideRoutingTableProviderDistributedImpl implements
    ClientSideRoutingTableProvider {


  private final BalancerService pblBalancerService;

  public ClientSideRoutingTableProviderDistributedImpl(BalancerService _pblBalancerService) {
    this.pblBalancerService = _pblBalancerService;
  }

  @Override
  public RoutingResult getRoutingResultForClientSideRouting(NamedDatabaseId _namedDatabaseId,
      MapValue _crMapValue) throws ProcedureException {
    return this.pblBalancerService.runRoutingResult(_namedDatabaseId, _crMapValue);
  }
}
