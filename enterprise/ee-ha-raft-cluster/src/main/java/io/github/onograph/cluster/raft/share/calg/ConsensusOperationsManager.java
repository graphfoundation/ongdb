package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultMeta;
import io.github.onograph.cluster.raft.share.calg.action.ResultMeta;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaInfo;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeTypeFI;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import io.github.onograph.cluster.raft.share.meta.pit.ConsensusMembershipState;
import io.github.onograph.dbms.crash.DbmsCrashManager;
import io.github.onograph.dbms.crash.GdbCrashEvent;
import java.io.IOException;
import java.util.Optional;
import java.util.Set;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ConsensusOperationsManager implements ConsensusLeaderNodeService, CoreNodeLeaderCheck,
    DbmsCrashManager, ConsensusNodeTypeFI {


  private final ConsensusLogCacheService cfiConsensusLogCacheService;


  private final ConsensusMetaManagingEnvironment chmConsensusMetaManagingEnvironment;


  private final Lazy<ConsensusNodeId> lazyMslConsensusNodeId;


  private final Log log;


  private final MemberNodesService mmMemberNodesService;


  private final ConsensusProcessor oaConsensusProcessor;


  private final ConsensusMeta saeConsensusMeta;


  private final LeaderNodeScheduleWrapper talLeaderNodeScheduleWrapper;


  private volatile ConsensusNodeType rcConsensusNodeType;


  public ConsensusOperationsManager(ConsensusProcessor _aoConsensusProcessor,
      ConsensusLogCacheService _ifcConsensusLogCacheService,
      LeaderNodeScheduleWrapper _latLeaderNodeScheduleWrapper,
      Lazy<ConsensusNodeId> _lazyMslConsensusNodeId, LogProvider _logProvider,
      ConsensusMetaManagingEnvironment _mhcConsensusMetaManagingEnvironment,
      MemberNodesService _mmMemberNodesService, ConsensusMeta _saeConsensusMeta) {
    this.rcConsensusNodeType = ConsensusNodeType.CNT_NODE_FOLLOWER;
    this.lazyMslConsensusNodeId = _lazyMslConsensusNodeId;
    this.talLeaderNodeScheduleWrapper = _latLeaderNodeScheduleWrapper;
    this.log = _logProvider.getLog(this.getClass());
    this.mmMemberNodesService = _mmMemberNodesService;
    this.cfiConsensusLogCacheService = _ifcConsensusLogCacheService;
    this.oaConsensusProcessor = _aoConsensusProcessor;
    this.saeConsensusMeta = _saeConsensusMeta;
    this.chmConsensusMetaManagingEnvironment = _mhcConsensusMetaManagingEnvironment;
  }


  private void _elitm() throws IOException {
    if (this.talLeaderNodeScheduleWrapper.isEcto()) {
      this.treec();
    }
  }


  private void _trehrt() throws IOException {
    this.hadResultMeta(
        new ConsensusMessageServiceMeta.Timeoutable.AliveMsg(this.lazyMslConsensusNodeId.get()));
  }


  public synchronized ConsensusMembershipState coesaConsensusMembershipState() {
    return new ConsensusMembershipState(this.mmMemberNodesService.gecmtMemberIndexWrapper());
  }

  @Override
  public ConsensusNodeType curtrlConsensusNodeType() {
    return this.rcConsensusNodeType;
  }

  @Override
  public Optional<NodeServerMemberLeaderMeta> geldioOptional() {
    return this.oaConsensusProcessor.geldioOptional();
  }


  public long getConsTermLength() {
    return this.saeConsensusMeta.getElecTerm();
  }


  public synchronized ResultMeta hadResultMeta(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage _miAbstractConsensusMessage)
      throws IOException {

    ConsensusResultMeta reslt = this.rcConsensusNodeType.consensusMessagingService.hadConsensusResultMeta(
        _miAbstractConsensusMessage,
        this.chmConsensusMetaManagingEnvironment,
        this.log);
    this.rcConsensusNodeType = this.oaConsensusProcessor.hadConsensusNodeType(reslt);
    return reslt;
  }

  @Override
  public void handleCrash(GdbCrashEvent _pncGdbCrashEvent) {
    this.stptms();
  }


  public synchronized void inlceseForCo(ConsensusMembershipState _scConsensusMembershipState)
      throws IOException {
    this.mmMemberNodesService.intlForMe(_scConsensusMembershipState.getCmitdMemberIndexWrapper());
  }

  @Override
  public boolean isLee() {
    return this.rcConsensusNodeType == ConsensusNodeType.CNT_NODE_LEADER;
  }


  public ConsensusNodeId mebiConsensusNodeId() {
    return this.lazyMslConsensusNodeId.get();
  }


  public void porerai() {
    if (this.oaConsensusProcessor.geldioOptional().isPresent()) {
      this.talLeaderNodeScheduleWrapper.reeitmForNo(NodeElectionTimeTrackerType.TTT_ERR_TRACE);
    }

    this.talLeaderNodeScheduleWrapper.strForThTh(this::_elitm, this::_trehrt);
    this.saeConsensusMeta.setmstd();
    this.cfiConsensusLogCacheService.enb();
  }


  public Set<ConsensusNodeId> recnmeSet() {
    return this.mmMemberNodesService.recnmeSet();
  }

  @Override
  public void retlsrForLe(LeaderNodeEventHandlers _lseeLeaderNodeEventHandlers) {
    this.oaConsensusProcessor.retlsrForLe(_lseeLeaderNodeEventHandlers);
  }


  public synchronized void setrmesseForSe(Set<ConsensusNodeId> _setMtConsensusNodeId) {
    this.mmMemberNodesService.setrmesseForSe(_setMtConsensusNodeId);
    if (this.rcConsensusNodeType == ConsensusNodeType.CNT_NODE_LEADER) {
      this.mmMemberNodesService.onflsceForCo(
          this.saeConsensusMeta.folesteConsensusNodeFollowersMeta());
    }
  }


  public void stptms() {
    this.talLeaderNodeScheduleWrapper.stopWatchers();
  }


  public synchronized ConsensusMetaInfo sttConsensusMetaInfo() {
    return this.saeConsensusMeta.copConsensusMetaInfo();
  }


  public void treec() throws IOException {
    this.hadResultMeta(new ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        this.lazyMslConsensusNodeId.get()));
  }

  @Override
  public void unilnForLe(LeaderNodeEventHandlers _lseeLeaderNodeEventHandlers) {
    this.oaConsensusProcessor.unilnForLe(_lseeLeaderNodeEventHandlers);
  }


  public Set<ConsensusNodeId> voimbsSet() {
    return this.mmMemberNodesService.voimbsSet();
  }


  public enum SchedulerTimeoutType implements ScHolderJobScheduler.SchedulerTypeService {


    CON_ELECT,

    HEALTH_PING


  }
}
