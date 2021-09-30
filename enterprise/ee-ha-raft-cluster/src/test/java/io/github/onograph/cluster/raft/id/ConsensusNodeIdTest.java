package io.github.onograph.cluster.raft.id;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.UUID;
import org.junit.jupiter.api.Test;

class ConsensusNodeIdTest {

  @Test
  void testConstructor() {
    UUID randomUUIDResult = UUID.randomUUID();
    assertSame(randomUUIDResult, (new ConsensusNodeId(randomUUIDResult)).uuid());
  }
}

