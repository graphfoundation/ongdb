package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TransactionBlockLimitersTest {

  @Test
  void testConfiguredConstructor() {

    new TransactionBlockLimiters.Configured(1L);
  }

  @Test
  void testConfiguredIsCole() {
    assertTrue((new TransactionBlockLimiters.Configured(1L)).isCole(1L));
    assertFalse((new TransactionBlockLimiters.Configured(Long.MAX_VALUE)).isCole(1L));
  }

  @Test
  void testConfiguredEquals() {
    assertFalse((new TransactionBlockLimiters.Configured(1L)).equals(null));
    assertFalse(
        (new TransactionBlockLimiters.Configured(1L)).equals("Different type to Configured"));
  }

  @Test
  void testConfiguredEquals2() {
    TransactionBlockLimiters.Configured configured = new TransactionBlockLimiters.Configured(1L);
    assertTrue(configured.equals(configured));
    int expectedHashCodeResult = configured.hashCode();
    assertEquals(expectedHashCodeResult, configured.hashCode());
  }

  @Test
  void testConfiguredEquals3() {
    TransactionBlockLimiters.Configured configured = new TransactionBlockLimiters.Configured(1L);
    TransactionBlockLimiters.Configured configured1 = new TransactionBlockLimiters.Configured(1L);
    assertTrue(configured.equals(configured1));
    int expectedHashCodeResult = configured.hashCode();
    assertEquals(expectedHashCodeResult, configured1.hashCode());
  }

  @Test
  void testConfiguredEquals4() {
    TransactionBlockLimiters.Configured configured = new TransactionBlockLimiters.Configured(0L);
    assertFalse(configured.equals(new TransactionBlockLimiters.Configured(1L)));
  }
}

