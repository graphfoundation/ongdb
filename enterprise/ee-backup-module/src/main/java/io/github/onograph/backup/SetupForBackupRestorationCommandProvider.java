package io.github.onograph.backup;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;


public class SetupForBackupRestorationCommandProvider implements
    CommandProvider<SetupForBackupRestorationCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.PREPARE_RESTORE;
  }

  @Override
  public SetupForBackupRestorationCommand createCommand(ExecutionContext _cExecutionContext) {
    return new SetupForBackupRestorationCommand(_cExecutionContext);
  }
}
