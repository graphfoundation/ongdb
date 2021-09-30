package io.github.onograph.kernel.srv.transaction.log.checkpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.pruning.LogPruning;

class CheckPointThresholdVolumetricPolicyTest {

  @Test
  void testConstructor() {

    new CheckPointThresholdVolumetricPolicy(null);
  }

  @Test
  void testCheckFrequencyMillis() {
    assertEquals(10000L, (new CheckPointThresholdVolumetricPolicy(null)).checkFrequencyMillis());
  }

  @Test
  void testCreateCheckpointThresholdDescription() {
    LogPruning logPruning = mock(LogPruning.class);
    when(logPruning.describeCurrentStrategy()).thenReturn("Describe Current Strategy");
    assertEquals("The characteristics of someone or something 'Describe Current Strategy'",
        (new CheckPointThresholdVolumetricPolicy(logPruning))
            .createCheckpointThresholdDescription("The characteristics of someone or something"));
    verify(logPruning).describeCurrentStrategy();
  }

  @Test
  void testThresholdReached() {
    LogPruning logPruning = mock(LogPruning.class);
    when(logPruning.mightHaveLogsToPrune(anyLong())).thenReturn(true);
    assertTrue((new CheckPointThresholdVolumetricPolicy(logPruning)).thresholdReached(1L, 1L));
    verify(logPruning).mightHaveLogsToPrune(anyLong());
  }

  @Test
  void testThresholdReached2() {
    LogPruning logPruning = mock(LogPruning.class);
    when(logPruning.mightHaveLogsToPrune(anyLong())).thenReturn(false);
    assertFalse((new CheckPointThresholdVolumetricPolicy(logPruning)).thresholdReached(1L, 1L));
    verify(logPruning).mightHaveLogsToPrune(anyLong());
  }
}

