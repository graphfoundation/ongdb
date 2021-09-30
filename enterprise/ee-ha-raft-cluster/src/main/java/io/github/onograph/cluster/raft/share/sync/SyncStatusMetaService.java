package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.share.meta.FSMData;


public interface SyncStatusMetaService {


  void abrForDa(DataSyncClusterAction _dataSyncClusterAction);


  int inpgc();


  SyncStatus strSyncStatus(DataSyncClusterAction _dataSyncClusterAction);


  void trcrelForDaFS(DataSyncClusterAction _dataSyncClusterAction, FSMData _fSMData);


  void trerliee();


  void trrcnForDa(DataSyncClusterAction _dataSyncClusterAction);
}
