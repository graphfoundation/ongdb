package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class DatabaseStateEnterpriseImplTest {

  @Test
  void testConstructor() {
    assertFalse(
        (new DatabaseStateEnterpriseImpl(mock(NamedDatabaseId.class),
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING))
            .hasFailed());
  }

  @Test
  void testInaunidDatabaseStateEnterpriseImpl() {
    assertFalse(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl().hasFailed());
  }

  @Test
  void testIntlDatabaseStateEnterpriseImpl() {
    assertFalse(
        DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(mock(NamedDatabaseId.class))
            .hasFailed());
  }

  @Test
  void testLofmtString() {
    String actualLofmtStringResult = DatabaseStateEnterpriseImpl.lofmtString(null, null);
    assertEquals(String.join("", "from ", System.getProperty("sun.os.patch.level"), " to ",
        System.getProperty("sun.os.patch.level")), actualLofmtStringResult);
  }

  @Test
  void testToshtsrgString() {
    assertEquals(System.getProperty("sun.os.patch.level"),
        DatabaseStateEnterpriseImpl.toshtsrgString(null));
  }

  @Test
  void testToshtsrgString2() {
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.logPrefix()).thenReturn("Log Prefix");
    assertEquals("SETI_IS{db=Log Prefix}", DatabaseStateEnterpriseImpl
        .toshtsrgString(
            DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(namedDatabaseId)));
    verify(namedDatabaseId).logPrefix();
  }

  @Test
  void testUnnnDatabaseStateEnterpriseImpl() {
    assertFalse(
        DatabaseStateEnterpriseImpl.unnnDatabaseStateEnterpriseImpl(mock(NamedDatabaseId.class))
            .hasFailed());
  }

  @Test
  void testDatabaseId() {
    assertNull(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl().databaseId());
  }

  @Test
  void testEquals() {
    assertFalse(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl().equals(null));
    assertFalse(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl()
        .equals("Different type to DatabaseStateEnterpriseImpl"));
  }

  @Test
  void testEquals2() {
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    assertTrue(
        inaunidDatabaseStateEnterpriseImplResult.equals(inaunidDatabaseStateEnterpriseImplResult));
    int expectedHashCodeResult = inaunidDatabaseStateEnterpriseImplResult.hashCode();
    assertEquals(expectedHashCodeResult, inaunidDatabaseStateEnterpriseImplResult.hashCode());
  }

  @Test
  void testEquals3() {
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult1 = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    assertTrue(
        inaunidDatabaseStateEnterpriseImplResult.equals(inaunidDatabaseStateEnterpriseImplResult1));
    int expectedHashCodeResult = inaunidDatabaseStateEnterpriseImplResult.hashCode();
    assertEquals(expectedHashCodeResult, inaunidDatabaseStateEnterpriseImplResult1.hashCode());
  }

  @Test
  void testEquals4() {
    DatabaseStateEnterpriseImpl intlDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .intlDatabaseStateEnterpriseImpl(mock(NamedDatabaseId.class));
    assertFalse(
        intlDatabaseStateEnterpriseImplResult.equals(
            DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl()));
  }

  @Test
  void testEquals5() {
    DatabaseStateEnterpriseImpl unnnDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .unnnDatabaseStateEnterpriseImpl(null);
    assertFalse(
        unnnDatabaseStateEnterpriseImplResult.equals(
            DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl()));
  }

  @Test
  void testFailure() {
    assertFalse(
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl().failure().isPresent());
  }

  @Test
  void testFalDatabaseStateEnterpriseImpl() {
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    assertTrue(
        inaunidDatabaseStateEnterpriseImplResult.falDatabaseStateEnterpriseImpl(new Throwable())
            .hasFailed());
  }

  @Test
  void testHasFailed() {
    assertFalse(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl().hasFailed());
  }

  @Test
  void testHelyDatabaseStateEnterpriseImpl() {
    assertFalse(
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl()
            .helyDatabaseStateEnterpriseImpl().hasFailed());
  }

  @Test
  void testOperatorState() {
    assertEquals(OperatorStateEnterpriseTypeImpl.SETI_IS,
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl().operatorState());
  }
}

