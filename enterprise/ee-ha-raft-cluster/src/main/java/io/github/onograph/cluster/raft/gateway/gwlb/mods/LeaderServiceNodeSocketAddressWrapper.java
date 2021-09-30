package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.builtin.routing.RoutingResult;
import org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider;


public class LeaderServiceNodeSocketAddressWrapper {


  private final Config config;


  private final Function<NamedDatabaseId, ServerMetaManager> functionPins;


  private final Log log;


  private final RoutingTableTTLProvider routingTableTTLProvider;


  private final ClusterLeader slClusterLeader;


  public LeaderServiceNodeSocketAddressWrapper(Config _config,
      Function<NamedDatabaseId, ServerMetaManager> _functionPins, LogProvider _logProvider,
      ClusterLeader _lsClusterLeader, RoutingTableTTLProvider _routingTableTTLProvider) {
    this.functionPins = _functionPins;
    this.slClusterLeader = _lsClusterLeader;
    this.config = _config;
    this.routingTableTTLProvider = _routingTableTTLProvider;
    this.log = _logProvider.getLog(this.getClass());
  }


  private List<SocketAddress> _rededList(Boolean _isSs, ServerMetaManager _iscServerMetaManager,
      NamedDatabaseId _namedDatabaseId, LoadBalancingStrategy _plcLoadBalancingStrategy) {

    Boolean _isFora = this.config.get(SettingsDeclarationClusterImpl.settingCleodoeBoolean);

    Boolean _isLora = this.config.get(SettingsDeclarationClusterImpl.settingCleodeBoolean);

    HashSet<LoadBalanceServerMeta> _hashSetRpLoadBalanceServerMeta = new HashSet(
        _iscServerMetaManager.getRtServerMetaAllWrapper().onvsSet());
    if (_isFora || _hashSetRpLoadBalanceServerMeta.isEmpty()) {
      _hashSetRpLoadBalanceServerMeta.addAll(
          _iscServerMetaManager.getFloesServerMetaAllWrapper().onvsSet());
    }

    if (_isLora || _hashSetRpLoadBalanceServerMeta.isEmpty()) {
      _hashSetRpLoadBalanceServerMeta.addAll(
          _iscServerMetaManager.getLaeServerMetaAllWrapper().onvsSet());
    }

    ArrayList<LoadBalanceServerMeta> _arrayListRaesLoadBalanceServerMeta = new ArrayList(
        _plcLoadBalancingStrategy == null ? _hashSetRpLoadBalanceServerMeta
            : _plcLoadBalancingStrategy.aplSet(_hashSetRpLoadBalanceServerMeta));
    if (_isSs || _plcLoadBalancingStrategy == null) {
      Collections.shuffle(_arrayListRaesLoadBalanceServerMeta);
    }

    return _arrayListRaesLoadBalanceServerMeta.stream()
        .map(LoadBalanceServerMeta::getAbSocketAddress).collect(Collectors.toList());
  }


  private List<SocketAddress> _rotenotList(boolean _isSs, ServerMetaManager _iscServerMetaManager,
      LoadBalancingStrategy _plcLoadBalancingStrategy) {
    if (_plcLoadBalancingStrategy == null) {

      List<SocketAddress> _listCrsSocketAddress =
          _iscServerMetaManager.getTcServerMetaAllWrapper().alsvsSet().stream()
              .map(LoadBalanceServerMeta::getAbSocketAddress)
              .collect(Collectors.toList());
      Collections.shuffle(_listCrsSocketAddress);
      return _listCrsSocketAddress;
    } else {

      Set<LoadBalanceServerMeta> _setCrsLoadBalanceServerMeta = _iscServerMetaManager.getTcServerMetaAllWrapper()
          .alsvsSet();

      ArrayList<LoadBalanceServerMeta> _arrayListRpLoadBalanceServerMeta =
          new ArrayList(_plcLoadBalancingStrategy.aplSet(_setCrsLoadBalanceServerMeta));

      ArrayList<LoadBalanceServerMeta> _arrayListRoLoadBalanceServerMeta = new ArrayList(
          _setCrsLoadBalanceServerMeta);
      _arrayListRoLoadBalanceServerMeta.removeAll(_arrayListRpLoadBalanceServerMeta);
      if (_isSs) {
        Collections.shuffle(_arrayListRpLoadBalanceServerMeta);
        Collections.shuffle(_arrayListRoLoadBalanceServerMeta);
      }

      return Stream.concat(_arrayListRpLoadBalanceServerMeta.stream(),
              _arrayListRoLoadBalanceServerMeta.stream())
          .map(LoadBalanceServerMeta::getAbSocketAddress).collect(Collectors.toList());
    }
  }


  private List<SocketAddress> _wrtenotList(NamedDatabaseId _namedDatabaseId) {

    Optional<SocketAddress> _optionalAloSocketAddress = this.slClusterLeader.gelaboadOptional(
        _namedDatabaseId);
    if (_optionalAloSocketAddress.isEmpty()) {

    }

    return _optionalAloSocketAddress.stream().collect(Collectors.toList());
  }


  public RoutingResult crerirsRoutingResult(NamedDatabaseId _namedDatabaseId,
      LoadBalancingStrategy _plcLoadBalancingStrategy) {

    ServerMetaManager _isaServerMetaManager = this.functionPins.apply(_namedDatabaseId);

    long _lgLtt = this.routingTableTTLProvider.nextTTL().toMillis();

    Boolean _isSs = this.config.get(SettingsDeclarationClusterImpl.settingLoaiuBoolean);
    return new RoutingResult(
        this._rotenotList(_isSs, _isaServerMetaManager, _plcLoadBalancingStrategy),
        this._wrtenotList(_namedDatabaseId),
        this._rededList(_isSs, _isaServerMetaManager, _namedDatabaseId, _plcLoadBalancingStrategy),
        _lgLtt);
  }


  public RoutingResult crerirsRoutingResult(NamedDatabaseId _namedDatabaseId) {
    return this.crerirsRoutingResult(_namedDatabaseId, null);
  }
}
