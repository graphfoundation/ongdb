package io.github.onograph.config;

import io.github.onograph.cluster.raft.module.dprot.DNSSRVServiceImpl;
import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDNSImpl;
import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl;
import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerSRVImpl;
import io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderImpl;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceK8Impl;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Configuration;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;


@PublicApi
public enum ClusterDiscoveryMode {


  DNS((logService, conf) ->
  {
    return DiscoverySocketAddressManagerDNSImpl.reoeMemberNodeService(conf,
        new DomainToInetAddressProviderImpl(), logService);
  }, new Setting[]{SettingsDeclarationClusterImpl.settingInacyeList}),

  LIST((logService, conf) ->
  {
    return DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        fiiimrList(conf, logService.getInternalLogProvider()));
  }, new Setting[]{SettingsDeclarationClusterImpl.settingInacyeList}),

  SRV((logService, conf) ->
  {
    return DiscoverySocketAddressManagerSRVImpl.reoeMemberNodeService(conf, logService,
        new DNSSRVServiceImpl());
  }, new Setting[]{SettingsDeclarationClusterImpl.settingInacyeList}),

  K8S(MemberNodeServiceK8Impl::reoeMemberNodeService,
      new Setting[]{SettingsDeclarationClusterImpl.settingKunlstString,
          SettingsDeclarationClusterImpl.settingKunsctString});


  private final ClusterDiscoveryConfigVerifier clusterDiscoveryConfigVerifier;


  private final BiFunction<LogService, Config, MemberNodeService> mnsProvider;

  private ClusterDiscoveryMode(BiFunction<LogService, Config, MemberNodeService> _biFunctionSrlcm,
      Setting<?>... _settingSrObjectArray) {
    this.mnsProvider = _biFunctionSrlcm;
    this.clusterDiscoveryConfigVerifier = new ClusterDiscoveryConfigVerifier(
        Arrays.asList(_settingSrObjectArray));
  }


  static List<SocketAddress> fiiimrList(Config _config, LogProvider _logProvider) {

    List<SocketAddress> _listAiSocketAddress = (List) _config.get(
        SettingsDeclarationClusterImpl.settingInacyeList);

    SocketAddress _alSocketAddress = (SocketAddress) _config.get(
        SettingsDeclarationClusterImpl.settingDivdidsSocketAddress);
    if (!_listAiSocketAddress.contains(_alSocketAddress)) {

    }

    return _listAiSocketAddress;
  }


  void chcseForCo(Configuration _configuration) {
    this.clusterDiscoveryConfigVerifier.chcseForClCo(_configuration, this);
  }


  MemberNodeService gehserlMemberNodeService(Config _config, LogService _logService) {
    return (MemberNodeService) this.mnsProvider.apply(_logService, _config);
  }


  String sendciString() {
    return this.clusterDiscoveryConfigVerifier.sendciString(this);
  }
}
