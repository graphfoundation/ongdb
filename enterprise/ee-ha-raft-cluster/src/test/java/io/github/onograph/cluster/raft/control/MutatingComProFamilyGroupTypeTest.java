package io.github.onograph.cluster.raft.control;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MutatingComProFamilyGroupTypeTest {

  @Test
  void testLowerName() {
    assertEquals("type_comp", MutatingComProFamilyGroupType.TYPE_COMP.lowerName());
  }
}

