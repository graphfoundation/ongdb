package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConsensusElectionTermTest {

  @Test
  void testGetTermLength() {
    assertEquals(0L, (new ConsensusElectionTerm()).getTermLength());
  }

  @Test
  void testTermLength() {
    ConsensusElectionTerm consensusElectionTerm = new ConsensusElectionTerm();
    consensusElectionTerm.termLength(1L);
    assertEquals(1L, consensusElectionTerm.getTermLength());
  }
}

