package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Duration;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StoreId;


public class RemoteStoreServiceManager {


  private final StoreService ccsStoreService;


  private final Clock clock;


  private final SocketAddressController gSocketAddressController;


  private final JobScheduler jobScheduler;


  private final LogProvider logProvider;


  private final Duration miDuration;


  public RemoteStoreServiceManager(StoreService _ccsStoreService, Clock _clock,
      SocketAddressController gSocketAddressController, Duration _imDuration,
      JobScheduler _jobScheduler, LogProvider _logProvider) {
    this.ccsStoreService = _ccsStoreService;
    this.clock = _clock;
    this.gSocketAddressController = gSocketAddressController;
    this.jobScheduler = _jobScheduler;
    this.logProvider = _logProvider;
    this.miDuration = _imDuration;
  }


  private SetupGdbStoreSyncReply _prrsrcySetupGdbStoreSyncReply(StoreId _epceStoreId,
      SocketAddress _fSocketAddress, NamedDatabaseId _namedDatabaseId,
      StoreResourceWriterService _sfsStoreResourceWriterService)
      throws GdbStoreException {

    SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply;
    try {
      _rcspSetupGdbStoreSyncReply =
          this.ccsStoreService.prrsrcySetupGdbStoreSyncReply(_epceStoreId, _fSocketAddress,
              _namedDatabaseId, _sfsStoreResourceWriterService);
    } catch (

        Exception _exception) {
      throw new GdbStoreException(_exception);
    }

    if (_rcspSetupGdbStoreSyncReply.getStat() !=
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK) {

      throw new GdbStoreException("*** Error: be919134-8ee8-492b-aeaa-2a5c0adbfb30");
    } else {
      return _rcspSetupGdbStoreSyncReply;
    }
  }


  public CatchupMDTxsWrapper coysofeCatchupMDTxsWrapper(StoreId _epceStoreId,
      GdbStoreTransferWatcher _mccsGdbStoreTransferWatcher, NamedDatabaseId _namedDatabaseId,
      SocketAddressService _pacSocketAddressService, Path _pdPath,
      StoreResourceWriterService _psfsStoreResourceWriterService, ExitMeta _tcExitMeta)
      throws GdbStoreException {
    try {

      DatabaseLogProvider _databaseLogProvider = new DatabaseLogProvider(_namedDatabaseId,
          this.logProvider);

      SocketAddress _afSocketAddress = _pacSocketAddressService.prmySocketAddress(_namedDatabaseId);

      SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply =
          this._prrsrcySetupGdbStoreSyncReply(_epceStoreId, _afSocketAddress, _namedDatabaseId,
              _psfsStoreResourceWriterService);

      io.github.onograph.cluster.raft.module.cuprot.scmeta.RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor =
          new io.github.onograph.cluster.raft.module.cuprot.scmeta.RemoteStoreServiceManager.TxIdProcessor(
              _rcspSetupGdbStoreSyncReply);

      CatchupStoreCopyRunner catchupStoreCopyRunner =
          new CatchupStoreCopyRunner(this.ccsStoreService, this.clock, _epceStoreId,
              _hitTxIdProcessor,
              this.miDuration, this.jobScheduler, _databaseLogProvider,
              _mccsGdbStoreTransferWatcher, _namedDatabaseId,
              _pacSocketAddressService, _pdPath,
              _rcspSetupGdbStoreSyncReply, _psfsStoreResourceWriterService,
              this.gSocketAddressController, _tcExitMeta);
      catchupStoreCopyRunner.ruj();
      return _hitTxIdProcessor.rertatraCatchupMDTxsWrapper();
    } catch (

        GdbStoreException _gdbStoreException) {
      throw _gdbStoreException;
    } catch (

        Exception _exception) {
      throw new GdbStoreException(_exception);
    }
  }


  public StoreId fecsteiStoreId(SocketAddress _afSocketAddress, NamedDatabaseId _namedDatabaseId)
      throws GdbStoreSyncCrlException {
    try {
      return this.ccsStoreService.fecsteiStoreId(_afSocketAddress, _namedDatabaseId);
    } catch (

        Exception _exception) {
      throw new GdbStoreSyncCrlException(_exception);
    }
  }


  static class TxIdProcessor {


    private static final long MIN_CMTX_TXS_UID = 2L;


    private final long lgIti;


    private long lgItrh = -1L;

    TxIdProcessor(SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply) {
      this.lgIti = _rcspSetupGdbStoreSyncReply.getLgItpcl();
    }


    synchronized void hadForSt(StoreSyncCompleted _rsosStoreSyncCompleted) {
      if (_rsosStoreSyncCompleted.getStat() ==
          io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.OK) {
        this.lgItrh = Long.max(this.lgItrh, _rsosStoreSyncCompleted.getLgTcl());
      }
    }


    synchronized CatchupMDTxsWrapper rertatraCatchupMDTxsWrapper() {
      return this.lgItrh < 2L ? CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(
          Long.max(this.lgIti, 2L))
          : CatchupMDTxsWrapper.reueraeCatchupMDTxsWrapper(this.lgItrh, this.lgIti);
    }
  }
}
