package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.server.security.DefaultSecurityLog;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

class SecurityKnownSystemComponentVersionD41Drop1Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionD41Drop1 actualSecurityKnownSystemComponentVersionD41Drop1 =
        new SecurityKnownSystemComponentVersionD41Drop1(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(3, actualSecurityKnownSystemComponentVersionD41Drop1.version);
    assertEquals("Neo4j 4.1.0-Drop01",
        actualSecurityKnownSystemComponentVersionD41Drop1.description);
    assertFalse(actualSecurityKnownSystemComponentVersionD41Drop1.isCurrent());
  }

  @Test
  void testGetmrpveSet() throws InvalidArgumentsException {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertEquals(1, (new SecurityKnownSystemComponentVersionD41Drop1(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).getmrpveSet()
        .size());
  }

  @Test
  void testIsSurudacForPr() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionD41Drop1(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionD41Drop1(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionD41Drop1(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionD41Drop1(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testMaprebiGdbPrivGenerator() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    GdbPrivGenerator actualMaprebiGdbPrivGeneratorResult = (new SecurityKnownSystemComponentVersionD41Drop1(
        _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity()))
        .maprebiGdbPrivGenerator(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, "admin");
    assertEquals(1, actualMaprebiGdbPrivGeneratorResult.setAcisPrivilegeAction.size());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualMaprebiGdbPrivGeneratorResult.prveteEntitlementActionType);
    assertEquals("", actualMaprebiGdbPrivGeneratorResult.gdbName);
  }
}

