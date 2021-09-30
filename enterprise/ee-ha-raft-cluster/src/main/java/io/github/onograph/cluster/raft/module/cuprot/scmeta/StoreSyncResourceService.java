package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.nio.file.Path;
import java.util.stream.Stream;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.storageengine.api.StoreFileMetadata;


public class StoreSyncResourceService implements AutoCloseable {


  private final AutoClosableFutureListener lcAutoClosableFutureListener = new AutoClosableFutureListener();


  private final Path[] prPathArray;


  private final ResourceIterator<StoreFileMetadata> resourceIteratorFaStoreFileMetadata;

  StoreSyncResourceService(ResourceIterator<StoreFileMetadata> _resourceIteratorFaStoreFileMetadata,
      Path[] _rpPathArray) {
    this.prPathArray = _rpPathArray;
    this.resourceIteratorFaStoreFileMetadata = _resourceIteratorFaStoreFileMetadata;
  }

  @Override
  public void close() {
    this.resourceIteratorFaStoreFileMetadata.close();
  }


  Stream<StoreFileMetadata> geaofnoStream() {
    return this.resourceIteratorFaStoreFileMetadata.stream();
  }


  Path[] getPrPathArray() {
    return this.prPathArray;
  }
}
