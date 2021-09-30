package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.util.Objects;


public class PartRecordDataHeader {


  public static final int EXST_VX = 3;


  static final int EXST_RCD_OFS;

  static {
    EXST_RCD_OFS = PartRecordDataHeaderSafeChannelMarshal.VersionType.SCM_3.reoos();
  }


  private final long befIdx;


  private final long befTLng;


  private final int iOr;


  private final int iVf;


  private final long lgNs;


  private final long lstFIdx;


  PartRecordDataHeader(long befIdx, long befTLng, int _iOr, int _iVf, long _lgNs, long lstFIdx) {
    this.befIdx = befIdx;
    this.befTLng = befTLng;
    this.iOr = _iOr;
    this.iVf = _iVf;
    this.lgNs = _lgNs;
    this.lstFIdx = lstFIdx;
  }


  static PartRecordDataHeader cresehaPartRecordDataHeader(long befIdx, long befTLng, long _lgNs,
      long lstFIdx) {
    return new PartRecordDataHeader(befIdx, befTLng, EXST_RCD_OFS, 3, _lgNs, lstFIdx);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      PartRecordDataHeader _thaPartRecordDataHeader = (PartRecordDataHeader) obj;
      return this.iVf == _thaPartRecordDataHeader.iVf && this.iOr == _thaPartRecordDataHeader.iOr
          && this.lstFIdx == _thaPartRecordDataHeader.lstFIdx &&
          this.lgNs == _thaPartRecordDataHeader.lgNs
          && this.befIdx == _thaPartRecordDataHeader.befIdx &&
          this.befTLng == _thaPartRecordDataHeader.befTLng;
    } else {
      return false;
    }
  }


  public long getBefIdx() {
    return this.befIdx;
  }


  public long getBefTLng() {
    return this.befTLng;
  }


  long getIOr() {
    return this.iOr;
  }


  int getIVf() {
    return this.iVf;
  }


  long getLgNs() {
    return this.lgNs;
  }


  long getLstFIdx() {
    return this.lstFIdx;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.iVf, this.iOr, this.lstFIdx, this.lgNs, this.befIdx, this.befTLng);
  }


}
