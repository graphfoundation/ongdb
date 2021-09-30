package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta;
import io.github.onograph.cluster.raft.gateway.gwlb.mods.RuleProcessorConfigurator;
import org.neo4j.configuration.SettingValueParser;
import org.neo4j.graphdb.config.Setting;


public final class ClusterLoadBalancingServerPoliciesGroupSetting extends
    ClusterLoadBalancerGroupSetting {


  private static final SettingValueParser<RuleProcessor<LoadBalanceServerMeta>> SETTING_VALUE_PARSER_PAS_RULE_PROCESSOR =
      new SettingValueParser<RuleProcessor<LoadBalanceServerMeta>>() {
        @Override
        public String getDescription() {
          return io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting.getDescription");
        }

        @Override
        public Class getType() {
          return RuleProcessor.class;
        }

        @Override
        public RuleProcessor<LoadBalanceServerMeta> parse(String val) {
          try {
            return RuleProcessorConfigurator.pasRuleProcessor(val);
          } catch (

              FilterException _filterException) {

            throw new IllegalArgumentException("*** Error:  11e25632-e3be-4320-8019-055e7aa58820",
                _filterException);
          }
        }
      };


  public final Setting<RuleProcessor<LoadBalanceServerMeta>> val;

  public ClusterLoadBalancingServerPoliciesGroupSetting() {
    super(null, null);
    this.val = this.getBuilder(SETTING_VALUE_PARSER_PAS_RULE_PROCESSOR, null).build();
  }

  private ClusterLoadBalancingServerPoliciesGroupSetting(String title) {
    super(io.github.onograph.TokenConstants.SERVER_POLICIES, title);
    this.val = this.getBuilder(SETTING_VALUE_PARSER_PAS_RULE_PROCESSOR, null).build();
  }


  public static ClusterLoadBalancingServerPoliciesGroupSetting gruClusterLoadBalancingServerPoliciesGroupSetting(
      String title) {
    return new ClusterLoadBalancingServerPoliciesGroupSetting(title);
  }
}
