package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class FilterExceptionTest {

  @Test
  void testConstructor() {
    NumberFormatException numberFormatException = new NumberFormatException("foo");
    FilterException actualFilterException = new FilterException(numberFormatException, "foo");

    Throwable cause = actualFilterException.getCause();
    assertSame(numberFormatException, cause);
    assertEquals("io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException: foo",
        actualFilterException.toString());
    assertEquals("foo", actualFilterException.getLocalizedMessage());
    Throwable[] suppressed = actualFilterException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("foo", actualFilterException.getMessage());
    assertEquals("foo", cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.NumberFormatException: foo", cause.toString());
    assertEquals("foo", cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, numberFormatException);
  }

  @Test
  void testConstructor2() {
    FilterException actualFilterException = new FilterException("foo");
    assertNull(actualFilterException.getCause());
    assertEquals("io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException: foo",
        actualFilterException.toString());
    assertEquals(0, actualFilterException.getSuppressed().length);
    assertEquals("foo", actualFilterException.getMessage());
    assertEquals("foo", actualFilterException.getLocalizedMessage());
  }
}

