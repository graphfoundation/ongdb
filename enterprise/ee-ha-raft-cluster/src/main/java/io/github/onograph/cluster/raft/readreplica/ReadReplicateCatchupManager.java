package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbFailedToStopException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncFacade;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncWatcherProvider;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaBulkTransactionManager;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaIncomingChangeTaskError;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaJobEventService;
import io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaTransactionBlockProcessor;
import io.github.onograph.dbms.crash.CrashSignaler;
import io.github.onograph.dbms.crash.GdbCrashCauseInfo;
import io.github.onograph.dbms.crash.GdbCrashEvent;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.util.Preconditions;
import org.neo4j.util.VisibleForTesting;
import org.neo4j.util.concurrent.BinaryLatch;


public class ReadReplicateCatchupManager extends LifecycleAdapter implements CatchupRunner {


  private final ReadReplicaGdbWrapperEnvironment cdReadReplicaGdbWrapperEnvironment;


  private final TransactionSyncManager cptTransactionSyncManager;


  private final CrashSignaler crashSignaler;


  private final io.github.onograph.dbms.GdbReplicator.FireEvents dedFireEvents;


  private final ReadReplicaBulkTransactionManager faReadReplicaBulkTransactionManager;


  private final long lgMqs;


  private final long lgSba;


  private final Log log;


  private final TransactionSyncWatcherProvider mrpTransactionSyncWatcherProvider;


  private final StoreSyncFacade pcsStoreSyncFacade;


  private final SocketAddressService puSocketAddressService;


  private volatile ReadReplicaTransactionBlockProcessor apirReadReplicaTransactionBlockProcessor;


  private CompletableFuture<Boolean> completableFutureFdtuBoolean;


  private volatile io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade hcsStoreSyncOpFacade;


  private volatile io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType saeReadReplicaCatchupMetaType;


  ReadReplicateCatchupManager(ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment,
      TransactionSyncManager _cptTransactionSyncManager, CrashSignaler crashSignaler,
      io.github.onograph.dbms.GdbReplicator.FireEvents _dedFireEvents,
      ReadReplicaBulkTransactionManager _faReadReplicaBulkTransactionManager, long _lgSba,
      long _lgSqm, LogProvider _logProvider, StoreSyncFacade _pcsStoreSyncFacade,
      SocketAddressService _puSocketAddressService) {
    this.saeReadReplicaCatchupMetaType =
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_TRX_IN_PROGRESS;
    this.lgMqs = _lgSqm;
    this.lgSba = _lgSba;
    this.cdReadReplicaGdbWrapperEnvironment = _cdReadReplicaGdbWrapperEnvironment;
    this.faReadReplicaBulkTransactionManager = _faReadReplicaBulkTransactionManager;
    this.puSocketAddressService = _puSocketAddressService;
    this.dedFireEvents = _dedFireEvents;
    this.mrpTransactionSyncWatcherProvider =
        _cdReadReplicaGdbWrapperEnvironment.getMonitors()
            .newMonitor(TransactionSyncWatcherProvider.class, new String[0]);
    this.log = _logProvider.getLog(this.getClass());
    this.crashSignaler = crashSignaler;
    this.cptTransactionSyncManager = _cptTransactionSyncManager;
    this.pcsStoreSyncFacade = _pcsStoreSyncFacade;
  }


  private void _coyso() {
    try {
      this._enekesp();
      this._releso();
      if (this._isRerdaasc()) {
        this._trittpug();
        this.dedFireEvents.ftree(this.apirReadReplicaTransactionBlockProcessor.getLgItql());
      }
    } catch (

        GdbStoreException | GdbStoreSyncCrlException | IOException _exception) {

    } catch (

        GdbFailedToStopException _gdbFailedToStopException) {

    }
  }


  private void _enekesp() {
    if (this.hcsStoreSyncOpFacade == null) {

      this.hcsStoreSyncOpFacade = this.cdReadReplicaGdbWrapperEnvironment.stfosrcyDbmsManagerClusterImplStoreSyncOpFacade();
    } else {

    }
  }


  private boolean _isRerdaasc() {
    Preconditions.checkState(this.hcsStoreSyncOpFacade != null, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.checkState"));

    io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade _hnlStoreSyncOpFacade = this.hcsStoreSyncOpFacade;
    this.hcsStoreSyncOpFacade = null;

    boolean _isRt = _hnlStoreSyncOpFacade.isReee();
    if (!_isRt) {

      return false;
    } else if (!this.cdReadReplicaGdbWrapperEnvironment.getKreDatabase().isStarted()) {

      return false;
    } else {

      this.apirReadReplicaTransactionBlockProcessor = this.faReadReplicaBulkTransactionManager.craReadReplicaTransactionBlockProcessor();
      return true;
    }
  }


  private synchronized void _paiForTh(Throwable _throwable) {
    this.completableFutureFdtuBoolean.completeExceptionally(_throwable);
    this.saeReadReplicaCatchupMetaType =
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_FPANIC;
    this.crashSignaler.signal(
        new GdbCrashEvent(_throwable,
            this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId(),
            GdbCrashCauseInfo.CCI_CONS_NODE_CATCHUP_ERR));
  }


  private void _puanaltniForSoSt(StoreId _lclStoreId, SocketAddress _socketAddress) {

    long _lgItql = this.apirReadReplicaTransactionBlockProcessor.getLgItql();
    this.mrpTransactionSyncWatcherProvider.txpurut(_lgItql);

    ReadReplicaGetChangesTask readReplicaGetChangesTask =
        new ReadReplicaGetChangesTask(new SignalCrashIfFailure(), this.lgSba, this.lgMqs, this.log,
            this.apirReadReplicaTransactionBlockProcessor,
            () ->
            {
              return this.saeReadReplicaCatchupMetaType ==
                  io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_KILLED
                  ||
                  this.saeReadReplicaCatchupMetaType ==
                      io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_FPANIC;
            });

    TransactionChunkingCompleted _rslTransactionChunkingCompleted;
    try {
      _rslTransactionChunkingCompleted = this.cptTransactionSyncManager.putrcsTransactionChunkingCompleted(
          _socketAddress, readReplicaGetChangesTask,
          this.cdReadReplicaGdbWrapperEnvironment.getKreDatabase()
              .getStorageEngineFactory()
              .commandReaderFactory(),
          _lgItql,
          this.cdReadReplicaGdbWrapperEnvironment.getMonitors()
              .newMonitor(
                  TransactionSyncWatcherProvider.class,
                  new String[0]),
          this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId(),
          _lclStoreId);
    } catch (

        Exception _exception) {
      if (ReadReplicaIncomingChangeTaskError.IT.equals(_exception.getCause())) {

      } else {

      }

      this._stecpt();
      return;
    }

    switch (_rslTransactionChunkingCompleted.getStat()) {
      case CST_OK_STREAM_COMPLETE:

        this.completableFutureFdtuBoolean.complete(Boolean.TRUE);
        break;
      case CST_TRX_PRN_ERR:

        this._tritsrcy();
        break;
      default:


    }
  }


  private void _putrcs() {

    SocketAddress _socketAddress;
    try {
      _socketAddress = this.puSocketAddressService.prmySocketAddress(
          this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId());
    } catch (

        CatchupNodeNotFoundException _catchupNodeNotFoundException) {

      return;
    }

    StoreId _lclStoreId = this.cdReadReplicaGdbWrapperEnvironment.stridStoreId();
    this._puanaltniForSoSt(_lclStoreId, _socketAddress);
  }


  private void _releso()
      throws IOException, GdbStoreException, GdbFailedToStopException, GdbStoreSyncCrlException {
    this.pcsStoreSyncFacade.recwhsefForSo(this.puSocketAddressService);
  }


  private void _stecpt() {
    if (this.saeReadReplicaCatchupMetaType !=
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_FPANIC) {

      final BinaryLatch _binaryLatch = new BinaryLatch();
      this.apirReadReplicaTransactionBlockProcessor.apbaForRe(new ReadReplicaJobEventService() {
        @Override
        public void onfauForEx(Exception _exception) {
          ReadReplicateCatchupManager.this._paiForTh(_exception);
          _binaryLatch.release();
        }

        @Override
        public void onsue() {
          _binaryLatch.release();
        }
      });
      _binaryLatch.await();
    }
  }


  private void _tritsrcy() {
    if (this.saeReadReplicaCatchupMetaType ==
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_TRX_IN_PROGRESS) {
      this.saeReadReplicaCatchupMetaType =
          io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_SC_IN_PROGRESS;
    }
  }


  private void _trittpug() {
    if (this.saeReadReplicaCatchupMetaType ==
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_SC_IN_PROGRESS) {
      this.saeReadReplicaCatchupMetaType =
          io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_TRX_IN_PROGRESS;
    }
  }


  @VisibleForTesting
  public io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType getSaeReadReplicaCatchupMetaType() {
    return this.saeReadReplicaCatchupMetaType;
  }


  public boolean isCaee() {
    return this.saeReadReplicaCatchupMetaType ==
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_KILLED;
  }


  public boolean isPacd() {
    return this.saeReadReplicaCatchupMetaType ==
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_FPANIC;
  }


  public synchronized boolean isPas() {
    if (this.saeReadReplicaCatchupMetaType !=
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_KILLED
        &&
        this.saeReadReplicaCatchupMetaType !=
            io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_FPANIC
        &&
        this.saeReadReplicaCatchupMetaType !=
            io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_SC_IN_PROGRESS) {
      if (this.saeReadReplicaCatchupMetaType ==
          io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_ON_HOLD) {
        return false;
      } else {
        this.saeReadReplicaCatchupMetaType =
            io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_ON_HOLD;

        return true;
      }
    } else {

      throw new IllegalStateException("*** Error:  a21c3902-4f74-4e39-aaf9-36ed8ae61c38");
    }
  }


  public synchronized boolean isReu() {
    if (this.saeReadReplicaCatchupMetaType !=
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_KILLED
        &&
        this.saeReadReplicaCatchupMetaType !=
            io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_FPANIC) {
      if (this.saeReadReplicaCatchupMetaType !=
          io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_ON_HOLD) {
        return false;
      } else {
        this.saeReadReplicaCatchupMetaType =
            io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_TRX_IN_PROGRESS;

        return true;
      }
    } else {

      throw new IllegalStateException("*** Error:  a3577b92-001b-4f79-9126-7c6be3320c8f");
    }
  }

  @Override
  public void run() {
    this.triggerTimeUnit();
  }

  @Override
  public synchronized void start() {

    this.saeReadReplicaCatchupMetaType =
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_TRX_IN_PROGRESS;
    this.completableFutureFdtuBoolean = new CompletableFuture();
    this.apirReadReplicaTransactionBlockProcessor = this.faReadReplicaBulkTransactionManager.craReadReplicaTransactionBlockProcessor();
  }

  @Override
  public synchronized void stop() {

    this.saeReadReplicaCatchupMetaType =
        io.github.onograph.cluster.raft.readreplica.ReadReplicateCatchupManager.ReadReplicaCatchupMetaType.CMT_KILLED;
  }


  void triggerTimeUnit() {
    try {
      switch (this.saeReadReplicaCatchupMetaType) {
        case CMT_TRX_IN_PROGRESS:
          this._putrcs();
          break;
        case CMT_SC_IN_PROGRESS:
          this._coyso();
        case CMT_KILLED:
        case CMT_FPANIC:
        case CMT_ON_HOLD:
          break;
        default:

          throw new IllegalStateException("*** Error: 8c6780ed-fb04-4c7f-9691-b0c06c2439b6");
      }
    } catch (

        Throwable _throwable) {

      this._paiForTh(_throwable);
    }
  }


  public CompletableFuture<Boolean> uptodtfurCompletableFuture() {

    return this.completableFutureFdtuBoolean;
  }


  protected enum ReadReplicaCatchupMetaType {


    CMT_TRX_IN_PROGRESS,

    CMT_SC_IN_PROGRESS,

    CMT_FPANIC,

    CMT_KILLED,

    CMT_ON_HOLD
  }


  private class SignalCrashIfFailure implements ReadReplicaJobEventService {

    @Override
    public void onfauForEx(Exception _exception) {
      ReadReplicateCatchupManager.this._paiForTh(_exception);
    }

    @Override
    public void onsue() {
    }
  }
}
