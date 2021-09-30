package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.kernel.database.Database;
import org.neo4j.storageengine.api.StoreFileMetadata;


public class StoreSyncResourceServiceManager {


  private final Database database;

  public StoreSyncResourceServiceManager(Database _database) {
    this.database = _database;
  }


  StoreSyncResourceService prrsrcyfsStoreSyncResourceService() throws IOException {

    ResourceIterator<StoreFileMetadata> _resourceIteratorIrStoreFileMetadata =
        this.database.getDatabaseFileListing().builder().excludeAll()
            .includeReplayableStorageFiles().build();

    StoreSyncResourceService _storeSyncResourceService;
    try {

      Path[] _wedtpfPathArray = _resourceIteratorIrStoreFileMetadata.stream()
          .map(StoreFileMetadata::path).toArray((i) ->
          {
            return new Path[i];
          });

      ResourceIterator<StoreFileMetadata> _resourceIteratorNstfStoreFileMetadata =
          this.database.getDatabaseFileListing().builder().excludeAll().includeAtomicStorageFiles()
              .includeAdditionalProviders()
              .includeSchemaIndexStoreFiles().includeIdFiles().build();
      _storeSyncResourceService = new StoreSyncResourceService(
          _resourceIteratorNstfStoreFileMetadata, _wedtpfPathArray);
    } catch (

        Throwable _throwable) {
      if (_resourceIteratorIrStoreFileMetadata != null) {
        try {
          _resourceIteratorIrStoreFileMetadata.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_resourceIteratorIrStoreFileMetadata != null) {
      _resourceIteratorIrStoreFileMetadata.close();
    }

    return _storeSyncResourceService;
  }
}
