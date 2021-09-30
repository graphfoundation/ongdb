package io.github.onograph.kernel.srv.log.query;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.LogQueryLevel;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.log4j.LogExtended;
import org.neo4j.logging.log4j.StructureAwareMessage;
import org.neo4j.values.AnyValueWriter.EntityMode;
import org.neo4j.values.virtual.MapValue;


class QueryLoggingServiceImpl implements QueryLoggingService {


  private final int iLmp;


  private final boolean isBal;


  private final boolean isDpl;


  private final boolean isItl;


  private final boolean isLdt;


  private final boolean isLo;


  private final boolean isLr;


  private final boolean isPl;


  private final boolean isPql;


  private final boolean isRl;


  private final long lgMtq;


  private final long lgMtt;


  private final LogQueryLevel llqLogQueryLevel;


  private final LogExtended logExtended;


  private final LogQueryLevel ltlLogQueryLevel;


  private final EntityMode prmtrEntityMode;


  QueryLoggingServiceImpl(Config _config, LogExtended _logExtended) {
    this.logExtended = _logExtended;
    this.lgMtq = _config.get(GraphDatabaseSettings.log_queries_threshold).toMillis();
    this.lgMtt = _config.get(GraphDatabaseSettings.log_queries_transaction_threshold).toMillis();
    this.isPql = _config.get(GraphDatabaseSettings.log_queries_parameter_logging_enabled);
    this.iLmp = _config.get(GraphDatabaseSettings.query_log_max_parameter_length);
    this.prmtrEntityMode =
        _config.get(GraphDatabaseSettings.log_queries_parameter_full_entities) ? EntityMode.FULL
            : EntityMode.REFERENCE;
    this.isLdt = _config.get(GraphDatabaseSettings.log_queries_detailed_time_logging_enabled);
    this.isBal = _config.get(GraphDatabaseSettings.log_queries_allocation_logging_enabled);
    this.isDpl = _config.get(GraphDatabaseSettings.log_queries_page_detail_logging_enabled);
    this.isRl = _config.get(GraphDatabaseSettings.log_queries_runtime_logging_enabled);
    this.llqLogQueryLevel = _config.get(GraphDatabaseSettings.log_queries);
    this.ltlLogQueryLevel = _config.get(GraphDatabaseSettings.log_queries_transactions_level);
    this.isLr = _config.get(GraphDatabaseSettings.log_queries_early_raw_logging_enabled);
    this.isPl = _config.get(GraphDatabaseSettings.log_queries_query_plan);
    this.isItl = _config.get(GraphDatabaseSettings.log_queries_transaction_id);
    this.isLo = _config.get(GraphDatabaseSettings.log_queries_obfuscate_literals);
  }


  private boolean _isCaceloerForQu(QuerySnapshot _querySnapshot) {
    return _querySnapshot.obfuscatedQueryText().isPresent() || this.isLr;
  }


  private boolean _isExdtedForKe(ExecutingQuery _executingQuery) {
    return TimeUnit.NANOSECONDS.toMillis(_executingQuery.elapsedNanos()) >= this.lgMtq;
  }


  private boolean _isExdtedForKe(KernelTransaction _kernelTransaction) {
    return _kernelTransaction.clocks().systemClock().millis() - _kernelTransaction.startTime()
        >= this.lgMtt;
  }

  @Override
  public void comForKe(KernelTransaction _kernelTransaction) {
    if (this.ltlLogQueryLevel == LogQueryLevel.VERBOSE
        || this.ltlLogQueryLevel == LogQueryLevel.INFO && this._isExdtedForKe(_kernelTransaction)) {

    }
  }

  @Override
  public void faleForExTh(ExecutingQuery _executingQuery, Throwable _fiueThrowable) {
    if (this.llqLogQueryLevel != LogQueryLevel.OFF) {

    }
  }

  @Override
  public void faleForExTh(ExecutingQuery _executingQuery, String _strRao) {
    if (this.llqLogQueryLevel != LogQueryLevel.OFF) {

    }
  }

  @Override
  public void rolcForKe(KernelTransaction _kernelTransaction, Throwable _fiueThrowable) {
    if (_fiueThrowable == null) {
      this.rolcForKe(_kernelTransaction);
    } else if (this.ltlLogQueryLevel != LogQueryLevel.OFF) {

      StructureAwareMessageImpl _lStructureAwareMessageImpl =
          new StructureAwareMessageImpl(
              TrxEvType.TRX_ROLLBACK, _kernelTransaction.getDatabaseName(),
              _kernelTransaction.getUserTransactionId(),
              _kernelTransaction.securityContext().subject().username());


    }
  }

  @Override
  public void rolcForKe(KernelTransaction _kernelTransaction) {
    if (this.ltlLogQueryLevel == LogQueryLevel.VERBOSE
        || this.ltlLogQueryLevel == LogQueryLevel.INFO && this._isExdtedForKe(_kernelTransaction)) {

    }
  }

  @Override
  public void strForEx(ExecutingQuery _executingQuery) {
    if (this.llqLogQueryLevel == LogQueryLevel.VERBOSE) {

      QuerySnapshot _querySnapshot = _executingQuery.snapshot();

      boolean _isSla = this.isLr && _querySnapshot.obfuscatedQueryText().isPresent();

      boolean _isCls = this._isCaceloerForQu(_querySnapshot);
      if (!_isSla && _isCls) {

      }
    }
  }

  @Override
  public void strForEx(KernelTransaction _kernelTransaction) {
    if (this.ltlLogQueryLevel == LogQueryLevel.VERBOSE) {

    }
  }

  @Override
  public void sucsForEx(ExecutingQuery _executingQuery) {
    if (this.llqLogQueryLevel == LogQueryLevel.VERBOSE
        || this.llqLogQueryLevel == LogQueryLevel.INFO && this._isExdtedForKe(_executingQuery)) {

    }
  }


  private enum QueryEvType {


    QUERY_BEGIN,

    QUERY_ERR,

    QUERY_COMPLETED_OK
  }


  private enum TrxEvType {


    TRX_START,

    TRX_ROLLBACK,

    TRX_COMMIT
  }


  private static class StructureAwareMessageImpl extends StructureAwareMessage {


    private static final String DELIM = " - ";


    private final TrxEvType ev;


    private final String gdbName;


    private final long transIdx;


    private final String uname;


    private StructureAwareMessageImpl(TrxEvType ev, String gdbName, long transIdx, String uname) {
      this.ev = ev;
      this.gdbName = gdbName;
      this.transIdx = transIdx;
      this.uname = uname;
    }

    @Override
    public void asString(StringBuilder _sStringBuilder) {
      switch (this.ev) {
        case TRX_START:
          _sStringBuilder.append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.StructureAwareMessageImpl.append"));
          break;
        case TRX_COMMIT:
          _sStringBuilder.append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.StructureAwareMessageImpl.append2"));
          break;
        case TRX_ROLLBACK:
          _sStringBuilder.append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.StructureAwareMessageImpl.append3"));
          break;
        default:

          throw new IllegalArgumentException("*** Error: af47d213-48de-4572-ad03-d812d68de25b");
      }

      _sStringBuilder.append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.StructureAwareMessageImpl.append4"))
          .append(this.transIdx)
          .append(" - ");
      _sStringBuilder.append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.StructureAwareMessageImpl.append5"))
          .append(this.gdbName)
          .append(" - ");
      _sStringBuilder.append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.StructureAwareMessageImpl.append6"))
          .append(this.uname);
    }

    @Override
    public void asStructure(FieldConsumer _fieldConsumer) {
      _fieldConsumer.add(io.github.onograph.TokenConstants.EVENT, this.ev.name().toLowerCase());
      _fieldConsumer.add(io.github.onograph.TokenConstants.TYPE,
          io.github.onograph.TokenConstants.TRANSACTION);
      _fieldConsumer.add(io.github.onograph.TokenConstants.DATABASE, this.gdbName);
      _fieldConsumer.add(io.github.onograph.TokenConstants.USERNAME, this.uname);
      _fieldConsumer.add(io.github.onograph.TokenConstants.TRANSACTION_ID, this.transIdx);
    }
  }


  private class EntryLogStructuredMessage extends StructureAwareMessage {


    private final QueryEvType ev;


    private final String gdbName;


    private final boolean isTqrus;


    private final boolean isTrus;


    private final Optional<String> optionalTqString;


    private final QuerySnapshot querySnapshot;


    private final String strRao;


    private final String strSs;


    private final String uname;


    private EntryLogStructuredMessage(QueryEvType ev, boolean _isRtf,
        QuerySnapshot _querySnapshot) {
      this(ev, _isRtf, _querySnapshot, null);
    }


    private EntryLogStructuredMessage(QueryEvType ev, boolean _isRtf, QuerySnapshot _querySnapshot,
        String _strRao) {
      this.querySnapshot = _querySnapshot;
      this.ev = ev;
      this.strRao = _strRao;
      this.strSs = _querySnapshot.clientConnection().asConnectionDetails();
      this.uname = _querySnapshot.username();
      this.gdbName = _querySnapshot.databaseId().map(NamedDatabaseId::name).orElse("<none>");

      Optional<String> _optionalOtString = _querySnapshot.obfuscatedQueryText();
      this.isTrus = QueryLoggingServiceImpl.this.isLr || _optionalOtString.isEmpty() && _isRtf;
      this.isTqrus = !QueryLoggingServiceImpl.this.isLo && this.isTrus;
      this.optionalTqString =
          this.isTqrus ? Optional.of(_querySnapshot.rawQueryText()) : _optionalOtString;
    }

    @Override
    public void asString(StringBuilder _sStringBuilder) {
      if (this.ev == QueryEvType.QUERY_BEGIN) {
        _sStringBuilder.append(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.EntryLogStructuredMessage.append"));
      }

      if (QueryLoggingServiceImpl.this.llqLogQueryLevel == LogQueryLevel.VERBOSE) {
        _sStringBuilder.append("id:").append(this.querySnapshot.id()).append(" - ");
      }

      if (QueryLoggingServiceImpl.this.isItl) {
        _sStringBuilder.append(io.github.onograph.I18N.format(
                "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.EntryLogStructuredMessage.append2"))
            .append(this.querySnapshot.transactionId()).append(" - ");
      }

      _sStringBuilder.append(TimeUnit.MICROSECONDS.toMillis(this.querySnapshot.elapsedTimeMicros()))
          .append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.EntryLogStructuredMessage.append3"));
      if (QueryLoggingServiceImpl.this.isLdt) {
        Formatter.fotditiForStQu(this.querySnapshot, _sStringBuilder);
      }

      if (QueryLoggingServiceImpl.this.isBal) {
        Formatter.fotacbForStQu(this.querySnapshot, _sStringBuilder);
      }

      if (QueryLoggingServiceImpl.this.isDpl) {
        Formatter.fotpdlForStQu(this.querySnapshot, _sStringBuilder);
      }

      _sStringBuilder.append(this.strSs).append("\t").append(this.gdbName).append(" - ")
          .append(this.uname);
      this.optionalTqString.ifPresent((s) ->
      {
        _sStringBuilder.append(" - ").append(s);
      });
      if (QueryLoggingServiceImpl.this.isPql) {

        MapValue _prmMapValue = this.isTrus ? this.querySnapshot.rawQueryParameters()
            : this.querySnapshot.obfuscatedQueryParameters().get();
        Formatter.fommvuForStMaAn(QueryLoggingServiceImpl.this.prmtrEntityMode,
            QueryLoggingServiceImpl.this.iLmp, _prmMapValue,
            _sStringBuilder.append(" - "));
      }

      if (QueryLoggingServiceImpl.this.isRl) {
        _sStringBuilder.append(io.github.onograph.I18N.format(
                "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.EntryLogStructuredMessage.append4"))
            .append(this.querySnapshot.runtime());
      }

      Formatter.fommForStMa(this.querySnapshot.transactionAnnotationData(),
          _sStringBuilder.append(" - "));
      if (this.strRao != null && (this.optionalTqString.isPresent()
          || !QueryLoggingServiceImpl.this.isLo)) {
        _sStringBuilder.append(" - ").append(this.strRao.split(System.lineSeparator())[0]);
      }

      if (QueryLoggingServiceImpl.this.isPl && this.querySnapshot.queryPlanSupplier() != null) {
        _sStringBuilder.append(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.EntryLogStructuredMessage.append5"));

        try {
          _sStringBuilder.append(this.querySnapshot.queryPlanSupplier().get().toString());
        } catch (

            Exception _exception) {
          _sStringBuilder.append(io.github.onograph.I18N.format(
                  "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.EntryLogStructuredMessage.append6"))
              .append(_exception.getMessage());
        }
      }
    }

    @Override
    public void asStructure(FieldConsumer _fieldConsumer) {

      StringBuilder _bfeStringBuilder = new StringBuilder();
      _fieldConsumer.add(io.github.onograph.TokenConstants.EVENT, this.ev.toString().toLowerCase());
      _fieldConsumer.add(io.github.onograph.TokenConstants.TYPE,
          io.github.onograph.TokenConstants.QUERY);
      if (QueryLoggingServiceImpl.this.llqLogQueryLevel == LogQueryLevel.VERBOSE) {
        _fieldConsumer.add(io.github.onograph.TokenConstants.ID, this.querySnapshot.id());
      }

      _fieldConsumer.add(io.github.onograph.TokenConstants.ELAPSED_TIME_MS,
          TimeUnit.MICROSECONDS.toMillis(this.querySnapshot.elapsedTimeMicros()));
      if (QueryLoggingServiceImpl.this.isLdt) {
        _fieldConsumer.add(io.github.onograph.TokenConstants.PLANNING,
            TimeUnit.MICROSECONDS.toMillis(this.querySnapshot.compilationTimeMicros()));
        this.querySnapshot.cpuTimeMicros().ifPresent((cpu) ->
        {
          _fieldConsumer.add(io.github.onograph.TokenConstants.CPU,
              TimeUnit.MICROSECONDS.toMillis(cpu));
        });
        _fieldConsumer.add(io.github.onograph.TokenConstants.WAITING,
            TimeUnit.MICROSECONDS.toMillis(this.querySnapshot.waitTimeMicros()));
      }

      if (QueryLoggingServiceImpl.this.isBal) {
        _fieldConsumer.add(io.github.onograph.TokenConstants.ALLOCATED_BYTES,
            this.querySnapshot.allocatedBytes());
      }

      if (QueryLoggingServiceImpl.this.isDpl) {
        _fieldConsumer.add(io.github.onograph.TokenConstants.PAGE_HITS,
            this.querySnapshot.pageHits());
        _fieldConsumer.add(io.github.onograph.TokenConstants.PAGE_FAULTS2,
            this.querySnapshot.pageFaults());
      }

      _fieldConsumer.add(io.github.onograph.TokenConstants.SOURCE, this.strSs);
      _fieldConsumer.add(io.github.onograph.TokenConstants.DATABASE, this.gdbName);
      _fieldConsumer.add(io.github.onograph.TokenConstants.USERNAME, this.uname);
      this.optionalTqString.ifPresent((s) ->
      {
        _fieldConsumer.add(io.github.onograph.TokenConstants.QUERY, s);
      });
      if (QueryLoggingServiceImpl.this.isPql) {

        Optional<MapValue> _optionalPrmMapValue =
            this.isTrus ? Optional.of(this.querySnapshot.rawQueryParameters())
                : this.querySnapshot.obfuscatedQueryParameters();
        if (_optionalPrmMapValue.isPresent()) {
          Formatter.fommvuForStMaAn(QueryLoggingServiceImpl.this.prmtrEntityMode,
              QueryLoggingServiceImpl.this.iLmp, _optionalPrmMapValue.get(),
              _bfeStringBuilder);
          _fieldConsumer.add(io.github.onograph.TokenConstants.QUERY_PARAMETERS,
              _bfeStringBuilder.toString());
        }
      }

      if (QueryLoggingServiceImpl.this.isRl) {
        _fieldConsumer.add(io.github.onograph.TokenConstants.RUNTIME, this.querySnapshot.runtime());
      }

      _bfeStringBuilder.setLength(0);
      Formatter.fommForStMa(this.querySnapshot.transactionAnnotationData(), _bfeStringBuilder);
      _fieldConsumer.add(io.github.onograph.TokenConstants.ANNOTATION_DATA,
          _bfeStringBuilder.toString());
      if (this.strRao != null && (this.optionalTqString.isPresent()
          || !QueryLoggingServiceImpl.this.isLo)) {
        _fieldConsumer.add(io.github.onograph.TokenConstants.FAILURE_REASON, this.strRao);
      }

      if (QueryLoggingServiceImpl.this.isItl) {
        _fieldConsumer.add(io.github.onograph.TokenConstants.TRANSACTION_ID,
            this.querySnapshot.transactionId());
      }

      if (QueryLoggingServiceImpl.this.isPl && this.querySnapshot.queryPlanSupplier() != null) {
        try {
          _fieldConsumer.add(io.github.onograph.TokenConstants.QUERY_PLAN,
              this.querySnapshot.queryPlanSupplier().get().toString());
        } catch (

            Exception _exception) {
          _fieldConsumer.add(io.github.onograph.TokenConstants.QUERY_PLAN,
              io.github.onograph.I18N.format(
                  "io.github.onograph.kernel.srv.log.query.QueryLoggingServiceImpl.EntryLogStructuredMessage.add",
                  _exception.getMessage()));
        }
      }
    }
  }
}
