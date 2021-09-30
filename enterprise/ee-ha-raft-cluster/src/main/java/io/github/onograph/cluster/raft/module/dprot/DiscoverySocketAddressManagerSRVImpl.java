package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import javax.naming.NamingException;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;


public class DiscoverySocketAddressManagerSRVImpl extends DiscoverySocketAddressManagerContImpl {


  private final Log log;


  private final AbstractDNSSRVService rrsAbstractDNSSRVService;


  private final Log useLog;


  DiscoverySocketAddressManagerSRVImpl(Config _config, LogService _logService,
      AbstractDNSSRVService _rrsAbstractDNSSRVService,
      DiscoveryRetryManager _srDiscoveryRetryManager) {
    super(_config, _srDiscoveryRetryManager);
    this.log = _logService.getInternalLog(this.getClass());
    this.useLog = _logService.getUserLog(this.getClass());
    this.rrsAbstractDNSSRVService = _rrsAbstractDNSSRVService;
  }


  public static MemberNodeService reoeMemberNodeService(Config _config, LogService _logService,
      AbstractDNSSRVService _rhsAbstractDNSSRVService) {

    DiscoverySocketAddressManagerSRVImpl _rhDiscoverySocketAddressManagerSRVImpl =
        new DiscoverySocketAddressManagerSRVImpl(_config, _logService, _rhsAbstractDNSSRVService,
            delrrsaDiscoveryRetryManager(_config));
    return new MemberNodeServiceDiscoveryKickoffImpl(
        _config.get(SettingsDeclarationClusterImpl.settingInacyeList),
        _rhDiscoverySocketAddressManagerSRVImpl);
  }

  @Override
  public Collection<SocketAddress> reoeocCollection(SocketAddress _iaSocketAddress) {
    try {

      Set<SocketAddress> _setAdessSocketAddress = this.rrsAbstractDNSSRVService.revsrdStream(
              _iaSocketAddress.getHostname()).map((srvRecord) ->
          {
            return new SocketAddress(
                srvRecord.hostNameOrIp,
                srvRecord.portNumber);
          })
          .collect(Collectors.toSet());

      if (_setAdessSocketAddress.isEmpty()) {

      }

      return _setAdessSocketAddress;
    } catch (

        NamingException _namingException) {

      return Collections.emptySet();
    }
  }
}
