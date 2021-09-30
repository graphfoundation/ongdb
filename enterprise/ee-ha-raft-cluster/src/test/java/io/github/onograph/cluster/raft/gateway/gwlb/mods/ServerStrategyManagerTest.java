package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorDefinedLengthImpl;
import io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GroupSetting;

class ServerStrategyManagerTest {

  @Test
  void testLosepiLoadBalancingStrategies() {
    Config config = mock(Config.class);
    when(config.getGroups((Class<GroupSetting>) any())).thenReturn(
        new HashMap<String, GroupSetting>(1));
    ServerStrategyManager.losepiLoadBalancingStrategies(config, new BufferingLog());
    verify(config).getGroups((Class<GroupSetting>) any());
  }

  @Test
  void testLosepiLoadBalancingStrategies2() {
    HashMap<String, GroupSetting> stringGroupSettingMap = new HashMap<String, GroupSetting>(1);
    stringGroupSettingMap.put("Key", new ClusterLoadBalancingServerPoliciesGroupSetting());
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenReturn(new RuleProcessorDefinedLengthImpl<Object>(1));
    when(config.getGroups((Class<GroupSetting>) any())).thenReturn(stringGroupSettingMap);
    ServerStrategyManager.losepiLoadBalancingStrategies(config, new BufferingLog());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
    verify(config).getGroups((Class<GroupSetting>) any());
  }
}

