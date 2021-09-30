package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.session.mgt.SimpleSession;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;

class EnterpriseLoginContextServiceDefaultImplTest {

  @Test
  void testAuthSubjectStandardImplClantin() {

    (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, new DefaultSecurityManager(),
            "Uname"))).clantin();
  }

  @Test
  void testAuthSubjectStandardImplClantin2() {

    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    defaultSecurityManager.setAuthorizer(new ModularRealmAuthorizer());
    (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, defaultSecurityManager,
            "Uname"))).clantin();
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString() {
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, "Host Name Or Ip", true, true,
                _picplPrincipalCollection, _securityManager, _session,
                new ShiroAuthenticationInfo())))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString2() {
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    assertEquals("invalid principal or credentials",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.FAILURE, "Host Name Or Ip", true, true,
                _picplPrincipalCollection, _securityManager, _session,
                new ShiroAuthenticationInfo())))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString3() {
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    assertEquals("too many failed attempts",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.TOO_MANY_ATTEMPTS, "Host Name Or Ip",
                true, true,
                _picplPrincipalCollection, _securityManager, _session,
                new ShiroAuthenticationInfo())))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString4() {
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    assertEquals("password change required",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.PASSWORD_CHANGE_REQUIRED,
                "Host Name Or Ip", true, true,
                _picplPrincipalCollection, _securityManager, _session,
                new ShiroAuthenticationInfo())))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString5() {
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    assertEquals("invalid principal or credentials",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(
                AuthenticationResult.FAILURE, "Host Name Or Ip", true, true,
                _picplPrincipalCollection, _securityManager,
                _session,
                new ShiroAuthenticationInfo(new Neo4jPrincipal("janedoe"), "Realm Name",
                    AuthenticationResult.SUCCESS))))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString6() {
    ShiroAuthenticationInfo shiroAuthenticationInfo = new ShiroAuthenticationInfo();
    shiroAuthenticationInfo.addThrowable(new Throwable());
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    assertEquals("invalid principal or credentials",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.FAILURE, "Host Name Or Ip", true, true,
                _picplPrincipalCollection, _securityManager, new SimpleSession(),
                shiroAuthenticationInfo)))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString7() {
    ShiroAuthenticationInfo shiroAuthenticationInfo = new ShiroAuthenticationInfo();
    shiroAuthenticationInfo.addThrowable(new IOException("An error occurred"));
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    assertEquals("invalid principal or credentials (An error occurred)",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.FAILURE, "Host Name Or Ip", true, true,
                _picplPrincipalCollection, _securityManager, new SimpleSession(),
                shiroAuthenticationInfo)))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGeatioflmeeString8() {
    ShiroAuthenticationInfo shiroAuthenticationInfo = new ShiroAuthenticationInfo();
    shiroAuthenticationInfo.addThrowable(new IOException(new Throwable()));
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    assertEquals("invalid principal or credentials (java.lang.Throwable)",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.FAILURE, "Host Name Or Ip", true, true,
                _picplPrincipalCollection, _securityManager, new SimpleSession(),
                shiroAuthenticationInfo)))
            .geatioflmeeString());
  }

  @Test
  void testAuthSubjectStandardImplGetAuthenticationResult() {
    assertEquals(AuthenticationResult.SUCCESS,
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, new DefaultSecurityManager(),
                "Uname")))
            .getAuthenticationResult());
  }

  @Test
  void testAuthSubjectStandardImplGetAuthenticationResult2() {
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    defaultSecurityManager.setAuthorizer(new ModularRealmAuthorizer());
    assertEquals(AuthenticationResult.SUCCESS,
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, defaultSecurityManager,
                "Uname")))
            .getAuthenticationResult());
  }

  @Test
  void testAuthSubjectStandardImplHasUsername() {
    assertTrue((new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, new DefaultSecurityManager(),
            "Uname")))
        .hasUsername("Uname"));
    assertFalse((new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, new DefaultSecurityManager(),
            "error")))
        .hasUsername("Uname"));
    assertFalse((new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, new DefaultSecurityManager(),
            "Uname")))
        .hasUsername(null));
  }

  @Test
  void testAuthSubjectStandardImplHasUsername2() {
    SimplePrincipalCollection _picplPrincipalCollection = new SimplePrincipalCollection();
    DefaultSecurityManager _securityManager = new DefaultSecurityManager();
    SimpleSession _session = new SimpleSession();
    assertFalse((new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, "Host Name Or Ip", true, true,
            _picplPrincipalCollection, _securityManager, _session, new ShiroAuthenticationInfo())))
        .hasUsername("Uname"));
  }

  @Test
  void testAuthSubjectStandardImplUsername() {
    assertEquals("Uname",
        (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
            new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, new DefaultSecurityManager(),
                "Uname")))
            .username());
  }

  @Test
  void testAuthSubjectStandardImplUsername2() {
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    defaultSecurityManager.setAuthorizer(new ModularRealmAuthorizer());
    assertEquals("Uname", (new EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl(
        new DelegatingSubjectImpl(AuthenticationResult.SUCCESS, defaultSecurityManager,
            "Uname"))).username());
  }
}

