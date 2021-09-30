package io.github.onograph.dbms.gdb;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.lifecycle.Lifecycle;

class DefaultStandaloneDatabaseContextTest {

  @Test
  void testConstructor() {
    Database database = mock(Database.class);
    when(database.getDatabaseFacade()).thenReturn(null);
    DefaultStandaloneDatabaseContext actualDefaultStandaloneDatabaseContext = new DefaultStandaloneDatabaseContext(
        database, new Gdb(new ArrayList<Lifecycle>()));

    assertNull(actualDefaultStandaloneDatabaseContext.dependencies());
    assertNull(actualDefaultStandaloneDatabaseContext.databaseFacade());
    verify(database).getDatabaseFacade();
  }
}

