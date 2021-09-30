package io.github.onograph.commandline.admin.security;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.Command;
import org.neo4j.cli.ExecutionContext;

class SetUpgradeUserPasswordCommandProviderTest {

  @Test
  void testCommandType() {
    assertEquals(Command.CommandType.SET_OPERATOR_PASSWORD,
        (new SetUpgradeUserPasswordCommandProvider()).commandType());
  }

  @Test
  void testCreateCommand() {

    SetUpgradeUserPasswordCommandProvider setUpgradeUserPasswordCommandProvider = new SetUpgradeUserPasswordCommandProvider();
    setUpgradeUserPasswordCommandProvider
        .createCommand(
            new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testCreateCommand2() {

    SetUpgradeUserPasswordCommandProvider setUpgradeUserPasswordCommandProvider = new SetUpgradeUserPasswordCommandProvider();
    setUpgradeUserPasswordCommandProvider.createCommand(new ExecutionContext(
        Paths.get(System.getProperty("Key"), "More"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

