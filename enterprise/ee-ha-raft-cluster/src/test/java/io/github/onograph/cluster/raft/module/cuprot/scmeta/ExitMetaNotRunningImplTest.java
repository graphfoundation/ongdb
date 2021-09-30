package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.test.FakeClockJobScheduler;
import org.neo4j.time.FakeClock;

class ExitMetaNotRunningImplTest {

  @Test
  void testConstructor() {

    new ExitMetaNotRunningImpl(new CompositeDatabaseAvailabilityGuard(new FakeClockJobScheduler()));
  }

  @Test
  void testAsectu() throws GdbStoreException {

    (new ExitMetaNotRunningImpl(
        new CompositeDatabaseAvailabilityGuard(new FakeClockJobScheduler()))).asectu();
  }

  @Test
  void testAsectu2() throws GdbStoreException {

    (new ExitMetaNotRunningImpl(new CompositeDatabaseAvailabilityGuard(new FakeClock()))).asectu();
  }
}

