package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class ServerMetaManagerFunction implements Function<NamedDatabaseId, ServerMetaManager> {


  private final ClusterStructureService clusterStructureService;


  private final ClusterLeader slClusterLeader;

  public ServerMetaManagerFunction(ClusterStructureService clusterStructureService,
      ClusterLeader _slClusterLeader) {
    this.clusterStructureService = clusterStructureService;
    this.slClusterLeader = _slClusterLeader;
  }


  private static LoadBalanceServerMeta _nesvioLoadBalanceServerMeta(
      Entry<ServerId, ? extends GdbDiscoveryMeta> _entryEtysg) {
    return _nesvioLoadBalanceServerMeta(_entryEtysg.getValue(), _entryEtysg.getKey());
  }


  private static LoadBalanceServerMeta _nesvioLoadBalanceServerMeta(
      GdbDiscoveryMeta _isdGdbDiscoveryMeta, ServerId _serverId) {
    return new LoadBalanceServerMeta(
        _isdGdbDiscoveryMeta.contsDiscoverySocketAddresses().cltbasSocketAddress(), _serverId,
        _isdGdbDiscoveryMeta.gruSet());
  }


  private static ServerMetaManager.ServerMetaAllWrapper _sevioServerMetaManagerServerMetaAllWrapper(
      ClusterStructureService clusterStructureService,
      ClusterStructure<? extends GdbDiscoveryMeta> _clusterStructureTplgGdbDiscoveryMeta,
      NamedDatabaseId _namedDatabaseId) {
    return new ServerMetaManager.ServerMetaAllWrapper(
        _clusterStructureTplgGdbDiscoveryMeta.sevsMap().entrySet().stream()
            .map(ServerMetaManagerFunction::_nesvioLoadBalanceServerMeta)
            .collect(Collectors.toMap(Function.identity(), (serverInfo) ->
            {
              return clusterStructureService.lopdbstDiscoveryGdbOperatorMetaWrapper(
                      _namedDatabaseId,
                      serverInfo.getServerId())
                  .getOperatorState();
            })));
  }


  private static ServerMetaManager _toosatServerMetaManager(
      ClusterStructureService clusterStructureService, NamedDatabaseId _namedDatabaseId,
      ClusterLeader _slClusterLeader) {

    ServerMetaManager.ServerMetaAllWrapper _tcServerMetaAllWrapper =
        _sevioServerMetaManagerServerMetaAllWrapper(clusterStructureService,
            clusterStructureService.cotogfdaDatabaseCoreClusterStructure(_namedDatabaseId),
            _namedDatabaseId);

    ServerMetaManager.ServerMetaAllWrapper _trServerMetaAllWrapper =
        _sevioServerMetaManagerServerMetaAllWrapper(clusterStructureService,
            clusterStructureService.rereatlfodaDatabaseReadReplicaClusterStructure(
                _namedDatabaseId),
            _namedDatabaseId);
    return new ServerMetaManager(_slClusterLeader.geldiOptional(_namedDatabaseId).orElse(null),
        _tcServerMetaAllWrapper, _trServerMetaAllWrapper);
  }

  @Override
  public ServerMetaManager apply(NamedDatabaseId _namedDatabaseId) {
    return _toosatServerMetaManager(this.clusterStructureService, _namedDatabaseId,
        this.slClusterLeader);
  }
}
