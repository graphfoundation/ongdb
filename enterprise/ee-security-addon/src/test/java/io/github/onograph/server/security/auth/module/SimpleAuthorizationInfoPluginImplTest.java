package io.github.onograph.server.security.auth.module;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SimpleAuthorizationInfoPluginImplTest {

  @Test
  void testCraSimpleAuthorizationInfoPluginImpl() {
    RolesProvider rolesProvider = mock(RolesProvider.class);
    when(rolesProvider.roeCollection()).thenReturn(new ArrayList<String>());
    assertTrue(
        SimpleAuthorizationInfoPluginImpl.craSimpleAuthorizationInfoPluginImpl(rolesProvider)
            .getRoles().isEmpty());
    verify(rolesProvider).roeCollection();
  }
}

