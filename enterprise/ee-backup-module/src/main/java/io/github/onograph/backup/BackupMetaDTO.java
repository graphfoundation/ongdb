package io.github.onograph.backup;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StoreId;


public class BackupMetaDTO {


  private final BackupIOService backupIOService;


  private final DatabaseLayout databaseLayout;


  private final StoreResources fsStoreResources;


  private final GdbIdRepo gdbIdRepo;


  private final Log log;


  private final LogProvider logProvider;


  private final PageCacheTracer pageCacheTracer;


  private final BackupMetadataRepository smBackupMetadataRepository;


  public BackupMetaDTO(BackupIOService backupIOService, DatabaseLayout _databaseLayout,
      StoreResources _fsStoreResources, GdbIdRepo gdbIdRepo, LogProvider _logProvider,
      PageCacheTracer _pageCacheTracer, BackupMetadataRepository _smBackupMetadataRepository) {
    this.databaseLayout = _databaseLayout;
    this.fsStoreResources = _fsStoreResources;
    this.gdbIdRepo = gdbIdRepo;
    this.smBackupMetadataRepository = _smBackupMetadataRepository;
    this.pageCacheTracer = _pageCacheTracer;
    this.backupIOService = backupIOService;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
  }


  private static void _chvsForBaDa(BackupIOService backupIOService,
      DatabaseLayout _databaseLayout) {
    if (!backupIOService.isExsForPa(_databaseLayout.metadataStore())) {

      throw new IllegalStateException("*** Error: bfe3eead-4684-4e51-b29d-d952cd6a4b1d");
    }
  }


  public Path daadrrPath() {
    return this.databaseLayout.databaseDirectory();
  }


  public Optional<DatabaseId> daasidOptional() {

    Path _path = this.databaseLayout.backupToolsFolder();

    try {
      return this.gdbIdRepo.reddtaiOptional(_path);
    } catch (

        Exception _exception) {

      return Optional.empty();
    }
  }


  public DatabaseLayout getDatabaseLayout() {
    return this.databaseLayout;
  }


  public boolean isCofcwhForDa(DatabaseId _databaseId) {
    return this.daasidOptional().isPresent() && this.daasidOptional().filter((id) ->
    {
      return id.equals(_databaseId);
    }).isEmpty();
  }


  public boolean isHadasidForDa(DatabaseId _thaDatabaseId) {
    return this.daasidOptional().stream().allMatch((thisDatabaseId) ->
    {
      return thisDatabaseId.equals(_thaDatabaseId);
    });
  }


  public boolean isHaeigse() throws IOException {
    return !this.backupIOService.isDitdontetoieForPa(this.databaseLayout.databaseDirectory());
  }


  public boolean isHasesoForBa(BackupMetaDTO tgtBackupMetaDTO) throws IOException {

    Optional<StoreId> _optionalOistStoreId = this.stridOptional();
    if (_optionalOistStoreId.isPresent()) {

      StoreId _tStoreId = _optionalOistStoreId.get();

      try {

        Optional<StoreId> _optionalOistStoreId2 = tgtBackupMetaDTO.stridOptional();
        if (_optionalOistStoreId2.isPresent()) {

          StoreId _thaStoreId = _optionalOistStoreId2.get();
          return _tStoreId.equals(_thaStoreId);
        }
      } catch (

          IllegalStateException _illegalStateException) {
      }
    }

    return false;
  }


  public boolean isHasridForSt(StoreId _tStoreId) throws IOException {
    return this.stridOptional().filter((thisStoreId) ->
    {
      return thisStoreId.equals(_tStoreId);
    }).isPresent();
  }


  public boolean isLotaForBa(BackupMetaDTO _lctoBackupMetaDTO) {

    Path _ptPath = this.daadrrPath().toAbsolutePath();

    Path _ptPath2 = _lctoBackupMetaDTO.daadrrPath().toAbsolutePath();
    return _ptPath.equals(_ptPath2);
  }


  public boolean isTrde() {

    Path _dpPath = this.daadrrPath();

    try {
      this.backupIOService.deedForPa(_dpPath);
      return true;
    } catch (

        IOException _iOException) {

      return false;
    }
  }


  public BackupMetaDTO moetBackupMetaDTO(BackupMetaDTO prBackupMetaDTO) throws IOException {
    return this.moetBackupMetaDTO(prBackupMetaDTO.daadrrPath());
  }


  public BackupMetaDTO moetBackupMetaDTO(Path _tPath) throws IOException {
    this.backupIOService.coydleForPaPa(this.daadrrPath(), _tPath);

    DatabaseLayout _databaseLayout = DatabaseLayout.ofFlat(_tPath);
    return new BackupMetaDTO(this.backupIOService, _databaseLayout, this.fsStoreResources,
        this.gdbIdRepo,
        this.logProvider, this.pageCacheTracer, this.smBackupMetadataRepository);
  }


  public Optional<StoreId> stridOptional() throws IOException {
    if (!this.isHaeigse()) {
      return Optional.empty();
    } else {
      _chvsForBaDa(this.backupIOService, this.databaseLayout);

      CursorContext _cursorContext =
          new CursorContext(this.pageCacheTracer.createPageCursorTracer(
              io.github.onograph.TokenConstants.BACKUP_LOCATION));

      Optional _optional;
      try {
        _optional = Optional.ofNullable(
            this.fsStoreResources.redsoiStoreId(_cursorContext, this.databaseLayout));
      } catch (

          Throwable _throwable) {
        try {
          _cursorContext.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _cursorContext.close();
      return _optional;
    }
  }


  public void wrdaiForDa(DatabaseId _databaseId) throws IOException {
    this.gdbIdRepo.wrdaiForDaPa(_databaseId, this.databaseLayout.backupToolsFolder());
  }


  public void wrtmedaForLi(List<String> _listDmString) throws IOException {
    this.smBackupMetadataRepository.wrtForPaLi(this.getDatabaseLayout().backupToolsFolder(),
        _listDmString);
  }


}
