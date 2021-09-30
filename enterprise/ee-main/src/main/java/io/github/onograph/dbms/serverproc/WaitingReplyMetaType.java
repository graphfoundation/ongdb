package io.github.onograph.dbms.serverproc;

import org.neo4j.annotations.api.PublicApi;


@PublicApi
public enum WaitingReplyMetaType {


  CaughtUp,

  Incomplete,

  Failed
}
