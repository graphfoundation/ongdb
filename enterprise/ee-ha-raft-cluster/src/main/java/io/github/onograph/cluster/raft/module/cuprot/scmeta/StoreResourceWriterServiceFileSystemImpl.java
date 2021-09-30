package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.synctrxr.ResourceSyncWatcher;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.monitoring.Monitors;


public class StoreResourceWriterServiceFileSystemImpl implements StoreResourceWriterService {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final ResourceSyncWatcher mcfResourceSyncWatcher;


  private final Path psPath;


  public StoreResourceWriterServiceFileSystemImpl(FileSystemAbstraction _fFileSystemAbstraction,
      Monitors _monitors, Path _psPath) {
    this.psPath = _psPath;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.mcfResourceSyncWatcher = _monitors.newMonitor(ResourceSyncWatcher.class, new String[0]);
  }

  @Override
  public StoreResourceWriter acueStoreResourceWriter(int _iAr, String _strDsiai)
      throws IOException {

    Path _npfPath = this.psPath.resolve(_strDsiai);
    this.fFileSystemAbstraction.mkdirs(_npfPath.getParent());
    this.mcfResourceSyncWatcher.coyflForPa(_npfPath);
    return StoreResourceWriterFSAImpl.frmflStoreResourceWriterFSAImpl(this.fFileSystemAbstraction,
        _npfPath);
  }
}
