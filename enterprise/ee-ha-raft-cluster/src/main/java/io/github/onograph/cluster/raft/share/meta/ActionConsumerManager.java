package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.function.ThrowingBiConsumer;


class ActionConsumerManager {


  private final int iSbm;


  private final List<DataSyncClusterAction> listBthDataSyncClusterAction;


  private final ThrowingBiConsumer<Long, List<DataSyncClusterAction>, Exception> throwingBiConsumerApirlle;


  private long lgIl;

  ActionConsumerManager(int _iSbm,
      ThrowingBiConsumer<Long, List<DataSyncClusterAction>, Exception> _throwingBiConsumerApirlle) {
    this.listBthDataSyncClusterAction = new ArrayList(_iSbm);
    this.iSbm = _iSbm;
    this.throwingBiConsumerApirlle = _throwingBiConsumerApirlle;
  }


  void addForDa(long idx, DataSyncClusterAction _oeainDataSyncClusterAction)
      throws Exception {
    assert this.listBthDataSyncClusterAction.size() <= 0 || idx == this.lgIl + 1L;

    this.listBthDataSyncClusterAction.add(_oeainDataSyncClusterAction);
    this.lgIl = idx;
    if (this.listBthDataSyncClusterAction.size() == this.iSbm) {
      this.fls();
    }
  }


  void fls() throws Exception {
    this.throwingBiConsumerApirlle.accept(this.lgIl, this.listBthDataSyncClusterAction);
    this.listBthDataSyncClusterAction.clear();
  }
}
