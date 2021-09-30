package io.github.onograph.server.security.systemgraph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.auth.module.ShiroAuthTokenAddonImpl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.authz.permission.WildcardPermissionResolver;
import org.apache.shiro.cache.MapCache;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalMap;
import org.junit.jupiter.api.Test;
import org.neo4j.cypher.internal.cache.ExecutorBasedCaffeineCacheFactory;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.systemgraph.SystemGraphRealmHelper;

class AuthorizingRealmSystemImplTest {

  @Test
  void testConstructor() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Supplier<GraphDatabaseService> systemSupplier = (Supplier<GraphDatabaseService>) mock(
        Supplier.class);
    AuthorizingRealmSystemImpl actualAuthorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy, _caffeineCacheFactory, null, true, true,
        new SystemGraphRealmHelper(systemSupplier, new SecureHasher()));

    assertTrue(actualAuthorizingRealmSystemImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmSystemImpl.isAuthorizationCachingEnabled());
    assertTrue(actualAuthorizingRealmSystemImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmSystemImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    assertEquals("native", actualAuthorizingRealmSystemImpl.getName());
    assertSame(actualAuthorizingRealmSystemImpl,
        actualAuthorizingRealmSystemImpl.getCredentialsMatcher());
    assertEquals("native.authenticationCache",
        actualAuthorizingRealmSystemImpl.getAuthenticationCacheName());
    assertEquals("native.authorizationCache",
        actualAuthorizingRealmSystemImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmSystemImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
  }

  @Test
  void testConstructor2() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Supplier<GraphDatabaseService> systemSupplier = (Supplier<GraphDatabaseService>) mock(
        Supplier.class);
    AuthorizingRealmSystemImpl actualAuthorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy, _caffeineCacheFactory, null, false, true,
        new SystemGraphRealmHelper(systemSupplier, new SecureHasher()));

    assertTrue(actualAuthorizingRealmSystemImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmSystemImpl.isAuthorizationCachingEnabled());
    assertTrue(actualAuthorizingRealmSystemImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmSystemImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    assertEquals("native", actualAuthorizingRealmSystemImpl.getName());
    assertSame(actualAuthorizingRealmSystemImpl,
        actualAuthorizingRealmSystemImpl.getCredentialsMatcher());
    assertEquals("native.authenticationCache",
        actualAuthorizingRealmSystemImpl.getAuthenticationCacheName());
    assertEquals("native.authorizationCache",
        actualAuthorizingRealmSystemImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmSystemImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
  }

  @Test
  void testClcfrl() {
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
    authorizingRealmSystemImpl.clcfrl();
    assertTrue(authorizingRealmSystemImpl.isCachingEnabled());
    assertTrue(authorizingRealmSystemImpl.isAuthorizationCachingEnabled());
    assertTrue(authorizingRealmSystemImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmSystemImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals("native", authorizingRealmSystemImpl.getName());
    assertSame(authorizingRealmSystemImpl, authorizingRealmSystemImpl.getCredentialsMatcher());
    assertEquals("native.authenticationCache",
        authorizingRealmSystemImpl.getAuthenticationCacheName());
    assertEquals("native.authorizationCache",
        authorizingRealmSystemImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmSystemImpl.getAuthenticationTokenClass());
  }

  @Test
  void testDoCredentialsMatch() {
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
    UsernamePasswordToken _authenticationToken = new UsernamePasswordToken("janedoe", "iloveyou");

    ShiroAuthenticationInfoSystemGdbImpl shiroAuthenticationInfoSystemGdbImpl = mock(
        ShiroAuthenticationInfoSystemGdbImpl.class);
    when(shiroAuthenticationInfoSystemGdbImpl.getRUser()).thenThrow(
        new IllegalStateException("foo"));
    assertThrows(IllegalStateException.class,
        () -> authorizingRealmSystemImpl.doCredentialsMatch(_authenticationToken,
            shiroAuthenticationInfoSystemGdbImpl));
    verify(shiroAuthenticationInfoSystemGdbImpl).getRUser();
  }

  @Test
  void testDoCredentialsMatch2() {
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
    ShiroAuthToken _authenticationToken = new ShiroAuthToken(new HashMap<String, Object>(1));
    ShiroAuthenticationInfoSystemGdbImpl shiroAuthenticationInfoSystemGdbImpl = mock(
        ShiroAuthenticationInfoSystemGdbImpl.class);
    when(shiroAuthenticationInfoSystemGdbImpl.getRUser()).thenReturn(mock(User.class));
    assertThrows(UnsupportedTokenException.class, () -> authorizingRealmSystemImpl
        .doCredentialsMatch(_authenticationToken, shiroAuthenticationInfoSystemGdbImpl));
    verify(shiroAuthenticationInfoSystemGdbImpl).getRUser();
  }

  @Test
  void testDoCredentialsMatch3() {
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
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getAuthTokenMap()).thenReturn(new HashMap<String, Object>(1));
    ShiroAuthenticationInfoSystemGdbImpl shiroAuthenticationInfoSystemGdbImpl = mock(
        ShiroAuthenticationInfoSystemGdbImpl.class);
    when(shiroAuthenticationInfoSystemGdbImpl.getRUser()).thenReturn(mock(User.class));
    assertThrows(UnsupportedTokenException.class, () -> authorizingRealmSystemImpl
        .doCredentialsMatch(shiroAuthTokenAddonImpl, shiroAuthenticationInfoSystemGdbImpl));
    verify(shiroAuthTokenAddonImpl).getAuthTokenMap();
    verify(shiroAuthenticationInfoSystemGdbImpl).getRUser();
  }

  @Test
  void testDoGetAuthenticationInfo() {
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
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getAuthTokenMap()).thenReturn(new HashMap<String, Object>(1));
    assertThrows(UnsupportedTokenException.class,
        () -> authorizingRealmSystemImpl.doGetAuthenticationInfo(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getAuthTokenMap();
  }

  @Test
  void testDoGetAuthenticationInfo2() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Supplier<GraphDatabaseService> systemSupplier = (Supplier<GraphDatabaseService>) mock(
        Supplier.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        _caffeineCacheFactory, null, false, true,
        new SystemGraphRealmHelper(systemSupplier,
            new SecureHasher()));
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getAuthTokenMap()).thenReturn(new HashMap<String, Object>(1));
    assertNull(authorizingRealmSystemImpl.doGetAuthenticationInfo(shiroAuthTokenAddonImpl));
  }

  @Test
  void testDoGetAuthenticationInfo3() {
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
    assertThrows(UnsupportedTokenException.class,
        () -> authorizingRealmSystemImpl.doGetAuthenticationInfo(
            new ShiroAuthToken(new HashMap<String, Object>(1))));
  }

  @Test
  void testDoGetAuthorizationInfo() {
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
    assertThrows(IllegalStateException.class,
        () -> authorizingRealmSystemImpl.doGetAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testDoGetAuthorizationInfo2() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Supplier<GraphDatabaseService> systemSupplier = (Supplier<GraphDatabaseService>) mock(
        Supplier.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        _caffeineCacheFactory, null, true, false,
        new SystemGraphRealmHelper(systemSupplier,
            new SecureHasher()));
    assertNull(authorizingRealmSystemImpl.doGetAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testDoGetAuthorizationInfo3() {
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

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertThrows(IllegalStateException.class,
        () -> authorizingRealmSystemImpl.doGetAuthorizationInfo(simplePrincipalCollection));
  }

  @Test
  void testDoGetAuthorizationInfo4() {
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

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe"),
        "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertNull(authorizingRealmSystemImpl.doGetAuthorizationInfo(simplePrincipalCollection));
  }

  @Test
  void testDoGetAuthorizationInfo5() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new NotFoundException("An error occurred"));
    SystemGraphRealmHelper _systemGraphRealmHelper = new SystemGraphRealmHelper(supplier,
        new SecureHasher());

    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        null, true, true, _systemGraphRealmHelper);

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe", "42"),
        "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertNull(authorizingRealmSystemImpl.doGetAuthorizationInfo(simplePrincipalCollection));
    verify(supplier).get();
  }

  @Test
  void testDoGetAuthorizationInfo6() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new NotFoundException("An error occurred"));
    SystemGraphRealmHelper _systemGraphRealmHelper = new SystemGraphRealmHelper(supplier,
        new SecureHasher());

    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        null, true, true, _systemGraphRealmHelper);

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe", Neo4jPrincipal.NO_ID),
        "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertNull(authorizingRealmSystemImpl.doGetAuthorizationInfo(simplePrincipalCollection));
    verify(supplier).get();
  }

  @Test
  void testGeatznhAuthorizationInfo() {
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
    assertThrows(IllegalStateException.class,
        () -> authorizingRealmSystemImpl.geatznhAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testGeatznhAuthorizationInfo2() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Supplier<GraphDatabaseService> systemSupplier = (Supplier<GraphDatabaseService>) mock(
        Supplier.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        _caffeineCacheFactory, null, true, false,
        new SystemGraphRealmHelper(systemSupplier,
            new SecureHasher()));
    assertNull(
        authorizingRealmSystemImpl.geatznhAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testGeatznhAuthorizationInfo3() {
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

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertThrows(IllegalStateException.class,
        () -> authorizingRealmSystemImpl.geatznhAuthorizationInfo(simplePrincipalCollection));
  }

  @Test
  void testGeatznhAuthorizationInfo4() {
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

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe"),
        "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertNull(authorizingRealmSystemImpl.geatznhAuthorizationInfo(simplePrincipalCollection));
  }

  @Test
  void testGeatznhAuthorizationInfo5() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new NotFoundException("An error occurred"));
    SystemGraphRealmHelper _systemGraphRealmHelper = new SystemGraphRealmHelper(supplier,
        new SecureHasher());

    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        null, true, true, _systemGraphRealmHelper);

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe", "42"),
        "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertNull(authorizingRealmSystemImpl.geatznhAuthorizationInfo(simplePrincipalCollection));
    verify(supplier).get();
  }

  @Test
  void testGeatznhAuthorizationInfo6() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenReturn(null);
    SystemGraphRealmHelper _systemGraphRealmHelper = new SystemGraphRealmHelper(supplier,
        new SecureHasher());

    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);

    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        null, true, true, _systemGraphRealmHelper);
    authorizingRealmSystemImpl.setAuthorizationCache(
        new MapCache<Object, AuthorizationInfo>("Name", new HashMap<Object, AuthorizationInfo>(1)));

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "NO_ID");
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe", "42"),
        "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertThrows(IllegalStateException.class,
        () -> authorizingRealmSystemImpl.geatznhAuthorizationInfo(simplePrincipalCollection));
  }

  @Test
  void testGeatznhAuthorizationInfo7() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new NotFoundException("An error occurred"));
    SystemGraphRealmHelper _systemGraphRealmHelper = new SystemGraphRealmHelper(supplier,
        new SecureHasher());

    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    AuthorizingRealmSystemImpl authorizingRealmSystemImpl = new AuthorizingRealmSystemImpl(
        _authenticationStrategy,
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        null, true, true, _systemGraphRealmHelper);

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe", Neo4jPrincipal.NO_ID),
        "*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
    assertNull(authorizingRealmSystemImpl.geatznhAuthorizationInfo(simplePrincipalCollection));
    verify(supplier).get();
  }

  @Test
  void testGepigfrrsHashSet() {
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
    assertTrue(authorizingRealmSystemImpl.gepigfrrsHashSet(new HashSet<String>()).isEmpty());
  }

  @Test
  void testGetAuthenticationCacheKey() {
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
    assertEquals("janedoe",
        authorizingRealmSystemImpl.getAuthenticationCacheKey(
            new UsernamePasswordToken("janedoe", "iloveyou")));
  }

  @Test
  void testGetAuthenticationCacheKey2() {
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
    assertEquals("", authorizingRealmSystemImpl.getAuthenticationCacheKey(
        new UsernamePasswordToken(null, "iloveyou")));
  }

  @Test
  void testGetAuthenticationCacheKey3() {
    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Supplier<GraphDatabaseService> systemSupplier = (Supplier<GraphDatabaseService>) mock(
        Supplier.class);
    assertEquals("",
        (new AuthorizingRealmSystemImpl(_authenticationStrategy, _caffeineCacheFactory, null, true,
            true,
            new SystemGraphRealmHelper(systemSupplier, new SecureHasher())))
            .getAuthenticationCacheKey((AuthenticationToken) null));
  }

  @Test
  void testGetAuthenticationCacheKey4() {
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
    assertEquals("",
        authorizingRealmSystemImpl.getAuthenticationCacheKey(
            new ShiroAuthToken(new HashMap<String, Object>(1))));
  }

  @Test
  void testGetAuthenticationCacheKey5() {
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
    assertEquals("",
        authorizingRealmSystemImpl.getAuthenticationCacheKey(new SimplePrincipalCollection()));
  }

  @Test
  void testGetAuthenticationCacheKey6() {
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

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "");
    assertEquals("Principal",
        authorizingRealmSystemImpl.getAuthenticationCacheKey(simplePrincipalCollection));
  }

  @Test
  void testGetAuthenticationCacheKey7() {
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
    assertEquals("",
        authorizingRealmSystemImpl.getAuthenticationCacheKey(new SimplePrincipalMap()));
  }

  @Test
  void testGetAuthenticationCacheKey8() {
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

    SimplePrincipalMap simplePrincipalMap = new SimplePrincipalMap();
    simplePrincipalMap.put("", "42");
    assertEquals("42", authorizingRealmSystemImpl.getAuthenticationCacheKey(simplePrincipalMap));
  }

  @Test
  void testGetAuthorizationCacheKey() {
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
    assertNull(
        authorizingRealmSystemImpl.getAuthorizationCacheKey(new SimplePrincipalCollection()));
  }

  @Test
  void testGetAuthorizationCacheKey2() {
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

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "Realm Name");
    assertEquals("Principal",
        authorizingRealmSystemImpl.getAuthorizationCacheKey(simplePrincipalCollection));
  }

  @Test
  void testGetAuthorizationCacheKey3() {
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
    assertNull(authorizingRealmSystemImpl.getAuthorizationCacheKey(new SimplePrincipalMap()));
  }

  @Test
  void testGetAuthorizationCacheKey4() {
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

    SimplePrincipalMap simplePrincipalMap = new SimplePrincipalMap();
    simplePrincipalMap.put("foo", "42");
    assertEquals("42", authorizingRealmSystemImpl.getAuthorizationCacheKey(simplePrincipalMap));
  }

  @Test
  void testGeuriString() {
    Supplier<GraphDatabaseService> supplier = (Supplier<GraphDatabaseService>) mock(Supplier.class);
    when(supplier.get()).thenThrow(new NotFoundException("An error occurred"));
    SystemGraphRealmHelper _systemGraphRealmHelper = new SystemGraphRealmHelper(supplier,
        new SecureHasher());

    AuthenticationStrategy _authenticationStrategy = mock(AuthenticationStrategy.class);
    assertNull((new AuthorizingRealmSystemImpl(_authenticationStrategy,
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), null, true, true,
        _systemGraphRealmHelper))
        .geuriString("Uname"));
    verify(supplier).get();
  }

  @Test
  void testSupports() {
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
    assertFalse(
        authorizingRealmSystemImpl.supports(new UsernamePasswordToken("janedoe", "iloveyou")));
  }

  @Test
  void testSupports2() throws InvalidAuthTokenException {
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
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getScheme()).thenReturn("Scheme");
    assertFalse(authorizingRealmSystemImpl.supports(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getScheme();
  }

  @Test
  void testSupports3() throws InvalidAuthTokenException {
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
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.getScheme()).thenThrow(
        new InvalidAuthTokenException("An error occurred"));
    assertFalse(authorizingRealmSystemImpl.supports(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getScheme();
  }

  @Test
  void testSupports4() throws InvalidAuthTokenException {
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
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.supportsRealm((String) any())).thenReturn(true);
    when(shiroAuthTokenAddonImpl.getScheme()).thenReturn("basic");
    assertTrue(authorizingRealmSystemImpl.supports(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getScheme();
    verify(shiroAuthTokenAddonImpl).supportsRealm((String) any());
  }

  @Test
  void testSupports5() throws InvalidAuthTokenException {
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
    ShiroAuthTokenAddonImpl shiroAuthTokenAddonImpl = mock(ShiroAuthTokenAddonImpl.class);
    when(shiroAuthTokenAddonImpl.supportsRealm((String) any())).thenReturn(false);
    when(shiroAuthTokenAddonImpl.getScheme()).thenReturn("basic");
    assertFalse(authorizingRealmSystemImpl.supports(shiroAuthTokenAddonImpl));
    verify(shiroAuthTokenAddonImpl).getScheme();
    verify(shiroAuthTokenAddonImpl).supportsRealm((String) any());
  }
}

