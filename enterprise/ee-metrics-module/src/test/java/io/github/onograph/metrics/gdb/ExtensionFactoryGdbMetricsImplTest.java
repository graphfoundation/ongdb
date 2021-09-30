package io.github.onograph.metrics.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExtensionFactoryGdbMetricsImplTest {

  @Test
  void testConstructor() {
    assertEquals("databaseMetrics", (new ExtensionFactoryGdbMetricsImpl()).getName());
  }

  @Test
  void testNewInstance() {
    assertTrue((new ExtensionFactoryGdbMetricsImpl()).newInstance(null,
        null) instanceof GdbMetricsLifecycle);
  }
}

