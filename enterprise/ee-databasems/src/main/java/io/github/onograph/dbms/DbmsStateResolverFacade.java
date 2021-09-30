package io.github.onograph.dbms;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.database.DatabaseStartAbortedException;
import org.neo4j.internal.helpers.DefaultTimeoutStrategy;
import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;


public class DbmsStateResolverFacade {


  protected final Log log;


  private final GdbReconcilerExecutorWrapper eeuosGdbReconcilerExecutorWrapper;


  private final boolean isRc;


  private final ReentrantLockReconcilerManager lcsReentrantLockReconcilerManager;


  private final List<DatabaseStateUpdateHandler> listLseesDatabaseStateUpdateHandler;


  private final Map<String, CompletableFuture<ReconcilePointStateMeta>> mapCjwsc;


  private final Map<String, DatabaseStateEnterpriseImpl> mapScsd;


  private final TimeoutStrategy timeoutStrategy;


  private final StateChangeTrackerMapping ttStateChangeTrackerMapping;


  DbmsStateResolverFacade(Config _config, JobScheduler _jobScheduler, LogProvider _logProvider,
      StateChangeTrackerMapping _ttStateChangeTrackerMapping) {
    this.isRc = _config.get(GraphDatabaseSettings.reconciler_may_retry);
    this.timeoutStrategy = DefaultTimeoutStrategy.exponential(
        _config.get(GraphDatabaseSettings.reconciler_minimum_backoff).toMillis(),
        _config.get(GraphDatabaseSettings.reconciler_maximum_backoff).toMillis(),
        TimeUnit.MILLISECONDS);
    this.eeuosGdbReconcilerExecutorWrapper = new GdbReconcilerExecutorWrapper(_config,
        _jobScheduler);
    this.lcsReentrantLockReconcilerManager = new ReentrantLockReconcilerManager();
    this.mapScsd = new ConcurrentHashMap();
    this.mapCjwsc = new ConcurrentHashMap();
    this.log = _logProvider.getLog(this.getClass());
    this.ttStateChangeTrackerMapping = _ttStateChangeTrackerMapping;
    this.listLseesDatabaseStateUpdateHandler = new CopyOnWriteArrayList();
  }


  private static Map<String, DatabaseStateEnterpriseImpl> _condtMap(
      BinaryOperator<DatabaseStateEnterpriseImpl> _binaryOperatorPeeecDatabaseStateEnterpriseImpl,
      Map<String, DatabaseStateEnterpriseImpl> _mapCmiesd,
      Map<String, DatabaseStateEnterpriseImpl> _mapOeaosd) {
    return Stream.concat(_mapCmiesd.entrySet().stream(), _mapOeaosd.entrySet().stream())
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
            _binaryOperatorPeeecDatabaseStateEnterpriseImpl));
  }


  private static ReconcilePointStateMeta _dotnocastReconcilePointStateMeta(
      StateChangeException _foStateChangeException,
      ReconcilePointStateMeta _rslReconcilePointStateMeta, StateChange.TransSetup transSetup) {
    try {
      transSetup.doclnDatabaseStateEnterpriseImpl();
    } catch (

        StateChangeException _stateChangeException) {
      _foStateChangeException.getCause().addSuppressed(_stateChangeException.getCause());
    }

    return _rslReconcilePointStateMeta.databaseStateEnterpriseImpl(
            _foStateChangeException.getSefDatabaseStateEnterpriseImpl())
        .esThrowable(_foStateChangeException.getCause());
  }


  private static ReconcilePointStateMeta _dotnospReconcilePointStateMeta(
      Iterator<StateChange.TransSetup> _iteratorSesTransSetup,
      ReconcilePointStateMeta _rslReconcilePointStateMeta) {
    if (!_iteratorSesTransSetup.hasNext()) {
      return _rslReconcilePointStateMeta;
    } else {
      try {

        StateChange.TransSetup transSetup = _iteratorSesTransSetup.next();

        try {

          DatabaseStateEnterpriseImpl _snDatabaseStateEnterpriseImpl = transSetup.dotrsiDatabaseStateEnterpriseImpl();
          return _dotnospReconcilePointStateMeta(_iteratorSesTransSetup,
              _rslReconcilePointStateMeta.databaseStateEnterpriseImpl(
                  _snDatabaseStateEnterpriseImpl));
        } catch (

            StateChangeException _stateChangeException) {
          return _dotnocastReconcilePointStateMeta(_stateChangeException,
              _rslReconcilePointStateMeta, transSetup);
        }
      } catch (

          Throwable _throwable) {
        return _rslReconcilePointStateMeta.esThrowable(_throwable);
      }
    }
  }


  private static ReconcilePointStateMeta _dotrsCompletableFuture(
      DatabaseStateEnterpriseImpl _scDatabaseStateEnterpriseImpl,
      DatabaseStateEnterpriseImpl _sdDatabaseStateEnterpriseImpl,
      Stream<StateChange.TransSetup> _streamSesTransSetup) {

    Supplier<ReconcilePointStateMeta> _supplierJReconcilePointStateMeta = () ->
    {
      return _dotnospReconcilePointStateMeta(_streamSesTransSetup.iterator(),
          new ReconcilePointStateMeta(null, _sdDatabaseStateEnterpriseImpl,
              _scDatabaseStateEnterpriseImpl));
    };
    return _naejo(_supplierJReconcilePointStateMeta,
        _sdDatabaseStateEnterpriseImpl.databaseId().name());
  }


  private static boolean _isErrnwForDaTh(Throwable _ecThrowable,
      DatabaseStateEnterpriseImpl _spDatabaseStateEnterpriseImpl) {
    return _spDatabaseStateEnterpriseImpl == null || !Objects.equals(_ecThrowable,
        _spDatabaseStateEnterpriseImpl.failure().orElse(null));
  }


  private static <T> T _naejo(Supplier<T> _supplierOeainT, String title) {

    String _strNto = Thread.currentThread().getName();

    T _tV;
    try {
      Thread.currentThread()
          .setName(io.github.onograph.I18N.format(
              "io.github.onograph.dbms.DbmsStateResolverFacade.setName", _strNto, title));
      _tV = _supplierOeainT.get();
    } finally {
      Thread.currentThread().setName(_strNto);
    }

    return _tV;
  }


  static Map<String, DatabaseStateEnterpriseImpl> deidsasMap(
      Collection<AbstractDbmsManager> _collectionOeaosAbstractDbmsManager) {

    BinaryOperator<DatabaseStateEnterpriseImpl> _binaryOperatorPeeecDatabaseStateEnterpriseImpl =
        OperatorStateEnterpriseTypeImpl.mibotsaBinaryOperator(
            DatabaseStateEnterpriseImpl::operatorState);
    return (Map) _collectionOeaosAbstractDbmsManager.stream().map(AbstractDbmsManager::getPrefMap)
        .reduce(new HashMap(), (l, r) ->
        {
          return _condtMap(_binaryOperatorPeeecDatabaseStateEnterpriseImpl, l, r);
        });
  }


  private CompletableFuture<ReconcilePointStateMeta> _dotrsCompletableFuture(String gdbName,
      DbmsResolverAction _rqetDbmsResolverAction,
      DatabaseStateEnterpriseImpl _sdDatabaseStateEnterpriseImpl) {

    DatabaseStateEnterpriseImpl _scDatabaseStateEnterpriseImpl =
        this.gercletodlDatabaseStateEnterpriseImpl(_sdDatabaseStateEnterpriseImpl.databaseId(),
            () ->
            {
              return this.inaroeerDatabaseStateEnterpriseImpl(
                  _sdDatabaseStateEnterpriseImpl.databaseId());
            });

    ReconcilePointStateMeta _riReconcilePointStateMeta =
        new ReconcilePointStateMeta(null, _sdDatabaseStateEnterpriseImpl,
            _scDatabaseStateEnterpriseImpl);
    if (_scDatabaseStateEnterpriseImpl.equals(_sdDatabaseStateEnterpriseImpl)) {
      return CompletableFuture.completedFuture(_riReconcilePointStateMeta);
    } else if (_scDatabaseStateEnterpriseImpl.hasFailed()
        && !_rqetDbmsResolverAction.isOvipruflfForSt(gdbName)) {

      Throwable _epThrowable = _scDatabaseStateEnterpriseImpl.failure()
          .orElseThrow(IllegalStateException::new);
      return CompletableFuture.completedFuture(
          _riReconcilePointStateMeta.esThrowable(DatabaseManagementException.wrap(_epThrowable)));
    } else {

      Timeout _bcofTimeout = this.timeoutStrategy.newTimeout();

      Executor _executor = this.eeuosGdbReconcilerExecutorWrapper.excoExecutor(
          _sdDatabaseStateEnterpriseImpl.databaseId(), _rqetDbmsResolverAction);

      try {

        Stream<StateChange.TransSetup> _streamSesTransSetup = this._gelfltnospStream(
            _scDatabaseStateEnterpriseImpl, _sdDatabaseStateEnterpriseImpl);

        NamedDatabaseId _namedDatabaseId = _sdDatabaseStateEnterpriseImpl.databaseId();
        return CompletableFuture.supplyAsync(() ->
        {
          return _dotrsCompletableFuture(
              _riReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl(),
              _sdDatabaseStateEnterpriseImpl, _streamSesTransSetup);
        }, _executor).thenCompose((result) ->
        {
          return this._hadruCompletableFuture(_bcofTimeout,
              _sdDatabaseStateEnterpriseImpl,
              _executor, 0,
              _namedDatabaseId, result);
        });
      } catch (

          Exception _exception) {
        return CompletableFuture.completedFuture(
            _riReconcilePointStateMeta.esThrowable(DatabaseManagementException.wrap(_exception)));
      }
    }
  }


  private Stream<StateChange.TransSetup> _gelfltnospStream(
      DatabaseStateEnterpriseImpl _scDatabaseStateEnterpriseImpl,
      DatabaseStateEnterpriseImpl _sdDatabaseStateEnterpriseImpl) {
    return this.ttStateChangeTrackerMapping.frmcrnStateChangeTrackerMappingFlowChecker(
            _scDatabaseStateEnterpriseImpl)
        .toderStream(_sdDatabaseStateEnterpriseImpl);
  }


  private CompletableFuture<ReconcilePointStateMeta> _hadruCompletableFuture(Timeout _bcofTimeout,
      DatabaseStateEnterpriseImpl _dsDatabaseStateEnterpriseImpl, Executor _executor, int _iRtis,
      NamedDatabaseId _namedDatabaseId, ReconcilePointStateMeta _rslReconcilePointStateMeta) {

    boolean _isEfi = _rslReconcilePointStateMeta.getEsThrowable() != null && this._isFalerForTh(
        _rslReconcilePointStateMeta.getEsThrowable());
    if (_rslReconcilePointStateMeta.getEsThrowable() != null && !_isEfi) {

      int _iAtmt = _iRtis + 1;

      try {

        Stream<StateChange.TransSetup> _streamSrTransSetup =
            this._gelfltnospStream(_rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl(),
                _dsDatabaseStateEnterpriseImpl);
        return CompletableFuture.supplyAsync(() ->
            {
              return _dotrsCompletableFuture(
                  _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl(),
                  _dsDatabaseStateEnterpriseImpl, _streamSrTransSetup);
            }, CompletableFuture.delayedExecutor(_bcofTimeout.getAndIncrement(), TimeUnit.MILLISECONDS,
                _executor))
            .thenCompose((retryResult) ->
            {
              return this._hadruCompletableFuture(_bcofTimeout, _dsDatabaseStateEnterpriseImpl,
                  _executor, _iAtmt,
                  _namedDatabaseId, retryResult);
            });
      } catch (

          Exception _exception) {
        return CompletableFuture.completedFuture(
            _rslReconcilePointStateMeta.esThrowable(_exception));
      }
    } else {
      return _rslReconcilePointStateMeta.getEsThrowable() == null
          && _dsDatabaseStateEnterpriseImpl.failure().isPresent()
          ? CompletableFuture.completedFuture(
          _rslReconcilePointStateMeta.databaseStateEnterpriseImpl(_dsDatabaseStateEnterpriseImpl))
          : CompletableFuture.completedFuture(_rslReconcilePointStateMeta);
    }
  }


  private Optional<DatabaseStateEnterpriseImpl> _haeecexiOptional(String gdbName,
      DbmsResolverAction _rqetDbmsResolverAction,
      ReconcilePointStateMeta _rslReconcilePointStateMeta,
      DatabaseStateEnterpriseImpl _spDatabaseStateEnterpriseImpl) {

    Throwable _ecThrowable = _rslReconcilePointStateMeta.getEsThrowable();

    Optional<Throwable> _optionalPnceThrowable =
        _rqetDbmsResolverAction.casofpnOptional(
            _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl().databaseId());
    if (_optionalPnceThrowable.isPresent()) {
      _optionalPnceThrowable.get().addSuppressed(_ecThrowable);
      _ecThrowable = _optionalPnceThrowable.get();
    }

    if (_isErrnwForDaTh(_ecThrowable, _spDatabaseStateEnterpriseImpl)) {

      String m =
          String.format(io.github.onograph.I18N.format(
                  "io.github.onograph.dbms.DbmsStateResolverFacade.format2"),
              gdbName,
              _rslReconcilePointStateMeta.getSdDatabaseStateEnterpriseImpl().operatorState()
                  .description(),
              _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl().operatorState()
                  .description());


    }

    return Optional.of(_rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl()
        .falDatabaseStateEnterpriseImpl(_ecThrowable));
  }


  private Optional<DatabaseStateEnterpriseImpl> _haenrcloeoOptional(String gdbName,
      DbmsResolverAction _rqetDbmsResolverAction,
      ReconcilePointStateMeta _rslReconcilePointStateMeta,
      DatabaseStateEnterpriseImpl _spDatabaseStateEnterpriseImpl) {

    DatabaseStateEnterpriseImpl _snDatabaseStateEnterpriseImpl = _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl();

    Optional<Throwable> _optionalPnceThrowable = _rqetDbmsResolverAction.casofpnOptional(
        _snDatabaseStateEnterpriseImpl.databaseId());

    boolean _isHc = _rqetDbmsResolverAction.isOvipruflfForSt(gdbName);

    boolean _isFc =
        _spDatabaseStateEnterpriseImpl != null && _spDatabaseStateEnterpriseImpl.hasFailed();
    if (_optionalPnceThrowable.isPresent()) {

      String m =
          String.format(io.github.onograph.I18N.format(
                  "io.github.onograph.dbms.DbmsStateResolverFacade.format3"), gdbName,
              _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl().operatorState()
                  .description());

      Objects.requireNonNull(_snDatabaseStateEnterpriseImpl);
      return _optionalPnceThrowable.map(
          _snDatabaseStateEnterpriseImpl::falDatabaseStateEnterpriseImpl);
    } else if (_isFc && !_isHc) {

      Optional<Throwable> _optionalVr00Throwable = _spDatabaseStateEnterpriseImpl.failure();
      Objects.requireNonNull(_snDatabaseStateEnterpriseImpl);
      return _optionalVr00Throwable.map(
          _snDatabaseStateEnterpriseImpl::falDatabaseStateEnterpriseImpl);
    } else {
      return Optional.empty();
    }
  }


  private Optional<DatabaseStateEnterpriseImpl> _haernaesOptional(String gdbName,
      DbmsResolverAction _rqetDbmsResolverAction,
      ReconcilePointStateMeta _rslReconcilePointStateMeta,
      DatabaseStateEnterpriseImpl _spDatabaseStateEnterpriseImpl, Throwable _throwable) {
    if (_throwable != null) {
      return this._haeupdepOptional(gdbName, _rslReconcilePointStateMeta,
          _spDatabaseStateEnterpriseImpl, _throwable);
    } else if (_rslReconcilePointStateMeta.getEsThrowable() != null && Exceptions.contains(
        _rslReconcilePointStateMeta.getEsThrowable(), (e) ->
        {
          return e instanceof DatabaseStartAbortedException;
        })) {

      String m =
          String.format(io.github.onograph.I18N.format(
                  "io.github.onograph.dbms.DbmsStateResolverFacade.format"),
              gdbName, _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl(),
              _rslReconcilePointStateMeta.getSdDatabaseStateEnterpriseImpl().operatorState()
                  .description(), gdbName);

      return Optional.of(_rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl());
    } else {
      return _rslReconcilePointStateMeta.getEsThrowable() != null ? this._haeecexiOptional(gdbName,
          _rqetDbmsResolverAction, _rslReconcilePointStateMeta,
          _spDatabaseStateEnterpriseImpl)
          : this._haenrcloeoOptional(gdbName, _rqetDbmsResolverAction,
              _rslReconcilePointStateMeta,
              _spDatabaseStateEnterpriseImpl);
    }
  }


  private Optional<DatabaseStateEnterpriseImpl> _haeupdepOptional(String gdbName,
      ReconcilePointStateMeta _rslReconcilePointStateMeta,
      DatabaseStateEnterpriseImpl _spDatabaseStateEnterpriseImpl, Throwable _throwable) {

    DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl;
    if (_rslReconcilePointStateMeta == null) {
      _databaseStateEnterpriseImpl =
          _spDatabaseStateEnterpriseImpl == null
              ? DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl()
              : _spDatabaseStateEnterpriseImpl;
    } else {
      _databaseStateEnterpriseImpl = _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl();
    }

    Optional<Throwable> _optionalVr00Throwable = _databaseStateEnterpriseImpl.failure();
    Objects.requireNonNull(_throwable);
    _optionalVr00Throwable.ifPresent(_throwable::addSuppressed);

    return Optional.of(_databaseStateEnterpriseImpl.falDatabaseStateEnterpriseImpl(_throwable));
  }


  private boolean _isFalerForTh(Throwable _throwable) {
    return !this.isRc || _throwable instanceof Error
        || _throwable instanceof DatabaseStartAbortedException;
  }


  private ReconcilePointStateMeta _potrcceReconcilePointStateMeta(String gdbName,
      DbmsResolverAction _rqetDbmsResolverAction,
      ReconcilePointStateMeta _rslReconcilePointStateMeta, Throwable _throwable) {

    boolean _isVr4 = false;

    ReconcilePointStateMeta _reconcilePointStateMeta;
    try {
      _isVr4 = true;
      this.mapScsd.compute(gdbName, (name, previousState) ->
      {

        Optional<DatabaseStateEnterpriseImpl> _optionalFsDatabaseStateEnterpriseImpl =
            this._haernaesOptional(gdbName, _rqetDbmsResolverAction, _rslReconcilePointStateMeta,
                previousState, _throwable);

        DatabaseStateEnterpriseImpl _nsDatabaseStateEnterpriseImpl = _optionalFsDatabaseStateEnterpriseImpl.orElseGet(
            () ->
            {
              return _rslReconcilePointStateMeta.getSsDatabaseStateEnterpriseImpl();
            });
        this._sttchgForDaDa(_nsDatabaseStateEnterpriseImpl, previousState);
        return _nsDatabaseStateEnterpriseImpl;
      });
      _reconcilePointStateMeta = _rslReconcilePointStateMeta;
      _isVr4 = false;
    } finally {
      if (_isVr4) {
        this.lcsReentrantLockReconcilerManager.reeelconForSt(gdbName);

        boolean _isEe = _throwable != null || _rslReconcilePointStateMeta.getEsThrowable() != null;

        String reslt = _isEe ? io.github.onograph.TokenConstants.FAILED
            : io.github.onograph.TokenConstants.SUCCEEDED;

        String _strSt =
            _rslReconcilePointStateMeta == null ? io.github.onograph.TokenConstants.UNKNOWN
                : _rslReconcilePointStateMeta.getSdDatabaseStateEnterpriseImpl().operatorState()
                    .description();


      }
    }

    this.lcsReentrantLockReconcilerManager.reeelconForSt(gdbName);

    boolean _isEe2 = _throwable != null || _rslReconcilePointStateMeta.getEsThrowable() != null;

    String reslt = _isEe2 ? io.github.onograph.TokenConstants.FAILED
        : io.github.onograph.TokenConstants.SUCCEEDED;

    String _strTs = _rslReconcilePointStateMeta == null ? io.github.onograph.TokenConstants.UNKNOWN
        : _rslReconcilePointStateMeta.getSdDatabaseStateEnterpriseImpl().operatorState()
            .description();

    return _reconcilePointStateMeta;
  }


  private CompletableFuture<DatabaseStateEnterpriseImpl> _prroiCompletableFuture(
      Collection<AbstractDbmsManager> _collectionOeaosAbstractDbmsManager, Executor _executor,
      String gdbName, DbmsResolverAction _rqetDbmsResolverAction) {

    Supplier<DatabaseStateEnterpriseImpl> _supplierJrpDatabaseStateEnterpriseImpl = () ->
    {
      try {

        this.lcsReentrantLockReconcilerManager.acuelconForDbSt(gdbName, _rqetDbmsResolverAction);
        if (_rqetDbmsResolverAction.isCauchfoForSt(gdbName)) {
          this.mapCjwsc.remove(gdbName);
        }

        DatabaseStateEnterpriseImpl _sdDatabaseStateEnterpriseImpl = deidsasMap(
            _collectionOeaosAbstractDbmsManager).get(gdbName);
        if (_sdDatabaseStateEnterpriseImpl == null) {

          throw new IllegalStateException("*** Error: ca180644-0a4e-4586-9744-e845fa1a0121");
        } else if (!Objects.equals(gdbName, _sdDatabaseStateEnterpriseImpl.databaseId().name())) {

          throw new IllegalStateException("*** Error: a0c8a292-0417-4ba0-a3e0-32306f1ff933");
        } else {
          return _sdDatabaseStateEnterpriseImpl;
        }
      } catch (

          InterruptedException _interruptedException) {
        Thread.currentThread().interrupt();
        throw new CompletionException(_interruptedException);
      }
    };
    return CompletableFuture.supplyAsync(() ->
    {
      return _naejo(_supplierJrpDatabaseStateEnterpriseImpl, gdbName);
    }, _executor);
  }


  private void _retfedas() {

    String _strFd = this.mapScsd.values().stream().filter(DatabaseStateEnterpriseImpl::hasFailed)
        .map((db) ->
        {
          return db.databaseId().name();
        })
        .collect(Collectors.joining(",", "[", "]"));
    if (_strFd.length() > 2) {

    }
  }


  private synchronized CompletableFuture<ReconcilePointStateMeta> _scurclojCompletableFuture(
      Collection<AbstractDbmsManager> _collectionOeaosAbstractDbmsManager, String gdbName,
      DbmsResolverAction _rqetDbmsResolverAction) {

    boolean _isJcbc = _rqetDbmsResolverAction.isCauchfoForSt(gdbName);

    CompletableFuture _hjrCompletableFuture;
    if (_isJcbc) {
      _hjrCompletableFuture = this.mapCjwsc.get(gdbName);
      if (_hjrCompletableFuture != null) {
        return _hjrCompletableFuture;
      }
    }

    _hjrCompletableFuture = new CompletableFuture();

    Executor _rpExecutor = this.eeuosGdbReconcilerExecutorWrapper.getUbudExecutor();

    CompletableFuture<ReconcilePointStateMeta> _completableFutureJReconcilePointStateMeta = _hjrCompletableFuture.thenCompose(
            (ignored) ->
            {
              return this._prroiCompletableFuture(
                  _collectionOeaosAbstractDbmsManager,
                  _rpExecutor,
                  gdbName,
                  _rqetDbmsResolverAction);
            })
        .thenCompose((desiredState) ->
        {
          return this._dotrsCompletableFuture(
              gdbName,
              _rqetDbmsResolverAction,
              (DatabaseStateEnterpriseImpl) desiredState);
        })
        .handle((result, throwable) ->
        {
          return this._potrcceReconcilePointStateMeta(
              gdbName,
              _rqetDbmsResolverAction,
              (ReconcilePointStateMeta) result,
              (Throwable) throwable);
        });
    if (_isJcbc) {
      this.mapCjwsc.put(gdbName, _completableFutureJReconcilePointStateMeta);
    }

    _hjrCompletableFuture.complete(null);
    return _completableFutureJReconcilePointStateMeta;
  }


  private void _sttchgForDaDa(DatabaseStateEnterpriseImpl _snDatabaseStateEnterpriseImpl,
      DatabaseStateEnterpriseImpl _spDatabaseStateEnterpriseImpl) {

    DatabaseStateEnterpriseImpl _siDatabaseStateEnterpriseImpl =
        new DatabaseStateEnterpriseImpl(_snDatabaseStateEnterpriseImpl.databaseId(),
            OperatorStateEnterpriseTypeImpl.SETI_IS);
    if (!_snDatabaseStateEnterpriseImpl.equals(_spDatabaseStateEnterpriseImpl)) {

    }

    if (_spDatabaseStateEnterpriseImpl != null &&
        !Objects.equals(_spDatabaseStateEnterpriseImpl.databaseId(),
            _snDatabaseStateEnterpriseImpl.databaseId())) {

      DatabaseStateEnterpriseImpl _pdDatabaseStateEnterpriseImpl =
          new DatabaseStateEnterpriseImpl(_spDatabaseStateEnterpriseImpl.databaseId(),
              OperatorStateEnterpriseTypeImpl.SETI_D);
      this.listLseesDatabaseStateUpdateHandler.forEach((listener) ->
      {
        listener.sttchgForDaDa(_spDatabaseStateEnterpriseImpl, _pdDatabaseStateEnterpriseImpl);
      });
      this.listLseesDatabaseStateUpdateHandler.forEach((listener) ->
      {
        listener.sttchgForDaDa(_siDatabaseStateEnterpriseImpl, _snDatabaseStateEnterpriseImpl);
      });
    } else {
      this.listLseesDatabaseStateUpdateHandler.forEach((listener) ->
      {
        listener.sttchgForDaDa(
            _spDatabaseStateEnterpriseImpl == null ? _siDatabaseStateEnterpriseImpl
                : _spDatabaseStateEnterpriseImpl,
            _snDatabaseStateEnterpriseImpl);
      });
    }
  }


  private void _vaaanwnForDbSe(DbmsResolverAction _rqetDbmsResolverAction,
      Set<String> _setRtdonString) {
    if (!_rqetDbmsResolverAction.isSil()) {

      HashSet<String> _hashSetDrString = new HashSet(_rqetDbmsResolverAction.exctrSet());
      _hashSetDrString.removeAll(_setRtdonString);
      if (!_hashSetDrString.isEmpty()) {

      }
    }
  }


  final DatabaseStateEnterpriseImpl gercletodlDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId,
      Supplier<DatabaseStateEnterpriseImpl> _supplierIiilDatabaseStateEnterpriseImpl) {

    DatabaseStateEnterpriseImpl _scDatabaseStateEnterpriseImpl = this.mapScsd.get(
        _namedDatabaseId.name());
    return _scDatabaseStateEnterpriseImpl == null ? _supplierIiilDatabaseStateEnterpriseImpl.get()
        : _scDatabaseStateEnterpriseImpl;
  }


  protected DatabaseStateEnterpriseImpl inaroeerDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId) {
    return DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(_namedDatabaseId);
  }


  DbmsResolverMeta reoiDbmsResolverMeta(
      Collection<AbstractDbmsManager> _collectionOeaosAbstractDbmsManager,
      DbmsResolverAction _rqetDbmsResolverAction) {

    Set<String> _setRtdonString = _collectionOeaosAbstractDbmsManager.stream().flatMap((op) ->
    {
      return op.getPrefMap().keySet().stream();
    }).collect(Collectors.toSet());
    this._vaaanwnForDbSe(_rqetDbmsResolverAction, _setRtdonString);
    this._retfedas();

    Map<String, CompletableFuture<ReconcilePointStateMeta>> _mapRcniisc = _setRtdonString.stream()
        .map((dbName) ->
        {
          return Pair.of(dbName,
              this._scurclojCompletableFuture(
                  _collectionOeaosAbstractDbmsManager,
                  dbName,
                  _rqetDbmsResolverAction));
        }).collect(
            Collectors.toMap(Pair::first, Pair::other));
    return new DbmsResolverMeta(_mapRcniisc);
  }


  public void retdtesecglsrForDa(DatabaseStateUpdateHandler _lseeDatabaseStateUpdateHandler) {
    this.listLseesDatabaseStateUpdateHandler.add(_lseeDatabaseStateUpdateHandler);
  }
}
