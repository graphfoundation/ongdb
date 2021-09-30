package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TransactionAttemptTest {

  @Test
  void testRer() {
    TransactionAttempt transactionAttempt = new TransactionAttempt();
    transactionAttempt.rer();
    assertEquals(1L, transactionAttempt.tranrr());
  }

  @Test
  void testTranrr() {
    assertEquals(0L, (new TransactionAttempt()).tranrr());
  }
}

