package io.github.onograph.cluster.raft.control;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class MutableProtocolsTest {

  @Test
  void testCaerString() {
    assertEquals("type_comp", MutableProtocols.COM_TYPE_GZIP.caerString());
  }

  @Test
  void testFinOptional() {
    assertFalse(MutableProtocols.finOptional(MutatingComProFamilyGroupType.TYPE_COMP, " str Nf")
        .isPresent());
  }
}

