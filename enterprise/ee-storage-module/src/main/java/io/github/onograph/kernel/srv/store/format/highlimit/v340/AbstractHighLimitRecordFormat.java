package io.github.onograph.kernel.srv.store.format.highlimit.v340;

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


  static final int HDX_BTX = 1;


  static final int HDX_BX_C1_RCD_CMPT = 4;


  static final int HDX_BX_FXD_RFD = 4;


  static final int HDX_BX_RCD_CMPT = 2;


  static final long NUL;

  static {
    NUL = Record.NULL_REFERENCE.intValue();
  }


  protected AbstractHighLimitRecordFormat(int _iBim, int _iShr,
      Function<StoreHeader, Integer> rLeng) {
    super(rLeng, _iShr, 1, _iBim, false);
  }


  private static String _ilasoyrrmgString(long sId) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.kernel.srv.store.format.highlimit.v340.AbstractHighLimitRecordFormat.ilasoyrrmgString",
        sId);
  }


  private static boolean _isUfre(byte hdrLng) {
    return !has(hdrLng, 4);
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


  protected static byte set(long emptLng, byte hdrByte, int _iBm, long refLng) {
    return set(hdrByte, _iBm, refLng != emptLng);
  }


  protected abstract void doreieaForREPa(int _iVar, boolean _isVar, long _lgV,
      PageCursor _pageCursor, RECORD _rcrV);


  protected abstract void dowtieForREPa(PageCursor _pageCursor, RECORD _rcrVar);


  protected abstract byte hedbsForRE(RECORD _rcrVa);


  protected abstract boolean isCauefdrrsForRE(int _iVar, RECORD _rcrVa);


  protected void makausForPaRE(PageCursor _pageCursor, int rLeng, RECORD _rcrRcr, int rpSize)
      throws IOException {
    this.markAsUnused(_pageCursor);
    if (_rcrRcr.hasSecondaryUnitId()) {

      long sModId = _rcrRcr.getSecondaryUnitId();

      long _lgRsfip = RecordPageLocationCalculator.pageIdForRecord(sModId, rpSize);

      int _iOfsi = RecordPageLocationCalculator.offsetForId(sModId, rLeng, rpSize);
      if (!_pageCursor.next(_lgRsfip)) {

        throw new UnderlyingStorageException("*** Error: 61605592-c759-4859-84f4-9d800565230e");
      }

      _pageCursor.setOffset(_iOfsi);
      this.markAsUnused(_pageCursor);
    }
  }

  @Override
  public final void prepare(RECORD _rcrRcr, int rLeng, IdSequence _idSequence,
      CursorContext _cursorContext) {
    if (_rcrRcr.inUse()) {
      _rcrRcr.setUseFixedReferences(this.isCauefdrrsForRE(rLeng, _rcrRcr));
      if (!_rcrRcr.isUseFixedReferences()) {

        int _iLr = 1 + this.rerdtlgForRE(_rcrRcr);

        boolean _isRsu = _iLr > rLeng;
        _rcrRcr.setRequiresSecondaryUnit(_isRsu);
        if (_rcrRcr.requiresSecondaryUnit() && !_rcrRcr.hasSecondaryUnitId()) {
          _rcrRcr.setSecondaryUnitIdOnCreate(_idSequence.nextId(_cursorContext));
        }
      }
    }
  }

  @Override
  public void read(RECORD _rcrRcr, PageCursor _cpPageCursor, RecordLoad mdstr, int rLeng,
      int rpSize) throws IOException {

    int _iOsp = _cpPageCursor.getOffset();

    try {

      byte hdrLng = _cpPageCursor.getByte();

      boolean isBeingUsed = this.isInUse(hdrLng);

      boolean _isUrd = has(hdrLng, 2);
      _rcrRcr.setUseFixedReferences(false);
      if (_isUrd) {

        boolean _isUrf = has(hdrLng, 4);
        if (!_isUrf) {
          _rcrRcr.clear();
          if (mdstr.failOnNonFirstUnit()) {
            _cpPageCursor.setCursorException(io.github.onograph.I18N.format(
                "io.github.onograph.kernel.srv.store.format.highlimit.v340.AbstractHighLimitRecordFormat.setCursorException"));
          }

          return;
        }

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

        int _iSp = rLeng - (_cpPageCursor.getOffset() - _iOsp);

        int _iSs = rLeng - 1;

        PageCursor _cmoiePageCursor = CompositePageCursor.compose(_cpPageCursor, _iSp,
            _csPageCursor, _iSs);
        this.doreieaForREPa(rLeng, isBeingUsed, hdrLng, _cmoiePageCursor, _rcrRcr);
        _rcrRcr.setSecondaryUnitIdOnLoad(sId);
      } else {
        _rcrRcr.setUseFixedReferences(_isUfre(hdrLng));
        this.doreieaForREPa(rLeng, isBeingUsed, hdrLng, _cpPageCursor, _rcrRcr);
      }
    } finally {
      _cpPageCursor.setOffset(_iOsp + rLeng);
    }
  }


  protected abstract int rerdtlgForRE(RECORD _rcrVa);

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
      if (_rcrRcr.requiresSecondaryUnit()) {
        hdrLng = set(hdrLng, 4, true);
      } else {
        hdrLng = set(hdrLng, 4, !_rcrRcr.isUseFixedReferences());
      }

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

        int _iHwsr = rLeng - 1;

        PageCursor _cmoiePageCursor = CompositePageCursor.compose(_cpPageCursor, _iHwsr,
            _csPageCursor, _iHwsr);
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
