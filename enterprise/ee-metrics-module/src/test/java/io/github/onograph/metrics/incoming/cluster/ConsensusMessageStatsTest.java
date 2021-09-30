package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.codahale.metrics.ExponentiallyDecayingReservoir;
import com.codahale.metrics.Reservoir;
import com.codahale.metrics.Snapshot;
import com.codahale.metrics.Timer;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

class ConsensusMessageStatsTest {

  @Test
  void testCraConsensusMessageStats() {
    ConsensusMessageStats actualCraConsensusMessageStatsResult = ConsensusMessageStats.craConsensusMessageStats();
    assertEquals(0L, actualCraConsensusMessageStatsResult.dea());
    Timer timer = actualCraConsensusMessageStatsResult.getTimer();
    assertEquals(0L, timer.getCount());
    Snapshot snapshot = timer.getSnapshot();
    assertTrue(snapshot instanceof com.codahale.metrics.WeightedSnapshot);
    assertEquals(0.0, timer.getOneMinuteRate());
    assertEquals(0.0, timer.getMeanRate());
    assertEquals(0.0, timer.getFifteenMinuteRate());
    assertEquals(0.0, timer.getFiveMinuteRate());
    assertEquals(0.0, snapshot.getStdDev());
    assertEquals(0L, snapshot.getMin());
    assertEquals(0.0, snapshot.getMedian());
    assertEquals(0.0, snapshot.getMean());
    assertEquals(0L, snapshot.getMax());
    long[] values = snapshot.getValues();
    assertEquals(0, values.length);
    assertArrayEquals(new long[]{}, values);
    assertEquals(0, snapshot.size());
  }

  @Test
  void testCraConsensusMessageStats2() {
    ConsensusMessageStats actualCraConsensusMessageStatsResult = ConsensusMessageStats.craConsensusMessageStats();
    assertEquals(0L, actualCraConsensusMessageStatsResult.dea());
    Timer timer = actualCraConsensusMessageStatsResult.getTimer();
    assertEquals(0L, timer.getCount());
    assertTrue(timer.getSnapshot() instanceof com.codahale.metrics.WeightedSnapshot);
    assertEquals(0.0, timer.getOneMinuteRate());
    assertEquals(0.0, timer.getMeanRate());
    assertEquals(0.0, timer.getFifteenMinuteRate());
    assertEquals(0.0, timer.getFiveMinuteRate());
  }

  @Test
  void testCraunConsensusMessageStats() {
    Supplier<Reservoir> supplier = (Supplier<Reservoir>) mock(Supplier.class);
    when(supplier.get()).thenReturn(new ExponentiallyDecayingReservoir());
    ConsensusMessageStats actualCraunConsensusMessageStatsResult = ConsensusMessageStats
        .craunConsensusMessageStats(supplier);
    assertEquals(0L, actualCraunConsensusMessageStatsResult.dea());
    Timer timer = actualCraunConsensusMessageStatsResult.getTimer();
    assertEquals(0L, timer.getCount());
    assertTrue(timer.getSnapshot() instanceof com.codahale.metrics.WeightedSnapshot);
    assertEquals(0.0, timer.getOneMinuteRate());
    assertEquals(0.0, timer.getMeanRate());
    assertEquals(0.0, timer.getFifteenMinuteRate());
    assertEquals(0.0, timer.getFiveMinuteRate());
    verify(supplier, atLeast(1)).get();
  }

  @Test
  void testDea() {
    assertEquals(0L, ConsensusMessageStats.craConsensusMessageStats().dea());
  }

  @Test
  void testGetTimer() {

    ConsensusMessageStats.craConsensusMessageStats()
        .getTimer(ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ);
  }
}

