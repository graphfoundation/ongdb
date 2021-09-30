package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl;
import io.github.onograph.dbms.ClusteringMediationDbmsManagers;
import io.github.onograph.dbms.gdb.ClusteredAbstractMultipleGdbDatabaseManager;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import io.github.onograph.dbms.gdb.EnterpriseDatabaseContextClusterImpl;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.ModularDatabaseCreationContext;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.logging.LogProvider;


public class ReadReplicaClusteredMultipleGdbDatabaseManager extends
    ClusteredAbstractMultipleGdbDatabaseManager {


  protected final ReadReplicaModule edtnReadReplicaModule;


  ReadReplicaClusteredMultipleGdbDatabaseManager(Config _config,
      ReadReplicaModule _eiinReadReplicaModule, FileSystemAbstraction _fFileSystemAbstraction,
      GlobalModule _globalModule, LogProvider _logProvider,
      ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo,
      ClusteringMediationDbmsManagers _ocClusteringMediationDbmsManagers, PageCache _pageCache) {
    super(_eiinReadReplicaModule, _ocClusteringMediationDbmsManagers, _config,
        _fFileSystemAbstraction, _globalModule, _logProvider,
        _lscClusterMetaTopologyInfo, _pageCache);
    this.edtnReadReplicaModule = _eiinReadReplicaModule;
  }


  private void _deergiForSt(String gdbName) throws IOException {

    Path _pgrPath = this.clestloClusterMetaTopologyInfo.ratgodPath(gdbName);

    Path _sirPath = this.clestloClusterMetaTopologyInfo.ragridfPath(gdbName);

    Path _rispPath = _sirPath.getParent();
    this.fsFileSystemAbstraction.deleteFile(_sirPath);
    FileUtils.tryForceDirectory(_rispPath);
    this.fsFileSystemAbstraction.deleteRecursively(_pgrPath);
  }

  @Override
  public void clucsstForSt(String gdbName) {
    try {
      this._deergiForSt(gdbName);
    } catch (

        IOException _iOException) {

      throw new DatabaseManagementException("*** Error:  4cf875ed-fbef-45e1-a663-58772786e21e",
          _iOException);
    }
  }

  @Override
  protected EnterpriseClusterDbContext createDatabaseContext(NamedDatabaseId _namedDatabaseId,
      Map<Setting<?>, Object> _mapSsdso) {

    Dependencies _rrDependencies = new Dependencies(this.globalModule.getGlobalDependencies());

    MonitorsClusterConsensusImpl _mrrMonitorsClusterConsensusImpl =
        MonitorsClusterConsensusImpl.craMonitorsClusterConsensusImpl(_rrDependencies,
            this.globalModule.getGlobalMonitors());

    PageCacheTracer _pageCacheTracer = this.globalModule.getTracers().getPageCacheTracer();

    ModularDatabaseCreationContext _modularDatabaseCreationContext =
        this.newDatabaseCreationContext(_namedDatabaseId, _mapSsdso, _rrDependencies,
            _mrrMonitorsClusterConsensusImpl);

    Database _kreDatabase = new Database(_modularDatabaseCreationContext);

    LogFiles _tlLogFiles = this.butanlLogFiles(_kreDatabase.getDatabaseLayout());

    ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment =
        new ReadReplicaGdbWrapperEnvironment(_rrDependencies, this.strfisStoreResources,
            _kreDatabase, _tlLogFiles, _mrrMonitorsClusterConsensusImpl,
            this.inndmorDbmsManagerClusterImpl(), _pageCacheTracer);

    ReadReplicaDistributedGdb _drrReadReplicaDistributedGdb =
        this.edtnReadReplicaModule.getFdrrClusterReadReplicaGdbManager()
            .cradasReadReplicaDistributedGdb(_cdReadReplicaGdbWrapperEnvironment,
                this.inndmorDbmsManagerClusterImpl(),
                this.qunotDbmsManagerWatchTagImpl());
    return EnterpriseDatabaseContextClusterImpl.redrpcEnterpriseDatabaseContextClusterImpl(
        _kreDatabase, _drrReadReplicaDistributedGdb,
        _mrrMonitorsClusterConsensusImpl,
        _kreDatabase.getDatabaseFacade());
  }
}
