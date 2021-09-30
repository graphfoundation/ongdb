package io.github.onograph.cluster.raft.module.dprot.dprocs;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses;
import io.github.onograph.config.NodeGroupIdentifier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class LocalClusterInfoBasicProcedure extends ClusterInfoBasicProcedure {


  private final Config config;


  private final DatabaseManager<?> databaseManagerMdObject;


  private final ServerId serverId;


  public LocalClusterInfoBasicProcedure(Config _config, DatabaseManager<?> _databaseManagerMdObject,
      ServerId _serverId) {
    this.config = _config;
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.serverId = _serverId;
  }

  @Override
  protected List<io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper> prcrurwList() {

    DiscoverySocketAddresses _acDiscoverySocketAddresses = DiscoverySocketAddresses.frmcngDiscoverySocketAddresses(
        this.config);

    Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = Set.copyOf(
        (Collection) this.config.get(SettingsDeclarationClusterImpl.settingSevguList));

    Map<NamedDatabaseId, ClusterNodeRoleType> _mapDtbssnc =
        this.databaseManagerMdObject.registeredDatabases().keySet().stream()
            .collect(Collectors.toMap(Function.identity(), (ignored) ->
            {
              return ClusterNodeRoleType.LEADER;
            }));

    io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper _rrComparableInfoWrapper =
        new io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.ComparableInfoWrapper(
            _acDiscoverySocketAddresses,
            this.serverId.uuid(),
            _mapDtbssnc,
            _setGopNodeGroupIdentifier);
    return List.of(_rrComparableInfoWrapper);
  }
}
