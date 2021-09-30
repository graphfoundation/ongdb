package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.config.NodeGroupIdentifier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.DatabaseId;


public class GdbDiscoveryMetaCoreImpl implements GdbDiscoveryMeta {


  private final DiscoverySocketAddresses acDiscoverySocketAddresses;


  private final SocketAddress scSocketAddress;


  private final Set<NodeGroupIdentifier> setGopNodeGroupIdentifier;


  private final Set<DatabaseId> setIdsDatabaseId;


  private final SocketAddress srSocketAddress;


  public GdbDiscoveryMetaCoreImpl(DiscoverySocketAddresses _acDiscoverySocketAddresses,
      SocketAddress _csSocketAddress, Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier,
      Set<DatabaseId> _setIdsDatabaseId, SocketAddress _srSocketAddress) {
    this.acDiscoverySocketAddresses = _acDiscoverySocketAddresses;
    this.scSocketAddress = _csSocketAddress;
    this.setGopNodeGroupIdentifier = _setGopNodeGroupIdentifier;
    this.setIdsDatabaseId = _setIdsDatabaseId;
    this.srSocketAddress = _srSocketAddress;
  }


  public static GdbDiscoveryMetaCoreImpl frmrwGdbDiscoveryMetaCoreImpl(Config _config,
      Set<DatabaseId> _setIdDatabaseId) {

    SocketAddress _arSocketAddress = _config.get(
        SettingsDeclarationClusterImpl.settingRadidsSocketAddress);

    SocketAddress _acSocketAddress = _config.get(
        SettingsDeclarationClusterImpl.settingTranrdeSocketAddress);

    DiscoverySocketAddresses _ucDiscoverySocketAddresses = DiscoverySocketAddresses.frmcngDiscoverySocketAddresses(
        _config);

    Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = Set.copyOf(
        (Collection) _config.get(SettingsDeclarationClusterImpl.settingSevguList));
    return new GdbDiscoveryMetaCoreImpl(_ucDiscoverySocketAddresses, _acSocketAddress,
        _setGopNodeGroupIdentifier, _setIdDatabaseId, _arSocketAddress);
  }


  public static GdbDiscoveryMetaCoreImpl froGdbDiscoveryMetaCoreImpl(Config _config,
      Set<DatabaseId> _setIdDatabaseId) {
    return frmrwGdbDiscoveryMetaCoreImpl(_config, _setIdDatabaseId);
  }

  @Override
  public SocketAddress cacpsrrSocketAddress() {
    return this.scSocketAddress;
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

      GdbDiscoveryMetaCoreImpl _thGdbDiscoveryMetaCoreImpl = (GdbDiscoveryMetaCoreImpl) obj;
      return Objects.equals(this.srSocketAddress, _thGdbDiscoveryMetaCoreImpl.srSocketAddress) &&
          Objects.equals(this.scSocketAddress, _thGdbDiscoveryMetaCoreImpl.scSocketAddress) &&
          Objects.equals(this.acDiscoverySocketAddresses,
              _thGdbDiscoveryMetaCoreImpl.acDiscoverySocketAddresses) &&
          Objects.equals(this.setGopNodeGroupIdentifier,
              _thGdbDiscoveryMetaCoreImpl.setGopNodeGroupIdentifier) &&
          Objects.equals(this.setIdsDatabaseId, _thGdbDiscoveryMetaCoreImpl.setIdsDatabaseId);
    } else {
      return false;
    }
  }


  public SocketAddress getSrSocketAddress() {
    return this.srSocketAddress;
  }

  @Override
  public Set<NodeGroupIdentifier> gruSet() {
    return this.setGopNodeGroupIdentifier;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.srSocketAddress, this.scSocketAddress, this.acDiscoverySocketAddresses,
        this.setGopNodeGroupIdentifier,
        this.setIdsDatabaseId);
  }

  @Override
  public Set<DatabaseId> stedaiSet() {
    return this.setIdsDatabaseId;
  }


}
