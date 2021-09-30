package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.dbms.database.SystemGraphComponent;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;

class SecurityKnownSystemComponentVersionNextTest {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertEquals(SystemGraphComponent.Status.UNSUPPORTED_FUTURE,
        (new SecurityKnownSystemComponentVersionNext(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity())).getStatus());
  }

  @Test
  void testConstructor2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionNext actualSecurityKnownSystemComponentVersionNext =
        new SecurityKnownSystemComponentVersionNext(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(Integer.MIN_VALUE, actualSecurityKnownSystemComponentVersionNext.version);
    assertEquals("Unrecognized future version",
        actualSecurityKnownSystemComponentVersionNext.description);
    assertFalse(actualSecurityKnownSystemComponentVersionNext.isCurrent());
  }

  @Test
  void testAstutwhaoForPrElSe() throws UnsupportedOperationException {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertThrows(UnsupportedOperationException.class,
        () -> (new SecurityKnownSystemComponentVersionNext(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity())).astutwhaoForPrElSe(
            ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
            mock(Segment.class)));
  }

  @Test
  void testUnsupported() {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    (new SecurityKnownSystemComponentVersionNext(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).unsupported();
  }
}

