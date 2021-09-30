package io.github.onograph.kernel.srv.pagecache;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CachePopulatorExtensionFactoryTest {

  @Test
  void testConstructor() {
    assertEquals("pagecachewarmer", (new CachePopulatorExtensionFactory()).getName());
  }
}

