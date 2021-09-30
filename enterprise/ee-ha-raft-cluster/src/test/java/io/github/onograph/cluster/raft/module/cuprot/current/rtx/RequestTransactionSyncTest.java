package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.storageengine.api.StoreId;

class RequestTransactionSyncTest {

  @Test
  void testConstructor() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    StoreId storeId = new StoreId(1L);
    RequestTransactionSync actualRequestTransactionSync = new RequestTransactionSync(_databaseId,
        storeId, 1L);

    assertSame(storeId, actualRequestTransactionSync.getEpceStoreId());
    assertEquals(1L, actualRequestTransactionSync.getLgItp());
  }

  @Test
  void testConstructor2() {
    DatabaseId randomDatabaseIdResult = TestDatabaseIdRepository.randomDatabaseId();
    StoreId storeId = new StoreId(1L);
    RequestTransactionSync actualRequestTransactionSync = new RequestTransactionSync(
        randomDatabaseIdResult, storeId,
        1L);

    assertSame(randomDatabaseIdResult, actualRequestTransactionSync.getDatabaseId());
    assertTrue(actualRequestTransactionSync.isVad());
    assertSame(storeId, actualRequestTransactionSync.getEpceStoreId());
    assertEquals(AskMessageType.AMT_TRX_IN_ASK, actualRequestTransactionSync.getTNme());
  }

  @Test
  void testConstructor3() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertThrows(IllegalArgumentException.class,
        () -> new RequestTransactionSync(_databaseId, new StoreId(1L), 0L));
  }

  @Test
  void testDecbString() {

    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    (new RequestTransactionSync(_databaseId, new StoreId(1L), 1L)).decbString();
  }

  @Test
  void testDecbString2() {
    assertEquals(
        "RequestTransactionSync for null. Requires to pull transactions above transaction id:  1",
        (new RequestTransactionSync(null, new StoreId(1L), 1L)).decbString());
  }

  @Test
  void testEquals() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse((new RequestTransactionSync(_databaseId, new StoreId(1L), 1L)).equals(null));
  }

  @Test
  void testEquals2() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse((new RequestTransactionSync(_databaseId, new StoreId(1L), 1L))
        .equals("Different type to RequestTransactionSync"));
  }

  @Test
  void testEquals3() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    RequestTransactionSync requestTransactionSync = new RequestTransactionSync(_databaseId,
        new StoreId(1L), 1L);
    assertTrue(requestTransactionSync.equals(requestTransactionSync));
    int expectedHashCodeResult = requestTransactionSync.hashCode();
    assertEquals(expectedHashCodeResult, requestTransactionSync.hashCode());
  }

  @Test
  void testEquals4() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    RequestTransactionSync requestTransactionSync = new RequestTransactionSync(_databaseId,
        new StoreId(1L), 1L);
    DatabaseId _databaseId1 = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse(requestTransactionSync.equals(
        new RequestTransactionSync(_databaseId1, new StoreId(1L), 1L)));
  }

  @Test
  void testEquals5() {
    DatabaseId _databaseId = mock(DatabaseId.class);
    RequestTransactionSync requestTransactionSync = new RequestTransactionSync(_databaseId,
        new StoreId(1L), 1L);
    DatabaseId _databaseId1 = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse(requestTransactionSync.equals(
        new RequestTransactionSync(_databaseId1, new StoreId(1L), 1L)));
  }

  @Test
  void testEquals6() {
    RequestTransactionSync requestTransactionSync = new RequestTransactionSync(null,
        new StoreId(1L), 1L);
    assertFalse(
        requestTransactionSync.equals(new RequestTransactionSync(null, new StoreId(1L), 1L)));
  }

  @Test
  void testEquals7() {
    RequestTransactionSync requestTransactionSync = new RequestTransactionSync(null,
        new StoreId(1L), Long.MAX_VALUE);
    assertFalse(
        requestTransactionSync.equals(new RequestTransactionSync(null, new StoreId(1L), 1L)));
  }

  @Test
  void testIsVad() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertTrue((new RequestTransactionSync(_databaseId, new StoreId(1L), 1L)).isVad());
  }
}

