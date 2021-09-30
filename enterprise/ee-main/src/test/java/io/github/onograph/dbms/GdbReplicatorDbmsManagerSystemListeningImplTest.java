package io.github.onograph.dbms;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

class GdbReplicatorDbmsManagerSystemListeningImplTest {

  @Test
  void testStrread() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenReturn(null);
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        supplier);
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    (new GdbReplicatorDbmsManagerSystemListeningImpl(
        new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
            GraphDatabaseSettings.Mode.SINGLE,
            new DefaultReconciledTransactionTracker(
                new SimpleLogService(
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
    (new GdbReplicatorDbmsManagerSystemListeningImpl(
        new KernelDbmsManager(_defaultSystemGraphDbmsModel, _logProvider,
            GraphDatabaseSettings.Mode.SINGLE,
            new DefaultReconciledTransactionTracker(
                new SimpleLogService(
                    new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))))
        .tranci(1L);
    verify(supplier).get();
  }
}

