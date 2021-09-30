package io.github.onograph.cluster.raft.share;

import org.neo4j.configuration.GroupSetting;


public abstract class ClusterLoadBalancerGroupSetting extends GroupSetting {


  private final String strNp;


  protected ClusterLoadBalancerGroupSetting(String _strNp, String title) {
    super(title);
    this.strNp = _strNp;
  }

  @Override
  public String getPrefix() {
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.share.ClusterLoadBalancerGroupSetting.getPrefix",
        this.strNp);
  }
}
