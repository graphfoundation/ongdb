package io.github.onograph.cluster.raft.module.cuprot.current.info;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.neo4j.dbms.CommunityDatabaseStateService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.availability.UnavailableException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class MetaServiceTest {

  @Test
  void testGeioMeta() throws UnavailableException {
    DatabaseManager<?> databaseManager = (DatabaseManager<?>) mock(DatabaseManager.class);
    when(databaseManager.getDatabaseContext((NamedDatabaseId) any())).thenReturn(Optional.empty());
    MetaService metaService = new MetaService(databaseManager,
        new CommunityDatabaseStateService(null));
    assertThrows(UnavailableException.class,
        () -> metaService.geioMeta(TestDatabaseIdRepository.randomNamedDatabaseId()));
    verify(databaseManager).getDatabaseContext((NamedDatabaseId) any());
  }
}

