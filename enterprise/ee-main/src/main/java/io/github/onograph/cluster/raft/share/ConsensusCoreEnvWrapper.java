package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import io.github.onograph.cluster.raft.share.sync.SyncStatusMetaService;
import io.github.onograph.cluster.raft.share.sync.Syncerator;


class ConsensusCoreEnvWrapper {


  private final ConsensusNodeGroupWrapper grConsensusNodeGroupWrapper;


  private final Syncerator rpiaoSyncerator;


  private final ActionIdxMonitor ticActionIdxMonitor;


  private final SyncStatusMetaService tpSyncStatusMetaService;

  ConsensusCoreEnvWrapper(ConsensusNodeGroupWrapper _grConsensusNodeGroupWrapper,
      Syncerator _rpiaoSyncerator, ActionIdxMonitor _ticActionIdxMonitor,
      SyncStatusMetaService _tpSyncStatusMetaService) {
    this.grConsensusNodeGroupWrapper = _grConsensusNodeGroupWrapper;
    this.rpiaoSyncerator = _rpiaoSyncerator;
    this.ticActionIdxMonitor = _ticActionIdxMonitor;
    this.tpSyncStatusMetaService = _tpSyncStatusMetaService;
  }


  ConsensusNodeGroupWrapper getGrConsensusNodeGroupWrapper() {
    return this.grConsensusNodeGroupWrapper;
  }


  Syncerator getRpiaoSyncerator() {
    return this.rpiaoSyncerator;
  }


  ActionIdxMonitor getTicActionIdxMonitor() {
    return this.ticActionIdxMonitor;
  }


  SyncStatusMetaService getTpSyncStatusMetaService() {
    return this.tpSyncStatusMetaService;
  }
}
