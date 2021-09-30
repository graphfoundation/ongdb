package io.github.onograph.kernel.srv.store.format.highlimit.v320;

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

class V320Test {

  @Test
  void testConstructor() {
    assertEquals(FormatFamily.high_limit, (new V320()).getFormatFamily());
  }

  @Test
  void testConstructor2() {
    V320 actualV320 = new V320();
    assertEquals(6, actualV320.capabilities().length);
    assertEquals("RecordFormat:V320[vE.H.3]", actualV320.toString());
    assertEquals("3.2.0", actualV320.introductionVersion());
    assertEquals(4, actualV320.generation());
  }

  @Test
  void testDynamic() {
    RecordFormat<DynamicRecord> actualDynamicResult = (new V320()).dynamic();
    assertEquals(1125899906842623L, actualDynamicResult.getMaxId());
    assertEquals(12, actualDynamicResult.getRecordHeaderSize());
  }

  @Test
  void testLabelToken() {
    RecordFormat<LabelTokenRecord> actualLabelTokenResult = (new V320()).labelToken();
    assertEquals(4294967295L, actualLabelTokenResult.getMaxId());
    assertEquals(0, actualLabelTokenResult.getRecordHeaderSize());
  }

  @Test
  void testName() {
    assertEquals(V320.TITLE, (new V320()).name());
  }

  @Test
  void testNode() {
    RecordFormat<NodeRecord> actualNodeResult = (new V320()).node();
    assertEquals(1125899906842623L, actualNodeResult.getMaxId());
    assertEquals(0, actualNodeResult.getRecordHeaderSize());
  }

  @Test
  void testProperty() {
    RecordFormat<PropertyRecord> actualPropertyResult = (new V320()).property();
    assertEquals(1125899906842623L, actualPropertyResult.getMaxId());
    assertEquals(0, actualPropertyResult.getRecordHeaderSize());
  }

  @Test
  void testPropertyKeyToken() {
    RecordFormat<PropertyKeyTokenRecord> actualPropertyKeyTokenResult = (new V320()).propertyKeyToken();
    assertEquals(16777215L, actualPropertyKeyTokenResult.getMaxId());
    assertEquals(0, actualPropertyKeyTokenResult.getRecordHeaderSize());
  }

  @Test
  void testRelationship() {
    RecordFormat<RelationshipRecord> actualRelationshipResult = (new V320()).relationship();
    assertEquals(1125899906842623L, actualRelationshipResult.getMaxId());
    assertEquals(0, actualRelationshipResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipGroup() {
    RecordFormat<RelationshipGroupRecord> actualRelationshipGroupResult = (new V320()).relationshipGroup();
    assertEquals(1125899906842623L, actualRelationshipGroupResult.getMaxId());
    assertEquals(0, actualRelationshipGroupResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipTypeToken() {
    RecordFormat<RelationshipTypeTokenRecord> actualRelationshipTypeTokenResult = (new V320()).relationshipTypeToken();
    assertEquals(65535L, actualRelationshipTypeTokenResult.getMaxId());
    assertEquals(0, actualRelationshipTypeTokenResult.getRecordHeaderSize());
  }
}

