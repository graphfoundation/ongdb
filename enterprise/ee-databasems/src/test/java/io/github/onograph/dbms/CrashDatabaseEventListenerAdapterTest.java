package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.monitoring.PanicDatabaseEvent;

class CrashDatabaseEventListenerAdapterTest {

  @Test
  void testDatabasePanic() {
    DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl = mock(DbmsManagerWatchTagImpl.class);
    doNothing().when(dbmsManagerWatchTagImpl)
        .stpopiForNaTh((NamedDatabaseId) any(), (Throwable) any());
    CrashDatabaseEventListenerAdapter crashDatabaseEventListenerAdapter = new CrashDatabaseEventListenerAdapter(
        dbmsManagerWatchTagImpl);
    NamedDatabaseId databaseId = mock(NamedDatabaseId.class);
    PanicDatabaseEvent panicDatabaseEvent = new PanicDatabaseEvent(databaseId, new Throwable());

    crashDatabaseEventListenerAdapter.databasePanic(panicDatabaseEvent);
    verify(dbmsManagerWatchTagImpl).stpopiForNaTh((NamedDatabaseId) any(), (Throwable) any());
    assertNull(panicDatabaseEvent.getDatabaseName());
  }
}

