package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.bolt.txtracking.DefaultReconciledTransactionTracker;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.logging.internal.SimpleLogService;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;

class KernelDbmsManagerTest {

  @Test
  void testConstructor() {
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    assertEquals(1,
        (new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
            GraphDatabaseSettings.Mode.SINGLE,
            new DefaultReconciledTransactionTracker(new SimpleLogService(
                new Log4jLogProvider(
                    new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))))
            .getPrefMap()
            .size());
  }

  @Test
  void testConstructor2() {
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    assertEquals(1,
        (new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
            GraphDatabaseSettings.Mode.SINGLE,
            new DefaultReconciledTransactionTracker(new SimpleLogService(new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name", "External Context"),
                    mock(Closeable.class)))))))
            .getPrefMap()
            .size());
  }

  @Test
  void testConstructor3() {
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    assertEquals(1,
        (new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
            GraphDatabaseSettings.Mode.SINGLE,
            new DefaultReconciledTransactionTracker(new SimpleLogService(
                new Log4jLogProvider(
                    new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))))
            .getPrefMap()
            .size());
  }

  @Test
  void testDeidMapEP() {
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    assertEquals(1,
        (new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
            GraphDatabaseSettings.Mode.SINGLE,
            new DefaultReconciledTransactionTracker(new SimpleLogService(
                new Log4jLogProvider(
                    new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))))
            .deidMapEP()
            .size());
  }

  @Test
  void testDeidMapEP2() {
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    assertEquals(1,
        (new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
            GraphDatabaseSettings.Mode.SINGLE,
            new DefaultReconciledTransactionTracker(
                new SimpleLogService(
                    new Log4jLogProvider(new ByteArrayOutputStream(3)))))).deidMapEP().size());
  }

  @Test
  void testStrread() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenReturn(null);
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        supplier);
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    (new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
        GraphDatabaseSettings.Mode.SINGLE,
        new DefaultReconciledTransactionTracker(new SimpleLogService(
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))))
        .strread(1L);
    verify(supplier).get();
  }

  @Test
  void testTranci() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenReturn(null);
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        supplier);
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    (new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
        GraphDatabaseSettings.Mode.SINGLE,
        new DefaultReconciledTransactionTracker(new SimpleLogService(
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))))
        .tranci(1L);
    verify(supplier).get();
  }
}

