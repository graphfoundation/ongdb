package io.github.onograph.kernel.srv.store.format.highlimit.v320;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PropertyRecordFormatTest {

  @Test
  void testConstructor() {
    PropertyRecordFormat actualPropertyRecordFormat = new PropertyRecordFormat();
    assertEquals(1125899906842623L, actualPropertyRecordFormat.getMaxId());
    assertEquals(0, actualPropertyRecordFormat.getRecordHeaderSize());
  }
}

