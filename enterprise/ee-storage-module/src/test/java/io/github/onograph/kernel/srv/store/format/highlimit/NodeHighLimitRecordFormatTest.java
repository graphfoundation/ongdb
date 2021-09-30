package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NodeHighLimitRecordFormatTest {

  @Test
  void testConstructor() {
    NodeHighLimitRecordFormat actualNodeHighLimitRecordFormat = new NodeHighLimitRecordFormat();
    assertEquals(1125899906842623L, actualNodeHighLimitRecordFormat.getMaxId());
    assertEquals(0, actualNodeHighLimitRecordFormat.getRecordHeaderSize());
  }

  @Test
  void testConstructor2() {
    NodeHighLimitRecordFormat actualNodeHighLimitRecordFormat = new NodeHighLimitRecordFormat(3);
    assertEquals(1125899906842623L, actualNodeHighLimitRecordFormat.getMaxId());
    assertEquals(0, actualNodeHighLimitRecordFormat.getRecordHeaderSize());
  }
}

