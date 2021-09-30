package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManager;
import io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import java.io.IOException;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.internal.helpers.collection.LongRange;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.logging.internal.PrefixedLog;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Monitors;
import org.neo4j.monitoring.PanicEventGenerator;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreId;


public class ClusteredGdb {


  private static final String DST_STAX_RDXR_LT = io.github.onograph.TokenConstants.STORE_STATE_READER;


  private final CompositeDatabaseAvailabilityGuard compositeDatabaseAvailabilityGuard;


  private final Config config;


  private final TransactionSyncManager cptTransactionSyncManager;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final TransactionLogSyncManagerBuilder fltTransactionLogSyncManagerBuilder;


  private final TxMetaUtil hscTxMetaUtil;


  private final LogProvider logProvider;


  private final PageCache pageCache;


  private final PageCacheTracer pageCacheTracer;


  private final RemoteStoreServiceManager remoteStoreServiceManager;


  public ClusteredGdb(CompositeDatabaseAvailabilityGuard _compositeDatabaseAvailabilityGuard,
      Config _config, TransactionSyncManager _cptTransactionSyncManager,
      FileSystemAbstraction _fFileSystemAbstraction,
      TransactionLogSyncManagerBuilder _fltTransactionLogSyncManagerBuilder,
      TxMetaUtil _hscTxMetaUtil, LogProvider _logProvider, PageCache _pageCache,
      PageCacheTracer _pageCacheTracer, RemoteStoreServiceManager remoteStoreServiceManager) {
    this.compositeDatabaseAvailabilityGuard = _compositeDatabaseAvailabilityGuard;
    this.config = _config;
    this.cptTransactionSyncManager = _cptTransactionSyncManager;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.fltTransactionLogSyncManagerBuilder = _fltTransactionLogSyncManagerBuilder;
    this.hscTxMetaUtil = _hscTxMetaUtil;
    this.logProvider = _logProvider;
    this.pageCache = _pageCache;
    this.pageCacheTracer = _pageCacheTracer;
    this.remoteStoreServiceManager = remoteStoreServiceManager;
  }


  private TxMeta _gecmstTxMeta(DatabaseLayout _databaseLayout,
      StorageEngineFactory _storageEngineFactory) throws IOException {

    CursorContext _cursorContext =
        new CursorContext(this.pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.STORE_STATE_READER));

    TxMeta _txMeta;
    try {
      _txMeta = this.hscTxMetaUtil.gesrsteTxMeta(_cursorContext, _databaseLayout,
          _storageEngineFactory);
    } catch (

        Throwable _throwable) {
      try {
        _cursorContext.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _cursorContext.close();
    return _txMeta;
  }


  private PrefixedLog _gedasloPrefixedLog(NamedDatabaseId _namedDatabaseId) {
    return (new DatabaseLogProvider(_namedDatabaseId, this.logProvider)).getLog(this.getClass());
  }


  private ExitMeta _getrtcoiExitMeta() {
    return this.compositeDatabaseAvailabilityGuard == null ? ExitMeta.CONDI_EXIT_META
        : new ExitMetaNotRunningImpl(this.compositeDatabaseAvailabilityGuard);
  }


  private StorageEngineFactory _losteenftStorageEngineFactory(DatabaseLayout _ldDatabaseLayout,
      StorageEngineFactory _storageEngineFactory) {
    return _storageEngineFactory != null ? _storageEngineFactory
        : StorageEngineFactory.selectStorageEngine(this.fFileSystemAbstraction, _ldDatabaseLayout,
            this.pageCache,
            this.config);
  }


  private void _putrcsForSoDaCaNaMoSt(CatchupStoreTxFacade _cnetCatchupStoreTxFacade,
      DatabaseLayout _databaseLayout, boolean _isCsf, boolean _isDsiltk, Monitors _monitors,
      NamedDatabaseId _namedDatabaseId, SocketAddressService _pacSocketAddressService,
      StorageEngineFactory _storageEngineFactory) throws GdbStoreException {

    GdbStoreTransferWatcher _mccsGdbStoreTransferWatcher = _monitors.newMonitor(
        GdbStoreTransferWatcher.class, new String[0]);
    _mccsGdbStoreTransferWatcher.strvtrcs(_cnetCatchupStoreTxFacade.sttiexi());

    DatabaseLogProvider _databaseLogProvider = new DatabaseLogProvider(_namedDatabaseId,
        this.logProvider);

    try {

      TransactionLogSyncManager _wieTransactionLogSyncManager = this.fltTransactionLogSyncManagerBuilder
          .craTransactionLogSyncManager(this.config, new DatabaseHealth(PanicEventGenerator.NO_OP,
                  _databaseLogProvider.getLog(this.getClass())),
              _databaseLayout, _isCsf, _isDsiltk,
              _storageEngineFactory, this._vaiatraLongRange(_cnetCatchupStoreTxFacade));

      try {

        StoreTransactionProcessingManager _tpStoreTransactionProcessingManager =
            StoreTransactionProcessingManager.cratpueStoreTransactionProcessingManager(
                _storageEngineFactory.commandReaderFactory(), this.config,
                _databaseLogProvider, _monitors, _namedDatabaseId,
                _pacSocketAddressService);
        _tpStoreTransactionProcessingManager.putrcsForCaTrTr(this.cptTransactionSyncManager,
            _cnetCatchupStoreTxFacade,
            _wieTransactionLogSyncManager);
        _mccsGdbStoreTransferWatcher.fihritan(_wieTransactionLogSyncManager.getLgItl());
      } catch (

          Throwable _throwable) {
        if (_wieTransactionLogSyncManager != null) {
          try {
            _wieTransactionLogSyncManager.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_wieTransactionLogSyncManager != null) {
        _wieTransactionLogSyncManager.close();
      }
    } catch (

        IOException _iOException) {
      throw new GdbStoreException(_iOException);
    }
  }


  private LongRange _vaiatraLongRange(CatchupStoreTxFacade _cnetCatchupStoreTxFacade) {
    return LongRange.range(_cnetCatchupStoreTxFacade.sttiexi() + 1L,
        _cnetCatchupStoreTxFacade.faasaiOptionalLong().orElse(_cnetCatchupStoreTxFacade.sttiexi())
            + 1L);
  }


  public void copForSoStDaNaMoSt(StoreId _epceStoreId, DatabaseLayout _ldDatabaseLayout,
      Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      SocketAddressService _paSocketAddressService)
      throws GdbStoreException {
    this.copForSoStDaNaMoSt(_epceStoreId, _ldDatabaseLayout, _monitors, _namedDatabaseId,
        _paSocketAddressService, null);
  }


  public void copForSoStDaNaMoSt(StoreId _epceStoreId, DatabaseLayout _ldDatabaseLayout,
      Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      SocketAddressService _paSocketAddressService, StorageEngineFactory _storageEngineFactory)
      throws GdbStoreException {

    GdbStoreTransferWatcher _mccsGdbStoreTransferWatcher = _monitors.newMonitor(
        GdbStoreTransferWatcher.class, new String[0]);

    PrefixedLog _ldPrefixedLog = this._gedasloPrefixedLog(_namedDatabaseId);

    StoreResourceWriterServiceFileSystemImpl _pdtsStoreResourceWriterServiceFileSystemImpl =
        new StoreResourceWriterServiceFileSystemImpl(this.fFileSystemAbstraction, _monitors,
            _ldDatabaseLayout.databaseDirectory());

    CatchupMDTxsWrapper _trCatchupMDTxsWrapper = this.remoteStoreServiceManager
        .coysofeCatchupMDTxsWrapper(_epceStoreId, _mccsGdbStoreTransferWatcher, _namedDatabaseId,
            _paSocketAddressService,
            _ldDatabaseLayout.databaseDirectory(),
            _pdtsStoreResourceWriterServiceFileSystemImpl, this._getrtcoiExitMeta());

    CatchupStoreTxFacade _cnetCatchupStoreTxFacade = CatchupStoreTxFacade.crecefosrcyCatchupStoreTxFacade(
        _epceStoreId, _trCatchupMDTxsWrapper);
    _storageEngineFactory = this._losteenftStorageEngineFactory(_ldDatabaseLayout,
        _storageEngineFactory);
    this._putrcsForSoDaCaNaMoSt(_cnetCatchupStoreTxFacade, _ldDatabaseLayout, true, true, _monitors,
        _namedDatabaseId, _paSocketAddressService,
        _storageEngineFactory);
  }


  public StoreId gesridStoreId(SocketAddress _frSocketAddress, NamedDatabaseId _namedDatabaseId)
      throws GdbStoreSyncCrlException {
    return this.remoteStoreServiceManager.fecsteiStoreId(_frSocketAddress, _namedDatabaseId);
  }


  public void trccnupForSoStDaNaMoSt(DatabaseLayout _databaseLayout, StoreId _epceStoreId,
      boolean _isDsiltk, Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      SocketAddressService _pacSocketAddressService)
      throws GdbStoreException, IOException {

    StorageEngineFactory _storageEngineFactory = this._losteenftStorageEngineFactory(
        _databaseLayout, null);
    this.trccnupForSoStDaNaMoSt(_databaseLayout, _epceStoreId, _isDsiltk, _monitors,
        _namedDatabaseId, _pacSocketAddressService, _storageEngineFactory);
  }


  public void trccnupForSoStDaNaMoSt(DatabaseLayout _databaseLayout, StoreId _epceStoreId,
      boolean _isDsiltk, Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      SocketAddressService _pacSocketAddressService, StorageEngineFactory _storageEngineFactory)
      throws GdbStoreException, IOException {

    TxMeta _scTxMeta = this._gecmstTxMeta(_databaseLayout, _storageEngineFactory);

    PrefixedLog _ldPrefixedLog = this._gedasloPrefixedLog(_namedDatabaseId);

    CatchupStoreTxFacade _crptCatchupStoreTxFacade = CatchupStoreTxFacade.crecefoccuCatchupStoreTxFacade(
        _scTxMeta, _epceStoreId);
    this._putrcsForSoDaCaNaMoSt(_crptCatchupStoreTxFacade, _databaseLayout, false, _isDsiltk,
        _monitors, _namedDatabaseId, _pacSocketAddressService,
        _storageEngineFactory);
  }
}
