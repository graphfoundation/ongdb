package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class GdbIdTest {

  @Test
  void testConstructor() {
    DatabaseId randomDatabaseIdResult = TestDatabaseIdRepository.randomDatabaseId();
    assertSame(randomDatabaseIdResult, (new GdbId(randomDatabaseIdResult)).getRDatabaseId());
  }

  @Test
  void testEquals() {
    assertFalse((new GdbId(TestDatabaseIdRepository.randomDatabaseId())).equals(null));
    assertFalse(
        (new GdbId(TestDatabaseIdRepository.randomDatabaseId())).equals("Different type to GdbId"));
  }

  @Test
  void testEquals2() {
    GdbId gdbId = new GdbId(TestDatabaseIdRepository.randomDatabaseId());
    assertTrue(gdbId.equals(gdbId));
    int expectedHashCodeResult = gdbId.hashCode();
    assertEquals(expectedHashCodeResult, gdbId.hashCode());
  }

  @Test
  void testEquals3() {
    GdbId gdbId = new GdbId(TestDatabaseIdRepository.randomDatabaseId());
    assertFalse(gdbId.equals(new GdbId(TestDatabaseIdRepository.randomDatabaseId())));
  }

  @Test
  void testEquals4() {
    GdbId gdbId = new GdbId(mock(DatabaseId.class));
    assertFalse(gdbId.equals(new GdbId(TestDatabaseIdRepository.randomDatabaseId())));
  }

  @Test
  void testEquals5() {
    GdbId gdbId = new GdbId(null);
    GdbId gdbId1 = new GdbId(null);
    assertTrue(gdbId.equals(gdbId1));
    int expectedHashCodeResult = gdbId.hashCode();
    assertEquals(expectedHashCodeResult, gdbId1.hashCode());
  }
}

