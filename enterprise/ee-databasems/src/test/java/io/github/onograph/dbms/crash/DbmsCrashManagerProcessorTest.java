package io.github.onograph.dbms.crash;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class DbmsCrashManagerProcessorTest {

  @Test
  void testCraDbmsCrashManager() {
    Database database = mock(Database.class);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    FakeClock clock = Clocks.fakeClock();
    BufferingLog log = new BufferingLog();
    when(database.getDatabaseAvailabilityGuard()).thenReturn(
        new DatabaseAvailabilityGuard(namedDatabaseId, clock, log,
            1L, new CompositeDatabaseAvailabilityGuard(
            Clocks.fakeClock())));
    DbmsCrashManager actualCraDbmsCrashManagerResult = DbmsCrashManagerProcessor.craDbmsCrashManager(
        database);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof DbmsCrashManagerProcessor);
    verify(database).getDatabaseAvailabilityGuard();
  }

  @Test
  void testCraDbmsCrashManager2() {
    Database database = mock(Database.class);
    when(database.getDatabaseAvailabilityGuard()).thenReturn(null);
    DbmsCrashManager actualCraDbmsCrashManagerResult = DbmsCrashManagerProcessor.craDbmsCrashManager(
        database);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof DbmsCrashManagerProcessor);
    verify(database).getDatabaseAvailabilityGuard();
  }

  @Test
  void testCraDbmsCrashManager3() {
    DatabaseAvailabilityGuard databaseAvailabilityGuard = mock(DatabaseAvailabilityGuard.class);
    doNothing().when(databaseAvailabilityGuard)
        .require((org.neo4j.kernel.availability.AvailabilityRequirement) any());
    Database database = mock(Database.class);
    when(database.getDatabaseAvailabilityGuard()).thenReturn(databaseAvailabilityGuard);
    DbmsCrashManager actualCraDbmsCrashManagerResult = DbmsCrashManagerProcessor.craDbmsCrashManager(
        database);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof DbmsCrashManagerProcessor);
    verify(database).getDatabaseAvailabilityGuard();
    verify(databaseAvailabilityGuard).require(
        (org.neo4j.kernel.availability.AvailabilityRequirement) any());
  }

  @Test
  void testHandleCrash() {
    Database database = mock(Database.class);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    FakeClock clock = Clocks.fakeClock();
    BufferingLog log = new BufferingLog();
    when(database.getDatabaseAvailabilityGuard()).thenReturn(
        new DatabaseAvailabilityGuard(namedDatabaseId, clock, log,
            1L, new CompositeDatabaseAvailabilityGuard(
            Clocks.fakeClock())));
    DbmsCrashManagerProcessor dbmsCrashManagerProcessor = new DbmsCrashManagerProcessor(database);
    dbmsCrashManagerProcessor
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    verify(database).getDatabaseAvailabilityGuard();
  }

  @Test
  void testHandleCrash2() {
    Database database = mock(Database.class);
    when(database.getDatabaseAvailabilityGuard()).thenReturn(null);
    DbmsCrashManagerProcessor dbmsCrashManagerProcessor = new DbmsCrashManagerProcessor(database);
    dbmsCrashManagerProcessor
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    verify(database).getDatabaseAvailabilityGuard();
  }

  @Test
  void testHandleCrash3() {
    DatabaseAvailabilityGuard databaseAvailabilityGuard = mock(DatabaseAvailabilityGuard.class);
    doNothing().when(databaseAvailabilityGuard)
        .require((org.neo4j.kernel.availability.AvailabilityRequirement) any());
    Database database = mock(Database.class);
    when(database.getDatabaseAvailabilityGuard()).thenReturn(databaseAvailabilityGuard);
    DbmsCrashManagerProcessor dbmsCrashManagerProcessor = new DbmsCrashManagerProcessor(database);
    dbmsCrashManagerProcessor
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
    verify(database).getDatabaseAvailabilityGuard();
    verify(databaseAvailabilityGuard).require(
        (org.neo4j.kernel.availability.AvailabilityRequirement) any());
  }
}

