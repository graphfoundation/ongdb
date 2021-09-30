package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RelationshipHighLimitRecordFormatTest {

  @Test
  void testConstructor() {
    RelationshipHighLimitRecordFormat actualRelationshipHighLimitRecordFormat = new RelationshipHighLimitRecordFormat();
    assertEquals(1125899906842623L, actualRelationshipHighLimitRecordFormat.getMaxId());
    assertEquals(0, actualRelationshipHighLimitRecordFormat.getRecordHeaderSize());
  }

  @Test
  void testConstructor2() {
    RelationshipHighLimitRecordFormat actualRelationshipHighLimitRecordFormat = new RelationshipHighLimitRecordFormat(
        3);
    assertEquals(1125899906842623L, actualRelationshipHighLimitRecordFormat.getMaxId());
    assertEquals(0, actualRelationshipHighLimitRecordFormat.getRecordHeaderSize());
  }
}

