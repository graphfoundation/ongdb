package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class AllGdbIdsTest {

  @Test
  void testConstructor() {
    HashSet<NamedDatabaseId> namedDatabaseIdSet = new HashSet<NamedDatabaseId>();
    AllGdbIds actualAllGdbIds = new AllGdbIds(namedDatabaseIdSet);
    assertSame(namedDatabaseIdSet, actualAllGdbIds.getSetDiNamedDatabaseId());
    assertEquals(0, actualAllGdbIds.getSz());
  }

  @Test
  void testConstructor2() {
    AllGdbIds actualAllGdbIds = new AllGdbIds(new HashSet<NamedDatabaseId>());
    assertTrue(actualAllGdbIds.getSetDiNamedDatabaseId().isEmpty());
    assertEquals(0, actualAllGdbIds.getSz());
  }

  @Test
  void testEquals() {
    assertFalse((new AllGdbIds(new HashSet<NamedDatabaseId>())).equals(null));
    assertFalse(
        (new AllGdbIds(new HashSet<NamedDatabaseId>())).equals("Different type to AllGdbIds"));
  }

  @Test
  void testEquals2() {
    AllGdbIds allGdbIds = new AllGdbIds(new HashSet<NamedDatabaseId>());
    assertTrue(allGdbIds.equals(allGdbIds));
    int expectedHashCodeResult = allGdbIds.hashCode();
    assertEquals(expectedHashCodeResult, allGdbIds.hashCode());
  }

  @Test
  void testEquals3() {
    AllGdbIds allGdbIds = new AllGdbIds(new HashSet<NamedDatabaseId>());
    AllGdbIds allGdbIds1 = new AllGdbIds(new HashSet<NamedDatabaseId>());
    assertTrue(allGdbIds.equals(allGdbIds1));
    int expectedHashCodeResult = allGdbIds.hashCode();
    assertEquals(expectedHashCodeResult, allGdbIds1.hashCode());
  }

  @Test
  void testEquals4() {
    HashSet<NamedDatabaseId> namedDatabaseIdSet = new HashSet<NamedDatabaseId>();
    namedDatabaseIdSet.add(TestDatabaseIdRepository.randomNamedDatabaseId());
    AllGdbIds allGdbIds = new AllGdbIds(namedDatabaseIdSet);
    assertFalse(allGdbIds.equals(new AllGdbIds(new HashSet<NamedDatabaseId>())));
  }

  @Test
  void testEquals5() {
    HashSet<NamedDatabaseId> namedDatabaseIdSet = new HashSet<NamedDatabaseId>();
    namedDatabaseIdSet.add(TestDatabaseIdRepository.randomNamedDatabaseId());
    AllGdbIds allGdbIds = new AllGdbIds(namedDatabaseIdSet);

    HashSet<NamedDatabaseId> namedDatabaseIdSet1 = new HashSet<NamedDatabaseId>();
    namedDatabaseIdSet1.add(TestDatabaseIdRepository.randomNamedDatabaseId());
    assertFalse(allGdbIds.equals(new AllGdbIds(namedDatabaseIdSet1)));
  }
}

