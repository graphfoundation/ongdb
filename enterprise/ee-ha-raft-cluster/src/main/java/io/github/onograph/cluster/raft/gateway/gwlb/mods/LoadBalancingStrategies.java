package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl;
import java.util.HashMap;
import java.util.Map;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.api.exceptions.Status.Procedure;
import org.neo4j.logging.Log;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.MapValue;


public class LoadBalancingStrategies {


  public static final String RULE_MK = io.github.onograph.TokenConstants.POLICY;


  static final LoadBalancingStrategy STD_RULE = new LoadBalancingStrategyRuleProcessorImpl(
      RuleProcessorKnownImpl.asRuleProcessorKnownImpl());


  static final String STD_RULE_NME = io.github.onograph.TokenConstants.DEFAULT;


  private final Log log;


  private final Map<String, LoadBalancingStrategy> mapPlcesl = new HashMap();

  LoadBalancingStrategies(Log _log) {
    this.log = _log;
  }


  private LoadBalancingStrategy _deatplyLoadBalancingStrategy() {

    LoadBalancingStrategy _drLoadBalancingStrategy = this.mapPlcesl.get(
        io.github.onograph.TokenConstants.DEFAULT);
    return _drLoadBalancingStrategy != null ? _drLoadBalancingStrategy : STD_RULE;
  }


  void adpiForStLo(LoadBalancingStrategy _plcLoadBalancingStrategy, String _strNp) {

    LoadBalancingStrategy _opLoadBalancingStrategy = this.mapPlcesl.putIfAbsent(_strNp,
        _plcLoadBalancingStrategy);
    if (_opLoadBalancingStrategy != null) {

    }
  }


  LoadBalancingStrategy seefLoadBalancingStrategy(MapValue _cnetMapValue)
      throws ProcedureException {

    AnyValue _npAnyValue = _cnetMapValue.get(io.github.onograph.TokenConstants.POLICY);
    if (_npAnyValue == Values.NO_VALUE) {
      return this._deatplyLoadBalancingStrategy();
    } else {

      LoadBalancingStrategy _psLoadBalancingStrategy = this.mapPlcesl.get(
          ((TextValue) _npAnyValue).stringValue());
      if (_psLoadBalancingStrategy == null) {

        throw new ProcedureException(Procedure.ProcedureCallFailed,
            "*** Error: 35edccf7-ce9a-46b9-be30-b803df047a73");
      } else {
        return _psLoadBalancingStrategy;
      }
    }
  }
}
