package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.storageengine.api.StoreId;

class StoreSyncRequestTest {

  @Test
  void testConstructor() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    StoreId storeId = new StoreId(1L);
    assertSame(storeId, (new StoreSyncRequest(_databaseId, storeId)).getStoreId());
  }

  @Test
  void testConstructor2() {
    DatabaseId randomDatabaseIdResult = TestDatabaseIdRepository.randomDatabaseId();
    StoreId storeId = new StoreId(1L);
    StoreSyncRequest actualStoreSyncRequest = new StoreSyncRequest(randomDatabaseIdResult, storeId);

    assertSame(randomDatabaseIdResult, actualStoreSyncRequest.getDatabaseId());
    assertEquals(AskMessageType.AMT_SET_SC, actualStoreSyncRequest.getTNme());
    assertSame(storeId, actualStoreSyncRequest.getStoreId());
  }

  @Test
  void testEquals() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse((new StoreSyncRequest(_databaseId, new StoreId(1L))).equals(null));
  }

  @Test
  void testEquals2() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse((new StoreSyncRequest(_databaseId, new StoreId(1L))).equals(
        "Different type to StoreSyncRequest"));
  }

  @Test
  void testEquals3() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    StoreSyncRequest storeSyncRequest = new StoreSyncRequest(_databaseId, new StoreId(1L));
    assertTrue(storeSyncRequest.equals(storeSyncRequest));
    int expectedHashCodeResult = storeSyncRequest.hashCode();
    assertEquals(expectedHashCodeResult, storeSyncRequest.hashCode());
  }

  @Test
  void testEquals4() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    StoreSyncRequest storeSyncRequest = new StoreSyncRequest(_databaseId, new StoreId(1L));
    DatabaseId _databaseId1 = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse(storeSyncRequest.equals(new StoreSyncRequest(_databaseId1, new StoreId(1L))));
  }

  @Test
  void testEquals5() {
    DatabaseId _databaseId = mock(DatabaseId.class);
    StoreSyncRequest storeSyncRequest = new StoreSyncRequest(_databaseId, new StoreId(1L));
    DatabaseId _databaseId1 = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse(storeSyncRequest.equals(new StoreSyncRequest(_databaseId1, new StoreId(1L))));
  }

  @Test
  void testEquals6() {
    StoreSyncRequest storeSyncRequest = new StoreSyncRequest(null, new StoreId(1L));
    assertFalse(storeSyncRequest.equals(new StoreSyncRequest(null, new StoreId(1L))));
  }
}

