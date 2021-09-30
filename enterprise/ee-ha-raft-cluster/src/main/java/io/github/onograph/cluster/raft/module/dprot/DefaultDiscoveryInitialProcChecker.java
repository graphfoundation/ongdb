package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import java.nio.file.Files;


public class DefaultDiscoveryInitialProcChecker implements DiscoveryInitialProcChecker {


  private final ClusterMetaTopologyInfo lscClusterMetaTopologyInfo;

  public DefaultDiscoveryInitialProcChecker(ClusterMetaTopologyInfo _cslClusterMetaTopologyInfo) {
    this.lscClusterMetaTopologyInfo = _cslClusterMetaTopologyInfo;
  }

  @Override
  public Boolean isFitsauBoolean() {
    return Files.notExists(
        this.lscClusterMetaTopologyInfo.ragridfPath(io.github.onograph.TokenConstants.SYSTEM));
  }
}
