package io.github.onograph.dbms;

import io.github.onograph.dbms.gdb.AbstractMultipleGdbDatabaseManager;
import io.github.onograph.dbms.gdb.DatabaseStateUpdateHandlerOppStatsImpl;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.common.DependencyResolver;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.database.DatabaseOperationCounts.Counter;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.graphdb.event.TransactionEventListenerAdapter;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.storageengine.api.TransactionIdStore;


public class DefaultDbmsReconcilerLifecycleAdapter extends LifecycleAdapter {


  protected final DatabaseIdRepository databaseIdRepository;


  protected final MediationDbmsManagers mediationDbmsManagers;


  protected final DbmsStateResolverFacade reoirDbmsStateResolverFacade;


  private final AbstractMultipleGdbDatabaseManager<?> abstractMultipleGdbDatabaseManagerMdObject;


  private final ManagerFacade cnetrManagerFacade;


  private final CrashDatabaseEventListenerAdapter crashDatabaseEventListenerAdapter;


  private final DatabaseStateServiceDefaultEnterpriseImpl databaseStateServiceDefaultEnterpriseImpl;


  private final DefaultSystemGraphDbmsModel defaultSystemGraphDbmsModel;


  private final GlobalModule globalModule;


  private final HealthMonitorService healthMonitorService;


  private final SystemGdbTransactionEventListenerAdapter sclSystemGdbTransactionEventListenerAdapter;


  private final ReconciledTransactionTracker ttrReconciledTransactionTracker;


  public DefaultDbmsReconcilerLifecycleAdapter(
      AbstractMultipleGdbDatabaseManager<?> _abstractMultipleGdbDatabaseManagerMdObject,
      DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel, GlobalModule _globalModule,
      HealthMonitorService healthMonitorService, MediationDbmsManagers mediationDbmsManagers,
      ReconciledTransactionTracker _ttrReconciledTransactionTracker) {
    this(_abstractMultipleGdbDatabaseManagerMdObject, _defaultSystemGraphDbmsModel, _globalModule,
        healthMonitorService, mediationDbmsManagers,
        _crernrDbmsStateResolverFacade(_abstractMultipleGdbDatabaseManagerMdObject, _globalModule,
            healthMonitorService),
        _ttrReconciledTransactionTracker);
  }


  protected DefaultDbmsReconcilerLifecycleAdapter(
      AbstractMultipleGdbDatabaseManager<?> _abstractMultipleGdbDatabaseManagerMdObject,
      DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel, GlobalModule _globalModule,
      HealthMonitorService healthMonitorService, MediationDbmsManagers mediationDbmsManagers,
      DbmsStateResolverFacade _rcnieDbmsStateResolverFacade,
      ReconciledTransactionTracker _rttReconciledTransactionTracker) {
    this.healthMonitorService = healthMonitorService;
    this.mediationDbmsManagers = mediationDbmsManagers;
    this.globalModule = _globalModule;
    this.abstractMultipleGdbDatabaseManagerMdObject = _abstractMultipleGdbDatabaseManagerMdObject;
    this.databaseIdRepository = _abstractMultipleGdbDatabaseManagerMdObject.databaseIdRepository();
    this.ttrReconciledTransactionTracker = _rttReconciledTransactionTracker;
    this.reoirDbmsStateResolverFacade = _rcnieDbmsStateResolverFacade;
    this.sclSystemGdbTransactionEventListenerAdapter = new SystemGdbTransactionEventListenerAdapter(
        mediationDbmsManagers.getOsrKernelDbmsManager());
    this.databaseStateServiceDefaultEnterpriseImpl =
        new DatabaseStateServiceDefaultEnterpriseImpl(_abstractMultipleGdbDatabaseManagerMdObject,
            _rcnieDbmsStateResolverFacade);
    this.cnetrManagerFacade = new ManagerFacade(_rcnieDbmsStateResolverFacade);
    this.crashDatabaseEventListenerAdapter = new CrashDatabaseEventListenerAdapter(
        mediationDbmsManagers.getOqDbmsManagerWatchTagImpl());
    this.defaultSystemGraphDbmsModel = _defaultSystemGraphDbmsModel;
    _globalModule.getGlobalDependencies().satisfyDependency(_rcnieDbmsStateResolverFacade);
    _globalModule.getGlobalDependencies()
        .satisfyDependency(this.databaseStateServiceDefaultEnterpriseImpl);
    _globalModule.getGlobalDependencies().satisfyDependency(this.cnetrManagerFacade);

    Counter _coCounter = _globalModule.getGlobalDependencies().resolveDependency(Counter.class);
    _rcnieDbmsStateResolverFacade.retdtesecglsrForDa(
        new DatabaseStateUpdateHandlerOppStatsImpl(_coCounter));
  }


  private static DbmsStateResolverFacade _crernrDbmsStateResolverFacade(
      AbstractMultipleGdbDatabaseManager<?> _abstractMultipleGdbDatabaseManagerDmObject,
      GlobalModule _globalModule, HealthMonitorService healthMonitorService) {

    StateChangeTrackerMapping _ttStateChangeTrackerMapping =
        cretsntlStateChangeTrackerMapping(
            new ReconcilerFlowManager(_abstractMultipleGdbDatabaseManagerDmObject,
                healthMonitorService));
    return new DbmsStateResolverFacade(_globalModule.getGlobalConfig(),
        _globalModule.getJobScheduler(),
        _globalModule.getLogService().getInternalLogProvider(),
        _ttStateChangeTrackerMapping);
  }


  private static long _gelscstatidForGr(GraphDatabaseAPI _dGraphDatabaseAPI) {

    DependencyResolver _dependencyResolver = _dGraphDatabaseAPI.getDependencyResolver();

    TransactionIdStore _sitTransactionIdStore = _dependencyResolver.resolveDependency(
        TransactionIdStore.class);
    return _sitTransactionIdStore.getLastClosedTransactionId();
  }


  private static GraphDatabaseAPI _gessdasGraphDatabaseAPI(
      AbstractMultipleGdbDatabaseManager<?> _abstractMultipleGdbDatabaseManagerMdObject) {
    return _abstractMultipleGdbDatabaseManagerMdObject.getDatabaseContext(
        DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID).orElseThrow().databaseFacade();
  }


  static StateChangeTrackerMapping cretsntlStateChangeTrackerMapping(
      ReconcilerFlowManager _tReconcilerFlowManager) {
    return StateChangeTrackerMapping.bulrStateChangeTrackerMappingFlowFactory()
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_IS)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_D)
        .donoiStateChangeTrackerMappingCreateOrNext()
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_IS)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_DD)
        .donoiStateChangeTrackerMappingCreateOrNext()
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_IS)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.vaitStateChange(),
            _tReconcilerFlowManager.craStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_IS)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.vaitStateChange(),
            _tReconcilerFlowManager.craStateChange(),
            _tReconcilerFlowManager.strStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.strStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_D)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.droStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_DD)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.drpdmdaStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_D)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.prpedoStateChange(),
            _tReconcilerFlowManager.stoStateChange(),
            _tReconcilerFlowManager.droStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_DD)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.stoStateChange(),
            _tReconcilerFlowManager.drpdmdaStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.stoStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .donoiStateChangeTrackerMappingCreateOrNext()
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_D)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.droStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_DD)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.drpdmdaStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_DD)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_D)
        .donoiStateChangeTrackerMappingCreateOrNext()
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_IS)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .donoiStateChangeTrackerMappingCreateOrNext()
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.seqrteStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.stoStateChange(),
            _tReconcilerFlowManager.seqrteStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.seqrteStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.reeqaeStateChange(),
            _tReconcilerFlowManager.vaitStateChange(),
            _tReconcilerFlowManager.craStateChange(),
            _tReconcilerFlowManager.strStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.reeqaeStateChange(),
            _tReconcilerFlowManager.vaitStateChange(),
            _tReconcilerFlowManager.craStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_D)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.reeqaeStateChange(),
            _tReconcilerFlowManager.craStateChange(),
            _tReconcilerFlowManager.droStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .toStateChangeTrackerMappingRequiresTrans(OperatorStateEnterpriseTypeImpl.SETI_DD)
        .dotrsStateChangeTrackerMappingCreateOrNext(_tReconcilerFlowManager.reeqaeStateChange(),
            _tReconcilerFlowManager.craStateChange(),
            _tReconcilerFlowManager.drpdmdaStateChange())
        .bulStateChangeTrackerMapping();
  }


  private void _staldas() {

    Set<NamedDatabaseId> _setDrNamedDatabaseId = this.abstractMultipleGdbDatabaseManagerMdObject.registeredDatabases()
        .keySet();
    this.mediationDbmsManagers.getOsDbmsManagerShutdownImpl().stpalForSe(_setDrNamedDatabaseId);
  }


  private void _stiadas() throws DatabaseManagementException {

    Set<AbstractDbmsManager> _setOsAbstractDbmsManager =
        Stream.concat(Stream.of(this.mediationDbmsManagers.getOssInitializerDbmsManager()),
                this.mediationDbmsManagers.innoerStream())
            .collect(Collectors.toUnmodifiableSet());
    this.cnetrManagerFacade.seoroForCo(_setOsAbstractDbmsManager);
    this.mediationDbmsManagers.getOssInitializerDbmsManager().strsye();

    GraphDatabaseAPI _dsGraphDatabaseAPI = _gessdasGraphDatabaseAPI(
        this.abstractMultipleGdbDatabaseManagerMdObject);

    long _lgLcti = _gelscstatidForGr(_dsGraphDatabaseAPI);

    Set<NamedDatabaseId> _setNdaNamedDatabaseId = this.defaultSystemGraphDbmsModel.geeigdbnaSet();

    DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl = this.mediationDbmsManagers.getOqDbmsManagerWatchTagImpl();
    _oqDbmsManagerWatchTagImpl.adaltdsForMa(
        this.healthMonitorService.chqnmrMap(_setNdaNamedDatabaseId));
    this.mediationDbmsManagers.getOssInitializerDbmsManager().stannse();
    this.ttrReconciledTransactionTracker.enable(_lgLcti);

    Set<AbstractDbmsManager> _setOrAbstractDbmsManager =
        Stream.concat(Stream.of(this.mediationDbmsManagers.getOsrKernelDbmsManager()),
                this.mediationDbmsManagers.innoerStream())
            .collect(Collectors.toUnmodifiableSet());
    this.cnetrManagerFacade.seoroForCo(_setOrAbstractDbmsManager);
    this.mediationDbmsManagers.getOsrKernelDbmsManager().upedrsaGdbInfoWrapper();
    this.mediationDbmsManagers.getOsrKernelDbmsManager()
        .trgrDbmsResolverMeta(DbmsResolverAction.sipDbmsResolverAction()).awial();
  }


  public DatabaseStateServiceDefaultEnterpriseImpl getDatabaseStateServiceDefaultEnterpriseImpl() {
    return this.databaseStateServiceDefaultEnterpriseImpl;
  }


  public void retdtesecglsrForDa(DatabaseStateUpdateHandler _lcsdDatabaseStateUpdateHandler) {
    this.reoirDbmsStateResolverFacade.retdtesecglsrForDa(_lcsdDatabaseStateUpdateHandler);
  }


  protected void retwtltscForGl(GlobalModule _globalModule) {
    _globalModule.getTransactionEventListeners()
        .registerTransactionEventListener(io.github.onograph.TokenConstants.SYSTEM,
            this.sclSystemGdbTransactionEventListenerAdapter);
    _globalModule.getDatabaseEventListeners()
        .registerDatabaseEventListener(this.crashDatabaseEventListenerAdapter);
  }

  @Override
  public void start() throws Exception {
    this.retwtltscForGl(this.globalModule);
    this._stiadas();
  }

  @Override
  public void stop() {
    this._staldas();
    this.uniwliesvForGl(this.globalModule);
  }


  protected void uniwliesvForGl(GlobalModule _globalModule) {
    _globalModule.getDatabaseEventListeners()
        .unregisterDatabaseEventListener(this.crashDatabaseEventListenerAdapter);
    _globalModule.getTransactionEventListeners()
        .unregisterTransactionEventListener(io.github.onograph.TokenConstants.SYSTEM,
            this.sclSystemGdbTransactionEventListenerAdapter);
  }


  private static class SystemGdbTransactionEventListenerAdapter extends
      TransactionEventListenerAdapter<Object> {


    private final KernelDbmsManager soKernelDbmsManager;

    SystemGdbTransactionEventListenerAdapter(KernelDbmsManager _soKernelDbmsManager) {
      this.soKernelDbmsManager = _soKernelDbmsManager;
    }

    @Override
    public void afterCommit(TransactionData _dtTransactionData, Object _obSae,
        GraphDatabaseService _dsGraphDatabaseService) {
      this.soKernelDbmsManager.tranci(_dtTransactionData.getTransactionId());
    }
  }
}
