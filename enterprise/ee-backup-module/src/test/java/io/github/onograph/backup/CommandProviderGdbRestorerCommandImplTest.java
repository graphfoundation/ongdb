package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.Command;
import org.neo4j.cli.ExecutionContext;

class CommandProviderGdbRestorerCommandImplTest {

  @Test
  void testCommandType() {
    assertEquals(Command.CommandType.RESTORE_DB,
        (new CommandProviderGdbRestorerCommandImpl()).commandType());
  }

  @Test
  void testCreateCommand() {

    CommandProviderGdbRestorerCommandImpl commandProviderGdbRestorerCommandImpl = new CommandProviderGdbRestorerCommandImpl();
    commandProviderGdbRestorerCommandImpl
        .createCommand(
            new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testCreateCommand2() {

    CommandProviderGdbRestorerCommandImpl commandProviderGdbRestorerCommandImpl = new CommandProviderGdbRestorerCommandImpl();
    commandProviderGdbRestorerCommandImpl.createCommand(new ExecutionContext(
        Paths.get(System.getProperty("Key"), "More"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

