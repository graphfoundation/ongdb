package io.github.onograph.cluster.raft.share.meta.fsm;

import java.util.Comparator;
import java.util.Objects;


public class ClusterMetaFormat implements Comparable<ClusterMetaFormat> {


  public static final ClusterMetaFormat CURT_CLUSTER_META_FORMAT = new ClusterMetaFormat(1, 2);


  public static final ClusterMetaFormat INTL_CLUSTER_META_FORMAT = new ClusterMetaFormatDefault();


  private static final Comparator<ClusterMetaFormat> comparatorCoparClusterMetaFormat =
      Comparator.comparingInt(ClusterMetaFormat::getIMjr).thenComparing(ClusterMetaFormat::getIMnr);


  private final int iMjr;


  private final int iMnr;

  public ClusterMetaFormat(int _iMjr, int _iMnr) {
    this.iMjr = _iMjr;
    this.iMnr = _iMnr;
  }

  @Override
  public int compareTo(ClusterMetaFormat obj) {
    return comparatorCoparClusterMetaFormat.compare(this, obj);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ClusterMetaFormat _thaClusterMetaFormat = (ClusterMetaFormat) obj;
      return this.iMjr == _thaClusterMetaFormat.iMjr && this.iMnr == _thaClusterMetaFormat.iMnr;
    } else {
      return false;
    }
  }


  public int getIMjr() {
    return this.iMjr;
  }


  public int getIMnr() {
    return this.iMnr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(new Object[]{this.iMjr, this.iMnr});
  }


  public boolean isLortaForCl(ClusterMetaFormat _treClusterMetaFormat) {
    return this.compareTo(_treClusterMetaFormat) < 0;
  }


  public boolean isMabmttForCl(ClusterMetaFormat _treClusterMetaFormat) {
    return _treClusterMetaFormat != null && _treClusterMetaFormat.iMjr == this.iMjr
        && _treClusterMetaFormat.iMnr >= this.iMnr;
  }


  public ClusterMetaFormat plsoemnClusterMetaFormat() {
    return new ClusterMetaFormat(this.iMjr, this.iMnr + 1);
  }


  private static class ClusterMetaFormatDefault extends ClusterMetaFormat {

    private ClusterMetaFormatDefault() {
      super(1, -1);
    }


  }
}
