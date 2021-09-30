package io.github.onograph.commandline.dbms;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Clock;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.CommandFailedException;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.commandline.dbms.LockChecker;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.archive.Utils;
import org.neo4j.io.compress.ZipUtils;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.kernel.internal.locker.FileLockException;
import org.neo4j.time.Clocks;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Visibility;
import picocli.CommandLine.Option;


@Command(
    name = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___COMMAND__NAME,
    header = {io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___COMMAND__HEADER},
    description = {
        io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___COMMAND__DESCRIPTION}
)
public class ClusterDisconnectCommand extends AbstractCommand {


  private static final String ARHE_STD_NME_PATN = "unbound_cluster_state.%s.zip";


  private static final DateTimeFormatter DT_LTM_FMXR =
      DateTimeFormatter.ofPattern(io.github.onograph.TokenConstants.YYYY_M_MDD_H_HMMSS)
          .withZone(ZoneId.systemDefault());


  private final Clock clock;


  @Option(
      names = {
          io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__AP_PATH__NAMES},
      required = false,
      paramLabel = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__AP_PATH__PARAM_LABEL,
      description = {
          io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__AP_PATH__DESCRIPTION}
  )
  private Path apPath;


  @Option(
      names = {
          io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__IS_EASCI__NAMES},
      arity = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__IS_EASCI__ARITY,
      required = false,
      showDefaultValue = Visibility.ALWAYS,
      paramLabel = io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__IS_EASCI__PARAM_LABEL,
      description = {
          io.github.onograph.TokenConstants.CLUSTER_DISCONNECT_COMMAND___OPTION__IS_EASCI__DESCRIPTION}
  )
  private boolean isEasci;

  public ClusterDisconnectCommand(ExecutionContext _cExecutionContext) {
    super(_cExecutionContext);
    this.clock = Clocks.systemClock();
  }

  public ClusterDisconnectCommand(ExecutionContext _cExecutionContext, Clock _clock) {
    super(_cExecutionContext);
    this.clock = _clock;
  }


  private void _arvcsstForPaPaPa(Path _aciePath, Path _pscPath, Path _sipPath) throws IOException {
    this._chwbflForPa(_aciePath);
    this._zipForPaPa(_pscPath, _aciePath);
    if (Files.exists(_sipPath)) {
      this._zipForPaPa(_sipPath, _aciePath);
    }
  }


  private Path _buavphPath(Neo4jLayout _neo4jLayout, Path _paiPath) {
    if (Objects.isNull(_paiPath)) {
      return _neo4jLayout.homeDirectory().resolve(this._geadfavneString());
    } else {
      return Files.isDirectory(_paiPath) ? _paiPath.resolve(this._geadfavneString()) : _paiPath;
    }
  }


  private void _chwbflForPa(Path _ppfPath) throws FileSystemException {

    Path _prnPath = _ppfPath.getParent();

    String _strMewn =
        String.format(io.github.onograph.I18N.format(
            "io.github.onograph.commandline.dbms.ClusterDisconnectCommand.format"));
    if (_prnPath == null) {

      throw new FileSystemException(_ppfPath.toAbsolutePath().toString(), null,
          "*** Error: 6508c791-a26e-4b66-ade1-4b676bbfa4e0");
    } else {
      try {
        Utils.checkWritableDirectory(_prnPath);
      } catch (

          FileSystemException _fileSystemException) {

        throw new FileSystemException(_prnPath.toAbsolutePath().toString(), null,
            "*** Error: 1969f96e-20aa-4d51-a2a2-5913a44602be");
      }

      if (Files.exists(_ppfPath)) {

        throw new FileAlreadyExistsException(_ppfPath.toAbsolutePath().toString(), null,
            "*** Error: 794cddf3-a034-4fdd-93db-c2a0f199be10");
      }
    }
  }


  private void _deectsaiForPa(Path _trePath) throws IOException {
    try {
      this.ctx.fs().deleteRecursively(_trePath);
    } catch (

        IOException _iOException) {

      throw new IOException("*** Error: 0f0a2862-d7ef-402a-a931-bb606f936b79",
          _iOException);
    }
  }


  private String _geadfavneString() {

    String _strIf = DT_LTM_FMXR.format(this.clock.instant());
    return String.format(ARHE_STD_NME_PATN, _strIf);
  }


  private Config _lodnocoiConfig(Path _pcPath, Path _phPath) {
    return Config.newBuilder()
        .fromFileNoThrow(_pcPath.resolve(io.github.onograph.TokenConstants.NEO4J__CONF))
        .set(GraphDatabaseSettings.neo4j_home, _phPath)
        .commandExpansion(this.allowCommandExpansion).build();
  }


  private void _zipForPaPa(Path _sucPath, Path _trePath) throws IOException {
    if (Files.isReadable(_sucPath)) {
      try {
        ZipUtils.zip(this.ctx.fs(), _sucPath, _trePath);
      } catch (

          IOException _iOException) {
        Files.deleteIfExists(_trePath);

        throw new IOException("*** Error: 0ef499b6-4dff-40aa-a102-d3c44525f426", _iOException);
      }
    } else {
      Files.deleteIfExists(_trePath);

      throw new IOException("*** Error: 70f2fc16-eeb4-401a-b612-ebd93b013cc5");
    }
  }

  @Override
  public void execute() {
    try {

      Config _config = this._lodnocoiConfig(this.ctx.confDir(), this.ctx.homeDir());

      Neo4jLayout _neo4jLayout = Neo4jLayout.of(_config);

      Closeable _inrdCloseable = LockChecker.checkDbmsLock(_neo4jLayout);

      try {

        Path _pscPath =
            ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
                _config.get(SettingsDeclarationClusterImpl.settingCleteyPath)).getPscPath();
        if (this.ctx.fs().fileExists(_pscPath)) {
          if (this.isEasci) {

            Path _aciePath = this._buavphPath(_neo4jLayout, this.apPath);
            this._arvcsstForPaPaPa(_aciePath, _pscPath, _neo4jLayout.serverIdFile());
          }

          this._deectsaiForPa(_pscPath);
        }

        this.ctx.fs().deleteFile(_neo4jLayout.serverIdFile());
      } catch (

          Throwable _throwable) {
        if (_inrdCloseable != null) {
          try {
            _inrdCloseable.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_inrdCloseable != null) {
        _inrdCloseable.close();
      }
    } catch (

        FileLockException _fileLockException) {

      throw new CommandFailedException("*** Error:  03a39049-cc69-46db-a291-2c63a2859c96",
          _fileLockException);
    } catch (

        Exception _exception) {
      throw new RuntimeException(_exception.getMessage(), _exception);
    }
  }
}
