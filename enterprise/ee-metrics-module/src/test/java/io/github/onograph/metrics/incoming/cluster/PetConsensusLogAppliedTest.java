package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PetConsensusLogAppliedTest {

  @Test
  void testApldid() {
    assertEquals(0L, (new PetConsensusLogApplied()).apldid());
  }

  @Test
  void testApldid2() {
    PetConsensusLogApplied petConsensusLogApplied = new PetConsensusLogApplied();
    petConsensusLogApplied.apldid(1L);
    assertEquals(1L, petConsensusLogApplied.apldid());
  }
}

