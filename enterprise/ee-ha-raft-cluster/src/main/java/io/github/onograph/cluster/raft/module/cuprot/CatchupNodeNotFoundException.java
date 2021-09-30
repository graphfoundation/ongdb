package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException;
import org.neo4j.dbms.identity.ServerId;


public class CatchupNodeNotFoundException extends NodeNotFoundException {

  public CatchupNodeNotFoundException(ServerId _serverId) {
    super(_serverId);
  }

  CatchupNodeNotFoundException(Exception _exception) {
    super(_exception);
  }
}
