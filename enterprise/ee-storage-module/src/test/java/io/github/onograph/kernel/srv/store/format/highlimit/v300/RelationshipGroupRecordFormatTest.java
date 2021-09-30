package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RelationshipGroupRecordFormatTest {

  @Test
  void testConstructor() {
    RelationshipGroupRecordFormat actualRelationshipGroupRecordFormat = new RelationshipGroupRecordFormat();
    assertEquals(1125899906842623L, actualRelationshipGroupRecordFormat.getMaxId());
    assertEquals(0, actualRelationshipGroupRecordFormat.getRecordHeaderSize());
  }
}

