package io.github.onograph.dbms.utils;

import java.io.IOException;
import org.neo4j.consistency.RecordType;
import org.neo4j.internal.batchimport.input.Group;
import org.neo4j.internal.batchimport.input.InputEntityVisitor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.RelationshipStore;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.TokenHolder;


class RelationshipReadingInputChunk extends AbstractDefaultInputChunk {


  private final io.github.onograph.dbms.utils.NodeStoreWrapperFilterSpec.NodeStoreFilterTokenProvider ltNodeStoreFilterTokenProvider;


  private final RelationshipRecord relationshipRecord;


  private final RelationshipStore relationshipStore;


  RelationshipReadingInputChunk(NodeStoreWrapperFilterSpec _fcsNodeStoreWrapperFilterSpec,
      PageCacheTracer _pageCacheTracer, PropertyStore _propertyStore,
      RelationshipStore _relationshipStore, NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics,
      TokenHolders _tokenHolders) {
    super(_relationshipStore, _fcsNodeStoreWrapperFilterSpec, _pageCacheTracer, _propertyStore,
        _sasNodeWrapperInfoMetrics, _tokenHolders);
    this.relationshipStore = _relationshipStore;
    this.relationshipRecord = _relationshipStore.newRecord();

    TokenHolder _tokenHolder = _tokenHolders.relationshipTypeTokens();
    this.ltNodeStoreFilterTokenProvider = (id) ->
    {
      return _tokenHolder.getTokenById(id).name();
    };
  }

  @Override
  void redadvsForInCu(CursorContext _cursorContext, InputEntityVisitor _inputEntityVisitor,
      long _lgI) throws IOException {
    this.relationshipStore.getRecordByCursor(_lgI, this.relationshipRecord,
        RecordLoad.LENIENT_CHECK, this.pageCursor);
    if (this.relationshipRecord.inUse()) {
      this.relationshipStore.ensureHeavy(this.relationshipRecord, _cursorContext);

      int relationshipTypeName = this.relationshipRecord.getType();

      String _strNr = this.stcfiNodeStoreWrapperFilterSpec.firrthString(relationshipTypeName,
          this.ltNodeStoreFilterTokenProvider);
      if (_strNr != null) {
        _inputEntityVisitor.type(_strNr);
        _inputEntityVisitor.startId(this.relationshipRecord.getFirstNode(), Group.GLOBAL);
        _inputEntityVisitor.endId(this.relationshipRecord.getSecondNode(), Group.GLOBAL);
        this.viprcantForInPrRe(_inputEntityVisitor, new long[]{(long) relationshipTypeName},
            RecordType.RELATIONSHIP, this.relationshipRecord);
        _inputEntityVisitor.endOfEntity();
      } else {
        this.sttNodeWrapperInfoMetrics.reodLongAdder.increment();
      }
    } else {
      this.sttNodeWrapperInfoMetrics.unsLongAdder.increment();
    }
  }

  @Override
  String reoteString() {
    return io.github.onograph.TokenConstants.RELATIONSHIP2;
  }
}
