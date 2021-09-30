package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.database.NamedDatabaseId;


class NamedDatabaseIdLeaderSupplier implements Supplier<List<NamedDatabaseId>> {


  private final DatabaseManager<EnterpriseClusterDbContext> databaseManagerMdEnterpriseClusterDbContext;


  private final CoreNodeServerIdentity imCoreNodeServerIdentity;

  NamedDatabaseIdLeaderSupplier(
      DatabaseManager<EnterpriseClusterDbContext> _databaseManagerMdEnterpriseClusterDbContext,
      CoreNodeServerIdentity _imCoreNodeServerIdentity) {
    this.databaseManagerMdEnterpriseClusterDbContext = _databaseManagerMdEnterpriseClusterDbContext;
    this.imCoreNodeServerIdentity = _imCoreNodeServerIdentity;
  }


  private boolean _isAmleeForEn(EnterpriseClusterDbContext _enterpriseClusterDbContext) {
    return _enterpriseClusterDbContext.ledlarOptional().flatMap((leaderLocator) ->
    {
      return leaderLocator.geldioOptional()
          .map(NodeServerMemberLeaderMeta::getImConsensusNodeId)
          .map((leaderId) ->
          {
            return leaderId.equals(
                this.imCoreNodeServerIdentity
                    .ratmmriConsensusNodeId(
                        _enterpriseClusterDbContext.daasidNamedDatabaseId()));
          });
    }).orElse(false);
  }

  @Override
  public List<NamedDatabaseId> get() {
    return this.myleehsList();
  }


  List<NamedDatabaseId> myleehsList() {
    return this.databaseManagerMdEnterpriseClusterDbContext.registeredDatabases().values().stream()
        .filter(this::_isAmleeForEn)
        .map(EnterpriseClusterDbContext::daasidNamedDatabaseId)
        .collect(Collectors.toList());
  }
}
