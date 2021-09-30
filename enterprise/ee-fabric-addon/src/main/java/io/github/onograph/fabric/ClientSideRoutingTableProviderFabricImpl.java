package io.github.onograph.fabric;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.util.List;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.builtin.routing.ClientSideRoutingTableProvider;
import org.neo4j.procedure.builtin.routing.RoutingResult;
import org.neo4j.values.virtual.MapValue;


class ClientSideRoutingTableProviderFabricImpl implements ClientSideRoutingTableProvider {


  private final EnterpriseFabricConfiguration enterpriseFabricConfiguration;


  private final FabricDatabaseManager fabricDatabaseManager;


  private final ClientSideRoutingTableProvider ptrfClientSideRoutingTableProvider;


  ClientSideRoutingTableProviderFabricImpl(
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration,
      FabricDatabaseManager _fabricDatabaseManager,
      ClientSideRoutingTableProvider _ptrfClientSideRoutingTableProvider) {
    this.enterpriseFabricConfiguration = _enterpriseFabricConfiguration;
    this.fabricDatabaseManager = _fabricDatabaseManager;
    this.ptrfClientSideRoutingTableProvider = _ptrfClientSideRoutingTableProvider;
  }

  @Override
  public RoutingResult getRoutingResultForClientSideRouting(NamedDatabaseId _namedDatabaseId,
      MapValue _crMapValue) throws ProcedureException {
    if (this.fabricDatabaseManager.isFabricDatabase(_namedDatabaseId.name())) {

      List<SocketAddress> _listSfSocketAddress = this.enterpriseFabricConfiguration.getListSfSocketAddress();
      if (_listSfSocketAddress != null && !_listSfSocketAddress.isEmpty()) {
        return new RoutingResult(_listSfSocketAddress, _listSfSocketAddress, _listSfSocketAddress,
            this.enterpriseFabricConfiguration.getTrDuration().toMillis());
      }
    }

    return this.ptrfClientSideRoutingTableProvider.getRoutingResultForClientSideRouting(
        _namedDatabaseId, _crMapValue);
  }
}
