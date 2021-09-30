package io.github.onograph.server.security.systemgraph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.auth.module.ShiroAuthTokenAddonImpl;
import java.io.Closeable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.authz.permission.WildcardPermissionResolver;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.logging.DuplicatingLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.auth.FileUserRepository;
import org.neo4j.server.security.auth.ShiroAuthToken;

class AuthorizingRealmFileImplTest {

  @Test
  void testConstructor() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl actualAuthorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy,
        " str Us", new FileUserRepository(fileSystem, path,
        new Log4jLogProvider(
            new Neo4jLoggerContext(
                new LoggerContext(
                    "Name"),
                mock(Closeable.class)))));

    assertTrue(actualAuthorizingRealmFileImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmFileImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmFileImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmFileImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    assertEquals("File", actualAuthorizingRealmFileImpl.getName());
    assertSame(actualAuthorizingRealmFileImpl,
        actualAuthorizingRealmFileImpl.getCredentialsMatcher());
    assertEquals("File.authenticationCache",
        actualAuthorizingRealmFileImpl.getAuthenticationCacheName());
    assertEquals("File.authorizationCache",
        actualAuthorizingRealmFileImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmFileImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
  }

  @Test
  void testDoCredentialsMatch() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    UsernamePasswordToken _authenticationToken = new UsernamePasswordToken("janedoe", "iloveyou");

    ShiroAuthenticationInfoSystemGdbImpl shiroAuthenticationInfoSystemGdbImpl = mock(
        ShiroAuthenticationInfoSystemGdbImpl.class);
    when(shiroAuthenticationInfoSystemGdbImpl.getRUser())
        .thenThrow(new IncorrectCredentialsException("An error occurred"));
    assertThrows(IncorrectCredentialsException.class,
        () -> authorizingRealmFileImpl.doCredentialsMatch(_authenticationToken,
            shiroAuthenticationInfoSystemGdbImpl));
    verify(shiroAuthenticationInfoSystemGdbImpl).getRUser();
  }

  @Test
  void testDoCredentialsMatch2() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    ShiroAuthToken _authenticationToken = new ShiroAuthToken(new HashMap<String, Object>(1));
    ShiroAuthenticationInfoSystemGdbImpl shiroAuthenticationInfoSystemGdbImpl = mock(
        ShiroAuthenticationInfoSystemGdbImpl.class);
    when(shiroAuthenticationInfoSystemGdbImpl.getRUser()).thenReturn(mock(User.class));
    assertThrows(UnsupportedTokenException.class,
        () -> authorizingRealmFileImpl.doCredentialsMatch(_authenticationToken,
            shiroAuthenticationInfoSystemGdbImpl));
    verify(shiroAuthenticationInfoSystemGdbImpl).getRUser();
  }

  @Test
  void testDoCredentialsMatch3() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getAuthTokenMap()).thenReturn(new HashMap<String, Object>(1));
    ShiroAuthenticationInfoSystemGdbImpl shiroAuthenticationInfoSystemGdbImpl = mock(
        ShiroAuthenticationInfoSystemGdbImpl.class);
    when(shiroAuthenticationInfoSystemGdbImpl.getRUser()).thenReturn(mock(User.class));
    assertThrows(UnsupportedTokenException.class, () -> authorizingRealmFileImpl
        .doCredentialsMatch(shiroAuthTokenAddonImpl, shiroAuthenticationInfoSystemGdbImpl));
    verify(shiroAuthTokenAddonImpl).getAuthTokenMap();
    verify(shiroAuthenticationInfoSystemGdbImpl).getRUser();
  }

  @Test
  void testDoGetAuthenticationInfo() throws AuthenticationException {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getPrincipal()).thenReturn("Principal");
    assertThrows(UnknownAccountException.class,
        () -> authorizingRealmFileImpl.doGetAuthenticationInfo(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getPrincipal();
  }

  @Test
  void testDoGetAuthenticationInfo2() throws AuthenticationException {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getPrincipal()).thenReturn(null);
    assertThrows(UnknownAccountException.class,
        () -> authorizingRealmFileImpl.doGetAuthenticationInfo(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getPrincipal();
  }

  @Test
  void testDoGetAuthorizationInfo() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    assertNull(authorizingRealmFileImpl.doGetAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testGeatznhAuthorizationInfo() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    assertNull(authorizingRealmFileImpl.geatznhAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testSetup() throws Exception {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    authorizingRealmFileImpl.setup();
    assertTrue(authorizingRealmFileImpl.isCachingEnabled());
    assertTrue(authorizingRealmFileImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmFileImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmFileImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals("File", authorizingRealmFileImpl.getName());
    assertSame(authorizingRealmFileImpl, authorizingRealmFileImpl.getCredentialsMatcher());
    assertEquals("File.authenticationCache", authorizingRealmFileImpl.getAuthenticationCacheName());
    assertEquals("File.authorizationCache", authorizingRealmFileImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmFileImpl.getAuthenticationTokenClass());
  }

  @Test
  void testSetup2() throws Exception {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Log4jLogProvider logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new DuplicatingLogProvider(logProvider1,
                new Log4jLogProvider(
                    new Neo4jLoggerContext(
                        new LoggerContext(
                            "Name"),
                        mock(Closeable.class))))));
    authorizingRealmFileImpl.setup();
    assertTrue(authorizingRealmFileImpl.isCachingEnabled());
    assertTrue(authorizingRealmFileImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmFileImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmFileImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals("File", authorizingRealmFileImpl.getName());
    assertSame(authorizingRealmFileImpl, authorizingRealmFileImpl.getCredentialsMatcher());
    assertEquals("File.authenticationCache", authorizingRealmFileImpl.getAuthenticationCacheName());
    assertEquals("File.authorizationCache", authorizingRealmFileImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmFileImpl.getAuthenticationTokenClass());
  }

  @Test
  void testShutdown() throws Exception {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    authorizingRealmFileImpl.shutdown();
    assertTrue(authorizingRealmFileImpl.isCachingEnabled());
    assertTrue(authorizingRealmFileImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmFileImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmFileImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals("File", authorizingRealmFileImpl.getName());
    assertSame(authorizingRealmFileImpl, authorizingRealmFileImpl.getCredentialsMatcher());
    assertEquals("File.authenticationCache", authorizingRealmFileImpl.getAuthenticationCacheName());
    assertEquals("File.authorizationCache", authorizingRealmFileImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmFileImpl.getAuthenticationTokenClass());
  }

  @Test
  void testShutdown2() throws Exception {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Log4jLogProvider logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new DuplicatingLogProvider(logProvider1,
                new Log4jLogProvider(
                    new Neo4jLoggerContext(
                        new LoggerContext(
                            "Name"),
                        mock(Closeable.class))))));
    authorizingRealmFileImpl.shutdown();
    assertTrue(authorizingRealmFileImpl.isCachingEnabled());
    assertTrue(authorizingRealmFileImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmFileImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmFileImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals("File", authorizingRealmFileImpl.getName());
    assertSame(authorizingRealmFileImpl, authorizingRealmFileImpl.getCredentialsMatcher());
    assertEquals("File.authenticationCache", authorizingRealmFileImpl.getAuthenticationCacheName());
    assertEquals("File.authorizationCache", authorizingRealmFileImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmFileImpl.getAuthenticationTokenClass());
  }

  @Test
  void testStart() throws Exception {

    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("Key"), "test.txt");
    (new AuthorizingRealmFileImpl(_authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"),
                    mock(Closeable.class)))))).start();
  }

  @Test
  void testStop() throws Exception {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    authorizingRealmFileImpl.stop();
    assertTrue(authorizingRealmFileImpl.isCachingEnabled());
    assertTrue(authorizingRealmFileImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmFileImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmFileImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals("File", authorizingRealmFileImpl.getName());
    assertSame(authorizingRealmFileImpl, authorizingRealmFileImpl.getCredentialsMatcher());
    assertEquals("File.authenticationCache", authorizingRealmFileImpl.getAuthenticationCacheName());
    assertEquals("File.authorizationCache", authorizingRealmFileImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmFileImpl.getAuthenticationTokenClass());
  }

  @Test
  void testStop2() throws Exception {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Log4jLogProvider logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new DuplicatingLogProvider(logProvider1,
                new Log4jLogProvider(
                    new Neo4jLoggerContext(
                        new LoggerContext(
                            "Name"),
                        mock(Closeable.class))))));
    authorizingRealmFileImpl.stop();
    assertTrue(authorizingRealmFileImpl.isCachingEnabled());
    assertTrue(authorizingRealmFileImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmFileImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmFileImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals("File", authorizingRealmFileImpl.getName());
    assertSame(authorizingRealmFileImpl, authorizingRealmFileImpl.getCredentialsMatcher());
    assertEquals("File.authenticationCache", authorizingRealmFileImpl.getAuthenticationCacheName());
    assertEquals("File.authorizationCache", authorizingRealmFileImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmFileImpl.getAuthenticationTokenClass());
  }

  @Test
  void testSupports() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    assertFalse(
        authorizingRealmFileImpl.supports(new UsernamePasswordToken("janedoe", "iloveyou")));
  }

  @Test
  void testSupports2() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    AuthorizingRealmFileImpl authorizingRealmFileImpl = new AuthorizingRealmFileImpl(
        _authenticationStrategy, " str Us",
        new FileUserRepository(fileSystem, path,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getAuthTokenMap()).thenReturn(new HashMap<String, Object>(1));
    assertFalse(authorizingRealmFileImpl.supports(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getAuthTokenMap();
  }
}

