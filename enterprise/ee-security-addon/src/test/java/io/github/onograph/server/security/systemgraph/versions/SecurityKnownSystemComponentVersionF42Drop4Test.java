package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;

class SecurityKnownSystemComponentVersionF42Drop4Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionF42Drop4 actualSecurityKnownSystemComponentVersionF42Drop4 =
        new SecurityKnownSystemComponentVersionF42Drop4(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(5, actualSecurityKnownSystemComponentVersionF42Drop4.version);
    assertEquals("Neo4j 4.2.0-Drop04",
        actualSecurityKnownSystemComponentVersionF42Drop4.description);
    assertFalse(actualSecurityKnownSystemComponentVersionF42Drop4.isCurrent());
  }

  @Test
  void testAstutwhaoForPrElSe() throws UnsupportedOperationException {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    (new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).astutwhaoForPrElSe(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        mock(Segment.class));
  }

  @Test
  void testAstutwhaoForPrElSe2() throws UnsupportedOperationException {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog2 = new DefaultSecurityLog(new BufferingLog());
    (new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionL43Drop4(_abstractSecurityLog1,
            new SecurityKnownSystemComponentVersionC40(
                _abstractSecurityLog2,
                new DisabledSecurityKnownSystemComponentVersionSecurity())))).astutwhaoForPrElSe(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        mock(Segment.class));
  }

  @Test
  void testAstutwhaoForPrElSe3() throws UnsupportedOperationException {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog2 = new DefaultSecurityLog(new BufferingLog());
    (new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog1,
            new SecurityKnownSystemComponentVersionC40(
                _abstractSecurityLog2,
                new DisabledSecurityKnownSystemComponentVersionSecurity())))).astutwhaoForPrElSe(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        mock(Segment.class));
  }

  @Test
  void testIsSurudacForPr() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }
}

