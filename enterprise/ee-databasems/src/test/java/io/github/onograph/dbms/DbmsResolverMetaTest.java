package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.Test;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.kernel.database.NamedDatabaseId;

class DbmsResolverMetaTest {

  @Test
  void testConstructor() {
    HashMap<String, CompletableFuture<ReconcilePointStateMeta>> stringCompletableFutureMap = new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(
        1);
    DbmsResolverMeta actualDbmsResolverMeta = new DbmsResolverMeta(stringCompletableFutureMap);
    assertEquals(actualDbmsResolverMeta.EMT_DBMS_RESOLVER_META, actualDbmsResolverMeta);
    assertTrue(stringCompletableFutureMap.isEmpty());
  }

  @Test
  void testAwiForNa() {

    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    dbmsResolverMeta.awiForNa(new ArrayList<NamedDatabaseId>());
  }

  @Test
  void testAwiForNa2() {
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");

    ArrayList<NamedDatabaseId> namedDatabaseIdList = new ArrayList<NamedDatabaseId>();
    namedDatabaseIdList.add(namedDatabaseId);
    dbmsResolverMeta.awiForNa(namedDatabaseIdList);
    verify(namedDatabaseId).name();
  }

  @Test
  void testAwiForNa3() {
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsResolverMeta.awiForNa(namedDatabaseId);
    verify(namedDatabaseId).name();
  }

  @Test
  void testAwial() {

    (new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1))).awial();
  }

  @Test
  void testEquals() {
    assertFalse(
        (new DbmsResolverMeta(
            new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1))).equals(null));
    assertFalse(
        (new DbmsResolverMeta(new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1)))
            .equals("Different type to DbmsResolverMeta"));
  }

  @Test
  void testEquals2() {
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    assertTrue(dbmsResolverMeta.equals(dbmsResolverMeta));
    int expectedHashCodeResult = dbmsResolverMeta.hashCode();
    assertEquals(expectedHashCodeResult, dbmsResolverMeta.hashCode());
  }

  @Test
  void testEquals3() {
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    DbmsResolverMeta dbmsResolverMeta1 = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    assertTrue(dbmsResolverMeta.equals(dbmsResolverMeta1));
    int expectedHashCodeResult = dbmsResolverMeta.hashCode();
    assertEquals(expectedHashCodeResult, dbmsResolverMeta1.hashCode());
  }

  @Test
  void testEquals4() {
    HashMap<String, CompletableFuture<ReconcilePointStateMeta>> stringCompletableFutureMap = new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(
        1);
    stringCompletableFutureMap.put("Key", new CompletableFuture<ReconcilePointStateMeta>());
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(stringCompletableFutureMap);
    assertFalse(dbmsResolverMeta
        .equals(new DbmsResolverMeta(
            new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1))));
  }

  @Test
  void testJoiForCo() throws DatabaseManagementException {

    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    dbmsResolverMeta.joiForCo(new ArrayList<NamedDatabaseId>());
  }

  @Test
  void testJoiForCo2() throws DatabaseManagementException {
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");

    ArrayList<NamedDatabaseId> namedDatabaseIdList = new ArrayList<NamedDatabaseId>();
    namedDatabaseIdList.add(namedDatabaseId);
    dbmsResolverMeta.joiForCo(namedDatabaseIdList);
    verify(namedDatabaseId).name();
  }

  @Test
  void testJoiForCo3() throws DatabaseManagementException {
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsResolverMeta.joiForCo(namedDatabaseId);
    verify(namedDatabaseId).name();
  }

  @Test
  void testJonal() throws DatabaseManagementException {

    (new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1))).jonal();
  }

  @Test
  void testWhncmeForRu() {

    (new DbmsResolverMeta(new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1)))
        .whncmeForRu(mock(Runnable.class));
  }

  @Test
  void testWhncmeForRu2() {

    HashMap<String, CompletableFuture<ReconcilePointStateMeta>> stringCompletableFutureMap = new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(
        1);
    stringCompletableFutureMap.put("Key", new CompletableFuture<ReconcilePointStateMeta>());
    (new DbmsResolverMeta(stringCompletableFutureMap)).whncmeForRu(mock(Runnable.class));
  }
}

