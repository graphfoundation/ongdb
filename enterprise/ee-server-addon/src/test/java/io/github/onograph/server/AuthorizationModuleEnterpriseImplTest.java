package io.github.onograph.server;

import static org.mockito.Mockito.mock;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.eclipse.jetty.io.ArrayByteBufferPool;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.api.net.DefaultNetworkConnectionTracker;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.server.web.Jetty9WebServer;

class AuthorizationModuleEnterpriseImplTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    ArrayList<Pattern> _listWuPattern = new ArrayList<Pattern>();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    Supplier<AuthManager> _supplierAmAuthManager = (Supplier<AuthManager>) mock(Supplier.class);
    Log4jLogProvider logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    Config config = mock(Config.class);
    DefaultNetworkConnectionTracker connectionTracker = new DefaultNetworkConnectionTracker();
    new AuthorizationModuleEnterpriseImpl(_config, _listWuPattern, _logProvider,
        _supplierAmAuthManager,
        new Jetty9WebServer(logProvider, config, connectionTracker, new ArrayByteBufferPool()));
  }
}

