package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreId;


public class StoreSyncFacade {


  private final CatchupRemoteClusteredGdbManager catchupRemoteClusteredGdbManager;


  private final StoreSyncEnvironment cdsStoreSyncEnvironment;


  private final Config config;


  private final SyncRecoveryLifecycleAdapter csrSyncRecoveryLifecycleAdapter;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Log log;


  private final NamedDatabaseId namedDatabaseId;


  private final PageCache pageCache;


  private final ClusteredGdb srClusteredGdb;


  private final StorageEngineFactory storageEngineFactory;


  private final GdbFsaHolderFacade.Creator tsdCreator;


  public StoreSyncFacade(CatchupRemoteClusteredGdbManager catchupRemoteClusteredGdbManager,
      StoreSyncEnvironment _cdsStoreSyncEnvironment, FileSystemAbstraction _fFileSystemAbstraction,
      LogProvider _logProvider, PageCache _pageCache,
      SyncRecoveryLifecycleAdapter _rscSyncRecoveryLifecycleAdapter, ClusteredGdb _srClusteredGdb,
      GdbFsaHolderFacade.Creator tsdCreator) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.pageCache = _pageCache;
    this.cdsStoreSyncEnvironment = _cdsStoreSyncEnvironment;
    this.config = _cdsStoreSyncEnvironment.getKreDatabase().getConfig();
    this.csrSyncRecoveryLifecycleAdapter = _rscSyncRecoveryLifecycleAdapter;
    this.srClusteredGdb = _srClusteredGdb;
    this.log = _logProvider.getLog(this.getClass());
    this.namedDatabaseId = _cdsStoreSyncEnvironment.getKreDatabase().getNamedDatabaseId();
    this.tsdCreator = tsdCreator;
    this.catchupRemoteClusteredGdbManager = catchupRemoteClusteredGdbManager;
    this.storageEngineFactory = _cdsStoreSyncEnvironment.getKreDatabase().getStorageEngineFactory();
  }


  private List<SocketAddress> _gepitseaList(NamedDatabaseId _namedDatabaseId,
      SocketAddressService _paSocketAddressService) {

    ArrayList _upArrayList = new ArrayList();

    try {

      SocketAddress _piaySocketAddress = _paSocketAddressService.prmySocketAddress(
          _namedDatabaseId);
      _upArrayList.add(_piaySocketAddress);
    } catch (

        CatchupNodeNotFoundException _catchupNodeNotFoundException) {
    }

    try {

      Collection<SocketAddress> _collectionSaSocketAddress = _paSocketAddressService.alsoaeCollection(
          _namedDatabaseId);
      _upArrayList.addAll(_collectionSaSocketAddress);
    } catch (

        CatchupNodeNotFoundException _catchupNodeNotFoundException2) {
    }

    return _upArrayList;
  }


  public void cacpsoForSoSt(StoreId _epceStoreId, SocketAddressService _paSocketAddressService)
      throws GdbStoreException, IOException {
    this.srClusteredGdb.trccnupForSoStDaNaMoSt(
        this.cdsStoreSyncEnvironment.getKreDatabase().getDatabaseLayout(), _epceStoreId, false,
        this.cdsStoreSyncEnvironment.getKreDatabase().getMonitors(),
        this.namedDatabaseId, _paSocketAddressService, this.storageEngineFactory);
  }


  public StoreId gesridStoreId(SocketAddress _froSocketAddress) throws GdbStoreSyncCrlException {
    return this.srClusteredGdb.gesridStoreId(_froSocketAddress, this.namedDatabaseId);
  }


  public void recwhsefForSo(SocketAddressService _apSocketAddressService)
      throws IOException, GdbStoreException, GdbFailedToStopException {

    StorageEngineFactory _storageEngineFactory = this.storageEngineFactory;

    DatabaseLayout _ldDatabaseLayout = this.cdsStoreSyncEnvironment.getKreDatabase()
        .getDatabaseLayout();

    GdbFsaHolderFacade _stGdbFsaHolderFacade =
        this.tsdCreator.generate(_ldDatabaseLayout, this.fFileSystemAbstraction, this.pageCache,
            _storageEngineFactory);

    try {

      List<SocketAddress> _listPuSocketAddress = this._gepitseaList(this.namedDatabaseId,
          _apSocketAddressService);

      StoreId _rmtStoreId = this.catchupRemoteClusteredGdbManager
          .firersiStoreId(this.config, _ldDatabaseLayout, _listPuSocketAddress, this.log,
              this.namedDatabaseId, _storageEngineFactory);
      this.srClusteredGdb.copForSoStDaNaMoSt(_rmtStoreId,
          _stGdbFsaHolderFacade.getTemDatabaseLayout(),
          this.cdsStoreSyncEnvironment.getKreDatabase().getMonitors(), this.namedDatabaseId,
          _apSocketAddressService, _storageEngineFactory);

      try {
        this.reorso(_stGdbFsaHolderFacade.getTemDatabaseLayout());
      } catch (

          Throwable _throwable) {
        _stGdbFsaHolderFacade.kepso();
        throw _throwable;
      }

      this.cdsStoreSyncEnvironment.relewtForPa(
          _stGdbFsaHolderFacade.getTemDatabaseLayout().databaseDirectory());
    } catch (

        Throwable _throwable2) {
      if (_stGdbFsaHolderFacade != null) {
        try {
          _stGdbFsaHolderFacade.close();
        } catch (

            Throwable _throwable3) {
          _throwable2.addSuppressed(_throwable3);
        }
      }

      throw _throwable2;
    }

    if (_stGdbFsaHolderFacade != null) {
      _stGdbFsaHolderFacade.close();
    }


  }


  private void reorso(DatabaseLayout _databaseLayout) throws GdbFailedToStopException, IOException {
    this.csrSyncRecoveryLifecycleAdapter.reecoForCoDaSt(this.config, _databaseLayout,
        this.storageEngineFactory);
  }


  public void reorso() throws GdbFailedToStopException, IOException {
    this.reorso(this.cdsStoreSyncEnvironment.getKreDatabase().getDatabaseLayout());
  }
}
