package io.github.onograph.cluster.raft.share.meta.cm;

import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


class DataVersioningFlowManager {


  private final SortedMap<ClusterMetaFormat, MetaUpgradeFlowAction> sortedMapSmcm;

  DataVersioningFlowManager(SortedMap<ClusterMetaFormat, MetaUpgradeFlowAction> _sortedMapSmcm) {
    this.sortedMapSmcm = new TreeMap(_sortedMapSmcm);
  }


  boolean isCauretForClCl(ClusterMetaFormat sourceVInt, ClusterMetaFormat _vtClusterMetaFormat) {
    return sourceVInt.isMabmttForCl(_vtClusterMetaFormat) && this.sortedMapSmcm.containsKey(
        sourceVInt) &&
        this.sortedMapSmcm.containsKey(_vtClusterMetaFormat);
  }


  List<MetaUpgradeFlowAction> stfmgoList(ClusterMetaFormat sourceVInt,
      ClusterMetaFormat _tvClusterMetaFormat) {
    if (!this.isCauretForClCl(sourceVInt, _tvClusterMetaFormat)) {
      return List.of();
    } else {

      SortedMap<ClusterMetaFormat, MetaUpgradeFlowAction> _sortedMapNmscm =
          this.sortedMapSmcm.subMap(sourceVInt.plsoemnClusterMetaFormat(),
              _tvClusterMetaFormat.plsoemnClusterMetaFormat());
      return List.copyOf(_sortedMapNmscm.values());
    }
  }
}
