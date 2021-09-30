package io.github.onograph.commandline.dbms;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;


public class ClusterDisconnectCommandCommandProvider implements
    CommandProvider<ClusterDisconnectCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.UNBIND;
  }

  @Override
  public ClusterDisconnectCommand createCommand(ExecutionContext _cExecutionContext) {
    return new ClusterDisconnectCommand(_cExecutionContext);
  }
}
