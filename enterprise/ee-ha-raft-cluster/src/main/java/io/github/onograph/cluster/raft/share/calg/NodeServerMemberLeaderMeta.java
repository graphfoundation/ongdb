package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Objects;


public class NodeServerMemberLeaderMeta {


  public static final NodeServerMemberLeaderMeta INTL_NODE_SERVER_MEMBER_LEADER_META = new NodeServerMemberLeaderMeta(
      null, -1L);


  private final ConsensusNodeId imConsensusNodeId;


  private final boolean isDsi;


  private final long lgT;

  public NodeServerMemberLeaderMeta(ConsensusNodeId _imConsensusNodeId, long _lgTer) {
    this(_imConsensusNodeId, false, _lgTer);
  }


  private NodeServerMemberLeaderMeta(ConsensusNodeId _imConsensusNodeId, boolean _isDsi,
      long _lgT) {
    this.imConsensusNodeId = _imConsensusNodeId;
    this.isDsi = _isDsi;
    this.lgT = _lgT;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      NodeServerMemberLeaderMeta _thNodeServerMemberLeaderMeta = (NodeServerMemberLeaderMeta) obj;
      return this.lgT == _thNodeServerMemberLeaderMeta.lgT
          && this.isDsi == _thNodeServerMemberLeaderMeta.isDsi &&
          Objects.equals(this.imConsensusNodeId, _thNodeServerMemberLeaderMeta.imConsensusNodeId);
    } else {
      return false;
    }
  }


  public ConsensusNodeId getImConsensusNodeId() {
    return this.imConsensusNodeId;
  }


  public boolean getIsDsi() {
    return this.isDsi;
  }


  public long getLgT() {
    return this.lgT;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.imConsensusNodeId, this.lgT, this.isDsi);
  }


  public NodeServerMemberLeaderMeta stpdwNodeServerMemberLeaderMeta() {
    return new NodeServerMemberLeaderMeta(null, true, this.lgT);
  }


}
