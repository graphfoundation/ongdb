package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.Address;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import java.util.Collection;
import java.util.Objects;


public class CoreClusterStructure {


  private final Collection<Address> collectionMaAddress;


  private final DatabaseCoreClusterStructure tcDatabaseCoreClusterStructure;


  public CoreClusterStructure(Collection<Address> _collectionMaAddress,
      DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure) {
    this.collectionMaAddress = _collectionMaAddress;
    this.tcDatabaseCoreClusterStructure = _tcDatabaseCoreClusterStructure;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      CoreClusterStructure _thCoreClusterStructure = (CoreClusterStructure) obj;
      return Objects.equals(this.tcDatabaseCoreClusterStructure,
          _thCoreClusterStructure.tcDatabaseCoreClusterStructure) &&
          Objects.equals(this.collectionMaAddress, _thCoreClusterStructure.collectionMaAddress);
    } else {
      return false;
    }
  }


  public Collection<Address> getCollectionMaAddress() {
    return this.collectionMaAddress;
  }


  public DatabaseCoreClusterStructure getTcDatabaseCoreClusterStructure() {
    return this.tcDatabaseCoreClusterStructure;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.tcDatabaseCoreClusterStructure, this.collectionMaAddress);
  }


}
