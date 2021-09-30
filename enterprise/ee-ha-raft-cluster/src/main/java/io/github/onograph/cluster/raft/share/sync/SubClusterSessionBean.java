package io.github.onograph.cluster.raft.share.sync;


public class SubClusterSessionBean {


  private final long lgIsl;


  private long lgNsc;

  public SubClusterSessionBean(long _lgIsl) {
    this.lgIsl = _lgIsl;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      SubClusterSessionBean _thaSubClusterSessionBean = (SubClusterSessionBean) obj;
      return this.lgIsl == _thaSubClusterSessionBean.lgIsl;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return (int) (this.lgIsl ^ this.lgIsl >>> 32);
  }


  protected SessionSeqActionId neopiiSessionSeqActionId() {
    return new SessionSeqActionId(this.lgIsl, this.lgNsc++);
  }


}
