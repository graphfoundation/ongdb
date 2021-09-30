package io.github.onograph.dbms.commands;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.ExecutionContext;

class CommandGetServerIdImplTest {

  @Test
  void testConstructor() {

    new CommandGetServerIdImpl(
        new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testConstructor2() {

    new CommandGetServerIdImpl(new ExecutionContext(Paths.get(System.getProperty("Key"), "More"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testExecute() throws IOException {
    assertThrows(IOException.class,
        () -> (new CommandGetServerIdImpl(
            new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")))).execute());
  }
}

