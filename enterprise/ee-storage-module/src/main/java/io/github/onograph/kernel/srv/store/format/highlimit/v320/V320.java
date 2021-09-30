package io.github.onograph.kernel.srv.store.format.highlimit.v320;

import io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl;
import org.neo4j.kernel.impl.store.format.BaseRecordFormats;
import org.neo4j.kernel.impl.store.format.FormatFamily;
import org.neo4j.kernel.impl.store.format.RecordFormat;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.RecordStorageCapability;
import org.neo4j.kernel.impl.store.format.StoreVersion;
import org.neo4j.kernel.impl.store.format.standard.LabelTokenRecordFormat;
import org.neo4j.kernel.impl.store.format.standard.PropertyKeyTokenRecordFormat;
import org.neo4j.kernel.impl.store.format.standard.RelationshipTypeTokenRecordFormat;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.LabelTokenRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord;
import org.neo4j.storageengine.api.IndexCapabilities.LuceneCapability;


public class V320 extends BaseRecordFormats {


  public static final String DST_VX;


  public static final RecordFormats RCD_FMXS;


  public static final String TITLE = io.github.onograph.TokenConstants.HIGH_LIMIT_V3_2_0;

  static {
    DST_VX = StoreVersion.HIGH_LIMIT_V3_2_0.versionString();
    RCD_FMXS = new V320();
  }

  public V320() {
    super(DST_VX, StoreVersion.HIGH_LIMIT_V3_2_0.introductionVersion(), 4,
        FormatFamily.high_limit.formatCapability(), RecordStorageCapability.DENSE_NODES,
        RecordStorageCapability.RELATIONSHIP_TYPE_3BYTES, RecordStorageCapability.SCHEMA,
        RecordStorageCapability.SECONDARY_RECORD_UNITS, LuceneCapability.LUCENE_5);
  }

  @Override
  public RecordFormat<DynamicRecord> dynamic() {
    return new RecordFormatDynamicRecordImpl();
  }

  @Override
  public FormatFamily getFormatFamily() {
    return FormatFamily.high_limit;
  }

  @Override
  public RecordFormat<LabelTokenRecord> labelToken() {
    return new LabelTokenRecordFormat();
  }

  @Override
  public String name() {
    return io.github.onograph.TokenConstants.HIGH_LIMIT_V3_2_0;
  }

  @Override
  public RecordFormat<NodeRecord> node() {
    return new NodeRecordFormat();
  }

  @Override
  public RecordFormat<PropertyRecord> property() {
    return new PropertyRecordFormat();
  }

  @Override
  public RecordFormat<PropertyKeyTokenRecord> propertyKeyToken() {
    return new PropertyKeyTokenRecordFormat();
  }

  @Override
  public RecordFormat<RelationshipRecord> relationship() {
    return new RelationshipRecordFormat();
  }

  @Override
  public RecordFormat<RelationshipGroupRecord> relationshipGroup() {
    return new RelationshipGroupRecordFormat();
  }

  @Override
  public RecordFormat<RelationshipTypeTokenRecord> relationshipTypeToken() {
    return new RelationshipTypeTokenRecordFormat();
  }
}
