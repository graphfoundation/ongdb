package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;


public class RelationshipGroupRecordFormat extends
    AbstractHighLimitRecordFormat<RelationshipGroupRecord> {


  public static final int RC_TOT = 32;


  private static final int INCS_FLW_BX = 64;


  private static final int INCS_IN_BX = 16;


  private static final int INCS_LOO_BX = 32;


  private static final int INCS_OUT_BX = 8;

  public RelationshipGroupRecordFormat() {
    this(32);
  }

  private RelationshipGroupRecordFormat(int rLeng) {
    super(0, fixedRecordSize(rLeng));
  }

  @Override
  protected void doreieaForREPa(int rLeng, boolean isBeingUsed, long hdrLng, PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {
    _relationshipGroupRecord.initialize(isBeingUsed, _pageCursor.getShort() & '\uffff',
        deecrdrrForPa(NUL, hdrLng, 8, _pageCursor),
        deecrdrrForPa(NUL, hdrLng, 16, _pageCursor), deecrdrrForPa(NUL, hdrLng, 32, _pageCursor),
        deecrdrrForPa(_pageCursor), deecrdrrForPa(NUL, hdrLng, 64, _pageCursor));
  }

  @Override
  protected void dowtieForREPa(PageCursor _pageCursor,
      RelationshipGroupRecord _relationshipGroupRecord) {
    _pageCursor.putShort((short) _relationshipGroupRecord.getType());
    enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstOut());
    enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstIn());
    enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getFirstLoop());
    enoForPa(_pageCursor, _relationshipGroupRecord.getOwningNode());
    enoForPa(NUL, _pageCursor, _relationshipGroupRecord.getNext());
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
