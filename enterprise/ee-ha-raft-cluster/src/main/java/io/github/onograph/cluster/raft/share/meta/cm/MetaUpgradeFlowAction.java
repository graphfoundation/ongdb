package io.github.onograph.cluster.raft.share.meta.cm;

import java.util.function.Consumer;


@FunctionalInterface
public interface MetaUpgradeFlowAction extends Consumer<UpgradeMetaEnv> {


  MetaUpgradeFlowAction DEFAULT = (ctx) ->
  {
  };

  @Override
  default void accept(UpgradeMetaEnv _cUpgradeMetaEnv) {
    this.pefmseForUp(_cUpgradeMetaEnv);
  }


  default MetaUpgradeFlowAction andMetaUpgradeFlowAction(
      MetaUpgradeFlowAction _nsMetaUpgradeFlowAction) {
    return new ClusterSyncActions(this, _nsMetaUpgradeFlowAction);
  }


  void pefmseForUp(UpgradeMetaEnv _upgradeMetaEnv);
}
