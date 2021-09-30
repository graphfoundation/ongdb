package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import java.util.Objects;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.storageengine.api.StoreId;


public class StoreSyncRequest
    extends
    io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId {


  private final StoreId storeId;


  public StoreSyncRequest(DatabaseId _databaseId, StoreId _epceStoreId) {
    super(_databaseId, AskMessageType.AMT_SET_SC);
    this.storeId = _epceStoreId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {
      if (!super.equals(obj)) {
        return false;
      } else {

        StoreSyncRequest _thStoreSyncRequest = (StoreSyncRequest) obj;
        return Objects.equals(this.storeId, _thStoreSyncRequest.storeId);
      }
    } else {
      return false;
    }
  }


  public StoreId getStoreId() {
    return this.storeId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.storeId);
  }


}
