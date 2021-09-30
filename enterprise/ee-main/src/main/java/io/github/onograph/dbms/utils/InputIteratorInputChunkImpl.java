package io.github.onograph.dbms.utils;

import java.io.IOException;
import org.neo4j.internal.batchimport.InputIterator;
import org.neo4j.internal.batchimport.input.InputChunk;
import org.neo4j.kernel.impl.store.CommonAbstractStore;


public abstract class InputIteratorInputChunkImpl implements InputIterator {


  private final int iSb;


  private final long lgIh;


  private long lgI;

  InputIteratorInputChunkImpl(CommonAbstractStore<?, ?> _commonAbstractStoreSoeoo) {
    this.iSb = _commonAbstractStoreSoeoo.getRecordsPerPage() * 10;

    try {
      this.lgIh = (long) _commonAbstractStoreSoeoo.getRecordsPerPage() * (
          _commonAbstractStoreSoeoo.getLastPageId() + 1L);
    } catch (

        IOException _iOException) {
      throw new RuntimeException(_iOException);
    }
  }

  @Override
  public void close() {
  }

  @Override
  public synchronized boolean next(InputChunk _inputChunk) {
    if (this.lgI >= this.lgIh) {
      return false;
    } else {

      long _lgIs = this.lgI;
      this.lgI = Long.min(this.lgIh, _lgIs + (long) this.iSb);
      ((AbstractDefaultInputChunk) _inputChunk).secnrae(this.lgI, _lgIs);
      return true;
    }
  }
}
