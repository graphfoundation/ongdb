package io.github.onograph.cluster.raft.akkamsg.serialization;

import org.junit.jupiter.api.Test;
import org.neo4j.test.FakeClockJobScheduler;

class ConsensusMessageToMessageDecoderTest {

  @Test
  void testConstructor() {

    new ConsensusMessageToMessageDecoder(new FakeClockJobScheduler());
  }
}

