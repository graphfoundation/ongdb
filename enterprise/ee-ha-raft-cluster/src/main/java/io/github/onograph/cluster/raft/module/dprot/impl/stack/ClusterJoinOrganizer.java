package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.Address;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class ClusterJoinOrganizer {


  private final MemberNodeService rsleMemberNodeService;


  private final Set<Address> setAsaAddress = new HashSet();

  public ClusterJoinOrganizer(MemberNodeService _rsleMemberNodeService) {
    this.rsleMemberNodeService = _rsleMemberNodeService;
  }


  void adsearsForCo(Collection<Address> _collectionAdessAddress) {
    if (this.rsleMemberNodeService.isUsord()) {
      this.setAsaAddress.addAll(_collectionAdessAddress);
    }
  }


  JoinCluster meseJoinCluster() {

    JoinCluster m = JoinCluster.intlJoinCluster(this.setAsaAddress);
    this.setAsaAddress.clear();
    return m;
  }
}
