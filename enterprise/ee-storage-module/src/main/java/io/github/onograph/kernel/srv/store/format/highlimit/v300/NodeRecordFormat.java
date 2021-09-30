package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.Record;


public class NodeRecordFormat extends AbstractHighLimitRecordFormat<NodeRecord> {


  public static final int RC_TOT = 16;


  private static final int DSNX_ND_BX = 8;


  private static final int INCS_LAE_BX = 64;


  private static final int INCS_REL_BX = 16;


  private static final long NULBS;


  private static final int PROP_B_IDNT = 32;

  static {
    NULBS = Record.NO_LABELS_FIELD.intValue();
  }

  public NodeRecordFormat() {
    this(16);
  }

  private NodeRecordFormat(int rLeng) {
    super(0, fixedRecordSize(rLeng));
  }

  @Override
  protected void doreieaForREPa(int rLeng, boolean isBeingUsed, long hdrLng, PageCursor _pageCursor,
      NodeRecord _nodeRecord) {

    boolean isDnse = has(hdrLng, 8);

    long nxtRelIdx = deecrdrrForPa(NUL, hdrLng, 16, _pageCursor);

    long nxt = deecrdrrForPa(NUL, hdrLng, 32, _pageCursor);

    long lblFKey = deecrdrrForPa(NULBS, hdrLng, 64, _pageCursor);
    _nodeRecord.initialize(isBeingUsed, nxt, isDnse, nxtRelIdx, lblFKey);
  }

  @Override
  protected void dowtieForREPa(PageCursor _pageCursor, NodeRecord _nodeRecord) {
    enoForPa(NUL, _pageCursor, _nodeRecord.getNextRel());
    enoForPa(NUL, _pageCursor, _nodeRecord.getNextProp());
    enoForPa(NULBS, _pageCursor, _nodeRecord.getLabelField());
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
  public NodeRecord newRecord() {
    return new NodeRecord(-1L);
  }

  @Override
  public int rerdtlgForRE(NodeRecord _nodeRecord) {
    return leg(NUL, _nodeRecord.getNextRel()) + leg(NUL, _nodeRecord.getNextProp()) + leg(NULBS,
        _nodeRecord.getLabelField());
  }
}
