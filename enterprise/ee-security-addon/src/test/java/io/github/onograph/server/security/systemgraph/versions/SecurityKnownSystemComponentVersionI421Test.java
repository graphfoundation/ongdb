package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.server.security.DefaultSecurityLog;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;

class SecurityKnownSystemComponentVersionI421Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionI421 actualSecurityKnownSystemComponentVersionI421 =
        new SecurityKnownSystemComponentVersionI421(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(8, actualSecurityKnownSystemComponentVersionI421.version);
    assertEquals("Neo4j 4.2.1", actualSecurityKnownSystemComponentVersionI421.description);
    assertFalse(actualSecurityKnownSystemComponentVersionI421.isCurrent());
  }

  @Test
  void testIsSurudacForPr() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionI421(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionI421(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionI421(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionI421(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }
}

