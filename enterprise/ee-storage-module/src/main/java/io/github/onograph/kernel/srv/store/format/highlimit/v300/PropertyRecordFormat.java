package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum;
import java.util.Iterator;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.format.BaseOneByteHeaderRecordFormat;
import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;


public class PropertyRecordFormat extends BaseOneByteHeaderRecordFormat<PropertyRecord> {


  public static final int RC_TOT = 48;

  public PropertyRecordFormat() {
    super(fixedRecordSize(48), 0, 1, 50, false);
  }


  private static int _nuboblkForPr(PropertyRecord _propertyRecord) {

    int cnt = 0;

    PropertyBlock _propertyBlock;
    for (

        Iterator _iterator = _propertyRecord.iterator(); _iterator.hasNext();
        cnt += _propertyBlock.getValueBlocks().length) {
      _propertyBlock = (PropertyBlock) _iterator.next();
    }

    return cnt;
  }

  @Override
  public long getNextRecordReference(PropertyRecord _propertyRecord) {
    return _propertyRecord.getNextProp();
  }

  @Override
  public PropertyRecord newRecord() {
    return new PropertyRecord(-1L);
  }

  @Override
  public void read(PropertyRecord _propertyRecord, PageCursor _pageCursor, RecordLoad mdstr,
      int rLeng, int rpSize) {

    int ofst = _pageCursor.getOffset();

    byte hdrLng = _pageCursor.getByte();

    boolean isBeingUsed = this.isInUse(hdrLng);
    if (mdstr.shouldLoad(isBeingUsed)) {

      int _iBc = hdrLng >>> 4;

      long rId = _propertyRecord.getId();
      _propertyRecord.initialize(isBeingUsed,
          HighLimitEncEnum.toable(rId, HighLimitEncEnum.deoForPa(_pageCursor)),
          HighLimitEncEnum.toable(rId, HighLimitEncEnum.deoForPa(_pageCursor)));
      if (_iBc > _propertyRecord.getBlockCapacity()
          | 48 - (_pageCursor.getOffset() - ofst) < _iBc * 8) {
        _pageCursor.setCursorException(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat.setCursorException"));
        return;
      }

      while (_iBc-- > 0) {
        _propertyRecord.addLoadedBlock(_pageCursor.getLong());
      }
    }
  }

  @Override
  public void write(PropertyRecord _propertyRecord, PageCursor _pageCursor, int rLeng, int rpSize) {
    if (_propertyRecord.inUse()) {
      _pageCursor.putByte((byte) (1 | _nuboblkForPr(_propertyRecord) << 4));

      long rId = _propertyRecord.getId();
      HighLimitEncEnum.enoForPa(HighLimitEncEnum.torete(rId, _propertyRecord.getPrevProp()),
          _pageCursor);
      HighLimitEncEnum.enoForPa(HighLimitEncEnum.torete(rId, _propertyRecord.getNextProp()),
          _pageCursor);

      Iterator _iterator = _propertyRecord.iterator();

      while (_iterator.hasNext()) {

        PropertyBlock _propertyBlock = (PropertyBlock) _iterator.next();

        long[] _lgVarArray = _propertyBlock.getValueBlocks();

        int _iVr0 = _lgVarArray.length;

        for (

            int _iVr1 = 0; _iVr1 < _iVr0; ++_iVr1) {

          long _lgPb = _lgVarArray[_iVr1];
          _pageCursor.putLong(_lgPb);
        }
      }
    } else {
      this.markAsUnused(_pageCursor);
    }
  }
}
