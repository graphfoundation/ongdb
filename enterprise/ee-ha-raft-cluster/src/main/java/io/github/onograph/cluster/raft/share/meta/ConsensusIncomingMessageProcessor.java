package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager;
import io.github.onograph.cluster.raft.share.calg.action.LeaderIndexWrapper;
import io.github.onograph.cluster.raft.share.calg.action.ResultMeta;
import io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter;
import io.github.onograph.dbms.crash.GdbCrashCauseInfo;
import io.github.onograph.dbms.crash.GdbCrashSender;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobHandle;


public class ConsensusIncomingMessageProcessor
    implements
    FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final ConsensusOperationsManager consensusOperationsManager;


  private final Log log;


  private final ActionProcessManager paActionProcessManager;


  private final io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl pacSocketAddressServiceLeaderImpl;


  private final GdbCrashSender pnceGdbCrashSender;


  private final SyncServiceLifecycleAdapter sdSyncServiceLifecycleAdapter;


  private boolean notRunning;


  public ConsensusIncomingMessageProcessor(
      io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl _capSocketAddressServiceLeaderImpl,
      ConsensusOperationsManager consensusOperationsManager, LogProvider _logProvider,
      ActionProcessManager _paActionProcessManager, GdbCrashSender _pnceGdbCrashSender,
      SyncServiceLifecycleAdapter _sdSyncServiceLifecycleAdapter) {
    this.log = _logProvider.getLog(this.getClass());
    this.consensusOperationsManager = consensusOperationsManager;
    this.sdSyncServiceLifecycleAdapter = _sdSyncServiceLifecycleAdapter;
    this.paActionProcessManager = _paActionProcessManager;
    this.pacSocketAddressServiceLeaderImpl = _capSocketAddressServiceLeaderImpl;
    this.pnceGdbCrashSender = _pnceGdbCrashSender;
  }


  private void _noyci(long _lgCi) {
    this.paActionProcessManager.noyci(_lgCi);
  }


  private void _scuadatdl() throws InterruptedException, ExecutionException {

    Optional<JobHandle<?>> _optionalJdJobHandle = this.sdSyncServiceLifecycleAdapter.scudwdOptional(
        this.pacSocketAddressServiceLeaderImpl);
    if (_optionalJdJobHandle.isPresent()) {
      _optionalJdJobHandle.get().waitTermination();
    }
  }

  @Override
  public synchronized void hadForM(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerMwObject) {
    if (!this.notRunning) {
      try {

        ResultMeta reslt = this.consensusOperationsManager.hadResultMeta(
            _arrivingMessageManagerMwObject.getM());
        if (reslt.snhrqmOptional().isPresent()) {

          LeaderIndexWrapper _rsLeaderIndexWrapper = reslt.snhrqmOptional().get();

          this._scuadatdl();
        } else {
          this._noyci(reslt.gecmie());
        }
      } catch (

          Throwable _throwable) {

        this.pnceGdbCrashSender.initiate(GdbCrashCauseInfo.CCI_CONS_MSG_APP_ERR, _throwable);
        this.notRunning = true;
      }
    }
  }

  @Override
  public synchronized void startProcessor(ConsensusMemberGroupId consensusMemberGroupId) {
    this.notRunning = false;
  }

  @Override
  public synchronized void stopProcessor() {
    this.notRunning = true;
  }
}
