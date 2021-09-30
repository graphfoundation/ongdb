package io.github.onograph.dbms;

import static org.mockito.Mockito.mock;

import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class StructureMetaServiceTest {

  @Test
  void testFroStructureMetaService() {

    StructureMetaService.froStructureMetaService((Consumer<NamedDatabaseId>) mock(Consumer.class),
        (Consumer<NamedDatabaseId>) mock(Consumer.class), mock(NamedDatabaseId.class));
  }

  @Test
  void testFroStructureMetaService2() {

    StructureMetaService.froStructureMetaService((Consumer<NamedDatabaseId>) mock(Consumer.class),
        (Consumer<NamedDatabaseId>) mock(Consumer.class), null);
  }
}

