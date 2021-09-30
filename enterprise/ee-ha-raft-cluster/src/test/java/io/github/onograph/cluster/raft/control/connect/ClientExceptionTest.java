package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.ArrayList;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.helpers.collection.Pair;

class ClientExceptionTest {

  @Test
  void testConstructor() {
    ClientException actualClientException = new ClientException("foo");
    assertNull(actualClientException.getCause());
    assertEquals("io.github.onograph.cluster.raft.control.connect.ClientException: foo",
        actualClientException.toString());
    assertEquals(0, actualClientException.getSuppressed().length);
    assertEquals("foo", actualClientException.getMessage());
    assertEquals("foo", actualClientException.getLocalizedMessage());
  }

  @Test
  void testConstructor2() {
    ArrayList<Pair<String, Optional<MutableComProFamily>>> pairList = new ArrayList<Pair<String, Optional<MutableComProFamily>>>();
    new ClientException(pairList, "foo", null);

    assertTrue(pairList.isEmpty());
  }

  @Test
  void testConstructor3() {
    Pair<String, Optional<MutableComProFamily>> pair = (Pair<String, Optional<MutableComProFamily>>) mock(
        Pair.class);
    when(pair.other()).thenReturn(
        Optional.<MutableComProFamily>of(mock(MutableComProFamily.class)));
    when(pair.first()).thenReturn("First");

    ArrayList<Pair<String, Optional<MutableComProFamily>>> pairList = new ArrayList<Pair<String, Optional<MutableComProFamily>>>();
    pairList.add(pair);
    new ClientException(pairList, "foo", null);

    //verify( pair ).first();
    //verify( pair ).other();
  }
}

