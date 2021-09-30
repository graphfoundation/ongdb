package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManagerFunction;
import io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.BaseRoutingTableProcedureValidatorReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.procedure.builtin.routing.GetRoutingTableProcedure;
import org.neo4j.procedure.builtin.routing.RoutingOption;
import org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider;
import org.neo4j.procedure.builtin.routing.SingleAddressRoutingTableProvider;


public final class ReadReplicaClusterSingleInstanceRoutingProcedureInstaller extends
    AbstractRoutingProcedureInstaller {


  private static final String DESC = io.github.onograph.I18N.format(
      "io.github.onograph.cluster.raft.readreplica.ReadReplicaClusterSingleInstanceRoutingProcedureInstaller.var");


  private final ClientRoutingDomainChecker clientRoutingDomainChecker;


  private final ClusterStructureService clusterStructureService;


  private final Config config;


  private final ConnectorPortRegister connectorPortRegister;


  private final DatabaseManager<?> databaseManagerMdObject;


  private final LogProvider logProvider;


  private final RoutingOption routingOption;


  private final ClusterLeader slClusterLeader;


  public ReadReplicaClusterSingleInstanceRoutingProcedureInstaller(
      ClientRoutingDomainChecker _clientRoutingDomainChecker,
      ClusterStructureService clusterStructureService, Config _config,
      ConnectorPortRegister _connectorPortRegister, DatabaseManager<?> _databaseManagerMdObject,
      LogProvider _logProvider, RoutingOption _routingOption, ClusterLeader _slClusterLeader) {
    this.clientRoutingDomainChecker = _clientRoutingDomainChecker;
    this.clusterStructureService = clusterStructureService;
    this.config = _config;
    this.connectorPortRegister = _connectorPortRegister;
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.logProvider = _logProvider;
    this.routingOption = _routingOption;
    this.slClusterLeader = _slClusterLeader;
  }

  @Override
  public GetRoutingTableProcedure createProcedure(List<String> _listNmsaeString) {

    BaseRoutingTableProcedureValidatorReadReplicaImpl _baseRoutingTableProcedureValidatorReadReplicaImpl =
        new BaseRoutingTableProcedureValidatorReadReplicaImpl(this.databaseManagerMdObject,
            new ServerMetaManagerFunction(
                this.clusterStructureService,
                this.slClusterLeader), this.routingOption);

    SingleAddressRoutingTableProvider _singleAddressRoutingTableProvider =
        new SingleAddressRoutingTableProvider(this.connectorPortRegister, this.routingOption,
            this.config, this.logProvider,
            RoutingTableTTLProvider.ttlFromConfig(this.config));
    return new GetRoutingTableProcedure(_listNmsaeString, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.readreplica.ReadReplicaClusterSingleInstanceRoutingProcedureInstaller.singleAddressRoutingTableProvider"),
        this.databaseManagerMdObject, _baseRoutingTableProcedureValidatorReadReplicaImpl,
        _singleAddressRoutingTableProvider,
        this.clientRoutingDomainChecker, this.config, this.logProvider);
  }
}
