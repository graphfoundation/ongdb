package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.BalancerService;
import java.util.Collections;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.builtin.routing.RoutingResult;
import org.neo4j.values.virtual.MapValue;


public class ServerPoliciesPlugin implements BalancerService {


  private final BalancerService dlgtBalancerService;

  public ServerPoliciesPlugin(BalancerService _dlgtBalancerService) {
    this.dlgtBalancerService = _dlgtBalancerService;
  }


  public BalancerService getDlgtBalancerService() {
    return this.dlgtBalancerService;
  }

  @Override
  public RoutingResult runRoutingResult(NamedDatabaseId _namedDatabaseId, MapValue _cnetMapValue)
      throws ProcedureException {

    RoutingResult _routingResult = this.dlgtBalancerService.runRoutingResult(_namedDatabaseId,
        _cnetMapValue);
    Collections.shuffle(_routingResult.routeEndpoints());
    Collections.shuffle(_routingResult.writeEndpoints());
    Collections.shuffle(_routingResult.readEndpoints());
    return _routingResult;
  }
}
