package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.server.security.DefaultSecurityLog;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

class SecurityKnownSystemComponentVersionE41Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionE41 actualSecurityKnownSystemComponentVersionE41 =
        new SecurityKnownSystemComponentVersionE41(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(4, actualSecurityKnownSystemComponentVersionE41.version);
    assertEquals("Neo4j 4.1", actualSecurityKnownSystemComponentVersionE41.description);
    assertFalse(actualSecurityKnownSystemComponentVersionE41.isCurrent());
  }

  @Test
  void testGetmrpveSet() throws InvalidArgumentsException {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertEquals(1, (new SecurityKnownSystemComponentVersionE41(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).getmrpveSet()
        .size());
  }

  @Test
  void testIsSurudacForPr() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionE41(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionE41(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr3() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionE41(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.SET_LABEL));
  }

  @Test
  void testIsSurudacForPr4() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultSecurityLog _abstractSecurityLog1 = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionE41(_abstractSecurityLog,
        new SecurityKnownSystemComponentVersionE41(_abstractSecurityLog1,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }
}

