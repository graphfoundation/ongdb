package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PropertyOneByteHeaderRecordFormatTest {

  @Test
  void testConstructor() {
    PropertyOneByteHeaderRecordFormat actualPropertyOneByteHeaderRecordFormat = new PropertyOneByteHeaderRecordFormat();
    assertEquals(1125899906842623L, actualPropertyOneByteHeaderRecordFormat.getMaxId());
    assertEquals(0, actualPropertyOneByteHeaderRecordFormat.getRecordHeaderSize());
  }
}

