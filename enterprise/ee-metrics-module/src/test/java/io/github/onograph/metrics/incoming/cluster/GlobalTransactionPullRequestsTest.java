package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GlobalTransactionPullRequestsTest {

  @Test
  void testInre() {
    GlobalTransactionPullRequests globalTransactionPullRequests = new GlobalTransactionPullRequests();
    globalTransactionPullRequests.inre();
    assertEquals(1L, globalTransactionPullRequests.txplreree());
  }

  @Test
  void testTxplreree() {
    assertEquals(0L, (new GlobalTransactionPullRequests()).txplreree());
  }
}

