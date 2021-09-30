package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultMeta;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class ConsensusProcessor {


  private final Collection<LeaderNodeEventHandlers> collectionLlLeaderNodeEventHandlers = new ArrayList();


  private final Consumer<ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted> consumerCrLeaderNotAccepted;


  private final Consumer<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> consumerCrsInfoReplyMessage;


  private final Log log;


  private final ConsensusProcessorService lsConsensusProcessorService;


  private final MemberNodesService mmMemberNodesService;


  private final ResettableMessageTimer mrtmrResettableMessageTimer;


  private final OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage>
      outDirectionOtoncc;


  private final ConsensusMeta saeConsensusMeta;


  private final LeaderNodeScheduleWrapper talLeaderNodeScheduleWrapper;


  private volatile NodeServerMemberLeaderMeta ilNodeServerMemberLeaderMeta;


  ConsensusProcessor(
      Consumer<ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted> _consumerCrLeaderNotAccepted,
      Consumer<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> _consumerCrsInfoReplyMessage,
      LogProvider _logProvider, MemberNodesService _mmMemberNodesService,
      ResettableMessageTimer _mrtmrResettableMessageTimer,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOtoncc,
      ConsensusMeta _saeConsensusMeta, ConsensusProcessorService _slConsensusProcessorService,
      LeaderNodeScheduleWrapper _talLeaderNodeScheduleWrapper) {
    this.saeConsensusMeta = _saeConsensusMeta;
    this.outDirectionOtoncc = _outDirectionOtoncc;
    this.talLeaderNodeScheduleWrapper = _talLeaderNodeScheduleWrapper;
    this.mrtmrResettableMessageTimer = _mrtmrResettableMessageTimer;
    this.lsConsensusProcessorService = _slConsensusProcessorService;
    this.mmMemberNodesService = _mmMemberNodesService;
    this.log = _logProvider.getLog(this.getClass());
    this.consumerCrLeaderNotAccepted = _consumerCrLeaderNotAccepted;
    this.consumerCrsInfoReplyMessage = _consumerCrsInfoReplyMessage;
  }


  private void _drmrForCo(ConsensusResultMeta reslt) throws IOException {
    this.mmMemberNodesService.prcslgForCo(reslt.getCollectionLcTransactionLogAction(),
        reslt.gecmie());

    ConsensusNodeType _rnConsensusNodeType = reslt.getConsensusNodeTypeForR();
    this.mmMemberNodesService.onroForCo(_rnConsensusNodeType);
    if (_rnConsensusNodeType == ConsensusNodeType.CNT_NODE_LEADER) {
      this.mmMemberNodesService.haelepts(this.saeConsensusMeta.isArtarlr());
      this.mmMemberNodesService.onflsceForCo(
          reslt.getConsensusNodeFollowersMetaSfConsensusNodeId());
    }
  }


  private void _hadteForCo(ConsensusResultMeta reslt) {
    reslt.elitmcaOptional().ifPresentOrElse((electionTimerMode) ->
    {
      this.mrtmrResettableMessageTimer.tieret();
      this.talLeaderNodeScheduleWrapper.reeitmForNo(electionTimerMode);
    }, () ->
    {
      if (reslt.isStpgdw()) {
        this.mrtmrResettableMessageTimer.tieret();
      }
    });
  }


  private void _haelshnForCo(ConsensusResultMeta reslt) {

    LeaderNodeElectionEnv _lcLeaderNodeElectionEnv = new LeaderNodeElectionEnv(reslt.getLdrComLng(),
        reslt.getLgT());
    if (reslt.getIsLe()) {
      this.lsConsensusProcessorService.reuForLe(_lcLeaderNodeElectionEnv);
    } else if (reslt.isStpgdw()) {
      this.lsConsensusProcessorService.pas();
    }

    if (reslt.getConsensusNodeTypeForR() == ConsensusNodeType.CNT_NODE_LEADER) {
      this.lsConsensusProcessorService.hadcmdForItLe(_lcLeaderNodeElectionEnv,
          reslt.getCollectionCsAbstractTransactionLogProcessorAction());
    }
  }


  private void _haesurpForCo(ConsensusResultMeta reslt) {
    reslt.gesaresOptional().ifPresent(this.consumerCrsInfoReplyMessage);
  }


  private boolean _isLedcndForCoCo(ConsensusNodeId _olConsensusNodeId, ConsensusResultMeta reslt) {
    return !Objects.equals(_olConsensusNodeId, reslt.getLaeConsensusNodeId());
  }


  private void _noylecnForCo(ConsensusResultMeta reslt) {

    Iterator _iterator = this.collectionLlLeaderNodeEventHandlers.iterator();

    while (_iterator.hasNext()) {

      LeaderNodeEventHandlers _lseeLeaderNodeEventHandlers = (LeaderNodeEventHandlers) _iterator.next();

      OptionalLong _optionalLong = reslt.stpdwteOptionalLong();
      Objects.requireNonNull(_lseeLeaderNodeEventHandlers);
      _optionalLong.ifPresent(_lseeLeaderNodeEventHandlers::onldsedn);
      _lseeLeaderNodeEventHandlers.onleeswcForNo(
          new NodeServerMemberLeaderMeta(reslt.getLaeConsensusNodeId(), reslt.getLgT()));
    }
  }


  private void _sedmsgForCo(ConsensusResultMeta reslt) {

    Iterator _iterator = reslt.getCollectionMoMessager().iterator();

    while (_iterator.hasNext()) {

      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager _moMessager =
          (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager) _iterator.next();

      try {
        this.outDirectionOtoncc.senForMEME(_moMessager.getM(), _moMessager.getToConsensusNodeId());
      } catch (

          Exception _exception) {

      }
    }
  }


  Optional<NodeServerMemberLeaderMeta> geldioOptional() {
    return Optional.ofNullable(this.ilNodeServerMemberLeaderMeta);
  }


  synchronized ConsensusNodeType hadConsensusNodeType(ConsensusResultMeta reslt)
      throws IOException {

    boolean _isEwln = this._isLedcndForCoCo(this.saeConsensusMeta.ledConsensusNodeId(), reslt);
    this.saeConsensusMeta.upaForCo(reslt);
    this._sedmsgForCo(reslt);
    this._hadteForCo(reslt);
    this._haelshnForCo(reslt);
    this.ilNodeServerMemberLeaderMeta = new NodeServerMemberLeaderMeta(
        reslt.getLaeConsensusNodeId(), reslt.getLgT());
    if (_isEwln) {
      this._noylecnForCo(reslt);
    }

    this._drmrForCo(reslt);
    reslt.gelatrerenOptional().ifPresent((rejection) ->
    {
      this.consumerCrLeaderNotAccepted.accept(rejection);
    });
    this._haesurpForCo(reslt);
    return reslt.getConsensusNodeTypeForR();
  }


  synchronized void retlsrForLe(LeaderNodeEventHandlers _lseeLeaderNodeEventHandlers) {
    this.collectionLlLeaderNodeEventHandlers.add(_lseeLeaderNodeEventHandlers);
    _lseeLeaderNodeEventHandlers.onleeswcForNo(
        this.saeConsensusMeta.ledioNodeServerMemberLeaderMeta());
  }


  synchronized void unilnForLe(LeaderNodeEventHandlers _lseeLeaderNodeEventHandlers) {
    this.collectionLlLeaderNodeEventHandlers.remove(_lseeLeaderNodeEventHandlers);
    _lseeLeaderNodeEventHandlers.onungt();
  }
}
