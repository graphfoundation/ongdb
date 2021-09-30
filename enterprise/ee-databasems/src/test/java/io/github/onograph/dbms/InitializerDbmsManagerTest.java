package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.Closeable;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.Logger;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;

class InitializerDbmsManagerTest {

  @Test
  void testConstructor() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    assertTrue((new InitializerDbmsManager(config, _defaultSystemGraphDbmsModel,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))))).getPrefMap()
        .isEmpty());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(1);
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    assertTrue((new InitializerDbmsManager(config, _defaultSystemGraphDbmsModel,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))))).getPrefMap()
        .isEmpty());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor3() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    LoggerContext loggerContext = mock(LoggerContext.class);
    when(loggerContext.getLogger((String) any())).thenReturn(mock(Logger.class));
    assertTrue((new InitializerDbmsManager(config, _defaultSystemGraphDbmsModel,
        new Log4jLogProvider(
            new Neo4jLoggerContext(loggerContext, mock(Closeable.class))))).getPrefMap()
        .isEmpty());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
    verify(loggerContext).getLogger((String) any());
  }
}

