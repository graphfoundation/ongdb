package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.test.FakeClockJobScheduler;

class InactiveNodeWatcherTest {

  @Test
  void testConstructor() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    new InactiveNodeWatcher(_clock, 1L, new BufferingLog());
  }

  @Test
  void testLoattsdtmmwinkasForCo() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    InactiveNodeWatcher inactiveNodeWatcher = new InactiveNodeWatcher(_clock, 1L,
        new BufferingLog());
    inactiveNodeWatcher.loattsdtmmwinkasForCo(new ConsensusNodeId(UUID.randomUUID()));
  }
}

