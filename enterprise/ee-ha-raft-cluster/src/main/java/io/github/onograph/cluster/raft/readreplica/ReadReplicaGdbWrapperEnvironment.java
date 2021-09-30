package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment;
import io.github.onograph.dbms.DbmsManagerClusterImpl;
import java.io.IOException;
import java.util.Optional;
import org.neo4j.collection.Dependencies;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.logging.Log;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.StoreId;


public class ReadReplicaGdbWrapperEnvironment {


  private static final String RDX_RELA_DST_UID_RDXR_LT = io.github.onograph.TokenConstants.READ_REPLICA_STORE_ID_READER;


  private static final String RDX_RELA_GDB_UID_RDXR_LT = io.github.onograph.TokenConstants.READ_REPLICA_DATABASE_ID_READER;


  private final Dependencies dependencies;


  private final Database kreDatabase;


  private final Log log;


  private final LogFiles ltLogFiles;


  private final Monitors monitors;


  private final DbmsManagerClusterImpl oiDbmsManagerClusterImpl;


  private final PageCacheTracer pageCacheTracer;


  private final StoreResources sfStoreResources;


  ReadReplicaGdbWrapperEnvironment(Dependencies _dependencies, StoreResources _fsStoreResources,
      Database _kreDatabase, LogFiles _ltLogFiles, Monitors _monitors,
      DbmsManagerClusterImpl _oiDbmsManagerClusterImpl, PageCacheTracer _pageCacheTracer) {
    this.kreDatabase = _kreDatabase;
    this.monitors = _monitors;
    this.dependencies = _dependencies;
    this.sfStoreResources = _fsStoreResources;
    this.ltLogFiles = _ltLogFiles;
    this.log = _kreDatabase.getInternalLogProvider().getLog(this.getClass());
    this.oiDbmsManagerClusterImpl = _oiDbmsManagerClusterImpl;
    this.pageCacheTracer = _pageCacheTracer;
  }


  private StoreId _restidfdStoreId() {
    try {

      CursorContext _cursorContext =
          new CursorContext(this.pageCacheTracer.createPageCursorTracer(
              io.github.onograph.TokenConstants.READ_REPLICA_STORE_ID_READER));

      StoreId _storeId;
      try {
        _storeId = this.sfStoreResources.redsoiStoreId(_cursorContext,
            this.kreDatabase.getDatabaseLayout());
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
      return _storeId;
    } catch (

        IOException _iOException) {

      return null;
    }
  }


  public void dee() throws IOException {
    this.sfStoreResources.deeForLo(this.kreDatabase.getDatabaseLayout(), this.ltLogFiles);
  }


  public Dependencies getDependencies() {
    return this.dependencies;
  }


  public Database getKreDatabase() {
    return this.kreDatabase;
  }


  public Monitors getMonitors() {
    return this.monitors;
  }


  public boolean isEmy() throws IOException {
    return this.sfStoreResources.isEmyForDa(this.kreDatabase.getDatabaseLayout());
  }


  public NamedDatabaseId nadaiNamedDatabaseId() {
    return this.kreDatabase.getNamedDatabaseId();
  }


  public Optional<DatabaseId> redasifrdsOptional() {

    CursorContext _cursorContext =
        new CursorContext(this.pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.READ_REPLICA_DATABASE_ID_READER));

    Optional _optional;
    try {

      DatabaseLayout _databaseLayout = this.kreDatabase.getDatabaseLayout();
      _optional = this.sfStoreResources.redasifrdsOptional(_cursorContext, _databaseLayout);
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


  public StoreSyncEnvironment stdocnStoreSyncEnvironment() {
    return new StoreSyncEnvironment(this.sfStoreResources, this.kreDatabase, this.ltLogFiles,
        this.oiDbmsManagerClusterImpl, this.pageCacheTracer);
  }


  io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade stfosrcyDbmsManagerClusterImplStoreSyncOpFacade() {
    return this.oiDbmsManagerClusterImpl.stfosrcyDbmsManagerClusterImplStoreSyncOpFacade(
        this.kreDatabase.getNamedDatabaseId());
  }


  public StoreId stridStoreId() {
    return this._restidfdStoreId();
  }
}
