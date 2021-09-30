package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManager;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncWatcherProvider;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.net.ConnectException;
import java.time.Clock;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.CappedLogger;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.util.VisibleForTesting;


class StoreTransactionProcessingManager {


  private final CommandReaderFactory commandReaderFactory;


  private final StoreCopyRetryable crStoreCopyRetryable;


  private final CappedLogger lecCappedLogger;


  private final Log log;


  private final TransactionSyncWatcherProvider mrpTransactionSyncWatcherProvider;


  private final NamedDatabaseId namedDatabaseId;


  private final io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.NamedGdbIdSocketAddressServiceWrapper
      paNamedGdbIdSocketAddressServiceWrapper;


  private long lgTh;


  private io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType scActionStatusType;


  @VisibleForTesting
  StoreTransactionProcessingManager(Clock _clock, CommandReaderFactory _commandReaderFactory,
      LogProvider _logProvider, TransactionSyncWatcherProvider _mrpTransactionSyncWatcherProvider,
      NamedDatabaseId _namedDatabaseId, StoreCopyRetryable _nphStoreCopyRetryable,
      SocketAddressService _pacSocketAddressService) {
    this.scActionStatusType = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.STAT_GOOD;
    this.namedDatabaseId = _namedDatabaseId;
    this.mrpTransactionSyncWatcherProvider = _mrpTransactionSyncWatcherProvider;
    this.commandReaderFactory = _commandReaderFactory;
    this.paNamedGdbIdSocketAddressServiceWrapper =
        new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.NamedGdbIdSocketAddressServiceWrapper(
            _pacSocketAddressService, _namedDatabaseId);
    this.log = _logProvider.getLog(this.getClass());
    this.crStoreCopyRetryable = _nphStoreCopyRetryable;
    this.lecCappedLogger = new CappedLogger(this.log, 1L, TimeUnit.SECONDS, _clock);
  }


  static StoreTransactionProcessingManager cratpueStoreTransactionProcessingManager(
      CommandReaderFactory _commandReaderFactory, Config _config, LogProvider _logProvider,
      Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      SocketAddressService _pacSocketAddressService) {

    Clock _clock = Clock.systemUTC();

    Duration _tiDuration = (Duration) _config.get(
        SettingsDeclarationClusterImpl.settingCaueaimDuration);
    return new StoreTransactionProcessingManager(_clock, _commandReaderFactory, _logProvider,
        (TransactionSyncWatcherProvider) _monitors.newMonitor(TransactionSyncWatcherProvider.class,
            new String[0]), _namedDatabaseId,
        new StoreCopyRetryableTimeoutableImpl(_clock, _tiDuration), _pacSocketAddressService);
  }


  private io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType _chcprrsStoreTransactionProcessingManagerActionStatusType(
      long _lgTwl,
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType _rslStatusType)
      throws GdbStoreException {
    if (this._isHapgsd(_lgTwl)) {
      this.crStoreCopyRetryable.ree();
      return io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.STAT_GOOD;
    } else if (this.scActionStatusType ==
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.FINAL_TRY) {

      throw new GdbStoreException("*** Error:  b4de960e-596b-43b0-ae84-81c3edb0b9a2");
    } else {
      return this.crStoreCopyRetryable.isCactu() &&
          _rslStatusType
              != io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType.ERR
          ? io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.STAT_GOOD
          : io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.FINAL_TRY;
    }
  }


  private io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType _exceStoreTransactionProcessingManagerStatusType(
      CatchupAnswerManager<TransactionChunkingCompleted> _catchupAnswerManagerHrTransactionChunkingCompleted,
      TransactionSyncManager _cptTransactionSyncManager, StoreId _epceStoreId, long _lgItf) {
    try {

      SocketAddress _afSocketAddress = this.paNamedGdbIdSocketAddressServiceWrapper.getSocketAddress(
          this.scActionStatusType);

      try {

        CatchupStatusType stat = _cptTransactionSyncManager
            .putrcsTransactionChunkingCompleted(_afSocketAddress,
                _catchupAnswerManagerHrTransactionChunkingCompleted, this.commandReaderFactory,
                _lgItf, this.mrpTransactionSyncWatcherProvider, this.namedDatabaseId,
                _epceStoreId).getStat();
        return this._seruStoreTransactionProcessingManagerStatusType(stat);
      } catch (

          ConnectException _connectException) {

        return io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType.STAT_TRS_ERR;
      } catch (

          Exception _exception) {

        return io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType.ERR;
      }
    } catch (

        CatchupNodeNotFoundException _catchupNodeNotFoundException) {

      return io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType.STAT_TRS_ERR;
    }
  }


  private long _faaolattForTrCa(CatchupStoreTxFacade _cnetCatchupStoreTxFacade,
      TransactionLogSyncManager _wieTransactionLogSyncManager) {

    long _lgItc = _wieTransactionLogSyncManager.getLgItl();
    return this.scActionStatusType ==
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.FINAL_TRY
        && _lgItc == -1L
        ? _cnetCatchupStoreTxFacade.faasaiOptionalLong().orElse(_lgItc) : _lgItc;
  }


  private boolean _isHapgsd(long _lgTwl) {
    return _lgTwl > this.lgTh;
  }


  private boolean _isShuctu() {
    return this.scActionStatusType
        != io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.OK;
  }


  private io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType _seruStoreTransactionProcessingManagerStatusType(
      CatchupStatusType stat) {
    if (stat == CatchupStatusType.CST_OK_STREAM_COMPLETE) {
      return io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType.OK;
    } else {

      return io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType.ERR;
    }
  }


  private void _upastForStTrCa(CatchupStoreTxFacade _cnetCatchupStoreTxFacade,
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType _rslStatusType,
      TransactionLogSyncManager _wieTransactionLogSyncManager) throws GdbStoreException {

    long _lgHc = Long.max(this.lgTh, _wieTransactionLogSyncManager.getLgItl());

    try {

      boolean _isCmltd = _cnetCatchupStoreTxFacade.isCorre(_lgHc) &&
          _rslStatusType
              == io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType.OK;
      if (!_isCmltd) {
        this.scActionStatusType = this._chcprrsStoreTransactionProcessingManagerActionStatusType(
            _lgHc, _rslStatusType);
        return;
      }

      this.scActionStatusType = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType.OK;
    } finally {
      this.lgTh = _lgHc;
    }
  }


  void putrcsForCaTrTr(TransactionSyncManager _cinTransactionSyncManager,
      CatchupStoreTxFacade _cnetCatchupStoreTxFacade,
      TransactionLogSyncManager _wieTransactionLogSyncManager)
      throws GdbStoreException {

    StoreId _epceStoreId = _cnetCatchupStoreTxFacade.getEpceStoreId();

    TCCCatchupAnswerManager TCCCatchupAnswerManager = new TCCCatchupAnswerManager(this.log,
        _wieTransactionLogSyncManager);

    long _lgItr = _cnetCatchupStoreTxFacade.sttiexi();

    do {

      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.StatusType _rslStatusType =
          this._exceStoreTransactionProcessingManagerStatusType(TCCCatchupAnswerManager,
              _cinTransactionSyncManager, _epceStoreId, _lgItr);
      this._upastForStTrCa(_cnetCatchupStoreTxFacade, _rslStatusType,
          _wieTransactionLogSyncManager);
      _lgItr = Long.max(_lgItr,
          this._faaolattForTrCa(_cnetCatchupStoreTxFacade, _wieTransactionLogSyncManager));
    }
    while (this._isShuctu());

    this._exceStoreTransactionProcessingManagerStatusType(TCCCatchupAnswerManager,
        _cinTransactionSyncManager, _epceStoreId, _lgItr);
  }


  private static enum ActionStatusType {


    OK,

    FINAL_TRY,

    STAT_GOOD;
  }


  private static enum StatusType {


    OK,

    STAT_TRS_ERR,

    ERR;
  }


  private static class NamedGdbIdSocketAddressServiceWrapper {


    private final NamedDatabaseId namedDatabaseId;


    private final SocketAddressService pacSocketAddressService;


    private NamedGdbIdSocketAddressServiceWrapper(SocketAddressService _capSocketAddressService,
        NamedDatabaseId _namedDatabaseId) {
      this.namedDatabaseId = _namedDatabaseId;
      this.pacSocketAddressService = _capSocketAddressService;
    }


    public SocketAddress getSocketAddress(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreTransactionProcessingManager.ActionStatusType _saeActionStatusType)
        throws CatchupNodeNotFoundException {
      switch (_saeActionStatusType) {
        case FINAL_TRY:
        case OK:
          return this.pacSocketAddressService.prmySocketAddress(this.namedDatabaseId);
        default:
          return this.pacSocketAddressService.seoaSocketAddress(this.namedDatabaseId);
      }
    }
  }


  private static class TCCCatchupAnswerManager extends
      CatchupAnswerManager<TransactionChunkingCompleted> {


    private final Log log;


    private final TransactionLogSyncManager wieTransactionLogSyncManager;


    TCCCatchupAnswerManager(Log _log, TransactionLogSyncManager _wieTransactionLogSyncManager) {
      this.log = _log;
      this.wieTransactionLogSyncManager = _wieTransactionLogSyncManager;
    }

    @Override
    public void onccerresForCoCa(CatchupProblem _cerCatchupProblem,
        CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted) {
      _completableFutureSgaTransactionChunkingCompleted.complete(
          new TransactionChunkingCompleted(-1L, _cerCatchupProblem.getStat()));


    }

    @Override
    public void ontpurseForCoCaCa(
        CatchupIncomingTransactionReply _rsosCatchupIncomingTransactionReply,
        CatchupReplyChannelManager catchupReplyChannelManager,
        CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted) {
      this.wieTransactionLogSyncManager.ontxrcvForCa(_rsosCatchupIncomingTransactionReply);
    }

    @Override
    public void ontstfhrseForCoTr(
        CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted,
        TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
      _completableFutureSgaTransactionChunkingCompleted.complete(_rsosTransactionChunkingCompleted);
    }
  }
}
