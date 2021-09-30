package io.github.onograph.dbms.commands;

import org.neo4j.cli.Command.CommandType;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;


public class NodeStoreWrapperCopyCommandCommandProvider implements
    CommandProvider<NodeStoreWrapperCopyCommand> {

  @Override
  public CommandType commandType() {
    return CommandType.STORE_COPY;
  }

  @Override
  public NodeStoreWrapperCopyCommand createCommand(ExecutionContext _cExecutionContext) {
    return new NodeStoreWrapperCopyCommand(_cExecutionContext);
  }
}
