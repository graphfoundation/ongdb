package io.github.onograph.kernel.srv.store.format.highlimit;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.format.BaseOneByteHeaderRecordFormat;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;


public class RecordFormatDynamicRecordImpl extends BaseOneByteHeaderRecordFormat<DynamicRecord> {


  private static final int BEG_RCD_BX = 8;


  private static final int RCD_HDX_SIZ = 12;

  public RecordFormatDynamicRecordImpl() {
    super(INT_STORE_HEADER_READER, 12, 1, 50, false);
  }


  private static String _neipyemgString(DynamicRecord _dynamicRecord, int len) {
    return String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl.format"),
        _dynamicRecord.getId(), len);
  }


  private static String _paalgermsString(DynamicRecord _dynamicRecord, int len, int rLeng) {
    return len < 0 ? _neipyemgString(_dynamicRecord, len)
        : org.neo4j.kernel.impl.store.format.standard.DynamicRecordFormat.payloadTooBigErrorMessage(
            _dynamicRecord, rLeng, len);
  }

  @Override
  public long getNextRecordReference(DynamicRecord _dynamicRecord) {
    return _dynamicRecord.getNextBlock();
  }

  @Override
  public DynamicRecord newRecord() {
    return new DynamicRecord(-1L);
  }

  @Override
  public void read(DynamicRecord _dynamicRecord, PageCursor _pageCursor, RecordLoad mdstr,
      int rLeng, int rpSize) {

    byte hdrLng = _pageCursor.getByte();

    boolean isBeingUsed = this.isInUse(hdrLng);
    if (mdstr.shouldLoad(isBeingUsed)) {

      int len = _pageCursor.getShort() | _pageCursor.getByte() << 16;
      if (len > rLeng || len < 0) {
        _pageCursor.setCursorException(_paalgermsString(_dynamicRecord, len, rLeng));
        return;
      }

      long _lgN = _pageCursor.getLong();

      boolean _isRsi = (hdrLng & 8) != 0;
      _dynamicRecord.initialize(isBeingUsed, _isRsi, _lgN, -1);
      org.neo4j.kernel.impl.store.format.standard.DynamicRecordFormat.readData(_dynamicRecord,
          _pageCursor, len);
    } else {
      _dynamicRecord.setInUse(isBeingUsed);
    }
  }

  @Override
  public void write(DynamicRecord _dynamicRecord, PageCursor _pageCursor, int rLeng, int rpSize) {
    if (_dynamicRecord.inUse()) {
      assert _dynamicRecord.getLength() < 16777215;

      byte hdrLng = (byte) ((_dynamicRecord.inUse() ? 1 : 0) | (_dynamicRecord.isStartRecord() ? 8
          : 0));
      _pageCursor.putByte(hdrLng);
      _pageCursor.putShort((short) _dynamicRecord.getLength());
      _pageCursor.putByte((byte) (_dynamicRecord.getLength() >>> 16));
      _pageCursor.putLong(_dynamicRecord.getNextBlock());
      _pageCursor.putBytes(_dynamicRecord.getData());
    } else {
      this.markAsUnused(_pageCursor);
    }
  }
}
