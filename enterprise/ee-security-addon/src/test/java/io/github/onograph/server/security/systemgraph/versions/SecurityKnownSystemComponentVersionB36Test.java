package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import io.github.onograph.server.security.DefaultSecurityLog;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class SecurityKnownSystemComponentVersionB36Test {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    SecurityKnownSystemComponentVersionB36 actualSecurityKnownSystemComponentVersionB36 =
        new SecurityKnownSystemComponentVersionB36(
            _abstractSecurityLog, null, new DisabledSecurityKnownSystemComponentVersionSecurity());

    assertEquals(1, actualSecurityKnownSystemComponentVersionB36.version);
    assertEquals("Neo4j 3.6", actualSecurityKnownSystemComponentVersionB36.description);
    assertFalse(actualSecurityKnownSystemComponentVersionB36.isCurrent());
  }
}

