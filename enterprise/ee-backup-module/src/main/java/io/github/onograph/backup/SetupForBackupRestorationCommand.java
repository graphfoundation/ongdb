package io.github.onograph.backup;

import java.nio.file.Path;
import java.util.Set;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.Converters.FromPathsConverter;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.FromPaths;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Visibility;
import picocli.CommandLine.Option;


@Command(
    name = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___COMMAND__NAME,
    description = {
        io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___COMMAND__DESCRIPTION}
)
public class SetupForBackupRestorationCommand extends AbstractCommand {


  @Option(
      names = {
          io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__IS_RP__NAMES},
      paramLabel = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__IS_RP__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__IS_RP__DEFAULT_VALUE,
      showDefaultValue = Visibility.ALWAYS,
      description = {
          io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__IS_RP__DESCRIPTION}
  )
  private boolean isRp;


  @Option(
      names = {
          io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__TRE_FROM_PATHS__NAMES},
      paramLabel = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__TRE_FROM_PATHS__PARAM_LABEL,
      required = true,
      arity = io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__TRE_FROM_PATHS__ARITY,
      description = {
          io.github.onograph.TokenConstants.SETUP_FOR_BACKUP_RESTORATION_COMMAND___OPTION__TRE_FROM_PATHS__DESCRIPTION},
      converter = {FromPathsConverter.class}
  )
  private FromPaths treFromPaths;

  protected SetupForBackupRestorationCommand(ExecutionContext _cExecutionContext) {
    super(_cExecutionContext);
  }


  private Config _bulcoiConfig() {
    return Config.newBuilder()
        .fromFileNoThrow(this.ctx.confDir().resolve(io.github.onograph.TokenConstants.NEO4J__CONF))
        .commandExpansion(this.allowCommandExpansion)
        .set(GraphDatabaseSettings.neo4j_home, this.ctx.homeDir())
        .set(GraphDatabaseInternalSettings.do_parallel_recovery, this.isRp).build();
  }


  private void _prnrelForBa(BackupRestoreMeta.Response _ratResponse) {
    if (_ratResponse.isHafl()) {

      String _strRf = _ratResponse.gefirnString();

    }

  }

  @Override
  protected void execute() throws Exception {

    Set<Path> _setPtPath = this.treFromPaths.getPaths();

    BackupRestoreMeta _cmadBackupRestoreMeta = new BackupRestoreMeta(this._bulcoiConfig(),
        this.ctx.fs(), _setPtPath);
    _cmadBackupRestoreMeta.exceList().forEach(this::_prnrelForBa);
  }
}
