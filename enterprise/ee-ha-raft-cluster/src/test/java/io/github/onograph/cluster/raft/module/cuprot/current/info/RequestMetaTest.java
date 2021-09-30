package io.github.onograph.cluster.raft.module.cuprot.current.info;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class RequestMetaTest {

  @Test
  void testConstructor() {
    NamedDatabaseId randomNamedDatabaseIdResult = TestDatabaseIdRepository.randomNamedDatabaseId();
    assertSame(randomNamedDatabaseIdResult,
        (new RequestMeta(randomNamedDatabaseIdResult)).getNamedDatabaseId());
  }

  @Test
  void testConstructor2() {
    NamedDatabaseId randomNamedDatabaseIdResult = TestDatabaseIdRepository.randomNamedDatabaseId();
    RequestMeta actualRequestMeta = new RequestMeta(randomNamedDatabaseIdResult);
    assertSame(randomNamedDatabaseIdResult, actualRequestMeta.getNamedDatabaseId());
    assertEquals(AskMessageType.AMT_STATS, actualRequestMeta.getTNme());
  }

  @Test
  void testDecbString() {
    assertEquals("RequestMeta",
        (new RequestMeta(TestDatabaseIdRepository.randomNamedDatabaseId())).decbString());
  }

  @Test
  void testEquals() {
    assertFalse((new RequestMeta(TestDatabaseIdRepository.randomNamedDatabaseId())).equals(null));
    assertFalse(
        (new RequestMeta(TestDatabaseIdRepository.randomNamedDatabaseId())).equals(
            "Different type to RequestMeta"));
  }

  @Test
  void testEquals2() {
    RequestMeta requestMeta = new RequestMeta(TestDatabaseIdRepository.randomNamedDatabaseId());
    assertTrue(requestMeta.equals(requestMeta));
    int expectedHashCodeResult = requestMeta.hashCode();
    assertEquals(expectedHashCodeResult, requestMeta.hashCode());
  }

  @Test
  void testEquals3() {
    RequestMeta requestMeta = new RequestMeta(TestDatabaseIdRepository.randomNamedDatabaseId());
    assertFalse(
        requestMeta.equals(new RequestMeta(TestDatabaseIdRepository.randomNamedDatabaseId())));
  }

  @Test
  void testEquals4() {
    RequestMeta requestMeta = new RequestMeta(mock(NamedDatabaseId.class));
    assertFalse(
        requestMeta.equals(new RequestMeta(TestDatabaseIdRepository.randomNamedDatabaseId())));
  }

  @Test
  void testEquals5() {
    RequestMeta requestMeta = new RequestMeta(null);
    RequestMeta requestMeta1 = new RequestMeta(null);
    assertTrue(requestMeta.equals(requestMeta1));
    int expectedHashCodeResult = requestMeta.hashCode();
    assertEquals(expectedHashCodeResult, requestMeta1.hashCode());
  }
}

