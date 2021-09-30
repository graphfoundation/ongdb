package io.github.onograph.cluster.raft.share.calg;


public class LeaderNodeElectionEnv {


  public final long comie;


  public final long ter;


  public LeaderNodeElectionEnv(long _lgIc, long _lgTer) {
    this.comie = _lgIc;
    this.ter = _lgTer;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      LeaderNodeElectionEnv _tLeaderNodeElectionEnv = (LeaderNodeElectionEnv) obj;
      if (this.ter != _tLeaderNodeElectionEnv.ter) {
        return false;
      } else {
        return this.comie == _tLeaderNodeElectionEnv.comie;
      }
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {

    int _iRsl = (int) (this.ter ^ this.ter >>> 32);
    _iRsl = 31 * _iRsl + (int) (this.comie ^ this.comie >>> 32);
    return _iRsl;
  }


}
