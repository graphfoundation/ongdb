package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.Iterator;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreId;


class CatchupRemoteClusteredGdbManager {


  private final SyncRecoveryLifecycleAdapter rscSyncRecoveryLifecycleAdapter;


  private final ClusteredGdb srClusteredGdb;


  CatchupRemoteClusteredGdbManager(SyncRecoveryLifecycleAdapter _rscSyncRecoveryLifecycleAdapter,
      ClusteredGdb _srClusteredGdb) {
    this.rscSyncRecoveryLifecycleAdapter = _rscSyncRecoveryLifecycleAdapter;
    this.srClusteredGdb = _srClusteredGdb;
  }


  private boolean _isVisrifosrcyForStDaCoSt(Config _config, DatabaseLayout _databaseLayout,
      StoreId _rmtStoreId, StorageEngineFactory _storageEngineFactory) {
    return this.rscSyncRecoveryLifecycleAdapter.isCarcreseForCoDaSt(_config, _databaseLayout,
        _rmtStoreId.getStoreVersion(), _storageEngineFactory);
  }


  StoreId firersiStoreId(Config _config, DatabaseLayout _databaseLayout,
      List<SocketAddress> _listUsrasSocketAddress, Log _log, NamedDatabaseId _namedDatabaseId,
      StorageEngineFactory _storageEngineFactory) throws GdbStoreException {

    Iterator _iterator = _listUsrasSocketAddress.iterator();

    while (_iterator.hasNext()) {

      SocketAddress _usraSocketAddress = (SocketAddress) _iterator.next();

      try {

        StoreId _rmtStoreId = this.srClusteredGdb.gesridStoreId(_usraSocketAddress,
            _namedDatabaseId);
        if (this._isVisrifosrcyForStDaCoSt(_config, _databaseLayout, _rmtStoreId,
            _storageEngineFactory)) {
          return _rmtStoreId;
        }


      } catch (

          GdbStoreSyncCrlException _gdbStoreSyncCrlException) {

      }
    }

    String _strEm = _listUsrasSocketAddress.isEmpty() ? io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupRemoteClusteredGdbManager.var")
        : String
            .format(io.github.onograph.I18N.format(
                    "io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupRemoteClusteredGdbManager.format"),
                _listUsrasSocketAddress);

    throw new GdbStoreException("*** Error: eced74aa-73fc-4911-97cc-51252176d1bb");
  }
}
