package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class GdbStoreSyncCrlExceptionTest {

  @Test
  void testConstructor() {
    Exception exception = new Exception("An error occurred");
    GdbStoreSyncCrlException actualGdbStoreSyncCrlException = new GdbStoreSyncCrlException(
        exception, "foo");

    Throwable cause = actualGdbStoreSyncCrlException.getCause();
    assertSame(exception, cause);
    assertEquals(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException: foo",
        actualGdbStoreSyncCrlException.toString());
    assertEquals("foo", actualGdbStoreSyncCrlException.getLocalizedMessage());
    Throwable[] suppressed = actualGdbStoreSyncCrlException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("foo", actualGdbStoreSyncCrlException.getMessage());
    assertEquals("An error occurred", cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Exception: An error occurred", cause.toString());
    assertEquals("An error occurred", cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, exception);
  }

  @Test
  void testConstructor2() {
    GdbStoreSyncCrlException actualGdbStoreSyncCrlException = new GdbStoreSyncCrlException("foo");
    assertNull(actualGdbStoreSyncCrlException.getCause());
    assertEquals(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException: foo",
        actualGdbStoreSyncCrlException.toString());
    assertEquals(0, actualGdbStoreSyncCrlException.getSuppressed().length);
    assertEquals("foo", actualGdbStoreSyncCrlException.getMessage());
    assertEquals("foo", actualGdbStoreSyncCrlException.getLocalizedMessage());
  }

  @Test
  void testConstructor3() {
    Throwable throwable = new Throwable();
    GdbStoreSyncCrlException actualGdbStoreSyncCrlException = new GdbStoreSyncCrlException(
        throwable);
    Throwable cause = actualGdbStoreSyncCrlException.getCause();
    assertSame(throwable, cause);
    assertEquals(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException: java.lang"
            + ".Throwable", actualGdbStoreSyncCrlException.toString());
    assertEquals("java.lang.Throwable", actualGdbStoreSyncCrlException.getLocalizedMessage());
    Throwable[] suppressed = actualGdbStoreSyncCrlException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("java.lang.Throwable", actualGdbStoreSyncCrlException.getMessage());
    assertNull(cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Throwable", cause.toString());
    assertNull(cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, throwable);
  }
}

