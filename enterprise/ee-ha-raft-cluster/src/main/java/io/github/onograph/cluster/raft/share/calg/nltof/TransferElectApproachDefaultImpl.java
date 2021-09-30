package io.github.onograph.cluster.raft.share.calg.nltof;

import java.util.List;


class TransferElectApproachDefaultImpl implements TransferElectApproach {

  @Override
  public LeaderElect seeLeaderElect(List<NodeOptions> _listTvNodeOptions) {
    return ApproachManager.seerdOptional(_listTvNodeOptions).flatMap((t) ->
    {
      return ApproachManager.seerdOptional(t.getSetSresServerId()).map((m) ->
      {
        return new LeaderElect(
            t.getNamedDatabaseId(),
            m);
      });
    }).orElse(LeaderElect.NOAE_LEADER_ELECT);
  }
}
