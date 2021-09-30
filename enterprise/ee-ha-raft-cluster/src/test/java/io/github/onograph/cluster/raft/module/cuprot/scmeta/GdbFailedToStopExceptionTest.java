package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class GdbFailedToStopExceptionTest {

  @Test
  void testConstructor() {
    GdbFailedToStopException actualGdbFailedToStopException = new GdbFailedToStopException("foo");
    assertNull(actualGdbFailedToStopException.getCause());
    assertEquals(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbFailedToStopException: foo",
        actualGdbFailedToStopException.toString());
    assertEquals(0, actualGdbFailedToStopException.getSuppressed().length);
    assertEquals("foo", actualGdbFailedToStopException.getMessage());
    assertEquals("foo", actualGdbFailedToStopException.getLocalizedMessage());
  }
}

