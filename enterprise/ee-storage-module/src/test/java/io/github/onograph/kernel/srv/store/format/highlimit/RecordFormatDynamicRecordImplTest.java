package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RecordFormatDynamicRecordImplTest {

  @Test
  void testConstructor() {
    RecordFormatDynamicRecordImpl actualRecordFormatDynamicRecordImpl = new RecordFormatDynamicRecordImpl();
    assertEquals(1125899906842623L, actualRecordFormatDynamicRecordImpl.getMaxId());
    assertEquals(12, actualRecordFormatDynamicRecordImpl.getRecordHeaderSize());
  }
}

