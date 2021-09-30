package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.logging.LogProvider;


public class CatchupClusteredGdbManageService {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final LogProvider logProvider;


  private final PageCache pageCache;


  private final SyncRecoveryLifecycleAdapter rscSyncRecoveryLifecycleAdapter;


  private final ClusteredGdb srClusteredGdb;


  public CatchupClusteredGdbManageService(FileSystemAbstraction _fFileSystemAbstraction,
      LogProvider _logProvider, PageCache _pageCache,
      SyncRecoveryLifecycleAdapter _rscSyncRecoveryLifecycleAdapter, ClusteredGdb _srClusteredGdb) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.logProvider = _logProvider;
    this.pageCache = _pageCache;
    this.rscSyncRecoveryLifecycleAdapter = _rscSyncRecoveryLifecycleAdapter;
    this.srClusteredGdb = _srClusteredGdb;
  }


  public StoreSyncFacade stcprsStoreSyncFacade(StoreSyncEnvironment _cdsStoreSyncEnvironment) {

    CatchupRemoteClusteredGdbManager catchupRemoteClusteredGdbManager =
        new CatchupRemoteClusteredGdbManager(this.rscSyncRecoveryLifecycleAdapter,
            this.srClusteredGdb);
    return new StoreSyncFacade(catchupRemoteClusteredGdbManager, _cdsStoreSyncEnvironment,
        this.fFileSystemAbstraction, this.logProvider, this.pageCache,
        this.rscSyncRecoveryLifecycleAdapter, this.srClusteredGdb,
        GdbFsaHolderFacade::new);
  }
}
