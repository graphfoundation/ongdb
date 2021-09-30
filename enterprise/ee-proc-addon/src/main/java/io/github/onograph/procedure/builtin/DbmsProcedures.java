package io.github.onograph.procedure.builtin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphComponent;
import org.neo4j.dbms.database.SystemGraphComponent.Status;
import org.neo4j.dbms.database.SystemGraphComponents;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.helpers.TimeUtil;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.ProcedureCallContext;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.UserFunctionSignature;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.io.ByteUnit;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.KernelTransactionHandle;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.procedure.SystemProcedure;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.KernelTransactions;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.query.FunctionInformation;
import org.neo4j.kernel.impl.query.QueryExecutionEngine;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.SimpleTriggerInfo;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.lock.ActiveLock;
import org.neo4j.logging.Log;
import org.neo4j.memory.GlobalMemoryGroupTracker;
import org.neo4j.memory.MemoryPools;
import org.neo4j.memory.ScopedMemoryPool;
import org.neo4j.procedure.Admin;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Internal;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;
import org.neo4j.procedure.builtin.QueryId;
import org.neo4j.procedure.builtin.TransactionId;
import org.neo4j.resources.Profiler;
import org.neo4j.scheduler.ActiveGroup;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class DbmsProcedures {


  public static final String INOE_TXS_UID_PRE = io.github.onograph.I18N.format(
      "io.github.onograph.procedure.builtin.DbmsProcedures.var");


  private static final String MISG_TXS_UID = io.github.onograph.I18N.format(
      "io.github.onograph.procedure.builtin.DbmsProcedures.var2");


  @Context
  public DependencyResolver dependencyResolver;


  @Context
  public GraphDatabaseAPI graphDatabaseAPI;


  @Context
  public KernelTransaction kernelTransaction;


  @Context
  public Log log;


  @Context
  public ProcedureCallContext procedureCallContext;


  @Context
  public SecurityContext securityContext;


  @Context
  public SystemGraphComponents systemGraphComponents;


  @Context
  public Transaction transaction;


  private static Set<KernelTransactionHandle> _geeentniSet(DatabaseContext _databaseContext) {
    return _databaseContext.dependencies().resolveDependency(KernelTransactions.class)
        .executingTransactions();
  }


  private ZoneId _gecnrtmzeZoneId() {

    Config _config = this.dependencyResolver.resolveDependency(Config.class);
    return _config.get(GraphDatabaseSettings.db_timezone).getZoneId();
  }


  private DatabaseManager<DatabaseContext> _gedtemgDatabaseManager() {
    return (DatabaseManager) this.dependencyResolver.resolveDependency(DatabaseManager.class);
  }


  private String _getatidString(long transIdx) {
    try {
      return transIdx > 0L ? (new TransactionId(this.graphDatabaseAPI.databaseName(),
          transIdx)).toString()
          : io.github.onograph.I18N.format(
              "io.github.onograph.procedure.builtin.DbmsProcedures.getatidString");
    } catch (

        InvalidArgumentsException _invalidArgumentsException) {
      return io.github.onograph.I18N.format(
          "io.github.onograph.procedure.builtin.DbmsProcedures.getatidString2", transIdx);
    }
  }


  private boolean _isAdnosfForSt(String uname) {
    return this.securityContext.allowExecuteAdminProcedure(this.procedureCallContext.id())
        || this.securityContext.subject().hasUsername(uname);
  }


  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__FAILED_JOB_RUN)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__FAILED_JOB_RUN__NAME,
      mode = Mode.DBMS
  )
  public Stream<CheckpointerMeta> chcotStream() throws IOException {

    CheckPointer _checkPointer = this.dependencyResolver.resolveDependency(CheckPointer.class);

    KernelTransaction _kernelTransaction = this.kernelTransaction;
    Objects.requireNonNull(_kernelTransaction);

    BooleanSupplier _ptBooleanSupplier = _kernelTransaction::isTerminated;

    long transIdx = _checkPointer.tryCheckPoint(
        new SimpleTriggerInfo(io.github.onograph.I18N.format(
            "io.github.onograph.procedure.builtin.DbmsProcedures.transIdx")),
        _ptBooleanSupplier);
    return Stream.of(transIdx == -1L ? CheckpointerMeta.CM_KILLED
        : CheckpointerMeta.CM_OK);
  }


  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__PL_NM)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__PL_NM__NAME,
      mode = Mode.DBMS
  )
  public Stream<CurrentResourceLockMeta> liaclStream(
      @Name(io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_TIQ) String _strTiq)
      throws InvalidArgumentsException {

    QueryId _queryId = QueryId.parse(_strTiq);

    DatabaseManager<DatabaseContext> _databaseManagerDmDatabaseContext = this._gedtemgDatabaseManager();

    Iterator _iterator = _databaseManagerDmDatabaseContext.registeredDatabases().entrySet()
        .iterator();

    while (_iterator.hasNext()) {

      Entry<NamedDatabaseId, DatabaseContext> _entryEdnd = (Entry) _iterator.next();

      NamedDatabaseId _namedDatabaseId = _entryEdnd.getKey();

      DatabaseContext _databaseContext = _entryEdnd.getValue();

      Iterator _iterator2 = _geeentniSet(_databaseContext).iterator();

      while (_iterator2.hasNext()) {

        KernelTransactionHandle _tKernelTransactionHandle = (KernelTransactionHandle) _iterator2.next();
        if (_tKernelTransactionHandle.executingQuery().isPresent()) {

          ExecutingQuery _executingQuery = _tKernelTransactionHandle.executingQuery().get();
          if (_executingQuery.internalQueryId() == _queryId.internalId()) {
            if (this._isAdnosfForSt(_executingQuery.username())) {
              return _tKernelTransactionHandle.activeLocks().map(CurrentResourceLockMeta::new);
            }

            String m =
                String.format(io.github.onograph.I18N.format(
                        "io.github.onograph.procedure.builtin.DbmsProcedures.format"),
                    this.securityContext.description());
            throw this.kernelTransaction.securityAuthorizationHandler()
                .logAndGetAuthorizationException(this.securityContext, m);
          }
        }
      }
    }

    return Stream.empty();
  }


  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__M)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__M__NAME,
      mode = Mode.DBMS
  )
  public Stream<HeapMeta> limepStream() {

    MemoryPools _memoryPools = this.dependencyResolver.resolveDependency(MemoryPools.class);

    List<GlobalMemoryGroupTracker> _listPrGlobalMemoryGroupTracker = _memoryPools.getPools();

    List<ScopedMemoryPool> _listPaScopedMemoryPool = new ArrayList(_listPrGlobalMemoryGroupTracker);

    Iterator _iterator = _listPrGlobalMemoryGroupTracker.iterator();

    while (_iterator.hasNext()) {

      GlobalMemoryGroupTracker plNm = (GlobalMemoryGroupTracker) _iterator.next();
      _listPaScopedMemoryPool.addAll(plNm.getDatabasePools());
    }

    _listPaScopedMemoryPool.sort(Comparator.comparing(ScopedMemoryPool::group)
        .thenComparing(ScopedMemoryPool::databaseName));
    return _listPaScopedMemoryPool.stream().map(HeapMeta::new);
  }


  @Deprecated(
      since = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DEPRECATED___DATABASE_CONTEXT__SINCE,
      forRemoval = true
  )
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION___DATABASE_CONTEXT)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___DATABASE_CONTEXT__NAME,
      mode = Mode.DBMS,
      deprecatedBy = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___DATABASE_CONTEXT__DEPRECATED_BY
  )
  public Stream<FuncExMeta> litfnStream() {

    QueryExecutionEngine _queryExecutionEngine = this.dependencyResolver.resolveDependency(
        QueryExecutionEngine.class);

    List<FunctionInformation> _listFlpFunctionInformation = _queryExecutionEngine.getProvidedLanguageFunctions();

    Stream<FuncExMeta> _streamFlFuncExMeta = _listFlpFunctionInformation.stream().map((fi) ->
    {
      return new FuncExMeta(
          fi);
    });

    Stream<FuncExMeta> _streamFlFuncExMeta2 =
        this.dependencyResolver.resolveDependency(GlobalProcedures.class)
            .getAllNonAggregatingFunctions().map((f) ->
            {
              return new FuncExMeta(
                  f, false);
            });

    Stream<FuncExMeta> _streamFalFuncExMeta =
        this.dependencyResolver.resolveDependency(GlobalProcedures.class)
            .getAllAggregatingFunctions().map((f) ->
            {
              return new FuncExMeta(
                  f, true);
            });
    return Stream.concat(Stream.concat(_streamFlFuncExMeta, _streamFlFuncExMeta2),
        _streamFalFuncExMeta).sorted(Comparator.comparing((a) ->
    {
      return a.name;
    }));
  }


  @Admin
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__M2)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__M__NAME2,
      mode = Mode.DBMS
  )
  public Stream<TransactionResourceLockMeta> litlcStream() {

    Locks _locks = this.dependencyResolver.resolveDependency(Locks.class);

    ArrayList<TransactionResourceLockMeta> _arrayListLlTransactionResourceLockMeta = new ArrayList();
    _locks.accept(
        (lockType, resourceType, txId, resourceId, description, estimatedWaitTime, lockIdentityHashCode) ->
        {
          _arrayListLlTransactionResourceLockMeta.add(
              new TransactionResourceLockMeta(lockType.getDescription(), resourceType.name(),
                  resourceId,
                  this._getatidString(txId)));
        });
    return _arrayListLlTransactionResourceLockMeta.stream();
  }


  @Deprecated(
      since = io.github.onograph.TokenConstants.DBMS_PROCEDURES___DEPRECATED__A__SINCE,
      forRemoval = true
  )
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__A)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__A__NAME,
      mode = Mode.DBMS,
      deprecatedBy = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__A__DEPRECATED_BY
  )
  public Stream<ProcExMeta> litpodeStream() {

    GlobalProcedures _globalProcedures = this.dependencyResolver.resolveDependency(
        GlobalProcedures.class);
    return _globalProcedures.getAllProcedures().stream().filter((proc) ->
        {
          return !proc.internal();
        }).sorted(Comparator.comparing((a) ->
        {
          return a.name().toString();
        }))
        .map(ProcExMeta::new);
  }


  @Admin
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION___O_PRINT_STREAM)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___O_PRINT_STREAM__NAME,
      mode = Mode.DBMS
  )
  public Stream<MonitoredJobInfoWrapper> sceljsStream() {

    JobScheduler _jobScheduler = this.dependencyResolver.resolveDependency(JobScheduler.class);

    ZoneId _zoneId = this._gecnrtmzeZoneId();
    return _jobScheduler.getMonitoredJobs().stream().map((job) ->
    {
      return new MonitoredJobInfoWrapper(job, _zoneId);
    });
  }


  @Admin
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__LOCK_IDENTITY_HASH_CODE)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__LOCK_IDENTITY_HASH_CODE__NAME,
      mode = Mode.DBMS
  )
  public Stream<ActiveGroupThreadWrapper> scuacgsStream() {

    JobScheduler _jobScheduler = this.dependencyResolver.resolveDependency(JobScheduler.class);
    return _jobScheduler.activeGroups().map(ActiveGroupThreadWrapper::new);
  }


  @Admin
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__JOB)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__JOB__NAME,
      mode = Mode.DBMS
  )
  public Stream<FailedJobRunDetails> scufajrnStream() {

    JobScheduler _jobScheduler = this.dependencyResolver.resolveDependency(JobScheduler.class);

    ZoneId _zoneId = this._gecnrtmzeZoneId();
    return _jobScheduler.getFailedJobRuns().stream().map((failedJobRun) ->
    {
      return new FailedJobRunDetails(failedJobRun, _zoneId);
    });
  }


  @Admin
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION___JOB_SCHEDULER)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE___JOB_SCHEDULER__NAME,
      mode = Mode.DBMS
  )
  public Stream<ProfileReturnedMeta> scupregpStream(
      @Name(io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_MTO) String _strMto,
      @Name(io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_NG) String _strNg,
      @Name(io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_DRTO) String _strDrto)
      throws InterruptedException {
    if (!"sample".equals(_strMto)) {

      throw new IllegalArgumentException("*** Error: ac4ab4f9-a0a5-408f-a9df-3c948bd82f5f");
    } else {

      Profiler _profiler = Profiler.profiler();

      Group grp = null;

      Group[] _groupArray = Group.values();

      int _iVa = _groupArray.length;

      for (

          int _iVar = 0; _iVar < _iVa; ++_iVar) {

        Group val = _groupArray[_iVar];
        if (val.groupName().equals(_strNg)) {
          grp = val;
          break;
        }
      }

      if (grp == null) {

        throw new IllegalArgumentException("*** Error: bdbf08b1-1c75-4c1d-bb0d-a6478c0cefd9");
      } else {

        long _lgNd = TimeUnit.MILLISECONDS.toNanos(TimeUtil.parseTimeMillis.apply(_strDrto));

        JobScheduler _jobScheduler = this.dependencyResolver.resolveDependency(JobScheduler.class);

        long _lgDaln = System.nanoTime() + _lgNd;

        try {
          _jobScheduler.profileGroup(grp, _profiler);

          while (System.nanoTime() < _lgDaln) {
            this.kernelTransaction.assertOpen();
            Thread.sleep(100L);
          }
        } finally {
          _profiler.finish();
        }

        ByteArrayOutputStream _baByteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream _oPrintStream = new PrintStream(_baByteArrayOutputStream);
        _profiler.printProfile(_oPrintStream,
            io.github.onograph.I18N.format(
                "io.github.onograph.procedure.builtin.DbmsProcedures.printProfile",
                grp));
        _oPrintStream.flush();
        return Stream.of(new ProfileReturnedMeta(_baByteArrayOutputStream.toString()));
      }
    }
  }


  @Admin
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__A2)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__A__NAME2,
      mode = Mode.DBMS
  )
  public void secfvuForStSt(
      @Name(io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME___STR_STIG) String _strStig,
      @Name(io.github.onograph.TokenConstants.DBMS_PROCEDURES___NAME__VAL) String val) {

    Config _config = this.dependencyResolver.resolveDependency(Config.class);

    SettingImpl<Object> _settingImplOsObject = (SettingImpl) _config.getSetting(_strStig);

    DocumentedAllowedConfigs _lwsDocumentedAllowedConfigs = this.dependencyResolver.resolveDependency(
        DocumentedAllowedConfigs.class);
    if (_lwsDocumentedAllowedConfigs.isWhelsdForSt(_strStig)) {
      _config.setDynamic(_settingImplOsObject,
          _settingImplOsObject.parse(StringUtils.isNotEmpty(val) ? val : null),
          io.github.onograph.TokenConstants.DBMS__SET_CONFIG_VALUE);
    } else {

      String m = "Failed to set value for `" + _strStig +
          io.github.onograph.I18N.format(
              "io.github.onograph.procedure.builtin.DbmsProcedures.var3");
      throw this.kernelTransaction.securityAuthorizationHandler()
          .logAndGetAuthorizationException(this.securityContext, m);
    }
  }


  @Admin
  @Internal
  @Deprecated
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__VERSION2)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__VERSION__NAME2,
      mode = Mode.DBMS
  )
  public void shtw() throws ProcedureException {
    this.graphDatabaseAPI.getDependencyResolver().resolveDependency(DatabaseManagementService.class)
        .shutdown();
  }


  @Admin
  @Internal
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__TRANS_IDX)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__TRANS_IDX__NAME,
      mode = Mode.READ
  )
  public Stream<MetaGraphStatusInfo> updstdtStream() throws ProcedureException {
    if (!this.procedureCallContext.isSystemDatabase()) {

      throw new ProcedureException(
          org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed,
          "*** Error:  b76b3fe3-3341-45a7-bce1-88b199695608");
    } else {

      SystemGraphComponents _vrinSystemGraphComponents = this.systemGraphComponents;

      ArrayList<MetaGraphStatusInfo> _arrayListRslsMetaGraphStatusInfo = new ArrayList();
      _vrinSystemGraphComponents.forEach((version) ->
      {
        _arrayListRslsMetaGraphStatusInfo.add(new MetaGraphStatusInfo(version.componentName(),
            version.detect(
                this.transaction)));
      });
      return Stream.concat(Stream.of(new MetaGraphStatusInfo(SystemGraphComponents.component(),
              _vrinSystemGraphComponents.detect(
                  this.transaction))),
          _arrayListRslsMetaGraphStatusInfo.stream());
    }
  }


  @Admin
  @Internal
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.DBMS_PROCEDURES___DESCRIPTION__VERSION)
  @Procedure(
      name = io.github.onograph.TokenConstants.DBMS_PROCEDURES___PROCEDURE__VERSION__NAME,
      mode = Mode.WRITE
  )
  public Stream<MetaGraphUpdateInfo> upredtlStream() throws ProcedureException {
    if (!this.procedureCallContext.isSystemDatabase()) {

      throw new ProcedureException(
          org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed,
          "*** Error:  60ae9b2f-d3ab-4adc-8090-f4b732c7f9e4");
    } else {

      SystemGraphComponents _vrinSystemGraphComponents = this.systemGraphComponents;

      Status stat = _vrinSystemGraphComponents.detect(this.transaction);

      ArrayList<MetaGraphUpdateInfo> _arrayListRslsMetaGraphUpdateInfo = new ArrayList();

      List<Status> _listSuStatus = List.of(Status.REQUIRES_UPGRADE, Status.UNINITIALIZED);
      if (_listSuStatus.contains(stat)) {

        ArrayList<SystemGraphComponent> _arrayListFieSystemGraphComponent = new ArrayList();
        _vrinSystemGraphComponents.forEach((component) ->
        {

          Status _iiilStatus = component.detect(this.transaction);
          if (_listSuStatus.contains(_iiilStatus)) {
            try {
              component.upgradeToCurrent(this.graphDatabaseAPI);
              _arrayListRslsMetaGraphUpdateInfo.add(
                  new MetaGraphUpdateInfo(component.componentName(),
                      component.detect(
                              this.transaction)
                          .name(),
                      io.github.onograph.TokenConstants.UPGRADED));
            } catch (

                Exception _exception) {
              _arrayListFieSystemGraphComponent.add(component);
              _arrayListRslsMetaGraphUpdateInfo.add(
                  new MetaGraphUpdateInfo(component.componentName(),
                      _iiilStatus.name(),
                      _exception.toString()));
            }
          } else {
            _arrayListRslsMetaGraphUpdateInfo.add(new MetaGraphUpdateInfo(component.componentName(),
                _iiilStatus.name(),
                ""));
          }
        });

        String _strUr =
            _arrayListFieSystemGraphComponent.isEmpty() ? io.github.onograph.TokenConstants.SUCCESS
                : "Failed: " +
                    _arrayListFieSystemGraphComponent.stream()
                        .map(SystemGraphComponent::componentName)
                        .collect(
                            Collectors.joining(
                                ", "));
        return Stream.concat(Stream.of(
            new MetaGraphUpdateInfo(SystemGraphComponents.component(),
                _vrinSystemGraphComponents.detect(this.transaction).name(),
                _strUr)), _arrayListRslsMetaGraphUpdateInfo.stream());
      } else {
        _vrinSystemGraphComponents.forEach((version) ->
        {
          _arrayListRslsMetaGraphUpdateInfo.add(new MetaGraphUpdateInfo(version.componentName(),
              version.detect(
                      this.transaction)
                  .name(), ""));
        });
        return Stream.concat(Stream.of(
                new MetaGraphUpdateInfo(SystemGraphComponents.component(),
                    _vrinSystemGraphComponents.detect(this.transaction).name(), "")),
            _arrayListRslsMetaGraphUpdateInfo.stream());
      }
    }
  }


  public enum CheckpointerMeta {


    CM_OK(true, io.github.onograph.I18N.format(
        "io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta.uname")),

    CM_KILLED(false,
        io.github.onograph.I18N.format(
            "io.github.onograph.procedure.builtin.DbmsProcedures.CheckpointerMeta.uname2"));


    public final String chkpointStatus;


    public final boolean ok;

    CheckpointerMeta(boolean _isSces, String m) {
      this.chkpointStatus = m;
      this.ok = _isSces;
    }
  }


  public static class ActiveGroupThreadWrapper {


    public final String activeGroupName;


    public final long activeGroupThreads;

    ActiveGroupThreadWrapper(ActiveGroup _activeGroup) {
      this.activeGroupName = _activeGroup.group.groupName();
      this.activeGroupThreads = _activeGroup.threads;
    }
  }


  public static class CurrentResourceLockMeta {
    // Names must be exact - see community defs.


    public final String mode;


    public final long resourceId;


    public final String resourceType;

    public CurrentResourceLockMeta(ActiveLock _activeLock) {
      this(_activeLock.lockType().getDescription(), _activeLock.resourceType().name(),
          _activeLock.resourceId());
    }

    public CurrentResourceLockMeta(String mdstr, String rtName, long rxId) {
      this.mode = mdstr;
      this.resourceId = rxId;
      this.resourceType = rtName;
    }
  }


  public static class FuncExMeta {
    // Names must be specific see community procedures.json
    // "signature": "dbms.functions() :: (name :: STRING?, signature :: STRING?, category :: STRING?, description :: STRING?, aggregating :: BOOLEAN?, defaultBuiltInRoles :: LIST? OF STRING?)",


    public final boolean aggregating;


    public final String category;


    public final List<String> defaultBuiltInRoles;


    public final String description;


    public final String name;


    public final String signature;

    private FuncExMeta(UserFunctionSignature _userFunctionSignature, boolean _isAi) {
      this.name = _userFunctionSignature.name().toString();
      this.signature = _userFunctionSignature.toString();
      this.category = _userFunctionSignature.category().orElse("");
      this.description = _userFunctionSignature.description().orElse("");
      this.defaultBuiltInRoles = Stream.of(io.github.onograph.TokenConstants.ADMIN,
              io.github.onograph.TokenConstants.READER,
              io.github.onograph.TokenConstants.EDITOR, io.github.onograph.TokenConstants.PUBLISHER,
              io.github.onograph.TokenConstants.ARCHITECT)
          .collect(Collectors.toList());
      this.defaultBuiltInRoles.addAll(Arrays.asList(_userFunctionSignature.allowed()));
      this.aggregating = _isAi;
    }

    private FuncExMeta(FunctionInformation _functionInformation) {
      this.name = _functionInformation.getFunctionName();
      this.signature = _functionInformation.getSignature();
      this.category = _functionInformation.getCategory();
      this.description = _functionInformation.getDescription();
      this.aggregating = _functionInformation.isAggregationFunction();
      this.defaultBuiltInRoles = Stream.of(io.github.onograph.TokenConstants.ADMIN,
              io.github.onograph.TokenConstants.READER,
              io.github.onograph.TokenConstants.EDITOR, io.github.onograph.TokenConstants.PUBLISHER,
              io.github.onograph.TokenConstants.ARCHITECT)
          .collect(Collectors.toList());
    }
  }


  public static class HeapMeta {


    private static final String UNOD = io.github.onograph.TokenConstants.UNBOUNDED;


    public final String fremmy;


    public final String frmeb;


    public final String gdbName;


    public final String hemeuby;


    public final String hepmmyue;


    public final String naemrud;


    public final String naemrudbs;


    public final String plNm;


    public final String topme;


    public final String topmeb;

    public HeapMeta(ScopedMemoryPool _scopedMemoryPool) {
      this.plNm = _scopedMemoryPool.group().getName();
      this.gdbName = _scopedMemoryPool.databaseName();
      this.hepmmyue = ByteUnit.bytesToString(_scopedMemoryPool.usedHeap());
      this.hemeuby = String.valueOf(_scopedMemoryPool.usedHeap());
      this.naemrud = ByteUnit.bytesToString(_scopedMemoryPool.usedNative());
      this.naemrudbs = String.valueOf(_scopedMemoryPool.usedNative());
      if (_scopedMemoryPool.totalSize() != Long.MAX_VALUE) {
        this.fremmy = ByteUnit.bytesToString(_scopedMemoryPool.free());
        this.frmeb = String.valueOf(_scopedMemoryPool.free());
        this.topme = ByteUnit.bytesToString(_scopedMemoryPool.totalSize());
        this.topmeb = String.valueOf(_scopedMemoryPool.totalSize());
      } else {
        this.fremmy = io.github.onograph.TokenConstants.UNBOUNDED;
        this.frmeb = io.github.onograph.TokenConstants.UNBOUNDED;
        this.topme = io.github.onograph.TokenConstants.UNBOUNDED;
        this.topmeb = io.github.onograph.TokenConstants.UNBOUNDED;
      }
    }
  }


  public static class MetaGraphStatusInfo {


    public final String cope;


    public final String desc;


    public final String reotn;


    public final String stat;

    MetaGraphStatusInfo(String _strCmoet, Status stat) {
      this.cope = _strCmoet;
      this.stat = stat.name();
      this.desc = stat.description();
      this.reotn = stat.resolution();
    }
  }


  public static class MetaGraphUpdateInfo {


    public final String cope;


    public final String stat;


    public final String uprerst;

    MetaGraphUpdateInfo(String _strCmoet, String stat, String _strRu) {
      this.cope = _strCmoet;
      this.stat = stat;
      this.uprerst = _strRu;
    }
  }


  public static class ProcExMeta {

    // Must have exact names. See community procedures.json
    // "signature": "dbms.procedures() :: (name :: STRING?, signature :: STRING?, description :: STRING?, mode :: STRING?, defaultBuiltInRoles :: LIST? OF STRING?, worksOnSystem :: BOOLEAN?)",


    private static final List<String> PROC_NAMES_FOR_ROLE_BESIDES_EDITOR =
        Arrays.asList(io.github.onograph.TokenConstants.CREATE_LABEL,
            io.github.onograph.TokenConstants.CREATE_PROPERTY,
            io.github.onograph.TokenConstants.CREATE_RELATIONSHIP_TYPE);


    public final List<String> defaultBuiltInRoles;


    public final String description;


    public final String mode;


    public final String name;


    public final String signature;


    public final boolean worksOnSystem;

    public ProcExMeta(ProcedureSignature _procedureSignature) {
      this.name = _procedureSignature.name().toString();
      this.signature = _procedureSignature.toString();
      this.description = _procedureSignature.description().orElse("");
      this.mode = _procedureSignature.mode().toString();
      this.worksOnSystem = _procedureSignature.systemProcedure();
      this.defaultBuiltInRoles = new ArrayList();
      if (!this._isIapru()) {
        if (!_procedureSignature.admin() && !this._isAipce()) {
          switch (_procedureSignature.mode()) {
            case SCHEMA:
              this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.ARCHITECT);
              break;
            case WRITE:
              if (!PROC_NAMES_FOR_ROLE_BESIDES_EDITOR.contains(_procedureSignature.name().name())) {
                this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.EDITOR);
              }

              this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.PUBLISHER);
              this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.ARCHITECT);
              break;
            default:
              this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.READER);
              this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.EDITOR);
              this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.PUBLISHER);
              this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.ARCHITECT);
          }

          this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.ADMIN);
          this.defaultBuiltInRoles.addAll(Arrays.asList(_procedureSignature.allowed()));
        } else {
          this.defaultBuiltInRoles.add(io.github.onograph.TokenConstants.ADMIN);
        }
      }
    }


    private boolean _isAipce() {
      return this.name.startsWith(
          io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_ROLES_FOR_USER) ||
          this.name.startsWith(io.github.onograph.TokenConstants.DBMS__UPGRADE);
    }


    private boolean _isIapru() {
      return this.name.startsWith(
          io.github.onograph.TokenConstants.DBMS__SECURITY__CHANGE_PASSWORD);
    }
  }


  public static class ProfileReturnedMeta {


    public final String prfe;

    public ProfileReturnedMeta(String _strPoie) {
      this.prfe = _strPoie;
    }
  }


  public static class TransactionResourceLockMeta {


    public final String mdstr;


    public final String rtName;


    public final long rxId;


    public final String transIdx;

    public TransactionResourceLockMeta(String mdstr, String rtName, long rxId, String transIdx) {
      this.mdstr = mdstr;
      this.rtName = rtName;
      this.rxId = rxId;
      this.transIdx = transIdx;
    }
  }
}
