package io.github.onograph.cluster.raft.control;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class ComProFamilyUtilitiesTest {

  @Test
  void testIsCurrentSupported() {
    assertFalse(ComProFamilyUtilities.isCurrentSupported(ApplicationComProFamilyType.RC));
  }
}

