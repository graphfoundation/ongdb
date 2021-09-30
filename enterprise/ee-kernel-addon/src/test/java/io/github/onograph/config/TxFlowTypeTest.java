package io.github.onograph.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TxFlowTypeTest {

  @Test
  void testValueOf() {
    assertEquals(TxFlowType.TFT_START, TxFlowType.valueOf("TFT_START"));
  }

  @Test
  void testValues() {
    TxFlowType[] actualValuesResult = TxFlowType.values();
    assertEquals(2, actualValuesResult.length);
    assertEquals(TxFlowType.TFT_UNLMT, actualValuesResult[0]);
    assertEquals(TxFlowType.TFT_START, actualValuesResult[1]);
  }
}

