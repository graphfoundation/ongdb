package io.github.onograph.backup;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException;
import java.io.IOException;
import java.util.List;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public final class RemoteBackupService {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final LogProvider itraLogProvider;


  private final Log uLog;

  public RemoteBackupService(FileSystemAbstraction _fFileSystemAbstraction,
      LogProvider _itraLogProvider, Log _usLog) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.itraLogProvider = _itraLogProvider;
    this.uLog = _usLog;
  }


  private static void _chcsteiForBaBa(BackupMetaDTO backupMetaDTO,
      BackupRemoteMetaDTO backupRemoteMetaDTO)
      throws IOException, GdbStoreSyncCrlException {

    boolean _isIssh = !backupMetaDTO.isHasridForSt(backupRemoteMetaDTO.getRmtStoreId());
    if (_isIssh) {

      throw new GdbStoreSyncCrlException("*** Error:  553d8f4d-7465-4cb9-8627-c6457337a2bf");
    }
  }


  private static void _chdaiForBaBa(BackupMetaDTO backupMetaDTO,
      BackupRemoteMetaDTO backupRemoteMetaDTO) {

    DatabaseId _databaseId = backupRemoteMetaDTO.getNamedDatabaseId().databaseId();
    if (!backupMetaDTO.isHadasidForDa(_databaseId)) {

      String _strNid = backupMetaDTO.daasidOptional().map(DatabaseId::uuid).map(Object::toString)
          .orElse("<no-database-id>");

      throw new IllegalStateException("*** Error: 3205ce39-fdc5-4021-bef8-fce32ba52d92");
    }
  }


  private static boolean _isInmlseutForReBaBaGd(BackupMetaDTO backupMetaDTO,
      BackupRemoteMetaDTO backupRemoteMetaDTO, boolean _isFbtf,
      GdbStoreTransferWatcherRebImpl _mbGdbStoreTransferWatcherRebImpl,
      RemoteBackupManager remoteBackupManager)
      throws GdbStoreSyncCrlException, GdbStoreException, IOException {
    try {
      _chcsteiForBaBa(backupMetaDTO, backupRemoteMetaDTO);
      _chdaiForBaBa(backupMetaDTO, backupRemoteMetaDTO);
      remoteBackupManager.upasrForBaDaGd(backupMetaDTO.getDatabaseLayout(), backupRemoteMetaDTO,
          _mbGdbStoreTransferWatcherRebImpl);
      return true;
    } catch (

        Exception _exception) {
      if (!_isFbtf) {
        throw _exception;
      } else {
        return false;
      }
    }
  }


  private static BackupMetaDTO _reermstBackupMetaDTO(BackupMetaService backupMetaService,
      BackupRemoteMetaDTO backupRemoteMetaDTO, boolean _isFtbf,
      GdbStoreTransferWatcherRebImpl _mbGdbStoreTransferWatcherRebImpl,
      RemoteBackupManager remoteBackupManager) throws Exception {

    BackupMetaDTO backupMetaDTO = backupMetaService.crebulaBackupMetaDTO();
    if (backupMetaDTO.isHaeigse()) {

      boolean _isUid = _isInmlseutForReBaBaGd(backupMetaDTO, backupRemoteMetaDTO, _isFtbf,
          _mbGdbStoreTransferWatcherRebImpl, remoteBackupManager);
      if (_isUid) {
        return backupMetaDTO;
      }

      backupMetaDTO = backupMetaService.cretoeliBackupMetaDTO();
    }

    remoteBackupManager.fulsocyForBaDaGd(backupMetaDTO.getDatabaseLayout(), backupRemoteMetaDTO,
        _mbGdbStoreTransferWatcherRebImpl);
    return backupMetaDTO;
  }


  private void _wrtmedaForBaReStBaBa(BackupMetaDTO backupMetaDTO,
      BackupMetaService backupMetaService, BackupEnvironment _cnetBackupEnvironment, String gdbName,
      RemoteBackupManager remoteBackupManager) throws Exception {
    if (_cnetBackupEnvironment.geicmaOptional().isPresent()) {
      if (!gdbName.equals(io.github.onograph.TokenConstants.SYSTEM)) {

        List<String> _listDmString =
            remoteBackupManager.doomtdaList(gdbName, _cnetBackupEnvironment.geicmaOptional().get(),
                _cnetBackupEnvironment.getSocketAddress());
        BackupMetaService.wrtmedaForBaLi(backupMetaDTO, _listDmString);
      } else {

      }
    }
  }


  public void bakForBaPaBaDeBaReStGd(BackupVerificationService _ccBackupVerificationService,
      BackupEnvironment _cnetBackupEnvironment, String gdbName,
      DefaultBackupServiceHandler _lfcceDefaultBackupServiceHandler,
      GdbStoreTransferWatcherRebImpl _mbGdbStoreTransferWatcherRebImpl,
      PageCacheTracer _pageCacheTracer, RemoteBackupManager remoteBackupManager,
      BackupRestorationManager _srBackupRestorationManager)
      throws BackupException, BackupVerificationErrorException {
    try {
      _mbGdbStoreTransferWatcherRebImpl.str();

      BackupMetaService backupMetaService =
          new BackupMetaService(this.fFileSystemAbstraction, gdbName,
              _cnetBackupEnvironment.getPbPath(), this.itraLogProvider,
              _lfcceDefaultBackupServiceHandler.getPageCache(), _pageCacheTracer);

      BackupRemoteMetaDTO backupRemoteMetaDTO = remoteBackupManager.prrtbaBackupRemoteMetaDTO(
          gdbName, _cnetBackupEnvironment.getSocketAddress());

      BackupMetaDTO backupMetaDTO =
          _reermstBackupMetaDTO(backupMetaService, backupRemoteMetaDTO,
              _cnetBackupEnvironment.getIsBftf(), _mbGdbStoreTransferWatcherRebImpl,
              remoteBackupManager);
      this._wrtmedaForBaReStBaBa(backupMetaDTO, backupMetaService, _cnetBackupEnvironment, gdbName,
          remoteBackupManager);
      if (_cnetBackupEnvironment.getIsRp()) {
        _mbGdbStoreTransferWatcherRebImpl.stres();
        _srBackupRestorationManager.reorForDa(backupMetaDTO.getDatabaseLayout());
        _mbGdbStoreTransferWatcherRebImpl.fihrvgse();
      }

      _ccBackupVerificationService.chcsyForDa(backupMetaDTO.getDatabaseLayout());
      backupMetaService.retselForBaDa(backupRemoteMetaDTO.getNamedDatabaseId().databaseId(),
          backupMetaDTO);
    } catch (

        BackupException | BackupVerificationErrorException _exception) {
      throw _exception;
    } catch (

        Exception _exception2) {
      throw new BackupException(_exception2);
    } finally {
      _mbGdbStoreTransferWatcherRebImpl.fii();
    }
  }
}
