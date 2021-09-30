package io.github.onograph.metrics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MetricsServiceExtensionFactoryTest {

  @Test
  void testConstructor() {
    assertEquals("globalMetrics", (new MetricsServiceExtensionFactory()).getName());
  }
}

