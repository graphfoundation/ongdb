package io.github.onograph.kernel.srv.store.format.highlimit.v340;

import io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.format.BaseRecordFormat;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;


class RelationshipRecordFormat extends AbstractHighLimitRecordFormat<RelationshipRecord> {


  static final int FFR_TOT = 32;


  static final int RC_TOT = 32;


  private static final long C1_BX_HOV_BX_MSX = -8589934592L;


  private static final long C1_FLW_REL_BX = 8L;


  private static final int C1_IN_C1_FLW_BX = 8;


  private static final int C1_IN_C2_FLW_BX = 16;


  private static final long C1_ND_BX = 1L;


  private static final long C1_PRE_REL_BX = 4L;


  private static final long C2_BX_FXD_RFD_BX_MSX = 12884901888L;


  private static final long C2_FLW_REL_BX = 32L;


  private static final long C2_ND_BX = 2L;


  private static final long C2_RRE_REL_BX = 16L;


  private static final long C3_BXS_HOV_BX_MSX = -17179869184L;


  private static final long FLW_PRO_BX = 192L;


  private static final long HI_DW_FIN_BX_MSX = 4294967296L;


  private static final int INCS_C1_FLW_FLW_BX = 32;


  private static final int INCS_C2_FLW_FLW_BX = 64;


  private static final int PROP_B_IDNT = 128;


  private static final int TPX_PROP_BTXS = 3;

  RelationshipRecordFormat() {
    this(32);
  }

  RelationshipRecordFormat(int rLeng) {
    super(50, 0, fixedRecordSize(rLeng));
  }


  private static long _deealifpeForPa(long hdrLng, int _iBc, PageCursor _pageCursor, long rId) {
    return has(hdrLng, _iBc) ? HighLimitEncEnum.toable(rId, deecrdrrForPa(_pageCursor)) : NUL;
  }


  private static long _deealorrtForPa(long hdrLng, int _iBsif, PageCursor _pageCursor, long rId) {
    return has(hdrLng, _iBsif) ? deecrdrrForPa(_pageCursor)
        : HighLimitEncEnum.toable(rId, deecrdrrForPa(_pageCursor));
  }


  private static long _gefrpereeForRe(long rId, RelationshipRecord _relationshipRecord) {
    return _relationshipRecord.isFirstInFirstChain() ? _relationshipRecord.getFirstPrevRel()
        : HighLimitEncEnum.torete(rId, _relationshipRecord.getFirstPrevRel());
  }


  private static int _gerlerrlh(long _lgRa, long rId) {
    return _lgRa != NUL ? leg(HighLimitEncEnum.torete(rId, _lgRa)) : 0;
  }


  private static long _gescprrfcForRe(long rId, RelationshipRecord _relationshipRecord) {
    return _relationshipRecord.isFirstInSecondChain() ? _relationshipRecord.getSecondPrevRel()
        : HighLimitEncEnum.torete(rId, _relationshipRecord.getSecondPrevRel());
  }


  private static boolean _isRobgegffre(int rLeng) {
    return 32 <= rLeng;
  }


  private static void _refirenreForRePa(long hdrLng, boolean isBeingUsed, PageCursor _pageCursor,
      RelationshipRecord _relationshipRecord, int tNme) {

    long mdrSrt = _pageCursor.getByte();

    long _lgNf = (long) _pageCursor.getInt() & 4294967295L;

    long _lgMnf = (mdrSrt & 1L) << 32;

    long _lgNs = (long) _pageCursor.getInt() & 4294967295L;

    long _lgSnm = (mdrSrt & 2L) << 31;

    long _lgRpf = (long) _pageCursor.getInt() & 4294967295L;

    long _lgFprm = (mdrSrt & 4L) << 30;

    long _lgFnr = (long) _pageCursor.getInt() & 4294967295L;

    long _lgMrnf = (mdrSrt & 8L) << 29;

    long _lgRps = (long) _pageCursor.getInt() & 4294967295L;

    long _lgMrps = (mdrSrt & 16L) << 28;

    long _lgRns = (long) _pageCursor.getInt() & 4294967295L;

    long _lgMrns = (mdrSrt & 32L) << 27;

    long nxt = (long) _pageCursor.getInt() & 4294967295L;

    long _lgMpn = (mdrSrt & 192L) << 26;
    _relationshipRecord.initialize(isBeingUsed, BaseRecordFormat.longFromIntAndMod(nxt, _lgMpn),
        BaseRecordFormat.longFromIntAndMod(_lgNf, _lgMnf),
        BaseRecordFormat.longFromIntAndMod(_lgNs, _lgSnm), tNme,
        BaseRecordFormat.longFromIntAndMod(_lgRpf, _lgFprm),
        BaseRecordFormat.longFromIntAndMod(_lgFnr, _lgMrnf),
        BaseRecordFormat.longFromIntAndMod(_lgRps, _lgMrps),
        BaseRecordFormat.longFromIntAndMod(_lgRns, _lgMrns), has(hdrLng, 8), has(hdrLng, 16));
  }


  private static void _wrfrerdForRePa(PageCursor _pageCursor,
      RelationshipRecord _relationshipRecord) {
    _pageCursor.putShort((short) _relationshipRecord.getType());

    long _lgNf = _relationshipRecord.getFirstNode();

    short _mnfShort = (short) ((int) ((_lgNf & 4294967296L) >> 32));

    long _lgNs = _relationshipRecord.getSecondNode();

    long _lgMns = (_lgNs & 4294967296L) >> 31;

    long _lgRpf = _relationshipRecord.getFirstPrevRel();

    long _lgMrpf = _lgRpf == NUL ? 0L : (_lgRpf & 4294967296L) >> 30;

    long _lgFnr = _relationshipRecord.getFirstNextRel();

    long _lgFnrm = _lgFnr == NUL ? 0L : (_lgFnr & 4294967296L) >> 29;

    long _lgRps = _relationshipRecord.getSecondPrevRel();

    long _lgMrps = _lgRps == NUL ? 0L : (_lgRps & 4294967296L) >> 28;

    long _lgRns = _relationshipRecord.getSecondNextRel();

    long _lgSnrm = _lgRns == NUL ? 0L : (_lgRns & 4294967296L) >> 27;

    long nxt = _relationshipRecord.getNextProp();

    long _lgMpn = nxt == NUL ? 0L : (nxt & 12884901888L) >> 26;

    short mdrSrt =
        (short) ((int) ((long) _mnfShort | _lgMns | _lgMrpf | _lgFnrm | _lgMrps | _lgSnrm
            | _lgMpn));
    _pageCursor.putByte((byte) mdrSrt);
    _pageCursor.putInt((int) _lgNf);
    _pageCursor.putInt((int) _lgNs);
    _pageCursor.putInt((int) _lgRpf);
    _pageCursor.putInt((int) _lgFnr);
    _pageCursor.putInt((int) _lgRps);
    _pageCursor.putInt((int) _lgRns);
    _pageCursor.putInt((int) nxt);
  }

  @Override
  protected void doreieaForREPa(int rLeng, boolean isBeingUsed, long hdrLng, PageCursor _pageCursor,
      RelationshipRecord _relationshipRecord) {

    int tNme;
    if (_relationshipRecord.isUseFixedReferences()) {
      tNme = _pageCursor.getShort() & '\uffff';
      _refirenreForRePa(hdrLng, isBeingUsed, _pageCursor, _relationshipRecord, tNme);
      _relationshipRecord.setUseFixedReferences(true);
    } else {
      tNme = _pageCursor.getShort() & '\uffff';

      int _iWht = _pageCursor.getByte() & 255;
      tNme = _iWht << 16 | tNme;

      long rId = _relationshipRecord.getId();
      _relationshipRecord.initialize(isBeingUsed, deecrdrrForPa(NUL, hdrLng, 128, _pageCursor),
          deecrdrrForPa(_pageCursor),
          deecrdrrForPa(_pageCursor), tNme, _deealorrtForPa(hdrLng, 8, _pageCursor, rId),
          _deealifpeForPa(hdrLng, 32, _pageCursor, rId),
          _deealorrtForPa(hdrLng, 16, _pageCursor, rId),
          _deealifpeForPa(hdrLng, 64, _pageCursor, rId), has(hdrLng, 8), has(hdrLng, 16));
    }
  }

  @Override
  protected void dowtieForREPa(PageCursor _pageCursor, RelationshipRecord _relationshipRecord) {
    if (_relationshipRecord.isUseFixedReferences()) {
      _wrfrerdForRePa(_pageCursor, _relationshipRecord);
    } else {

      int tNme = _relationshipRecord.getType();
      _pageCursor.putShort((short) tNme);
      _pageCursor.putByte((byte) (tNme >>> 16));

      long rId = _relationshipRecord.getId();
      enoForPa(NUL, _pageCursor, _relationshipRecord.getNextProp());
      enoForPa(_pageCursor, _relationshipRecord.getFirstNode());
      enoForPa(_pageCursor, _relationshipRecord.getSecondNode());
      enoForPa(_pageCursor, _gefrpereeForRe(rId, _relationshipRecord));
      if (_relationshipRecord.getFirstNextRel() != NUL) {
        enoForPa(_pageCursor, HighLimitEncEnum.torete(rId, _relationshipRecord.getFirstNextRel()));
      }

      enoForPa(_pageCursor, _gescprrfcForRe(rId, _relationshipRecord));
      if (_relationshipRecord.getSecondNextRel() != NUL) {
        enoForPa(_pageCursor, HighLimitEncEnum.torete(rId, _relationshipRecord.getSecondNextRel()));
      }
    }
  }

  @Override
  protected byte hedbsForRE(RelationshipRecord _relationshipRecord) {

    byte hdrByte = 0;
    hdrByte = set(hdrByte, 8, _relationshipRecord.isFirstInFirstChain());
    hdrByte = set(hdrByte, 16, _relationshipRecord.isFirstInSecondChain());
    hdrByte = set(NUL, hdrByte, 128, _relationshipRecord.getNextProp());
    hdrByte = set(NUL, hdrByte, 32, _relationshipRecord.getFirstNextRel());
    hdrByte = set(NUL, hdrByte, 64, _relationshipRecord.getSecondNextRel());
    return hdrByte;
  }

  @Override
  protected boolean isCauefdrrsForRE(int rLeng, RelationshipRecord _relationshipRecord) {
    return _isRobgegffre(rLeng) && _relationshipRecord.getType() < 65536
        && (_relationshipRecord.getFirstNode() & -8589934592L) == 0L &&
        (_relationshipRecord.getSecondNode() & -8589934592L) == 0L &&
        (_relationshipRecord.getFirstPrevRel() == NUL
            || (_relationshipRecord.getFirstPrevRel() & -8589934592L) == 0L) &&
        (_relationshipRecord.getFirstNextRel() == NUL
            || (_relationshipRecord.getFirstNextRel() & -8589934592L) == 0L) &&
        (_relationshipRecord.getSecondPrevRel() == NUL
            || (_relationshipRecord.getSecondPrevRel() & -8589934592L) == 0L) &&
        (_relationshipRecord.getSecondNextRel() == NUL
            || (_relationshipRecord.getSecondNextRel() & -8589934592L) == 0L) &&
        (_relationshipRecord.getNextProp() == NUL
            || (_relationshipRecord.getNextProp() & -17179869184L) == 0L);
  }

  @Override
  public RelationshipRecord newRecord() {
    return new RelationshipRecord(-1L);
  }

  @Override
  protected int rerdtlgForRE(RelationshipRecord _relationshipRecord) {

    long rId = _relationshipRecord.getId();
    return 3 + leg(NUL, _relationshipRecord.getNextProp()) + leg(_relationshipRecord.getFirstNode())
        + leg(_relationshipRecord.getSecondNode()) +
        leg(_gefrpereeForRe(rId, _relationshipRecord)) + _gerlerrlh(
        _relationshipRecord.getFirstNextRel(), rId) +
        leg(_gescprrfcForRe(rId, _relationshipRecord)) + _gerlerrlh(
        _relationshipRecord.getSecondNextRel(), rId);
  }
}
