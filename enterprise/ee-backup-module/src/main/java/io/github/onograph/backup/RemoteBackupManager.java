package io.github.onograph.backup;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService;
import io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl;
import io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.ClusteredGdb;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.RemoteStoreServiceManager;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SocketAddressController;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseId;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.TxMetaUtil;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.time.SystemNanoClock;


public class RemoteBackupManager {


  private final LifecycleCatchupManagerImpl fccLifecycleCatchupManagerImpl;


  private final Log log;


  private final LogProvider logProvider;


  private final Monitors monitors;


  private final ClusteredGdb rsClusteredGdb;


  public RemoteBackupManager(Config _config, FileSystemAbstraction _fFileSystemAbstraction,
      LifecycleCatchupManagerImpl _fccLifecycleCatchupManagerImpl, JobScheduler _jobScheduler,
      LogProvider _logProvider, Monitors _monitors, PageCache _pageCache,
      PageCacheTracer _pageCacheTracer, SystemNanoClock _systemNanoClock) {
    this.log = _logProvider.getLog(this.getClass());
    this.logProvider = _logProvider;
    this.fccLifecycleCatchupManagerImpl = _fccLifecycleCatchupManagerImpl;
    this.monitors = _monitors;
    this.rsClusteredGdb =
        this._crertsrClusteredGdb(_config, _fFileSystemAbstraction, _fccLifecycleCatchupManagerImpl,
            _jobScheduler, _logProvider, _pageCache,
            _pageCacheTracer, _systemNanoClock);
  }


  private Monitors _cramirMonitors(GdbStoreTransferWatcher _mobGdbStoreTransferWatcher) {

    Monitors _monitors = new Monitors(this.monitors, this.logProvider);
    _monitors.addMonitorListener(_mobGdbStoreTransferWatcher);
    return _monitors;
  }


  private ClusteredGdb _crertsrClusteredGdb(Config _config,
      FileSystemAbstraction _fFileSystemAbstraction,
      LifecycleCatchupManagerImpl _fccLifecycleCatchupManagerImpl, JobScheduler _jobScheduler,
      LogProvider _logProvider, PageCache _pageCache, PageCacheTracer _pageCacheTracer,
      SystemNanoClock _systemNanoClock) {

    SocketAddressController gSocketAddressController = new SocketAddressController();

    TransactionSyncManager _cptTransactionSyncManager = new TransactionSyncManager(
        _fccLifecycleCatchupManagerImpl, _logProvider);

    Duration _icsmDuration = _config.get(SettingsDeclarationClusterImpl.settingStcareetDuration);

    RemoteStoreServiceManager _ccsRemoteStoreServiceManager =
        new RemoteStoreServiceManager(
            new StoreService(_fccLifecycleCatchupManagerImpl, _logProvider), _systemNanoClock,
            gSocketAddressController,
            _icsmDuration, _jobScheduler, _logProvider);

    TransactionLogSyncManagerBuilder _fltTransactionLogSyncManagerBuilder =
        new TransactionLogSyncManagerBuilder(_fFileSystemAbstraction, _logProvider,
            EmptyMemoryTracker.INSTANCE, _pageCache, _pageCacheTracer);
    return new ClusteredGdb(
        null, _config, _cptTransactionSyncManager, _fFileSystemAbstraction,
        _fltTransactionLogSyncManagerBuilder,
        new TxMetaUtil(_config, _fFileSystemAbstraction, _pageCache), _logProvider, _pageCache,
        _pageCacheTracer, _ccsRemoteStoreServiceManager);
  }


  private NamedDatabaseId _gedasidNamedDatabaseId(final String gdbName,
      SocketAddress _socketAddress) throws Exception {

    try {

      NamedDatabaseId _namedDatabaseId = this.fccLifecycleCatchupManagerImpl.geceCatchupManagerService(
              this.log, _socketAddress)
          .vCatchupManagerServiceNeedsV4Handler((client) ->
          {
            return client.gedasidCatchupManagerServiceCatchupRequest(
                gdbName);
          })
          .vCatchupManagerServiceNeedsV5Handler((client) ->
          {
            return client
                .gedasidCatchupManagerServiceCatchupRequest(
                    gdbName);
          })
          .vCatchupManagerServiceResponseRequestAble((client) ->
          {
            return client
                .gedasidCatchupManagerServiceCatchupRequest(
                    gdbName);
          })
          .catchupAnswerServiceHandlersVRESULT(
              new CatchupAnswerManager<NamedDatabaseId>() {
                @Override
                public void ongdairnForCoGd(
                    CompletableFuture<NamedDatabaseId> _completableFutureSgaNamedDatabaseId,
                    GdbId _rsosGdbId) {
                  _completableFutureSgaNamedDatabaseId.complete(
                      DatabaseIdFactory.from(gdbName,
                          _rsosGdbId.getRDatabaseId()
                              .uuid()));
                }
              }).reut();

      return _namedDatabaseId;
    } catch (

        Exception _exception) {

      throw new GdbIsoException(_exception, "*** Error: 349f6045-cbb1-44e7-bbc2-6f56b338b692");
    }
  }


  private StoreId _gesridStoreId(String gdbName, NamedDatabaseId _namedDatabaseId,
      SocketAddress _socketAddress) throws GdbStoreSyncCrlException {

    try {

      StoreId _rmtStoreId = this.fccLifecycleCatchupManagerImpl.geceCatchupManagerService(this.log,
              _socketAddress)
          .vCatchupManagerServiceNeedsV4Handler((client) ->
          {
            return client.gesridCatchupManagerServiceCatchupRequest(
                _namedDatabaseId);
          })
          .vCatchupManagerServiceNeedsV5Handler((client) ->
          {
            return client
                .gesridCatchupManagerServiceCatchupRequest(
                    _namedDatabaseId);
          })
          .vCatchupManagerServiceResponseRequestAble((client) ->
          {
            return client.gesridCatchupManagerServiceCatchupRequest(
                _namedDatabaseId);
          })
          .catchupAnswerServiceHandlersVRESULT(new CatchupAnswerManager<StoreId>() {
            @Override
            public void ongsirpForCoSt(CompletableFuture<StoreId> _completableFutureSgaStoreId,
                StoreDatabaseId _rsosStoreDatabaseId) {
              _completableFutureSgaStoreId.complete(_rsosStoreDatabaseId.getStoreId());
            }
          }).reut();

      return _rmtStoreId;
    } catch (

        Exception _exception) {

      throw new GdbStoreSyncCrlException(_exception,
          "*** Error: d78f51e3-e50b-4bdc-9c15-4f5381628e22");
    }
  }


  public List<String> doomtdaList(String gdbName, AuthMetaOptions _miAuthMetaOptions,
      SocketAddress _socketAddress) {

    List<String> _listDmString = List.of();

    try {
      _listDmString = this.fccLifecycleCatchupManagerImpl.geceCatchupManagerService(this.log,
              _socketAddress)
          .vCatchupManagerServiceNeedsV4Handler((client) ->
          {
            return client.gematCatchupManagerServiceCatchupRequest(
                gdbName,
                _miAuthMetaOptions
                    .name());
          }).vCatchupManagerServiceNeedsV5Handler((client) ->
          {
            return client.gematCatchupManagerServiceCatchupRequest(
                gdbName,
                _miAuthMetaOptions
                    .name());
          })
          .vCatchupManagerServiceResponseRequestAble((client) ->
          {
            return client.gematCatchupManagerServiceCatchupRequest(
                gdbName,
                _miAuthMetaOptions.name());
          })
          .catchupAnswerServiceHandlersVRESULT(new CatchupAnswerManager<AuthMeta>() {
            @Override
            public void ongmarseForCoAu(AuthMeta _rsosAuthMeta,
                CompletableFuture<AuthMeta> _completableFutureSgaAuthMeta) {
              _completableFutureSgaAuthMeta.complete(_rsosAuthMeta);
            }
          }).reut().getListCmadString();
    } catch (

        Exception _exception) {

    }

    return _listDmString;
  }


  public void fulsocyForBaDaGd(DatabaseLayout _databaseLayout,
      BackupRemoteMetaDTO _infBackupRemoteMetaDTO,
      GdbStoreTransferWatcher _mobGdbStoreTransferWatcher) throws GdbStoreException {

    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceBasicImpl _paSocketAddressServiceBasicImpl =
        new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceBasicImpl(
            _infBackupRemoteMetaDTO.getRaSocketAddress());
    this.rsClusteredGdb.copForSoStDaNaMoSt(_infBackupRemoteMetaDTO.getRmtStoreId(), _databaseLayout,
        this._cramirMonitors(_mobGdbStoreTransferWatcher),
        _infBackupRemoteMetaDTO.getNamedDatabaseId(), _paSocketAddressServiceBasicImpl);
  }


  public Set<NamedDatabaseId> gealdbnaSet(SocketAddress _socketAddress) throws Exception {
    return this.fccLifecycleCatchupManagerImpl.geceCatchupManagerService(this.log, _socketAddress)
        .vCatchupManagerServiceNeedsV4Handler(
            CatchupManagerService.CatchupServiceV300::gealdbidCatchupManagerServiceCatchupRequest)
        .vCatchupManagerServiceNeedsV5Handler(
            CatchupManagerService.CatchupServiceV400::gealdbidCatchupManagerServiceCatchupRequest)
        .vCatchupManagerServiceResponseRequestAble(
            CatchupManagerService.CatchupServiceV400::gealdbidCatchupManagerServiceCatchupRequest)
        .catchupAnswerServiceHandlersVRESULT(new CatchupAnswerManager<AllGdbIds>() {
          @Override
          public void ongadteiresForCoAl(AllGdbIds _rsosAllGdbIds,
              CompletableFuture<AllGdbIds> _completableFutureSgaAllGdbIds) {
            _completableFutureSgaAllGdbIds.complete(_rsosAllGdbIds);
          }
        }).reut().getSetDiNamedDatabaseId();
  }


  public BackupRemoteMetaDTO prrtbaBackupRemoteMetaDTO(String gdbName, SocketAddress _socketAddress)
      throws Exception {

    NamedDatabaseId _namedDatabaseId = this._gedasidNamedDatabaseId(gdbName, _socketAddress);

    StoreId _rmtStoreId = this._gesridStoreId(gdbName, _namedDatabaseId, _socketAddress);
    return new BackupRemoteMetaDTO(_socketAddress, _namedDatabaseId, _rmtStoreId);
  }


  public void upasrForBaDaGd(DatabaseLayout _databaseLayout,
      BackupRemoteMetaDTO _infBackupRemoteMetaDTO,
      GdbStoreTransferWatcher _mobGdbStoreTransferWatcher)
      throws GdbStoreException, IOException {

    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceBasicImpl _pacSocketAddressServiceBasicImpl =
        new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceBasicImpl(
            _infBackupRemoteMetaDTO.getRaSocketAddress());

    Monitors _monitors = this._cramirMonitors(_mobGdbStoreTransferWatcher);
    this.rsClusteredGdb.trccnupForSoStDaNaMoSt(_databaseLayout,
        _infBackupRemoteMetaDTO.getRmtStoreId(), true, _monitors,
        _infBackupRemoteMetaDTO.getNamedDatabaseId(), _pacSocketAddressServiceBasicImpl);
  }
}
