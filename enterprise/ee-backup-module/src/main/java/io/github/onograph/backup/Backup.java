package io.github.onograph.backup;

import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Objects;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Config;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.time.Clocks;
import org.neo4j.util.Preconditions;


@PublicApi
public final class Backup {


  private final Config config;


  private final int portNumber;


  private final String strIoh;


  private boolean isBftf = true;


  private boolean isCc = true;


  private OutputStream outputStream;


  private Backup(int portNumber, String _strIoh) {
    this.outputStream = System.out;
    this.strIoh = _strIoh;
    this.portNumber = portNumber;
    this.config = Config.defaults();
  }


  private static int _rervipt(int portNumber) {
    Preconditions.checkArgument(portNumber > 0 && portNumber <= 65535,
        io.github.onograph.I18N.format("io.github.onograph.backup.Backup.checkArgument",
            portNumber));
    return portNumber;
  }


  public static Backup froBackup(int portNumber, String _strIoh) {
    return new Backup(_rervipt(portNumber),
        Objects.requireNonNull(_strIoh, io.github.onograph.TokenConstants.HOSTNAME_OR_IP));
  }


  public static Backup froBackup(String _strIoh) {
    return froBackup(6362, _strIoh);
  }


  private void _excebcpForStPaLo(String gdbName, LogProvider _logProvider, Path _ptPath)
      throws Exception {

    BackupRunner _ebBackupRunner = BackupRunner.bulrBackupRunnerGenerator()
        .uLogProvider(_logProvider).systemNanoClock(Clocks.nanoClock())
        .progressMonitorFactory(ProgressMonitorFactory.textual(this.outputStream))
        .bulBackupRunner();

    BackupEnvironment _cnetBackupEnvironment =
        BackupEnvironment.bulrBackupEnvironmentFactory()
            .wihadsBackupEnvironmentFactory(this.portNumber, this.strIoh).config(this.config)
            .isCc(this.isCc).isFtfb(this.isBftf)
            .pbPath(_ptPath).prPath(_ptPath)
            .databaseNamePattern(gdbName).bulBackupEnvironment();
    _ebBackupRunner.excebcpForBa(_cnetBackupEnvironment);
  }


  public BackupRespState bakBackupBackupRespState(String gdbName, Path _tpPath) {
    Objects.requireNonNull(gdbName, io.github.onograph.TokenConstants.DATABASE_NAME);
    Objects.requireNonNull(_tpPath, io.github.onograph.TokenConstants.TARGET_DIRECTORY);

    Log4jLogProvider _log4jLogProvider = new Log4jLogProvider(this.outputStream);

    try {
      this._excebcpForStPaLo(gdbName, _log4jLogProvider, _tpPath);
      return new BackupRespState(this.isCc);
    } catch (

        BackupVerificationErrorException _backupVerificationErrorException) {

      return new BackupRespState(false);
    } catch (

        Exception _exception) {

      throw new RuntimeException("*** Error:  3b02b00a-232a-454b-823b-025cc97a58b8", _exception);
    }
  }


  public Backup isBftf(boolean _isBftf) {
    this.isBftf = _isBftf;
    return this;
  }


  public Backup isCc(boolean _isCc) {
    this.isCc = _isCc;
    return this;
  }


  public Backup outputStream(OutputStream _outputStream) {
    this.outputStream = Objects.requireNonNull(_outputStream,
        io.github.onograph.TokenConstants.OUTPUT_STREAM);
    return this;
  }


  public static final class BackupRespState {


    private final boolean isCnitn;

    private BackupRespState(boolean _isCnitn) {
      this.isCnitn = _isCnitn;
    }


    public boolean getIsCnitn() {
      return this.isCnitn;
    }
  }
}
