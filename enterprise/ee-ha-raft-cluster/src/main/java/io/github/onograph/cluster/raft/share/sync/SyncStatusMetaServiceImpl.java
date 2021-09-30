package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;


public class SyncStatusMetaServiceImpl implements SyncStatusMetaService {


  private final Map<SessionSeqActionId, SyncStatus> mapTakrss = new ConcurrentHashMap();


  private final ClusterSessionBean sgmClusterSessionBean;

  public SyncStatusMetaServiceImpl(ClusterSessionBean _sgmClusterSessionBean) {
    this.sgmClusterSessionBean = _sgmClusterSessionBean;
  }

  @Override
  public void abrForDa(DataSyncClusterAction _oeainDataSyncClusterAction) {
    this.mapTakrss.remove(_oeainDataSyncClusterAction.getIoSessionSeqActionId());
  }

  @Override
  public int inpgc() {
    return this.mapTakrss.size();
  }

  @Override
  public SyncStatus strSyncStatus(DataSyncClusterAction _oeainDataSyncClusterAction) {
    assert _oeainDataSyncClusterAction.getSgClusterSessionBean().equals(this.sgmClusterSessionBean);

    SyncStatus _porsSyncStatus = new SyncStatus();
    this.mapTakrss.put(_oeainDataSyncClusterAction.getIoSessionSeqActionId(), _porsSyncStatus);
    return _porsSyncStatus;
  }

  @Override
  public void trcrelForDaFS(DataSyncClusterAction _oeainDataSyncClusterAction,
      FSMData _rslFSMData) {
    Objects.requireNonNull(_rslFSMData, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl.requireNonNull"));
    if (_oeainDataSyncClusterAction.getSgClusterSessionBean().equals(this.sgmClusterSessionBean)) {

      SyncStatus _porsSyncStatus = this.mapTakrss.remove(
          _oeainDataSyncClusterAction.getIoSessionSeqActionId());
      if (_porsSyncStatus != null) {
        _porsSyncStatus.reierelForFS(_rslFSMData);
      }
    }
  }

  @Override
  public void trerliee() {
    this.mapTakrss.forEach((ignored, progress) ->
    {
      progress.trerliee();
    });
  }

  @Override
  public void trrcnForDa(DataSyncClusterAction _oeainDataSyncClusterAction) {
    if (_oeainDataSyncClusterAction.getSgClusterSessionBean().equals(this.sgmClusterSessionBean)) {

      SyncStatus _porsSyncStatus = this.mapTakrss.get(
          _oeainDataSyncClusterAction.getIoSessionSeqActionId());
      if (_porsSyncStatus != null) {
        _porsSyncStatus.serlad();
      }
    }
  }
}
