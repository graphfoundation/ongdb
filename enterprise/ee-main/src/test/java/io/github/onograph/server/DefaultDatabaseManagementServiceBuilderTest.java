package io.github.onograph.server;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;

class DefaultDatabaseManagementServiceBuilderTest {

  @Test
  void testCremgtsiDatabaseManagementService() {
    Config config = mock(Config.class);
    when(config.get(any())).thenThrow(new IllegalArgumentException("foo"));
    assertThrows(IllegalArgumentException.class, () -> DefaultDatabaseManagementServiceBuilder
        .cremgtsiDatabaseManagementService(config, GraphDatabaseDependencies.newDependencies()));
    verify(config).get(any());
  }
}

