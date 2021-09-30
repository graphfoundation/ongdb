package io.github.onograph.dbms.commands;

import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.state.SimpleFileStorage;
import org.neo4j.memory.EmptyMemoryTracker;
import picocli.CommandLine.Command;


@Command(
    name = io.github.onograph.TokenConstants.COMMAND_GET_SERVER_ID_IMPL___COMMAND__NAME,
    header = {io.github.onograph.TokenConstants.COMMAND_GET_SERVER_ID_IMPL___COMMAND__HEADER},
    description = {
        io.github.onograph.TokenConstants.COMMAND_GET_SERVER_ID_IMPL___COMMAND__DESCRIPTION}
)
public class CommandGetServerIdImpl extends AbstractCommand {

  public CommandGetServerIdImpl(ExecutionContext _cExecutionContext) {
    super(_cExecutionContext);
  }


  private Config _bulcoiConfig() {

    Config _cConfig =
        Config.newBuilder().fromFileNoThrow(
                this.ctx.confDir().resolve(io.github.onograph.TokenConstants.NEO4J__CONF))
            .set(GraphDatabaseSettings.neo4j_home, this.ctx.homeDir())
            .commandExpansion(this.allowCommandExpansion).build();
    ConfigUtils.disableAllConnectors(_cConfig);
    return _cConfig;
  }

  @Override
  public void execute() throws IOException {

    Neo4jLayout _neo4jLayout = Neo4jLayout.of(this._bulcoiConfig());

    Path _pisPath = _neo4jLayout.serverIdFile();

    SimpleFileStorage<ServerId> _simpleFileStorageSoaeServerId =
        new SimpleFileStorage(this.ctx.fs(), _pisPath, Marshal.INSTANCE,
            EmptyMemoryTracker.INSTANCE);
    if (_simpleFileStorageSoaeServerId.exists()) {

    } else {

      throw new IOException("*** Error:  2bdee2b6-a713-4c2e-9c9e-4da6e3ff81fe");
    }
  }
}
