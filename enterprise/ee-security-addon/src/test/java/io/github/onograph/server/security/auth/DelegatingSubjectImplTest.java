package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.session.mgt.SimpleSession;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;

class DelegatingSubjectImplTest {

  @Test
  void testConstructor() {
    DelegatingSubjectImpl actualDelegatingSubjectImpl = new DelegatingSubjectImpl(
        AuthenticationResult.SUCCESS,
        new DefaultSecurityManager(), "Uname");
    actualDelegatingSubjectImpl.upaurmForSt("Uname");
    assertEquals(AuthenticationResult.SUCCESS,
        actualDelegatingSubjectImpl.getAuthenticationResult());
    assertNull(actualDelegatingSubjectImpl.getShiroAuthenticationInfo());
    assertEquals("Uname", actualDelegatingSubjectImpl.getUname());
  }

  @Test
  void testConstructor2() {
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    ShiroAuthenticationInfo shiroAuthenticationInfo = new ShiroAuthenticationInfo();
    DelegatingSubjectImpl actualDelegatingSubjectImpl = new DelegatingSubjectImpl(
        AuthenticationResult.SUCCESS,
        "Host Name Or Ip", true, true, _picplPrincipalCollection,
        defaultSecurityManager, _session,
        shiroAuthenticationInfo);

    assertEquals(AuthenticationResult.SUCCESS,
        actualDelegatingSubjectImpl.getAuthenticationResult());
    assertFalse(actualDelegatingSubjectImpl.isRunAs());
    assertFalse(actualDelegatingSubjectImpl.isRemembered());
    assertFalse(actualDelegatingSubjectImpl.isAuthenticated());
    assertNull(actualDelegatingSubjectImpl.getUname());
    assertSame(shiroAuthenticationInfo, actualDelegatingSubjectImpl.getShiroAuthenticationInfo());
    assertEquals("Host Name Or Ip", actualDelegatingSubjectImpl.getHost());
    assertSame(defaultSecurityManager, actualDelegatingSubjectImpl.getSecurityManager());
  }

  @Test
  void testConstructor3() {
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    ShiroAuthenticationInfo shiroAuthenticationInfo = new ShiroAuthenticationInfo();
    DelegatingSubjectImpl actualDelegatingSubjectImpl = new DelegatingSubjectImpl(
        AuthenticationResult.SUCCESS,
        "Host Name Or Ip", true, true, null, defaultSecurityManager, _session,
        shiroAuthenticationInfo);

    assertEquals(AuthenticationResult.SUCCESS,
        actualDelegatingSubjectImpl.getAuthenticationResult());
    assertFalse(actualDelegatingSubjectImpl.isRunAs());
    assertFalse(actualDelegatingSubjectImpl.isRemembered());
    assertFalse(actualDelegatingSubjectImpl.isAuthenticated());
    assertNull(actualDelegatingSubjectImpl.getUname());
    assertSame(shiroAuthenticationInfo, actualDelegatingSubjectImpl.getShiroAuthenticationInfo());
    assertEquals("Host Name Or Ip", actualDelegatingSubjectImpl.getHost());
    assertSame(defaultSecurityManager, actualDelegatingSubjectImpl.getSecurityManager());
  }

  @Test
  void testConstructor4() {
    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add("Principal", "Realm Name");
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    ShiroAuthenticationInfo shiroAuthenticationInfo = new ShiroAuthenticationInfo();
    DelegatingSubjectImpl actualDelegatingSubjectImpl = new DelegatingSubjectImpl(
        AuthenticationResult.SUCCESS,
        "Host Name Or Ip", true, true, simplePrincipalCollection,
        defaultSecurityManager, _session,
        shiroAuthenticationInfo);

    assertEquals(AuthenticationResult.SUCCESS,
        actualDelegatingSubjectImpl.getAuthenticationResult());
    assertFalse(actualDelegatingSubjectImpl.isRunAs());
    assertFalse(actualDelegatingSubjectImpl.isRemembered());
    assertEquals("Principal", actualDelegatingSubjectImpl.getUname());
    assertSame(shiroAuthenticationInfo, actualDelegatingSubjectImpl.getShiroAuthenticationInfo());
    assertEquals("Host Name Or Ip", actualDelegatingSubjectImpl.getHost());
    assertEquals("Principal", actualDelegatingSubjectImpl.getPrincipal());
    assertSame(defaultSecurityManager, actualDelegatingSubjectImpl.getSecurityManager());
  }

  @Test
  void testConstructor5() {
    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
    simplePrincipalCollection.add(new Neo4jPrincipal("janedoe"), "Realm Name");
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    ShiroAuthenticationInfo shiroAuthenticationInfo = new ShiroAuthenticationInfo();
    DelegatingSubjectImpl actualDelegatingSubjectImpl = new DelegatingSubjectImpl(
        AuthenticationResult.SUCCESS,
        "Host Name Or Ip", true, true, simplePrincipalCollection,
        defaultSecurityManager, _session,
        shiroAuthenticationInfo);

    assertEquals(AuthenticationResult.SUCCESS,
        actualDelegatingSubjectImpl.getAuthenticationResult());
    assertFalse(actualDelegatingSubjectImpl.isRunAs());
    assertFalse(actualDelegatingSubjectImpl.isRemembered());
    assertEquals("janedoe", actualDelegatingSubjectImpl.getUname());
    assertSame(shiroAuthenticationInfo, actualDelegatingSubjectImpl.getShiroAuthenticationInfo());
    assertEquals("Host Name Or Ip", actualDelegatingSubjectImpl.getHost());
    assertSame(defaultSecurityManager, actualDelegatingSubjectImpl.getSecurityManager());
  }

  @Test
  void testConstructor6() {
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    DelegatingSubjectImpl actualDelegatingSubjectImpl = new DelegatingSubjectImpl(
        AuthenticationResult.SUCCESS,
        defaultSecurityManager, "Uname");

    assertEquals(AuthenticationResult.SUCCESS,
        actualDelegatingSubjectImpl.getAuthenticationResult());
    assertTrue(actualDelegatingSubjectImpl.isRemembered());
    assertFalse(actualDelegatingSubjectImpl.isAuthenticated());
    assertEquals("Uname", actualDelegatingSubjectImpl.getUname());
    assertSame(defaultSecurityManager, actualDelegatingSubjectImpl.getSecurityManager());
    assertNull(actualDelegatingSubjectImpl.getHost());
    PrincipalCollection principals = actualDelegatingSubjectImpl.getPrincipals();
    assertEquals("Uname", principals.toString());
    assertFalse(principals.isEmpty());
  }

  @Test
  void testConstructor7() {
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    DelegatingSubjectImpl actualDelegatingSubjectImpl = new DelegatingSubjectImpl(
        AuthenticationResult.SUCCESS,
        defaultSecurityManager, "Uname");

    assertEquals(AuthenticationResult.SUCCESS,
        actualDelegatingSubjectImpl.getAuthenticationResult());
    assertTrue(actualDelegatingSubjectImpl.isRemembered());
    assertFalse(actualDelegatingSubjectImpl.isAuthenticated());
    assertEquals("Uname", actualDelegatingSubjectImpl.getUname());
    assertSame(defaultSecurityManager, actualDelegatingSubjectImpl.getSecurityManager());
    assertNull(actualDelegatingSubjectImpl.getHost());
    PrincipalCollection principals = actualDelegatingSubjectImpl.getPrincipals();
    assertEquals("Uname", principals.toString());
    assertFalse(principals.isEmpty());
  }
}

