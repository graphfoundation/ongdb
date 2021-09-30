package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.DefaultSecurityLog;
import io.netty.channel.local.LocalAddress;
import java.io.Closeable;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.kernel.impl.api.security.OverriddenAccessMode;
import org.neo4j.kernel.impl.query.clientconnection.BoltConnectionInfo;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.auth.FileUserRepository;

class LocalAuthManagerTest {

  @Test
  void testConstructor() {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    LocalAuthManager actualLocalAuthManager = new LocalAuthManager(_abstractSecurityLog,
        _authenticationStrategy, true,
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"),
                    mock(Closeable.class)))));
    actualLocalAuthManager.claauch();
    actualLocalAuthManager.clneac();
    EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl subject = new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, new DefaultSecurityManager(),
            "Uname"));
    OverriddenAccessMode mode = new OverriddenAccessMode(
        new OverriddenAccessMode(new OverriddenAccessMode(null, AccessMode.Static.ACCESS),
            AccessMode.Static.ACCESS),
        AccessMode.Static.ACCESS);

    LocalAddress clientAddress = new LocalAddress("42");
    actualLocalAuthManager.log("foo", new SecurityContext(subject, mode,
        new BoltConnectionInfo("42", "Dr Jane Doe", clientAddress, new LocalAddress("42")),
        "Database"));
  }

  @Test
  void testGepiggatgcfList() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    assertTrue((new LocalAuthManager(_abstractSecurityLog, _authenticationStrategy, true,
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))))))
        .gepiggatgcfList()
        .isEmpty());
  }
}

