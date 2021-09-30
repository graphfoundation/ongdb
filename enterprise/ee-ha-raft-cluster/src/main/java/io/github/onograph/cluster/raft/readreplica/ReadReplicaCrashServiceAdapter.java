package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.shared.GdbCrashServiceAdapter;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.crash.CrashManager;
import io.github.onograph.dbms.crash.DbmsCrashManager;
import io.github.onograph.dbms.crash.DbmsCrashManagerProcessor;
import io.github.onograph.dbms.crash.MarkPotentialCrash;
import io.github.onograph.dbms.crash.ShutdownDbmsManager;
import java.util.List;
import org.neo4j.kernel.database.Database;


public class ReadReplicaCrashServiceAdapter extends GdbCrashServiceAdapter {

  public ReadReplicaCrashServiceAdapter(CrashManager crashManager,
      DatabaseStartupControllerAbortableImpl _dsaDatabaseStartupControllerAbortableImpl,
      Database _kreDatabase, DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl) {
    super(crashManager, _paeheList(_dsaDatabaseStartupControllerAbortableImpl, _kreDatabase,
            _oqDbmsManagerWatchTagImpl),
        _kreDatabase.getNamedDatabaseId());
  }


  private static List<DbmsCrashManager> _paeheList(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      Database _kreDatabase, DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl) {
    return List.of(DbmsCrashManagerProcessor.craDbmsCrashManager(_kreDatabase),
        MarkPotentialCrash.craDbmsCrashManager(_kreDatabase),
        _asdDatabaseStartupControllerAbortableImpl,
        ShutdownDbmsManager.craDbmsCrashManager(_oqDbmsManagerWatchTagImpl));
  }
}
