package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.systemgraph.AuthorizingRealmSystemImpl;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.cache.ExecutorBasedCaffeineCacheFactory;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.systemgraph.SystemGraphRealmHelper;

class AuthPrivilegeManagerTest {

  @Test
  void testConstructor() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Supplier<GraphDatabaseService> systemSupplier = (Supplier<GraphDatabaseService>) mock(
        Supplier.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        _caffeineCacheFactory, null, true, true,
        new SystemGraphRealmHelper(systemSupplier,
            new SecureHasher()));

    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenThrow(
        new IllegalStateException("foo"));
    assertThrows(IllegalStateException.class,
        () -> new AuthPrivilegeManager(authorizingRealmSystemImpl, config));

    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

