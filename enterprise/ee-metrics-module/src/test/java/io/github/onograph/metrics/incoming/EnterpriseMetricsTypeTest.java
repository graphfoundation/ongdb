package io.github.onograph.metrics.incoming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EnterpriseMetricsTypeTest {

  @Test
  void testValueOf() {
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER, EnterpriseMetricsType.valueOf("EMT_CLUSTER"));
  }

  @Test
  void testValues() {
    EnterpriseMetricsType[] actualValuesResult = EnterpriseMetricsType.values();
    assertEquals(3, actualValuesResult.length);
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, actualValuesResult[0]);
    assertEquals(EnterpriseMetricsType.EMT_CLUSTER, actualValuesResult[1]);
    assertEquals(EnterpriseMetricsType.EMT_JVM, actualValuesResult[2]);
  }
}

