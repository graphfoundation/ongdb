package io.github.onograph.backup;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;


public class CommandProviderGdbRestorerCommandImpl implements CommandProvider<GdbRestorerCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.RESTORE_DB;
  }

  @Override
  public GdbRestorerCommand createCommand(ExecutionContext _cExecutionContext) {
    return new GdbRestorerCommand(_cExecutionContext);
  }
}
