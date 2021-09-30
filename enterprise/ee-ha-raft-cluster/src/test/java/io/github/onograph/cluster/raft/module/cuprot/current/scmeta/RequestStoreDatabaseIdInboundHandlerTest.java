package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import org.junit.jupiter.api.Test;

class RequestStoreDatabaseIdInboundHandlerTest {

  @Test
  void testConstructor() {

    new RequestStoreDatabaseIdInboundHandler(null, new ServerRef());
  }
}

