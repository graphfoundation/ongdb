package io.github.onograph.kernel.srv;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.storageengine.api.StorageReader;

class ValidationServiceTest {

  @Test
  void testGeocepeexnefrfValidationService() {
    StorageReader storageReader = mock(StorageReader.class);
    when(storageReader.getOrCreateSchemaDependantState((Class<Object>) any(),
        (java.util.function.Function<StorageReader, Object>) any())).thenThrow(
        new IllegalStateException("foo"));
    assertThrows(IllegalStateException.class,
        () -> ValidationService.geocepeexnefrfValidationService(storageReader));
    verify(storageReader).getOrCreateSchemaDependantState((Class<Object>) any(),
        (java.util.function.Function<StorageReader, Object>) any());
  }
}

