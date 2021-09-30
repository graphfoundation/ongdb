package io.github.onograph.dbms;

import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import io.github.onograph.dbms.gdb.ClusteredAbstractMultipleGdbDatabaseManager;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.logging.LogProvider;


public final class ClusteredDbmsReconcilerLifecycleAdapter extends
    DefaultDbmsReconcilerLifecycleAdapter {


  private final GdbReplicatorDbmsManagerSystemListeningImpl leoGdbReplicatorDbmsManagerSystemListeningImpl;


  private final GdbReplicator sedGdbReplicator;


  public ClusteredDbmsReconcilerLifecycleAdapter(
      ClusteredAbstractMultipleGdbDatabaseManager _clusteredAbstractMultipleGdbDatabaseManager,
      ClusterSimpleStorageFacade _fssClusterSimpleStorageFacade, GlobalModule _globalModule,
      HealthMonitorService healthMonitorService, MediationDbmsManagers mediationDbmsManagers,
      GdbReplicator _sedGdbReplicator,
      SystemGraphDbmsModelClusterImpl _systemGraphDbmsModelClusterImpl,
      ReconciledTransactionTracker _ttrReconciledTransactionTracker) {
    super(_clusteredAbstractMultipleGdbDatabaseManager, _systemGraphDbmsModelClusterImpl,
        _globalModule, healthMonitorService,
        mediationDbmsManagers,
        _crernrDbmsStateFacadeClusterImpl(_clusteredAbstractMultipleGdbDatabaseManager,
            _fssClusterSimpleStorageFacade, _globalModule,
            healthMonitorService), _ttrReconciledTransactionTracker);
    this.sedGdbReplicator = _sedGdbReplicator;
    this.leoGdbReplicatorDbmsManagerSystemListeningImpl =
        new GdbReplicatorDbmsManagerSystemListeningImpl(
            mediationDbmsManagers.getOsrKernelDbmsManager());
  }


  private static DbmsStateFacadeClusterImpl _crernrDbmsStateFacadeClusterImpl(
      ClusteredAbstractMultipleGdbDatabaseManager _clusteredAbstractMultipleGdbDatabaseManager,
      ClusterSimpleStorageFacade _fssClusterSimpleStorageFacade, GlobalModule _globalModule,
      HealthMonitorService healthMonitorService) {

    LogProvider _logProvider = _globalModule.getLogService().getInternalLogProvider();

    StateChangeTrackerMapping _ttStateChangeTrackerMapping =
        cretsntlStateChangeTrackerMapping(
            new ReconcilerFlowManagerClusterImpl(_clusteredAbstractMultipleGdbDatabaseManager,
                healthMonitorService));
    return new DbmsStateFacadeClusterImpl(_globalModule.getGlobalConfig(),
        _fssClusterSimpleStorageFacade, _globalModule.getJobScheduler(), _logProvider,
        _ttStateChangeTrackerMapping);
  }


  static StateChangeTrackerMapping cretsntlStateChangeTrackerMapping(
      ReconcilerFlowManagerClusterImpl _reconcilerFlowManagerClusterImpl) {

    StateChangeTrackerMapping _ttsStateChangeTrackerMapping =
        DefaultDbmsReconcilerLifecycleAdapter.cretsntlStateChangeTrackerMapping(
            _reconcilerFlowManagerClusterImpl);

    StateChangeTrackerMapping _ttcStateChangeTrackerMapping = StateChangeTrackerMapping.bulrStateChangeTrackerMappingFlowFactory()
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .toStateChangeTrackerMappingRequiresTrans(
            OperatorStateEnterpriseTypeImpl.SETI_D)
        .dotrsStateChangeTrackerMappingCreateOrNext(
            _reconcilerFlowManagerClusterImpl._enedydbexStateChange(),
            _reconcilerFlowManagerClusterImpl.droStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .toStateChangeTrackerMappingRequiresTrans(
            OperatorStateEnterpriseTypeImpl.SETI_DD)
        .dotrsStateChangeTrackerMappingCreateOrNext(
            _reconcilerFlowManagerClusterImpl._enedydbexStateChange(),
            _reconcilerFlowManagerClusterImpl.drpdmdaStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS)
        .toStateChangeTrackerMappingRequiresTrans(
            OperatorStateEnterpriseTypeImpl.SETI_D)
        .dotrsStateChangeTrackerMappingCreateOrNext(
            _reconcilerFlowManagerClusterImpl.stoStateChange(),
            _reconcilerFlowManagerClusterImpl.droStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS)
        .toStateChangeTrackerMappingRequiresTrans(
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(
            _reconcilerFlowManagerClusterImpl.stoStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS)
        .toStateChangeTrackerMappingRequiresTrans(
            OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .dotrsStateChangeTrackerMappingCreateOrNext(
            _reconcilerFlowManagerClusterImpl.stascStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .toStateChangeTrackerMappingRequiresTrans(
            OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS)
        .dotrsStateChangeTrackerMappingCreateOrNext(
            _reconcilerFlowManagerClusterImpl.stbescStateChange())
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS)
        .toStateChangeTrackerMappingRequiresTrans(
            OperatorStateEnterpriseTypeImpl.SETI_QT)
        .dotrsStateChangeTrackerMappingCreateOrNext(
            _reconcilerFlowManagerClusterImpl.stoStateChange(),
            _reconcilerFlowManagerClusterImpl.seqrteStateChange())
        .bulStateChangeTrackerMapping();
    return _ttsStateChangeTrackerMapping.exewhStateChangeTrackerMapping(
        _ttcStateChangeTrackerMapping);
  }

  @Override
  protected void retwtltscForGl(GlobalModule _globalModule) {
    this.sedGdbReplicator.retlsrForNaGd(this.leoGdbReplicatorDbmsManagerSystemListeningImpl,
        DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
  }

  @Override
  protected void uniwliesvForGl(GlobalModule _globalModule) {
    this.sedGdbReplicator.unilnForNaGd(this.leoGdbReplicatorDbmsManagerSystemListeningImpl,
        DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
  }
}
