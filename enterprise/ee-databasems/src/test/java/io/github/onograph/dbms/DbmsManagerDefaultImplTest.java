package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class DbmsManagerDefaultImplTest {

  @Test
  void testConstructor() {
    assertTrue((new DbmsManagerDefaultImpl()).getPrefMap().isEmpty());
  }

  @Test
  void testDeidMapEP() {
    assertTrue((new DbmsManagerDefaultImpl()).deidMapEP().isEmpty());
  }

  @Test
  void testDrpdtaForNa() {
    DbmsManagerDefaultImpl dbmsManagerDefaultImpl = new DbmsManagerDefaultImpl();
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsManagerDefaultImpl.drpdtaForNa(namedDatabaseId);
    verify(namedDatabaseId, atLeast(1)).name();
    assertFalse(dbmsManagerDefaultImpl.getPrefMap().get("Name").hasFailed());
  }

  @Test
  void testDrpdtaForNa2() {
    DbmsManagerDefaultImpl dbmsManagerDefaultImpl = new DbmsManagerDefaultImpl();
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("foo");
    dbmsManagerDefaultImpl.drpdtaForNa(namedDatabaseId);
    verify(namedDatabaseId, atLeast(1)).name();
    assertFalse(dbmsManagerDefaultImpl.getPrefMap().get("foo").hasFailed());
  }

  @Test
  void testReodiForNa() {
    DbmsManagerDefaultImpl dbmsManagerDefaultImpl = new DbmsManagerDefaultImpl();
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsManagerDefaultImpl.reodiForNa(namedDatabaseId);
    verify(namedDatabaseId, atLeast(1)).name();
  }

  @Test
  void testStpdtaForNa() {
    DbmsManagerDefaultImpl dbmsManagerDefaultImpl = new DbmsManagerDefaultImpl();
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsManagerDefaultImpl.stpdtaForNa(namedDatabaseId);
    verify(namedDatabaseId, atLeast(1)).name();
    assertFalse(dbmsManagerDefaultImpl.getPrefMap().get("Name").hasFailed());
  }

  @Test
  void testStrdabeForNa() {
    DbmsManagerDefaultImpl dbmsManagerDefaultImpl = new DbmsManagerDefaultImpl();
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    dbmsManagerDefaultImpl.strdabeForNa(namedDatabaseId);
    verify(namedDatabaseId, atLeast(1)).name();
    assertFalse(dbmsManagerDefaultImpl.getPrefMap().get("Name").hasFailed());
  }
}

