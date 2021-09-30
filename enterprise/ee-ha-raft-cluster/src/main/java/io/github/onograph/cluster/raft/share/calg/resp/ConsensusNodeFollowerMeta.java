package io.github.onograph.cluster.raft.share.calg.resp;


public class ConsensusNodeFollowerMeta {


  private final long lgIm;

  public ConsensusNodeFollowerMeta() {
    this(-1L);
  }

  private ConsensusNodeFollowerMeta(long _lgIm) {
    assert _lgIm >= -1L : String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta.format"),
        _lgIm);

    this.lgIm = _lgIm;
  }


  public long getLgIm() {
    return this.lgIm;
  }


  public ConsensusNodeFollowerMeta onscresConsensusNodeFollowerMeta(long _lgNmi) {
    return new ConsensusNodeFollowerMeta(_lgNmi);
  }


}
