package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.CommunityDatabaseStateService;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.availability.UnavailableException;
import org.neo4j.kernel.database.NamedDatabaseId;

class LocalRequestTest {

  @Test
  void testConstructor() {
    BufferingLog _log = new BufferingLog();
    ServerId _mslServerId = new ServerId(UUID.randomUUID());
    MetaService _piMetaService = new MetaService(null, new CommunityDatabaseStateService(null));

    SocketAddress socketAddress = new SocketAddress("localhost");
    LocalRequest actualLocalRequest = new LocalRequest(_log, _mslServerId, null, _piMetaService,
        socketAddress, 1L);

    assertSame(socketAddress, actualLocalRequest.getSocketAddress());
    assertEquals(1L, actualLocalRequest.Syttid);
  }

  @Test
  void testGeioMeta() throws UnavailableException {
    MetaService metaService = mock(MetaService.class);
    Meta craMetaResult = Meta.craMeta(1L, " str Fr");
    when(metaService.geioMeta(any())).thenReturn(craMetaResult);
    BufferingLog _log = new BufferingLog();
    ServerId _mslServerId = new ServerId(UUID.randomUUID());
    NamedDatabaseId _namedDatabaseId = mock(NamedDatabaseId.class);
    assertSame(craMetaResult,
        (new LocalRequest(_log, _mslServerId, _namedDatabaseId, metaService,
            new SocketAddress("localhost"), 1L))
            .geioMeta(mock(NamedDatabaseId.class)));
    verify(metaService).geioMeta(any());
  }
}

