package io.github.onograph.dbms.crash;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.PanicEventGenerator;

class MarkPotentialCrashTest {

  @Test
  void testCraDbmsCrashManager() {
    PanicEventGenerator panicEventGenerator = mock(PanicEventGenerator.class);
    doNothing().when(panicEventGenerator).panic((Throwable) any());
    Database database = mock(Database.class);
    when(database.getDatabaseHealth()).thenReturn(
        new DatabaseHealth(panicEventGenerator, new BufferingLog()));
    DbmsCrashManager actualCraDbmsCrashManagerResult = MarkPotentialCrash.craDbmsCrashManager(
        database);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof MarkPotentialCrash);
    verify(database).getDatabaseHealth();
    verify(panicEventGenerator).panic((Throwable) any());
  }

  @Test
  void testCraDbmsCrashManager2() {
    Database database = mock(Database.class);
    when(database.getDatabaseHealth()).thenReturn(null);
    DbmsCrashManager actualCraDbmsCrashManagerResult = MarkPotentialCrash.craDbmsCrashManager(
        database);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof MarkPotentialCrash);
    verify(database).getDatabaseHealth();
  }

  @Test
  void testHandleCrash() {
    PanicEventGenerator panicEventGenerator = mock(PanicEventGenerator.class);
    doNothing().when(panicEventGenerator).panic((Throwable) any());
    Database database = mock(Database.class);
    when(database.getDatabaseHealth()).thenReturn(
        new DatabaseHealth(panicEventGenerator, new BufferingLog()));
    MarkPotentialCrash markPotentialCrash = new MarkPotentialCrash(database);
    markPotentialCrash
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    verify(database).getDatabaseHealth();
    verify(panicEventGenerator).panic((Throwable) any());
  }

  @Test
  void testHandleCrash2() {
    Database database = mock(Database.class);
    when(database.getDatabaseHealth()).thenReturn(null);
    MarkPotentialCrash markPotentialCrash = new MarkPotentialCrash(database);
    markPotentialCrash
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    verify(database).getDatabaseHealth();
  }
}

