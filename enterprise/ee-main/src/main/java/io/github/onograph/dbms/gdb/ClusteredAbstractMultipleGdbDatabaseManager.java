package io.github.onograph.dbms.gdb;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.dbms.ClusteringMediationDbmsManagers;
import io.github.onograph.dbms.DbmsManagerClusterImpl;
import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import java.io.IOException;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public abstract class ClusteredAbstractMultipleGdbDatabaseManager extends
    AbstractMultipleGdbDatabaseManager<EnterpriseClusterDbContext> {


  protected final ClusterMetaTopologyInfo clestloClusterMetaTopologyInfo;


  protected final Config config;


  protected final FileSystemAbstraction fsFileSystemAbstraction;


  protected final Log log;


  protected final LogProvider logProvider;


  protected final StoreResources strfisStoreResources;


  private final ClusteringMediationDbmsManagers ocClusteringMediationDbmsManagers;


  private final PageCache pageCache;


  public ClusteredAbstractMultipleGdbDatabaseManager(AbstractEditionModule _abstractEditionModule,
      ClusteringMediationDbmsManagers _coClusteringMediationDbmsManagers, Config _config,
      FileSystemAbstraction _fFileSystemAbstraction, GlobalModule _globalModule,
      LogProvider _logProvider, ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo,
      PageCache _pageCache) {
    super(_abstractEditionModule, _globalModule);
    this.logProvider = _logProvider;
    this.fsFileSystemAbstraction = _fFileSystemAbstraction;
    this.log = _logProvider.getLog(this.getClass());
    this.config = _config;
    this.pageCache = _pageCache;
    this.strfisStoreResources = new StoreResources(_fFileSystemAbstraction, _pageCache);
    this.clestloClusterMetaTopologyInfo = _lscClusterMetaTopologyInfo;
    this.ocClusteringMediationDbmsManagers = _coClusteringMediationDbmsManagers;
  }


  private EnterpriseClusterDbContext _reacnindEnterpriseClusterDbContext(
      EnterpriseClusterDbContext _enterpriseClusterDbContext, NamedDatabaseId _namedDatabaseId)
      throws Exception {
    if (_enterpriseClusterDbContext.enpdaGdb().getIsSbh()) {
      _enterpriseClusterDbContext.enpdaGdb().stopLC();

      EnterpriseClusterDbContext _ucEnterpriseClusterDbContext =
          this.createDatabaseContext(_namedDatabaseId, this.redasscsnMap(_namedDatabaseId));
      this.databaseMap.put(_namedDatabaseId, _ucEnterpriseClusterDbContext);
      return _ucEnterpriseClusterDbContext;
    } else {
      return _enterpriseClusterDbContext;
    }
  }


  protected final LogFiles butanlLogFiles(DatabaseLayout _dlDatabaseLayout) {
    try {
      return LogFilesBuilder.activeFilesBuilder(_dlDatabaseLayout, this.fsFileSystemAbstraction,
          this.pageCache).withConfig(this.config).build();
    } catch (

        IOException _iOException) {
      throw new RuntimeException(_iOException);
    }
  }


  public abstract void clucsstForSt(String _strVar);


  protected final DbmsManagerClusterImpl inndmorDbmsManagerClusterImpl() {
    return this.ocClusteringMediationDbmsManagers.getOicDbmsManagerClusterImpl();
  }


  protected final DbmsManagerWatchTagImpl qunotDbmsManagerWatchTagImpl() {
    return this.ocClusteringMediationDbmsManagers.getOqDbmsManagerWatchTagImpl();
  }

  @Override
  protected void removeGDB(EnterpriseClusterDbContext _enterpriseClusterDbContext, boolean _isDd,
      NamedDatabaseId _namedDatabaseId) {
    try {
      super.processRemoveGdb(_enterpriseClusterDbContext, _isDd, _namedDatabaseId);
      this.clucsstForSt(_namedDatabaseId.name());
      this.databaseIdRepository().invalidate(_namedDatabaseId);
      this.reedbcotForNa(_namedDatabaseId);
    } catch (

        Throwable _throwable) {

      throw new DatabaseManagementException("*** Error: fc2d9614-c3a9-40ed-84c0-982810543c03",
          _throwable);
    }
  }

  @Override
  protected void startDatabase(NamedDatabaseId _namedDatabaseId,
      EnterpriseClusterDbContext _enterpriseClusterDbContext) {
    try {
      _enterpriseClusterDbContext = this._reacnindEnterpriseClusterDbContext(
          _enterpriseClusterDbContext, _namedDatabaseId);
      super.strdabeForNaDBEP(_enterpriseClusterDbContext, _namedDatabaseId);
    } catch (

        Throwable _throwable) {
      this.unetsadteForNaTh(_namedDatabaseId, _throwable);
    }
  }


  public void stdaatsocpForNa(NamedDatabaseId _namedDatabaseId) {
    this.fosndasForNaBi((id, context) ->
    {
      try {

        context.database().start();
      } catch (

          Throwable _throwable) {

        throw new DatabaseManagementException("*** Error: 7ae1d24e-23fc-46c0-b169-6a3faf3c8e49",
            _throwable);
      }
    }, _namedDatabaseId);
  }


  public void stdasbosocpForNa(NamedDatabaseId _namedDatabaseId) {
    this.fosndasForNaBi((id, context) ->
    {
      try {

        context.database().stop();
      } catch (

          Throwable _throwable) {

        throw new DatabaseManagementException("*** Error: ef3278f7-d356-42c8-ad94-295fa570c8e1",
            _throwable);
      }
    }, _namedDatabaseId);
  }
}
