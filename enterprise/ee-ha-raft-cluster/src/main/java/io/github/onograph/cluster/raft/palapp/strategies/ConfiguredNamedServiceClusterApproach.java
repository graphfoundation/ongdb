package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.RuleProcessorConfigurator;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class ConfiguredNamedServiceClusterApproach extends AbstractNamedServiceClusterApproach {


  public static final String IDNT = io.github.onograph.TokenConstants.USER_DEFINED;


  private Optional<RuleProcessor<LoadBalanceServerMeta>> optionalFlesRuleProcessor;

  public ConfiguredNamedServiceClusterApproach() {
    super(io.github.onograph.TokenConstants.USER_DEFINED);
  }


  private Stream<ServerId> _chStream(NamedDatabaseId _namedDatabaseId,
      RuleProcessor<LoadBalanceServerMeta> _ruleProcessorFleLoadBalanceServerMeta) {

    Set<LoadBalanceServerMeta> _setSpLoadBalanceServerMeta = this._pobsrSet(_namedDatabaseId);
    return _ruleProcessorFleLoadBalanceServerMeta.aplSet(_setSpLoadBalanceServerMeta).stream()
        .map(LoadBalanceServerMeta::getServerId)
        .filter((memberId) ->
        {
          return !Objects.equals(this.myeServerId, memberId);
        });
  }


  private Set<LoadBalanceServerMeta> _pobsrSet(NamedDatabaseId _namedDatabaseId) {

    DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure = this.clusterStructureService.cotogfdaDatabaseCoreClusterStructure(
        _namedDatabaseId);

    DatabaseReadReplicaClusterStructure _rrtDatabaseReadReplicaClusterStructure =
        this.clusterStructureService.rereatlfodaDatabaseReadReplicaClusterStructure(
            _namedDatabaseId);

    Stream<? extends Entry<ServerId, ? extends GdbDiscoveryMeta>> _streamImEntry =
        Stream.of(_tcDatabaseCoreClusterStructure, _rrtDatabaseReadReplicaClusterStructure)
            .map(ClusterStructure::sevsMap).map(Map::entrySet)
            .flatMap(Collection::stream);
    return _streamImEntry.map(this::_toseeinLoadBalanceServerMeta).collect(Collectors.toSet());
  }


  private <T extends GdbDiscoveryMeta> LoadBalanceServerMeta _toseeinLoadBalanceServerMeta(
      Entry<ServerId, T> _entryEtyst) {

    T _tSre = _entryEtyst.getValue();

    ServerId _serverId = _entryEtyst.getKey();
    return new LoadBalanceServerMeta(_tSre.contsDiscoverySocketAddresses().cltbasSocketAddress(),
        _serverId, _tSre.gruSet());
  }

  @Override
  public void setup() {

    String _strCf = this.config.get(SettingsDeclarationClusterImpl.settingUsedreiryString);

    try {

      RuleProcessor<LoadBalanceServerMeta> _ruleProcessorPreLoadBalanceServerMeta = RuleProcessorConfigurator.pasRuleProcessor(
          _strCf);
      this.optionalFlesRuleProcessor = Optional.of(_ruleProcessorPreLoadBalanceServerMeta);


    } catch (

        FilterException _filterException) {
      this.optionalFlesRuleProcessor = Optional.empty();


    }
  }

  @Override
  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId) {
    return this.optionalFlesRuleProcessor.stream().flatMap((filters) ->
    {
      return this._chStream(_namedDatabaseId, filters);
    }).collect(Collectors.toList());
  }

  @Override
  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId) {
    return this.optionalFlesRuleProcessor.flatMap((filters) ->
    {
      return this._chStream(_namedDatabaseId, filters).findFirst();
    });
  }
}
