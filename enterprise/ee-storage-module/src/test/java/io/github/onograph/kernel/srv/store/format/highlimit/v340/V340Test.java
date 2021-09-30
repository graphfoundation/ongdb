package io.github.onograph.kernel.srv.store.format.highlimit.v340;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.store.format.FormatFamily;
import org.neo4j.kernel.impl.store.format.RecordFormat;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.LabelTokenRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord;

class V340Test {

  @Test
  void testConstructor() {
    assertEquals(FormatFamily.high_limit, (new V340()).getFormatFamily());
  }

  @Test
  void testConstructor2() {
    V340 actualV340 = new V340();
    assertEquals(8, actualV340.capabilities().length);
    assertEquals("RecordFormat:V340[vE.H.4]", actualV340.toString());
    assertEquals("3.4.0", actualV340.introductionVersion());
    assertEquals(5, actualV340.generation());
  }

  @Test
  void testDynamic() {
    RecordFormat<DynamicRecord> actualDynamicResult = (new V340()).dynamic();
    assertEquals(1125899906842623L, actualDynamicResult.getMaxId());
    assertEquals(12, actualDynamicResult.getRecordHeaderSize());
  }

  @Test
  void testLabelToken() {
    RecordFormat<LabelTokenRecord> actualLabelTokenResult = (new V340()).labelToken();
    assertEquals(4294967295L, actualLabelTokenResult.getMaxId());
    assertEquals(0, actualLabelTokenResult.getRecordHeaderSize());
  }

  @Test
  void testName() {
    assertEquals(V340.TITLE, (new V340()).name());
  }

  @Test
  void testNode() {
    RecordFormat<NodeRecord> actualNodeResult = (new V340()).node();
    assertEquals(1125899906842623L, actualNodeResult.getMaxId());
    assertEquals(0, actualNodeResult.getRecordHeaderSize());
  }

  @Test
  void testProperty() {
    RecordFormat<PropertyRecord> actualPropertyResult = (new V340()).property();
    assertEquals(1125899906842623L, actualPropertyResult.getMaxId());
    assertEquals(0, actualPropertyResult.getRecordHeaderSize());
  }

  @Test
  void testPropertyKeyToken() {
    RecordFormat<PropertyKeyTokenRecord> actualPropertyKeyTokenResult = (new V340()).propertyKeyToken();
    assertEquals(16777215L, actualPropertyKeyTokenResult.getMaxId());
    assertEquals(0, actualPropertyKeyTokenResult.getRecordHeaderSize());
  }

  @Test
  void testRelationship() {
    RecordFormat<RelationshipRecord> actualRelationshipResult = (new V340()).relationship();
    assertEquals(1125899906842623L, actualRelationshipResult.getMaxId());
    assertEquals(0, actualRelationshipResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipGroup() {
    RecordFormat<RelationshipGroupRecord> actualRelationshipGroupResult = (new V340()).relationshipGroup();
    assertEquals(1125899906842623L, actualRelationshipGroupResult.getMaxId());
    assertEquals(0, actualRelationshipGroupResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipTypeToken() {
    RecordFormat<RelationshipTypeTokenRecord> actualRelationshipTypeTokenResult = (new V340()).relationshipTypeToken();
    assertEquals(16777215L, actualRelationshipTypeTokenResult.getMaxId());
    assertEquals(0, actualRelationshipTypeTokenResult.getRecordHeaderSize());
  }
}

