package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher;
import io.github.onograph.cluster.raft.share.meta.ConsensusLogCursorAccessor;
import java.io.IOException;
import java.time.Clock;
import java.util.concurrent.TimeUnit;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;


public class ConsensusTransactionLogProcessor {


  private static final long MIN_IDX = 1L;


  private final ConsensusLogCacheService cfiConsensusLogCacheService;


  private final Clock clock;


  private final ConsensusNodeId floeConsensusNodeId;


  private final int iLsam;


  private final int iSbc;


  private final int iTmria = 0;


  private final ConsensusNodeId laeConsensusNodeId;


  private final long lgMtr;


  private final Log log;


  private final ConsensusTransactionLogEntry lrConsensusTransactionLogEntry;


  private final OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage>
      outDirectionOtoncc;


  private final ScHolderJobScheduler stScHolderJobScheduler;


  private LeaderNodeElectionEnv cllLeaderNodeElectionEnv;


  private long lgLsi;


  private long lgMat;


  private long lgMi = -1L;


  private ConsensusTransactionLogProcessor.TransactionProcessorType mdstr;


  private ScHolderJobSchedulerWatcher tmrScHolderJobSchedulerWatcher;


  ConsensusTransactionLogProcessor(ConsensusLogCacheService _cfiConsensusLogCacheService,
      Clock _clock, ConsensusNodeId _floeConsensusNodeId, int _iLsam, int _iSbc,
      ConsensusNodeId _laeConsensusNodeId, long ldrComLng, long _lgMtr, long _lgTl,
      LogProvider _logProvider, ConsensusTransactionLogEntry _lrConsensusTransactionLogEntry,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOtoncc,
      ScHolderJobScheduler _stScHolderJobScheduler) {
    this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_MCH;
    this.outDirectionOtoncc = _outDirectionOtoncc;
    this.stScHolderJobScheduler = _stScHolderJobScheduler;
    this.iSbc = _iSbc;
    this.iLsam = _iLsam;
    this.log = _logProvider.getLog(this.getClass());
    this.lrConsensusTransactionLogEntry = _lrConsensusTransactionLogEntry;
    this.clock = _clock;
    this.floeConsensusNodeId = _floeConsensusNodeId;
    this.laeConsensusNodeId = _laeConsensusNodeId;
    this.lgMtr = _lgMtr;
    this.cllLeaderNodeElectionEnv = new LeaderNodeElectionEnv(ldrComLng, _lgTl);
    this.cfiConsensusLogCacheService = _cfiConsensusLogCacheService;
  }


  private void _abrtio() {
    if (this.tmrScHolderJobSchedulerWatcher != null) {
      this.tmrScHolderJobSchedulerWatcher.cacForSc(
          io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC);
    }

    this.lgMat = 0L;
  }


  private boolean _isDonoesilo(long lgIdx, long _lgTl) {
    return _lgTl == -1L && lgIdx != -1L;
  }


  private boolean _isSenebtatmtForLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv) {

    long _lgLi = this.lrConsensusTransactionLogEntry.apeie();
    if (_lgLi > this.lgMi) {

      long _lgIe = Long.min(_lgLi, this.lgMi + (long) this.iSbc);
      this._scutm(this.lgMtr);
      this._sedrnForLe(_clLeaderNodeElectionEnv, _lgIe, this.lgMi + 1L);
      return _lgIe == _lgLi;
    } else {
      return true;
    }
  }


  private boolean _isTieou() {
    return this.lgMat != 0L && this.clock.millis() - this.lgMat >= 0L;
  }


  private synchronized void _onsedtoep() {
    if (this._isTieou()) {
      this.ontio();
    } else if (this.lgMat != 0L) {

      long _lgLt = this.lgMat - this.clock.millis();
      if (_lgLt > 0L) {
        this._scutm(_lgLt);
      } else {
        this.ontio();
      }
    }
  }


  private void _scutm(long _lgDm) {
    if (this.lgMi < 0L) {
      _lgDm = 500L;
    }

    this.lgMat = this.clock.millis() + _lgDm;
    if (this.tmrScHolderJobSchedulerWatcher == null) {
      this.tmrScHolderJobSchedulerWatcher = this.stScHolderJobScheduler.craScHolderJobSchedulerWatcher(
          Group.RAFT_HANDLER, (timeout) ->
          {
            this._onsedtoep();
          }, ConsensusTransactionLogProcessor.TimeoutType.RETRY);
    }

    this.tmrScHolderJobSchedulerWatcher.isSetForSc(
        ScHolderBuilder.fietioScHolder(_lgDm, TimeUnit.MILLISECONDS));
  }


  private void _secoueForLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv) {

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _raAliveNoReplyMessage =
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
            this.laeConsensusNodeId,
            _clLeaderNodeElectionEnv.comie,
            _clLeaderNodeElectionEnv.ter,
            _clLeaderNodeElectionEnv.ter);
    this.outDirectionOtoncc.senForMEME(_raAliveNoReplyMessage, this.floeConsensusNodeId);
  }


  private void _sedepForLe(LeaderNodeElectionEnv _lcLeaderNodeElectionEnv, long lgIdx) {
    this._scutm(this.lgMtr);
    lgIdx = Long.max(this.lrConsensusTransactionLogEntry.prvid() + 1L, lgIdx);
    this.lgLsi = lgIdx;

    try {

      long begLIdx = lgIdx - 1L;

      long befLT = this.lrConsensusTransactionLogEntry.redettm(begLIdx);
      if (befLT > _lcLeaderNodeElectionEnv.ter) {

        return;
      }

      if (this._isDonoesilo(begLIdx, befLT)) {

        return;
      }

      ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask nAsk =
          new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(befLT, begLIdx,
              ConsensusLogEntry.emtConsensusLogEntryArray,
              this.laeConsensusNodeId,
              _lcLeaderNodeElectionEnv.comie, _lcLeaderNodeElectionEnv.ter);
      this.outDirectionOtoncc.senForMEME(nAsk, this.floeConsensusNodeId);
    } catch (

        IOException _iOException) {

    }
  }


  private void _sednweteForCoLe(long befLT, long begLIdx,
      LeaderNodeElectionEnv _clLeaderNodeElectionEnv,
      ConsensusLogEntry[] _enConsensusLogEntryArray) {
    this._scutm(this.lgMtr);
    this.lgLsi = begLIdx + 1L;

    ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask nAsk =
        new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(befLT, begLIdx,
            _enConsensusLogEntryArray, this.laeConsensusNodeId,
            _clLeaderNodeElectionEnv.comie, _clLeaderNodeElectionEnv.ter);
    this.outDirectionOtoncc.senForMEME(nAsk, this.floeConsensusNodeId);
  }


  private void _sedrnForLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv, long _lgIe, long _lgIs) {
    if (_lgIs <= _lgIe) {
      this.lgLsi = _lgIe;

      try {

        int _iBs = (int) (_lgIe - _lgIs + 1L);

        ConsensusLogEntry[] _etisConsensusLogEntryArray = new ConsensusLogEntry[_iBs];

        long begLIdx = _lgIs - 1L;

        long befLT = this.lrConsensusTransactionLogEntry.redettm(begLIdx);
        if (befLT > _clLeaderNodeElectionEnv.ter) {

          return;
        }

        boolean _isEm = false;

        ConsensusLogCursorAccessor _selConsensusLogCursorAccessor =
            new ConsensusLogCursorAccessor(this.cfiConsensusLogCacheService, false,
                this.lrConsensusTransactionLogEntry);

        label62:
        {
          try {

            int ofst = 0;

            while (true) {
              if (ofst >= _iBs) {
                break label62;
              }

              _etisConsensusLogEntryArray[ofst] = _selConsensusLogCursorAccessor.getConsensusLogEntry(
                  _lgIs + (long) ofst);
              if (_etisConsensusLogEntryArray[ofst] == null) {
                _isEm = true;
                break label62;
              }

              if (_etisConsensusLogEntryArray[ofst].getLgTe() > _clLeaderNodeElectionEnv.ter) {

                break;
              }

              ++ofst;
            }
          } catch (

              Throwable _throwable) {
            try {
              _selConsensusLogCursorAccessor.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }

            throw _throwable;
          }

          _selConsensusLogCursorAccessor.close();
          return;
        }

        _selConsensusLogCursorAccessor.close();
        if (!_isEm && !this._isDonoesilo(begLIdx, befLT)) {

          ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask nAsk =
              new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(befLT, begLIdx,
                  _etisConsensusLogEntryArray, this.laeConsensusNodeId,
                  _clLeaderNodeElectionEnv.comie, _clLeaderNodeElectionEnv.ter);
          this.outDirectionOtoncc.senForMEME(nAsk, this.floeConsensusNodeId);
        } else if (this.lrConsensusTransactionLogEntry.prvid() >= begLIdx) {
          this._selocpoioForLe(_clLeaderNodeElectionEnv);
        } else {

        }
      } catch (

          IOException _iOException) {

      }
    }
  }


  private void _selocpoioForLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv) {

    this.outDirectionOtoncc.senForMEME(
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage(
            this.lrConsensusTransactionLogEntry.prvid(), this.laeConsensusNodeId,
            _clLeaderNodeElectionEnv.ter), this.floeConsensusNodeId);
  }


  private String _sttastnString() {
    return String
        .format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.share.calg.ConsensusTransactionLogProcessor.format"),
            this.floeConsensusNodeId, this.lgMi, this.lgLsi,
            this.lrConsensusTransactionLogEntry.apeie(), this.mdstr);
  }


  public synchronized void cancel() {

    this._abrtio();
  }


  public Object getFloeConsensusNodeId() {
    return this.floeConsensusNodeId;
  }


  public synchronized void oncoiuptForLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv) {
    if (this.mdstr
        == ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_FUTURE_PIPELINE_FEATURE) {
      this._secoueForLe(_clLeaderNodeElectionEnv);
    }

    this.cllLeaderNodeElectionEnv = _clLeaderNodeElectionEnv;
  }


  public synchronized void onmahForLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv, long _lgImn) {

    boolean _isPors = _lgImn > this.lgMi;
    if (_isPors) {
      this.lgMi = _lgImn;
    } else if (_lgImn == this.lgMi) {

    }

    switch (this.mdstr) {
      case TPT_MCH:
        if (this._isSenebtatmtForLe(_clLeaderNodeElectionEnv)) {

          this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_FUTURE_PIPELINE_FEATURE;
        } else {

          this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_ND_CU;
        }
        break;
      case TPT_FUTURE_PIPELINE_FEATURE:
        if (this.lgMi == this.lgLsi) {
          this._abrtio();
        } else if (_isPors) {
          this._scutm(this.lgMtr);
        }
        break;
      case TPT_ND_CU:
        if (this.lgMi >= this.lgLsi && this._isSenebtatmtForLe(_clLeaderNodeElectionEnv)) {

          this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_FUTURE_PIPELINE_FEATURE;
        }
        break;
      default:

        throw new IllegalStateException("*** Error: 2e27096b-ceb0-4ced-a128-fa1c21d71def");
    }

    this.cllLeaderNodeElectionEnv = _clLeaderNodeElectionEnv;
  }


  public synchronized void onmiahForLe(LeaderNodeElectionEnv _clLeaderNodeElectionEnv,
      long _lgIarl) {
    switch (this.mdstr) {
      case TPT_MCH:

        long lgIdx = Long.max(Long.min(this.lgLsi - 1L, _lgIarl), 1L);
        this._sedepForLe(_clLeaderNodeElectionEnv, lgIdx);
        break;
      case TPT_FUTURE_PIPELINE_FEATURE:
      case TPT_ND_CU:

        this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_MCH;
        this._sedepForLe(_clLeaderNodeElectionEnv, this.lgLsi);
        break;
      default:

        throw new IllegalStateException("*** Error: f0345fa5-998f-434e-be7e-a3bd40f17b0f");
    }

    this.cllLeaderNodeElectionEnv = _clLeaderNodeElectionEnv;
  }


  public synchronized void onneeniForCoLe(long befLT, long begLIdx,
      LeaderNodeElectionEnv _clLeaderNodeElectionEnv,
      ConsensusLogEntry[] _elnConsensusLogEntryArray) {
    if (this.mdstr
        == ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_FUTURE_PIPELINE_FEATURE) {
      while (this.lgLsi <= begLIdx) {
        if (begLIdx - this.lgMi > (long) this.iLsam) {

          this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_ND_CU;
          break;
        }

        this._sednweteForCoLe(befLT, begLIdx, _clLeaderNodeElectionEnv, _elnConsensusLogEntryArray);
      }
    }

    this.cllLeaderNodeElectionEnv = _clLeaderNodeElectionEnv;
  }


  void ontio() {
    if (this.mdstr
        == ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_FUTURE_PIPELINE_FEATURE) {

      this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_ND_CU;
      this._scutm(this.lgMtr);
    } else if (this.mdstr == ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_ND_CU) {

      this.mdstr = ConsensusTransactionLogProcessor.TransactionProcessorType.TPT_MCH;
    }

    if (this.cllLeaderNodeElectionEnv != null) {
      this._sedepForLe(this.cllLeaderNodeElectionEnv, this.lgLsi);
    }
  }


  public synchronized void str() {

    this._sedepForLe(this.cllLeaderNodeElectionEnv, this.lrConsensusTransactionLogEntry.apeie());
  }


  public enum TimeoutType implements ScHolderJobScheduler.SchedulerTypeService {


    RETRY
  }


  enum TransactionProcessorType {


    TPT_MCH,

    TPT_ND_CU,

    TPT_FUTURE_PIPELINE_FEATURE
  }
}
