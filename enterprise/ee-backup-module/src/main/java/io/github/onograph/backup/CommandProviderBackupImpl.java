package io.github.onograph.backup;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;


public class CommandProviderBackupImpl implements CommandProvider<BackupCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.ONLINE_BACKUP;
  }

  @Override
  public BackupCommand createCommand(ExecutionContext _cExecutionContext) {
    return new BackupCommand(_cExecutionContext);
  }
}
