package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.UUID;
import org.neo4j.function.Suppliers;
import org.neo4j.function.Suppliers.Lazy;


public class ClusterSessionBean {


  private final UUID isUUID;


  private final Lazy<ConsensusNodeId> lazyOnrConsensusNodeId;

  public ClusterSessionBean(UUID _isUUID, ConsensusNodeId _onrConsensusNodeId) {
    this(_isUUID, Suppliers.lazySingleton(() ->
    {
      return _onrConsensusNodeId;
    }));
  }

  public ClusterSessionBean(UUID _isUUID, Lazy<ConsensusNodeId> _lazyOnrConsensusNodeId) {
    this.isUUID = _isUUID;
    this.lazyOnrConsensusNodeId = _lazyOnrConsensusNodeId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ClusterSessionBean _thClusterSessionBean = (ClusterSessionBean) obj;
      return this.isUUID.equals(_thClusterSessionBean.isUUID) &&
          this.lazyOnrConsensusNodeId.get()
              .equals(_thClusterSessionBean.lazyOnrConsensusNodeId.get());
    } else {
      return false;
    }
  }


  public UUID getIsUUID() {
    return this.isUUID;
  }

  @Override
  public int hashCode() {

    int _iRsl = this.isUUID.hashCode();
    _iRsl = 31 * _iRsl + this.lazyOnrConsensusNodeId.get().hashCode();
    return _iRsl;
  }


  public ConsensusNodeId oweConsensusNodeId() {
    return this.lazyOnrConsensusNodeId.get();
  }


}
