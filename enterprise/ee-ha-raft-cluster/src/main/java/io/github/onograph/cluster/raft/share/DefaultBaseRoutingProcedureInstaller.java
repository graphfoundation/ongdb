package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.gateway.gwlb.BalancerService;
import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.gateway.gwlb.LoadBalancingResourceIntegrator;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.LeaderServiceNodeSocketAddressWrapper;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManagerFunction;
import io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.ClientSideRoutingTableProviderDefaultImpl;
import io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.ClientSideRoutingTableProviderDistributedImpl;
import io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.RoutingTableProcedureValidatorClusteringImpl;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.procedure.builtin.routing.ClientSideRoutingTableProvider;
import org.neo4j.procedure.builtin.routing.GetRoutingTableProcedure;
import org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider;
import org.neo4j.procedure.builtin.routing.ServerSideRoutingTableProvider;


public class DefaultBaseRoutingProcedureInstaller extends AbstractRoutingProcedureInstaller {


  static final String MNX_DC_NOT_ENBD_WAR =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.DefaultBaseRoutingProcedureInstaller.var");


  private static final String MNX_DC_PROC_DTINF =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.DefaultBaseRoutingProcedureInstaller.var3");


  private static final String SIG_DC_PROC_DTINF =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.DefaultBaseRoutingProcedureInstaller.var2");


  private final ClientRoutingDomainChecker clientRoutingDomainChecker;


  private final ClusterStructureService clusterStructureService;


  private final Config config;


  private final DatabaseManager<?> databaseManagerDmObject;


  private final Log log;


  private final LogProvider logProvider;


  private final ServerSideRoutingTableProvider serverSideRoutingTableProvider;


  private final ClusterLeader slClusterLeader;


  public DefaultBaseRoutingProcedureInstaller(
      ClientRoutingDomainChecker _clientRoutingDomainChecker,
      ClusterStructureService clusterStructureService, Config _config,
      DatabaseManager<?> _databaseManagerMdObject, LogProvider _logProvider,
      ServerSideRoutingTableProvider _serverSideRoutingTableProvider,
      ClusterLeader _slClusterLeader) {
    this.serverSideRoutingTableProvider = _serverSideRoutingTableProvider;
    this.clusterStructureService = clusterStructureService;
    this.slClusterLeader = _slClusterLeader;
    this.databaseManagerDmObject = _databaseManagerMdObject;
    this.clientRoutingDomainChecker = _clientRoutingDomainChecker;
    this.config = _config;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
  }


  private boolean _isCumbncg() {

    String _strPl = this.config.get(SettingsDeclarationClusterImpl.settingLoaiuString);

    String _strLd = SettingsDeclarationClusterImpl.settingLoaiuString.defaultValue();

    boolean _isRblc = !Objects.equals(_strLd, _strPl);

    Map<String, ClusterLoadBalancingServerPoliciesGroupSetting> _mapGopsc = this.config.getGroups(
        ClusterLoadBalancingServerPoliciesGroupSetting.class);

    boolean _isCpsc = !_mapGopsc.isEmpty();
    return _isRblc || _isCpsc;
  }


  private BalancerService _loloblnpcrBalancerService() {
    try {
      return LoadBalancingResourceIntegrator.loaBalancerService(this.clusterStructureService,
          this.config, this.logProvider, this.slClusterLeader);
    } catch (

        Throwable _throwable) {
      throw new RuntimeException(_throwable);
    }
  }


  private ClientSideRoutingTableProvider _mudrttapreClientSideRoutingTableProvider() {

    BalancerService _pblBalancerService = this._loloblnpcrBalancerService();
    return new ClientSideRoutingTableProviderDistributedImpl(_pblBalancerService);
  }


  private ClientSideRoutingTableProvider _siedrutpdClientSideRoutingTableProvider(
      ServerMetaManagerFunction _csipServerMetaManagerFunction,
      RoutingTableTTLProvider _routingTableTTLProvider) {

    LeaderServiceNodeSocketAddressWrapper _caLeaderServiceNodeSocketAddressWrapper =
        new LeaderServiceNodeSocketAddressWrapper(this.config, _csipServerMetaManagerFunction,
            this.logProvider, this.slClusterLeader,
            _routingTableTTLProvider);
    return new ClientSideRoutingTableProviderDefaultImpl(_caLeaderServiceNodeSocketAddressWrapper);
  }

  @Override
  public GetRoutingTableProcedure createProcedure(List<String> _listNmsaeString) {

    ServerMetaManagerFunction _piscServerMetaManagerFunction = new ServerMetaManagerFunction(
        this.clusterStructureService, this.slClusterLeader);

    RoutingTableProcedureValidatorClusteringImpl _routingTableProcedureValidatorClusteringImpl =
        new RoutingTableProcedureValidatorClusteringImpl(this.databaseManagerDmObject,
            _piscServerMetaManagerFunction);

    RoutingTableTTLProvider _routingTableTTLProvider = RoutingTableTTLProvider.ttlFromConfig(
        this.config);

    String desc;

    ClientSideRoutingTableProvider _clientSideRoutingTableProvider;
    if (this.config.get(SettingsDeclarationClusterImpl.settingMutccsBoolean)) {
      _clientSideRoutingTableProvider = this._mudrttapreClientSideRoutingTableProvider();
      desc = io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.DefaultBaseRoutingProcedureInstaller.var4");
    } else {
      if (this._isCumbncg()) {

      }

      _clientSideRoutingTableProvider = this._siedrutpdClientSideRoutingTableProvider(
          _piscServerMetaManagerFunction, _routingTableTTLProvider);
      desc = io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.DefaultBaseRoutingProcedureInstaller.var5");
    }

    return new GetRoutingTableProcedure(_listNmsaeString, desc, this.databaseManagerDmObject,
        _routingTableProcedureValidatorClusteringImpl,
        _clientSideRoutingTableProvider, this.serverSideRoutingTableProvider,
        this.clientRoutingDomainChecker, this.config, this.logProvider);
  }
}
