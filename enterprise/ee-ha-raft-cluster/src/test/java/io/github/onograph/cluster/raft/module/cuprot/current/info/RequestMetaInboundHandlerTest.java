package io.github.onograph.cluster.raft.module.cuprot.current.info;

import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import org.junit.jupiter.api.Test;
import org.neo4j.dbms.CommunityDatabaseStateService;

class RequestMetaInboundHandlerTest {

  @Test
  void testConstructor() {

    CommunityDatabaseStateService _databaseStateService = new CommunityDatabaseStateService(null);
    new RequestMetaInboundHandler(null, _databaseStateService, new ServerRef());
  }
}

