package io.github.onograph.dbms.commands;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;


public class CommandGetServerIdCommandProvider implements CommandProvider<CommandGetServerIdImpl> {

  @Override
  public CommandType commandType() {
    return CommandType.GET_SERVER_ID;
  }

  @Override
  public CommandGetServerIdImpl createCommand(ExecutionContext _cExecutionContext) {
    return new CommandGetServerIdImpl(_cExecutionContext);
  }
}
