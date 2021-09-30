package io.github.onograph.cluster.raft.share.sync;


public class ClusterSessionEnvWrapper {


  private final SessionSeqActionId iolSessionSeqActionId;


  private final ClusterSessionBean sgClusterSessionBean;


  private final SubClusterSessionBean slSubClusterSessionBean;


  public ClusterSessionEnvWrapper(SessionSeqActionId _iolSessionSeqActionId,
      SubClusterSessionBean _lsSubClusterSessionBean, ClusterSessionBean _sgClusterSessionBean) {
    this.iolSessionSeqActionId = _iolSessionSeqActionId;
    this.sgClusterSessionBean = _sgClusterSessionBean;
    this.slSubClusterSessionBean = _lsSubClusterSessionBean;
  }


  public SessionSeqActionId getIolSessionSeqActionId() {
    return this.iolSessionSeqActionId;
  }


  public ClusterSessionBean getSgClusterSessionBean() {
    return this.sgClusterSessionBean;
  }


  protected SubClusterSessionBean getSlSubClusterSessionBean() {
    return this.slSubClusterSessionBean;
  }


}
