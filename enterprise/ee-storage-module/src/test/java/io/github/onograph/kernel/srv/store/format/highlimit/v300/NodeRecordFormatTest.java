package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NodeRecordFormatTest {

  @Test
  void testConstructor() {
    NodeRecordFormat actualNodeRecordFormat = new NodeRecordFormat();
    assertEquals(1125899906842623L, actualNodeRecordFormat.getMaxId());
    assertEquals(0, actualNodeRecordFormat.getRecordHeaderSize());
  }
}

