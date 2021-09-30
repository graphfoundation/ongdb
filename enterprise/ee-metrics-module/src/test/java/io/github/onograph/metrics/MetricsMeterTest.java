package io.github.onograph.metrics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.function.LongSupplier;
import org.junit.jupiter.api.Test;

class MetricsMeterTest {

  @Test
  void testConstructor() {
    MetricsMeter actualMetricsMeter = new MetricsMeter(mock(LongSupplier.class));
    assertEquals(0L, actualMetricsMeter.getCount());
    assertEquals(0.0, actualMetricsMeter.getOneMinuteRate());
    assertEquals(0.0, actualMetricsMeter.getFiveMinuteRate());
    assertEquals(0.0, actualMetricsMeter.getFifteenMinuteRate());
  }
}

