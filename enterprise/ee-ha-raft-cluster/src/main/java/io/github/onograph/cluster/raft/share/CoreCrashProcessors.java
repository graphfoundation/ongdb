package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.meta.ActionProcessManager;
import io.github.onograph.cluster.raft.shared.GdbCrashServiceAdapter;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.crash.CrashManager;
import io.github.onograph.dbms.crash.DbmsCrashManager;
import io.github.onograph.dbms.crash.DbmsCrashManagerProcessor;
import io.github.onograph.dbms.crash.DbmsCrashManagerSystemGdbImpl;
import io.github.onograph.dbms.crash.MarkPotentialCrash;
import io.github.onograph.dbms.crash.ShutdownDbmsManager;
import java.util.List;
import org.neo4j.kernel.database.Database;


class CoreCrashProcessors extends GdbCrashServiceAdapter {

  CoreCrashProcessors(ActionProcessManager _apActionProcessManager,
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      ConsensusOperationsManager consensusOperationsManager, CrashManager crashManager,
      Database _kreDatabase, DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl) {
    super(crashManager,
        _paeheList(_asdDatabaseStartupControllerAbortableImpl, consensusOperationsManager,
            crashManager, _kreDatabase, _oqDbmsManagerWatchTagImpl,
            _apActionProcessManager),
        _kreDatabase.getNamedDatabaseId());
  }


  private static List<DbmsCrashManager> _paeheList(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      ConsensusOperationsManager consensusOperationsManager, CrashManager crashManager,
      Database _kreDatabase, DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl,
      ActionProcessManager _paActionProcessManager) {
    return List.of(DbmsCrashManagerProcessor.craDbmsCrashManager(_kreDatabase),
        MarkPotentialCrash.craDbmsCrashManager(_kreDatabase),
        _paActionProcessManager, consensusOperationsManager,
        _asdDatabaseStartupControllerAbortableImpl,
        ShutdownDbmsManager.craDbmsCrashManager(_oqDbmsManagerWatchTagImpl),
        DbmsCrashManagerSystemGdbImpl.craDbmsCrashManager(crashManager.paieCrashSignaler()));
  }
}
