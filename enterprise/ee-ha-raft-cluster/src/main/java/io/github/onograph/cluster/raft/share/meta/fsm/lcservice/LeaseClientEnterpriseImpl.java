package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;

import org.neo4j.kernel.api.exceptions.Status.Cluster;
import org.neo4j.kernel.impl.api.LeaseClient;
import org.neo4j.kernel.impl.api.LeaseException;


public class LeaseClientEnterpriseImpl implements LeaseClient {


  private final LeaseServiceEnterpriseImpl codntLeaseServiceEnterpriseImpl;


  private int lsId = -1;

  LeaseClientEnterpriseImpl(LeaseServiceEnterpriseImpl _codntLeaseServiceEnterpriseImpl) {
    this.codntLeaseServiceEnterpriseImpl = _codntLeaseServiceEnterpriseImpl;
  }

  @Override
  public void ensureValid() throws LeaseException {
    if (this.lsId == -1) {
      this.lsId = this.codntLeaseServiceEnterpriseImpl.acrlsoth();
    } else if (this.codntLeaseServiceEnterpriseImpl.isInl(this.lsId)) {

      throw new LeaseException("*** Error:  8ce894a8-b517-4037-a681-05f7a58a2bee",
          Cluster.NotALeader);
    }
  }

  @Override
  public int leaseId() {
    return this.lsId;
  }
}
