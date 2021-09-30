package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class ReconcilePointStateMetaTest {

  @Test
  void testConstructor() {
    Throwable throwable = new Throwable();
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult1 = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    ReconcilePointStateMeta actualReconcilePointStateMeta = new ReconcilePointStateMeta(throwable,
        inaunidDatabaseStateEnterpriseImplResult,
        inaunidDatabaseStateEnterpriseImplResult1);

    assertSame(throwable, actualReconcilePointStateMeta.getEsThrowable());
    DatabaseStateEnterpriseImpl sdDatabaseStateEnterpriseImpl = actualReconcilePointStateMeta
        .getSdDatabaseStateEnterpriseImpl();
    assertSame(inaunidDatabaseStateEnterpriseImplResult, sdDatabaseStateEnterpriseImpl);
    DatabaseStateEnterpriseImpl ssDatabaseStateEnterpriseImpl = actualReconcilePointStateMeta
        .getSsDatabaseStateEnterpriseImpl();
    assertEquals(ssDatabaseStateEnterpriseImpl, sdDatabaseStateEnterpriseImpl);
    assertSame(inaunidDatabaseStateEnterpriseImplResult1, ssDatabaseStateEnterpriseImpl);
    assertEquals(inaunidDatabaseStateEnterpriseImplResult, ssDatabaseStateEnterpriseImpl);
  }

  @Test
  void testDatabaseStateEnterpriseImpl() {
    Throwable throwable = new Throwable();
    DatabaseStateEnterpriseImpl _sdDatabaseStateEnterpriseImpl = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    ReconcilePointStateMeta reconcilePointStateMeta = new ReconcilePointStateMeta(throwable,
        _sdDatabaseStateEnterpriseImpl,
        inaunidDatabaseStateEnterpriseImplResult);
    ReconcilePointStateMeta actualDatabaseStateEnterpriseImplResult = reconcilePointStateMeta
        .databaseStateEnterpriseImpl(
            DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl());
    assertSame(throwable, actualDatabaseStateEnterpriseImplResult.getEsThrowable());
    assertEquals(inaunidDatabaseStateEnterpriseImplResult,
        actualDatabaseStateEnterpriseImplResult.getSsDatabaseStateEnterpriseImpl());
    assertEquals(inaunidDatabaseStateEnterpriseImplResult,
        actualDatabaseStateEnterpriseImplResult.getSdDatabaseStateEnterpriseImpl());
  }

  @Test
  void testDatabaseStateEnterpriseImpl2() {
    Throwable throwable = new Throwable();
    DatabaseStateEnterpriseImpl intlDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .intlDatabaseStateEnterpriseImpl(mock(NamedDatabaseId.class));
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    ReconcilePointStateMeta reconcilePointStateMeta = new ReconcilePointStateMeta(throwable,
        intlDatabaseStateEnterpriseImplResult,
        inaunidDatabaseStateEnterpriseImplResult);
    ReconcilePointStateMeta actualDatabaseStateEnterpriseImplResult = reconcilePointStateMeta
        .databaseStateEnterpriseImpl(
            DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl());
    assertSame(throwable, actualDatabaseStateEnterpriseImplResult.getEsThrowable());
    assertEquals(inaunidDatabaseStateEnterpriseImplResult,
        actualDatabaseStateEnterpriseImplResult.getSsDatabaseStateEnterpriseImpl());
    assertSame(intlDatabaseStateEnterpriseImplResult,
        actualDatabaseStateEnterpriseImplResult.getSdDatabaseStateEnterpriseImpl());
  }

  @Test
  void testEsThrowable() {
    Throwable throwable = new Throwable();
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    ReconcilePointStateMeta reconcilePointStateMeta = new ReconcilePointStateMeta(throwable,
        inaunidDatabaseStateEnterpriseImplResult,
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl());
    ReconcilePointStateMeta actualEsThrowableResult = reconcilePointStateMeta.esThrowable(
        new Throwable());
    assertSame(throwable, actualEsThrowableResult.getEsThrowable());
    DatabaseStateEnterpriseImpl ssDatabaseStateEnterpriseImpl = actualEsThrowableResult
        .getSsDatabaseStateEnterpriseImpl();
    assertEquals(inaunidDatabaseStateEnterpriseImplResult, ssDatabaseStateEnterpriseImpl);
    assertEquals(ssDatabaseStateEnterpriseImpl,
        actualEsThrowableResult.getSdDatabaseStateEnterpriseImpl());
  }

  @Test
  void testEsThrowable2() {
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    ReconcilePointStateMeta reconcilePointStateMeta = new ReconcilePointStateMeta(null,
        inaunidDatabaseStateEnterpriseImplResult,
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl());
    Throwable throwable = new Throwable();
    ReconcilePointStateMeta actualEsThrowableResult = reconcilePointStateMeta.esThrowable(
        throwable);
    assertSame(throwable, actualEsThrowableResult.getEsThrowable());
    DatabaseStateEnterpriseImpl ssDatabaseStateEnterpriseImpl = actualEsThrowableResult
        .getSsDatabaseStateEnterpriseImpl();
    assertEquals(inaunidDatabaseStateEnterpriseImplResult, ssDatabaseStateEnterpriseImpl);
    assertEquals(ssDatabaseStateEnterpriseImpl,
        actualEsThrowableResult.getSdDatabaseStateEnterpriseImpl());
  }

  @Test
  void testEsThrowable3() {
    Throwable throwable = new Throwable();
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    ReconcilePointStateMeta actualEsThrowableResult = (new ReconcilePointStateMeta(throwable,
        inaunidDatabaseStateEnterpriseImplResult,
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl()))
        .esThrowable(null);
    assertSame(throwable, actualEsThrowableResult.getEsThrowable());
    DatabaseStateEnterpriseImpl ssDatabaseStateEnterpriseImpl = actualEsThrowableResult
        .getSsDatabaseStateEnterpriseImpl();
    assertEquals(inaunidDatabaseStateEnterpriseImplResult, ssDatabaseStateEnterpriseImpl);
    assertEquals(ssDatabaseStateEnterpriseImpl,
        actualEsThrowableResult.getSdDatabaseStateEnterpriseImpl());
  }

  @Test
  void testEsThrowable4() {
    Throwable throwable = new Throwable();
    DatabaseStateEnterpriseImpl intlDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .intlDatabaseStateEnterpriseImpl(mock(NamedDatabaseId.class));
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    ReconcilePointStateMeta reconcilePointStateMeta = new ReconcilePointStateMeta(throwable,
        intlDatabaseStateEnterpriseImplResult,
        inaunidDatabaseStateEnterpriseImplResult);
    ReconcilePointStateMeta actualEsThrowableResult = reconcilePointStateMeta.esThrowable(
        new Throwable());
    assertSame(throwable, actualEsThrowableResult.getEsThrowable());
    assertSame(inaunidDatabaseStateEnterpriseImplResult,
        actualEsThrowableResult.getSsDatabaseStateEnterpriseImpl());
    assertSame(intlDatabaseStateEnterpriseImplResult,
        actualEsThrowableResult.getSdDatabaseStateEnterpriseImpl());
  }
}

