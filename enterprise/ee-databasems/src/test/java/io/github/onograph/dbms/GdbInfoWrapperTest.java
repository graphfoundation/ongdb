package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.HashMap;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class GdbInfoWrapperTest {

  @Test
  void testConstructor() {
    HashSet<NamedDatabaseId> namedDatabaseIdSet = new HashSet<NamedDatabaseId>();
    HashSet<NamedDatabaseId> namedDatabaseIdSet1 = new HashSet<NamedDatabaseId>();
    GdbInfoWrapper actualGdbInfoWrapper = new GdbInfoWrapper(namedDatabaseIdSet,
        namedDatabaseIdSet1);

    assertSame(namedDatabaseIdSet, actualGdbInfoWrapper.getSetCagdNamedDatabaseId());
    assertSame(namedDatabaseIdSet1, actualGdbInfoWrapper.getSetDopdNamedDatabaseId());
  }

  @Test
  void testAllSet() {
    HashMap<String, GdbMetaClone> _mapCretsg = new HashMap<String, GdbMetaClone>(1);
    assertTrue(DefaultSystemGraphDbmsModel.upedasGdbInfoWrapper(_mapCretsg,
            new HashMap<String, GdbMetaClone>(1))
        .allSet()
        .isEmpty());
  }

  @Test
  void testAllSet2() {
    HashSet<NamedDatabaseId> namedDatabaseIdSet = new HashSet<NamedDatabaseId>();
    namedDatabaseIdSet.add(mock(NamedDatabaseId.class));
    assertEquals(1,
        (new GdbInfoWrapper(namedDatabaseIdSet, new HashSet<NamedDatabaseId>())).allSet().size());
  }
}

