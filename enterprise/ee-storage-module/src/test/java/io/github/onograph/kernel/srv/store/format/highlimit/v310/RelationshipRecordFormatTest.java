package io.github.onograph.kernel.srv.store.format.highlimit.v310;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RelationshipRecordFormatTest {

  @Test
  void testConstructor() {
    RelationshipRecordFormat actualRelationshipRecordFormat = new RelationshipRecordFormat();
    assertEquals(1125899906842623L, actualRelationshipRecordFormat.getMaxId());
    assertEquals(0, actualRelationshipRecordFormat.getRecordHeaderSize());
  }

  @Test
  void testConstructor2() {
    RelationshipRecordFormat actualRelationshipRecordFormat = new RelationshipRecordFormat(3);
    assertEquals(1125899906842623L, actualRelationshipRecordFormat.getMaxId());
    assertEquals(0, actualRelationshipRecordFormat.getRecordHeaderSize());
  }
}

