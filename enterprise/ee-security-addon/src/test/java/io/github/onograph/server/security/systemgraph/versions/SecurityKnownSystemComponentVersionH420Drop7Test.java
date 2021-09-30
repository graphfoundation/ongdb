package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.server.security.DefaultSecurityLog;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;

class SecurityKnownSystemComponentVersionH420Drop7Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionH420Drop7 actualSecurityKnownSystemComponentVersionH420Drop7 =
        new SecurityKnownSystemComponentVersionH420Drop7(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(7, actualSecurityKnownSystemComponentVersionH420Drop7.version);
    assertEquals("Neo4j 4.2.0-Drop07",
        actualSecurityKnownSystemComponentVersionH420Drop7.description);
    assertFalse(actualSecurityKnownSystemComponentVersionH420Drop7.isCurrent());
  }

  @Test
  void testIsSurudacForPr() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionH420Drop7(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionH420Drop7(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionH420Drop7(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionH420Drop7(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr4() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionH420Drop7(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.SHOW_INDEX));
  }
}

