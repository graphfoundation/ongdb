package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager;
import io.github.onograph.cluster.raft.shared.AbstractClusterModule;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.facade.DatabaseManagementServiceFactory;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.impl.factory.DbmsInfo;


public class ReadReplicaDatabaseManagementServiceWrapper {


  private final DatabaseManagementService databaseManagementService;


  public ReadReplicaDatabaseManagementServiceWrapper(Config _config,
      ExternalDependencies _externalDependencies,
      io.github.onograph.cluster.raft.readreplica.ReadReplicaDatabaseManagementServiceWrapper.AbstractClusterModuleReadReplicaBuilder _fmeAbstractClusterModuleReadReplicaBuilder,
      ClusterDiscoveryManager _fsdClusterDiscoveryManager) {
    this.databaseManagementService = this.cremgtsiDatabaseManagementService(_config,
        _externalDependencies, _fmeAbstractClusterModuleReadReplicaBuilder,
        _fsdClusterDiscoveryManager);
  }


  protected DatabaseManagementService cremgtsiDatabaseManagementService(Config _config,
      ExternalDependencies _externalDependencies,
      io.github.onograph.cluster.raft.readreplica.ReadReplicaDatabaseManagementServiceWrapper.AbstractClusterModuleReadReplicaBuilder _fmeAbstractClusterModuleReadReplicaBuilder,
      ClusterDiscoveryManager _fsdClusterDiscoveryManager) {
    return (new DatabaseManagementServiceFactory(DbmsInfo.READ_REPLICA, (globalModule) ->
    {
      return _fmeAbstractClusterModuleReadReplicaBuilder.craAbstractClusterModule(
          _fsdClusterDiscoveryManager, globalModule);
    })).build(_config, _externalDependencies);
  }


  public DatabaseManagementService getDatabaseManagementService() {
    return this.databaseManagementService;
  }


  public interface AbstractClusterModuleReadReplicaBuilder {


    AbstractClusterModule craAbstractClusterModule(ClusterDiscoveryManager _clusterDiscoveryManager,
        GlobalModule _globalModule);
  }
}
