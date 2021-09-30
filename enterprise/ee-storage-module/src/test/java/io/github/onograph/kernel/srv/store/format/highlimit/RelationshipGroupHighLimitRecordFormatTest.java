package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RelationshipGroupHighLimitRecordFormatTest {

  @Test
  void testConstructor() {
    RelationshipGroupHighLimitRecordFormat actualRelationshipGroupHighLimitRecordFormat = new RelationshipGroupHighLimitRecordFormat();
    assertEquals(1125899906842623L, actualRelationshipGroupHighLimitRecordFormat.getMaxId());
    assertEquals(0, actualRelationshipGroupHighLimitRecordFormat.getRecordHeaderSize());
  }

  @Test
  void testConstructor2() {
    RelationshipGroupHighLimitRecordFormat actualRelationshipGroupHighLimitRecordFormat = new RelationshipGroupHighLimitRecordFormat(
        3);
    assertEquals(1125899906842623L, actualRelationshipGroupHighLimitRecordFormat.getMaxId());
    assertEquals(0, actualRelationshipGroupHighLimitRecordFormat.getRecordHeaderSize());
  }
}

