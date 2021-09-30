package io.github.onograph.cluster.raft.gateway.gwlb.rtprocs;

import io.github.onograph.cluster.raft.gateway.gwlb.mods.LeaderServiceNodeSocketAddressWrapper;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.builtin.routing.ClientSideRoutingTableProvider;
import org.neo4j.procedure.builtin.routing.RoutingResult;
import org.neo4j.values.virtual.MapValue;


public class ClientSideRoutingTableProviderDefaultImpl implements ClientSideRoutingTableProvider {


  private final LeaderServiceNodeSocketAddressWrapper caLeaderServiceNodeSocketAddressWrapper;

  public ClientSideRoutingTableProviderDefaultImpl(
      LeaderServiceNodeSocketAddressWrapper _caLeaderServiceNodeSocketAddressWrapper) {
    this.caLeaderServiceNodeSocketAddressWrapper = _caLeaderServiceNodeSocketAddressWrapper;
  }

  @Override
  public RoutingResult getRoutingResultForClientSideRouting(NamedDatabaseId _namedDatabaseId,
      MapValue _crMapValue) {
    return this.caLeaderServiceNodeSocketAddressWrapper.crerirsRoutingResult(_namedDatabaseId);
  }
}
