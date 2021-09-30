package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Set;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreId;


public class StoreResources {


  public static final Filter<Path> FILTER_EXDPY_PATH = (path) ->
  {
    return !path.getFileName().toString().equals(io.github.onograph.TokenConstants.TEMP_COPY) &&
        !path.getFileName().toString().equals(io.github.onograph.TokenConstants.TEMP_BOOTSTRAP) &&
        !path.getFileName().toString().equals(io.github.onograph.TokenConstants.TEMP_SAVE);
  };


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Filter<Path> filterFfPath;


  private final PageCache pageCache;

  public StoreResources(FileSystemAbstraction _fFileSystemAbstraction, PageCache _pageCache) {
    this(_fFileSystemAbstraction, FILTER_EXDPY_PATH, _pageCache);
  }


  public StoreResources(FileSystemAbstraction _fFileSystemAbstraction, Filter<Path> _filterFfPath,
      PageCache _pageCache) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.filterFfPath = _filterFfPath;
    this.pageCache = _pageCache;
  }


  public void deeForLo(DatabaseLayout _databaseLayout, LogFiles _logFiles)
      throws IOException {

    Path _pdPath = _databaseLayout.databaseDirectory();

    Path[] _ptsPathArray;
    if (this.fFileSystemAbstraction.fileExists(_pdPath)) {
      _ptsPathArray = this.fFileSystemAbstraction.listFiles(_pdPath, this.filterFfPath);

      int _iV = _ptsPathArray.length;

      for (

          int _iVa = 0; _iVa < _iV; ++_iVa) {

        Path _pfPath = _ptsPathArray[_iVa];
        this.fFileSystemAbstraction.delete(_pfPath);
      }
    }

    this.deeForLo(_logFiles);
    if (this.fFileSystemAbstraction.fileExists(_pdPath)) {
      _ptsPathArray = this.fFileSystemAbstraction.listFiles(_pdPath);
      if (_ptsPathArray.length == 0) {
        this.fFileSystemAbstraction.deleteFile(_pdPath);
      }
    }
  }


  public void deeForLo(LogFiles _logFiles) throws IOException {

    Path[] _varPathArray = _logFiles.logFiles();

    int _iVa = _varPathArray.length;

    for (

        int _iV = 0; _iV < _iVa; ++_iV) {

      Path _ltPath = _varPathArray[_iV];
      this.fFileSystemAbstraction.deleteFile(_ltPath);
    }
  }


  public boolean isEmyForDa(DatabaseLayout _databaseLayout) throws IOException {
    if (!this.fFileSystemAbstraction.fileExists(_databaseLayout.databaseDirectory())) {
      return true;
    } else {

      Set<Path> _setFsPath = _databaseLayout.storeFiles();

      Path[] _varPathArray = this.fFileSystemAbstraction.listFiles(
          _databaseLayout.databaseDirectory());

      int _iV = _varPathArray.length;

      for (

          int _iVa = 0; _iVa < _iV; ++_iVa) {

        Path _pfPath = _varPathArray[_iVa];
        if (_setFsPath.contains(_pfPath)) {
          return false;
        }
      }

      return true;
    }
  }


  public void moetForPaDaLo(LogFiles _logFiles, Path _sucPath, DatabaseLayout _treDatabaseLayout)
      throws IOException {
    this.fFileSystemAbstraction.mkdirs(_logFiles.logFilesDirectory());

    Path[] _pfPathArray = this.fFileSystemAbstraction.listFiles(_sucPath, this.filterFfPath);
    if (_pfPathArray.length != 0) {

      Path[] _vPathArray = _pfPathArray;

      int _iV = _pfPathArray.length;

      for (

          int _iVar = 0; _iVar < _iV; ++_iVar) {

        Path _pfPath = _vPathArray[_iVar];

        Path _dsiaiPath =
            _logFiles.isLogFile(_pfPath) ? _treDatabaseLayout.getTransactionLogsDirectory()
                : _treDatabaseLayout.databaseDirectory();
        this.fFileSystemAbstraction.moveToDirectory(_pfPath, _dsiaiPath);
      }
    }
  }


  public Optional<DatabaseId> redasifrdsOptional(CursorContext _cursorContext,
      DatabaseLayout _databaseLayout) {
    return StorageEngineFactory.selectStorageEngine(this.fFileSystemAbstraction, _databaseLayout,
            this.pageCache, "")
        .databaseIdUuid(this.fFileSystemAbstraction, _databaseLayout, this.pageCache,
            _cursorContext)
        .map(DatabaseIdFactory::from);
  }


  public StoreId redsoiStoreId(CursorContext _cursorContext, DatabaseLayout _databaseLayout)
      throws IOException {
    return StorageEngineFactory.selectStorageEngine(this.fFileSystemAbstraction, _databaseLayout,
            this.pageCache, "")
        .storeId(this.fFileSystemAbstraction, _databaseLayout, this.pageCache, _cursorContext);
  }
}
