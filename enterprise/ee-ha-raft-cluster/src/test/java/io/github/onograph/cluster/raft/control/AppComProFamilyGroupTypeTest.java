package io.github.onograph.cluster.raft.control;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppComProFamilyGroupTypeTest {

  @Test
  void testLowerName() {
    assertEquals("raft_protocol", AppComProFamilyGroupType.RAFT_PROTOCOL.lowerName());
  }
}

