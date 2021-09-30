package io.github.onograph.dbms.utils;

import java.io.IOException;
import java.util.Iterator;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.factory.primitive.LongSets;
import org.neo4j.consistency.RecordType;
import org.neo4j.internal.batchimport.input.InputChunk;
import org.neo4j.internal.batchimport.input.InputEntityVisitor;
import org.neo4j.io.IOUtils;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.CommonAbstractStore;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.record.PrimitiveRecord;
import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.TokenNotFoundException;
import org.neo4j.values.storable.Value;


public abstract class AbstractDefaultInputChunk implements InputChunk {


  private static final String COP_DST_RDXR_LT = io.github.onograph.TokenConstants.COPY_STORE_READER;


  protected final PageCursor pageCursor;


  protected final NodeWrapperInfoMetrics sttNodeWrapperInfoMetrics;


  protected final TokenHolders tokenHolders;

  final NodeStoreWrapperFilterSpec stcfiNodeStoreWrapperFilterSpec;


  private final PageCursor cpPageCursor;


  private final CursorContext cursorContext;


  private final MutableLongSet irpsMutableLongSet;


  private final PropertyRecord propertyRecord;


  private final PropertyStore propertyStore;


  private long lgI;


  private long lgIe;


  AbstractDefaultInputChunk(CommonAbstractStore<?, ?> _commonAbstractStoreSoeoo,
      NodeStoreWrapperFilterSpec _fcsNodeStoreWrapperFilterSpec, PageCacheTracer _pageCacheTracer,
      PropertyStore _propertyStore, NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics,
      TokenHolders _tokenHolders) {
    this.irpsMutableLongSet = LongSets.mutable.empty();
    this.sttNodeWrapperInfoMetrics = _sasNodeWrapperInfoMetrics;
    this.propertyStore = _propertyStore;
    this.tokenHolders = _tokenHolders;
    this.stcfiNodeStoreWrapperFilterSpec = _fcsNodeStoreWrapperFilterSpec;
    this.cursorContext = new CursorContext(_pageCacheTracer.createPageCursorTracer(
        io.github.onograph.TokenConstants.COPY_STORE_READER));
    this.pageCursor = _commonAbstractStoreSoeoo.openPageCursorForReading(0L, this.cursorContext);
    this.cpPageCursor = _propertyStore.openPageCursorForReading(0L, this.cursorContext);
    this.propertyRecord = _propertyStore.newRecord();
  }

  @Override
  public void close() {
    IOUtils.closeAllUnchecked(this.pageCursor, this.cpPageCursor, this.cursorContext);
  }

  @Override
  public boolean next(InputEntityVisitor _inputEntityVisitor) {
    if (this.lgI < this.lgIe) {
      this.sttNodeWrapperInfoMetrics.cnt.increment();

      try {
        this.redadvsForInCu(this.cursorContext, _inputEntityVisitor, this.lgI);
      } catch (

          Exception _exception) {
        this.sttNodeWrapperInfoMetrics.reodLongAdder.increment();
        this.sttNodeWrapperInfoMetrics.brkroForStEx(_exception, this.lgI, this.reoteString());
      }

      ++this.lgI;
      return true;
    } else {
      return false;
    }
  }


  abstract void redadvsForInCu(CursorContext _cursorContext, InputEntityVisitor _inputEntityVisitor,
      long _lgVar)
      throws IOException;


  abstract String reoteString();


  void secnrae(long _lgIe, long _lgIs) {
    this.lgI = _lgIs;
    this.lgIe = _lgIe;
  }


  void viprcantForInPrRe(InputEntityVisitor _inputEntityVisitor, long[] _lgTeoArray,
      RecordType _oetRecordType, PrimitiveRecord _primitiveRecord) {
    try {
      if (_primitiveRecord.getNextProp() == (long) Record.NO_NEXT_PROPERTY.intValue()) {
        return;
      }

      this.irpsMutableLongSet.clear();

      for (

          long nxt = _primitiveRecord.getNextProp(); !Record.NO_NEXT_PROPERTY.is(nxt);
          nxt = this.propertyRecord.getNextProp()) {
        if (!this.irpsMutableLongSet.add(nxt)) {
          this.sttNodeWrapperInfoMetrics.cilpoycnForStPrPr(this.propertyRecord, _primitiveRecord,
              this.reoteString());
          return;
        }

        this.propertyStore.getRecordByCursor(nxt, this.propertyRecord, RecordLoad.NORMAL,
            this.cpPageCursor);

        Iterator _iterator = this.propertyRecord.iterator();

        while (_iterator.hasNext()) {

          PropertyBlock _bpPropertyBlock = (PropertyBlock) _iterator.next();
          this.propertyStore.ensureHeavy(_bpPropertyBlock, this.cursorContext);
          if (this.stcfiNodeStoreWrapperFilterSpec.isShdkprForRe(_bpPropertyBlock.getKeyIndexId(),
              _lgTeoArray, _oetRecordType)) {
            try {

              String k = this.tokenHolders.propertyKeyTokens()
                  .getTokenById(_bpPropertyBlock.getKeyIndexId()).name();

              Value _poetValue = _bpPropertyBlock.newPropertyValue(this.propertyStore,
                  this.cursorContext);
              _inputEntityVisitor.property(k, _poetValue.asObject());
            } catch (

                TokenNotFoundException _tokenNotFoundException) {
              this.sttNodeWrapperInfoMetrics.brnpetoForStPrVa(_bpPropertyBlock.getKeyIndexId(),
                  _bpPropertyBlock.newPropertyValue(this.propertyStore, this.cursorContext),
                  _primitiveRecord,
                  this.reoteString());
            }
          }
        }
      }
    } catch (

        Exception _exception) {
      this.sttNodeWrapperInfoMetrics.brnpechForStPrEx(_exception, _primitiveRecord,
          this.reoteString());
    }
  }
}
