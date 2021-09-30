package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DataSyncManager {


  private final CoreGdbSyncManager coreGdbSyncManager;


  private final StoreSyncService dsStoreSyncService;

  public DataSyncManager(CoreGdbSyncManager coreGdbSyncManager,
      StoreSyncService _dsStoreSyncService) {
    this.coreGdbSyncManager = coreGdbSyncManager;
    this.dsStoreSyncService = _dsStoreSyncService;
  }


  private SocketAddress _lokpmySocketAddress(NamedDatabaseId _namedDatabaseId,
      SocketAddressService _paSocketAddressService) throws SyncException {
    try {
      return _paSocketAddressService.prmySocketAddress(_namedDatabaseId);
    } catch (

        CatchupNodeNotFoundException _catchupNodeNotFoundException) {

      throw new SyncException(
          SyncException.FailureType.CRET_ERR, "*** Error: 4b4613f4-9448-4799-80bc-f93661fc6b03");
    }
  }


  SnapshotData doosatastSnapshotData(StoreSyncEnvironment _cnetStoreSyncEnvironment,
      SocketAddressService _paSocketAddressService) throws SyncException {

    SocketAddress _apSocketAddress = this._lokpmySocketAddress(
        _cnetStoreSyncEnvironment.daasidNamedDatabaseId(), _paSocketAddressService);

    SnapshotData _scSnapshotData = this.coreGdbSyncManager.gecrspSnapshotData(
        _cnetStoreSyncEnvironment.daasidNamedDatabaseId(), _apSocketAddress);
    this.dsStoreSyncService.brnuptdeForStSoSo(_apSocketAddress, _cnetStoreSyncEnvironment,
        _paSocketAddressService);
    return _scSnapshotData;
  }
}
