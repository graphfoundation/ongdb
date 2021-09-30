package io.github.onograph.server.security;

import io.github.onograph.config.Security;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.LogConfig;
import org.neo4j.logging.log4j.LogExtended;
import org.neo4j.logging.log4j.Neo4jLoggerContext;


public class DefaultSecurityLog extends AbstractSecurityLog {


  private final FileSystemAbstraction fileSystemAbstraction;


  private Neo4jLoggerContext cNeo4jLoggerContext;


  private Config config;

  public DefaultSecurityLog(Config _config, FileSystemAbstraction _fileSystemAbstraction) {
    this.config = _config;
    this.fileSystemAbstraction = _fileSystemAbstraction;
  }

  public DefaultSecurityLog(LogExtended _logExtended) {
    this.setLog(_logExtended);
    this.fileSystemAbstraction = null;
  }

  @Override
  public void init() {
    this.cNeo4jLoggerContext = LogConfig.createBuilder(this.fileSystemAbstraction,
            this.config.get(Security.settingSeignPath),
            this.config.get(Security.settingSeiglLevel)).withCategory(false)
        .withFormat(this.config.get(Security.settingSeigaFormattedLogFormat))
        .withTimezone(this.config.get(GraphDatabaseSettings.db_timezone))
        .withRotation(this.config.get(Security.settingStsigthoLong),
            this.config.get(Security.settingStsigreInteger)).build();

    LogProvider _logProvider = new Log4jLogProvider(this.cNeo4jLoggerContext);
    this.setLog((LogExtended) _logProvider.getLog(""));
  }

  @Override
  public void shutdown() {
    this.cNeo4jLoggerContext.close();
  }
}
