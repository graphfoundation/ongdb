package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;


public class RelationshipRecordFormat extends AbstractHighLimitRecordFormat<RelationshipRecord> {


  public static final int RC_TOT = 32;


  private static final int C1_IN_C1_FLW_BX = 8;


  private static final int C1_IN_C2_FLW_BX = 16;


  private static final int INCS_C1_FLW_FLW_BX = 32;


  private static final int INCS_C2_FLW_FLW_BX = 64;


  private static final int PROP_B_IDNT = 128;

  public RelationshipRecordFormat() {
    this(32);
  }

  RelationshipRecordFormat(int rLeng) {
    super(0, fixedRecordSize(rLeng));
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

  @Override
  protected void doreieaForREPa(int rLeng, boolean isBeingUsed, long hdrLng, PageCursor _pageCursor,
      RelationshipRecord _relationshipRecord) {

    int tNme = _pageCursor.getShort() & '\uffff';

    long rId = _relationshipRecord.getId();
    _relationshipRecord.initialize(isBeingUsed, deecrdrrForPa(NUL, hdrLng, 128, _pageCursor),
        deecrdrrForPa(_pageCursor),
        deecrdrrForPa(_pageCursor), tNme, _deealorrtForPa(hdrLng, 8, _pageCursor, rId),
        _deealifpeForPa(hdrLng, 32, _pageCursor, rId),
        _deealorrtForPa(hdrLng, 16, _pageCursor, rId),
        _deealifpeForPa(hdrLng, 64, _pageCursor, rId), has(hdrLng, 8), has(hdrLng, 16));
  }

  @Override
  protected void dowtieForREPa(PageCursor _pageCursor, RelationshipRecord _relationshipRecord) {
    _pageCursor.putShort((short) _relationshipRecord.getType());

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
  public RelationshipRecord newRecord() {
    return new RelationshipRecord(-1L);
  }

  @Override
  protected int rerdtlgForRE(RelationshipRecord _relationshipRecord) {

    long rId = _relationshipRecord.getId();
    return 2 + leg(NUL, _relationshipRecord.getNextProp()) + leg(_relationshipRecord.getFirstNode())
        + leg(_relationshipRecord.getSecondNode()) +
        leg(_gefrpereeForRe(rId, _relationshipRecord)) + _gerlerrlh(
        _relationshipRecord.getFirstNextRel(), rId) +
        leg(_gescprrfcForRe(rId, _relationshipRecord)) + _gerlerrlh(
        _relationshipRecord.getSecondNextRel(), rId);
  }
}
