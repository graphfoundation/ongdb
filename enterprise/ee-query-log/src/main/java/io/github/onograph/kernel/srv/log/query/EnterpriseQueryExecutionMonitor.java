package io.github.onograph.kernel.srv.log.query;

import java.nio.file.Path;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.LogQueryLevel;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.impl.query.QueryExecutionMonitor;
import org.neo4j.kernel.impl.query.TransactionExecutionMonitor;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Level;
import org.neo4j.logging.Log;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.LogConfig;
import org.neo4j.logging.log4j.LogConfig.Builder;
import org.neo4j.logging.log4j.LogExtended;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.memory.HeapDumper;


class EnterpriseQueryExecutionMonitor extends LifecycleAdapter implements QueryExecutionMonitor,
    TransactionExecutionMonitor {


  private final Config config;


  private final FileSystemAbstraction fileSystemAbstraction;


  private Neo4jLoggerContext clNeo4jLoggerContext;


  private Path hdpPath;


  private HeapDumper heapDumper;


  private int iAmc;


  private volatile QueryLoggingService lcQueryLoggingService;


  private long lgTrc;


  private Log log;

  EnterpriseQueryExecutionMonitor(Config _config, FileSystemAbstraction _fileSystemAbstraction) {
    this.lcQueryLoggingService = QueryLoggingService.NO_LG;
    this.config = _config;
    this.fileSystemAbstraction = _fileSystemAbstraction;
  }


  private static boolean _isFitoqrForQu(QuerySnapshot _querySnapshot) {

    String _strTq = _querySnapshot.rawQueryText().stripLeading();
    return _strTq.startsWith(
        io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.log.query.EnterpriseQueryExecutionMonitor.startsWith"))
        ||
        _strTq.startsWith(
            io.github.onograph.I18N.format(
                "io.github.onograph.kernel.srv.log.query.EnterpriseQueryExecutionMonitor.startsWith2"));
  }


  private void _clcnlia() {
    if (this.clNeo4jLoggerContext != null) {
      this.clNeo4jLoggerContext.close();
      this.clNeo4jLoggerContext = null;
      this.log = null;
    }
  }


  private Builder _geqelgbdLogConfigBuilder(int _iMa, long _lgRt) {
    return LogConfig.createBuilder(this.fileSystemAbstraction,
            this.config.get(GraphDatabaseSettings.log_queries_filename), Level.INFO)
        .withTimezone(this.config.get(GraphDatabaseSettings.db_timezone))
        .withFormat(this.config.get(GraphDatabaseSettings.log_query_format))
        .withRotation(_lgRt, _iMa).withCategory(false);
  }


  private <T> void _retdnsnuaForSe(Setting<T> _settingStigT) {
    this.config.addListener(_settingStigT, (a, b) ->
    {
      this._upastg();
    });
  }


  private synchronized void _upastg() {
    this._upelseg();
    this._upeqylest();
  }


  private void _upelseg() {
    if (this.config.get(GraphDatabaseSettings.log_queries) == LogQueryLevel.OFF &&
        this.config.get(GraphDatabaseSettings.log_queries_transactions_level)
            == LogQueryLevel.OFF) {
      this._clcnlia();
    } else {

      long _lgTr = this.config.get(GraphDatabaseSettings.log_queries_rotation_threshold);

      int _iAm = this.config.get(GraphDatabaseSettings.log_queries_max_archives);
      if (this.clNeo4jLoggerContext == null) {
        this.clNeo4jLoggerContext = this._geqelgbdLogConfigBuilder(_iAm, _lgTr).build();
        this.log = (new Log4jLogProvider(this.clNeo4jLoggerContext)).getLog("");
        this.lgTrc = _lgTr;
        this.iAmc = _iAm;
      } else if (_lgTr != this.lgTrc || _iAm != this.iAmc) {
        LogConfig.reconfigureLogging(this.clNeo4jLoggerContext,
            this._geqelgbdLogConfigBuilder(_iAm, _lgTr));
        this.lgTrc = _lgTr;
        this.iAmc = _iAm;
      }
    }
  }


  private void _upeqylest() {
    if (this.config.get(GraphDatabaseSettings.log_queries) == LogQueryLevel.OFF &&
        this.config.get(GraphDatabaseSettings.log_queries_transactions_level)
            == LogQueryLevel.OFF) {
      this.heapDumper = null;
      this.lcQueryLoggingService = QueryLoggingService.NO_LG;
    } else {

      boolean _isEdh = this.config.get(GraphDatabaseInternalSettings.log_queries_heap_dump_enabled);
      if (_isEdh) {
        this.heapDumper = new HeapDumper();
        this.hdpPath = this.config.get(GraphDatabaseSettings.log_queries_filename).getParent();
      } else {
        this.heapDumper = null;
      }

      this.lcQueryLoggingService = new QueryLoggingServiceImpl(this.config, (LogExtended) this.log);
    }
  }

  @Override
  public void beforeEnd(ExecutingQuery _executingQuery, boolean _isSces) {
    if (this.heapDumper != null) {

      QuerySnapshot _querySnapshot = _executingQuery.snapshot();
      if (!_isFitoqrForQu(_querySnapshot)) {

        String _strSfi = _isSces ? "" : io.github.onograph.TokenConstants._FAIL;

        String _strFd = this.hdpPath.resolve(
            String.format("query-%s%s.hprof", _querySnapshot.id(), _strSfi)).toString();
        this.heapDumper.createHeapDump(_strFd, true);
      }
    }
  }

  @Override
  public void commit(KernelTransaction _tKernelTransaction) {
    this.lcQueryLoggingService.comForKe(_tKernelTransaction);
  }

  @Override
  public void endFailure(ExecutingQuery _executingQuery, Throwable _fiueThrowable) {
    this.lcQueryLoggingService.faleForExTh(_executingQuery, _fiueThrowable);
  }

  @Override
  public void endFailure(ExecutingQuery _executingQuery, String _strRao) {
    this.lcQueryLoggingService.faleForExTh(_executingQuery, _strRao);
  }

  @Override
  public void endSuccess(ExecutingQuery _executingQuery) {
    this.lcQueryLoggingService.sucsForEx(_executingQuery);
  }

  @Override
  public synchronized void init() {
    this._upastg();
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_query_plan);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_threshold);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_rotation_threshold);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_max_archives);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_runtime_logging_enabled);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_parameter_logging_enabled);
    this._retdnsnuaForSe(GraphDatabaseSettings.query_log_max_parameter_length);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_parameter_full_entities);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_page_detail_logging_enabled);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_allocation_logging_enabled);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_detailed_time_logging_enabled);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_early_raw_logging_enabled);
    this._retdnsnuaForSe(GraphDatabaseInternalSettings.log_queries_heap_dump_enabled);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_transaction_id);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_transactions_level);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_transaction_threshold);
    this._retdnsnuaForSe(GraphDatabaseSettings.log_queries_obfuscate_literals);
  }

  @Override
  public void rollback(KernelTransaction _tKernelTransaction, Throwable _fiueThrowable) {
    this.lcQueryLoggingService.rolcForKe(_tKernelTransaction, _fiueThrowable);
  }

  @Override
  public void rollback(KernelTransaction _tKernelTransaction) {
    this.lcQueryLoggingService.rolcForKe(_tKernelTransaction);
  }

  @Override
  public synchronized void shutdown() {
    this._clcnlia();
  }

  @Override
  public void start(KernelTransaction _tKernelTransaction) {
    this.lcQueryLoggingService.strForEx(_tKernelTransaction);
  }

  @Override
  public void startExecution(ExecutingQuery _executingQuery) {
    this.lcQueryLoggingService.strForEx(_executingQuery);
  }

  @Override
  public void startProcessing(ExecutingQuery _executingQuery) {
    this.lcQueryLoggingService.strForEx(_executingQuery);
  }
}
