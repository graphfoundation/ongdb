package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import org.junit.jupiter.api.Test;

class GdbPrivGeneratorImplTest {

  @Test
  void testConstructor() {
    GdbPrivGeneratorImpl aGdbPrivGeneratorImpl = new GdbPrivGeneratorImpl("SCHEMA",
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertEquals(2, aGdbPrivGeneratorImpl.setAcisPrivilegeAction.size());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        aGdbPrivGeneratorImpl.prveteEntitlementActionType);
    assertEquals("", aGdbPrivGeneratorImpl.gdbName);
  }
}

