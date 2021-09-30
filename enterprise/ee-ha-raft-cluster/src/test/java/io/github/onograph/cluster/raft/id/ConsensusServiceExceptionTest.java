package io.github.onograph.cluster.raft.id;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class ConsensusServiceExceptionTest {

  @Test
  void testConstructor() {
    ConsensusServiceException actualConsensusServiceException = new ConsensusServiceException(
        "foo");
    assertNull(actualConsensusServiceException.getCause());
    assertEquals("io.github.onograph.cluster.raft.id.ConsensusServiceException: foo",
        actualConsensusServiceException.toString());
    assertEquals(0, actualConsensusServiceException.getSuppressed().length);
    assertEquals("foo", actualConsensusServiceException.getMessage());
    assertEquals("foo", actualConsensusServiceException.getLocalizedMessage());
  }

  @Test
  void testConstructor2() {
    Throwable throwable = new Throwable();
    ConsensusServiceException actualConsensusServiceException = new ConsensusServiceException(
        throwable, "foo");

    Throwable cause = actualConsensusServiceException.getCause();
    assertSame(throwable, cause);
    assertEquals("io.github.onograph.cluster.raft.id.ConsensusServiceException: foo",
        actualConsensusServiceException.toString());
    assertEquals("foo", actualConsensusServiceException.getLocalizedMessage());
    Throwable[] suppressed = actualConsensusServiceException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("foo", actualConsensusServiceException.getMessage());
    assertNull(cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Throwable", cause.toString());
    assertNull(cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, throwable);
  }
}

