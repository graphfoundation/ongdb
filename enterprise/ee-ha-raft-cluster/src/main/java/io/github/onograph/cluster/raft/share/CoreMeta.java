package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.ClusterSessionManager;
import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.MetaWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import java.io.IOException;
import org.neo4j.io.state.StateStorage;


public class CoreMeta {


  private final CoreGdbFSMService msCoreGdbFSMService;


  private final ClusterSessionManager stClusterSessionManager;


  private final StateStorage<Long> stateStorageSflLong;


  CoreMeta(CoreGdbFSMService _smCoreGdbFSMService, StateStorage<Long> _stateStorageSflLong,
      ClusterSessionManager _tsClusterSessionManager) {
    this.msCoreGdbFSMService = _smCoreGdbFSMService;
    this.stClusterSessionManager = _tsClusterSessionManager;
    this.stateStorageSflLong = _stateStorageSflLong;
  }


  public void aunspForSn(SnapshotData _csSnapshotData) {
    this.msCoreGdbFSMService.aunspForSn(_csSnapshotData);
    _csSnapshotData.addForMeT(MetaWrapper.META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META,
        this.stClusterSessionManager.snpoReplicationSessionManagerMeta());
  }


  public AutoCloseableActionProcessor condpeAutoCloseableActionProcessor() {
    return this.msCoreGdbFSMService.getDsaceAutoCloseableActionProcessor();
  }


  public void fls(long _lgAl) throws IOException {
    this.msCoreGdbFSMService.fls();
    this.stClusterSessionManager.fls();
    this.stateStorageSflLong.writeState(_lgAl);
  }


  public long gelsalin() {

    long _lgIal = this.msCoreGdbFSMService.gelsalin();

    long _lgSfm = this.stClusterSessionManager.gelsalin();
    return Long.max(_lgIal, _lgSfm);
  }


  public long geltfue() {
    return this.stateStorageSflLong.getInitialState();
  }


  public void inlspForSn(SnapshotData _csSnapshotData) {
    this.msCoreGdbFSMService.inlspForSn(_csSnapshotData);
    this.stClusterSessionManager.inlspForRe(_csSnapshotData.getCsmoForMW(
        MetaWrapper.META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META));
  }
}
