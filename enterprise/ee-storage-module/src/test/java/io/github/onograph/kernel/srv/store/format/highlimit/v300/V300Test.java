package io.github.onograph.kernel.srv.store.format.highlimit.v300;

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

class V300Test {

  @Test
  void testConstructor() {
    assertEquals(FormatFamily.high_limit, (new V300()).getFormatFamily());
  }

  @Test
  void testConstructor2() {
    V300 actualV300 = new V300();
    assertEquals(5, actualV300.capabilities().length);
    assertEquals("RecordFormat:V300[vE.H.0]", actualV300.toString());
    assertEquals("3.0.0", actualV300.introductionVersion());
    assertEquals(1, actualV300.generation());
  }

  @Test
  void testDynamic() {
    RecordFormat<DynamicRecord> actualDynamicResult = (new V300()).dynamic();
    assertEquals(1125899906842623L, actualDynamicResult.getMaxId());
    assertEquals(12, actualDynamicResult.getRecordHeaderSize());
  }

  @Test
  void testLabelToken() {
    RecordFormat<LabelTokenRecord> actualLabelTokenResult = (new V300()).labelToken();
    assertEquals(4294967295L, actualLabelTokenResult.getMaxId());
    assertEquals(0, actualLabelTokenResult.getRecordHeaderSize());
  }

  @Test
  void testName() {
    assertEquals(V300.TITLE, (new V300()).name());
  }

  @Test
  void testNode() {
    RecordFormat<NodeRecord> actualNodeResult = (new V300()).node();
    assertEquals(1125899906842623L, actualNodeResult.getMaxId());
    assertEquals(0, actualNodeResult.getRecordHeaderSize());
  }

  @Test
  void testProperty() {
    RecordFormat<PropertyRecord> actualPropertyResult = (new V300()).property();
    assertEquals(1125899906842623L, actualPropertyResult.getMaxId());
    assertEquals(0, actualPropertyResult.getRecordHeaderSize());
  }

  @Test
  void testPropertyKeyToken() {
    RecordFormat<PropertyKeyTokenRecord> actualPropertyKeyTokenResult = (new V300()).propertyKeyToken();
    assertEquals(16777215L, actualPropertyKeyTokenResult.getMaxId());
    assertEquals(0, actualPropertyKeyTokenResult.getRecordHeaderSize());
  }

  @Test
  void testRelationship() {
    RecordFormat<RelationshipRecord> actualRelationshipResult = (new V300()).relationship();
    assertEquals(1125899906842623L, actualRelationshipResult.getMaxId());
    assertEquals(0, actualRelationshipResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipGroup() {
    RecordFormat<RelationshipGroupRecord> actualRelationshipGroupResult = (new V300()).relationshipGroup();
    assertEquals(1125899906842623L, actualRelationshipGroupResult.getMaxId());
    assertEquals(0, actualRelationshipGroupResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipTypeToken() {
    RecordFormat<RelationshipTypeTokenRecord> actualRelationshipTypeTokenResult = (new V300()).relationshipTypeToken();
    assertEquals(65535L, actualRelationshipTypeTokenResult.getMaxId());
    assertEquals(0, actualRelationshipTypeTokenResult.getRecordHeaderSize());
  }
}

