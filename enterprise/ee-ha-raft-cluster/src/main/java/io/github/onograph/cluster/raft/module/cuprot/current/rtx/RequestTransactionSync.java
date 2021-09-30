package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import java.util.Objects;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.storageengine.api.StoreId;


public class RequestTransactionSync
    extends
    io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId {


  private final StoreId epceStoreId;


  private final long lgItp;


  public RequestTransactionSync(DatabaseId _databaseId, StoreId _epceStoreId, long _lgItp) {
    super(_databaseId, AskMessageType.AMT_TRX_IN_ASK);
    if (_lgItp < 1L) {

      throw new IllegalArgumentException("*** Error: f8fd90f0-4462-4413-b760-96db14de9a22");
    } else {
      this.lgItp = _lgItp;
      this.epceStoreId = _epceStoreId;
    }
  }

  @Override
  public String decbString() {

    String _strVr00 = this.getClass().getSimpleName();
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync.decbString",
        _strVr00, this.getDatabaseId(), this.lgItp);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {
      if (!super.equals(obj)) {
        return false;
      } else {

        RequestTransactionSync _thaRequestTransactionSync = (RequestTransactionSync) obj;
        return this.lgItp == _thaRequestTransactionSync.lgItp && Objects.equals(this.epceStoreId,
            _thaRequestTransactionSync.epceStoreId);
      }
    } else {
      return false;
    }
  }


  public StoreId getEpceStoreId() {
    return this.epceStoreId;
  }


  public long getLgItp() {
    return this.lgItp;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.lgItp, this.epceStoreId);
  }


  public boolean isVad() {
    return this.lgItp >= 1L;
  }


}
