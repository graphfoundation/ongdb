package io.github.onograph.kernel.srv.store.format.highlimit;

import org.neo4j.io.pagecache.PageCursor;


public enum HighLimitEncEnum {


  HLENC_BTX_3((byte) 0, 1, 3),

  HLENC_BTX_4((byte) 2, 2, 4),

  HLENC_BTX_5((byte) 6, 3, 5),

  HLENC_BTX_6((byte) 14, 4, 6),

  HLENC_BTX_7((byte) 30, 5, 7),

  HLENC_BTX_8((byte) 31, 5, 8);


  static final int LARGEST_BTX = 58;


  private static final HighLimitEncEnum[] HLENC_VALUES = values();


  private final int byteCount;


  private final int mskHdrDiff;


  private final short mtkHigh;


  private final long oobBitMask;


  HighLimitEncEnum(byte hdrByte, int _iBh, int _iBon) {
    this.byteCount = _iBon;
    this.mskHdrDiff = 8 - _iBh;
    this.mtkHigh = (short) ((byte) (hdrByte << this.mskHdrDiff) & 255);
    this.oobBitMask = ~_vauma(_iBon, this.mskHdrDiff - 1);
  }


  private static int _mabs() {

    int _iM = 0;

    HighLimitEncEnum[] _highLimitEncEnumArray = HLENC_VALUES;

    int _iV = _highLimitEncEnumArray.length;

    for (

        int _iV2 = 0; _iV2 < _iV; ++_iV2) {

      HighLimitEncEnum _ecdnHighLimitEncEnum = _highLimitEncEnumArray[_iV2];
      _iM = Math.max(_iM, _ecdnHighLimitEncEnum._mabtspd());
    }

    return _iM;
  }


  private static UnsupportedOperationException _unpdoadttbgrrUnsupportedOperationException(
      long refLng) {
    return new UnsupportedOperationException("*** Error: f45307c6-15cc-498d-9e7e-a69193600517");
  }


  private static long _vauma(int _iBon, int _iSh) {

    long _lgMa = (1L << _iSh) - 1L;

    for (

        int cur = 0; cur < _iBon - 1; ++cur) {
      _lgMa <<= 8;
      _lgMa |= 255L;
    }

    return _lgMa;
  }


  public static long deoForPa(PageCursor _pageCursor) {

    int hdrByte = _pageCursor.getByte() & 255;

    int _iMs = Integer.numberOfLeadingZeros(~(hdrByte & 248) & 255) - 24;

    int _iSs = 8 - _iMs - (_iMs == 5 ? 1 : 2);

    long _lgCs = ~(hdrByte >>> _iSs & 1) + 1;

    long _lgRgse = (hdrByte & (1 << _iSs) - 1) << 16;

    for (_lgRgse += ((_pageCursor.getByte() & 255) << 8) + (_pageCursor.getByte() & 255); _iMs > 0;
        --_iMs) {
      _lgRgse <<= 8;
      _lgRgse += _pageCursor.getByte() & 255;
    }

    return _lgCs ^ _lgRgse;
  }


  public static void enoForPa(long refLng, PageCursor _trePageCursor) {

    boolean _isPstv = refLng >= 0L;

    long _lgRa = _isPstv ? refLng : ~refLng;

    HighLimitEncEnum[] _highLimitEncEnumArray = HLENC_VALUES;

    int _iVa = _highLimitEncEnumArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      HighLimitEncEnum _ecdnHighLimitEncEnum = _highLimitEncEnumArray[_iVa2];
      if (_ecdnHighLimitEncEnum._isCaeo(_lgRa)) {
        _ecdnHighLimitEncEnum.enoForPa(_isPstv, _lgRa, _trePageCursor);
        return;
      }
    }

    throw _unpdoadttbgrrUnsupportedOperationException(refLng);
  }


  public static int leg(long refLng) {

    boolean _isPstv = refLng >= 0L;

    long _lgRa = _isPstv ? refLng : ~refLng;

    HighLimitEncEnum[] _highLimitEncEnumArray = HLENC_VALUES;

    int _iVa = _highLimitEncEnumArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      HighLimitEncEnum _ecdnHighLimitEncEnum = _highLimitEncEnumArray[_iVa2];
      if (_ecdnHighLimitEncEnum._isCaeo(_lgRa)) {
        return _ecdnHighLimitEncEnum.byteCount;
      }
    }

    throw _unpdoadttbgrrUnsupportedOperationException(refLng);
  }


  public static long toable(long _lgRb, long _lgRr) {
    return Math.addExact(_lgRr, _lgRb);
  }


  public static long torete(long _lgRb, long refLng) {
    return Math.subtractExact(refLng, _lgRb);
  }


  private boolean _isCaeo(long _lgRa) {
    return (_lgRa & this.oobBitMask) == 0L;
  }


  private int _mabtspd() {
    return 64 - Long.numberOfLeadingZeros(~this.oobBitMask);
  }


  private void enoForPa(boolean _isPstv, long _lgAr, PageCursor _sucPageCursor) {

    int _iSit = this.byteCount - 1 << 3;

    byte _bsByte = (byte) ((_isPstv ? 0 : 1) << this.mskHdrDiff - 1);
    _sucPageCursor.putByte((byte) (this.mtkHigh | _bsByte | (byte) ((int) (_lgAr >>> _iSit))));

    do {
      _iSit -= 8;
      _sucPageCursor.putByte((byte) ((int) (_lgAr >>> _iSit)));
    }
    while (_iSit > 0);
  }
}
