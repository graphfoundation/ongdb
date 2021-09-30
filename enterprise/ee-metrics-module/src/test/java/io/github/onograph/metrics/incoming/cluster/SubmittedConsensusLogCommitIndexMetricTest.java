package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubmittedConsensusLogCommitIndexMetricTest {

  @Test
  void testComie() {
    assertEquals(0L, (new SubmittedConsensusLogCommitIndexMetric()).comie());
  }

  @Test
  void testComie2() {
    SubmittedConsensusLogCommitIndexMetric submittedConsensusLogCommitIndexMetric = new SubmittedConsensusLogCommitIndexMetric();
    submittedConsensusLogCommitIndexMetric.comie(1L);
    assertEquals(1L, submittedConsensusLogCommitIndexMetric.comie());
  }
}

