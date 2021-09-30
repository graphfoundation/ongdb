package io.github.onograph.kernel.srv.store.format.highlimit.v340;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.format.BaseRecordFormat;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.Record;


public class NodeRecordFormat extends AbstractHighLimitRecordFormat<NodeRecord> {


  public static final int RC_TOT = 16;


  static final int FFR_TOT = 15;


  private static final int DSNX_ND_BX = 8;


  private static final long HIH_CHNK_RDX_MSX = 240L;


  private static final long HI_DW_LO_CHNK_CK_MSX = 64424509440L;


  private static final long HI_DW_LO_CHNK_MSX = -68719476736L;


  private static final int INCS_LAE_BX = 64;


  private static final int INCS_REL_BX = 16;


  private static final long LO_CHNK_RDX_MSX = 15L;


  private static final long NULBS;


  private static final int PROP_B_IDNT = 32;

  static {
    NULBS = Record.NO_LABELS_FIELD.intValue();
  }

  public NodeRecordFormat() {
    this(16);
  }

  NodeRecordFormat(int rLeng) {
    super(50, 0, fixedRecordSize(rLeng));
  }


  private static boolean _isRobgegffre(int rLeng) {
    return 15 <= rLeng;
  }


  private static void _refirenreForNoPa(boolean isBeingUsed, boolean isDnse, NodeRecord _nodeRecord,
      PageCursor _pageCursor) {

    byte mdrSrt = _pageCursor.getByte();

    long _lgMr = ((long) mdrSrt & 15L) << 32;

    long _lgMp = ((long) mdrSrt & 240L) << 28;

    long nxtRelIdx = (long) _pageCursor.getInt() & 4294967295L;

    long nxt = (long) _pageCursor.getInt() & 4294967295L;

    long _lgLl = (long) _pageCursor.getInt() & 4294967295L;

    long _lgLh = _pageCursor.getByte() & 255;

    long _lgLbl = _lgLl | _lgLh << 32;
    _nodeRecord.initialize(isBeingUsed, BaseRecordFormat.longFromIntAndMod(nxt, _lgMp), isDnse,
        BaseRecordFormat.longFromIntAndMod(nxtRelIdx, _lgMr), _lgLbl);
  }


  private static void _wrfrerdForNoPa(NodeRecord _nodeRecord, PageCursor _pageCursor) {

    long nxtRelIdx = _nodeRecord.getNextRel();

    long nxt = _nodeRecord.getNextProp();

    short _mrShort = nxtRelIdx == NUL ? 0 : (short) ((int) ((nxtRelIdx & 64424509440L) >> 32));

    short _pmShort = nxt == NUL ? 0 : (short) ((int) ((nxt & 64424509440L) >> 28));

    short mdrSrt = (short) (_mrShort | _pmShort);
    _pageCursor.putByte((byte) mdrSrt);
    _pageCursor.putInt((int) nxtRelIdx);
    _pageCursor.putInt((int) nxt);

    long lblFKey = _nodeRecord.getLabelField();
    _pageCursor.putInt((int) lblFKey);
    _pageCursor.putByte((byte) ((int) ((lblFKey & 1095216660480L) >> 32)));
  }

  @Override
  protected void doreieaForREPa(int rLeng, boolean isBeingUsed, long hdrLng, PageCursor _pageCursor,
      NodeRecord _nodeRecord) {

    boolean isDnse = has(hdrLng, 8);
    if (_nodeRecord.isUseFixedReferences()) {
      _refirenreForNoPa(isBeingUsed, isDnse, _nodeRecord, _pageCursor);
      _nodeRecord.setUseFixedReferences(true);
    } else {

      long nxtRelIdx = deecrdrrForPa(NUL, hdrLng, 16, _pageCursor);

      long nxt = deecrdrrForPa(NUL, hdrLng, 32, _pageCursor);

      long lblFKey = deecrdrrForPa(NULBS, hdrLng, 64, _pageCursor);
      _nodeRecord.initialize(isBeingUsed, nxt, isDnse, nxtRelIdx, lblFKey);
    }
  }

  @Override
  protected void dowtieForREPa(PageCursor _pageCursor, NodeRecord _nodeRecord) {
    if (_nodeRecord.isUseFixedReferences()) {
      _wrfrerdForNoPa(_nodeRecord, _pageCursor);
    } else {
      enoForPa(NUL, _pageCursor, _nodeRecord.getNextRel());
      enoForPa(NUL, _pageCursor, _nodeRecord.getNextProp());
      enoForPa(NULBS, _pageCursor, _nodeRecord.getLabelField());
    }
  }

  @Override
  protected byte hedbsForRE(NodeRecord _nodeRecord) {

    byte hdrByte = 0;
    hdrByte = set(hdrByte, 8, _nodeRecord.isDense());
    hdrByte = set(NUL, hdrByte, 16, _nodeRecord.getNextRel());
    hdrByte = set(NUL, hdrByte, 32, _nodeRecord.getNextProp());
    hdrByte = set(NULBS, hdrByte, 64, _nodeRecord.getLabelField());
    return hdrByte;
  }

  @Override
  protected boolean isCauefdrrsForRE(int rLeng, NodeRecord _nodeRecord) {
    return _isRobgegffre(rLeng) && (_nodeRecord.getNextProp() == NUL
        || (_nodeRecord.getNextProp() & -68719476736L) == 0L) &&
        (_nodeRecord.getNextRel() == NUL || (_nodeRecord.getNextRel() & -68719476736L) == 0L);
  }

  @Override
  public NodeRecord newRecord() {
    return new NodeRecord(-1L);
  }

  @Override
  public int rerdtlgForRE(NodeRecord _nodeRecord) {
    return leg(NUL, _nodeRecord.getNextRel()) + leg(NUL, _nodeRecord.getNextProp()) + leg(NULBS,
        _nodeRecord.getLabelField());
  }
}
