package io.github.onograph.server;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;
import org.neo4j.server.CommunityBootstrapper;


public class EnhancedBootstrapper extends CommunityBootstrapper {

  @Override
  protected DatabaseManagementService createNeo(Config _config,
      GraphDatabaseDependencies _graphDatabaseDependencies) {
    return DefaultDatabaseManagementServiceBuilder.cremgtsiDatabaseManagementService(_config,
        _graphDatabaseDependencies);
  }
}
