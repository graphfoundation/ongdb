package io.github.onograph.fabric;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.procedure.builtin.routing.GetRoutingTableProcedure;
import org.neo4j.procedure.builtin.routing.LocalRoutingTableProcedureValidator;
import org.neo4j.procedure.builtin.routing.RoutingOption;
import org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider;
import org.neo4j.procedure.builtin.routing.SingleAddressRoutingTableProvider;


public class RoutingProcedureInstaller extends AbstractRoutingProcedureInstaller {


  private static final String DESC = io.github.onograph.I18N.format(
      "io.github.onograph.fabric.RoutingProcedureInstaller.var");


  private final ClientRoutingDomainChecker clientRoutingDomainChecker;


  private final Config config;


  private final ConnectorPortRegister connectorPortRegister;


  private final DatabaseManager<?> databaseManagerMdObject;


  private final EnterpriseFabricConfiguration enterpriseFabricConfiguration;


  private final FabricDatabaseManager fabricDatabaseManager;


  private final LogProvider logProvider;


  public RoutingProcedureInstaller(ClientRoutingDomainChecker _clientRoutingDomainChecker,
      Config _config, ConnectorPortRegister _connectorPortRegister,
      DatabaseManager<?> _databaseManagerMdObject,
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration,
      FabricDatabaseManager _fabricDatabaseManager, LogProvider _logProvider) {
    this.clientRoutingDomainChecker = _clientRoutingDomainChecker;
    this.config = _config;
    this.connectorPortRegister = _connectorPortRegister;
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.enterpriseFabricConfiguration = _enterpriseFabricConfiguration;
    this.fabricDatabaseManager = _fabricDatabaseManager;
    this.logProvider = _logProvider;
  }

  @Override
  public GetRoutingTableProcedure createProcedure(List<String> _listNmsaeString) {

    LocalRoutingTableProcedureValidator _localRoutingTableProcedureValidator = new LocalRoutingTableProcedureValidator(
        this.databaseManagerMdObject);

    SingleAddressRoutingTableProvider _flbcSingleAddressRoutingTableProvider =
        new SingleAddressRoutingTableProvider(this.connectorPortRegister,
            RoutingOption.ROUTE_WRITE_AND_READ, this.config, this.logProvider,
            RoutingTableTTLProvider.ttlFromConfig(this.config));

    ClientSideRoutingTableProviderFabricImpl _clientSideRoutingTableProviderFabricImpl =
        new ClientSideRoutingTableProviderFabricImpl(this.enterpriseFabricConfiguration,
            this.fabricDatabaseManager,
            _flbcSingleAddressRoutingTableProvider);
    return new GetRoutingTableProcedure(_listNmsaeString, io.github.onograph.I18N.format(
        "io.github.onograph.fabric.RoutingProcedureInstaller.clientSideRoutingTableProviderFabricImpl"),
        this.databaseManagerMdObject,
        _localRoutingTableProcedureValidator, _clientSideRoutingTableProviderFabricImpl,
        _flbcSingleAddressRoutingTableProvider,
        this.clientRoutingDomainChecker, this.config, this.logProvider);
  }
}
