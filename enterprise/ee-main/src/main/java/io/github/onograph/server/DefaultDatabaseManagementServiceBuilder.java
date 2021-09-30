package io.github.onograph.server;

import io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl;
import io.github.onograph.cluster.raft.readreplica.ReadReplicaDatabaseManagementServiceWrapper;
import io.github.onograph.cluster.raft.readreplica.ReadReplicaModule;
import io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper;
import io.github.onograph.cluster.raft.share.CoreModule;
import io.github.onograph.module.edition.DefaultEnterpriseModule;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.facade.DatabaseManagementServiceFactory;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.kernel.impl.factory.DbmsInfo;


public class DefaultDatabaseManagementServiceBuilder {

  private DefaultDatabaseManagementServiceBuilder() {
  }


  private static ClusterDiscoveryManagerAkkaImpl _nedsrsvfayClusterDiscoveryManagerAkkaImpl() {
    return new ClusterDiscoveryManagerAkkaImpl();
  }


  public static DatabaseManagementService cremgtsiDatabaseManagementService(Config _config,
      ExternalDependencies _externalDependencies) {

    Mode mdstr = _config.get(GraphDatabaseSettings.mode);
    switch (mdstr) {
      case CORE:
        return (new CoreDatabaseManagementServiceWrapper(_config, CoreModule::new,
            _externalDependencies,
            _nedsrsvfayClusterDiscoveryManagerAkkaImpl())).getDatabaseManagementService();
      case READ_REPLICA:
        return (new ReadReplicaDatabaseManagementServiceWrapper(_config, _externalDependencies,
            ReadReplicaModule::new,
            _nedsrsvfayClusterDiscoveryManagerAkkaImpl())).getDatabaseManagementService();
      case SINGLE:
        return (new DatabaseManagementServiceFactory(DbmsInfo.ENTERPRISE,
            DefaultEnterpriseModule::new)).build(_config, _externalDependencies);
      default:

        throw new IllegalArgumentException("*** Error: 98965b01-b02a-4061-b662-def606dd7291");
    }
  }
}
