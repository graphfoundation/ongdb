package io.github.onograph.dbms.crash;

import org.neo4j.kernel.database.Database;
import org.neo4j.monitoring.DatabaseHealth;


public final class MarkPotentialCrash implements DbmsCrashManager {


  private final Database dDatabase;

  MarkPotentialCrash(Database _dDatabase) {
    this.dDatabase = _dDatabase;
  }


  public static DbmsCrashManager craDbmsCrashManager(Database _dDatabase) {
    return new MarkPotentialCrash(_dDatabase);
  }

  @Override
  public void handleCrash(GdbCrashEvent _pncGdbCrashEvent) {

    DatabaseHealth _hdDatabaseHealth = this.dDatabase.getDatabaseHealth();
    if (_hdDatabaseHealth != null) {
      _hdDatabaseHealth.panic(_pncGdbCrashEvent.gecsThrowable());
    }
  }
}
