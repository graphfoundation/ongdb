package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ServerExceptionTest {

  @Test
  void testConstructor() {
    ServerException actualServerException = new ServerException("foo",
        ComProFamilyWrapper.bulrComProFamilyWrapperComProFamilyBuilder());

    assertNull(actualServerException.getCause());
    assertEquals(0, actualServerException.getSuppressed().length);
  }

  @Test
  void testConstructor2() {
    ServerException actualServerException = new ServerException(
        "io.github.onograph.cluster.raft.control.connect.ServerException.super",
        ComProFamilyWrapper.bulrComProFamilyWrapperComProFamilyBuilder());

    assertNull(actualServerException.getCause());
    assertEquals(0, actualServerException.getSuppressed().length);
  }

  @Test
  void testConstructor3() {
    ServerException actualServerException = new ServerException("foo", null);

    assertNull(actualServerException.getCause());
    assertEquals(
        "io.github.onograph.cluster.raft.control.connect.ServerException: foo Negotiated protocols:"
            + " null",
        actualServerException.toString());
    assertEquals(0, actualServerException.getSuppressed().length);
    assertEquals("foo Negotiated protocols: null", actualServerException.getMessage());
    assertEquals("foo Negotiated protocols: null", actualServerException.getLocalizedMessage());
  }
}

