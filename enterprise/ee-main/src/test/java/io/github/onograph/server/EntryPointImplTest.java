package io.github.onograph.server;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.neo4j.server.startup.EntryPoint;

class EntryPointImplTest {

  @Test
  void testConstructor() {
    assertEquals(EntryPoint.Priority.MEDIUM, (new EntryPointImpl()).getPriority());
  }

  @Test
  void testStopBootstrapper() {

    EntryPointImpl.stopBootstrapper(new String[]{" str Arg Array"});
  }
}

