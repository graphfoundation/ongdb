package io.github.onograph.cluster.raft.share.sync;


public class SessionSeqActionId {


  private final long lgIsl;


  private final long lgNs;

  public SessionSeqActionId(long _lgIsl, long _lgNs) {
    this.lgIsl = _lgIsl;
    this.lgNs = _lgNs;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      SessionSeqActionId _thaSessionSeqActionId = (SessionSeqActionId) obj;
      if (this.lgIsl != _thaSessionSeqActionId.lgIsl) {
        return false;
      } else {
        return this.lgNs == _thaSessionSeqActionId.lgNs;
      }
    } else {
      return false;
    }
  }


  public long getLgIsl() {
    return this.lgIsl;
  }


  public long getLgNs() {
    return this.lgNs;
  }

  @Override
  public int hashCode() {

    int _iRsl = (int) (this.lgIsl ^ this.lgIsl >>> 32);
    _iRsl = 31 * _iRsl + (int) (this.lgNs ^ this.lgNs >>> 32);
    return _iRsl;
  }


}
