package io.github.onograph.server.security.auth.module;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.junit.jupiter.api.Test;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.Neo4jPrincipal;

class ShiroAuthenticationInfoAuthenticationOnlyImplTest {

  @Test
  void testCreceShiroAuthenticationInfoAuthenticationOnlyImpl() {
    PluginPrincipalService pluginPrincipalService = mock(PluginPrincipalService.class);
    when(pluginPrincipalService.getPrincipal()).thenReturn("Principal");
    ShiroAuthenticationInfoAuthenticationOnlyImpl actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult =
        ShiroAuthenticationInfoAuthenticationOnlyImpl
            .creceShiroAuthenticationInfoAuthenticationOnlyImpl(pluginPrincipalService, "Realm",
                new SecureHasher());
    assertEquals(AuthenticationResult.SUCCESS,
        actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getAuthenticationResult());
    assertNull(actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getCredentials());
    PrincipalCollection principals = actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getPrincipals();
    assertFalse(principals.isEmpty());
    Object primaryPrincipal = principals.getPrimaryPrincipal();
    assertTrue(primaryPrincipal instanceof Neo4jPrincipal);
    assertFalse(((Neo4jPrincipal) primaryPrincipal).getId().isPresent());
    assertEquals("Principal", ((Neo4jPrincipal) primaryPrincipal).getUsername());
    verify(pluginPrincipalService).getPrincipal();
  }

  @Test
  void testCreceShiroAuthenticationInfoAuthenticationOnlyImpl2() {
    PrincipalServiceCredentialCachingImpl principalServiceCredentialCachingImpl = mock(
        PrincipalServiceCredentialCachingImpl.class);
    when(principalServiceCredentialCachingImpl.getPrincipal()).thenReturn("Principal");
    when(principalServiceCredentialCachingImpl.getAuthTokenComparer()).thenReturn(null);
    ShiroAuthenticationInfoAuthenticationOnlyImpl actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult =
        ShiroAuthenticationInfoAuthenticationOnlyImpl
            .creceShiroAuthenticationInfoAuthenticationOnlyImpl(
                principalServiceCredentialCachingImpl, "foo",
                new SecureHasher());
    assertEquals(AuthenticationResult.SUCCESS,
        actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getAuthenticationResult());
    assertNull(actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getCredentials());
    PrincipalCollection principals = actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getPrincipals();
    assertFalse(principals.isEmpty());
    Object primaryPrincipal = principals.getPrimaryPrincipal();
    assertTrue(primaryPrincipal instanceof Neo4jPrincipal);
    assertFalse(((Neo4jPrincipal) primaryPrincipal).getId().isPresent());
    assertEquals("Principal", ((Neo4jPrincipal) primaryPrincipal).getUsername());
    verify(principalServiceCredentialCachingImpl).getAuthTokenComparer();
    verify(principalServiceCredentialCachingImpl).getPrincipal();
  }

  @Test
  void testCreceShiroAuthenticationInfoAuthenticationOnlyImpl3()
      throws UnsupportedEncodingException {
    PrincipalServiceDefaultImpl principalServiceDefaultImpl = mock(
        PrincipalServiceDefaultImpl.class);
    when(principalServiceDefaultImpl.getPrincipal()).thenReturn("Principal");
    when(principalServiceDefaultImpl.crdtl()).thenReturn("AAAAAAAA".getBytes("UTF-8"));
    ShiroAuthenticationInfoAuthenticationOnlyImpl actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult =
        ShiroAuthenticationInfoAuthenticationOnlyImpl
            .creceShiroAuthenticationInfoAuthenticationOnlyImpl(principalServiceDefaultImpl, "foo",
                new SecureHasher());
    assertEquals(AuthenticationResult.SUCCESS,
        actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getAuthenticationResult());
    ByteSource credentialsSalt = actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getCredentialsSalt();
    assertTrue(credentialsSalt instanceof org.apache.shiro.util.SimpleByteSource);
    assertTrue(
        actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getCredentials() instanceof byte[]);
    assertFalse(credentialsSalt.isEmpty());
    PrincipalCollection principals = actualCreceShiroAuthenticationInfoAuthenticationOnlyImplResult.getPrincipals();
    assertFalse(principals.isEmpty());
    Object primaryPrincipal = principals.getPrimaryPrincipal();
    assertTrue(primaryPrincipal instanceof Neo4jPrincipal);
    assertFalse(((Neo4jPrincipal) primaryPrincipal).getId().isPresent());
    assertEquals("Principal", ((Neo4jPrincipal) primaryPrincipal).getUsername());
    verify(principalServiceDefaultImpl).crdtl();
    verify(principalServiceDefaultImpl).getPrincipal();
  }
}

