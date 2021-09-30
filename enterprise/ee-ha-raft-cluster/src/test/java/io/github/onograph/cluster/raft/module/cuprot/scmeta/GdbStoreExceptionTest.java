package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class GdbStoreExceptionTest {

  @Test
  void testConstructor() {
    GdbStoreException actualGdbStoreException = new GdbStoreException("foo");
    assertNull(actualGdbStoreException.getCause());
    assertEquals("io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException: foo",
        actualGdbStoreException.toString());
    assertEquals(0, actualGdbStoreException.getSuppressed().length);
    assertEquals("foo", actualGdbStoreException.getMessage());
    assertEquals("foo", actualGdbStoreException.getLocalizedMessage());
  }

  @Test
  void testConstructor2() {
    Throwable throwable = new Throwable();
    GdbStoreException actualGdbStoreException = new GdbStoreException(throwable);
    Throwable cause = actualGdbStoreException.getCause();
    assertSame(throwable, cause);
    assertEquals(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException: java.lang.Throwable",
        actualGdbStoreException.toString());
    assertEquals("java.lang.Throwable", actualGdbStoreException.getLocalizedMessage());
    Throwable[] suppressed = actualGdbStoreException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("java.lang.Throwable", actualGdbStoreException.getMessage());
    assertNull(cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Throwable", cause.toString());
    assertNull(cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, throwable);
  }

  @Test
  void testConstructor3() {
    Throwable throwable = new Throwable();
    GdbStoreException actualGdbStoreException = new GdbStoreException(throwable, "foo");

    Throwable cause = actualGdbStoreException.getCause();
    assertSame(throwable, cause);
    assertEquals("io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException: foo",
        actualGdbStoreException.toString());
    assertEquals("foo", actualGdbStoreException.getLocalizedMessage());
    Throwable[] suppressed = actualGdbStoreException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("foo", actualGdbStoreException.getMessage());
    assertNull(cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Throwable", cause.toString());
    assertNull(cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, throwable);
  }
}

