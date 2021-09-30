package io.github.onograph.kernel.srv.log.query;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QueryLoggingServiceExtensionFactoryTest {

  @Test
  void testConstructor() {
    assertEquals("query-logging", (new QueryLoggingServiceExtensionFactory()).getName());
  }
}

