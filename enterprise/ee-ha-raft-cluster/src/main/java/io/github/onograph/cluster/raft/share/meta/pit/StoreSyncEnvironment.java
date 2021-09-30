package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import io.github.onograph.dbms.DbmsManagerClusterImpl;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.logging.Log;
import org.neo4j.storageengine.api.StoreId;


public class StoreSyncEnvironment {


  private static final String DST_DONA_DST_UID_RDXR_LT = io.github.onograph.TokenConstants.STORE_DOWNLOAD_STORE_ID_READER;


  private final Database kreDatabase;


  private final Log log;


  private final LogFiles ltLogFiles;


  private final DbmsManagerClusterImpl oiDbmsManagerClusterImpl;


  private final PageCacheTracer pageCacheTracer;


  private final StoreResources sfStoreResources;


  private volatile StoreId storeId;


  public StoreSyncEnvironment(StoreResources _fsStoreResources, Database _kreDatabase,
      LogFiles _ltLogFiles, DbmsManagerClusterImpl _oiDbmsManagerClusterImpl,
      PageCacheTracer _pageCacheTracer) {
    this.kreDatabase = _kreDatabase;
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
              io.github.onograph.TokenConstants.STORE_DOWNLOAD_STORE_ID_READER));

      StoreId _storeId;
      try {
        _storeId = this.sfStoreResources.redsoiStoreId(_cursorContext,
            this.daaslauDatabaseLayout());
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


  NamedDatabaseId daasidNamedDatabaseId() {
    return this.kreDatabase.getNamedDatabaseId();
  }


  DatabaseLayout daaslauDatabaseLayout() {
    return this.kreDatabase.getDatabaseLayout();
  }


  void dee() throws IOException {
    this.sfStoreResources.deeForLo(this.daaslauDatabaseLayout(), this.ltLogFiles);
  }


  public Database getKreDatabase() {
    return this.kreDatabase;
  }


  boolean isHasr() throws IOException {
    return !this.sfStoreResources.isEmyForDa(this.daaslauDatabaseLayout());
  }


  public void relewtForPa(Path _psPath) throws IOException {
    this.sfStoreResources.deeForLo(this.daaslauDatabaseLayout(), this.ltLogFiles);
    this.sfStoreResources.moetForPaDaLo(this.ltLogFiles, _psPath, this.daaslauDatabaseLayout());
  }


  io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade stfosrcyDbmsManagerClusterImplStoreSyncOpFacade() {
    return this.oiDbmsManagerClusterImpl.stfosrcyDbmsManagerClusterImplStoreSyncOpFacade(
        this.kreDatabase.getNamedDatabaseId());
  }


  public StoreId stridStoreId() {
    if (this.storeId == null) {
      this.storeId = this._restidfdStoreId();
    }

    return this.storeId;
  }
}
