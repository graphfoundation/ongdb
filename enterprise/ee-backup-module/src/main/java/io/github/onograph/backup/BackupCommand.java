package io.github.onograph.backup;

import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions;
import io.github.onograph.config.Backup;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.CommandFailedException;
import org.neo4j.cli.Converters.DatabaseNamePatternConverter;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.commandline.Util;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.helpers.DatabaseNamePattern;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.configuration.ssl.SslPolicyConfig;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.consistency.ConsistencyCheckOptions;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.logging.Level;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.time.Clocks;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Visibility;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;


@Command(
    name = io.github.onograph.TokenConstants.BACKUP_COMMAND___COMMAND__NAME,
    header = {io.github.onograph.TokenConstants.BACKUP_COMMAND___COMMAND__HEADER},
    description = {io.github.onograph.TokenConstants.BACKUP_COMMAND___COMMAND__DESCRIPTION}
)
public class BackupCommand extends AbstractCommand {


  private static final int STS_COSTC_CK_ERO = 2;


  private static final int STS_COSTC_CK_INOIE = 3;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__BP_PATH__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__BP_PATH__PARAM_LABEL,
      required = true,
      description = {
          io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__BP_PATH__DESCRIPTION}
  )
  private Path bpPath;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__CA_PATH__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__CA_PATH__PARAM_LABEL,
      description = {
          io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__CA_PATH__DESCRIPTION}
  )
  private Path caPath;


  @Mixin
  private ConsistencyCheckOptions consistencyCheckOptions;


  @Option(
      names = {
          io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__DATABASE_NAME_PATTERN__NAMES},
      defaultValue = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__DATABASE_NAME_PATTERN__DEFAULT_VALUE,
      description = {
          io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__DATABASE_NAME_PATTERN__DESCRIPTION},
      converter = {DatabaseNamePatternConverter.class}
  )
  private DatabaseNamePattern databaseNamePattern;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_CC__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_CC__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_CC__DEFAULT_VALUE,
      showDefaultValue = Visibility.ALWAYS,
      description = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_CC__DESCRIPTION}
  )
  private boolean isCc;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_FTF__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_FTF__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_FTF__DEFAULT_VALUE,
      showDefaultValue = Visibility.ALWAYS,
      description = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_FTF__DESCRIPTION}
  )
  private boolean isFtf;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_PR__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_PR__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_PR__DEFAULT_VALUE,
      showDefaultValue = Visibility.ALWAYS,
      description = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_PR__DESCRIPTION}
  )
  private boolean isPr;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_RP__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_RP__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_RP__DEFAULT_VALUE,
      showDefaultValue = Visibility.ALWAYS,
      description = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__IS_RP__DESCRIPTION}
  )
  private boolean isRp;


  @Option(
      names = {
          io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__MI_AUTH_META_OPTIONS__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__MI_AUTH_META_OPTIONS__PARAM_LABEL,
      description = {
          io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__MI_AUTH_META_OPTIONS__DESCRIPTION}
  )
  private AuthMetaOptions miAuthMetaOptions;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_F__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_F__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_F__DEFAULT_VALUE,
      description = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_F__DESCRIPTION}
  )
  private String strF;


  @Option(
      names = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_MP__NAMES},
      paramLabel = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_MP__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_MP__DEFAULT_VALUE,
      description = {io.github.onograph.TokenConstants.BACKUP_COMMAND___OPTION__STR_MP__DESCRIPTION}
  )
  private String strMp;

  public BackupCommand(ExecutionContext _cExecutionContext) {
    super(_cExecutionContext);
  }


  private static Map<Setting<?>, Object> _gestdluntslpcMap() {
    return List.of(SslPolicyScope.values()).stream().filter((sslPolicyScope) ->
    {
      return sslPolicyScope != SslPolicyScope.BACKUP;
    }).map(SslPolicyConfig::forScope).map((sslConfig) ->
    {
      return sslConfig.enabled;
    }).collect(Collectors.toMap((setting) ->
        {
          return setting;
        },
        (setting) ->
        {
          return false;
        }));
  }


  private static Path _reresPath(Path _pPath) {
    try {
      return _pPath.toRealPath();
    } catch (

        IOException _iOException) {

      throw new CommandFailedException("*** Error: 3644aa5a-0e33-4ca1-a279-2bfbb5bda8ac",
          _iOException);
    }
  }


  private void _aduo() {
    if (!this.isPr) {
      this.isCc = false;
    }
  }


  private Config _bulcoiConfig(Path _acpPath, Path _pbPath, Path _pcPath) {

    Config _cConfig = Config.newBuilder().fromFileNoThrow(_pcPath).fromFileNoThrow(_acpPath)
        .set(GraphDatabaseSettings.neo4j_home, _pbPath)
        .set(GraphDatabaseSettings.pagecache_memory, this.strMp)
        .set(GraphDatabaseSettings.pagecache_warmup_enabled, Boolean.FALSE)
        .set(Backup.settingOneubBoolean, Boolean.FALSE).set(_gestdluntslpcMap())
        .commandExpansion(this.allowCommandExpansion).build();
    ConfigUtils.disableAllConnectors(_cConfig);
    if (this.verbose) {
      _cConfig.set(GraphDatabaseSettings.store_internal_log_level, Level.DEBUG);
    }

    return _cConfig;
  }

  @Override
  protected void execute() {
    this._aduo();
    this.bpPath = _reresPath(this.bpPath);
    this.consistencyCheckOptions.warnOnUsageOfDeprecatedOptions(this.spec, this.ctx);

    SocketAddress _socketAddress = SettingValueParsers.SOCKET_ADDRESS.parse(this.strF);

    Path _pcPath = this.ctx.confDir().resolve(io.github.onograph.TokenConstants.NEO4J__CONF);

    Config _config = this._bulcoiConfig(this.caPath, this.bpPath, _pcPath);

    BackupEnvironment _cnetBackupEnvironment =
        BackupEnvironment.bulrBackupEnvironmentFactory().pbPath(this.bpPath)
            .prPath(this.consistencyCheckOptions.getReportDir())
            .wihadsBackupEnvironmentFactory(_socketAddress)
            .databaseNamePattern(this.databaseNamePattern).config(_config)
            .miAuthMetaOptions(this.miAuthMetaOptions).isFtfb(this.isFtf)
            .isCc(this.isCc).isGcc(this.consistencyCheckOptions.isCheckGraph())
            .isIcc(this.consistencyCheckOptions.isCheckIndexes())
            .isSicc(this.consistencyCheckOptions.isCheckIndexStructure())
            .shouldPrep(this.isPr).isRp(this.isRp).bulBackupEnvironment();

    Log4jLogProvider _pluLog4jLogProvider = Util.configuredLogProvider(_config, this.ctx.out());

    LogProvider _itraLogProvider =
        this.verbose ? _pluLog4jLogProvider : NullLogProvider.getInstance();

    BackupRunner _ebBackupRunner =
        BackupRunner.bulrBackupRunnerGenerator().fFileSystemAbstraction(this.ctx.fs())
            .itraLogProvider(_itraLogProvider)
            .uLogProvider(_pluLog4jLogProvider).systemNanoClock(Clocks.nanoClock())
            .progressMonitorFactory(ProgressMonitorFactory.textual(this.ctx.err()))
            .bulBackupRunner();

    try {
      _ebBackupRunner.excebcpForBa(_cnetBackupEnvironment);
    } catch (

        BackupVerificationErrorException _backupVerificationErrorException) {

      int _iCe = _backupVerificationErrorException.getIsEtfcc() ? 2 : 3;
      throw new CommandFailedException(_backupVerificationErrorException.getMessage(),
          _backupVerificationErrorException, _iCe);
    } catch (

        Exception _exception) {

      throw new CommandFailedException("*** Error: 06ba7799-26de-44b5-9b81-90b4a6fa00b8",
          _exception);
    } finally {
      _pluLog4jLogProvider.close();
    }

    this.ctx.out()
        .println(io.github.onograph.I18N.format("io.github.onograph.backup.BackupCommand.println"));

  }
}
