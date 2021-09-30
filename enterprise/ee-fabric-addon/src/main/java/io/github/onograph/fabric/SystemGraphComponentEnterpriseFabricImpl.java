package io.github.onograph.fabric;

import io.github.onograph.dbms.SystemGraphComponentEnterpriseImpl;
import org.neo4j.configuration.Config;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.graphdb.GraphDatabaseService;


public class SystemGraphComponentEnterpriseFabricImpl extends SystemGraphComponentEnterpriseImpl {


  private final FabricDatabaseManager fabricDatabaseManager;

  public SystemGraphComponentEnterpriseFabricImpl(Config _config,
      FabricDatabaseManager _fabricDatabaseManager) {
    super(_config);
    this.fabricDatabaseManager = _fabricDatabaseManager;
  }

  @Override
  protected void postInitialization(GraphDatabaseService _sseGraphDatabaseService, boolean _isIw) {
    this.fabricDatabaseManager.manageFabricDatabases(_sseGraphDatabaseService, !_isIw);
  }
}
