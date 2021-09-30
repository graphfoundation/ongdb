package io.github.onograph.dbms.crash;

import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;


public final class DbmsCrashManagerProcessor implements DbmsCrashManager {


  private static final String PAI_REUEN_MSX = io.github.onograph.I18N.format(
      "io.github.onograph.dbms.crash.DbmsCrashManagerProcessor.var");


  private final Database dDatabase;

  DbmsCrashManagerProcessor(Database _dDatabase) {
    this.dDatabase = _dDatabase;
  }


  public static DbmsCrashManager craDbmsCrashManager(Database _dDatabase) {
    return new DbmsCrashManagerProcessor(_dDatabase);
  }

  @Override
  public void handleCrash(GdbCrashEvent _pncGdbCrashEvent) {

    DatabaseAvailabilityGuard _gadDatabaseAvailabilityGuard = this.dDatabase.getDatabaseAvailabilityGuard();
    if (_gadDatabaseAvailabilityGuard != null) {
      _gadDatabaseAvailabilityGuard.require(() ->
      {
        return io.github.onograph.I18N.format(
            "io.github.onograph.dbms.crash.DbmsCrashManagerProcessor.handleCrash",
            _pncGdbCrashEvent.gecsThrowable().getMessage());
      });
    }
  }
}
