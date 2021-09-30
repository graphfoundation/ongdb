package io.github.onograph.kernel.srv.store.format.highlimit.v306;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;


class RelationshipGroupRecordFormat extends AbstractHighLimitRecordFormat<RelationshipGroupRecord> {


  static final int FFR_TOT = 24;


  static final int RC_TOT = 32;


  private static final long C1_BX_HOV_BX_MSX = -8589934592L;


  private static final int C1_IN_BX = 4;


  private static final int C1_LOO_BX = 8;


  private static final int C1_OUT_BX = 2;


  private static final int FLW_RCD_BX = 1;


  private static final long HI_DW_FIN_BX_MSX = 4294967296L;


  private static final int INCS_FLW_BX = 64;


  private static final int INCS_IN_BX = 16;


  private static final int INCS_LOO_BX = 32;


  private static final int INCS_OUT_BX = 8;


  private static final int OWX_ND_BX = 16;

  RelationshipGroupRecordFormat() {
    this(32);
  }

  RelationshipGroupRecordFormat(int rLeng) {
    super(0, fixedRecordSize(rLeng));
  }


  private static boolean _isRobgegffre(int rLeng) {
    return 24 <= rLeng;
  }


  private static void _refirenmeForRePa(boolean isBeingUsed, PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {

    long mdrSrt = _pageCursor.getByte();

    int tNme = _pageCursor.getShort() & '\uffff';

    long _lgNlb = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBlof = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBlif = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBllf = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBlno = (long) _pageCursor.getInt() & 4294967295L;

    long mxtMatIdx = (mdrSrt & 1L) << 32;

    long _lgMof = (mdrSrt & 2L) << 31;

    long _lgMif = (mdrSrt & 4L) << 30;

    long _lgMlf = (mdrSrt & 8L) << 29;

    long _lgMno = (mdrSrt & 16L) << 28;
    _relationshipGroupRecord.initialize(isBeingUsed, tNme, longFromIntAndMod(_lgBlof, _lgMof),
        longFromIntAndMod(_lgBlif, _lgMif),
        longFromIntAndMod(_lgBllf, _lgMlf), longFromIntAndMod(_lgBlno, _lgMno),
        longFromIntAndMod(_lgNlb, mxtMatIdx));
  }


  private static void _wrfrerdForRePa(PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {

    long mxtMatIdx = _relationshipGroupRecord.getNext() == NUL ? 0L
        : (_relationshipGroupRecord.getNext() & 4294967296L) >> 32;

    long _lgMof = _relationshipGroupRecord.getFirstOut() == NUL ? 0L
        : (_relationshipGroupRecord.getFirstOut() & 4294967296L) >> 31;

    long _lgMif = _relationshipGroupRecord.getFirstIn() == NUL ? 0L
        : (_relationshipGroupRecord.getFirstIn() & 4294967296L) >> 30;

    long _lgMlf = _relationshipGroupRecord.getFirstLoop() == NUL ? 0L
        : (_relationshipGroupRecord.getFirstLoop() & 4294967296L) >> 29;

    long _lgMno = _relationshipGroupRecord.getOwningNode() == NUL ? 0L
        : (_relationshipGroupRecord.getOwningNode() & 4294967296L) >> 28;
    _pageCursor.putByte((byte) ((int) (mxtMatIdx | _lgMof | _lgMif | _lgMlf | _lgMno)));
    _pageCursor.putShort((short) _relationshipGroupRecord.getType());
    _pageCursor.putInt((int) _relationshipGroupRecord.getNext());
    _pageCursor.putInt((int) _relationshipGroupRecord.getFirstOut());
    _pageCursor.putInt((int) _relationshipGroupRecord.getFirstIn());
    _pageCursor.putInt((int) _relationshipGroupRecord.getFirstLoop());
    _pageCursor.putInt((int) _relationshipGroupRecord.getOwningNode());
  }

  @Override
  protected void doreieaForREPa(int rLeng, boolean isBeingUsed, long hdrLng, PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {
    if (_relationshipGroupRecord.isUseFixedReferences()) {
      _refirenmeForRePa(isBeingUsed, _pageCursor, _relationshipGroupRecord);
      _relationshipGroupRecord.setUseFixedReferences(true);
    } else {
      _relationshipGroupRecord.initialize(isBeingUsed, _pageCursor.getShort() & '\uffff',
          deecrdrrForPa(NUL, hdrLng, 8, _pageCursor),
          deecrdrrForPa(NUL, hdrLng, 16, _pageCursor), deecrdrrForPa(NUL, hdrLng, 32, _pageCursor),
          deecrdrrForPa(_pageCursor), deecrdrrForPa(NUL, hdrLng, 64, _pageCursor));
    }
  }

  @Override
  protected void dowtieForREPa(PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {
    if (_relationshipGroupRecord.isUseFixedReferences()) {
      _wrfrerdForRePa(_pageCursor, _relationshipGroupRecord);
    } else {
      _pageCursor.putShort((short) _relationshipGroupRecord.getType());
      enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstOut());
      enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstIn());
      enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstLoop());
      enoForPa(_pageCursor, _relationshipGroupRecord.getOwningNode());
      enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getNext());
    }
  }

  @Override
  protected byte hedbsForRE(RelationshipGroupRecord _relationshipGroupRecord) {

    byte hdrByte = 0;
    hdrByte = set(NUL, hdrByte, 8, _relationshipGroupRecord.getFirstOut());
    hdrByte = set(NUL, hdrByte, 16, _relationshipGroupRecord.getFirstIn());
    hdrByte = set(NUL, hdrByte, 32, _relationshipGroupRecord.getFirstLoop());
    hdrByte = set(NUL, hdrByte, 64, _relationshipGroupRecord.getNext());
    return hdrByte;
  }

  @Override
  protected boolean isCauefdrrsForRE(int rLeng, RelationshipGroupRecord _relationshipGroupRecord) {
    return _isRobgegffre(rLeng) && (_relationshipGroupRecord.getNext() == NUL
        || (_relationshipGroupRecord.getNext() & -8589934592L) == 0L) &&
        (_relationshipGroupRecord.getFirstOut() == NUL
            || (_relationshipGroupRecord.getFirstOut() & -8589934592L) == 0L) &&
        (_relationshipGroupRecord.getFirstIn() == NUL
            || (_relationshipGroupRecord.getFirstIn() & -8589934592L) == 0L) &&
        (_relationshipGroupRecord.getFirstLoop() == NUL
            || (_relationshipGroupRecord.getFirstLoop() & -8589934592L) == 0L) &&
        (_relationshipGroupRecord.getOwningNode() == NUL
            || (_relationshipGroupRecord.getOwningNode() & -8589934592L) == 0L);
  }

  @Override
  public RelationshipGroupRecord newRecord() {
    return new RelationshipGroupRecord(-1L);
  }

  @Override
  protected int rerdtlgForRE(RelationshipGroupRecord _relationshipGroupRecord) {
    return 2 + leg(NUL, _relationshipGroupRecord.getFirstOut()) + leg(NUL,
        _relationshipGroupRecord.getFirstIn()) +
        leg(NUL, _relationshipGroupRecord.getFirstLoop()) +
        leg(_relationshipGroupRecord.getOwningNode()) + leg(NUL,
        _relationshipGroupRecord.getNext());
  }
}
