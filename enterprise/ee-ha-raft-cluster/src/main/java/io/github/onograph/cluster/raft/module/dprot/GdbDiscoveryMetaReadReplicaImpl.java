package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.config.NodeGroupIdentifier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.DatabaseId;


public class GdbDiscoveryMetaReadReplicaImpl implements GdbDiscoveryMeta {


  private final DiscoverySocketAddresses acDiscoverySocketAddresses;


  private final SocketAddress ascSocketAddress;


  private final Set<NodeGroupIdentifier> setGopNodeGroupIdentifier;


  private final Set<DatabaseId> setIdDatabaseId;

  public GdbDiscoveryMetaReadReplicaImpl(DiscoverySocketAddresses _acDiscoverySocketAddresses,
      SocketAddress _ascSocketAddress, Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier,
      Set<DatabaseId> _setIdDatabaseId) {
    this.acDiscoverySocketAddresses = _acDiscoverySocketAddresses;
    this.ascSocketAddress = _ascSocketAddress;
    this.setGopNodeGroupIdentifier = _setGopNodeGroupIdentifier;
    this.setIdDatabaseId = _setIdDatabaseId;
  }


  public static GdbDiscoveryMetaReadReplicaImpl froGdbDiscoveryMetaReadReplicaImpl(Config _config,
      Set<DatabaseId> _setIdDatabaseId) {

    DiscoverySocketAddresses _ucDiscoverySocketAddresses = DiscoverySocketAddresses.frmcngDiscoverySocketAddresses(
        _config);

    SocketAddress _acSocketAddress = _config.get(
        SettingsDeclarationClusterImpl.settingTranrdeSocketAddress);

    Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = Set.copyOf(
        (Collection) _config.get(SettingsDeclarationClusterImpl.settingSevguList));
    return new GdbDiscoveryMetaReadReplicaImpl(_ucDiscoverySocketAddresses, _acSocketAddress,
        _setGopNodeGroupIdentifier, _setIdDatabaseId);
  }

  @Override
  public SocketAddress cacpsrrSocketAddress() {
    return this.ascSocketAddress;
  }

  @Override
  public DiscoverySocketAddresses contsDiscoverySocketAddresses() {
    return this.acDiscoverySocketAddresses;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbDiscoveryMetaReadReplicaImpl _thGdbDiscoveryMetaReadReplicaImpl = (GdbDiscoveryMetaReadReplicaImpl) obj;
      return
          Objects.equals(this.ascSocketAddress, _thGdbDiscoveryMetaReadReplicaImpl.ascSocketAddress)
              &&
              Objects.equals(this.acDiscoverySocketAddresses,
                  _thGdbDiscoveryMetaReadReplicaImpl.acDiscoverySocketAddresses) &&
              Objects.equals(this.setGopNodeGroupIdentifier,
                  _thGdbDiscoveryMetaReadReplicaImpl.setGopNodeGroupIdentifier) &&
              Objects.equals(this.setIdDatabaseId,
                  _thGdbDiscoveryMetaReadReplicaImpl.setIdDatabaseId);
    } else {
      return false;
    }
  }

  @Override
  public Set<NodeGroupIdentifier> gruSet() {
    return this.setGopNodeGroupIdentifier;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.ascSocketAddress, this.acDiscoverySocketAddresses,
        this.setGopNodeGroupIdentifier, this.setIdDatabaseId);
  }

  @Override
  public Set<DatabaseId> stedaiSet() {
    return this.setIdDatabaseId;
  }


}
