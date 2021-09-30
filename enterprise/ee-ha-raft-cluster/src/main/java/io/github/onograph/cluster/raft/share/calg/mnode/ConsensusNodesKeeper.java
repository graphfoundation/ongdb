package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import java.time.Clock;
import java.util.HashSet;
import java.util.Set;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class ConsensusNodesKeeper {


  private final Clock clock;


  private final long lgCt;


  private final long lgTlc;


  private final Log log;


  private final ConsensusTransactionLogEntry lrConsensusTransactionLogEntry;


  private final MemberNodesService mmMemberNodesService;


  public ConsensusNodeMetaCoordinator sttConsensusNodeMetaCoordinator = new Stale();


  private ConsensusNodeId mucConsensusNodeId;


  ConsensusNodesKeeper(Clock _clock, long _lgClt, long _lgTc, LogProvider _logProvider,
      ConsensusTransactionLogEntry _lrConsensusTransactionLogEntry,
      MemberNodesService _mmMemberNodesService) {
    this.lrConsensusTransactionLogEntry = _lrConsensusTransactionLogEntry;
    this.clock = _clock;
    this.lgTlc = _lgClt;
    this.lgCt = _lgTc;
    this.mmMemberNodesService = _mmMemberNodesService;
    this.log = _logProvider.getLog(this.getClass());
  }


  private synchronized void _hadstForCo(
      ConsensusNodeMetaCoordinator _snConsensusNodeMetaCoordinator) {

    ConsensusNodeMetaCoordinator _osConsensusNodeMetaCoordinator = this.sttConsensusNodeMetaCoordinator;
    this.sttConsensusNodeMetaCoordinator = _snConsensusNodeMetaCoordinator;
    if (_osConsensusNodeMetaCoordinator != _snConsensusNodeMetaCoordinator) {
      _osConsensusNodeMetaCoordinator.onex();
      _snConsensusNodeMetaCoordinator.oneny();

      this.mmMemberNodesService.sttchg();
    }
  }


  void onflsceForCo(
      ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId) {
    this._hadstForCo(this.sttConsensusNodeMetaCoordinator.onflsceConsensusNodeMetaCoordinator(
        _consensusNodeFollowersMetaSfConsensusNodeId));
  }


  void onlditn(boolean _isTa) {
    this._hadstForCo(
        this.sttConsensusNodeMetaCoordinator.onlditnConsensusNodeMetaCoordinator(_isTa));
  }


  void onmsmeForCo(ConsensusNodeId _mmeConsensusNodeId) {
    this._hadstForCo(this.sttConsensusNodeMetaCoordinator.onmsmeConsensusNodeMetaCoordinator(
        _mmeConsensusNodeId));
  }


  void onroForCo(ConsensusNodeType r) {
    this._hadstForCo(this.sttConsensusNodeMetaCoordinator.onroConsensusNodeMetaCoordinator(r));
  }


  void onrtgpci() {
    this._hadstForCo(this.sttConsensusNodeMetaCoordinator.onrtgpciConsensusNodeMetaCoordinator());
  }


  void onseommForCo(ConsensusNodeId _mmeConsensusNodeId) {
    this._hadstForCo(this.sttConsensusNodeMetaCoordinator.onseommConsensusNodeMetaCoordinator(
        _mmeConsensusNodeId));
  }


  void ontgcaForSe(Set<ConsensusNodeId> _setMtConsensusNodeId) {
    this._hadstForCo(this.sttConsensusNodeMetaCoordinator.ontgcaConsensusNodeMetaCoordinator(
        _setMtConsensusNodeId));
  }


  abstract class AbstractAliveConsensusNodeMetaCoordinator extends
      ConsensusNodeMetaCoordinator.AbstractConsensusNodeMetaCoordinator {

    @Override
    public ConsensusNodeMetaCoordinator onlditnConsensusNodeMetaCoordinator(boolean _isTa) {
      return _isTa ? ConsensusNodesKeeper.this.new LeaderChangeInProc() : this;
    }

    @Override
    public ConsensusNodeMetaCoordinator onroConsensusNodeMetaCoordinator(ConsensusNodeType r) {
      return r != ConsensusNodeType.CNT_NODE_LEADER ? ConsensusNodesKeeper.this.new Stale() : this;
    }
  }


  private class AliveConsensusNodeMetaCoordinatorCCActive extends
      AbstractAliveConsensusNodeMetaCoordinator {

    private AliveConsensusNodeMetaCoordinatorCCActive() {
      super();
    }

    @Override
    public void oneny() {
    }

    @Override
    public void onex() {
      ConsensusNodesKeeper.this.mmMemberNodesService.reeatlriombForCo(
          ConsensusNodesKeeper.this.mucConsensusNodeId);


    }

    @Override
    public ConsensusNodeMetaCoordinator onrtgpciConsensusNodeMetaCoordinator() {
      return ConsensusNodesKeeper.this.new Waiting();
    }


  }


  private class ClosingGap extends AbstractAliveConsensusNodeMetaCoordinator {


    private final AgreementManager tgcAgreementManager;


    boolean mogtcnu;

    ClosingGap(ConsensusNodeId _mmeConsensusNodeId) {
      super();
      this.tgcAgreementManager =
          new AgreementManager(ConsensusNodesKeeper.this.clock,
              ConsensusNodesKeeper.this.lgCt, ConsensusNodesKeeper.this.lgTlc,
              ConsensusNodesKeeper.this.lrConsensusTransactionLogEntry);
      ConsensusNodesKeeper.this.mucConsensusNodeId = _mmeConsensusNodeId;
    }

    @Override
    public void oneny() {
      ConsensusNodesKeeper.this.mmMemberNodesService.adadnrptmeForCo(
          ConsensusNodesKeeper.this.mucConsensusNodeId);


    }

    @Override
    public void onex() {
      if (!this.mogtcnu) {
        ConsensusNodesKeeper.this.mmMemberNodesService.reeatlriombForCo(
            ConsensusNodesKeeper.this.mucConsensusNodeId);


      }
    }

    @Override
    public ConsensusNodeMetaCoordinator onflsceConsensusNodeMetaCoordinator(
        ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaFsConsensusNodeId) {
      this.tgcAgreementManager.upapgsForCo(
          _consensusNodeFollowersMetaFsConsensusNodeId.getConsensusNodeFollowerMeta(
              ConsensusNodesKeeper.this.mucConsensusNodeId));
      if (this.tgcAgreementManager.getIsFnse()) {
        if (this.tgcAgreementManager.getIsAg()) {

          Set<ConsensusNodeId> _setUvmConsensusNodeId = new HashSet(
              ConsensusNodesKeeper.this.mmMemberNodesService.voimbsSet());
          _setUvmConsensusNodeId.add(ConsensusNodesKeeper.this.mucConsensusNodeId);
          ConsensusNodesKeeper.this.mmMemberNodesService.docoeuForSe(_setUvmConsensusNodeId);
          this.mogtcnu = true;
          return new ConsensusNodesKeeper.AliveConsensusNodeMetaCoordinatorCCActive();
        } else {
          return ConsensusNodesKeeper.this.new Waiting();
        }
      } else {
        return this;
      }
    }

    @Override
    public ConsensusNodeMetaCoordinator onroConsensusNodeMetaCoordinator(ConsensusNodeType r) {
      return r != ConsensusNodeType.CNT_NODE_LEADER ? ConsensusNodesKeeper.this.new Stale() : this;
    }

    @Override
    public ConsensusNodeMetaCoordinator ontgcaConsensusNodeMetaCoordinator(Set _mtSet) {
      return !_mtSet.contains(ConsensusNodesKeeper.this.mucConsensusNodeId)
          ? ConsensusNodesKeeper.this.new Waiting() : this;
    }


  }


  private class LeaderChangeInProc extends AbstractAliveConsensusNodeMetaCoordinator {

    private LeaderChangeInProc() {
      super();
    }

    @Override
    public ConsensusNodeMetaCoordinator onlditnConsensusNodeMetaCoordinator(boolean _isTa) {
      if (!_isTa) {
        return ConsensusNodesKeeper.this.mmMemberNodesService.isUnmdmecnil()
            ? ConsensusNodesKeeper.this.new AliveConsensusNodeMetaCoordinatorCCActive()
            : ConsensusNodesKeeper.this.new Waiting();
      } else {
        return this;
      }
    }


  }


  private class Stale extends ConsensusNodeMetaCoordinator.AbstractConsensusNodeMetaCoordinator {

    @Override
    public ConsensusNodeMetaCoordinator onroConsensusNodeMetaCoordinator(ConsensusNodeType r) {
      if (r == ConsensusNodeType.CNT_NODE_LEADER) {
        return ConsensusNodesKeeper.this.mmMemberNodesService.isUnmdmecnil()
            ? ConsensusNodesKeeper.this.new AliveConsensusNodeMetaCoordinatorCCActive()
            : ConsensusNodesKeeper.this.new Waiting();
      } else {
        return this;
      }
    }


  }


  private class Waiting extends AbstractAliveConsensusNodeMetaCoordinator {

    private Waiting() {
      super();
    }

    @Override
    public ConsensusNodeMetaCoordinator onmsmeConsensusNodeMetaCoordinator(
        ConsensusNodeId _mmeConsensusNodeId) {
      return ConsensusNodesKeeper.this.new ClosingGap(_mmeConsensusNodeId);
    }

    @Override
    public ConsensusNodeMetaCoordinator onseommConsensusNodeMetaCoordinator(
        ConsensusNodeId _mmeConsensusNodeId) {

      Set<ConsensusNodeId> _setMvuConsensusNodeId = new HashSet(
          ConsensusNodesKeeper.this.mmMemberNodesService.voimbsSet());
      _setMvuConsensusNodeId.remove(_mmeConsensusNodeId);
      ConsensusNodesKeeper.this.mmMemberNodesService.docoeuForSe(_setMvuConsensusNodeId);
      return ConsensusNodesKeeper.this.new AliveConsensusNodeMetaCoordinatorCCActive();
    }


  }
}
