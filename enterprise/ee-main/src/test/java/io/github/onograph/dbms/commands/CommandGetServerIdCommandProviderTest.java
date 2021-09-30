package io.github.onograph.dbms.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.Command;
import org.neo4j.cli.ExecutionContext;

class CommandGetServerIdCommandProviderTest {

  @Test
  void testCommandType() {
    assertEquals(Command.CommandType.GET_SERVER_ID,
        (new CommandGetServerIdCommandProvider()).commandType());
  }

  @Test
  void testCreateCommand() {

    CommandGetServerIdCommandProvider commandGetServerIdCommandProvider = new CommandGetServerIdCommandProvider();
    commandGetServerIdCommandProvider
        .createCommand(
            new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testCreateCommand2() {

    CommandGetServerIdCommandProvider commandGetServerIdCommandProvider = new CommandGetServerIdCommandProvider();
    commandGetServerIdCommandProvider.createCommand(
        new ExecutionContext(Paths.get(System.getProperty("Key"), "More"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

