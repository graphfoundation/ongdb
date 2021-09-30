package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.Objects;


public class SliceMeta {


  private final int iAr;


  private final String strNf;

  public SliceMeta(String _strNf) {
    this(1, _strNf);
  }


  public SliceMeta(int _iAr, String _strNf) {
    this.iAr = _iAr;
    this.strNf = _strNf;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      SliceMeta _thaSliceMeta = (SliceMeta) obj;
      return this.iAr == _thaSliceMeta.iAr && Objects.equals(this.strNf, _thaSliceMeta.strNf);
    } else {
      return false;
    }
  }


  public int getIAr() {
    return this.iAr;
  }


  public String getStrNf() {
    return this.strNf;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.strNf, this.iAr);
  }


}
