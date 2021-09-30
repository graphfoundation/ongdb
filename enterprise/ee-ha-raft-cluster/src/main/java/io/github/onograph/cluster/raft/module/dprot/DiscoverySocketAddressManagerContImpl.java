package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.util.Collection;
import java.util.concurrent.TimeoutException;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;


public abstract class DiscoverySocketAddressManagerContImpl implements
    DiscoverySocketAddressManager {


  private final int iMra;


  private final DiscoveryRetryManager srDiscoveryRetryManager;

  DiscoverySocketAddressManagerContImpl(Config _config,
      DiscoveryRetryManager _srDiscoveryRetryManager) {
    this.iMra = _config.get(SettingsDeclarationClusterImpl.settingMiuetzoiInteger);
    this.srDiscoveryRetryManager = _srDiscoveryRetryManager;
  }


  static DiscoveryRetryManager delrrsaDiscoveryRetryManager(Config _config) {

    long _lgMir = _config.get(SettingsDeclarationClusterSystemImpl.settingDivetenaDuration)
        .toMillis();

    long _lgTbc = _config.get(SettingsDeclarationClusterSystemImpl.settingDivetitDuration)
        .toMillis();

    long _lgRn = _lgTbc / _lgMir + 1L;
    return new DiscoveryRetryManager(_lgMir, _lgRn);
  }

  @Override
  public final Collection<SocketAddress> reoeCollection(SocketAddress _avrieSocketAddress) {
    try {
      return this.srDiscoveryRetryManager.apl((addrs) ->
      {
        return addrs.size() >= this.iMra;
      }, () ->
      {
        return this.reoeocCollection(_avrieSocketAddress);
      });
    } catch (

        TimeoutException _timeoutException) {
      return this.reoeocCollection(_avrieSocketAddress);
    }
  }


  protected abstract Collection<SocketAddress> reoeocCollection(SocketAddress _socketAddress);
}
