package io.github.onograph.dbms.commands;

import io.github.onograph.dbms.utils.NodeStoreWrapper;
import io.github.onograph.dbms.utils.TokenNamePropertyDTO;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.CommandFailedException;
import org.neo4j.cli.Converters.DatabaseNameConverter;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.commandline.dbms.LockChecker;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.internal.helpers.Strings;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesHelper;
import org.neo4j.kernel.impl.util.Validators;
import org.neo4j.kernel.internal.locker.FileLockException;
import org.neo4j.kernel.recovery.Recovery;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.time.Clocks;
import org.neo4j.util.VisibleForTesting;
import picocli.CommandLine.ArgGroup;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Visibility;
import picocli.CommandLine.ITypeConverter;
import picocli.CommandLine.Option;
import picocli.CommandLine.TypeConversionException;


@Command(
    name = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___COMMAND__NAME,
    header = {io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___COMMAND__HEADER},
    description = {
        io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___COMMAND__DESCRIPTION}
)
public class NodeStoreWrapperCopyCommand extends AbstractCommand {


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__FRMT__NAMES},
      defaultValue = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__FRMT__DEFAULT_VALUE,
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__FRMT__DESCRIPTION}
  )
  private io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType frmt;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__IS_FRE__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__IS_FRE__DESCRIPTION}
  )
  private boolean isFre;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LS_STRING__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LS_STRING__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LS_STRING__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterStringListImpl.class}
  )
  private List<String> listLsString;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWND_STRING__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWND_STRING__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWND_STRING__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterStringListImpl.class}
  )
  private List<String> listLwndString;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWNOK_STRING__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWNOK_STRING__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_LWNOK_STRING__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterStringListImpl.class}
  )
  private List<String> listLwnokString;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PNOK_TOKEN_NAME_PROPERTY_D_T_O__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PNOK_TOKEN_NAME_PROPERTY_D_T_O__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PNOK_TOKEN_NAME_PROPERTY_D_T_O__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterListofStringListImpl.class}
  )
  private List<TokenNamePropertyDTO> listPnokTokenNamePropertyDTO;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PROK_TOKEN_NAME_PROPERTY_D_T_O__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PROK_TOKEN_NAME_PROPERTY_D_T_O__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PROK_TOKEN_NAME_PROPERTY_D_T_O__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterListofStringListImpl.class}
  )
  private List<TokenNamePropertyDTO> listProkTokenNamePropertyDTO;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PRS_TOKEN_NAME_PROPERTY_D_T_O__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PRS_TOKEN_NAME_PROPERTY_D_T_O__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PRS_TOKEN_NAME_PROPERTY_D_T_O__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterListofStringListImpl.class}
  )
  private List<TokenNamePropertyDTO> listPrsTokenNamePropertyDTO;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PS_STRING__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PS_STRING__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_PS_STRING__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterStringListImpl.class}
  )
  private List<String> listPsString;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_RS_STRING__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_RS_STRING__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_RS_STRING__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterStringListImpl.class}
  )
  private List<String> listRsString;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_SNP_TOKEN_NAME_PROPERTY_D_T_O__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_SNP_TOKEN_NAME_PROPERTY_D_T_O__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LIST_SNP_TOKEN_NAME_PROPERTY_D_T_O__PARAM_LABEL,
      showDefaultValue = Visibility.NEVER,
      converter = {
          io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.ITypeConverterListofStringListImpl.class}
  )
  private List<TokenNamePropertyDTO> listSnpTokenNamePropertyDTO;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LTS_PATH__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LTS_PATH__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__LTS_PATH__PARAM_LABEL
  )
  private Path ltsPath;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__NORMALIZED_DATABASE_NAME__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__NORMALIZED_DATABASE_NAME__DESCRIPTION},
      required = true,
      converter = {DatabaseNameConverter.class}
  )
  private NormalizedDatabaseName normalizedDatabaseName;


  private PageCacheTracer pageCacheTracer;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPF__NAMES},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPF__PARAM_LABEL,
      defaultValue = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPF__DEFAULT_VALUE,
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPF__DESCRIPTION}
  )
  private String strMcpf;


  @Deprecated
  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPT__NAMES},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPT__PARAM_LABEL,
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__STR_MCPT__DESCRIPTION}
  )
  private String strMcpt;


  @ArgGroup(
      multiplicity = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___ARG_GROUP__SUC_NORMALIZED_DATABASE_NAME_PATH_OPTION_WRAPPER__MULTIPLICITY
  )
  private io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.NormalizedDatabaseNamePathOptionWrapper
      sucNormalizedDatabaseNamePathOptionWrapper;


  @Option(
      names = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__TH_PATH__NAMES},
      description = {
          io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__TH_PATH__DESCRIPTION},
      paramLabel = io.github.onograph.TokenConstants.NODE_STORE_WRAPPER_COPY_COMMAND___OPTION__TH_PATH__PARAM_LABEL
  )
  private Path thPath;

  public NodeStoreWrapperCopyCommand(ExecutionContext _cExecutionContext) {
    super(_cExecutionContext);
    this.pageCacheTracer = PageCacheTracer.NULL;
    this.sucNormalizedDatabaseNamePathOptionWrapper =
        new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.NormalizedDatabaseNamePathOptionWrapper();
    this.listLwndString = new ArrayList();
    this.listLwnokString = new ArrayList();
    this.listLsString = new ArrayList();
    this.listPsString = new ArrayList();
    this.listSnpTokenNamePropertyDTO = new ArrayList();
    this.listPnokTokenNamePropertyDTO = new ArrayList();
    this.listPrsTokenNamePropertyDTO = new ArrayList();
    this.listProkTokenNamePropertyDTO = new ArrayList();
    this.listRsString = new ArrayList();
  }


  private static void _chcdbsaForDaCoMe(Config _adtoaConfig, DatabaseLayout _databaseLayout,
      MemoryTracker _memoryTracker) {
    if (_isChresaForDaCoMe(_adtoaConfig, _databaseLayout, _memoryTracker)) {
      throw new CommandFailedException(Strings.joinAsLines(
          new String[]{io.github.onograph.I18N.format(
              "io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.joinAsLines",
              _databaseLayout.getDatabaseName()),
              io.github.onograph.I18N.format(
                  "io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.joinAsLines2"),
              io.github.onograph.I18N.format(
                  "io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand.joinAsLines3")}));
    }
  }


  private static boolean _isChresaForDaCoMe(Config _adtoaConfig, DatabaseLayout _databaseLayout,
      MemoryTracker _memoryTracker) {
    try {
      return Recovery.isRecoveryRequired(_databaseLayout, _adtoaConfig, _memoryTracker);
    } catch (

        Exception _exception) {

      throw new CommandFailedException("*** Error: 11e4e545-192f-498f-bef8-2178e6a7e376",
          _exception);
    }
  }


  private static String _trquacesrString(boolean _isTr, String _strSrn) {
    if (_isTr) {
      if (_strSrn.contains("`") && _strSrn.length() >= 2) {
        _strSrn = _strSrn.substring(1, _strSrn.length() - 1);
      }

      if (_strSrn.contains("`")) {

        throw new TypeConversionException("*** Error:  04556227-4ed3-46ab-b226-56dfe11afe8c");
      }
    }

    if (_strSrn.isEmpty()) {

      throw new TypeConversionException("*** Error:  e6c64316-6d42-456c-97b3-57f29450694b");
    } else {
      return _strSrn;
    }
  }


  private static void _vaitsocForDa(DatabaseLayout _fDatabaseLayout) {
    try {
      Validators.CONTAINS_EXISTING_DATABASE.validate(_fDatabaseLayout.databaseDirectory());
    } catch (

        IllegalArgumentException _illegalArgumentException) {

      throw new CommandFailedException("*** Error: 83177ab3-2357-4e3c-b16f-50ed3d46ae8e",
          _illegalArgumentException);
    }
  }


  private static void _vaittaeForDa(DatabaseLayout _tDatabaseLayout) {

    Path _ptPath = _tDatabaseLayout.databaseDirectory();
    if (Files.exists(_ptPath, new LinkOption[0])) {
      if (!Files.isDirectory(_ptPath, new LinkOption[0])) {

        throw new CommandFailedException("*** Error: 6832edd6-f025-46d8-a198-27ad69777e83");
      }

      try {
        if (!FileUtils.isDirectoryEmpty(_ptPath)) {

          throw new CommandFailedException("*** Error: 19f2a71b-2d00-49c8-862c-1a21badcc20b");
        }
      } catch (

          IOException _iOException) {

        throw new CommandFailedException("*** Error: 9f23d067-a4e5-4b93-b530-755daae336be",
            _iOException);
      }
    } else {
      try {
        Files.createDirectories(_ptPath);
      } catch (

          IOException _iOException2) {

        throw new CommandFailedException("*** Error: 16a1dab7-0631-47be-809b-14817f808d7d");
      }
    }
  }


  static List<String> quasList(char _cCs, boolean _isT, String val) {

    List<String> _listSltString = new ArrayList();

    boolean _isQi = false;

    int _iSos = 0;

    int _iLa = val.length();

    for (

        int cur = 0; cur < _iLa; ++cur) {

      char _cC = val.charAt(cur);
      if (_cC == '`') {
        _isQi = !_isQi;
      } else if (_cC == _cCs && !_isQi) {
        _listSltString.add(_trquacesrString(_isT, val.substring(_iSos, cur)));
        _iSos = cur + 1;
      }
    }

    if (_isQi) {

      throw new TypeConversionException("*** Error:  25f4b8d7-fd68-4d8e-8492-343dbd11b3d2");
    } else {
      if (_iSos <= _iLa) {
        _listSltString.add(_trquacesrString(_isT, val.substring(_iSos, _iLa)));
      }

      return _listSltString;
    }
  }


  private Config _bulcoiConfig() {

    Config _cConfig =
        Config.newBuilder().fromFileNoThrow(
                this.ctx.confDir().resolve(io.github.onograph.TokenConstants.NEO4J__CONF))
            .set(GraphDatabaseSettings.neo4j_home, this.ctx.homeDir())
            .commandExpansion(this.allowCommandExpansion).build();
    ConfigUtils.disableAllConnectors(_cConfig);
    _cConfig.set(GraphDatabaseSettings.record_format, "");
    return _cConfig;
  }


  private DatabaseLayout _gefodaltDatabaseLayout(Config _config) throws IOException {
    if (this.sucNormalizedDatabaseNamePathOptionWrapper.path != null) {
      this.sucNormalizedDatabaseNamePathOptionWrapper.path = this.sucNormalizedDatabaseNamePathOptionWrapper.path.toAbsolutePath();
      if (!Files.isDirectory(this.sucNormalizedDatabaseNamePathOptionWrapper.path,
          new LinkOption[0])) {

        throw new CommandFailedException("*** Error: 4d4db288-2783-49cf-a729-851604313024");
      } else if ((new TransactionLogFilesHelper(this.ctx.fs(),
          this.sucNormalizedDatabaseNamePathOptionWrapper.path)).getMatchedFiles().length > 0) {
        return DatabaseLayout.ofFlat(this.sucNormalizedDatabaseNamePathOptionWrapper.path);
      } else if (this.ltsPath == null) {

        throw new CommandFailedException("*** Error:  f8c4995a-4388-4d98-a788-a44c53b2a646");
      } else {

        Path gdbName = this.sucNormalizedDatabaseNamePathOptionWrapper.path.getFileName();
        if (!gdbName.equals(this.ltsPath.getFileName())) {

          throw new CommandFailedException("*** Error:  5a252c26-161c-4eb1-ad93-00ba1d574546");
        } else {
          this.ltsPath = this.ltsPath.toAbsolutePath();

          Config _cConfig = Config.newBuilder()
              .set(GraphDatabaseSettings.default_database, gdbName.toString())
              .set(GraphDatabaseSettings.neo4j_home,
                  this.sucNormalizedDatabaseNamePathOptionWrapper.path.getParent())
              .set(GraphDatabaseInternalSettings.databases_root_path,
                  this.sucNormalizedDatabaseNamePathOptionWrapper.path.getParent())
              .set(GraphDatabaseSettings.transaction_logs_root_path, this.ltsPath.getParent())
              .commandExpansion(this.allowCommandExpansion).build();
          return DatabaseLayout.of(_cConfig);
        }
      }
    } else {
      return Neo4jLayout.of(_config).databaseLayout(
          this.sucNormalizedDatabaseNamePathOptionWrapper.normalizedDatabaseName.name());
    }
  }


  private void _veycalnaus() {
    if (!this.listLwndString.isEmpty() && !this.listLwnokString.isEmpty()) {

      throw new CommandFailedException("*** Error:  360c106d-0c45-4bb3-8e01-500acc797273");
    } else if (!this.listPsString.isEmpty() && (!this.listSnpTokenNamePropertyDTO.isEmpty()
        || !this.listPnokTokenNamePropertyDTO.isEmpty()) ||
        !this.listSnpTokenNamePropertyDTO.isEmpty()
            && !this.listPnokTokenNamePropertyDTO.isEmpty()) {

      throw new CommandFailedException("*** Error:  0e990ad2-135c-47c0-923e-60ed2fb93d4b");
    } else if (!this.listPsString.isEmpty() && (!this.listPrsTokenNamePropertyDTO.isEmpty()
        || !this.listProkTokenNamePropertyDTO.isEmpty()) ||
        !this.listPrsTokenNamePropertyDTO.isEmpty()
            && !this.listProkTokenNamePropertyDTO.isEmpty()) {

      throw new CommandFailedException("*** Error:  9083fe81-26a8-4c7b-9d18-c36ddc62e39d");
    }
  }

  @Override
  public void execute() throws Exception {
    this._veycalnaus();

    Config _config = this._bulcoiConfig();

    DatabaseLayout _frDatabaseLayout = this._gefodaltDatabaseLayout(_config);
    if ("system".equals(_frDatabaseLayout.getDatabaseName()) && !this.isFre) {

      throw new CommandFailedException("*** Error:  b4f67ed0-1cb9-42a4-9f13-62eb5f76dec2");
    } else {
      _vaitsocForDa(_frDatabaseLayout);

      Neo4jLayout _ltNeo4jLayout =
          this.thPath != null ? Neo4jLayout.of(this.thPath) : Neo4jLayout.of(_config);

      DatabaseLayout _tDatabaseLayout = _ltNeo4jLayout.databaseLayout(
          this.normalizedDatabaseName.name());

      EmptyMemoryTracker _emptyMemoryTracker = EmptyMemoryTracker.INSTANCE;
      _vaittaeForDa(_tDatabaseLayout);

      try {

        Closeable _inrdCloseable = LockChecker.checkDatabaseLock(_frDatabaseLayout);

        try {
          if (!this.isFre) {
            _chcdbsaForDaCoMe(_config, _frDatabaseLayout, _emptyMemoryTracker);
          }

          try {

            Closeable _inrdCloseable2 = LockChecker.checkDatabaseLock(_tDatabaseLayout);

            try {

              NodeStoreWrapper _copNodeStoreWrapper = new NodeStoreWrapper(_config,
                  _frDatabaseLayout, this.frmt,
                  this.verbose, this.listLwndString,
                  this.listLsString, this.listLwnokString,
                  this.listPnokTokenNamePropertyDTO, this.listSnpTokenNamePropertyDTO,
                  this.listProkTokenNamePropertyDTO,
                  this.listPrsTokenNamePropertyDTO, this.listPsString,
                  this.listRsString, this.ctx.out(), this.pageCacheTracer,
                  Clocks.nanoClock());

              try {
                _copNodeStoreWrapper.coytForDaSt(this.strMcpf, _tDatabaseLayout);
              } catch (

                  Exception _exception) {

                throw new CommandFailedException("*** Error:  f03bad6d-bc79-46c2-9bdb-6a483ae315b0",
                    _exception);
              }
            } catch (

                Throwable _throwable) {
              if (_inrdCloseable2 != null) {
                try {
                  _inrdCloseable2.close();
                } catch (

                    Throwable _throwable2) {
                  _throwable.addSuppressed(_throwable2);
                }
              }

              throw _throwable;
            }

            if (_inrdCloseable2 != null) {
              _inrdCloseable2.close();
            }
          } catch (

              FileLockException _fileLockException) {

            throw new CommandFailedException("*** Error:  67641597-d43d-43ab-8c4e-5ae1c3348516",
                _fileLockException);
          }
        } catch (

            Throwable _throwable3) {
          if (_inrdCloseable != null) {
            try {
              _inrdCloseable.close();
            } catch (

                Throwable _throwable4) {
              _throwable3.addSuppressed(_throwable4);
            }
          }

          throw _throwable3;
        }

        if (_inrdCloseable != null) {
          _inrdCloseable.close();
        }
      } catch (

          FileLockException _fileLockException2) {

        throw new CommandFailedException("*** Error: 2cf21d17-8613-4d63-b429-35df66c86895",
            _fileLockException2);
      }
    }
  }


  @VisibleForTesting
  public void sepgchtcForPa(PageCacheTracer _pageCacheTracer) {
    this.pageCacheTracer = _pageCacheTracer;
  }


  static class ITypeConverterListofStringListImpl implements
      ITypeConverter<List<TokenNamePropertyDTO>> {

    @Override
    public List<TokenNamePropertyDTO> convert(String val) {
      return (List) NodeStoreWrapperCopyCommand.quasList(',', false, val).stream().map((s) ->
      {
        return NodeStoreWrapperCopyCommand.quasList('.', true, s);
      }).map((strings) ->
      {
        if (strings.size() != 2) {

          throw new TypeConversionException(
              "*** Error: b8eae59d-2406-4eb0-86b3-ed43a02cc245");
        } else {
          return new TokenNamePropertyDTO(
              (String) strings.get(1),
              (String) strings.get(0));
        }
      }).collect(Collectors.toList());
    }
  }


  static class ITypeConverterStringListImpl implements ITypeConverter<List<String>> {

    @Override
    public List<String> convert(String val) {
      return NodeStoreWrapperCopyCommand.quasList(',', true, val);
    }
  }


  private static class NormalizedDatabaseNamePathOptionWrapper {


    @Option(
        names = {
            io.github.onograph.TokenConstants.NORMALIZED_DATABASE_NAME_PATH_OPTION_WRAPPER___OPTION__NORMALIZED_DATABASE_NAME__NAMES},
        description = {
            io.github.onograph.TokenConstants.NORMALIZED_DATABASE_NAME_PATH_OPTION_WRAPPER___OPTION__NORMALIZED_DATABASE_NAME__DESCRIPTION},
        required = true,
        converter = {DatabaseNameConverter.class}
    )
    private NormalizedDatabaseName normalizedDatabaseName;


    @Option(
        names = {
            io.github.onograph.TokenConstants.NORMALIZED_DATABASE_NAME_PATH_OPTION_WRAPPER___OPTION__PATH__NAMES},
        description = {
            io.github.onograph.TokenConstants.NORMALIZED_DATABASE_NAME_PATH_OPTION_WRAPPER___OPTION__PATH__DESCRIPTION},
        required = true
    )
    private Path path;
  }
}
