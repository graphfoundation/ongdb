package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import java.nio.file.Path;
import java.util.Objects;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.storageengine.api.StoreId;


public class RequestStoreResource
    extends
    io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId {


  private final StoreId epceStoreId;


  private final long lgItr;


  private final Path path;


  public RequestStoreResource(DatabaseId _databaseId, StoreId _epceStoreId, long _lgItr,
      Path _path) {
    super(_databaseId, AskMessageType.AMT_SC_FP);
    this.epceStoreId = _epceStoreId;
    this.lgItr = _lgItr;
    this.path = _path;
  }

  @Override
  public String decbString() {

    String _strVr00 = this.getClass().getSimpleName();
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource.decbString",
        _strVr00, this.getDatabaseId(), this.path.getFileName(), this.getLgItr());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {
      if (!super.equals(obj)) {
        return false;
      } else {

        RequestStoreResource _thaRequestStoreResource = (RequestStoreResource) obj;
        return this.lgItr == _thaRequestStoreResource.lgItr && Objects.equals(this.path,
            _thaRequestStoreResource.path) &&
            Objects.equals(this.epceStoreId, _thaRequestStoreResource.epceStoreId);
      }
    } else {
      return false;
    }
  }


  public final StoreId getEpceStoreId() {
    return this.epceStoreId;
  }


  public final long getLgItr() {
    return this.lgItr;
  }


  public Path getPath() {
    return this.path;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.path, this.epceStoreId, this.lgItr);
  }


}
