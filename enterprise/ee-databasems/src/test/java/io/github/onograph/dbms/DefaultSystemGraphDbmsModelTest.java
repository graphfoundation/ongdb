package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.kernel.database.NamedDatabaseId;

class DefaultSystemGraphDbmsModelTest {

  @Test
  void testConstructor() {

    new DefaultSystemGraphDbmsModel((Supplier<GraphDatabaseService>) mock(Supplier.class));
  }

  @Test
  void testUpedasGdbInfoWrapper() {
    HashMap<String, GdbMetaClone> _mapCretsg = new HashMap<String, GdbMetaClone>(1);
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel.upedasGdbInfoWrapper(
        _mapCretsg,
        new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper10() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.unnnDatabaseStateEnterpriseImpl(null), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper11() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(
            new DatabaseStateEnterpriseImpl(null, OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING),
            1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper12() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(
            mock(NamedDatabaseId.class)), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper13() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.unnnDatabaseStateEnterpriseImpl(null), 1L));

    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap1 = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap1.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, stringGdbMetaCloneMap1);
    assertEquals(1, actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().size());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper2() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper3() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper4() {
    HashMap<String, GdbMetaClone> _mapCretsg = new HashMap<String, GdbMetaClone>(1);

    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel.upedasGdbInfoWrapper(
        _mapCretsg,
        stringGdbMetaCloneMap);
    assertEquals(1, actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().size());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper5() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(null), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper6() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.unnnDatabaseStateEnterpriseImpl(null), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper7() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(
            new DatabaseStateEnterpriseImpl(null, OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING),
            1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper8() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));

    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap1 = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap1.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, stringGdbMetaCloneMap1);
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testUpedasGdbInfoWrapper9() {
    HashMap<String, GdbMetaClone> stringGdbMetaCloneMap = new HashMap<String, GdbMetaClone>(1);
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl(), 1L));
    stringGdbMetaCloneMap.put("Key",
        new GdbMetaClone(DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(null), 1L));
    GdbInfoWrapper actualUpedasGdbInfoWrapperResult = DefaultSystemGraphDbmsModel
        .upedasGdbInfoWrapper(stringGdbMetaCloneMap, new HashMap<String, GdbMetaClone>(1));
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetCagdNamedDatabaseId().isEmpty());
    assertTrue(actualUpedasGdbInfoWrapperResult.getSetDopdNamedDatabaseId().isEmpty());
  }

  @Test
  void testGedteseMap() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new IllegalArgumentException("42"));
    assertThrows(IllegalArgumentException.class,
        () -> (new DefaultSystemGraphDbmsModel(supplier)).gedteseMap());
    verify(supplier).get();
  }

  @Test
  void testGeeigdbnaSet() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new IllegalArgumentException("42"));
    assertThrows(IllegalArgumentException.class,
        () -> (new DefaultSystemGraphDbmsModel(supplier)).geeigdbnaSet());
    verify(supplier).get();
  }

  @Test
  void testGestOptional() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new IllegalArgumentException("42"));
    assertThrows(IllegalArgumentException.class,
        () -> (new DefaultSystemGraphDbmsModel(supplier)).gestOptional(
            mock(NamedDatabaseId.class)));
    verify(supplier).get();
  }
}

