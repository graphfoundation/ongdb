package io.github.onograph.dbms.utils;

import java.io.IOException;
import org.neo4j.consistency.RecordType;
import org.neo4j.internal.batchimport.input.Group;
import org.neo4j.internal.batchimport.input.InputEntityVisitor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.NodeLabelsField;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.TokenHolder;


class NodeReadingInputChunk extends AbstractDefaultInputChunk {


  private final io.github.onograph.dbms.utils.NodeStoreWrapperFilterSpec.NodeStoreFilterTokenProvider ltNodeStoreFilterTokenProvider;


  private final NodeRecord nodeRecord;


  private final NodeStore nodeStore;


  NodeReadingInputChunk(NodeStoreWrapperFilterSpec _fcsNodeStoreWrapperFilterSpec,
      NodeStore _nodeStore, PageCacheTracer _pageCacheTracer, PropertyStore _propertyStore,
      NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics, TokenHolders _tokenHolders) {
    super(_nodeStore, _fcsNodeStoreWrapperFilterSpec, _pageCacheTracer, _propertyStore,
        _sasNodeWrapperInfoMetrics, _tokenHolders);
    this.nodeStore = _nodeStore;
    this.nodeRecord = _nodeStore.newRecord();

    TokenHolder _tokenHolder = _tokenHolders.labelTokens();
    this.ltNodeStoreFilterTokenProvider = (id) ->
    {
      return _tokenHolder.getTokenById(id).name();
    };
  }

  @Override
  void redadvsForInCu(CursorContext _cursorContext, InputEntityVisitor _inputEntityVisitor,
      long _lgI) throws IOException {
    this.nodeStore.getRecordByCursor(_lgI, this.nodeRecord, RecordLoad.LENIENT_CHECK,
        this.pageCursor);
    if (this.nodeRecord.inUse()) {
      this.nodeStore.ensureHeavy(this.nodeRecord, _cursorContext);

      long[] _lgIlArray = NodeLabelsField.parseLabelsField(this.nodeRecord)
          .get(this.nodeStore, _cursorContext);
      if (!this.stcfiNodeStoreWrapperFilterSpec.isShddtne(_lgIlArray)) {

        String[] _strLblArray = this.stcfiNodeStoreWrapperFilterSpec.fitleString(_lgIlArray,
            this.ltNodeStoreFilterTokenProvider);
        _inputEntityVisitor.id(_lgI, Group.GLOBAL);
        _inputEntityVisitor.labels(_strLblArray);
        this.viprcantForInPrRe(_inputEntityVisitor, _lgIlArray, RecordType.NODE, this.nodeRecord);
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
    return io.github.onograph.TokenConstants.NODE2;
  }
}
