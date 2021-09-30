package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.server.security.DefaultSecurityLog;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;

class SecurityKnownSystemComponentVersionG420Drop6Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionG420Drop6 actualSecurityKnownSystemComponentVersionG420Drop6 =
        new SecurityKnownSystemComponentVersionG420Drop6(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(6, actualSecurityKnownSystemComponentVersionG420Drop6.version);
    assertEquals("Neo4j 4.2.0-Drop06",
        actualSecurityKnownSystemComponentVersionG420Drop6.description);
    assertFalse(actualSecurityKnownSystemComponentVersionG420Drop6.isCurrent());
  }

  @Test
  void testIsSurudacForPr() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionG420Drop6(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionG420Drop6(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionG420Drop6(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionG420Drop6(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }
}

