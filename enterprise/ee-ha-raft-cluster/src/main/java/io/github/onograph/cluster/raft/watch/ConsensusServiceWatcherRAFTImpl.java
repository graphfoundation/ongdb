package io.github.onograph.cluster.raft.watch;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.meta.pit.CoreDbSyncWatcher;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import java.time.Clock;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.CappedLogger;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.StoreId;


public class ConsensusServiceWatcherRAFTImpl
    implements io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ConsensusServiceWatcher,
    CoreDbSyncWatcher {


  private final Log dbgLog;


  private final CappedLogger dsalCappedLogger;


  private final CappedLogger lasiCappedLogger;


  private final CappedLogger lirpCappedLogger;


  private final CappedLogger lwbCappedLogger;


  private final CappedLogger lwmcCappedLogger;


  private final Log useLog;


  private ConsensusServiceWatcherRAFTImpl(Clock _clock, LogService _logService) {
    this.dbgLog = _logService.getInternalLogProvider().getLog(this.getClass());
    this.useLog = _logService.getUserLogProvider().getLog(this.getClass());
    this.lwmcCappedLogger = new CappedLogger(this.useLog, 10L, TimeUnit.SECONDS, _clock);
    this.lwbCappedLogger = new CappedLogger(this.useLog, 10L, TimeUnit.SECONDS, _clock);
    this.lirpCappedLogger = new CappedLogger(this.dbgLog, 5L, TimeUnit.SECONDS, _clock);
    this.dsalCappedLogger = new CappedLogger(this.dbgLog, 10L, TimeUnit.SECONDS, _clock);
    this.lasiCappedLogger = new CappedLogger(this.dbgLog, 10L, TimeUnit.SECONDS, _clock);
  }


  public static void reieForLoMoCl(Clock _clock, LogService _logService, Monitors _monitors) {

    ConsensusServiceWatcherRAFTImpl _mrConsensusServiceWatcherRAFTImpl = new ConsensusServiceWatcherRAFTImpl(
        _clock, _logService);
    _monitors.addMonitorListener(_mrConsensusServiceWatcherRAFTImpl);
  }

  @Override
  public void botattForSeSt(Set<ServerId> _setSiServerId, StoreId _storeId) {

  }

  @Override
  public void botattugdoForNa(NamedDatabaseId _namedDatabaseId) {

  }

  @Override
  public void botrpForSnNaCo(ConsensusNodeId consensusNodeId, NamedDatabaseId _namedDatabaseId,
      SnapshotData _snapshotData) {

  }

  @Override
  public void botrtfdForNaCo(ConsensusNodeId consensusNodeId, NamedDatabaseId _namedDatabaseId) {

  }

  @Override
  public void botrttutpyForNaCo(ConsensusNodeId consensusNodeId, NamedDatabaseId _namedDatabaseId) {

  }

  @Override
  public void doosatclForNa(NamedDatabaseId _namedDatabaseId) {

    this.useLog.info(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.watch.ConsensusServiceWatcherRAFTImpl.info3"),
        _namedDatabaseId.name());
  }

  @Override
  public void losvstdte() {

  }

  @Override
  public void repsrtiForNaCo(ConsensusMemberGroupId consensusMemberGroupId,
      NamedDatabaseId _namedDatabaseId) {

  }

  @Override
  public void stednatForNa(NamedDatabaseId _namedDatabaseId) {

    this.useLog.info(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.watch.ConsensusServiceWatcherRAFTImpl.info2"),
        _namedDatabaseId.name());
  }

  @Override
  public void wanfbtForNa(NamedDatabaseId _namedDatabaseId) {

  }

  @Override
  public void wanfcmesForNa(int _iCm, NamedDatabaseId _namedDatabaseId) {

    this.lwmcCappedLogger.info(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.watch.ConsensusServiceWatcherRAFTImpl.info"),
        _namedDatabaseId.name(), _iCm);
  }
}
