package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.test.FakeClockJobScheduler;

class IncomingEventServiceLogTest {

  @Test
  void testConstructor() {

    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    new IncomingEventServiceLog(_jobScheduler, new AssertableLogProvider(true), null);
  }

  @Test
  void testConstructor2() {

    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    new IncomingEventServiceLog(_jobScheduler, new AssertableLogProvider(), null);
  }
}

