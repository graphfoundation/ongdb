package io.github.onograph.backup;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class BackupMetaService {


  private final BackupIOService backupIOService;


  private final StoreResources fsStoreResources;


  private final GdbIdRepo gdbIdRepo;


  private final DatabaseLayout lbuDatabaseLayout;


  private final Log log;


  private final LogProvider logProvider;


  private final PageCacheTracer pageCacheTracer;


  private final BackupMetadataRepository smBackupMetadataRepository;


  public BackupMetaService(FileSystemAbstraction _fFileSystemAbstraction, String gdbName,
      Path _lbPath, LogProvider _logProvider, PageCache _pageCache,
      PageCacheTracer _pageCacheTracer) {
    this.lbuDatabaseLayout = DatabaseLayout.ofFlat(_lbPath.resolve(gdbName));
    this.pageCacheTracer = _pageCacheTracer;
    this.fsStoreResources = new StoreResources(_fFileSystemAbstraction, _pageCache);
    this.log = _logProvider.getLog(this.getClass());
    this.logProvider = _logProvider;
    this.gdbIdRepo = new GdbIdRepo(_fFileSystemAbstraction);
    this.smBackupMetadataRepository = new BackupMetadataRepository(_fFileSystemAbstraction);
    this.backupIOService = new BackupIOService(_fFileSystemAbstraction);
  }


  public static void wrtmedaForBaLi(BackupMetaDTO backupMetaDTO, List<String> _listDmString)
      throws IOException {
    backupMetaDTO.wrtmedaForLi(_listDmString);
  }


  private BackupMetaDTO _motoubpltBackupMetaDTO(DatabaseId _databaseId,
      BackupMetaDTO oBackupMetaDTO) throws IOException {

    BackupMetaDTO prBackupMetaDTO = this.crebulaBackupMetaDTO();
    if (!oBackupMetaDTO.isLotaForBa(prBackupMetaDTO)) {

      boolean _isDltd = false;
      if (oBackupMetaDTO.isHasesoForBa(prBackupMetaDTO)) {
        _isDltd = prBackupMetaDTO.isTrde();
      }

      if (!_isDltd) {

        Path _pePath = this.backupIOService.neterdPath(prBackupMetaDTO.daadrrPath());

        prBackupMetaDTO.moetBackupMetaDTO(_pePath);
      }

      oBackupMetaDTO.moetBackupMetaDTO(prBackupMetaDTO);
    }

    if (oBackupMetaDTO.isCofcwhForDa(_databaseId)) {

      String _strIda = oBackupMetaDTO.daasidOptional().map(Object::toString).orElse("<no-db>");

      throw new IllegalArgumentException("*** Error: 1952de58-16ea-487e-8498-4ed23f20b368");
    } else {
      return prBackupMetaDTO;
    }
  }


  public BackupMetaDTO crebulaBackupMetaDTO() {
    return new BackupMetaDTO(this.backupIOService, this.lbuDatabaseLayout, this.fsStoreResources,
        this.gdbIdRepo,
        this.logProvider, this.pageCacheTracer, this.smBackupMetadataRepository);
  }


  public BackupMetaDTO cretoeliBackupMetaDTO() throws IOException {

    Path _ptPath = this.backupIOService.netwrndiPath(this.lbuDatabaseLayout.databaseDirectory());

    DatabaseLayout _tDatabaseLayout = DatabaseLayout.ofFlat(_ptPath);
    return new BackupMetaDTO(this.backupIOService, _tDatabaseLayout, this.fsStoreResources,
        this.gdbIdRepo,
        this.logProvider, this.pageCacheTracer, this.smBackupMetadataRepository);
  }


  public void retselForBaDa(DatabaseId _databaseId, BackupMetaDTO oBackupMetaDTO)
      throws IOException {

    BackupMetaDTO prBackupMetaDTO = this._motoubpltBackupMetaDTO(_databaseId, oBackupMetaDTO);

    try {
      prBackupMetaDTO.wrdaiForDa(_databaseId);
    } catch (

        IOException _iOException) {

    }
  }
}
