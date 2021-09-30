package io.github.onograph.backup;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.ExecutionContext;

class GdbRestorerCommandTest {

  @Test
  void testConstructor() {

    new GdbRestorerCommand(
        new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testConstructor2() {

    new GdbRestorerCommand(new ExecutionContext(Paths.get(System.getProperty("Key"), "More"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

