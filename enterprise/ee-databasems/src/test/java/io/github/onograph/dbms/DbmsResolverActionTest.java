package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class DbmsResolverActionTest {

  @Test
  void testPaietaeDbmsResolverActionRequiresGeneration() {
    NamedDatabaseId namedDatabaseId = mock(NamedDatabaseId.class);
    when(namedDatabaseId.name()).thenReturn("Name");
    DbmsResolverAction actualCreateResult = DbmsResolverAction
        .paietaeDbmsResolverActionRequiresGeneration(namedDatabaseId, new Throwable())
        .create();
    verify(namedDatabaseId).name();
    assertFalse(actualCreateResult.isSil());
  }

  @Test
  void testPritrDbmsResolverActionHasImportant() {
    assertTrue(DbmsResolverAction
        .pritrDbmsResolverActionHasImportant(
            new HashSet<NamedDatabaseId>()) instanceof DbmsResolverAction.Generator);
  }

  @Test
  void testProttaeDbmsResolverActionHasImportant() {
    assertTrue(DbmsResolverAction
        .prottaeDbmsResolverActionHasImportant(
            mock(NamedDatabaseId.class)) instanceof DbmsResolverAction.Generator);
  }

  @Test
  void testSipDbmsResolverAction() {

    DbmsResolverAction.sipDbmsResolverAction();
  }

  @Test
  void testTagsDbmsResolverActionHasDefined() {
    assertTrue(DbmsResolverAction
        .tagsDbmsResolverActionHasDefined(
            new HashSet<NamedDatabaseId>()) instanceof DbmsResolverAction.Generator);
  }
}

