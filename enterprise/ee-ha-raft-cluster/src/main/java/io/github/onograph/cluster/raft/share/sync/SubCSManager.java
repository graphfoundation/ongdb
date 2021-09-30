package io.github.onograph.cluster.raft.share.sync;

import java.util.ArrayDeque;
import java.util.Deque;


public class SubCSManager {


  private final Deque<SubClusterSessionBean> dequeSsSubClusterSessionBean = new ArrayDeque();


  private final ClusterSessionBean sgClusterSessionBean;


  private long lgNlsi;

  public SubCSManager(ClusterSessionBean _sgClusterSessionBean) {
    this.sgClusterSessionBean = _sgClusterSessionBean;
  }


  private SubClusterSessionBean _crassnSubClusterSessionBean() {
    return new SubClusterSessionBean(this.lgNlsi++);
  }


  public synchronized ClusterSessionEnvWrapper acuessoClusterSessionEnvWrapper() {

    SubClusterSessionBean _slSubClusterSessionBean =
        this.dequeSsSubClusterSessionBean.isEmpty() ? this._crassnSubClusterSessionBean()
            : this.dequeSsSubClusterSessionBean.pop();
    return new ClusterSessionEnvWrapper(_slSubClusterSessionBean.neopiiSessionSeqActionId(),
        _slSubClusterSessionBean, this.sgClusterSessionBean);
  }


  public ClusterSessionBean getSgClusterSessionBean() {
    return this.sgClusterSessionBean;
  }


  public synchronized long opsenct() {
    return this.lgNlsi - (long) this.dequeSsSubClusterSessionBean.size();
  }


  public synchronized void reeessoForCl(ClusterSessionEnvWrapper _coClusterSessionEnvWrapper) {
    this.dequeSsSubClusterSessionBean.push(
        _coClusterSessionEnvWrapper.getSlSubClusterSessionBean());
  }
}
