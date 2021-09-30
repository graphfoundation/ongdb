package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.net.ConnectException;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.storageengine.api.StoreId;


class SockerAddressRunner implements Runnable {


  private final AtomicReference<Instant> atomicReferencePlInstant;


  private final BlockingQueue<Path> blockingQueueDtfPath;


  private final Runnable cdfRunnable;


  private final Clock clock;


  private final StoreId epceStoreId;


  private final io.github.onograph.cluster.raft.module.cuprot.scmeta.RemoteStoreServiceManager.TxIdProcessor hitTxIdProcessor;


  private final long lgItpcl;


  private final Log log;


  private final GdbStoreTransferWatcher mntrGdbStoreTransferWatcher;


  private final NamedDatabaseId namedDatabaseId;


  private final Path pdPath;


  private final StoreService sccStoreService;


  private final StoreResourceWriterService sfspStoreResourceWriterService;


  private final SocketAddress socketAddress;


  SockerAddressRunner(AtomicReference<Instant> _atomicReferencePlInstant,
      BlockingQueue<Path> _blockingQueueDtfPath, StoreService _ccsStoreService,
      Runnable _cdfRunnable, Clock _clock, StoreId _epceStoreId,
      io.github.onograph.cluster.raft.module.cuprot.scmeta.RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor,
      long _lgItpcl, Log _log, GdbStoreTransferWatcher _mntrGdbStoreTransferWatcher,
      NamedDatabaseId _namedDatabaseId, Path _pdPath,
      StoreResourceWriterService _psfsStoreResourceWriterService, SocketAddress _socketAddress) {
    this.atomicReferencePlInstant = _atomicReferencePlInstant;
    this.blockingQueueDtfPath = _blockingQueueDtfPath;
    this.cdfRunnable = _cdfRunnable;
    this.clock = _clock;
    this.epceStoreId = _epceStoreId;
    this.hitTxIdProcessor = _hitTxIdProcessor;
    this.lgItpcl = _lgItpcl;
    this.log = _log;
    this.mntrGdbStoreTransferWatcher = _mntrGdbStoreTransferWatcher;
    this.namedDatabaseId = _namedDatabaseId;
    this.pdPath = _pdPath;
    this.sccStoreService = _ccsStoreService;
    this.sfspStoreResourceWriterService = _psfsStoreResourceWriterService;
    this.socketAddress = _socketAddress;
  }


  private boolean _isDoosoflForPa(Path _path) {
    try {

      String _strSf = this.pdPath.resolve(_path.getFileName()).toString();
      this.mntrGdbStoreTransferWatcher.strvstfiForSt(_strSf);

      StoreSyncCompleted _rsosStoreSyncCompleted = this.sccStoreService
          .doosoflStoreSyncCompleted(this.epceStoreId, this.socketAddress, this.lgItpcl,
              this.namedDatabaseId, _path,
              this.sfspStoreResourceWriterService,
              this::_preclk);
      if (this.isRensForStPa(_path, _rsosStoreSyncCompleted)) {
        this.mntrGdbStoreTransferWatcher.fihrfForSt(_strSf);
        this.hitTxIdProcessor.hadForSt(_rsosStoreSyncCompleted);
        return true;
      }

      return false;
    } catch (

        ConnectException _connectException) {

    } catch (

        Exception _exception) {

    }

    return false;
  }


  private void _preclk() {
    this.atomicReferencePlInstant.set(this.clock.instant());
  }


  boolean isRensForStPa(Path _path, StoreSyncCompleted _rsosStoreSyncCompleted) {
    switch (_rsosStoreSyncCompleted.getStat()) {
      case OK:

        return true;
      case SYNC_NO_CU_ERR:
      case SYNC_GENERAL_ERR:
      case SYNC_SGUID_NOT_MATCHING_ERR:
      case SYNC_BAD_GDB_ERR:

        return false;
      default:

        return false;
    }
  }

  @Override
  public void run() {
    while (true) {

      Path _path = this.blockingQueueDtfPath.poll();
      if (_path == null) {
        return;
      }

      if (!this._isDoosoflForPa(_path)) {
        this.blockingQueueDtfPath.add(_path);
        return;
      }

      this.cdfRunnable.run();
    }
  }
}
