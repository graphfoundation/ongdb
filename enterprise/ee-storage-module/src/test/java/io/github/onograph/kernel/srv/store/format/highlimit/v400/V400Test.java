package io.github.onograph.kernel.srv.store.format.highlimit.v400;

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
import org.neo4j.kernel.impl.store.record.SchemaRecord;

class V400Test {

  @Test
  void testConstructor() {
    assertEquals(FormatFamily.high_limit, (new V400()).getFormatFamily());
  }

  @Test
  void testConstructor2() {
    V400 actualV400 = new V400();
    assertEquals(14, actualV400.capabilities().length);
    assertEquals("RecordFormat:V400[HL4.0.0]", actualV400.toString());
    assertEquals("4.0.0", actualV400.introductionVersion());
    assertEquals(6, actualV400.generation());
  }

  @Test
  void testDynamic() {
    RecordFormat<DynamicRecord> actualDynamicResult = (new V400()).dynamic();
    assertEquals(1125899906842623L, actualDynamicResult.getMaxId());
    assertEquals(12, actualDynamicResult.getRecordHeaderSize());
  }

  @Test
  void testLabelToken() {
    RecordFormat<LabelTokenRecord> actualLabelTokenResult = (new V400()).labelToken();
    assertEquals(4294967295L, actualLabelTokenResult.getMaxId());
    assertEquals(0, actualLabelTokenResult.getRecordHeaderSize());
  }

  @Test
  void testName() {
    assertEquals(V400.TITLE, (new V400()).name());
  }

  @Test
  void testNode() {
    RecordFormat<NodeRecord> actualNodeResult = (new V400()).node();
    assertEquals(1125899906842623L, actualNodeResult.getMaxId());
    assertEquals(0, actualNodeResult.getRecordHeaderSize());
  }

  @Test
  void testProperty() {
    RecordFormat<PropertyRecord> actualPropertyResult = (new V400()).property();
    assertEquals(1125899906842623L, actualPropertyResult.getMaxId());
    assertEquals(0, actualPropertyResult.getRecordHeaderSize());
  }

  @Test
  void testPropertyKeyToken() {
    RecordFormat<PropertyKeyTokenRecord> actualPropertyKeyTokenResult = (new V400()).propertyKeyToken();
    assertEquals(16777215L, actualPropertyKeyTokenResult.getMaxId());
    assertEquals(0, actualPropertyKeyTokenResult.getRecordHeaderSize());
  }

  @Test
  void testRelationship() {
    RecordFormat<RelationshipRecord> actualRelationshipResult = (new V400()).relationship();
    assertEquals(1125899906842623L, actualRelationshipResult.getMaxId());
    assertEquals(0, actualRelationshipResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipGroup() {
    RecordFormat<RelationshipGroupRecord> actualRelationshipGroupResult = (new V400()).relationshipGroup();
    assertEquals(1125899906842623L, actualRelationshipGroupResult.getMaxId());
    assertEquals(0, actualRelationshipGroupResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipTypeToken() {
    RecordFormat<RelationshipTypeTokenRecord> actualRelationshipTypeTokenResult = (new V400()).relationshipTypeToken();
    assertEquals(16777215L, actualRelationshipTypeTokenResult.getMaxId());
    assertEquals(0, actualRelationshipTypeTokenResult.getRecordHeaderSize());
  }

  @Test
  void testSchema() {
    RecordFormat<SchemaRecord> actualSchemaResult = (new V400()).schema();
    assertEquals(4294967295L, actualSchemaResult.getMaxId());
    assertEquals(0, actualSchemaResult.getRecordHeaderSize());
  }
}

