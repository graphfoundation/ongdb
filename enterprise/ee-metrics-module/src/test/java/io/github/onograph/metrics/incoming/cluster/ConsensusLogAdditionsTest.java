package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConsensusLogAdditionsTest {

  @Test
  void testApeie() {
    assertEquals(0L, (new ConsensusLogAdditions()).apeie());
  }

  @Test
  void testApeie2() {
    ConsensusLogAdditions consensusLogAdditions = new ConsensusLogAdditions();
    consensusLogAdditions.apeie(1L);
    assertEquals(1L, consensusLogAdditions.apeie());
  }
}

