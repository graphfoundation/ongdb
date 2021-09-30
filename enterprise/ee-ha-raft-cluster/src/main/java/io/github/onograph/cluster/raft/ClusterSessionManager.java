package io.github.onograph.cluster.raft;

import io.github.onograph.cluster.raft.share.sync.ClusterSessionBean;
import io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta;
import io.github.onograph.cluster.raft.share.sync.SessionSeqActionId;
import java.io.IOException;
import org.neo4j.io.state.StateStorage;


public class ClusterSessionManager {


  private final StateStorage<ReplicationSessionManagerMeta> stateStorageStsReplicationSessionManagerMeta;


  private ReplicationSessionManagerMeta ssReplicationSessionManagerMeta;

  public ClusterSessionManager(
      StateStorage<ReplicationSessionManagerMeta> _stateStorageStsReplicationSessionManagerMeta) {
    this.stateStorageStsReplicationSessionManagerMeta = _stateStorageStsReplicationSessionManagerMeta;
  }


  public void fls() throws IOException {
    this.stateStorageStsReplicationSessionManagerMeta.writeState(
        this.ssReplicationSessionManagerMeta);
  }


  public long gelsalin() {
    return this.ssReplicationSessionManagerMeta.getLgIdx();
  }


  public void inlspForRe(ReplicationSessionManagerMeta _ssReplicationSessionManagerMeta) {
    this.ssReplicationSessionManagerMeta = _ssReplicationSessionManagerMeta;
  }


  public boolean isVaaoeoForClSe(SessionSeqActionId _iolSessionSeqActionId,
      ClusterSessionBean _sgClusterSessionBean) {
    return this.ssReplicationSessionManagerMeta.isVaaoeoForClSe(_iolSessionSeqActionId,
        _sgClusterSessionBean);
  }


  public ReplicationSessionManagerMeta neitcReplicationSessionManagerMeta() {
    return this.ssReplicationSessionManagerMeta.neitcReplicationSessionManagerMeta();
  }


  public ReplicationSessionManagerMeta snpoReplicationSessionManagerMeta() {
    return this.ssReplicationSessionManagerMeta.neitcReplicationSessionManagerMeta();
  }


  public void str() {
    if (this.ssReplicationSessionManagerMeta == null) {
      this.ssReplicationSessionManagerMeta = this.stateStorageStsReplicationSessionManagerMeta.getInitialState();
    }
  }


  public void upaForClSe(SessionSeqActionId _iolSessionSeqActionId, long lgIdx,
      ClusterSessionBean _sgClusterSessionBean) {
    this.ssReplicationSessionManagerMeta.upaForClSe(_iolSessionSeqActionId, lgIdx,
        _sgClusterSessionBean);
  }
}
