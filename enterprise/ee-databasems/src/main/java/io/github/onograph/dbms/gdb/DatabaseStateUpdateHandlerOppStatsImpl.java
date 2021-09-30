package io.github.onograph.dbms.gdb;

import io.github.onograph.dbms.DatabaseStateUpdateHandler;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.database.DatabaseOperationCounts.Counter;


public class DatabaseStateUpdateHandlerOppStatsImpl implements DatabaseStateUpdateHandler {


  private final Counter counter;

  public DatabaseStateUpdateHandlerOppStatsImpl(Counter _counter) {
    this.counter = _counter;
  }

  @Override
  public void sttchgForDaDa(DatabaseState _spDatabaseState, DatabaseState _snDatabaseState) {

    boolean _isFp = _spDatabaseState.hasFailed();

    boolean _isFn = _snDatabaseState.hasFailed();
    if (!_isFp && _isFn) {
      this.counter.increaseFailedCount();
    } else if (_isFp && !_isFn) {
      this.counter.increaseRecoveredCount();
    }
  }
}
