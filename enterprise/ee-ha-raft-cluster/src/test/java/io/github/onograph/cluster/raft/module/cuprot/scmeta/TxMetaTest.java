package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TxMetaTest {

  @Test
  void testConstructor() {
    assertEquals(1L, (new TxMeta(1L)).getLgIsdm());
    assertEquals(1L, (new TxMeta(1L, 1L)).getLgIsdm());
  }

  @Test
  void testTranlinOptional() {
    assertFalse((new TxMeta(1L)).tranlinOptional().isPresent());
  }
}

