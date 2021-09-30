package io.github.onograph.kernel.srv.store.format.highlimit.v320;

import io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum;
import java.util.Iterator;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.impl.store.format.BaseOneByteHeaderRecordFormat;
import org.neo4j.kernel.impl.store.format.BaseRecordFormat;
import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;


class PropertyRecordFormat extends BaseOneByteHeaderRecordFormat<PropertyRecord> {


  static final int FFR_TOT = 16;


  static final int RC_TOT = 48;


  private static final long HI_DW_LO_WD_CK_MSX = -281474976710656L;


  private static final long HI_DW_LO_WD_MSX = 281470681743360L;


  private static final int PX_BX_PDX = 3;

  protected PropertyRecordFormat() {
    super(fixedRecordSize(48), 0, 1, 50, false);
  }


  private static boolean _isCauefdrrsForPr(PropertyRecord _propertyRecord, int rLeng) {
    return _isRobgegffre(rLeng) &&
        (_propertyRecord.getNextProp() == AbstractHighLimitRecordFormat.NUL
            || (_propertyRecord.getNextProp() & -281474976710656L) == 0L) &&
        (_propertyRecord.getPrevProp() == AbstractHighLimitRecordFormat.NUL
            || (_propertyRecord.getPrevProp() & -281474976710656L) == 0L);
  }


  private static boolean _isRobgegffre(int rLeng) {
    return 16 <= rLeng;
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


  private static void _refirenreForPrPa(boolean isBeingUsed, PageCursor _pageCursor,
      PropertyRecord _propertyRecord) {

    long _lgMp = (long) _pageCursor.getShort() & 65535L;

    long _lgPp = (long) _pageCursor.getInt() & 4294967295L;

    long mxtMatIdx = (long) _pageCursor.getShort() & 65535L;

    long nxt = (long) _pageCursor.getInt() & 4294967295L;
    _propertyRecord.initialize(isBeingUsed, BaseRecordFormat.longFromIntAndMod(_lgPp, _lgMp << 32),
        BaseRecordFormat.longFromIntAndMod(nxt, mxtMatIdx << 32));
    _pageCursor.setOffset(_pageCursor.getOffset() + 3);
  }


  private static void _wrfrerdForPrPa(PageCursor _pageCursor, PropertyRecord _propertyRecord) {

    short _mpShort =
        _propertyRecord.getPrevProp() == AbstractHighLimitRecordFormat.NUL ? 0
            : (short) ((int) ((_propertyRecord.getPrevProp() & 281470681743360L) >> 32));

    short _mnShort =
        _propertyRecord.getNextProp() == AbstractHighLimitRecordFormat.NUL ? 0
            : (short) ((int) ((_propertyRecord.getNextProp() & 281470681743360L) >> 32));
    _pageCursor.putShort(_mpShort);
    _pageCursor.putInt((int) _propertyRecord.getPrevProp());
    _pageCursor.putShort(_mnShort);
    _pageCursor.putInt((int) _propertyRecord.getNextProp());
    _pageCursor.setOffset(_pageCursor.getOffset() + 3);
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

    boolean _isRfu = has(hdrLng, 4);
    if (mdstr.shouldLoad(isBeingUsed)) {

      int _iCb = hdrLng >>> 4;

      long rId = _propertyRecord.getId();
      if (_isRfu) {
        _refirenreForPrPa(isBeingUsed, _pageCursor, _propertyRecord);
      } else {
        _propertyRecord.initialize(isBeingUsed,
            HighLimitEncEnum.toable(rId, HighLimitEncEnum.deoForPa(_pageCursor)),
            HighLimitEncEnum.toable(rId, HighLimitEncEnum.deoForPa(_pageCursor)));
      }

      _propertyRecord.setUseFixedReferences(_isRfu);
      if (_iCb > _propertyRecord.getBlockCapacity()
          | 48 - (_pageCursor.getOffset() - ofst) < _iCb * 8) {
        _pageCursor.setCursorException(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.store.format.highlimit.v320.PropertyRecordFormat.setCursorException"));
        return;
      }

      while (_iCb-- > 0) {
        _propertyRecord.addLoadedBlock(_pageCursor.getLong());
      }
    }
  }

  @Override
  public void write(PropertyRecord _propertyRecord, PageCursor _pageCursor, int rLeng, int rpSize) {
    if (_propertyRecord.inUse()) {

      byte hdrLng = (byte) (1 | _nuboblkForPr(_propertyRecord) << 4);

      boolean _isRfuc = _isCauefdrrsForPr(_propertyRecord, rLeng);
      _propertyRecord.setUseFixedReferences(_isRfuc);
      hdrLng = set(hdrLng, 4, _isRfuc);
      _pageCursor.putByte(hdrLng);

      long rId = _propertyRecord.getId();
      if (_isRfuc) {
        _wrfrerdForPrPa(_pageCursor, _propertyRecord);
      } else {
        HighLimitEncEnum.enoForPa(HighLimitEncEnum.torete(rId, _propertyRecord.getPrevProp()),
            _pageCursor);
        HighLimitEncEnum.enoForPa(HighLimitEncEnum.torete(rId, _propertyRecord.getNextProp()),
            _pageCursor);
      }

      Iterator _iterator = _propertyRecord.iterator();

      while (_iterator.hasNext()) {

        PropertyBlock _propertyBlock = (PropertyBlock) _iterator.next();

        long[] _lgVr1Array = _propertyBlock.getValueBlocks();

        int _iVr2 = _lgVr1Array.length;

        for (

            int _iVr3 = 0; _iVr3 < _iVr2; ++_iVr3) {

          long _lgBp = _lgVr1Array[_iVr3];
          _pageCursor.putLong(_lgBp);
        }
      }
    } else {
      this.markAsUnused(_pageCursor);
    }
  }
}
