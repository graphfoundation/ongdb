package io.github.onograph.cluster.raft.utils;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.internal.GraphDatabaseAPI;


public class GdbUtilWrapper implements AutoCloseable {


  private final DatabaseManagementService databaseManagementService;


  private final GraphDatabaseAPI graphDatabaseAPI;

  public GdbUtilWrapper(DatabaseManagementService _databaseManagementService, boolean _isSi) {

    String gdbName =
        _isSi ? io.github.onograph.TokenConstants.SYSTEM : io.github.onograph.TokenConstants.NEO4J;
    this.databaseManagementService = _databaseManagementService;
    this.graphDatabaseAPI = (GraphDatabaseAPI) _databaseManagementService.database(gdbName);
  }

  @Override
  public void close() {
    this.databaseManagementService.shutdown();
  }


  public DatabaseLayout daadrrDatabaseLayout() {
    return this.graphDatabaseAPI.databaseLayout();
  }


  public GraphDatabaseService getGraphDatabaseAPI() {
    return this.graphDatabaseAPI;
  }
}
