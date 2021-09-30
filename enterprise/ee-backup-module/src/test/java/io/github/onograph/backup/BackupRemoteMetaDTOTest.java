package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.storageengine.api.StoreId;

class BackupRemoteMetaDTOTest {

  @Test
  void testConstructor() {
    SocketAddress socketAddress = new SocketAddress("localhost");
    NamedDatabaseId _namedDatabaseId = mock(NamedDatabaseId.class);
    StoreId storeId = new StoreId(1L);
    BackupRemoteMetaDTO actualBackupRemoteMetaDTO = new BackupRemoteMetaDTO(socketAddress,
        _namedDatabaseId, storeId);

    assertSame(socketAddress, actualBackupRemoteMetaDTO.getRaSocketAddress());
    assertSame(storeId, actualBackupRemoteMetaDTO.getRmtStoreId());
  }
}

