package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class MessageSizeExceptionTest {

  @Test
  void testConstructor() {
    MessageSizeException actualMessageSizeException = new MessageSizeException("foo");
    assertNull(actualMessageSizeException.getCause());
    assertEquals("io.github.onograph.cluster.raft.akkamsg.MessageSizeException: foo",
        actualMessageSizeException.toString());
    assertEquals(0, actualMessageSizeException.getSuppressed().length);
    assertEquals("foo", actualMessageSizeException.getMessage());
    assertEquals("foo", actualMessageSizeException.getLocalizedMessage());
  }
}

