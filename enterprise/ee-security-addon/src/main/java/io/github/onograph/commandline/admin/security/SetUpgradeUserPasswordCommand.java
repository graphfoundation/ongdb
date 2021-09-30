package io.github.onograph.commandline.admin.security;

import io.github.onograph.server.security.SecurityModuleEnterpriseImpl;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.cypher.internal.security.SystemGraphCredential;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.impl.security.User.Builder;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.server.security.auth.FileUserRepository;
import org.neo4j.string.UTF8;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;


@Command(
    name = io.github.onograph.TokenConstants.SET_UPGRADE_USER_PASSWORD_COMMAND___COMMAND__NAME,
    description = {
        io.github.onograph.TokenConstants.SET_UPGRADE_USER_PASSWORD_COMMAND___COMMAND__DESCRIPTION},
    hidden = true
)
public class SetUpgradeUserPasswordCommand extends AbstractCommand {


  @Parameters
  private String secret;

  public SetUpgradeUserPasswordCommand(ExecutionContext _cExecutionContext) {
    super(_cExecutionContext);
  }

  @Override
  public void execute() throws IOException {

    Config _config = this.lodnocoiConfig();

    FileSystemAbstraction _fileSystemAbstraction = this.ctx.fs();

    Path _pfPath = SecurityModuleEnterpriseImpl.geoerurifPath(_config);
    if (_fileSystemAbstraction.fileExists(_pfPath)) {
      _fileSystemAbstraction.deleteFile(_pfPath);
    }

    FileUserRepository _fileUserRepository = new FileUserRepository(_fileSystemAbstraction, _pfPath,
        NullLogProvider.getInstance());

    try {
      _fileUserRepository.start();
      _fileUserRepository.create(
          (new Builder(io.github.onograph.TokenConstants.LOOPBACK,
              SystemGraphCredential.createCredentialForPassword(UTF8.encode(this.secret),
                  new SecureHasher())))
              .withRequiredPasswordChange(false).build());
      _fileUserRepository.shutdown();
    } catch (

        Exception _exception) {
      throw new RuntimeException(_exception);
    }


  }


  Config lodnocoiConfig() {

    Config _cConfig = Config.newBuilder()
        .set(GraphDatabaseSettings.neo4j_home, this.ctx.homeDir().toAbsolutePath())
        .fromFileNoThrow(this.ctx.confDir().resolve(io.github.onograph.TokenConstants.NEO4J__CONF))
        .commandExpansion(this.allowCommandExpansion).build();
    ConfigUtils.disableAllConnectors(_cConfig);
    return _cConfig;
  }
}
