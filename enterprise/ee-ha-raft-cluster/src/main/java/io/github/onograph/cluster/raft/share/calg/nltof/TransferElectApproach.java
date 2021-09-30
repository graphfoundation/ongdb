package io.github.onograph.cluster.raft.share.calg.nltof;

import java.util.List;


public interface TransferElectApproach {


  TransferElectApproach NOO_TRANSFER_ELECT_APPROACH = (validTopologies) ->
  {
    return LeaderElect.NOAE_LEADER_ELECT;
  };


  LeaderElect seeLeaderElect(List<NodeOptions> _listVarNodeOptions);
}
