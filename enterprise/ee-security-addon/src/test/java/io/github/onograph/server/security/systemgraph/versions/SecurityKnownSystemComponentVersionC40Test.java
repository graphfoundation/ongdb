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
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.logging.DuplicatingLog;

class SecurityKnownSystemComponentVersionC40Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionC40 actualSecurityKnownSystemComponentVersionC40 =
        new SecurityKnownSystemComponentVersionC40(
            _abstractSecurityLog, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(2, actualSecurityKnownSystemComponentVersionC40.version);
    assertEquals("Neo4j 4.0", actualSecurityKnownSystemComponentVersionC40.description);
    assertFalse(actualSecurityKnownSystemComponentVersionC40.isCurrent());
  }

  @Test
  void testAstutwhaoForPrElSe() throws UnsupportedOperationException {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).astutwhaoForPrElSe(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        mock(Segment.class));
  }

  @Test
  void testAstutwhaoForPrElSe2() throws UnsupportedOperationException {

    BufferingLog log1 = new BufferingLog();
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(
        new DuplicatingLog(log1, new BufferingLog()));
    (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).astutwhaoForPrElSe(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        mock(Segment.class));
  }

  @Test
  void testGetmrpveSet() throws InvalidArgumentsException {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertEquals(1, (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).getmrpveSet()
        .size());
  }

  @Test
  void testIsSurudacForPr() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertTrue((new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.ACCESS));
  }

  @Test
  void testIsSurudacForPr2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertFalse((new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
        new DisabledSecurityKnownSystemComponentVersionSecurity())).isSurudacForPr(
        PrivilegeAction.SET_LABEL));
  }

  @Test
  void testMaprebiGdbPrivGenerator() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertEquals(2,
        ((GdbPrivGeneratorImpl) (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity())).maprebiGdbPrivGenerator(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
            "SCHEMA")).setAcisPrivilegeAction.size());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        ((GdbPrivGeneratorImpl) (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity())).maprebiGdbPrivGenerator(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
            "SCHEMA")).prveteEntitlementActionType);
    assertEquals("",
        ((GdbPrivGeneratorImpl) (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))
            .maprebiGdbPrivGenerator(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
                "SCHEMA")).gdbName);
  }

  @Test
  void testMaprebiGdbPrivGenerator2() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    assertEquals(1,
        ((GdbPrivGeneratorImpl) (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity())).maprebiGdbPrivGenerator(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
            "admin")).setAcisPrivilegeAction.size());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        ((GdbPrivGeneratorImpl) (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity())).maprebiGdbPrivGenerator(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
            "admin")).prveteEntitlementActionType);
    assertEquals("",
        ((GdbPrivGeneratorImpl) (new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
            new DisabledSecurityKnownSystemComponentVersionSecurity()))
            .maprebiGdbPrivGenerator(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
                "admin")).gdbName);
  }
}

