package io.github.onograph.cluster.raft.share.meta.cm;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.Log;


public final class UpgradeMetaEnv {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final ClusterSimpleStorageFacade fsscClusterSimpleStorageFacade;


  private final Log log;


  private final ClusterMetaTopologyInfo lscClusterMetaTopologyInfo;


  private final ClusterMetaFormat mtvClusterMetaFormat;


  public UpgradeMetaEnv(FileSystemAbstraction _fFileSystemAbstraction,
      ClusterSimpleStorageFacade _fsscClusterSimpleStorageFacade, Log _log,
      ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo,
      ClusterMetaFormat _vscClusterMetaFormat) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.fsscClusterSimpleStorageFacade = _fsscClusterSimpleStorageFacade;
    this.log = _log;
    this.lscClusterMetaTopologyInfo = _lscClusterMetaTopologyInfo;
    this.mtvClusterMetaFormat = _vscClusterMetaFormat;
  }


  public FileSystemAbstraction getFFileSystemAbstraction() {
    return this.fFileSystemAbstraction;
  }


  public ClusterSimpleStorageFacade getFsscClusterSimpleStorageFacade() {
    return this.fsscClusterSimpleStorageFacade;
  }


  public Log getLog() {
    return this.log;
  }


  public ClusterMetaTopologyInfo getLscClusterMetaTopologyInfo() {
    return this.lscClusterMetaTopologyInfo;
  }


  public ClusterMetaFormat getMtvClusterMetaFormat() {
    return this.mtvClusterMetaFormat;
  }
}
