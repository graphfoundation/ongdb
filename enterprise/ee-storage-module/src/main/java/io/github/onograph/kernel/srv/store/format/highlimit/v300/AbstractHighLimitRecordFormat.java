package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum;
import java.io.IOException;
import java.util.function.Function;
import org.neo4j.exceptions.UnderlyingStorageException;
import org.neo4j.internal.id.IdSequence;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.impl.CompositePageCursor;
import org.neo4j.kernel.impl.store.RecordPageLocationCalculator;
import org.neo4j.kernel.impl.store.StoreHeader;
import org.neo4j.kernel.impl.store.format.BaseOneByteHeaderRecordFormat;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RecordLoad;


abstract class AbstractHighLimitRecordFormat<RECORD extends AbstractBaseRecord> extends
    BaseOneByteHeaderRecordFormat<RECORD> {


  static final int HDX_BX_C1_RCD_CMPT = 4;


  static final int HDX_BX_RCD_CMPT = 2;


  static final long NUL;


  private static final int HDX_BTX = 1;

  static {
    NUL = (long) Record.NULL_REFERENCE.intValue();
  }


  protected AbstractHighLimitRecordFormat(int _iShr, Function<StoreHeader, Integer> rLeng) {
    super(rLeng, _iShr, 1, 50, false);
  }


  private static String _ilasoyrrmgString(long sId) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.kernel.srv.store.format.highlimit.v300.AbstractHighLimitRecordFormat.ilasoyrrmgString",
        sId);
  }


  protected static long deecrdrrForPa(PageCursor _pageCursor) {
    return HighLimitEncEnum.deoForPa(_pageCursor);
  }


  protected static long deecrdrrForPa(long emptLng, long hdrLng, int _iMbh,
      PageCursor _pageCursor) {
    return has(hdrLng, _iMbh) ? deecrdrrForPa(_pageCursor) : emptLng;
  }


  protected static void enoForPa(PageCursor _pageCursor, long refLng) {
    HighLimitEncEnum.enoForPa(refLng, _pageCursor);
  }


  protected static void enoForPa(long emptLng, PageCursor _pageCursor, long refLng) {
    if (refLng != emptLng) {
      HighLimitEncEnum.enoForPa(refLng, _pageCursor);
    }
  }


  protected static int leg(long refLng) {
    return HighLimitEncEnum.leg(refLng);
  }


  protected static int leg(long emptLng, long refLng) {
    return refLng == emptLng ? 0 : leg(refLng);
  }


  protected static byte set(long emptLng, byte hdrByte, int _iMb, long refLng) {
    return set(hdrByte, _iMb, refLng != emptLng);
  }


  protected abstract void doreieaForREPa(int _iVar, boolean _isV, long _lgV, PageCursor _pageCursor,
      RECORD _rcrVa);


  protected abstract void dowtieForREPa(PageCursor _pageCursor, RECORD _rcrVa);


  protected abstract byte hedbsForRE(RECORD _rcrVa);


  protected void makausForPaRE(PageCursor _pageCursor, int rLeng, RECORD _rcrRcr, int rpSize)
      throws IOException {
    this.markAsUnused(_pageCursor);
    if (_rcrRcr.hasSecondaryUnitId()) {

      long sModId = _rcrRcr.getSecondaryUnitId();

      long _lgRsfip = RecordPageLocationCalculator.pageIdForRecord(sModId, rpSize);

      int _iIsfo = RecordPageLocationCalculator.offsetForId(sModId, rLeng, rpSize);
      if (!_pageCursor.next(_lgRsfip)) {

        throw new UnderlyingStorageException("*** Error: 46ba4b9c-c67b-45d1-8c2a-ea0b41f43f6e");
      }

      _pageCursor.setOffset(_iIsfo);
      this.markAsUnused(_pageCursor);
    }
  }

  @Override
  public final void prepare(RECORD _rcrRcr, int rLeng, IdSequence _idSequence,
      CursorContext _cursorContext) {
    if (_rcrRcr.inUse()) {

      int _iLr = 1 + this.rerdtlgForRE(_rcrRcr);

      boolean _isUsr = _iLr > rLeng;
      _rcrRcr.setRequiresSecondaryUnit(_isUsr);
      if (_rcrRcr.requiresSecondaryUnit() && !_rcrRcr.hasSecondaryUnitId()) {
        _rcrRcr.setSecondaryUnitIdOnCreate(_idSequence.nextId(_cursorContext));
      }
    }
  }

  @Override
  public void read(RECORD _rcrRcr, PageCursor _cpPageCursor, RecordLoad mdstr, int rLeng,
      int rpSize) throws IOException {

    int _iPso = _cpPageCursor.getOffset();

    try {

      byte hdrLng = _cpPageCursor.getByte();

      boolean isBeingUsed = this.isInUse(hdrLng);

      boolean _isUrd = has((long) hdrLng, 2);
      if (!_isUrd) {
        this.doreieaForREPa(rLeng, isBeingUsed, (long) hdrLng, _cpPageCursor, _rcrRcr);
        return;
      }

      boolean _isFru = has((long) hdrLng, 4);
      if (_isFru) {

        long sId = HighLimitEncEnum.deoForPa(_cpPageCursor);

        long pId = RecordPageLocationCalculator.pageIdForRecord(sId, rpSize);

        int ofst = RecordPageLocationCalculator.offsetForId(sId, rLeng, rpSize);

        PageCursor _csPageCursor = _cpPageCursor.openLinkedCursor(pId);
        if (!_csPageCursor.next() | ofst < 0) {
          _rcrRcr.clear();
          _cpPageCursor.setCursorException(_ilasoyrrmgString(pId));
          return;
        }

        _csPageCursor.setOffset(ofst + 1);

        int _iSp = rLeng - (_cpPageCursor.getOffset() - _iPso);

        int _iSs = rLeng - 1;

        PageCursor _cmoiePageCursor = CompositePageCursor.compose(_cpPageCursor, _iSp,
            _csPageCursor, _iSs);
        this.doreieaForREPa(rLeng, isBeingUsed, (long) hdrLng, _cmoiePageCursor, _rcrRcr);
        _rcrRcr.setSecondaryUnitIdOnLoad(sId);
        return;
      }

      _rcrRcr.clear();
      if (mdstr.failOnNonFirstUnit()) {
        _cpPageCursor.setCursorException(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.store.format.highlimit.v300.AbstractHighLimitRecordFormat.setCursorException"));
      }
    } finally {
      _cpPageCursor.setOffset(_iPso + rLeng);
    }
  }


  protected abstract int rerdtlgForRE(RECORD _rcrV);

  @Override
  public void write(RECORD _rcrRcr, PageCursor _cpPageCursor, int rLeng, int rpSize)
      throws IOException {
    if (_rcrRcr.inUse()) {

      byte hdrLng = this.hedbsForRE(_rcrRcr);

      assert
          (hdrLng & 7) == 0 :
          "Format-specific header bits (" + hdrLng + ") collides with format-generic header bits";

      hdrLng = set(hdrLng, 1, _rcrRcr.inUse());
      hdrLng = set(hdrLng, 2, _rcrRcr.requiresSecondaryUnit());
      hdrLng = set(hdrLng, 4, true);
      _cpPageCursor.putByte(hdrLng);
      if (_rcrRcr.requiresSecondaryUnit()) {

        long sModId = _rcrRcr.getSecondaryUnitId();

        long pId = RecordPageLocationCalculator.pageIdForRecord(sModId, rpSize);

        int ofst = RecordPageLocationCalculator.offsetForId(sModId, rLeng, rpSize);

        PageCursor _csPageCursor = _cpPageCursor.openLinkedCursor(pId);
        if (!_csPageCursor.next()) {
          _rcrRcr.clear();
          return;
        }

        _csPageCursor.setOffset(ofst);
        _csPageCursor.putByte((byte) 3);

        int _iRswh = rLeng - 1;

        PageCursor _cmoiePageCursor = CompositePageCursor.compose(_cpPageCursor, _iRswh,
            _csPageCursor, _iRswh);
        HighLimitEncEnum.enoForPa(sModId, _cmoiePageCursor);
        this.dowtieForREPa(_cmoiePageCursor, _rcrRcr);
      } else {
        this.dowtieForREPa(_cpPageCursor, _rcrRcr);
      }
    } else {
      this.makausForPaRE(_cpPageCursor, rLeng, _rcrRcr, rpSize);
    }
  }
}
