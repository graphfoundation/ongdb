package io.github.onograph.cluster.raft.share.calg.resp;

import java.util.HashMap;
import java.util.Map;


public class ConsensusNodeFollowersMeta<MEMBER> {


  private final Map<MEMBER, ConsensusNodeFollowerMeta> mapSaemc;

  public ConsensusNodeFollowersMeta(
      ConsensusNodeFollowersMeta<MEMBER> _consensusNodeFollowersMetaOiiaMEMBER, MEMBER _mmeMu,
      ConsensusNodeFollowerMeta _suConsensusNodeFollowerMeta) {
    this.mapSaemc = new HashMap(_consensusNodeFollowersMetaOiiaMEMBER.mapSaemc);
    this.mapSaemc.put(_mmeMu, _suConsensusNodeFollowerMeta);
  }

  public ConsensusNodeFollowersMeta() {
    this.mapSaemc = new HashMap();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      boolean _isVr00;
      label35:
      {

        ConsensusNodeFollowersMeta _thaConsensusNodeFollowersMeta = (ConsensusNodeFollowersMeta) obj;
        if (this.mapSaemc != null) {
          if (this.mapSaemc.equals(_thaConsensusNodeFollowersMeta.mapSaemc)) {
            break label35;
          }
        } else if (_thaConsensusNodeFollowersMeta.mapSaemc == null) {
          break label35;
        }

        _isVr00 = false;
        return _isVr00;
      }

      _isVr00 = true;
      return _isVr00;
    } else {
      return false;
    }
  }


  public ConsensusNodeFollowerMeta getConsensusNodeFollowerMeta(MEMBER _mmeMme) {

    ConsensusNodeFollowerMeta _rslConsensusNodeFollowerMeta = this.mapSaemc.get(_mmeMme);
    if (_rslConsensusNodeFollowerMeta == null) {
      _rslConsensusNodeFollowerMeta = new ConsensusNodeFollowerMeta();
    }

    return _rslConsensusNodeFollowerMeta;
  }

  @Override
  public int hashCode() {
    return this.mapSaemc != null ? this.mapSaemc.hashCode() : 0;
  }


  public int mapSaemcSize() {
    return this.mapSaemc.size();
  }


  public ConsensusNodeFollowersMeta<MEMBER> onscresConsensusNodeFollowersMeta(long _lgNmi,
      MEMBER _mmeMme) {
    return new ConsensusNodeFollowersMeta(this, _mmeMme,
        this.getConsensusNodeFollowerMeta(_mmeMme).onscresConsensusNodeFollowerMeta(_lgNmi));
  }

  @Override
  public String toString() {
    return String.format("FollowerStates%s", this.mapSaemc);
  }
}
