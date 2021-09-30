package io.github.onograph.dbms.service;

import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import java.util.List;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.common.DependencyResolver;
import org.neo4j.dbms.api.DatabaseExistsException;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.config.Configuration;
import org.neo4j.graphdb.event.DatabaseEventListener;
import org.neo4j.graphdb.event.TransactionEventListener;
import org.neo4j.kernel.internal.GraphDatabaseAPI;


@PublicApi
public class DatabaseManagementServiceClusterImpl implements DatabaseManagementService {


  private final DatabaseManagementService dlgtDatabaseManagementService;

  public DatabaseManagementServiceClusterImpl(
      DatabaseManagementService _dlgtDatabaseManagementService) {
    this.dlgtDatabaseManagementService = _dlgtDatabaseManagementService;
  }

  @Override
  public void createDatabase(String gdbName, Configuration _dssConfiguration)
      throws DatabaseExistsException {
    this.dlgtDatabaseManagementService.createDatabase(gdbName);
  }

  @Override
  public GraphDatabaseService database(String gdbName) throws DatabaseNotFoundException {
    return this.dlgtDatabaseManagementService.database(gdbName);
  }

  @Override
  public void dropDatabase(String gdbName) throws DatabaseNotFoundException {
    this.dlgtDatabaseManagementService.dropDatabase(gdbName);
  }


  public boolean isWraeForSt(String gdbName) {

    GraphDatabaseAPI _ipadGraphDatabaseAPI = (GraphDatabaseAPI) this.database(gdbName);
    if (!_ipadGraphDatabaseAPI.isAvailable(0L)) {
      return false;
    } else {

      DependencyResolver _dependencyResolver = _ipadGraphDatabaseAPI.getDependencyResolver();
      return _dependencyResolver.containsDependency(ConsensusOperationsManager.class) &&
          _dependencyResolver.resolveDependency(ConsensusOperationsManager.class).isLee();
    }
  }

  @Override
  public List<String> listDatabases() {
    return this.dlgtDatabaseManagementService.listDatabases();
  }

  @Override
  public void registerDatabaseEventListener(DatabaseEventListener _databaseEventListener) {
    this.dlgtDatabaseManagementService.registerDatabaseEventListener(_databaseEventListener);
  }

  @Override
  public void registerTransactionEventListener(String gdbName,
      TransactionEventListener<?> _transactionEventListenerLseeObject) {
    this.dlgtDatabaseManagementService.registerTransactionEventListener(gdbName,
        _transactionEventListenerLseeObject);
  }

  @Override
  public void shutdown() {
    this.dlgtDatabaseManagementService.shutdown();
  }

  @Override
  public void shutdownDatabase(String gdbName) throws DatabaseNotFoundException {
    this.dlgtDatabaseManagementService.shutdownDatabase(gdbName);
  }

  @Override
  public void startDatabase(String gdbName) throws DatabaseNotFoundException {
    this.dlgtDatabaseManagementService.startDatabase(gdbName);
  }

  @Override
  public void unregisterDatabaseEventListener(DatabaseEventListener _databaseEventListener) {
    this.dlgtDatabaseManagementService.unregisterDatabaseEventListener(_databaseEventListener);
  }

  @Override
  public void unregisterTransactionEventListener(String gdbName,
      TransactionEventListener<?> _transactionEventListenerLseeObject) {
    this.dlgtDatabaseManagementService.unregisterTransactionEventListener(gdbName,
        _transactionEventListenerLseeObject);
  }
}
