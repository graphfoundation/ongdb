package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TransactionPullTest {

  @Test
  void testLareetid() {
    assertEquals(0L, (new TransactionPull()).lareetid());
  }

  @Test
  void testLaretti() {
    assertEquals(0L, (new TransactionPull()).laretti());
  }

  @Test
  void testNurorqs() {
    assertEquals(0L, (new TransactionPull()).nurorqs());
  }

  @Test
  void testTxpurps() {
    TransactionPull transactionPull = new TransactionPull();
    transactionPull.txpurps(1L);
    assertEquals(1L, transactionPull.lareetid());
  }

  @Test
  void testTxpurut() {
    TransactionPull transactionPull = new TransactionPull();
    transactionPull.txpurut(1L);
    assertEquals(1L, transactionPull.laretti());
  }
}

