package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.neo4j.cli.Command;

class CommandProviderBackupImplTest {

  @Test
  void testCommandType() {
    assertEquals(Command.CommandType.ONLINE_BACKUP,
        (new CommandProviderBackupImpl()).commandType());
  }
}

