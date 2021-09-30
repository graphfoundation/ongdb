package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.kernel.database.Database;
import org.neo4j.logging.internal.DatabaseLogProvider;

class RequestStoreResourceInboundHandlerTest {

  @Test
  void testConstructor() {

    Database database = mock(Database.class);
    when(database.getInternalLogProvider()).thenReturn(mock(DatabaseLogProvider.class));
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    ServerRef _poooServerRef = new ServerRef();
    new RequestStoreResourceInboundHandler(database, _fFileSystemAbstraction, _poooServerRef,
        new StoreResourceSyncProcessor(1));
  }
}

