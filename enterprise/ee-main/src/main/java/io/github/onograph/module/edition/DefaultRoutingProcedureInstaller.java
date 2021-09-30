package io.github.onograph.module.edition;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderDistributedImpl;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.LeaderServiceNodeSocketAddressWrapper;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManagerFunction;
import io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.ClientSideRoutingTableProviderDefaultImpl;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.procedure.builtin.routing.GetRoutingTableProcedure;
import org.neo4j.procedure.builtin.routing.LocalRoutingTableProcedureValidator;
import org.neo4j.procedure.builtin.routing.RoutingOption;
import org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider;
import org.neo4j.procedure.builtin.routing.ServerSideRoutingTableProvider;
import org.neo4j.procedure.builtin.routing.SingleAddressRoutingTableProvider;


public class DefaultRoutingProcedureInstaller extends AbstractRoutingProcedureInstaller {


  private static final String DESC = io.github.onograph.I18N.format(
      "io.github.onograph.module.edition.DefaultRoutingProcedureInstaller.var");


  private final ClientRoutingDomainChecker clientRoutingDomainChecker;


  private final ClusterStructureService clusterStructureService;


  private final Config config;


  private final DatabaseManager<?> databaseManagerMdObject;


  private final LogProvider logProvider;


  private final ClusterLeader lsClusterLeader;


  private final ServerSideRoutingTableProvider serverSideRoutingTableProvider;


  public DefaultRoutingProcedureInstaller(ClientRoutingDomainChecker _clientRoutingDomainChecker,
      ClusterStructureService clusterStructureService, Config _config,
      ConnectorPortRegister _connectorPortRegister, DatabaseManager<?> _databaseManagerDmObject,
      LogProvider _logProvider) {
    this.clusterStructureService = clusterStructureService;
    this.serverSideRoutingTableProvider =
        new SingleAddressRoutingTableProvider(_connectorPortRegister,
            RoutingOption.ROUTE_WRITE_AND_READ, _config, _logProvider,
            RoutingTableTTLProvider.ttlFromConfig(_config));
    this.clientRoutingDomainChecker = _clientRoutingDomainChecker;
    this.lsClusterLeader = new ClusterLeaderDistributedImpl(clusterStructureService, _logProvider);
    this.databaseManagerMdObject = _databaseManagerDmObject;
    this.config = _config;
    this.logProvider = _logProvider;
  }

  @Override
  public GetRoutingTableProcedure createProcedure(List<String> _listNmsaeString) {

    LocalRoutingTableProcedureValidator _localRoutingTableProcedureValidator = new LocalRoutingTableProcedureValidator(
        this.databaseManagerMdObject);

    ServerMetaManagerFunction _piscServerMetaManagerFunction = new ServerMetaManagerFunction(
        this.clusterStructureService, this.lsClusterLeader);

    LeaderServiceNodeSocketAddressWrapper _caLeaderServiceNodeSocketAddressWrapper =
        new LeaderServiceNodeSocketAddressWrapper(this.config, _piscServerMetaManagerFunction,
            this.logProvider, this.lsClusterLeader,
            RoutingTableTTLProvider.ttlFromConfig(this.config));

    ClientSideRoutingTableProviderDefaultImpl _clientSideRoutingTableProviderDefaultImpl =
        new ClientSideRoutingTableProviderDefaultImpl(_caLeaderServiceNodeSocketAddressWrapper);
    return new GetRoutingTableProcedure(_listNmsaeString, io.github.onograph.I18N.format(
        "io.github.onograph.module.edition.DefaultRoutingProcedureInstaller.clientSideRoutingTableProviderDefaultImpl"),
        this.databaseManagerMdObject, _localRoutingTableProcedureValidator,
        _clientSideRoutingTableProviderDefaultImpl,
        this.serverSideRoutingTableProvider, this.clientRoutingDomainChecker, this.config,
        this.logProvider);
  }
}
