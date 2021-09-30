package io.github.onograph.dbms.crash;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class GdbCrashEventTest {

  @Test
  void testConstructor() {
    Throwable throwable = (new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
        GdbCrashCauseInfo.CCI_IT)).casThrowable;
    assertEquals("java.lang.Throwable", throwable.toString());
    assertNull(throwable.getMessage());
    assertNull(throwable.getLocalizedMessage());
    assertNull(throwable.getCause());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT)).equals(null));
    assertFalse(
        (new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class), GdbCrashCauseInfo.CCI_IT))
            .equals("Different type to GdbCrashEvent"));
  }

  @Test
  void testEquals2() {
    GdbCrashEvent gdbCrashEvent = new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
        GdbCrashCauseInfo.CCI_IT);
    assertTrue(gdbCrashEvent.equals(gdbCrashEvent));
    int expectedHashCodeResult = gdbCrashEvent.hashCode();
    assertEquals(expectedHashCodeResult, gdbCrashEvent.hashCode());
  }

  @Test
  void testEquals3() {
    GdbCrashEvent gdbCrashEvent = new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
        GdbCrashCauseInfo.CCI_IT);
    assertFalse(gdbCrashEvent
        .equals(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT)));
  }
}

