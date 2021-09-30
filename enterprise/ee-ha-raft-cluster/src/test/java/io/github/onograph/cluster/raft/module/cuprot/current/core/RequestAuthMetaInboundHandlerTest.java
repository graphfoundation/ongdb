package io.github.onograph.cluster.raft.module.cuprot.current.core;

import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import org.junit.jupiter.api.Test;
import org.neo4j.collection.Dependencies;

class RequestAuthMetaInboundHandlerTest {

  @Test
  void testConstructor() {

    Dependencies _dependencyResolver = new Dependencies();
    new RequestAuthMetaInboundHandler(null, _dependencyResolver, new ServerRef());
  }
}

