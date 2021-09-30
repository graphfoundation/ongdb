package io.github.onograph.backup;

import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.storageengine.api.StoreId;


public class BackupRemoteMetaDTO {


  private final NamedDatabaseId namedDatabaseId;


  private final SocketAddress raSocketAddress;


  private final StoreId rmtStoreId;


  BackupRemoteMetaDTO(SocketAddress _arSocketAddress, NamedDatabaseId _namedDatabaseId,
      StoreId _rmtStoreId) {
    this.namedDatabaseId = _namedDatabaseId;
    this.raSocketAddress = _arSocketAddress;
    this.rmtStoreId = _rmtStoreId;
  }


  public NamedDatabaseId getNamedDatabaseId() {
    return this.namedDatabaseId;
  }


  public SocketAddress getRaSocketAddress() {
    return this.raSocketAddress;
  }


  public StoreId getRmtStoreId() {
    return this.rmtStoreId;
  }


}
