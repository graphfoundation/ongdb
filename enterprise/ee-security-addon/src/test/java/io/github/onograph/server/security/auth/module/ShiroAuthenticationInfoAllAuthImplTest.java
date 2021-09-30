package io.github.onograph.server.security.auth.module;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import org.apache.shiro.subject.PrincipalCollection;
import org.junit.jupiter.api.Test;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.Neo4jPrincipal;

class ShiroAuthenticationInfoAllAuthImplTest {

  @Test
  void testCraShiroAuthenticationInfoAllAuthImpl() {
    PrincipalAndRolesProvider principalAndRolesProvider = mock(PrincipalAndRolesProvider.class);
    when(principalAndRolesProvider.prnpObject()).thenReturn("Prnp Object");
    when(principalAndRolesProvider.roeCollection()).thenReturn(new ArrayList<String>());
    ShiroAuthenticationInfoAllAuthImpl actualCraShiroAuthenticationInfoAllAuthImplResult = ShiroAuthenticationInfoAllAuthImpl
        .craShiroAuthenticationInfoAllAuthImpl(principalAndRolesProvider, "Realm");
    assertEquals(AuthenticationResult.SUCCESS,
        actualCraShiroAuthenticationInfoAllAuthImplResult.getAuthenticationResult());
    assertTrue(actualCraShiroAuthenticationInfoAllAuthImplResult.getRoles().isEmpty());
    assertNull(actualCraShiroAuthenticationInfoAllAuthImplResult.getCredentials());
    PrincipalCollection principals = actualCraShiroAuthenticationInfoAllAuthImplResult.getPrincipals();
    assertFalse(principals.isEmpty());
    Object primaryPrincipal = principals.getPrimaryPrincipal();
    assertTrue(primaryPrincipal instanceof Neo4jPrincipal);
    assertFalse(((Neo4jPrincipal) primaryPrincipal).getId().isPresent());
    assertEquals("Prnp Object", ((Neo4jPrincipal) primaryPrincipal).getUsername());
    verify(principalAndRolesProvider).prnpObject();
    verify(principalAndRolesProvider).roeCollection();
  }

  @Test
  void testCreceShiroAuthenticationInfoAllAuthImpl() {
    PrincipalAndRolesProvider principalAndRolesProvider = mock(PrincipalAndRolesProvider.class);
    when(principalAndRolesProvider.prnpObject()).thenReturn("Prnp Object");
    when(principalAndRolesProvider.roeCollection()).thenReturn(new ArrayList<String>());
    ShiroAuthenticationInfoAllAuthImpl actualCreceShiroAuthenticationInfoAllAuthImplResult = ShiroAuthenticationInfoAllAuthImpl
        .creceShiroAuthenticationInfoAllAuthImpl(principalAndRolesProvider, "Realm",
            new SecureHasher());
    assertEquals(AuthenticationResult.SUCCESS,
        actualCreceShiroAuthenticationInfoAllAuthImplResult.getAuthenticationResult());
    assertTrue(actualCreceShiroAuthenticationInfoAllAuthImplResult.getRoles().isEmpty());
    assertNull(actualCreceShiroAuthenticationInfoAllAuthImplResult.getCredentials());
    PrincipalCollection principals = actualCreceShiroAuthenticationInfoAllAuthImplResult.getPrincipals();
    assertFalse(principals.isEmpty());
    Object primaryPrincipal = principals.getPrimaryPrincipal();
    assertTrue(primaryPrincipal instanceof Neo4jPrincipal);
    assertFalse(((Neo4jPrincipal) primaryPrincipal).getId().isPresent());
    assertEquals("Prnp Object", ((Neo4jPrincipal) primaryPrincipal).getUsername());
    verify(principalAndRolesProvider).prnpObject();
    verify(principalAndRolesProvider).roeCollection();
  }
}

