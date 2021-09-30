package io.github.onograph.internal.batchimport;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EnterpriseBatchImporterFactoryTest {

  @Test
  void testConstructor() {
    assertEquals("restartable", (new EnterpriseBatchImporterFactory()).getName());
  }
}

