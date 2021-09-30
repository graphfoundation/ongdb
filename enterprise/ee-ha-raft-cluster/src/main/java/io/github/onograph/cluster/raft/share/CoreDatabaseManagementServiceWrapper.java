package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager;
import io.github.onograph.cluster.raft.shared.AbstractClusterModule;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.facade.DatabaseManagementServiceFactory;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.impl.factory.DbmsInfo;


public class CoreDatabaseManagementServiceWrapper {


  private final DatabaseManagementService databaseManagementService;


  public CoreDatabaseManagementServiceWrapper(Config _config,
      io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper.CoreClusterModuleBuilder _emfCoreClusterModuleBuilder,
      ExternalDependencies _externalDependencies,
      ClusterDiscoveryManager _fsdClusterDiscoveryManager) {
    this.databaseManagementService =
        this.cremgtsiDatabaseManagementService(_config, _fsdClusterDiscoveryManager,
            _externalDependencies, _emfCoreClusterModuleBuilder);
  }


  protected DatabaseManagementService cremgtsiDatabaseManagementService(Config _config,
      ClusterDiscoveryManager _dsfClusterDiscoveryManager,
      ExternalDependencies _externalDependencies,
      io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper.CoreClusterModuleBuilder _fmeCoreClusterModuleBuilder) {
    return (new DatabaseManagementServiceFactory(DbmsInfo.CORE, (globalModule) ->
    {
      return _fmeCoreClusterModuleBuilder.craAbstractClusterModule(_dsfClusterDiscoveryManager,
          globalModule);
    })).build(_config, _externalDependencies);
  }


  public DatabaseManagementService getDatabaseManagementService() {
    return this.databaseManagementService;
  }


  public interface CoreClusterModuleBuilder {


    AbstractClusterModule craAbstractClusterModule(ClusterDiscoveryManager _clusterDiscoveryManager,
        GlobalModule _globalModule);
  }
}
