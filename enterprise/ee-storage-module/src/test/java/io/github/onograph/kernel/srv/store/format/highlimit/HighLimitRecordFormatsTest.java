package io.github.onograph.kernel.srv.store.format.highlimit;

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

class HighLimitRecordFormatsTest {

  @Test
  void testConstructor() {
    assertEquals(FormatFamily.high_limit, (new HighLimitRecordFormats()).getFormatFamily());
  }

  @Test
  void testConstructor2() {
    HighLimitRecordFormats actualHighLimitRecordFormats = new HighLimitRecordFormats();
    assertEquals(RelationshipGroupHighLimitRecordFormat.V_INCS_IN_BX,
        actualHighLimitRecordFormats.capabilities().length);
    assertEquals("RecordFormat:HighLimitRecordFormats[HL4.3.0]",
        actualHighLimitRecordFormats.toString());
    assertEquals("4.3.0", actualHighLimitRecordFormats.introductionVersion());
    assertEquals(7, actualHighLimitRecordFormats.generation());
  }

  @Test
  void testCompatibleVersionsForRollingUpgrade() {
    assertEquals(1, (new HighLimitRecordFormats()).compatibleVersionsForRollingUpgrade().length);
  }

  @Test
  void testDynamic() {
    RecordFormat<DynamicRecord> actualDynamicResult = (new HighLimitRecordFormats()).dynamic();
    assertEquals(1125899906842623L, actualDynamicResult.getMaxId());
    assertEquals(12, actualDynamicResult.getRecordHeaderSize());
  }

  @Test
  void testLabelToken() {
    RecordFormat<LabelTokenRecord> actualLabelTokenResult = (new HighLimitRecordFormats()).labelToken();
    assertEquals(4294967295L, actualLabelTokenResult.getMaxId());
    assertEquals(0, actualLabelTokenResult.getRecordHeaderSize());
  }

  @Test
  void testName() {
    assertEquals(HighLimitRecordFormats.TITLE, (new HighLimitRecordFormats()).name());
  }

  @Test
  void testNode() {
    RecordFormat<NodeRecord> actualNodeResult = (new HighLimitRecordFormats()).node();
    assertEquals(1125899906842623L, actualNodeResult.getMaxId());
    assertEquals(0, actualNodeResult.getRecordHeaderSize());
  }

  @Test
  void testProperty() {
    RecordFormat<PropertyRecord> actualPropertyResult = (new HighLimitRecordFormats()).property();
    assertEquals(1125899906842623L, actualPropertyResult.getMaxId());
    assertEquals(0, actualPropertyResult.getRecordHeaderSize());
  }

  @Test
  void testPropertyKeyToken() {
    RecordFormat<PropertyKeyTokenRecord> actualPropertyKeyTokenResult = (new HighLimitRecordFormats())
        .propertyKeyToken();
    assertEquals(16777215L, actualPropertyKeyTokenResult.getMaxId());
    assertEquals(0, actualPropertyKeyTokenResult.getRecordHeaderSize());
  }

  @Test
  void testRelationship() {
    RecordFormat<RelationshipRecord> actualRelationshipResult = (new HighLimitRecordFormats()).relationship();
    assertEquals(1125899906842623L, actualRelationshipResult.getMaxId());
    assertEquals(0, actualRelationshipResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipGroup() {
    RecordFormat<RelationshipGroupRecord> actualRelationshipGroupResult = (new HighLimitRecordFormats())
        .relationshipGroup();
    assertEquals(1125899906842623L, actualRelationshipGroupResult.getMaxId());
    assertEquals(0, actualRelationshipGroupResult.getRecordHeaderSize());
  }

  @Test
  void testRelationshipTypeToken() {
    RecordFormat<RelationshipTypeTokenRecord> actualRelationshipTypeTokenResult = (new HighLimitRecordFormats())
        .relationshipTypeToken();
    assertEquals(16777215L, actualRelationshipTypeTokenResult.getMaxId());
    assertEquals(0, actualRelationshipTypeTokenResult.getRecordHeaderSize());
  }

  @Test
  void testSchema() {
    RecordFormat<SchemaRecord> actualSchemaResult = (new HighLimitRecordFormats()).schema();
    assertEquals(4294967295L, actualSchemaResult.getMaxId());
    assertEquals(0, actualSchemaResult.getRecordHeaderSize());
  }
}

