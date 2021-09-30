package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.CoreNodeSyncableData;
import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class SyncableLeasableCoreNodeData implements CoreNodeSyncableData, Leaseable {


  static final SyncableLeasableCoreNodeData INAD_LES_REQ = new SyncableLeasableCoreNodeData(null,
      -1, null);


  private final DatabaseId databaseId;


  private final int lsId;


  private final ConsensusNodeId onrConsensusNodeId;


  public SyncableLeasableCoreNodeData(NamedDatabaseId _namedDatabaseId,
      LeasableMeta _saeLeasableMeta) {
    this(_namedDatabaseId.databaseId(), _saeLeasableMeta.getLsId(),
        _saeLeasableMeta.getOnrConsensusNodeId());
  }


  public SyncableLeasableCoreNodeData(DatabaseId _databaseId, int lsId,
      ConsensusNodeId _onrConsensusNodeId) {
    this.databaseId = _databaseId;
    this.lsId = lsId;
    this.onrConsensusNodeId = _onrConsensusNodeId;
  }

  @Override
  public DatabaseId daasidDatabaseId() {
    return this.databaseId;
  }

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
  }

  @Override
  public void dipcForSy(AutoCloseableActionProcessor _dcAutoCloseableActionProcessor,
      Consumer<FSMData> _consumerClbcFSMData, long caIdx) {
    _dcAutoCloseableActionProcessor.dipcForSyCo(_consumerClbcFSMData, caIdx, this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      SyncableLeasableCoreNodeData _thaSyncableLeasableCoreNodeData = (SyncableLeasableCoreNodeData) obj;
      return this.lsId == _thaSyncableLeasableCoreNodeData.lsId &&
          Objects.equals(this.onrConsensusNodeId,
              _thaSyncableLeasableCoreNodeData.onrConsensusNodeId);
    } else {
      return false;
    }
  }

  @Override
  public int getLeaseId() {
    return this.lsId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.onrConsensusNodeId, this.lsId);
  }

  @Override
  public ConsensusNodeId oweObject() {
    return this.onrConsensusNodeId;
  }


}
