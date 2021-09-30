package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import java.io.Closeable;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;

class RemoteRequestTest {

  @Test
  void testConstructor() {
    BufferingLog _log = new BufferingLog();
    RemoteMetaService remoteMetaService = new RemoteMetaService(null,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))));

    ServerId _serverId = new ServerId(UUID.randomUUID());
    SocketAddress _socketAddress = new SocketAddress("localhost");
    SocketAddress socketAddress = new SocketAddress("localhost");
    RemoteRequest actualRemoteRequest = new RemoteRequest(1L, _log, null, remoteMetaService,
        _serverId, _socketAddress,
        socketAddress);

    assertEquals(socketAddress, actualRemoteRequest.getSocketAddress());
    assertEquals(1L, actualRemoteRequest.Syttid);
  }

  @Test
  void testGeioMeta() throws Exception {
    RemoteMetaService remoteMetaService = mock(RemoteMetaService.class);
    Meta craMetaResult = Meta.craMeta(1L, " str Fr");
    when(remoteMetaService.geioMeta(any(), any())).thenReturn(craMetaResult);
    BufferingLog _log = new BufferingLog();
    NamedDatabaseId _namedDatabaseId = mock(NamedDatabaseId.class);
    ServerId _serverId = new ServerId(UUID.randomUUID());
    SocketAddress _socketAddress = new SocketAddress("localhost");
    assertSame(craMetaResult,
        (new RemoteRequest(1L, _log, _namedDatabaseId, remoteMetaService, _serverId,
            _socketAddress, new SocketAddress("localhost"))).geioMeta(mock(NamedDatabaseId.class)));
    verify(remoteMetaService).geioMeta(any(), any());
  }
}

