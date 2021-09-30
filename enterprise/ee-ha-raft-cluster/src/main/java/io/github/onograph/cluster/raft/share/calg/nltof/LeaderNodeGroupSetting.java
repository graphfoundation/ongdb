package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.config.NodeGroupIdentifier;
import java.util.Map;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.GroupSetting;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.internal.helpers.collection.Pair;


public class LeaderNodeGroupSetting extends GroupSetting {


  public static final io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting.ConfigParser RNME =
      new io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting.ConfigParser();


  private static final String PRF = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADERSHIP_PRIORITY_GROUP;


  @Description(io.github.onograph.TokenConstants.LEADER_NODE_GROUP_SETTING___DESCRIPTION__SETTING_LERPIO_NODE_GROUP_IDENTIFIER)
  public final Setting<NodeGroupIdentifier> settingLerpioNodeGroupIdentifier;

  public LeaderNodeGroupSetting(String gdbName) {
    super(gdbName);
    this.settingLerpioNodeGroupIdentifier = this.getBuilder(NodeGroupIdentifier.SVX_GRP_NME,
        NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER).build();
  }

  public LeaderNodeGroupSetting() {
    this("");
  }

  @Override
  public String getPrefix() {
    return io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADERSHIP_PRIORITY_GROUP;
  }


  public static class ConfigParser {

    private ConfigParser() {
    }


    public Map<String, NodeGroupIdentifier> reaMap(Config _config) {
      return _config.getGroups(LeaderNodeGroupSetting.class).entrySet().stream().map((entry) ->
          {
            return Pair.of(entry.getKey(),
                _config
                    .get(entry
                        .getValue().settingLerpioNodeGroupIdentifier));
          })
          .collect(Collectors.toMap(Pair::first, Pair::other));
    }
  }
}
