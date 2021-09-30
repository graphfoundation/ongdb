package io.github.onograph.server.security.systemgraph;

import static org.mockito.Mockito.mock;

import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.cache.ExecutorBasedCaffeineCacheFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.event.TransactionData;

class EnhancedDefaultDatabaseResolverTest {

  @Test
  void testConstructor() {

    new EnhancedDefaultDatabaseResolver(new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        null,
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
  }

  @Test
  void testConstructor2() {

    new EnhancedDefaultDatabaseResolver(new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
  }

  @Test
  void testAfterCommit() {

    (new EnhancedDefaultDatabaseResolver(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), null,
        (Supplier<GraphDatabaseService>) mock(Supplier.class))).afterCommit(
        mock(TransactionData.class), " ob Sae",
        null);
  }

  @Test
  void testClearCache() {

    (new EnhancedDefaultDatabaseResolver(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), null,
        (Supplier<GraphDatabaseService>) mock(Supplier.class))).clearCache();
  }

  @Test
  void testStrread() {

    (new EnhancedDefaultDatabaseResolver(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), null,
        (Supplier<GraphDatabaseService>) mock(Supplier.class))).strread(1L);
  }

  @Test
  void testTranci() {

    (new EnhancedDefaultDatabaseResolver(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), null,
        (Supplier<GraphDatabaseService>) mock(Supplier.class))).tranci(1L);
  }
}

