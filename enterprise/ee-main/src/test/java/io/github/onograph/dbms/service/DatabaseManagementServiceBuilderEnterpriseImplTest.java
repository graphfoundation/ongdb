package io.github.onograph.dbms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.nio.file.Paths;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.event.DatabaseEventListener;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.kernel.extension.ExtensionFactory;

class DatabaseManagementServiceBuilderEnterpriseImplTest {

  @Test
  void testConstructor() {
    assertEquals("enterprise", (new DatabaseManagementServiceBuilderEnterpriseImpl(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).getEdition());
  }

  @Test
  void testDatabaseDependencies() {
    ExternalDependencies actualDatabaseDependenciesResult = (new DatabaseManagementServiceBuilderEnterpriseImpl(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).databaseDependencies();
    assertTrue(
        ((Collection<DatabaseEventListener>) actualDatabaseDependenciesResult.databaseEventListeners()).isEmpty());
    assertTrue(
        actualDatabaseDependenciesResult.userLogProvider() instanceof org.neo4j.logging.NullLogProvider);
    assertEquals(4, actualDatabaseDependenciesResult.urlAccessRules().size());
    assertTrue(
        actualDatabaseDependenciesResult.dependencies() instanceof org.neo4j.collection.Dependencies);
    assertNull(actualDatabaseDependenciesResult.monitors());
    assertEquals(6,
        ((Collection<ExtensionFactory<?>>) actualDatabaseDependenciesResult.extensions()).size());
  }

  @Test
  void testGetDbmsInfo() {
    DatabaseManagementServiceBuilderEnterpriseImpl databaseManagementServiceBuilderEnterpriseImpl = new DatabaseManagementServiceBuilderEnterpriseImpl(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    Config config = mock(Config.class);
    when(config.get(any())).thenThrow(new IllegalArgumentException("foo"));
    assertThrows(IllegalArgumentException.class,
        () -> databaseManagementServiceBuilderEnterpriseImpl.getDbmsInfo(config));
    verify(config).get(any());
  }

  @Test
  void testGetEdition() {
    assertEquals("enterprise", (new DatabaseManagementServiceBuilderEnterpriseImpl(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).getEdition());
  }
}

