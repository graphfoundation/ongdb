package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.neo4j.storageengine.api.StoreId;

class StoreDatabaseIdTest {

  @Test
  void testConstructor() {
    StoreId storeId = new StoreId(1L);
    assertSame(storeId, (new StoreDatabaseId(storeId)).getStoreId());
  }

  @Test
  void testEquals() {
    assertFalse((new StoreDatabaseId(new StoreId(1L))).equals(null));
    assertFalse((new StoreDatabaseId(new StoreId(1L))).equals("Different type to StoreDatabaseId"));
  }

  @Test
  void testEquals2() {
    StoreDatabaseId storeDatabaseId = new StoreDatabaseId(new StoreId(1L));
    assertTrue(storeDatabaseId.equals(storeDatabaseId));
    int expectedHashCodeResult = storeDatabaseId.hashCode();
    assertEquals(expectedHashCodeResult, storeDatabaseId.hashCode());
  }

  @Test
  void testEquals3() {
    StoreDatabaseId storeDatabaseId = new StoreDatabaseId(new StoreId(1L));
    assertFalse(storeDatabaseId.equals(new StoreDatabaseId(new StoreId(1L))));
  }

  @Test
  void testEquals4() {
    StoreDatabaseId storeDatabaseId = new StoreDatabaseId(null);
    StoreDatabaseId storeDatabaseId1 = new StoreDatabaseId(null);
    assertTrue(storeDatabaseId.equals(storeDatabaseId1));
    int expectedHashCodeResult = storeDatabaseId.hashCode();
    assertEquals(expectedHashCodeResult, storeDatabaseId1.hashCode());
  }
}

