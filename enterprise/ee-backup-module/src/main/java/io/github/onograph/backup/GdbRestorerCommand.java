package io.github.onograph.backup;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.CommandFailedException;
import org.neo4j.cli.Converters.DatabaseNameConverter;
import org.neo4j.cli.Converters.FromPathsConverter;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.commandline.dbms.StoreVersionLoader;
import org.neo4j.commandline.dbms.StoreVersionLoader.Result;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.Config.Builder;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.FromPaths;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.Neo4jLayout;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Visibility;
import picocli.CommandLine.Option;


@Command(
    name = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___COMMAND__NAME,
    description = {io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___COMMAND__DESCRIPTION}
)
public class GdbRestorerCommand extends AbstractCommand {


  @Option(
      names = {io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__FROM_PATHS__NAMES},
      paramLabel = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__FROM_PATHS__PARAM_LABEL,
      required = true,
      arity = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__FROM_PATHS__ARITY,
      description = {
          io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__FROM_PATHS__DESCRIPTION},
      converter = {FromPathsConverter.class}
  )
  private FromPaths fromPaths;


  @Option(
      names = {io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__IS_FRE__NAMES},
      arity = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__IS_FRE__ARITY,
      description = {
          io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__IS_FRE__DESCRIPTION}
  )
  private boolean isFre;


  @Option(
      names = {io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__IS_M__NAMES},
      arity = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__IS_M__ARITY,
      description = {
          io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__IS_M__DESCRIPTION}
  )
  private boolean isM;


  @Option(
      names = {
          io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__NORMALIZED_DATABASE_NAME__NAMES},
      description = {
          io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__NORMALIZED_DATABASE_NAME__DESCRIPTION},
      showDefaultValue = Visibility.NEVER,
      converter = {DatabaseNameConverter.class}
  )
  private NormalizedDatabaseName normalizedDatabaseName;


  @Option(
      names = {io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRD_PATH__NAMES},
      description = {
          io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRD_PATH__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRD_PATH__PARAM_LABEL
  )
  private Path prdPath;


  @Option(
      names = {io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRT_PATH__NAMES},
      description = {
          io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRT_PATH__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.GDB_RESTORER_COMMAND___OPTION__PRT_PATH__PARAM_LABEL
  )
  private Path prtPath;

  public GdbRestorerCommand(ExecutionContext _cExecutionContext) {
    super(_cExecutionContext);
  }


  private static String _gedtenString(NormalizedDatabaseName _normalizedDatabaseName,
      Path _pfPath) {
    if (_normalizedDatabaseName != null) {
      return _normalizedDatabaseName.name();
    } else {

      String title = _pfPath.getName(_pfPath.getNameCount() - 1).toString();
      if (!title.trim().isEmpty()) {
        return title;
      } else {

        throw new IllegalArgumentException("*** Error: 2cc24e9f-2577-4685-b154-525562f67418");
      }
    }
  }


  private List<RestorerPathWrapper> _exceList(Config _config,
      ClusterMetaTopologyInfo _cslClusterMetaTopologyInfo, Neo4jLayout _neo4jLayout,
      Set<Path> _setPfPath) {

    StoreVersionLoader _sStoreVersionLoader = new StoreVersionLoader(this.ctx.fs(), _config);

    List _list;
    try {
      _list = _setPfPath.stream().map((fromPath) ->
      {
        try {

          String gdbName =
              (new NormalizedDatabaseName(
                  _gedtenString(this.normalizedDatabaseName, fromPath))).name();

          DatabaseLayout _databaseLayout = _neo4jLayout.databaseLayout(gdbName);

          Path _pgrPath = _cslClusterMetaTopologyInfo.ratgodPath(gdbName);

          GdbRestorer _cdrGdbRestorer =
              new GdbRestorer(this.ctx.fs(), this.isM, this.isFre, this.ctx.out(), fromPath,
                  _pgrPath, _databaseLayout);
          _cdrGdbRestorer.exce();

          Result _result = _sStoreVersionLoader.loadStoreVersion(_databaseLayout);

          return new RestorerPathWrapper(fromPath);
        } catch (

            Exception _exception) {
          return new RestorerPathWrapper(Optional.of(_exception), fromPath);
        }
      }).collect(Collectors.toList());
    } catch (

        Throwable _throwable) {
      try {
        _sStoreVersionLoader.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _sStoreVersionLoader.close();
    return _list;
  }


  private Config _lodnocoiConfig(Path _pcPath, Path _hpPath) {

    Builder _builder = Config.newBuilder()
        .fromFile(_pcPath.resolve(io.github.onograph.TokenConstants.NEO4J__CONF))
        .set(GraphDatabaseSettings.neo4j_home, _hpPath)
        .commandExpansion(this.allowCommandExpansion);
    Optional.ofNullable(this.prdPath).ifPresent((v) ->
    {
      _builder.set(GraphDatabaseInternalSettings.databases_root_path, v.toAbsolutePath());
    });
    Optional.ofNullable(this.prtPath).ifPresent((v) ->
    {
      _builder.set(GraphDatabaseSettings.transaction_logs_root_path, v.toAbsolutePath());
    });

    Config _config = _builder.build();
    ConfigUtils.disableAllConnectors(_config);
    return _config;
  }


  private void _prrrruForGd(RestorerPathWrapper _rrRestorerPathWrapper) {
    boolean hasError = _rrRestorerPathWrapper.optionalEcpinException.isPresent();

    String _strRao = _rrRestorerPathWrapper.optionalEcpinException.map(Throwable::getMessage)
        .orElse("");

    if (hasError) {
      this.ctx.out().printf(
          io.github.onograph.I18N.format("io.github.onograph.backup.GdbRestorerCommand.printf"),
          _rrRestorerPathWrapper.pfPath.toAbsolutePath(), _strRao);
    } else {
      this.ctx.out().printf(
          io.github.onograph.I18N.format("io.github.onograph.backup.GdbRestorerCommand.printf2"),
          _rrRestorerPathWrapper.pfPath.toAbsolutePath());
    }
  }


  private void _vaaagt() {
    if (this.normalizedDatabaseName != null && !this.fromPaths.isSingle()) {

      throw new CommandFailedException("*** Error:  47bc5946-9696-4bfd-8855-965f1d4069cb");
    } else if (this.prdPath != null && !this.fromPaths.isSingle()) {

      throw new CommandFailedException("*** Error:  866eb070-73b0-484e-8436-6ddf16495ac3");
    } else if (this.prtPath != null && !this.fromPaths.isSingle()) {

      throw new CommandFailedException("*** Error:  0bb809c6-1c0d-4308-9149-01dda84bbe7d");
    }
  }

  @Override
  public void execute() {
    this._vaaagt();

    Config _config = this._lodnocoiConfig(this.ctx.confDir(), this.ctx.homeDir());

    Set<Path> _setPtsPath = this.fromPaths.getPaths();

    Neo4jLayout _neo4jLayout = Neo4jLayout.of(_config);

    ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo =
        ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
            _config.get(SettingsDeclarationClusterImpl.settingCleteyPath));

    List<RestorerPathWrapper> restorerPathWrappers = this._exceList(_config,
        _lscClusterMetaTopologyInfo, _neo4jLayout, _setPtsPath);
    restorerPathWrappers.forEach(this::_prrrruForGd);

    boolean _isRfh = restorerPathWrappers.stream().anyMatch((r) ->
    {
      return r.optionalEcpinException.isPresent();
    });
    if (_isRfh) {

      throw new CommandFailedException("*** Error:  29e2274f-cec5-4cfd-b4e3-42977a117518");
    }
  }


  private static final class RestorerPathWrapper {


    private final Optional<Exception> optionalEcpinException;


    private final Path pfPath;

    private RestorerPathWrapper(Path _pfPath) {
      this(Optional.empty(), _pfPath);
    }


    private RestorerPathWrapper(Optional<Exception> _optionalEcpinException, Path _pfPath) {
      this.optionalEcpinException = _optionalEcpinException;
      this.pfPath = _pfPath;
    }
  }
}
