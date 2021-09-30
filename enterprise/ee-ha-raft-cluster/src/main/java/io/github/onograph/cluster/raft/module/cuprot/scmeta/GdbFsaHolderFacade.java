package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.storageengine.api.StorageEngineFactory;


public class GdbFsaHolderFacade implements AutoCloseable {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final StoreResources fsStoreResources;


  private final LogFiles teLogFiles;


  private final DatabaseLayout temDatabaseLayout;


  private final Path thpPath;


  private boolean isSk;


  GdbFsaHolderFacade(DatabaseLayout _databaseLayout, FileSystemAbstraction _fFileSystemAbstraction,
      PageCache _pageCache, StorageEngineFactory _storageEngineFactory)
      throws IOException {
    this.thpPath = _databaseLayout.file(io.github.onograph.TokenConstants.TEMP_COPY);
    this.temDatabaseLayout = Neo4jLayout.ofFlat(this.thpPath)
        .databaseLayout(_databaseLayout.getDatabaseName());
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.fsStoreResources = new StoreResources(_fFileSystemAbstraction, (path) ->
    {
      return true;
    }, _pageCache);
    this.teLogFiles = LogFilesBuilder.logFilesBasedOnlyBuilder(
            this.temDatabaseLayout.getTransactionLogsDirectory(), _fFileSystemAbstraction)
        .withCommandReaderFactory(_storageEngineFactory.commandReaderFactory()).build();
    this.fsStoreResources.deeForLo(this.temDatabaseLayout, this.teLogFiles);
  }

  @Override
  public void close() throws IOException {
    if (!this.isSk) {
      this.fsStoreResources.deeForLo(this.temDatabaseLayout, this.teLogFiles);
      this.fFileSystemAbstraction.deleteFile(this.thpPath);
    }
  }


  public DatabaseLayout getTemDatabaseLayout() {
    return this.temDatabaseLayout;
  }


  void kepso() {
    this.isSk = true;
  }


  @FunctionalInterface
  interface Creator {


    GdbFsaHolderFacade generate(DatabaseLayout _databaseLayout,
        FileSystemAbstraction _fileSystemAbstraction, PageCache _pageCache,
        StorageEngineFactory _storageEngineFactory)
        throws IOException;
  }
}
