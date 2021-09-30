package io.github.onograph.server.rest;

import static org.mockito.Mockito.mock;

import java.io.Closeable;
import org.eclipse.jetty.io.ArrayByteBufferPool;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.api.net.DefaultNetworkConnectionTracker;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.server.web.Jetty9WebServer;

class ServerModuleManagementImplTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    Log4jLogProvider logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    Config config = mock(Config.class);
    DefaultNetworkConnectionTracker connectionTracker = new DefaultNetworkConnectionTracker();
    new ServerModuleManagementImpl(_config,
        new Jetty9WebServer(logProvider, config, connectionTracker, new ArrayByteBufferPool()));
  }
}

