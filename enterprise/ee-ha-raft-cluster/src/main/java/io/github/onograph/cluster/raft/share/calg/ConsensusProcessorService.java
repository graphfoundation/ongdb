package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import java.time.Clock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.LogProvider;


public class ConsensusProcessorService extends LifecycleAdapter
    implements
    io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes.MemberNodeEventListener {


  private final ConsensusLogCacheService cfiConsensusLogCacheService;


  private final Clock clock;


  private final int iCbs;


  private final int iLsam;


  private final Lazy<ConsensusNodeId> lazyMslConsensusNodeId;


  private final long lgMtr;


  private final LogProvider logProvider;


  private final ConsensusTransactionLogEntry lrConsensusTransactionLogEntry;


  private final Map<ConsensusNodeId, ConsensusTransactionLogProcessor> mapSlcc = new HashMap();


  private final MemberNodes mmesiMemberNodes;


  private final OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage>
      outDirectionOtoncc;


  private final ScHolderJobScheduler stScHolderJobScheduler;


  private LeaderNodeElectionEnv cllLeaderNodeElectionEnv;


  private boolean isRnig;


  private boolean notRunning;


  public ConsensusProcessorService(ConsensusLogCacheService _cfiConsensusLogCacheService,
      Clock _clock, int _iLsam, int _iSbc, Lazy<ConsensusNodeId> _lazyMslConsensusNodeId,
      long _lgMtr, LogProvider _logProvider,
      ConsensusTransactionLogEntry _lrConsensusTransactionLogEntry, MemberNodes _mmesiMemberNodes,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOtoncc,
      ScHolderJobScheduler _tsScHolderJobScheduler) {
    this.outDirectionOtoncc = _outDirectionOtoncc;
    this.logProvider = _logProvider;
    this.lrConsensusTransactionLogEntry = _lrConsensusTransactionLogEntry;
    this.stScHolderJobScheduler = _tsScHolderJobScheduler;
    this.clock = _clock;
    this.lazyMslConsensusNodeId = _lazyMslConsensusNodeId;
    this.mmesiMemberNodes = _mmesiMemberNodes;
    this.lgMtr = _lgMtr;
    this.iCbs = _iSbc;
    this.iLsam = _iLsam;
    this.cfiConsensusLogCacheService = _cfiConsensusLogCacheService;
    _mmesiMemberNodes.retlsrForMe(this);
  }


  private void _enelshrriForCoLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv,
      ConsensusNodeId _mmeConsensusNodeId) {

    ConsensusTransactionLogProcessor _slConsensusTransactionLogProcessor = this.mapSlcc.get(
        _mmeConsensusNodeId);
    if (_slConsensusTransactionLogProcessor == null && !_mmeConsensusNodeId.equals(
        this.lazyMslConsensusNodeId.get())) {
      _slConsensusTransactionLogProcessor =
          new ConsensusTransactionLogProcessor(
              this.cfiConsensusLogCacheService, this.clock, _mmeConsensusNodeId, this.iLsam,
              this.iCbs, this.lazyMslConsensusNodeId.get(),
              _clLeaderNodeElectionEnv.comie, this.lgMtr,
              _clLeaderNodeElectionEnv.ter, this.logProvider, this.lrConsensusTransactionLogEntry,
              this.outDirectionOtoncc,
              this.stScHolderJobScheduler);
      this.mapSlcc.put(_mmeConsensusNodeId, _slConsensusTransactionLogProcessor);
      _slConsensusTransactionLogProcessor.str();
    }
  }


  public synchronized void hadcmdForItLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv,
      Iterable<AbstractTransactionLogProcessorAction> _iterableScAbstractTransactionLogProcessorAction) {

    Iterator _iterator = _iterableScAbstractTransactionLogProcessorAction.iterator();

    while (_iterator.hasNext()) {

      AbstractTransactionLogProcessorAction _csAbstractTransactionLogProcessorAction = (AbstractTransactionLogProcessorAction) _iterator.next();

      Iterator _iterator2 = this.mapSlcc.values().iterator();

      while (_iterator2.hasNext()) {

        ConsensusTransactionLogProcessor _slConsensusTransactionLogProcessor = (ConsensusTransactionLogProcessor) _iterator2.next();
        _csAbstractTransactionLogProcessorAction.apltoForCoLe(_slConsensusTransactionLogProcessor,
            _clLeaderNodeElectionEnv);
      }
    }

    this.cllLeaderNodeElectionEnv = _clLeaderNodeElectionEnv;
  }

  @Override
  public synchronized void onmbicn() {
    if (this.cllLeaderNodeElectionEnv != null && this.isRnig) {

      HashSet<ConsensusNodeId> _hashSetRbtConsensusNodeId = new HashSet(this.mapSlcc.keySet());
      _hashSetRbtConsensusNodeId.removeAll(this.mmesiMemberNodes.recnmeSet());

      Iterator _iterator = _hashSetRbtConsensusNodeId.iterator();

      ConsensusNodeId _mrConsensusNodeId;
      while (_iterator.hasNext()) {
        _mrConsensusNodeId = (ConsensusNodeId) _iterator.next();

        ConsensusTransactionLogProcessor _slConsensusTransactionLogProcessor = this.mapSlcc.remove(
            _mrConsensusNodeId);
        if (_slConsensusTransactionLogProcessor != null) {
          _slConsensusTransactionLogProcessor.cancel();
        }
      }

      _iterator = this.mmesiMemberNodes.recnmeSet().iterator();

      while (_iterator.hasNext()) {
        _mrConsensusNodeId = (ConsensusNodeId) _iterator.next();
        this._enelshrriForCoLe(this.cllLeaderNodeElectionEnv, _mrConsensusNodeId);
      }
    }
  }


  public synchronized void pas() {
    this.isRnig = false;
    this.mapSlcc.values().forEach(ConsensusTransactionLogProcessor::cancel);
    this.mapSlcc.clear();
  }


  public synchronized void reuForLe(LeaderNodeElectionEnv _cliLeaderNodeElectionEnv) {
    if (!this.notRunning) {
      this.isRnig = true;

      Iterator _iterator = this.mmesiMemberNodes.recnmeSet().iterator();

      while (_iterator.hasNext()) {

        ConsensusNodeId _mmeConsensusNodeId = (ConsensusNodeId) _iterator.next();
        this._enelshrriForCoLe(_cliLeaderNodeElectionEnv, _mmeConsensusNodeId);
      }

      this.cllLeaderNodeElectionEnv = _cliLeaderNodeElectionEnv;
    }
  }

  @Override
  public synchronized void stop() {
    this.pas();
    this.notRunning = true;
  }


}
