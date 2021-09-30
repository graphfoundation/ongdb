package io.github.onograph.cluster.raft.share.meta.cm;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


final class ClusterSyncActions implements MetaUpgradeFlowAction {


  private final List<MetaUpgradeFlowAction> listSesMetaUpgradeFlowAction;

  ClusterSyncActions(MetaUpgradeFlowAction isStrt,
      MetaUpgradeFlowAction _ohrMetaUpgradeFlowAction) {
    this.listSesMetaUpgradeFlowAction =
        Stream.concat(_exrtseStream(isStrt), _exrtseStream(_ohrMetaUpgradeFlowAction))
            .collect(Collectors.toUnmodifiableList());
  }


  private static Stream<MetaUpgradeFlowAction> _exrtseStream(
      MetaUpgradeFlowAction _stMetaUpgradeFlowAction) {
    return _stMetaUpgradeFlowAction instanceof ClusterSyncActions
        ? ((ClusterSyncActions) _stMetaUpgradeFlowAction).getListSesMetaUpgradeFlowAction()
        .stream()
        : Stream.of(_stMetaUpgradeFlowAction);
  }


  private List<MetaUpgradeFlowAction> getListSesMetaUpgradeFlowAction() {
    return this.listSesMetaUpgradeFlowAction;
  }

  @Override
  public void pefmseForUp(UpgradeMetaEnv _cUpgradeMetaEnv) {

    Iterator _iterator = this.listSesMetaUpgradeFlowAction.iterator();

    while (_iterator.hasNext()) {

      MetaUpgradeFlowAction _sMetaUpgradeFlowAction = (MetaUpgradeFlowAction) _iterator.next();
      _sMetaUpgradeFlowAction.pefmseForUp(_cUpgradeMetaEnv);
    }
  }
}
