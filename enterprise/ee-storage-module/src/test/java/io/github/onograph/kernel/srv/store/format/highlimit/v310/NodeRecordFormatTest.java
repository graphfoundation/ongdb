package io.github.onograph.kernel.srv.store.format.highlimit.v310;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NodeRecordFormatTest {

  @Test
  void testConstructor() {
    NodeRecordFormat actualNodeRecordFormat = new NodeRecordFormat();
    assertEquals(1125899906842623L, actualNodeRecordFormat.getMaxId());
    assertEquals(0, actualNodeRecordFormat.getRecordHeaderSize());
  }

  @Test
  void testConstructor2() {
    NodeRecordFormat actualNodeRecordFormat = new NodeRecordFormat(3);
    assertEquals(1125899906842623L, actualNodeRecordFormat.getMaxId());
    assertEquals(0, actualNodeRecordFormat.getRecordHeaderSize());
  }
}

