package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.net.InetAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;


public class DiscoverySocketAddressManagerDNSImpl extends DiscoverySocketAddressManagerContImpl {


  private final DomainToInetAddressProvider dnrDomainToInetAddressProvider;


  private final Log log;


  private final Log usLog;


  DiscoverySocketAddressManagerDNSImpl(Config _config, LogService _logService,
      DomainToInetAddressProvider _rndDomainToInetAddressProvider,
      DiscoveryRetryManager _srDiscoveryRetryManager) {
    super(_config, _srDiscoveryRetryManager);
    this.log = _logService.getInternalLog(this.getClass());
    this.usLog = _logService.getUserLog(this.getClass());
    this.dnrDomainToInetAddressProvider = _rndDomainToInetAddressProvider;
  }


  public static MemberNodeService reoeMemberNodeService(Config _config,
      DomainToInetAddressProvider _dnrDomainToInetAddressProvider, LogService _logService) {

    DiscoverySocketAddressManagerDNSImpl _rhDiscoverySocketAddressManagerDNSImpl =
        new DiscoverySocketAddressManagerDNSImpl(_config, _logService,
            _dnrDomainToInetAddressProvider, delrrsaDiscoveryRetryManager(_config));
    return new MemberNodeServiceDiscoveryKickoffImpl(
        _config.get(SettingsDeclarationClusterImpl.settingInacyeList),
        _rhDiscoverySocketAddressManagerDNSImpl);
  }

  @Override
  protected Collection<SocketAddress> reoeocCollection(SocketAddress _aiSocketAddress) {

    Set<SocketAddress> _setAdessSocketAddress = new HashSet();

    InetAddress[] _aiInetAddressArray = this.dnrDomainToInetAddressProvider.revdanmInetAddress(
        _aiSocketAddress.getHostname());
    if (_aiInetAddressArray.length == 0) {

    }

    InetAddress[] _inetAddressArray = _aiInetAddressArray;

    int _iVa = _aiInetAddressArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      InetAddress _aiInetAddress = _inetAddressArray[_iVa2];
      _setAdessSocketAddress.add(
          new SocketAddress(_aiInetAddress.getHostAddress(), _aiSocketAddress.getPort()));
    }

    return _setAdessSocketAddress;
  }
}
