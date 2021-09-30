package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import org.neo4j.function.Suppliers.Lazy;


public class SyncToManager {


  private final Lazy<ConsensusNodeId> lazyMslConsensusNodeId;


  private final OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage>
      outDirectionOtoncc;

  public SyncToManager(Lazy<ConsensusNodeId> _lazyMslConsensusNodeId,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOtoncc) {
    this.lazyMslConsensusNodeId = _lazyMslConsensusNodeId;
    this.outDirectionOtoncc = _outDirectionOtoncc;
  }


  public void relaForSy(SyncableData btval) {
    this.outDirectionOtoncc.senForMEME(new ConsensusMessageServiceMeta.MsgCreatorService.Ask(btval,
            this.lazyMslConsensusNodeId.get()),
        this.lazyMslConsensusNodeId.get());
  }
}
