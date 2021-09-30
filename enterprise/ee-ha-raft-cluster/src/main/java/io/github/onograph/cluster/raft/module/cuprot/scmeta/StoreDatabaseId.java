package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.Objects;
import org.neo4j.storageengine.api.StoreId;


public class StoreDatabaseId {


  private final StoreId storeId;

  public StoreDatabaseId(StoreId _storeId) {
    this.storeId = _storeId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      StoreDatabaseId _thStoreDatabaseId = (StoreDatabaseId) obj;
      return Objects.equals(this.storeId, _thStoreDatabaseId.storeId);
    } else {
      return false;
    }
  }


  public StoreId getStoreId() {
    return this.storeId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.storeId);
  }


}
