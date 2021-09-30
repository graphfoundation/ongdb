package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.Set;


public class ConsensusNodeServerMemberIdWrapper implements ConsensusNodes<ConsensusNodeId> {


  private final Set<ConsensusNodeId> mbrs;

  public ConsensusNodeServerMemberIdWrapper(Set<ConsensusNodeId> mbrs) {
    this.mbrs = mbrs;
  }

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      boolean _isVr00;
      label35:
      {

        ConsensusNodeServerMemberIdWrapper _thaConsensusNodeServerMemberIdWrapper = (ConsensusNodeServerMemberIdWrapper) obj;
        if (this.mbrs != null) {
          if (this.mbrs.equals(_thaConsensusNodeServerMemberIdWrapper.mbrs)) {
            break label35;
          }
        } else if (_thaConsensusNodeServerMemberIdWrapper.mbrs == null) {
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

  @Override
  public Set<ConsensusNodeId> gembsSet() {
    return this.mbrs;
  }

  @Override
  public int hashCode() {
    return this.mbrs != null ? this.mbrs.hashCode() : 0;
  }


}
