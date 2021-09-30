package io.github.onograph.server.security.auth.module;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.DefaultSecurityLog;
import java.util.HashMap;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.authz.permission.WildcardPermissionResolver;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class AuthorizingRealmPluginImplTest {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, null, new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isCaati());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
  }

  @Test
  void testConstructor2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthApiPlugin authApiPlugin = mock(AuthApiPlugin.class);
    when(authApiPlugin.name()).thenReturn("Name");
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, authApiPlugin, new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaati());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    assertEquals("plugin-Name", actualAuthorizingRealmPluginImpl.getName());
    assertEquals("plugin-Name.authenticationCache",
        actualAuthorizingRealmPluginImpl.getAuthenticationCacheName());
    assertEquals("plugin-Name.authorizationCache",
        actualAuthorizingRealmPluginImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
    verify(authApiPlugin).name();
  }

  @Test
  void testConstructor3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthApiPlugin authApiPlugin = mock(AuthApiPlugin.class);
    when(authApiPlugin.name()).thenReturn("");
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, authApiPlugin, new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaati());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
    verify(authApiPlugin).name();
  }

  @Test
  void testConstructor4() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isCaati());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaahi());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle"
            + "$AuthApiConnector", actualAuthorizingRealmPluginImpl.getName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authenticationCache",
        actualAuthorizingRealmPluginImpl.getAuthenticationCacheName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authorizationCache",
        actualAuthorizingRealmPluginImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
  }

  @Test
  void testConstructor5() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthenticationAuthApiLifecycle authenticationAuthApiLifecycle = mock(
        AuthenticationAuthApiLifecycle.class);
    when(authenticationAuthApiLifecycle.name()).thenReturn("Name");
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, authenticationAuthApiLifecycle,
        _paAuthorizationAuthApiLifecycle, new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaati());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaahi());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    assertEquals("plugin-Name", actualAuthorizingRealmPluginImpl.getName());
    assertEquals("plugin-Name.authenticationCache",
        actualAuthorizingRealmPluginImpl.getAuthenticationCacheName());
    assertEquals("plugin-Name.authorizationCache",
        actualAuthorizingRealmPluginImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
    verify(authenticationAuthApiLifecycle).name();
  }

  @Test
  void testConstructor6() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthenticationAuthApiLifecycle authenticationAuthApiLifecycle = mock(
        AuthenticationAuthApiLifecycle.class);
    when(authenticationAuthApiLifecycle.name()).thenReturn(null);
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, authenticationAuthApiLifecycle,
        _paAuthorizationAuthApiLifecycle, new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaati());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaahi());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
    verify(authenticationAuthApiLifecycle).name();
  }

  @Test
  void testConstructor7() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthenticationAuthApiLifecycle authenticationAuthApiLifecycle = mock(
        AuthenticationAuthApiLifecycle.class);
    when(authenticationAuthApiLifecycle.name()).thenReturn("");
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, authenticationAuthApiLifecycle,
        _paAuthorizationAuthApiLifecycle, new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaati());
    assertTrue(actualAuthorizingRealmPluginImpl.isCaahi());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
    verify(authenticationAuthApiLifecycle).name();
  }

  @Test
  void testConstructor8() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl actualAuthorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog,
        _clock, null, new SecureHasher());

    assertTrue(actualAuthorizingRealmPluginImpl.isCachingEnabled());
    assertTrue(actualAuthorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(actualAuthorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    PermissionResolver permissionResolver = actualAuthorizingRealmPluginImpl.getPermissionResolver();
    assertTrue(permissionResolver instanceof WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        actualAuthorizingRealmPluginImpl.getAuthenticationTokenClass());
    assertFalse(((WildcardPermissionResolver) permissionResolver).isCaseSensitive());
  }

  @Test
  void testDoGetAuthenticationInfo() throws AuthenticationException {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertNull(authorizingRealmPluginImpl.doGetAuthenticationInfo(
        new UsernamePasswordToken("janedoe", "iloveyou")));
  }

  @Test
  void testDoGetAuthenticationInfo2() throws AuthenticationException {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertThrows(AuthenticationException.class,
        () -> authorizingRealmPluginImpl.doGetAuthenticationInfo(
            new ShiroAuthToken(new HashMap<String, Object>(1))));
  }

  @Test
  void testDoGetAuthorizationInfo() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertNull(authorizingRealmPluginImpl.doGetAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testDoGetAuthorizationInfo2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, null, new SecureHasher());
    assertNull(authorizingRealmPluginImpl.doGetAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testDoGetAuthorizationInfo3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "Realm Name");
    assertNull(authorizingRealmPluginImpl.doGetAuthorizationInfo(simplePrincipalCollection));
  }

  @Test
  void testDoGetAuthorizationInfo4() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());
    assertNull(authorizingRealmPluginImpl.doGetAuthorizationInfo(new SimplePrincipalMap()));
  }

  @Test
  void testGeatznhAuthorizationInfo() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertNull(
        authorizingRealmPluginImpl.geatznhAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testGeatznhAuthorizationInfo2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, null, new SecureHasher());
    assertNull(
        authorizingRealmPluginImpl.geatznhAuthorizationInfo(new SimplePrincipalCollection()));
  }

  @Test
  void testGeatznhAuthorizationInfo3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    assertNull((new AuthorizingRealmPluginImpl(_abstractSecurityLog, _clock, null, null,
        _paAuthorizationAuthApiLifecycle, new SecureHasher())).geatznhAuthorizationInfo(null));
  }

  @Test
  void testGeatznhAuthorizationInfo4() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "Realm Name");
    assertNull(authorizingRealmPluginImpl.geatznhAuthorizationInfo(simplePrincipalCollection));
  }

  @Test
  void testGeatznhAuthorizationInfo5() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());
    assertNull(authorizingRealmPluginImpl.geatznhAuthorizationInfo(new SimplePrincipalMap()));
  }

  @Test
  void testGetAuthenticationCacheKey() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertEquals("janedoe",
        authorizingRealmPluginImpl.getAuthenticationCacheKey(
            new UsernamePasswordToken("janedoe", "iloveyou")));
  }

  @Test
  void testGetAuthenticationCacheKey2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    assertNull(
        (new AuthorizingRealmPluginImpl(_abstractSecurityLog, _clock, null, new SecureHasher()))
            .getAuthenticationCacheKey((AuthenticationToken) null));
  }

  @Test
  void testGetAuthenticationCacheKey3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertNull(
        authorizingRealmPluginImpl.getAuthenticationCacheKey(
            new ShiroAuthToken(new HashMap<String, Object>(1))));
  }

  @Test
  void testGetAuthorizationCacheKey() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertNull(
        authorizingRealmPluginImpl.getAuthorizationCacheKey(new SimplePrincipalCollection()));
  }

  @Test
  void testGetAuthorizationCacheKey2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());

    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "Realm Name");
    assertEquals("Principal",
        authorizingRealmPluginImpl.getAuthorizationCacheKey(simplePrincipalCollection));
  }

  @Test
  void testGetAuthorizationCacheKey3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertNull(authorizingRealmPluginImpl.getAuthorizationCacheKey(new SimplePrincipalMap()));
  }

  @Test
  void testGetAuthorizationCacheKey4() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());

    SimplePrincipalMap simplePrincipalMap = new SimplePrincipalMap();
    simplePrincipalMap.put("foo", "42");
    assertEquals("42", authorizingRealmPluginImpl.getAuthorizationCacheKey(simplePrincipalMap));
  }

  @Test
  void testIsCaahi() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    assertFalse((new AuthorizingRealmPluginImpl(_abstractSecurityLog, _clock, null,
        new SecureHasher())).isCaahi());
  }

  @Test
  void testIsCaahi2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    assertTrue((new AuthorizingRealmPluginImpl(_abstractSecurityLog, _clock, null, null,
        _paAuthorizationAuthApiLifecycle, new SecureHasher())).isCaahi());
  }

  @Test
  void testIsCaati() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    assertFalse((new AuthorizingRealmPluginImpl(_abstractSecurityLog, _clock, null,
        new SecureHasher())).isCaati());
  }

  @Test
  void testSetup() throws Exception {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    authorizingRealmPluginImpl.setup();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertFalse(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testSetup2() throws Exception {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());
    authorizingRealmPluginImpl.setup();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertTrue(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle"
            + "$AuthApiConnector", authorizingRealmPluginImpl.getName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authenticationCache",
        authorizingRealmPluginImpl.getAuthenticationCacheName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authorizationCache",
        authorizingRealmPluginImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testShutdown() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    authorizingRealmPluginImpl.shutdown();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertFalse(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testShutdown2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());
    authorizingRealmPluginImpl.shutdown();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertTrue(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle"
            + "$AuthApiConnector", authorizingRealmPluginImpl.getName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authenticationCache",
        authorizingRealmPluginImpl.getAuthenticationCacheName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authorizationCache",
        authorizingRealmPluginImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testStart() throws Exception {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    authorizingRealmPluginImpl.start();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertFalse(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testStart2() throws Exception {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());
    authorizingRealmPluginImpl.start();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertTrue(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle"
            + "$AuthApiConnector", authorizingRealmPluginImpl.getName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authenticationCache",
        authorizingRealmPluginImpl.getAuthenticationCacheName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authorizationCache",
        authorizingRealmPluginImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testStop() throws Exception {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    authorizingRealmPluginImpl.stop();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertFalse(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testStop2() throws Exception {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizationAuthApiLifecycle.AuthApiConnector _paAuthorizationAuthApiLifecycle = new AuthorizationAuthApiLifecycle.AuthApiConnector();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, null, _paAuthorizationAuthApiLifecycle,
        new SecureHasher());
    authorizingRealmPluginImpl.stop();
    assertTrue(authorizingRealmPluginImpl.isCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isCaati());
    assertTrue(authorizingRealmPluginImpl.isCaahi());
    assertTrue(authorizingRealmPluginImpl.isAuthorizationCachingEnabled());
    assertFalse(authorizingRealmPluginImpl.isAuthenticationCachingEnabled());
    assertTrue(authorizingRealmPluginImpl
        .getPermissionResolver() instanceof org.apache.shiro.authz.permission.WildcardPermissionResolver);
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle"
            + "$AuthApiConnector", authorizingRealmPluginImpl.getName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authenticationCache",
        authorizingRealmPluginImpl.getAuthenticationCacheName());
    assertEquals(
        "plugin-io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle$AuthApiConnector"
            + ".authorizationCache",
        authorizingRealmPluginImpl.getAuthorizationCacheName());
    Class<?> expectedAuthenticationTokenClass = UsernamePasswordToken.class;
    assertSame(expectedAuthenticationTokenClass,
        authorizingRealmPluginImpl.getAuthenticationTokenClass());
  }

  @Test
  void testSupports() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertFalse(
        authorizingRealmPluginImpl.supports(new UsernamePasswordToken("janedoe", "iloveyou")));
  }

  @Test
  void testSupports2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    FakeClock _clock = Clocks.fakeClock();
    AuthorizingRealmPluginImpl authorizingRealmPluginImpl = new AuthorizingRealmPluginImpl(
        _abstractSecurityLog, _clock,
        null, new SecureHasher());
    assertTrue(
        authorizingRealmPluginImpl.supports(new ShiroAuthToken(new HashMap<String, Object>(1))));
  }
}

