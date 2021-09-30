package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;

class GdbPrivGeneratorTest {

  @Test
  void testConstructor() {
    Function<String, Set<PrivilegeAction>> function = (Function<String, Set<PrivilegeAction>>) mock(
        Function.class);
    when(function.apply((String) any())).thenReturn(new HashSet<PrivilegeAction>());
    GdbPrivGenerator actualGdbPrivGenerator = new GdbPrivGenerator(function,
        "alice.liddell@example.org",
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertTrue(actualGdbPrivGenerator.setAcisPrivilegeAction.isEmpty());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualGdbPrivGenerator.prveteEntitlementActionType);
    assertEquals("", actualGdbPrivGenerator.gdbName);
    verify(function).apply((String) any());
  }
}

