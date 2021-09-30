package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.storageengine.api.StoreId;

class RequestStoreResourceTest {

  @Test
  void testConstructor() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    StoreId storeId = new StoreId(1L);
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RequestStoreResource actualRequestStoreResource = new RequestStoreResource(_databaseId, storeId,
        1L, getResult);

    assertSame(storeId, actualRequestStoreResource.getEpceStoreId());
    assertEquals(1L, actualRequestStoreResource.getLgItr());
    assertSame(getResult, actualRequestStoreResource.getPath());
  }

  @Test
  void testConstructor2() {
    DatabaseId randomDatabaseIdResult = TestDatabaseIdRepository.randomDatabaseId();
    StoreId storeId = new StoreId(1L);
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RequestStoreResource actualRequestStoreResource = new RequestStoreResource(
        randomDatabaseIdResult, storeId, 1L,
        getResult);

    assertSame(randomDatabaseIdResult, actualRequestStoreResource.getDatabaseId());
    assertEquals(AskMessageType.AMT_SC_FP, actualRequestStoreResource.getTNme());
    assertSame(storeId, actualRequestStoreResource.getEpceStoreId());
    assertSame(getResult, actualRequestStoreResource.getPath());
    assertEquals(1L, actualRequestStoreResource.getLgItr());
  }

  @Test
  void testDecbString() {

    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    (new RequestStoreResource(_databaseId, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).decbString();
  }

  @Test
  void testDecbString2() {
    assertEquals(
        "RequestStoreResource for null. Requesting file: test.txt with required minimum transaction id: 1",
        (new RequestStoreResource(null, new StoreId(1L), 1L,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).decbString());
  }

  @Test
  void testDecbString3() {
    assertEquals(
        "RequestStoreResource for null. Requesting file: test.txt with required minimum transaction id: 1",
        (new RequestStoreResource(null, new StoreId(0L), 1L,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).decbString());
  }

  @Test
  void testEquals() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse((new RequestStoreResource(_databaseId, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).equals(null));
  }

  @Test
  void testEquals2() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse((new RequestStoreResource(_databaseId, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).equals(
        "Different type to RequestStoreResource"));
  }

  @Test
  void testEquals3() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    RequestStoreResource requestStoreResource = new RequestStoreResource(_databaseId,
        new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertTrue(requestStoreResource.equals(requestStoreResource));
    int expectedHashCodeResult = requestStoreResource.hashCode();
    assertEquals(expectedHashCodeResult, requestStoreResource.hashCode());
  }

  @Test
  void testEquals4() {
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    RequestStoreResource requestStoreResource = new RequestStoreResource(_databaseId,
        new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DatabaseId _databaseId1 = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse(
        requestStoreResource.equals(new RequestStoreResource(_databaseId1, new StoreId(1L), 1L,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  @Test
  void testEquals5() {
    DatabaseId _databaseId = mock(DatabaseId.class);
    RequestStoreResource requestStoreResource = new RequestStoreResource(_databaseId,
        new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DatabaseId _databaseId1 = TestDatabaseIdRepository.randomDatabaseId();
    assertFalse(
        requestStoreResource.equals(new RequestStoreResource(_databaseId1, new StoreId(1L), 1L,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  @Test
  void testEquals6() {
    RequestStoreResource requestStoreResource = new RequestStoreResource(null, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertFalse(requestStoreResource.equals(new RequestStoreResource(null, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  @Test
  void testEquals7() {
    RequestStoreResource requestStoreResource = new RequestStoreResource(null, new StoreId(1L), 0L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertFalse(requestStoreResource.equals(new RequestStoreResource(null, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  @Test
  void testEquals8() {
    RequestStoreResource requestStoreResource = new RequestStoreResource(null, new StoreId(1L), 1L,
        Paths.get(System.getProperty("Key"), "test.txt"));
    assertFalse(requestStoreResource.equals(new RequestStoreResource(null, new StoreId(1L), 1L,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }
}

