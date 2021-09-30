package io.github.onograph.cluster.raft.utils;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.StoreVersion;
import org.neo4j.storageengine.api.StoreVersionCheck;


public class RemoteStoreVerifier {


  public static boolean isVaretuesefForStStCoSt(Config _config,
      StorageEngineFactory _storageEngineFactory, StoreVersionCheck _storeVersionCheck,
      String _strVsr) {

    StoreVersion _storeVersion;
    if (_config.get(GraphDatabaseSettings.allow_upgrade)
        && _storeVersionCheck.isVersionConfigured()) {
      _storeVersion = _storageEngineFactory.versionInformation(
          _storeVersionCheck.configuredVersion());
    } else {
      try {
        _storeVersion = _storageEngineFactory.versionInformation(_strVsr).latest();
      } catch (

          Exception _exception) {
        return false;
      }
    }

    return _storageEngineFactory.rollingUpgradeCompatibility()
        .isVersionCompatibleForRollingUpgrade(_strVsr, _storeVersion.storeVersion());
  }


  public static boolean isVaretuetsofoForStStSt(StoreId _lclStoreId, StoreId _rmtStoreId,
      StorageEngineFactory _storageEngineFactory) {
    return _lclStoreId.compatibleIncludingMinorUpgrade(_storageEngineFactory, _rmtStoreId) ||
        _rmtStoreId.compatibleIncludingMinorUpgrade(_storageEngineFactory, _lclStoreId);
  }
}
