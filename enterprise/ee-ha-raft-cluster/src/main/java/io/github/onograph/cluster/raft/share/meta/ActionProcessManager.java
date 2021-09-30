package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.ClusterSessionManager;
import io.github.onograph.cluster.raft.share.CoreMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import io.github.onograph.cluster.raft.share.calg.cle.watch.PetConsensusLogEntryWatcher;
import io.github.onograph.cluster.raft.share.calg.cle.watch.SubmittedConsensusLogEntryWatcher;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.CoreNodeSyncableData;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction;
import io.github.onograph.cluster.raft.share.sync.SyncStatusMetaService;
import io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder;
import io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueOneElementImpl;
import io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper;
import io.github.onograph.dbms.crash.DbmsCrashManager;
import io.github.onograph.dbms.crash.GdbCrashCauseInfo;
import io.github.onograph.dbms.crash.GdbCrashEvent;
import io.github.onograph.dbms.crash.GdbCrashSender;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class ActionProcessManager implements DbmsCrashManager {


  private static final long NOHG = -1L;


  private final ActionConsumerManager bthrActionConsumerManager;


  private final ConsensusLogCacheService cfiConsensusLogCacheService;


  private final ReentrantLock datReentrantLock = new ReentrantLock();


  private final AtomicLong flAtomicLong = new AtomicLong(-1L);


  private final int iFe;


  private final Log log;


  private final ConsensusTransactionLog lrConsensusTransactionLog;


  private final PetConsensusLogEntryWatcher miaPetConsensusLogEntryWatcher;


  private final SubmittedConsensusLogEntryWatcher micSubmittedConsensusLogEntryWatcher;


  private final GdbCrashSender pnceGdbCrashSender;


  private final io.github.onograph.cluster.raft.share.meta.ActionProcessManager.AppliedIndexMeta saAppliedIndexMeta =
      new io.github.onograph.cluster.raft.share.meta.ActionProcessManager.AppliedIndexMeta();


  private final io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper sbMetricsEnvironmentWrapper;


  private final CoreMeta scCoreMeta;


  private final Supplier<QueueableJobSchedulerWrapper> supplierSsQueueableJobSchedulerWrapper;


  private final SyncStatusMetaService tpSyncStatusMetaService;


  private final ClusterSessionManager tsClusterSessionManager;


  private int iCp = 1;


  private volatile boolean isPh;


  private QueueableJobSchedulerWrapper queueableJobSchedulerWrapper;


  public ActionProcessManager(ConsensusLogCacheService _cfiConsensusLogCacheService, int _iFe,
      int _iMbs, JobScheduler _jobScheduler, LogProvider _logProvider,
      ConsensusTransactionLog _lrConsensusTransactionLog, Monitors _monitors,
      GdbCrashSender _pnceGdbCrashSender, SyncStatusMetaService _ptSyncStatusMetaService,
      CoreMeta _scCoreMeta, ClusterSessionManager _tsClusterSessionManager) {
    this.lrConsensusTransactionLog = _lrConsensusTransactionLog;
    this.iFe = _iFe;
    this.tpSyncStatusMetaService = _ptSyncStatusMetaService;
    this.tsClusterSessionManager = _tsClusterSessionManager;
    this.log = _logProvider.getLog(this.getClass());
    this.scCoreMeta = _scCoreMeta;
    this.cfiConsensusLogCacheService = _cfiConsensusLogCacheService;
    this.micSubmittedConsensusLogEntryWatcher = _monitors.newMonitor(
        SubmittedConsensusLogEntryWatcher.class, new String[]{this.getClass().getName()});
    this.miaPetConsensusLogEntryWatcher =
        _monitors.newMonitor(PetConsensusLogEntryWatcher.class,
            new String[]{this.getClass().getName()});
    this.bthrActionConsumerManager = new ActionConsumerManager(_iMbs, this::_aplbahForLi);
    this.pnceGdbCrashSender = _pnceGdbCrashSender;
    this.supplierSsQueueableJobSchedulerWrapper = () ->
    {
      return new QueueableJobSchedulerWrapper(_jobScheduler, new ElementQueueOneElementImpl(),
          Group.CORE_STATE_APPLIER, this.log);
    };
    this.sbMetricsEnvironmentWrapper =
        MetricsEnvironmentWrapperBuilder.craMetricsEnvironmentWrapperBuilderMetricsEnvironmentWrapper(
            true, 4096L, this.log,
            io.github.onograph.TokenConstants.BATCH_SIZE);
  }


  private void _aplbahForLi(long _lgIl, List<DataSyncClusterAction> _listBthDataSyncClusterAction)
      throws Exception {
    if (_listBthDataSyncClusterAction.size() != 0) {
      this.sbMetricsEnvironmentWrapper.colt(_listBthDataSyncClusterAction.size());
      this.datReentrantLock.lock();

      try {

        long _lgIs = _lgIl - (long) _listBthDataSyncClusterAction.size() + 1L;

        long _lgIhl = this._haeoasForLi(_lgIs, _listBthDataSyncClusterAction);

        assert _lgIhl == _lgIl;

        this.saAppliedIndexMeta.seltape(_lgIl);
        this._maftdk();
      } finally {
        this.datReentrantLock.unlock();
      }
    }
  }


  private void _apljo() {
    try {
      this._aplupt(this.saAppliedIndexMeta.toapy());
    } catch (

        Throwable _throwable) {
      this.pnceGdbCrashSender.initiate(GdbCrashCauseInfo.CCI_CMD_ERROR, _throwable);


    }
  }


  private void _aplupt(long _lgItua) throws Exception {
    if (_lgItua != -1L) {

      ConsensusLogCursorAccessor _lesConsensusLogCursorAccessor =
          new ConsensusLogCursorAccessor(this.cfiConsensusLogCacheService, true,
              this.lrConsensusTransactionLog);

      try {

        long lgIdx = this.saAppliedIndexMeta.lgAl + 1L;

        while (true) {
          if (this.isPh || lgIdx > _lgItua) {
            this.bthrActionConsumerManager.fls();
            break;
          }

          ConsensusLogEntry _consensusLogEntry = _lesConsensusLogCursorAccessor.getConsensusLogEntry(
              lgIdx);
          if (_consensusLogEntry == null) {

            throw new IllegalStateException("*** Error: cac3be27-17d6-49d1-8653-138c3d5f2153");
          }

          if (_consensusLogEntry.getBtval() instanceof DataSyncClusterAction) {

            DataSyncClusterAction _odDataSyncClusterAction = (DataSyncClusterAction) _consensusLogEntry.getBtval();
            this.tpSyncStatusMetaService.trrcnForDa(_odDataSyncClusterAction);
            this.bthrActionConsumerManager.addForDa(lgIdx, _odDataSyncClusterAction);
          } else {
            this.bthrActionConsumerManager.fls();
            this.saAppliedIndexMeta.seltape(lgIdx);
          }

          ++lgIdx;
        }
      } catch (

          Throwable _throwable) {
        try {
          _lesConsensusLogCursorAccessor.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _lesConsensusLogCursorAccessor.close();
    }
  }


  private long _doflh() throws IOException {
    this.datReentrantLock.lock();

    long _lgV;
    try {

      long _lgIf = this.saAppliedIndexMeta.lgAl;
      if (_lgIf > -1L) {
        this.scCoreMeta.fls(_lgIf);
        this.flAtomicLong.set(_lgIf);
      }

      _lgV = _lgIf;
    } finally {
      this.datReentrantLock.unlock();
    }

    return _lgV;
  }


  private long _haeoasForLi(long caIdx,
      List<DataSyncClusterAction> _listOeainDataSyncClusterAction) {

    AutoCloseableActionProcessor _dsaceAutoCloseableActionProcessor = this.scCoreMeta.condpeAutoCloseableActionProcessor();

    try {

      Iterator _iterator = _listOeainDataSyncClusterAction.iterator();

      while (_iterator.hasNext()) {

        DataSyncClusterAction _oeainDataSyncClusterAction = (DataSyncClusterAction) _iterator.next();
        if (!this.tsClusterSessionManager.isVaaoeoForClSe(
            _oeainDataSyncClusterAction.getIoSessionSeqActionId(),
            _oeainDataSyncClusterAction.getSgClusterSessionBean())) {
          if (this.log.isDebugEnabled()) {

          }

          ++caIdx;
        } else {

          CoreNodeSyncableData _cmadCoreNodeSyncableData = (CoreNodeSyncableData) _oeainDataSyncClusterAction.getBtval();
          _cmadCoreNodeSyncableData.dipcForSy(_dsaceAutoCloseableActionProcessor, (result) ->
          {
            this.tpSyncStatusMetaService.trcrelForDaFS(_oeainDataSyncClusterAction, result);
          }, caIdx);
          this.tsClusterSessionManager.upaForClSe(
              _oeainDataSyncClusterAction.getIoSessionSeqActionId(), caIdx,
              _oeainDataSyncClusterAction.getSgClusterSessionBean());
          ++caIdx;
        }
      }
    } catch (

        Throwable _throwable) {
      if (_dsaceAutoCloseableActionProcessor != null) {
        try {
          _dsaceAutoCloseableActionProcessor.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_dsaceAutoCloseableActionProcessor != null) {
      _dsaceAutoCloseableActionProcessor.close();
    }

    return caIdx - 1L;
  }


  private void _maftdk() throws IOException {
    if (this.saAppliedIndexMeta.lgAl - this.flAtomicLong.get() > (long) this.iFe) {
      this._doflh();
    }
  }


  private synchronized void _sceljo() {
    if (this.iCp == 0 && !this.isPh) {
      this.queueableJobSchedulerWrapper.ofejoForRu(this::_apljo);
    }
  }


  public synchronized long fls() throws IOException {
    return this.iCp > 0 ? -1L : this._doflh();
  }


  long getLgAl() {
    return this.saAppliedIndexMeta.lgAl;
  }

  @Override
  public void handleCrash(GdbCrashEvent _pncGdbCrashEvent) {
    this.isPh = true;
  }


  synchronized void inlspForSn(SnapshotData _csSnapshotData) {
    if (this.iCp <= 0) {

      throw new IllegalStateException("*** Error:  b6290f43-5d92-4a9e-914b-e619abee9287");
    } else {
      this.flAtomicLong.set(_csSnapshotData.getBefIdx());
      this.saAppliedIndexMeta.seltape(_csSnapshotData.getBefIdx());
    }
  }


  void noyci(long _lgIc) {
    this.saAppliedIndexMeta.noyci(_lgIc);
    if (this.saAppliedIndexMeta.toapy() != -1L) {
      this._sceljo();
    }
  }


  public synchronized void processShutdown() throws IOException {
    this.stopProcessor(io.github.onograph.TokenConstants.SHUTDOWN);
    this._doflh();
  }


  public synchronized void reualrForSt(String _strRao) {
    if (this.iCp <= 0) {

      throw new IllegalStateException("*** Error:  8e9e4ba4-f2a4-4cce-b50e-877e2c368d86");
    } else {
      --this.iCp;

      if (this.iCp == 0) {
        assert this.queueableJobSchedulerWrapper == null;

        this.queueableJobSchedulerWrapper = this.supplierSsQueueableJobSchedulerWrapper.get();
        this._sceljo();
      }
    }
  }


  public synchronized void stopProcessor(String _strRao) {
    if (this.iCp < 0) {

      throw new IllegalStateException("*** Error:  c5fd116c-bbe4-454c-a2b8-99ff8c1579f2");
    } else {
      ++this.iCp;

      if (this.queueableJobSchedulerWrapper != null) {
        this.queueableJobSchedulerWrapper.stpadfu();
        this.queueableJobSchedulerWrapper = null;
      }
    }
  }


  public synchronized void str() throws Exception {
    this.flAtomicLong.compareAndSet(-1L, this.scCoreMeta.geltfue());
    this.saAppliedIndexMeta.seltape(this.flAtomicLong.get());

    this.tsClusterSessionManager.str();

    long _lgApl = Math.max(this.scCoreMeta.gelsalin(), this.saAppliedIndexMeta.getLgIcsl());
    if (_lgApl > this.saAppliedIndexMeta.lgAl) {

      this._aplupt(_lgApl);
    }

    this.reualrForSt(io.github.onograph.TokenConstants.STARTUP);
  }


  private class AppliedIndexMeta {


    private volatile long lgAl = -1L;


    private long lgIcsl = -1L;


    private synchronized long getLgIcsl() {
      return this.lgIcsl;
    }


    synchronized void noyci(long _lgIc) {
      if (this.lgIcsl < _lgIc) {
        this.lgIcsl = _lgIc;
        ActionProcessManager.this.micSubmittedConsensusLogEntryWatcher.comie(_lgIc);
      }
    }


    void seltape(long _lgAl) {
      this.lgAl = _lgAl;
      ActionProcessManager.this.miaPetConsensusLogEntryWatcher.apldid(_lgAl);
    }


    synchronized long toapy() {
      return this.lgAl >= this.lgIcsl ? -1L : this.lgIcsl;
    }
  }
}
