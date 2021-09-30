package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.share.CoreMeta;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import java.io.IOException;
import java.time.Clock;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.neo4j.dbms.database.DatabaseStartAbortedException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.internal.CappedLogger;
import org.neo4j.logging.internal.LogService;


public class SnapshotDataManager {


  private static final String OPRI_NME = io.github.onograph.I18N.format(
      "io.github.onograph.cluster.raft.share.meta.SnapshotDataManager.var");


  private final CappedLogger cappedLogger;


  private final ConsensusOperationsManager consensusOperationsManager;


  private final CoreMeta csCoreMeta;


  private final ConsensusTransactionLog lrConsensusTransactionLog;


  private final NamedDatabaseId namedDatabaseId;


  private final ActionProcessManager paActionProcessManager;


  public SnapshotDataManager(Clock _clock, ConsensusOperationsManager consensusOperationsManager,
      LogService _logService, ConsensusTransactionLog _lrConsensusTransactionLog,
      NamedDatabaseId _namedDatabaseId, ActionProcessManager _paActionProcessManager,
      CoreMeta _scCoreMeta) {
    this.paActionProcessManager = _paActionProcessManager;
    this.csCoreMeta = _scCoreMeta;
    this.lrConsensusTransactionLog = _lrConsensusTransactionLog;
    this.consensusOperationsManager = consensusOperationsManager;
    this.namedDatabaseId = _namedDatabaseId;
    this.cappedLogger = new CappedLogger(_logService.getInternalLog(this.getClass()), 10L,
        TimeUnit.SECONDS, _clock);
  }


  public synchronized void awteForDaDu(
      DatabaseStartupControllerAbortableImpl _saDatabaseStartupControllerAbortableImpl,
      Duration _twDuration) throws InterruptedException, DatabaseStartAbortedException {
    while (this.consensusOperationsManager.sttConsensusMetaInfo().apeie() < 0L) {

      if (_saDatabaseStartupControllerAbortableImpl.shouldAbort(this.namedDatabaseId)) {
        throw new DatabaseStartAbortedException(this.namedDatabaseId);
      }

      this.wait(_twDuration.toMillis());
    }
  }


  public synchronized void inlspForSn(SnapshotData _scSnapshotData) throws IOException {

    long _lgIps = _scSnapshotData.getBefIdx();
    this.lrConsensusTransactionLog.pass(_scSnapshotData.getBefTLng(), _lgIps);
    this.consensusOperationsManager.inlceseForCo(
        _scSnapshotData.getCsmoForMW(MetaWrapper.CONS_CND_STAX));
    this.csCoreMeta.inlspForSn(_scSnapshotData);
    this.csCoreMeta.fls(_lgIps);
    this.paActionProcessManager.inlspForSn(_scSnapshotData);
    this.notifyAll();
  }


  public synchronized SnapshotData snpoSnapshotData() throws Exception {
    this.paActionProcessManager.stopProcessor(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.SnapshotDataManager.stopProcessor"));

    SnapshotData _snapshotData;
    try {

      long _lgLa = this.paActionProcessManager.getLgAl();

      long befTLng = this.lrConsensusTransactionLog.redettm(_lgLa);

      SnapshotData _csSnapshotData = new SnapshotData(_lgLa, befTLng);
      this.csCoreMeta.aunspForSn(_csSnapshotData);
      _csSnapshotData.addForMeT(MetaWrapper.CONS_CND_STAX,
          this.consensusOperationsManager.coesaConsensusMembershipState());
      _snapshotData = _csSnapshotData;
    } finally {
      this.paActionProcessManager.reualrForSt(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.share.meta.SnapshotDataManager.reualrForSt"));
    }

    return _snapshotData;
  }
}
