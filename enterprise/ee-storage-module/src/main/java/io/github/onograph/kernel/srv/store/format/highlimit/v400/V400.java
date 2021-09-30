package io.github.onograph.kernel.srv.store.format.highlimit.v400;

import io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat;
import io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat;
import io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl;
import io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat;
import org.neo4j.kernel.impl.store.format.BaseRecordFormats;
import org.neo4j.kernel.impl.store.format.FormatFamily;
import org.neo4j.kernel.impl.store.format.RecordFormat;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.RecordStorageCapability;
import org.neo4j.kernel.impl.store.format.StoreVersion;
import org.neo4j.kernel.impl.store.format.standard.LabelTokenRecordFormat;
import org.neo4j.kernel.impl.store.format.standard.PropertyKeyTokenRecordFormat;
import org.neo4j.kernel.impl.store.format.standard.RelationshipTypeTokenRecordFormat;
import org.neo4j.kernel.impl.store.format.standard.SchemaRecordFormat;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.LabelTokenRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord;
import org.neo4j.kernel.impl.store.record.SchemaRecord;
import org.neo4j.storageengine.api.IndexCapabilities.ConfigCapability;
import org.neo4j.storageengine.api.IndexCapabilities.IndexProviderCapability;
import org.neo4j.storageengine.api.IndexCapabilities.LuceneCapability;


public class V400 extends BaseRecordFormats {


  public static final String DST_VX;


  public static final RecordFormats RCD_FMXS;


  public static final String TITLE = io.github.onograph.TokenConstants.HIGH_LIMIT_V4_0_0;

  static {
    DST_VX = StoreVersion.HIGH_LIMIT_V4_0_0.versionString();
    RCD_FMXS = new V400();
  }

  protected V400() {
    super(DST_VX, StoreVersion.HIGH_LIMIT_V4_0_0.introductionVersion(), 6,
        FormatFamily.high_limit.formatCapability(), RecordStorageCapability.DENSE_NODES,
        RecordStorageCapability.RELATIONSHIP_TYPE_3BYTES, RecordStorageCapability.SCHEMA,
        RecordStorageCapability.POINT_PROPERTIES,
        RecordStorageCapability.TEMPORAL_PROPERTIES, RecordStorageCapability.SECONDARY_RECORD_UNITS,
        RecordStorageCapability.FLEXIBLE_SCHEMA_STORE, RecordStorageCapability.INTERNAL_TOKENS,
        RecordStorageCapability.GBPTREE_ID_FILES, LuceneCapability.LUCENE_8,
        IndexProviderCapability.INDEX_PROVIDERS_40,
        ConfigCapability.SCHEMA_STORE_CONFIG, RecordStorageCapability.GBPTREE_COUNTS_STORE);
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
    return io.github.onograph.TokenConstants.HIGH_LIMIT_V4_0_0;
  }

  @Override
  public RecordFormat<NodeRecord> node() {
    return new NodeHighLimitRecordFormat();
  }

  @Override
  public RecordFormat<PropertyRecord> property() {
    return new PropertyOneByteHeaderRecordFormat();
  }

  @Override
  public RecordFormat<PropertyKeyTokenRecord> propertyKeyToken() {
    return new PropertyKeyTokenRecordFormat();
  }

  @Override
  public RecordFormat<RelationshipRecord> relationship() {
    return new RelationshipHighLimitRecordFormat();
  }

  @Override
  public RecordFormat<RelationshipGroupRecord> relationshipGroup() {
    return new RelationshipGroupRecordFormat();
  }

  @Override
  public RecordFormat<RelationshipTypeTokenRecord> relationshipTypeToken() {
    return new RelationshipTypeTokenRecordFormat(24, false);
  }

  @Override
  public RecordFormat<SchemaRecord> schema() {
    return new SchemaRecordFormat();
  }
}
