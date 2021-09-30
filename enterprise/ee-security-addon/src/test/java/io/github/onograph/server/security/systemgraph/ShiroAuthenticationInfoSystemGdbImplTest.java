package io.github.onograph.server.security.systemgraph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.apache.shiro.subject.PrincipalCollection;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.server.security.auth.Neo4jPrincipal;

class ShiroAuthenticationInfoSystemGdbImplTest {

  @Test
  void testConstructor() {
    ShiroAuthenticationInfoSystemGdbImpl actualShiroAuthenticationInfoSystemGdbImpl = new ShiroAuthenticationInfoSystemGdbImpl(
        mock(User.class), "Realm");
    actualShiroAuthenticationInfoSystemGdbImpl.seatioruForAu(AuthenticationResult.SUCCESS);
    assertEquals(AuthenticationResult.SUCCESS,
        actualShiroAuthenticationInfoSystemGdbImpl.getAuthenticationResult());
  }

  @Test
  void testConstructor2() {
    ShiroAuthenticationInfoSystemGdbImpl actualShiroAuthenticationInfoSystemGdbImpl = new ShiroAuthenticationInfoSystemGdbImpl(
        mock(User.class), "Realm");

    assertEquals(AuthenticationResult.FAILURE,
        actualShiroAuthenticationInfoSystemGdbImpl.getAuthenticationResult());
    assertNull(actualShiroAuthenticationInfoSystemGdbImpl.getCredentials());
    PrincipalCollection principals = actualShiroAuthenticationInfoSystemGdbImpl.getPrincipals();
    assertFalse(principals.isEmpty());
    Object primaryPrincipal = principals.getPrimaryPrincipal();
    assertTrue(primaryPrincipal instanceof Neo4jPrincipal);
    assertFalse(((Neo4jPrincipal) primaryPrincipal).getId().isPresent());
    assertNull(((Neo4jPrincipal) primaryPrincipal).getUsername());
  }
}

