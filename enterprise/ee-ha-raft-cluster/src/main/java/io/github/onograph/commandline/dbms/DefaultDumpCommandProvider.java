package io.github.onograph.commandline.dbms;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.dbms.archive.Dumper;


public class DefaultDumpCommandProvider implements CommandProvider<DefaultDumpCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.DUMP;
  }

  @Override
  public DefaultDumpCommand createCommand(ExecutionContext _cExecutionContext) {
    return new DefaultDumpCommand(_cExecutionContext, new Dumper(_cExecutionContext.err()));
  }

  @Override
  public int getPriority() {
    return 2;
  }
}
