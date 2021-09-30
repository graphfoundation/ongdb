package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.CoreNodeDbWrapper;
import io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper;
import io.github.onograph.cluster.raft.share.meta.StoreGdbEnvironmentWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService;
import io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment;
import io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl;
import io.github.onograph.dbms.ClusteringMediationDbmsManagers;
import io.github.onograph.dbms.gdb.ClusteredAbstractMultipleGdbDatabaseManager;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import io.github.onograph.dbms.gdb.EnterpriseDatabaseContextClusterImpl;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.DatabaseReadOnlyChecker.Default;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.database.DatabaseConfig;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.ModularDatabaseCreationContext;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.VersionContextSupplier;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.DatabaseCreationContext;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.StorageEngineFactory;


public final class CoreClusteredMultipleGdbDatabaseManager extends
    ClusteredAbstractMultipleGdbDatabaseManager {


  protected final CoreModule edtnCoreModule;


  private final ConsensusCommandReaderFactoryProvider sfrcConsensusCommandReaderFactoryProvider;


  CoreClusteredMultipleGdbDatabaseManager(Config _config,
      ClusterMetaTopologyInfo _cslClusterMetaTopologyInfo, CoreModule _eiinCoreModule,
      FileSystemAbstraction _fFileSystemAbstraction, GlobalModule _globalModule,
      LogProvider _logProvider, ClusteringMediationDbmsManagers _ocClusteringMediationDbmsManagers,
      PageCache _pageCache,
      ConsensusCommandReaderFactoryProvider _sfrcConsensusCommandReaderFactoryProvider) {
    super(_eiinCoreModule, _ocClusteringMediationDbmsManagers, _config, _fFileSystemAbstraction,
        _globalModule, _logProvider, _cslClusterMetaTopologyInfo,
        _pageCache);
    this.edtnCoreModule = _eiinCoreModule;
    this.sfrcConsensusCommandReaderFactoryProvider = _sfrcConsensusCommandReaderFactoryProvider;
  }


  private void _deecstraiForSt(String gdbName) throws IOException {

    Path _psigrPath = this.clestloClusterMetaTopologyInfo.ragridfPath(gdbName);

    Path _psigrPath2 = _psigrPath.getParent();

    Path _pgrPath = this.clestloClusterMetaTopologyInfo.ratgodPath(gdbName);
    if (this.fsFileSystemAbstraction.fileExists(_pgrPath)) {
      assert _psigrPath2.getParent().equals(_pgrPath);

      Path[] _pfPathArray = this.fsFileSystemAbstraction.listFiles(_pgrPath, (path) ->
      {
        return !_psigrPath2.getFileName().equals(path.getFileName());
      });

      Path[] _vaPathArray = _pfPathArray;

      int _iVa = _pfPathArray.length;

      for (

          int _iVar = 0; _iVar < _iVa; ++_iVar) {

        Path _pfPath = _vaPathArray[_iVar];
        if (Files.isDirectory(_pfPath)) {
          this.fsFileSystemAbstraction.deleteRecursively(_pfPath);
        }

        this.fsFileSystemAbstraction.deleteFile(_pfPath);
      }

      FileUtils.tryForceDirectory(_pgrPath);
      if (_pfPathArray.length != 0 && !this.fsFileSystemAbstraction.fileExists(_psigrPath)) {

      }

      this.fsFileSystemAbstraction.deleteFile(_psigrPath);
      this.fsFileSystemAbstraction.deleteRecursively(_pgrPath);
    }
  }


  private void _inlsrenfrForSyCoCoStNa(CoreGdbFSMService _msCoreGdbFSMService,
      NamedDatabaseId _namedDatabaseId,
      ConsensusCommandReaderFactoryProvider _sfrcConsensusCommandReaderFactoryProvider,
      StorageEngineFactory _storageEngineFactory,
      SyncableDataChannelMarshal syncableDataChannelMarshal) {
    syncableDataChannelMarshal.inttForSt(_storageEngineFactory);
    _msCoreGdbFSMService.inlsrenfrForSt(_storageEngineFactory);
    _sfrcConsensusCommandReaderFactoryProvider.retsoeeForCoSt(
        ConsensusMemberGroupId.froConsensusMemberGroupId(_namedDatabaseId.databaseId()),
        _storageEngineFactory);
  }


  private DatabaseCreationContext _nedtectcotDatabaseCreationContext(
      CoreNodeWrapper _ckCoreNodeWrapper, DatabaseConfig _databaseConfig,
      NamedDatabaseId _namedDatabaseId, Dependencies _prnDependencies, Monitors _prnMonitors,
      VersionContextSupplier _versionContextSupplier) {

    EditionDatabaseComponentCoreClusterGdbImpl _cdcEditionDatabaseComponentCoreClusterGdbImpl =
        new EditionDatabaseComponentCoreClusterGdbImpl(this.edtnCoreModule, _ckCoreNodeWrapper);

    GlobalProcedures _globalProcedures = _prnDependencies.resolveDependency(GlobalProcedures.class);
    return new ModularDatabaseCreationContext(_namedDatabaseId, this.globalModule, _prnDependencies,
        _prnMonitors,
        _cdcEditionDatabaseComponentCoreClusterGdbImpl,
        _globalProcedures, _versionContextSupplier, _databaseConfig,
        _ckCoreNodeWrapper.getLeaseService());
  }

  @Override
  public void clucsstForSt(String gdbName) {
    try {
      this._deecstraiForSt(gdbName);
    } catch (

        IOException _iOException) {

      throw new DatabaseManagementException("*** Error:  98b049bb-3f75-47f6-9469-afc1df256dab",
          _iOException);
    }
  }

  @Override
  protected EnterpriseClusterDbContext createDatabaseContext(NamedDatabaseId _namedDatabaseId,
      Map<Setting<?>, Object> _mapSsdso) {

    LifeSupport _crLifeSupport = new LifeSupport();

    Dependencies _dcDependencies = new Dependencies(this.globalModule.getGlobalDependencies());

    DatabaseLogService _corDatabaseLogService = new DatabaseLogService(_namedDatabaseId,
        this.globalModule.getLogService());

    MonitorsClusterConsensusImpl _mdcMonitorsClusterConsensusImpl =
        MonitorsClusterConsensusImpl.craMonitorsClusterConsensusImpl(_dcDependencies,
            this.globalModule.getGlobalMonitors());

    PageCacheTracer _pageCacheTracer = this.globalModule.getTracers().getPageCacheTracer();

    DatabaseLayout _databaseLayout = this.globalModule.getNeo4jLayout()
        .databaseLayout(_namedDatabaseId.name());

    DatabaseConfig _databaseConfig = new DatabaseConfig(_mapSsdso, this.config, _namedDatabaseId);

    LogFiles _ltLogFiles = this.butanlLogFiles(_databaseLayout);

    SyncableDataChannelMarshal syncableDataChannelMarshal = new SyncableDataChannelMarshal();

    StoreGdbEnvironmentWrapper _cbStoreGdbEnvironmentWrapper =
        new StoreGdbEnvironmentWrapper(_databaseLayout, this.strfisStoreResources, _ltLogFiles,
            _namedDatabaseId);

    ConsensusCoreEnvWrapper _crConsensusCoreEnvWrapper = this.edtnCoreModule.getFdcClusterCoreGdbManager()
        .crercxConsensusCoreEnvWrapper(_crLifeSupport, _corDatabaseLogService,
            _dcDependencies,
            _mdcMonitorsClusterConsensusImpl,
            _namedDatabaseId, syncableDataChannelMarshal);
    _dcDependencies.satisfyDependency(_crConsensusCoreEnvWrapper.getRpiaoSyncerator());

    VersionContextSupplier _versionContextSupplier = this.createVersionContextSupplier(
        _databaseConfig);

    CoreNodeDbWrapper _rkCoreNodeDbWrapper = new CoreNodeDbWrapper();

    Default _corDefault = new Default(this.globalModule.getDbmsReadOnlyChecker(),
        _namedDatabaseId.name());

    CoreNodeWrapper _ckCoreNodeWrapper = this.edtnCoreModule.getFdcClusterCoreGdbManager()
        .crekecptCoreNodeWrapper(_crConsensusCoreEnvWrapper, _crLifeSupport, _corDatabaseLogService,
            _corDefault,
            _rkCoreNodeDbWrapper, _namedDatabaseId, _versionContextSupplier);

    DatabaseCreationContext _databaseCreationContext =
        this._nedtectcotDatabaseCreationContext(_ckCoreNodeWrapper, _databaseConfig,
            _namedDatabaseId, _dcDependencies,
            _mdcMonitorsClusterConsensusImpl,
            _versionContextSupplier);

    Database _kreDatabase = new Database(_databaseCreationContext);

    StoreSyncEnvironment _cdStoreSyncEnvironment =
        new StoreSyncEnvironment(this.strfisStoreResources, _kreDatabase, _ltLogFiles,
            this.inndmorDbmsManagerClusterImpl(), _pageCacheTracer);
    this._inlsrenfrForSyCoCoStNa(_ckCoreNodeWrapper.getMsCoreGdbFSMService(), _namedDatabaseId,
        this.sfrcConsensusCommandReaderFactoryProvider,
        _kreDatabase.getStorageEngineFactory(), syncableDataChannelMarshal);

    CoreDistributedGdb _cdCoreDistributedGdb = this.edtnCoreModule.getFdcClusterCoreGdbManager()
        .cradasCoreDistributedGdb(_cbStoreGdbEnvironmentWrapper, _cdStoreSyncEnvironment,
            _ckCoreNodeWrapper, _crConsensusCoreEnvWrapper,
            _crLifeSupport, _dcDependencies, _kreDatabase,
            this.globalModule.getOtherMemoryPool().getPoolMemoryTracker(),
            _mdcMonitorsClusterConsensusImpl,
            _namedDatabaseId, this.inndmorDbmsManagerClusterImpl(),
            this.qunotDbmsManagerWatchTagImpl());

    EnterpriseDatabaseContextClusterImpl _cEnterpriseDatabaseContextClusterImpl = EnterpriseDatabaseContextClusterImpl
        .corEnterpriseDatabaseContextClusterImpl(_kreDatabase, _cdCoreDistributedGdb,
            _mdcMonitorsClusterConsensusImpl,
            _kreDatabase.getDatabaseFacade(),
            _crConsensusCoreEnvWrapper.getGrConsensusNodeGroupWrapper()
                .getConsensusOperationsManager());
    _rkCoreNodeDbWrapper.retdteForDa(_cEnterpriseDatabaseContextClusterImpl.database());
    return _cEnterpriseDatabaseContextClusterImpl;
  }
}
