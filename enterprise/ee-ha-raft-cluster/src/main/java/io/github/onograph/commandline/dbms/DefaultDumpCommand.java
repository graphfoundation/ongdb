package io.github.onograph.commandline.dbms;

import org.neo4j.cli.ExecutionContext;
import org.neo4j.commandline.dbms.DumpCommand;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.archive.Dumper;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.memory.MemoryTracker;


public class DefaultDumpCommand extends DumpCommand {

  public DefaultDumpCommand(ExecutionContext _cExecutionContext, Dumper _dumper) {
    super(_cExecutionContext, _dumper);
  }

  @Override
  protected void checkDbState(DatabaseLayout _databaseLayout, Config _adtoaConfig,
      MemoryTracker _memoryTracker) {

    super.checkDbState(_databaseLayout, _adtoaConfig, _memoryTracker);
  }
}
