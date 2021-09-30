package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;

class DisabledSecurityKnownSystemComponentVersionSecurityTest {

  @Test
  void testConstructor() {
    DisabledSecurityKnownSystemComponentVersionSecurity actualDisabledSecurityKnownSystemComponentVersionSecurity =
        new DisabledSecurityKnownSystemComponentVersionSecurity();
    assertEquals(-1, actualDisabledSecurityKnownSystemComponentVersionSecurity.version);
    assertEquals("no 'security-privileges' graph found",
        actualDisabledSecurityKnownSystemComponentVersionSecurity.description);
    assertFalse(actualDisabledSecurityKnownSystemComponentVersionSecurity.isCurrent());
  }

  @Test
  void testAstutwhaoForPrElSe() throws UnsupportedOperationException {
    assertThrows(UnsupportedOperationException.class,
        () -> (new DisabledSecurityKnownSystemComponentVersionSecurity()).astutwhaoForPrElSe(
            ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
            mock(Segment.class)));
  }
}

