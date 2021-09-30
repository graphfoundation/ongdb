package io.github.onograph.dbms;

import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.DbmsRuntimeRepository;
import org.neo4j.dbms.database.DbmsRuntimeSystemGraphComponent;


public class DbmsRuntimeRepositoryClusterImpl extends DbmsRuntimeRepository implements
    io.github.onograph.dbms.GdbReplicator.ListenEvents {

  public DbmsRuntimeRepositoryClusterImpl(DatabaseManager<?> _databaseManagerMdObject,
      DbmsRuntimeSystemGraphComponent _dbmsRuntimeSystemGraphComponent) {
    super(_databaseManagerMdObject, _dbmsRuntimeSystemGraphComponent);
  }


  private void _mauesefsmdb() {
    if (!this.getVersion().isCurrent()) {
      this.fetchStateFromSystemDatabase();
    }
  }

  @Override
  public void strread(long transIdx) {
    this._mauesefsmdb();
  }

  @Override
  public void tranci(long transIdx) {
    this._mauesefsmdb();
  }
}
