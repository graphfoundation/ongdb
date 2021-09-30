package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class GdbMetaCloneTest {

  @Test
  void testConstructor() {
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    GdbMetaClone actualGdbMetaClone = new GdbMetaClone(inaunidDatabaseStateEnterpriseImplResult,
        1L);

    assertSame(inaunidDatabaseStateEnterpriseImplResult,
        actualGdbMetaClone.getDatabaseStateEnterpriseImpl());
    assertEquals(1L, actualGdbMetaClone.getLgIu());
  }

  @Test
  void testConstructor2() {
    GdbMetaClone actualGdbMetaClone = new GdbMetaClone(1L, null,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);

    assertEquals(1L, actualGdbMetaClone.getLgIu());
    assertFalse(actualGdbMetaClone.getDatabaseStateEnterpriseImpl().hasFailed());
  }

  @Test
  void testConstructor3() {
    GdbMetaClone actualGdbMetaClone = new GdbMetaClone(1L, mock(NamedDatabaseId.class),
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);

    assertEquals(1L, actualGdbMetaClone.getLgIu());
    assertFalse(actualGdbMetaClone.getDatabaseStateEnterpriseImpl().hasFailed());
  }

  @Test
  void testEquals() {
    assertFalse((new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(),
        1L)).equals(null));
    assertFalse(
        (new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L))
            .equals("Different type to GdbMetaClone"));
  }

  @Test
  void testEquals2() {
    GdbMetaClone gdbMetaClone = new GdbMetaClone(
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L);
    assertTrue(gdbMetaClone.equals(gdbMetaClone));
    int expectedHashCodeResult = gdbMetaClone.hashCode();
    assertEquals(expectedHashCodeResult, gdbMetaClone.hashCode());
  }

  @Test
  void testEquals3() {
    GdbMetaClone gdbMetaClone = new GdbMetaClone(
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L);
    GdbMetaClone gdbMetaClone1 = new GdbMetaClone(
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L);

    assertTrue(gdbMetaClone.equals(gdbMetaClone1));
    int expectedHashCodeResult = gdbMetaClone.hashCode();
    assertEquals(expectedHashCodeResult, gdbMetaClone1.hashCode());
  }

  @Test
  void testEquals4() {
    GdbMetaClone gdbMetaClone = new GdbMetaClone(null, 1L);
    assertFalse(
        gdbMetaClone.equals(
            new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(),
                1L)));
  }

  @Test
  void testEquals5() {
    GdbMetaClone gdbMetaClone = new GdbMetaClone(
        DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(mock(NamedDatabaseId.class)),
        1L);
    assertFalse(
        gdbMetaClone.equals(
            new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(),
                1L)));
  }

  @Test
  void testEquals6() {
    GdbMetaClone gdbMetaClone = new GdbMetaClone(
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 0L);
    assertFalse(
        gdbMetaClone.equals(
            new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(),
                1L)));
  }

  @Test
  void testEquals7() {
    GdbMetaClone gdbMetaClone = new GdbMetaClone(1L, mock(NamedDatabaseId.class),
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    assertFalse(
        gdbMetaClone.equals(
            new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(),
                1L)));
  }

  @Test
  void testEquals8() {
    GdbMetaClone gdbMetaClone = new GdbMetaClone(1L, null,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    assertFalse(
        gdbMetaClone.equals(
            new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(),
                1L)));
  }
}

