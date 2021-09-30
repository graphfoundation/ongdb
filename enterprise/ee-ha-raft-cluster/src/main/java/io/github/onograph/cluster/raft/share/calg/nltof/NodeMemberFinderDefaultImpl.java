package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class NodeMemberFinderDefaultImpl implements NodeMemberFinder {


  private final ClusterStructureService clusterStructureService;


  private final DatabaseManager<EnterpriseClusterDbContext> databaseManagerMdEnterpriseClusterDbContext;

  public NodeMemberFinderDefaultImpl(ClusterStructureService clusterStructureService,
      DatabaseManager<EnterpriseClusterDbContext> _databaseManagerMdEnterpriseClusterDbContext) {
    this.clusterStructureService = clusterStructureService;
    this.databaseManagerMdEnterpriseClusterDbContext = _databaseManagerMdEnterpriseClusterDbContext;
  }

  @Override
  public ConsensusNodeId revrtmefsrConsensusNodeId(NamedDatabaseId _namedDatabaseId,
      ServerId _tServerId) {
    return this.clusterStructureService.revrtmefsrConsensusNodeId(_namedDatabaseId, _tServerId);
  }

  @Override
  public ServerId revsvfrrmrServerId(ConsensusNodeId _imConsensusNodeId) {
    return this.clusterStructureService.revsvfrrmrServerId(_imConsensusNodeId);
  }

  @Override
  public Set<ServerId> vovsSet(NamedDatabaseId _namedDatabaseId) {
    return (this.databaseManagerMdEnterpriseClusterDbContext.getDatabaseContext(_namedDatabaseId)
        .map((ctx) ->
        {
          return ctx.dependencies().resolveDependency(
              MemberNodes.class);
        }).map(MemberNodes::voimbsSet)
        .orElse(Set.of())).stream().map((m) ->
        {
          return Optional
              .ofNullable(
                  this.clusterStructureService
                      .revsvfrrmrServerId(
                          m));
        })
        .flatMap(
            Optional::stream)
        .collect(Collectors
            .toSet());
  }
}
