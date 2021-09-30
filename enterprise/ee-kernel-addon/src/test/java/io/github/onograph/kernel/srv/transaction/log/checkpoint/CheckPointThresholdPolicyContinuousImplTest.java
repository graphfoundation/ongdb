package io.github.onograph.kernel.srv.transaction.log.checkpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.time.SystemNanoClock;

class CheckPointThresholdPolicyContinuousImplTest {

  @Test
  void testCreateThreshold() {
    CheckPointThresholdPolicyContinuousImpl checkPointThresholdPolicyContinuousImpl = new CheckPointThresholdPolicyContinuousImpl();
    Config _config = mock(Config.class);
    SystemNanoClock _systemNanoClock = mock(SystemNanoClock.class);
    assertTrue(
        checkPointThresholdPolicyContinuousImpl.createThreshold(_config, _systemNanoClock, null,
            new AssertableLogProvider(
                true)) instanceof CheckPointThresholdContinuousPolicy);
  }

  @Test
  void testConstructor() {
    assertEquals("continuous", (new CheckPointThresholdPolicyContinuousImpl()).getName());
  }
}

