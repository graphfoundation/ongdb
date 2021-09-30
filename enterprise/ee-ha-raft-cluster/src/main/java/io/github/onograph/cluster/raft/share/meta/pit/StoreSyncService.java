package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbFailedToStopException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncFacade;
import io.github.onograph.cluster.raft.utils.RemoteStoreVerifier;
import java.io.IOException;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StoreId;


public class StoreSyncService {


  private final CatchupClusteredGdbManageService catchupClusteredGdbManageService;


  private final Log log;

  public StoreSyncService(CatchupClusteredGdbManageService catchupClusteredGdbManageService,
      LogProvider _logProvider) {
    this.catchupClusteredGdbManageService = catchupClusteredGdbManageService;
    this.log = _logProvider.getLog(this.getClass());
  }


  private boolean _isTrccpForStSoStStSo(StoreSyncEnvironment _cnetStoreSyncEnvironment,
      SocketAddressService _paSocketAddressService, StoreSyncFacade _pcsStoreSyncFacade,
      StoreId _rmtStoreId, SocketAddress _socketAddress)
      throws IOException, GdbFailedToStopException, SyncException {
    try {

      StoreId _lclStoreId = _cnetStoreSyncEnvironment.stridStoreId();
      if (!RemoteStoreVerifier.isVaretuetsofoForStStSt(_lclStoreId, _rmtStoreId,
          _cnetStoreSyncEnvironment.getKreDatabase().getStorageEngineFactory())) {

        throw new SyncException(SyncException.FailureType.FATAL_ERR,
            "*** Error: e0d81673-9840-4f12-a122-c092abc36e9c");
      } else {

        _pcsStoreSyncFacade.cacpsoForSoSt(_rmtStoreId, _paSocketAddressService);
        _pcsStoreSyncFacade.reorso();

        return true;
      }
    } catch (

        GdbStoreException _gdbStoreException) {

      return false;
    }
  }


  void brnuptdeForStSoSo(SocketAddress _apSocketAddress,
      StoreSyncEnvironment _cnetStoreSyncEnvironment, SocketAddressService _paSocketAddressService)
      throws SyncException {
    try {

      StoreSyncFacade _pcsStoreSyncFacade = this.catchupClusteredGdbManageService.stcprsStoreSyncFacade(
          _cnetStoreSyncEnvironment);

      StoreId _rmtStoreId = _pcsStoreSyncFacade.gesridStoreId(_apSocketAddress);
      if (_cnetStoreSyncEnvironment.isHasr()) {
        if (this._isTrccpForStSoStStSo(_cnetStoreSyncEnvironment, _paSocketAddressService,
            _pcsStoreSyncFacade, _rmtStoreId, _apSocketAddress)) {
          return;
        }

        _cnetStoreSyncEnvironment.dee();
      }

      _pcsStoreSyncFacade.recwhsefForSo(_paSocketAddressService);


    } catch (

        IOException _iOException) {

      throw new SyncException(_iOException, SyncException.FailureType.FATAL_ERR,
          "*** Error:  f6c860c8-c31c-40b9-aa65-904202a6b59c");
    } catch (

        GdbFailedToStopException _gdbFailedToStopException) {

      throw new SyncException(
          _gdbFailedToStopException, SyncException.FailureType.FT_ERR,
          "*** Error:  00a28d51-ad28-46ee-87cb-d1f0bd2b4b34");
    } catch (

        GdbStoreException | GdbStoreSyncCrlException _exception) {

      throw new SyncException(_exception, SyncException.FailureType.CRET_ERR,
          "*** Error:  cbc16905-be97-42d5-b393-3f83ba5999ff");
    }
  }
}
