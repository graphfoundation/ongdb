package io.github.onograph.metrics.gdb;

import org.junit.jupiter.api.Test;

class GdbMetricsLifecycleTest {

  @Test
  void testConstructor() {

    new GdbMetricsLifecycle(null, null);
  }

  @Test
  void testShutdown() {

    (new GdbMetricsLifecycle(null, null)).shutdown();
  }

  @Test
  void testStart() {

    (new GdbMetricsLifecycle(null, null)).start();
  }

  @Test
  void testStop() {

    (new GdbMetricsLifecycle(null, null)).stop();
  }
}

