package io.github.onograph.server.security.systemgraph;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SecurityComponentVersionTest {

  @Test
  void testIsCurrent() {
    assertFalse(SecurityComponentVersion.BACK_COMPATIBLE_FOR_35.isCurrent());
    assertTrue(SecurityComponentVersion.BACK_COMPATIBLE_FOR_43D4.isCurrent());
  }

  @Test
  void testMigrationSupported() {
    assertTrue(SecurityComponentVersion.BACK_COMPATIBLE_FOR_35.migrationSupported());
    assertFalse(SecurityComponentVersion.BAD_SEC_VERS.migrationSupported());
    assertFalse(SecurityComponentVersion.TEST_VER.migrationSupported());
  }

  @Test
  void testRuntimeSupported() {
    assertFalse(SecurityComponentVersion.BACK_COMPATIBLE_FOR_35.runtimeSupported());
    assertTrue(SecurityComponentVersion.BACK_COMPATIBLE_FOR_40.runtimeSupported());
    assertFalse(SecurityComponentVersion.TEST_VER.runtimeSupported());
  }
}

