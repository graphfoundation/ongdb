package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.gateway.gwlb.ClusteringBalancerService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.config.Configuration;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.builtin.routing.RoutingResult;
import org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider;
import org.neo4j.values.virtual.MapValue;


public class ClusteringBalancerServiceImpl implements ClusteringBalancerService {


  public static final String PLGX_NME = io.github.onograph.TokenConstants.SERVER_POLICIES;


  private LeaderServiceNodeSocketAddressWrapper caLeaderServiceNodeSocketAddressWrapper;


  private LoadBalancingStrategies plceLoadBalancingStrategies;

  @Override
  public void iniForClClLoCo(ClusterStructureService clusterStructureService,
      ClusterLeader _slClusterLeader, LogProvider _logProvider, Config _config) {

    Log _log = _logProvider.getLog(this.getClass());
    this.plceLoadBalancingStrategies = ServerStrategyManager.losepiLoadBalancingStrategies(_config,
        _log);
    this.caLeaderServiceNodeSocketAddressWrapper =
        new LeaderServiceNodeSocketAddressWrapper(_config,
            new ServerMetaManagerFunction(clusterStructureService, _slClusterLeader), _logProvider,
            _slClusterLeader,
            RoutingTableTTLProvider.ttlFromConfig(_config));
  }

  @Override
  public boolean isSfgpi() {
    return true;
  }

  @Override
  public String plgneString() {
    return io.github.onograph.TokenConstants.SERVER_POLICIES;
  }

  @Override
  public RoutingResult runRoutingResult(NamedDatabaseId _namedDatabaseId, MapValue _cnetMapValue)
      throws ProcedureException {

    LoadBalancingStrategy _plcLoadBalancingStrategy = this.plceLoadBalancingStrategies.seefLoadBalancingStrategy(
        _cnetMapValue);
    return this.caLeaderServiceNodeSocketAddressWrapper.crerirsRoutingResult(_namedDatabaseId,
        _plcLoadBalancingStrategy);
  }

  @Override
  public void vaitForCoLo(Configuration _configuration, Log _log) {
  }
}
