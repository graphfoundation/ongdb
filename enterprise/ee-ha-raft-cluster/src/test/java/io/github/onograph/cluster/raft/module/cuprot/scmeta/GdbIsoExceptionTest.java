package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class GdbIsoExceptionTest {

  @Test
  void testConstructor() {
    Exception exception = new Exception("An error occurred");
    GdbIsoException actualGdbIsoException = new GdbIsoException(exception);
    Throwable cause = actualGdbIsoException.getCause();
    assertSame(exception, cause);
    assertEquals(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException: java.lang.Exception: An"
            + " error occurred", actualGdbIsoException.toString());
    assertEquals("java.lang.Exception: An error occurred",
        actualGdbIsoException.getLocalizedMessage());
    Throwable[] suppressed = actualGdbIsoException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("java.lang.Exception: An error occurred", actualGdbIsoException.getMessage());
    assertEquals("An error occurred", cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Exception: An error occurred", cause.toString());
    assertEquals("An error occurred", cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, exception);
  }

  @Test
  void testConstructor2() {
    Exception exception = new Exception("An error occurred");
    GdbIsoException actualGdbIsoException = new GdbIsoException(exception, "foo");

    Throwable cause = actualGdbIsoException.getCause();
    assertSame(exception, cause);
    assertEquals("io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException: foo",
        actualGdbIsoException.toString());
    assertEquals("foo", actualGdbIsoException.getLocalizedMessage());
    Throwable[] suppressed = actualGdbIsoException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("foo", actualGdbIsoException.getMessage());
    assertEquals("An error occurred", cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Exception: An error occurred", cause.toString());
    assertEquals("An error occurred", cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, exception);
  }

  @Test
  void testConstructor3() {
    GdbIsoException actualGdbIsoException = new GdbIsoException(
        "The characteristics of someone or something");
    assertNull(actualGdbIsoException.getCause());
    assertEquals(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException: The characteristics of"
            + " someone or something", actualGdbIsoException.toString());
    assertEquals(0, actualGdbIsoException.getSuppressed().length);
    assertEquals("The characteristics of someone or something", actualGdbIsoException.getMessage());
    assertEquals("The characteristics of someone or something",
        actualGdbIsoException.getLocalizedMessage());
  }
}

