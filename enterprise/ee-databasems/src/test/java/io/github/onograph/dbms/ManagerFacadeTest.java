package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.Test;

class ManagerFacadeTest {

  @Test
  void testConstructor() {
    assertTrue((new ManagerFacade(null)).setOproAbstractDbmsManager.isEmpty());
  }

  @Test
  void testSeoroForCo() {
    ManagerFacade managerFacade = new ManagerFacade(null);
    managerFacade.seoroForCo(new ArrayList<AbstractDbmsManager>());
    assertTrue(managerFacade.setOproAbstractDbmsManager.isEmpty());
  }

  @Test
  void testSeoroForCo2() {
    ManagerFacade managerFacade = new ManagerFacade(null);

    ArrayList<AbstractDbmsManager> abstractDbmsManagerList = new ArrayList<AbstractDbmsManager>();
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());
    managerFacade.seoroForCo(abstractDbmsManagerList);
    assertEquals(1, managerFacade.setOproAbstractDbmsManager.size());
  }

  @Test
  void testSeoroForCo3() {
    ManagerFacade managerFacade = new ManagerFacade(null);

    ArrayList<AbstractDbmsManager> abstractDbmsManagerList = new ArrayList<AbstractDbmsManager>();
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());
    managerFacade.seoroForCo(abstractDbmsManagerList);
    assertEquals(2, managerFacade.setOproAbstractDbmsManager.size());
  }

  @Test
  void testTrgrDbmsResolverMeta() {
    DbmsStateResolverFacade dbmsStateResolverFacade = mock(DbmsStateResolverFacade.class);
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    when(dbmsStateResolverFacade.reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any())).thenReturn(dbmsResolverMeta);
    assertSame(dbmsResolverMeta,
        (new ManagerFacade(dbmsStateResolverFacade)).trgrDbmsResolverMeta(null));
    verify(dbmsStateResolverFacade).reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any());
  }

  @Test
  void testTrgrDbmsResolverMeta2() {
    DbmsStateResolverFacade dbmsStateResolverFacade = mock(DbmsStateResolverFacade.class);
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    when(dbmsStateResolverFacade.reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any())).thenReturn(dbmsResolverMeta);

    ManagerFacade managerFacade = new ManagerFacade(dbmsStateResolverFacade);
    managerFacade.seoroForCo(new ArrayList<AbstractDbmsManager>());
    assertSame(dbmsResolverMeta, managerFacade.trgrDbmsResolverMeta(null));
    verify(dbmsStateResolverFacade).reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any());
  }

  @Test
  void testTrgrDbmsResolverMeta3() {
    DbmsStateResolverFacade dbmsStateResolverFacade = mock(DbmsStateResolverFacade.class);
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    when(dbmsStateResolverFacade.reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any())).thenReturn(dbmsResolverMeta);

    ArrayList<AbstractDbmsManager> abstractDbmsManagerList = new ArrayList<AbstractDbmsManager>();
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());

    ManagerFacade managerFacade = new ManagerFacade(dbmsStateResolverFacade);
    managerFacade.seoroForCo(abstractDbmsManagerList);
    assertSame(dbmsResolverMeta, managerFacade.trgrDbmsResolverMeta(null));
    verify(dbmsStateResolverFacade).reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any());
  }

  @Test
  void testTrgrDbmsResolverMeta4() {
    DbmsStateResolverFacade dbmsStateResolverFacade = mock(DbmsStateResolverFacade.class);
    DbmsResolverMeta dbmsResolverMeta = new DbmsResolverMeta(
        new HashMap<String, CompletableFuture<ReconcilePointStateMeta>>(1));
    when(dbmsStateResolverFacade.reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any())).thenReturn(dbmsResolverMeta);

    ArrayList<AbstractDbmsManager> abstractDbmsManagerList = new ArrayList<AbstractDbmsManager>();
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());
    abstractDbmsManagerList.add(new DbmsManagerDefaultImpl());

    ManagerFacade managerFacade = new ManagerFacade(dbmsStateResolverFacade);
    managerFacade.seoroForCo(abstractDbmsManagerList);
    assertSame(dbmsResolverMeta, managerFacade.trgrDbmsResolverMeta(null));
    verify(dbmsStateResolverFacade).reoiDbmsResolverMeta(
        (java.util.Collection<AbstractDbmsManager>) any(),
        (DbmsResolverAction) any());
  }
}

