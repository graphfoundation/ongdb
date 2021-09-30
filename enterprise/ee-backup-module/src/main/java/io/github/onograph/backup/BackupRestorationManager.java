package io.github.onograph.backup;

import java.io.IOException;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.recovery.Recovery;
import org.neo4j.memory.MemoryTracker;


public class BackupRestorationManager {


  private final Config config;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final MemoryTracker memoryTracker;


  private final PageCache pageCache;


  public BackupRestorationManager(Config _config, FileSystemAbstraction _fFileSystemAbstraction,
      MemoryTracker _memoryTracker, PageCache _pageCache) {
    this.config = _config;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.memoryTracker = _memoryTracker;
    this.pageCache = _pageCache;
  }


  public void reorForDa(DatabaseLayout _databaseLayout) throws IOException {
    Recovery.performRecovery(this.fFileSystemAbstraction, this.pageCache, DatabaseTracers.EMPTY,
        this.config, _databaseLayout, this.memoryTracker);
  }
}
