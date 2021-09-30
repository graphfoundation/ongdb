package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;


public class StoreGdbEnvironmentWrapper {


  private final DatabaseLayout databaseLayout;


  private final StoreResources fsStoreResources;


  private final NamedDatabaseId namedDatabaseId;


  private final LogFiles tlLogFiles;


  public StoreGdbEnvironmentWrapper(DatabaseLayout _databaseLayout,
      StoreResources _fsStoreResources, LogFiles _ltLogFiles, NamedDatabaseId _namedDatabaseId) {
    this.databaseLayout = _databaseLayout;
    this.fsStoreResources = _fsStoreResources;
    this.namedDatabaseId = _namedDatabaseId;
    this.tlLogFiles = _ltLogFiles;
  }


  void deesefs() throws IOException {
    this.fsStoreResources.deeForLo(this.databaseLayout, this.tlLogFiles);
  }


  DatabaseLayout getDatabaseLayout() {
    return this.databaseLayout;
  }


  NamedDatabaseId getNamedDatabaseId() {
    return this.namedDatabaseId;
  }


  void reetsols() throws IOException {
    this.fsStoreResources.deeForLo(this.tlLogFiles);
  }


  void relewtForPa(Path _psPath) throws IOException {
    this.deesefs();
    this.fsStoreResources.moetForPaDaLo(this.tlLogFiles, _psPath, this.databaseLayout);
  }
}
