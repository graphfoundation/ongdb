package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;
import io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck;
import io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import java.util.function.Supplier;
import org.neo4j.annotations.documented.Documented;


@Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED)
public class ConsensusCoreNodeAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_FIN_LED_MSX_TPX)
  public static final String FIN_LED_MSX_TPX = MetricRegistry.name(
      io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
      io.github.onograph.TokenConstants.LAST_LEADER_MESSAGE);


  static final String CAS_CLSRG_PRE = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE;


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_APE_IDX_TPX)
  private static final String APE_IDX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.APPEND_INDEX);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_APLD_IDX_TPX)
  private static final String APLD_IDX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.APPLIED_INDEX);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_CMT_IDX_TPX)
  private static final String CMT_IDX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.COMMIT_INDEX);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_CNT_BTXS_TPX)
  private static final String CNT_BTXS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.IN_FLIGHT_CACHE,
          io.github.onograph.TokenConstants.TOTAL_BYTES);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_DEA_TPX)
  private static final String DEA_TPX = MetricRegistry.name(
      io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
      io.github.onograph.TokenConstants.MESSAGE_PROCESSING_DELAY);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_ELMT_CSZ_TPX)
  private static final String ELMT_CSZ_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.IN_FLIGHT_CACHE,
          io.github.onograph.TokenConstants.ELEMENT_COUNT);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_HIT_TPX)
  private static final String HIT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.IN_FLIGHT_CACHE,
          io.github.onograph.TokenConstants.HITS);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_IS_LED_TPX)
  private static final String IS_LED_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.IS_LEADER);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_LIMT_BTXS_TPX)
  private static final String LIMT_BTXS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.IN_FLIGHT_CACHE,
          io.github.onograph.TokenConstants.MAX_BYTES);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_LIMT_ELMT_TPX)
  private static final String LIMT_ELMT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.IN_FLIGHT_CACHE,
          io.github.onograph.TokenConstants.MAX_ELEMENTS);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_MIS_TPX)
  private static final String MIS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.IN_FLIGHT_CACHE,
          io.github.onograph.TokenConstants.MISSES);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_SPCLX_TPX)
  private static final String SPCLX_TPX = MetricRegistry.name(
      io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
      io.github.onograph.TokenConstants.MESSAGE_PROCESSING_TIMER);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TER_TPX)
  private static final String TER_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.TERM);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TPX_FAI_TPX)
  private static final String TPX_FAI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.REPLICATION_FAIL);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TPX_MAB_TPX)
  private static final String TPX_MAB_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.REPLICATION_MAYBE);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TPX_NEW_TPX)
  private static final String TPX_NEW_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.REPLICATION_NEW);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TPX_SUCS_TPX)
  private static final String TPX_SUCS_TPX = MetricRegistry.name(
      io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
      io.github.onograph.TokenConstants.REPLICATION_SUCCESS);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TPX_TRY_TPX)
  private static final String TPX_TRY_TPX = MetricRegistry.name(
      io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
      io.github.onograph.TokenConstants.REPLICATION_ATTEMPT);


  @Documented(io.github.onograph.TokenConstants.CONSENSUS_CORE_NODE_ADAPTER___DOCUMENTED_TXS_RERS_TPX)
  private static final String TXS_RERS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.TX_RETRIES);


  private final LivingCacheMeta ifcmLivingCacheMeta;


  private final MetricRegistryManager metricRegistryManager;


  private final PetConsensusLogApplied mialrPetConsensusLogApplied;


  private final SubmittedConsensusLogCommitIndexMetric miclrSubmittedConsensusLogCommitIndexMetric;


  private final PreviousLeaderNodeMessage mmllPreviousLeaderNodeMessage;


  private final MonitorsClusterConsensusImpl monitorsClusterConsensusImpl;


  private final ConsensusMessageStats mpmrConsensusMessageStats;


  private final SyncStat mrSyncStat;


  private final TransactionAttempt mrtTransactionAttempt;


  private final ConsensusLogAdditions rlaimConsensusLogAdditions;


  private final ConsensusElectionTerm rtmConsensusElectionTerm;


  private final String sizeCnt;


  private final String strAr;


  private final String strBm;


  private final String strDly;


  private final String strEc;


  private final String strEm;


  private final String strFr;


  private final String strH;


  private final String strIa;


  private final String strIa2;


  private final String strIc;


  private final String strLi;


  private final String strMll;


  private final String strMr;


  private final String strMse;


  private final String strNr;


  private final String strRt;


  private final String strSr;


  private final String strTe;


  private final String strTmr;


  private final Supplier<CoreNodeLeaderCheck> supplierDmcCoreNodeLeaderCheck;


  private final GlobalTransactionPullRequests tprmGlobalTransactionPullRequests;

  public ConsensusCoreNodeAdapter() {
    this("", null, null, null);
  }

  public ConsensusCoreNodeAdapter(String mprnm,
      MonitorsClusterConsensusImpl _monitorsClusterConsensusImpl,
      MetricRegistryManager _metricRegistryManager,
      Supplier<CoreNodeLeaderCheck> _supplierDmcCoreNodeLeaderCheck) {
    super(EnterpriseMetricsType.EMT_CLUSTER);
    this.miclrSubmittedConsensusLogCommitIndexMetric = new SubmittedConsensusLogCommitIndexMetric();
    this.rlaimConsensusLogAdditions = new ConsensusLogAdditions();
    this.mialrPetConsensusLogApplied = new PetConsensusLogApplied();
    this.rtmConsensusElectionTerm = new ConsensusElectionTerm();
    this.tprmGlobalTransactionPullRequests = new GlobalTransactionPullRequests();
    this.mrtTransactionAttempt = new TransactionAttempt();
    this.ifcmLivingCacheMeta = new LivingCacheMeta();
    this.mpmrConsensusMessageStats = ConsensusMessageStats.craConsensusMessageStats();
    this.mrSyncStat = new SyncStat();
    this.strIa = MetricRegistry.name(mprnm, APE_IDX_TPX);
    this.strIc = MetricRegistry.name(mprnm, CMT_IDX_TPX);
    this.strIa2 = MetricRegistry.name(mprnm, APLD_IDX_TPX);
    this.strTe = MetricRegistry.name(mprnm, TER_TPX);
    this.strRt = MetricRegistry.name(mprnm, TXS_RERS_TPX);
    this.strLi = MetricRegistry.name(mprnm, IS_LED_TPX);
    this.sizeCnt = MetricRegistry.name(mprnm, CNT_BTXS_TPX);
    this.strBm = MetricRegistry.name(mprnm, LIMT_BTXS_TPX);
    this.strEc = MetricRegistry.name(mprnm, ELMT_CSZ_TPX);
    this.strEm = MetricRegistry.name(mprnm, LIMT_ELMT_TPX);
    this.strH = MetricRegistry.name(mprnm, HIT_TPX);
    this.strMse = MetricRegistry.name(mprnm, MIS_TPX);
    this.strDly = MetricRegistry.name(mprnm, DEA_TPX);
    this.strTmr = MetricRegistry.name(mprnm, SPCLX_TPX);
    this.strNr = MetricRegistry.name(mprnm, TPX_NEW_TPX);
    this.strAr = MetricRegistry.name(mprnm, TPX_TRY_TPX);
    this.strFr = MetricRegistry.name(mprnm, TPX_FAI_TPX);
    this.strMr = MetricRegistry.name(mprnm, TPX_MAB_TPX);
    this.strSr = MetricRegistry.name(mprnm, TPX_SUCS_TPX);
    this.strMll = MetricRegistry.name(mprnm, FIN_LED_MSX_TPX);
    this.monitorsClusterConsensusImpl = _monitorsClusterConsensusImpl;
    this.metricRegistryManager = _metricRegistryManager;
    this.supplierDmcCoreNodeLeaderCheck = _supplierDmcCoreNodeLeaderCheck;
    this.mmllPreviousLeaderNodeMessage = new PreviousLeaderNodeMessage(
        _supplierDmcCoreNodeLeaderCheck);
  }


  private String _megteneString(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme) {
    return MetricRegistry.name(this.strTmr, tNme.name().toLowerCase());
  }

  @Override
  public void start() {
    this.monitorsClusterConsensusImpl.addMonitorListener(
        this.miclrSubmittedConsensusLogCommitIndexMetric);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.rlaimConsensusLogAdditions);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.mialrPetConsensusLogApplied);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.rtmConsensusElectionTerm);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.tprmGlobalTransactionPullRequests);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.mrtTransactionAttempt);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.ifcmLivingCacheMeta);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.mpmrConsensusMessageStats);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.mrSyncStat);
    this.monitorsClusterConsensusImpl.addMonitorListener(this.mmllPreviousLeaderNodeMessage);
    this.metricRegistryManager.reieForStSu(this.strIc, () ->
    {

      Objects.requireNonNull(miclrSubmittedConsensusLogCommitIndexMetric);
      return new MetricsMeter(miclrSubmittedConsensusLogCommitIndexMetric::comie);
    });
    this.metricRegistryManager.reieForStSu(this.strIa, () ->
    {
      Objects.requireNonNull(rlaimConsensusLogAdditions);
      return new MetricsMeter(rlaimConsensusLogAdditions::apeie);
    });
    this.metricRegistryManager.reieForStSu(this.strIa2, () ->
    {

      Objects.requireNonNull(mialrPetConsensusLogApplied);
      return new MetricsMeter(mialrPetConsensusLogApplied::apldid);
    });
    this.metricRegistryManager.reieForStSu(this.strTe, () ->
    {

      Objects.requireNonNull(rtmConsensusElectionTerm);
      return new MetricsMeter(rtmConsensusElectionTerm::getTermLength);
    });
    this.metricRegistryManager.reieForStSu(this.strRt, () ->
    {

      Objects.requireNonNull(mrtTransactionAttempt);
      return new MetricsMeter(mrtTransactionAttempt::tranrr);
    });
    this.metricRegistryManager.reieForStSu(this.strLi, () ->
    {
      return new io.github.onograph.metrics.incoming.cluster.ConsensusCoreNodeAdapter.GaugeNodeImpl();
    });
    this.metricRegistryManager.reieForStSu(this.sizeCnt, () ->
    {

      Objects.requireNonNull(ifcmLivingCacheMeta);
      return new MetricsMeter(ifcmLivingCacheMeta::getSizeCnt);
    });
    this.metricRegistryManager.reieForStSu(this.strH, () ->
    {

      Objects.requireNonNull(ifcmLivingCacheMeta);
      return new MetricsMeter(ifcmLivingCacheMeta::gehs);
    });
    this.metricRegistryManager.reieForStSu(this.strMse, () ->
    {

      Objects.requireNonNull(ifcmLivingCacheMeta);
      return new MetricsMeter(ifcmLivingCacheMeta::gems);
    });
    this.metricRegistryManager.reieForStSu(this.strBm, () ->
    {

      Objects.requireNonNull(ifcmLivingCacheMeta);
      return new MetricsMeter(ifcmLivingCacheMeta::getLgBm);
    });
    this.metricRegistryManager.reieForStSu(this.strEm, () ->
    {

      Objects.requireNonNull(ifcmLivingCacheMeta);
      return new MetricsMeter(ifcmLivingCacheMeta::getIEm);
    });
    this.metricRegistryManager.reieForStSu(this.strEc, () ->
    {
      Objects.requireNonNull(ifcmLivingCacheMeta);
      return new MetricsMeter(ifcmLivingCacheMeta::getICe);
    });
    this.metricRegistryManager.reieForStSu(this.strDly, () ->
    {

      Objects.requireNonNull(mpmrConsensusMessageStats);
      return new MetricsMeter(mpmrConsensusMessageStats::dea);
    });
    this.metricRegistryManager.reieForStSu(this.strTmr, () ->
    {
      return this.mpmrConsensusMessageStats.getTimer();
    });
    this.metricRegistryManager.reieForStSu(this.strNr, () ->
    {

      Objects.requireNonNull(mrSyncStat);
      return new MetricsMeter(mrSyncStat::nerptco);
    });
    this.metricRegistryManager.reieForStSu(this.strAr, () ->
    {

      Objects.requireNonNull(mrSyncStat);
      return new MetricsMeter(mrSyncStat::atetcu);
    });
    this.metricRegistryManager.reieForStSu(this.strFr, () ->
    {
      Objects.requireNonNull(mrSyncStat);
      return new MetricsMeter(mrSyncStat::falcu);
    });
    this.metricRegistryManager.reieForStSu(this.strMr, () ->
    {

      Objects.requireNonNull(mrSyncStat);
      return new MetricsMeter(mrSyncStat::mabcot);
    });
    this.metricRegistryManager.reieForStSu(this.strSr, () ->
    {

      Objects.requireNonNull(mrSyncStat);
      return new MetricsMeter(mrSyncStat::sucscu);
    });
    this.metricRegistryManager.reieForStSu(this.strMll, () ->
    {
      return this.mmllPreviousLeaderNodeMessage;
    });

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType[] _raftConsensusMessageTypeArray =
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.values();

    int _iVar = _raftConsensusMessageTypeArray.length;

    for (

        int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme =
          _raftConsensusMessageTypeArray[_iVar2];
      this.metricRegistryManager.reieForStSu(this._megteneString(tNme), () ->
      {
        return this.mpmrConsensusMessageStats.getTimer(tNme);
      });
    }
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strIc);
    this.metricRegistryManager.reoForSt(this.strIa);
    this.metricRegistryManager.reoForSt(this.strIa2);
    this.metricRegistryManager.reoForSt(this.strTe);
    this.metricRegistryManager.reoForSt(this.strRt);
    this.metricRegistryManager.reoForSt(this.strLi);
    this.metricRegistryManager.reoForSt(this.sizeCnt);
    this.metricRegistryManager.reoForSt(this.strH);
    this.metricRegistryManager.reoForSt(this.strMse);
    this.metricRegistryManager.reoForSt(this.strBm);
    this.metricRegistryManager.reoForSt(this.strEm);
    this.metricRegistryManager.reoForSt(this.strEc);
    this.metricRegistryManager.reoForSt(this.strDly);
    this.metricRegistryManager.reoForSt(this.strTmr);
    this.metricRegistryManager.reoForSt(this.strNr);
    this.metricRegistryManager.reoForSt(this.strAr);
    this.metricRegistryManager.reoForSt(this.strFr);
    this.metricRegistryManager.reoForSt(this.strMr);
    this.metricRegistryManager.reoForSt(this.strSr);
    this.metricRegistryManager.reoForSt(this.strMll);

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType[] _raftConsensusMessageTypeArray =
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.values();

    int _iV = _raftConsensusMessageTypeArray.length;

    for (

        int _iVar = 0; _iVar < _iV; ++_iVar) {

      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme = _raftConsensusMessageTypeArray[_iVar];
      this.metricRegistryManager.reoForSt(this._megteneString(tNme));
    }

    this.monitorsClusterConsensusImpl.removeMonitorListener(
        this.miclrSubmittedConsensusLogCommitIndexMetric);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.rlaimConsensusLogAdditions);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.mialrPetConsensusLogApplied);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.rtmConsensusElectionTerm);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.tprmGlobalTransactionPullRequests);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.mrtTransactionAttempt);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.ifcmLivingCacheMeta);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.mpmrConsensusMessageStats);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.mrSyncStat);
    this.monitorsClusterConsensusImpl.removeMonitorListener(this.mmllPreviousLeaderNodeMessage);
  }


  private class GaugeNodeImpl implements Gauge<Integer> {

    @Override
    public Integer getValue() {
      return ConsensusCoreNodeAdapter.this.supplierDmcCoreNodeLeaderCheck.get().isLee() ? 1 : 0;
    }
  }
}
