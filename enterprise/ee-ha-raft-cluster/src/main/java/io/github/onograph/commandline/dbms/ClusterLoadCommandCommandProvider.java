package io.github.onograph.commandline.dbms;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.dbms.archive.Loader;


public class ClusterLoadCommandCommandProvider implements CommandProvider<ClusterLoadCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.LOAD;
  }

  @Override
  public ClusterLoadCommand createCommand(ExecutionContext _cExecutionContext) {
    return new ClusterLoadCommand(_cExecutionContext, new Loader(_cExecutionContext.err()));
  }

  @Override
  public int getPriority() {
    return 2;
  }
}
