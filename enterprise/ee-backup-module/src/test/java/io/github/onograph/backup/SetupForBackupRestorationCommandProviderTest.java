package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.neo4j.cli.Command;

class SetupForBackupRestorationCommandProviderTest {

  @Test
  void testCommandType() {
    assertEquals(Command.CommandType.PREPARE_RESTORE,
        (new SetupForBackupRestorationCommandProvider()).commandType());
  }
}

