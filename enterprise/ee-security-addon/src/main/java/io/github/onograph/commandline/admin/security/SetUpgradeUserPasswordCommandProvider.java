package io.github.onograph.commandline.admin.security;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;


public class SetUpgradeUserPasswordCommandProvider implements
    CommandProvider<SetUpgradeUserPasswordCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.SET_OPERATOR_PASSWORD;
  }

  @Override
  public SetUpgradeUserPasswordCommand createCommand(ExecutionContext _cExecutionContext) {
    return new SetUpgradeUserPasswordCommand(_cExecutionContext);
  }
}
