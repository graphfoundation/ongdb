package io.github.onograph.kernel.srv.store.format.highlimit;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.format.BaseRecordFormat;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;


public class RelationshipGroupHighLimitRecordFormat extends
    AbstractHighLimitRecordFormat<RelationshipGroupRecord> {


  public static final int V_INCS_FLW_BX = 64;


  public static final int V_INCS_IN_BX = 16;


  public static final int V_INCS_LOO_BX = 32;


  public static final int V_INCS_OUT_BX = 8;


  static final int FFR_TOT = 25;


  static final int RC_TOT = 32;


  private static final long F_C1_BX_HOV_BX_MSX = -8589934592L;


  private static final int F_C1_IN_BX = 4;


  private static final int F_C1_LOO_BX = 8;


  private static final int F_C1_OUT_BX = 2;


  private static final int F_FLW_RCD_BX = 1;


  private static final long F_HI_DW_FIN_BX_MSX = 4294967296L;


  private static final int F_INCS_EXT_TDEG_IN_BX = 64;


  private static final int F_INCS_EXT_TDEG_LOO_BX = 128;


  private static final int F_INCS_EXT_TDEG_OUT_BX = 32;


  private static final int F_OWX_ND_BX = 16;


  private static final int TPX_BTXS = 3;


  private static final int V_INCS_ANY_EXT_TDEG_BX = 128;


  private static final int V_INCS_DIR_EXT_TDEG_MSX = 1;


  private static final int V_INCS_IN_EXT_TDEG_SHF = 1;


  private static final int V_INCS_LOO_EXT_TDEG_SHF = 2;


  private static final int V_INCS_OUT_EXT_TDEG_SHF = 0;


  private static final int V_OWX_ND_EXT_TDEG_SHF = 3;

  public RelationshipGroupHighLimitRecordFormat() {
    this(32);
  }

  public RelationshipGroupHighLimitRecordFormat(int rLeng) {
    super(50, 0, fixedRecordSize(rLeng));
  }


  private static int _geteForPa(PageCursor _pageCursor) {

    int _iWlt = _pageCursor.getShort() & '\uffff';

    int _iBht = _pageCursor.getByte() & 255;
    return _iBht << 16 | _iWlt;
  }


  private static boolean _isHaayerdesForRe(RelationshipGroupRecord _relationshipGroupRecord) {
    return _relationshipGroupRecord.hasExternalDegreesOut()
        || _relationshipGroupRecord.hasExternalDegreesIn() ||
        _relationshipGroupRecord.hasExternalDegreesLoop();
  }


  private static boolean _isRobgegffre(int rLeng) {
    return 25 <= rLeng;
  }


  private static long _owgnwexadrbiForRe(RelationshipGroupRecord _relationshipGroupRecord) {

    long _lgNo = _relationshipGroupRecord.getOwningNode();
    if (_isHaayerdesForRe(_relationshipGroupRecord)) {
      _lgNo <<= 3;
      _lgNo |= _relationshipGroupRecord.hasExternalDegreesOut() ? 1L : 0L;
      _lgNo |= _relationshipGroupRecord.hasExternalDegreesIn() ? 2L : 0L;
      _lgNo |= _relationshipGroupRecord.hasExternalDegreesLoop() ? 4L : 0L;
    }

    return _lgNo;
  }


  private static void _refirenmeForRePa(boolean isBeingUsed, PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {

    long mdrSrt = _pageCursor.getByte();

    int tNme = _geteForPa(_pageCursor);

    long _lgBln = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBlof = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBlif = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBllf = (long) _pageCursor.getInt() & 4294967295L;

    long _lgBlno = (long) _pageCursor.getInt() & 4294967295L;

    long mxtMatIdx = (mdrSrt & 1L) << 32;

    long _lgMof = (mdrSrt & 2L) << 31;

    long _lgMif = (mdrSrt & 4L) << 30;

    long _lgFlm = (mdrSrt & 8L) << 29;

    long _lgMno = (mdrSrt & 16L) << 28;

    boolean _isOdeh = (mdrSrt & 32L) != 0L;

    boolean _isIdeh = (mdrSrt & 64L) != 0L;

    boolean _isLdeh = (mdrSrt & 128L) != 0L;
    _relationshipGroupRecord.initialize(isBeingUsed, tNme,
        BaseRecordFormat.longFromIntAndMod(_lgBlof, _lgMof),
        BaseRecordFormat.longFromIntAndMod(_lgBlif, _lgMif),
        BaseRecordFormat.longFromIntAndMod(_lgBllf, _lgFlm),
        BaseRecordFormat.longFromIntAndMod(_lgBlno, _lgMno),
        BaseRecordFormat.longFromIntAndMod(_lgBln, mxtMatIdx));
    _relationshipGroupRecord.setHasExternalDegreesOut(_isOdeh);
    _relationshipGroupRecord.setHasExternalDegreesIn(_isIdeh);
    _relationshipGroupRecord.setHasExternalDegreesLoop(_isLdeh);
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

    long _lgHedom = _relationshipGroupRecord.hasExternalDegreesOut() ? 32L : 0L;

    long _lgMideh = _relationshipGroupRecord.hasExternalDegreesIn() ? 64L : 0L;

    long _lgMldeh = _relationshipGroupRecord.hasExternalDegreesLoop() ? 128L : 0L;
    _pageCursor.putByte(
        (byte) ((int) (mxtMatIdx | _lgMof | _lgMif | _lgMlf | _lgMno | _lgHedom | _lgMideh |
            _lgMldeh)));
    _wrttyForPa(_pageCursor, _relationshipGroupRecord.getType());
    _pageCursor.putInt((int) _relationshipGroupRecord.getNext());
    _pageCursor.putInt((int) _relationshipGroupRecord.getFirstOut());
    _pageCursor.putInt((int) _relationshipGroupRecord.getFirstIn());
    _pageCursor.putInt((int) _relationshipGroupRecord.getFirstLoop());
    _pageCursor.putInt((int) _relationshipGroupRecord.getOwningNode());
  }


  private static void _wrttyForPa(PageCursor _pageCursor, int tNme) {
    _pageCursor.putShort((short) tNme);
    _pageCursor.putByte((byte) (tNme >>> 16));
  }

  @Override
  protected void doreieaForREPa(int rLeng, boolean isBeingUsed, long hdrLng, PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {
    if (_relationshipGroupRecord.isUseFixedReferences()) {
      _refirenmeForRePa(isBeingUsed, _pageCursor, _relationshipGroupRecord);
      _relationshipGroupRecord.setUseFixedReferences(true);
    } else {

      int tNme = _geteForPa(_pageCursor);

      long _lgOf = deecrdrrForPa(NUL, hdrLng, 8, _pageCursor);

      long _lgIf = deecrdrrForPa(NUL, hdrLng, 16, _pageCursor);

      long _lgLf = deecrdrrForPa(NUL, hdrLng, 32, _pageCursor);

      long _lgNo = deecrdrrForPa(_pageCursor);

      long _lgN = deecrdrrForPa(NUL, hdrLng, 64, _pageCursor);

      boolean _isOdeh = false;

      boolean _isIdeh = false;

      boolean _isLdeh = false;

      boolean _isHaed = (hdrLng & 128L) != 0L;
      if (_isHaed) {
        _isOdeh = (_lgNo >> 0 & 1L) != 0L;
        _isIdeh = (_lgNo >> 1 & 1L) != 0L;
        _isLdeh = (_lgNo >> 2 & 1L) != 0L;
        _lgNo >>= 3;
      }

      _relationshipGroupRecord.initialize(isBeingUsed, tNme, _lgOf, _lgIf, _lgLf, _lgNo, _lgN);
      _relationshipGroupRecord.setHasExternalDegreesOut(_isOdeh);
      _relationshipGroupRecord.setHasExternalDegreesIn(_isIdeh);
      _relationshipGroupRecord.setHasExternalDegreesLoop(_isLdeh);
    }
  }

  @Override
  protected void dowtieForREPa(PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {
    if (_relationshipGroupRecord.isUseFixedReferences()) {
      _wrfrerdForRePa(_pageCursor, _relationshipGroupRecord);
    } else {
      _wrttyForPa(_pageCursor, _relationshipGroupRecord.getType());
      enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstOut());
      enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstIn());
      enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstLoop());
      enoForPa(_pageCursor, _owgnwexadrbiForRe(_relationshipGroupRecord));
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
    hdrByte = set(hdrByte, 128, _isHaayerdesForRe(_relationshipGroupRecord));
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
    return 3 + leg(NUL, _relationshipGroupRecord.getFirstOut()) + leg(NUL,
        _relationshipGroupRecord.getFirstIn()) +
        leg(NUL, _relationshipGroupRecord.getFirstLoop()) +
        leg(_owgnwexadrbiForRe(_relationshipGroupRecord)) + leg(NUL,
        _relationshipGroupRecord.getNext());
  }
}
