package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.DefaultSecurityLog;
import java.io.Closeable;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.Logger;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;

class EnterpriseDefaultLdapRealmTest {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenThrow(
        new IllegalStateException("foo"));
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    assertThrows(IllegalStateException.class,
        () -> new EnterpriseDefaultLdapRealm(_abstractSecurityLog, config, true,
            true, _logProvider, new SecureHasher()));

    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    LoggerContext loggerContext = mock(LoggerContext.class);
    when(loggerContext.getLogger((String) any())).thenReturn(mock(Logger.class));
    new Neo4jLoggerContext(loggerContext, mock(Closeable.class));

    LogProvider logProvider = mock(LogProvider.class);
    when(logProvider.getLog((Class<?>) any())).thenThrow(new IllegalStateException("foo"));
    assertThrows(IllegalStateException.class,
        () -> new EnterpriseDefaultLdapRealm(_abstractSecurityLog, config, true,
            true, logProvider, new SecureHasher()));

    verify(logProvider).getLog((Class<?>) any());
  }
}

