package io.github.onograph.kernel.srv.transaction.log.checkpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckPointThresholdContinuousPolicyTest {

  @Test
  void testConstructor() {

    new CheckPointThresholdContinuousPolicy();
  }

  @Test
  void testConstructor2() {

    new CheckPointThresholdContinuousPolicy();
  }

  @Test
  void testCheckFrequencyMillis() {
    assertEquals(100L, (new CheckPointThresholdContinuousPolicy()).checkFrequencyMillis());
  }

  @Test
  void testInitialize() {

    (new CheckPointThresholdContinuousPolicy()).initialize(1L);
  }

  @Test
  void testThresholdReached() {
    assertTrue((new CheckPointThresholdContinuousPolicy()).thresholdReached(1L, 1L));
    assertFalse((new CheckPointThresholdContinuousPolicy()).thresholdReached(-1L, 1L));
  }
}

