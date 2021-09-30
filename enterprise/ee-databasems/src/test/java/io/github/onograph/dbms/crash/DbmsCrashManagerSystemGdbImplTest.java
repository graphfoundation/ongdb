package io.github.onograph.dbms.crash;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class DbmsCrashManagerSystemGdbImplTest {

  @Test
  void testConstructor() {

    new DbmsCrashManagerSystemGdbImpl(mock(CrashSignaler.class));
  }

  @Test
  void testCraDbmsCrashManager() {
    CrashSignaler crashSignaler = mock(CrashSignaler.class);
    doNothing().when(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    DbmsCrashManager actualCraDbmsCrashManagerResult = DbmsCrashManagerSystemGdbImpl.craDbmsCrashManager(
        crashSignaler);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.isSystemDatabase()).thenReturn(true);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(new Throwable(), namedDatabaseId, GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof DbmsCrashManagerSystemGdbImpl);
    verify(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    verify(namedDatabaseId).isSystemDatabase();
  }

  @Test
  void testCraDbmsCrashManager2() {
    CrashSignaler crashSignaler = mock(CrashSignaler.class);
    doNothing().when(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    DbmsCrashManager actualCraDbmsCrashManagerResult = DbmsCrashManagerSystemGdbImpl.craDbmsCrashManager(
        crashSignaler);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.isSystemDatabase()).thenReturn(false);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(new Throwable(), namedDatabaseId, GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof DbmsCrashManagerSystemGdbImpl);
    verify(namedDatabaseId).isSystemDatabase();
  }

  @Test
  void testCraDbmsCrashManager3() {
    CrashSignaler crashSignaler = mock(CrashSignaler.class);
    doNothing().when(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    DbmsCrashManager actualCraDbmsCrashManagerResult = DbmsCrashManagerSystemGdbImpl.craDbmsCrashManager(
        crashSignaler);
    Throwable throwable = new Throwable();
    throwable
        .setStackTrace(new StackTraceElement[]{
            new StackTraceElement("Declaring Class", "Method Name", "foo.txt", 2)});
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.isSystemDatabase()).thenReturn(true);
    actualCraDbmsCrashManagerResult
        .handleCrash(new GdbCrashEvent(throwable, namedDatabaseId, GdbCrashCauseInfo.CCI_IT));
    assertTrue(actualCraDbmsCrashManagerResult instanceof DbmsCrashManagerSystemGdbImpl);
    verify(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    verify(namedDatabaseId).isSystemDatabase();
  }

  @Test
  void testHandleCrash() {
    CrashSignaler crashSignaler = mock(CrashSignaler.class);
    doNothing().when(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    DbmsCrashManagerSystemGdbImpl dbmsCrashManagerSystemGdbImpl = new DbmsCrashManagerSystemGdbImpl(
        crashSignaler);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.isSystemDatabase()).thenReturn(true);
    dbmsCrashManagerSystemGdbImpl
        .handleCrash(new GdbCrashEvent(new Throwable(), namedDatabaseId, GdbCrashCauseInfo.CCI_IT));
    verify(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    verify(namedDatabaseId).isSystemDatabase();
  }

  @Test
  void testHandleCrash2() {
    CrashSignaler crashSignaler = mock(CrashSignaler.class);
    doNothing().when(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    DbmsCrashManagerSystemGdbImpl dbmsCrashManagerSystemGdbImpl = new DbmsCrashManagerSystemGdbImpl(
        crashSignaler);
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.isSystemDatabase()).thenReturn(false);
    dbmsCrashManagerSystemGdbImpl
        .handleCrash(new GdbCrashEvent(new Throwable(), namedDatabaseId, GdbCrashCauseInfo.CCI_IT));
    verify(namedDatabaseId).isSystemDatabase();
  }

  @Test
  void testHandleCrash3() {
    CrashSignaler crashSignaler = mock(CrashSignaler.class);
    doNothing().when(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    DbmsCrashManagerSystemGdbImpl dbmsCrashManagerSystemGdbImpl = new DbmsCrashManagerSystemGdbImpl(
        crashSignaler);

    Throwable throwable = new Throwable();
    throwable
        .setStackTrace(new StackTraceElement[]{
            new StackTraceElement("Declaring Class", "Method Name", "foo.txt", 2)});
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.isSystemDatabase()).thenReturn(true);
    dbmsCrashManagerSystemGdbImpl.handleCrash(
        new GdbCrashEvent(throwable, namedDatabaseId, GdbCrashCauseInfo.CCI_IT));
    verify(crashSignaler).signal((CrashSignaler.CrashEvent) any());
    verify(namedDatabaseId).isSystemDatabase();
  }
}

