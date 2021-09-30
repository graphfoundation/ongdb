package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import org.junit.jupiter.api.Test;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class RequestGdbIdInboundHandlerTest {

  @Test
  void testConstructor() {

    DatabaseManager<?> databaseManager = (DatabaseManager<?>) mock(DatabaseManager.class);
    when(databaseManager.databaseIdRepository()).thenReturn(new TestDatabaseIdRepository());
    new RequestGdbIdInboundHandler(databaseManager, new ServerRef());
  }
}

