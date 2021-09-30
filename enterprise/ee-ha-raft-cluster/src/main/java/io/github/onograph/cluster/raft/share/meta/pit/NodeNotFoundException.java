package io.github.onograph.cluster.raft.share.meta.pit;

import org.neo4j.dbms.identity.ServerId;


public class NodeNotFoundException extends Exception {

  public NodeNotFoundException(Throwable _cueThrowable) {
    super(_cueThrowable);
  }

  public NodeNotFoundException(ServerId _serverId) {
    super(String.format(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException.format"),
        _serverId));
  }
}
