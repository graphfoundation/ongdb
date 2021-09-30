package io.github.onograph.dbms;

import org.neo4j.graphdb.event.DatabaseEventContext;
import org.neo4j.graphdb.event.DatabaseEventListenerAdapter;
import org.neo4j.kernel.monitoring.PanicDatabaseEvent;


public class CrashDatabaseEventListenerAdapter extends DatabaseEventListenerAdapter {


  private final DbmsManagerWatchTagImpl qoDbmsManagerWatchTagImpl;

  CrashDatabaseEventListenerAdapter(DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl) {
    this.qoDbmsManagerWatchTagImpl = _oqDbmsManagerWatchTagImpl;
  }

  @Override
  public void databasePanic(DatabaseEventContext _databaseEventContext) {

    PanicDatabaseEvent _panicDatabaseEvent = (PanicDatabaseEvent) _databaseEventContext;
    this.qoDbmsManagerWatchTagImpl.stpopiForNaTh(_panicDatabaseEvent.getDatabaseId(),
        _panicDatabaseEvent.getCauseOfPanic());
  }
}
