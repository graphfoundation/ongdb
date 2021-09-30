package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.meta.fsm.State;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.github.onograph.config.NodeGroupIdentifier;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;


public interface ConsensusMessageServiceMeta {


  enum RaftConsensusMessageType {


    MTYPE_CONS_VOTE_REQ,

    MTYPE_CONS_VOTE_ANS,

    MTYPE_CONS_AE_REQ,

    MTYPE_CONS_AE_ANS,

    HEALTH_PING_REQ,

    HEALTH_PING_ANS,

    LCS_META,

    CONS_ELECT_TO,

    HEALTH_PING_TO,

    NIT_REQ,

    NBLK_REQ,

    CONS_PRN_REQ,

    PI_CONS_VOTE_REQ,

    PI_CONS_VOTE_ANS,

    LEADER_CHNG_REQ,

    LEADER_CHNG_REC,

    LEADER_CHNG_DENIED,

    INFO_REQ
  }


  interface CandidateVoteMessage {


    class Ask extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final ConsensusNodeId cniaeConsensusNodeId;


      private final long lgIll;


      private final long lgT;


      private final long lgTll;


      public Ask(ConsensusNodeId _cniaeConsensusNodeId, ConsensusNodeId _froConsensusNodeId,
          long _lgIll, long _lgTer, long _lgTll) {
        super(_froConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ);
        this.lgT = _lgTer;
        this.cniaeConsensusNodeId = _cniaeConsensusNodeId;
        this.lgIll = _lgIll;
        this.lgTll = _lgTll;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {

          Ask ask = (Ask) obj;
          return this.lgIll == ask.lgIll && this.lgTll == ask.lgTll && this.lgT == ask.lgT &&
              this.cniaeConsensusNodeId.equals(ask.cniaeConsensusNodeId);
        } else {
          return false;
        }
      }


      public ConsensusNodeId getCniaeConsensusNodeId() {
        return this.cniaeConsensusNodeId;
      }


      public long getLgIll() {
        return this.lgIll;
      }


      public long getLgT() {
        return this.lgT;
      }


      public long getLgTll() {
        return this.lgTll;
      }

      @Override
      public int hashCode() {

        int _iRsl = (int) this.lgT;
        _iRsl = 31 * _iRsl + this.cniaeConsensusNodeId.hashCode();
        _iRsl = 31 * _iRsl + (int) (this.lgIll ^ this.lgIll >>> 32);
        _iRsl = 31 * _iRsl + (int) (this.lgTll ^ this.lgTll >>> 32);
        return _iRsl;
      }


    }


    class Reply extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final boolean isGv;


      private final long lgT;


      public Reply(ConsensusNodeId _froConsensusNodeId, boolean _isGv, long _lgTer) {
        super(_froConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_ANS);
        this.lgT = _lgTer;
        this.isGv = _isGv;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {

          Reply reply = (Reply) obj;
          return this.lgT == reply.lgT && this.isGv == reply.isGv;
        } else {
          return false;
        }
      }


      public boolean getIsGv() {
        return this.isGv;
      }


      public long getLgT() {
        return this.lgT;
      }

      @Override
      public int hashCode() {

        int _iRsl = (int) this.lgT;
        _iRsl = 31 * _iRsl + (this.isGv ? 1 : 0);
        return _iRsl;
      }


    }
  }


  interface LeaderChangeService {


    class AskToChange extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final long lgIp;


      private final long lgT;


      private final Set<NodeGroupIdentifier> setGopNodeGroupIdentifier;

      public AskToChange(ConsensusNodeId _fConsensusNodeId, long _lgIp, long _lgTe,
          Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier) {
        super(_fConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ);
        this.lgIp = _lgIp;
        this.lgT = _lgTe;
        this.setGopNodeGroupIdentifier = Set.copyOf(_setGopNodeGroupIdentifier);
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object _obOjc) {
        if (this == _obOjc) {
          return true;
        } else if (_obOjc != null && this.getClass() == _obOjc.getClass()) {
          if (!super.equals(_obOjc)) {
            return false;
          } else {

            AskToChange askToChange = (AskToChange) _obOjc;
            return this.lgIp == askToChange.lgIp && this.lgT == askToChange.lgT &&
                Objects.equals(this.setGopNodeGroupIdentifier,
                    askToChange.setGopNodeGroupIdentifier);
          }
        } else {
          return false;
        }
      }


      public long getLgIp() {
        return this.lgIp;
      }


      public long getLgT() {
        return this.lgT;
      }


      public Set<NodeGroupIdentifier> getSetGopNodeGroupIdentifier() {
        return this.setGopNodeGroupIdentifier;
      }

      @Override
      public int hashCode() {
        return Objects.hash(super.hashCode(), this.lgIp, this.lgT, this.setGopNodeGroupIdentifier);
      }


    }


    class LeaderNotAccepted extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final long lgIp;


      private final long lgT;

      public LeaderNotAccepted(ConsensusNodeId _fConsensusNodeId, long _lgIp, long _lgTe) {
        super(_fConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_DENIED);
        this.lgIp = _lgIp;
        this.lgT = _lgTe;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object _obOjc) {
        if (this == _obOjc) {
          return true;
        } else if (_obOjc != null && this.getClass() == _obOjc.getClass()) {
          if (!super.equals(_obOjc)) {
            return false;
          } else {

            LeaderNotAccepted leaderNotAccepted = (LeaderNotAccepted) _obOjc;
            return this.lgIp == leaderNotAccepted.lgIp && this.lgT == leaderNotAccepted.lgT;
          }
        } else {
          return false;
        }
      }


      public long getLgIp() {
        return this.lgIp;
      }


      public long getLgT() {
        return this.lgT;
      }

      @Override
      public int hashCode() {
        return Objects.hash(super.hashCode(), this.lgIp, this.lgT);
      }


    }


    class LeaderRec extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final ConsensusNodeId pooeConsensusNodeId;


      private final Set<NodeGroupIdentifier> setGpNodeGroupIdentifier;

      public LeaderRec(ConsensusNodeId _frConsensusNodeId, ConsensusNodeId _pooeConsensusNodeId,
          Set<NodeGroupIdentifier> _setGpNodeGroupIdentifier) {
        super(_frConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REC);
        this.pooeConsensusNodeId = _pooeConsensusNodeId;
        this.setGpNodeGroupIdentifier = Set.copyOf(_setGpNodeGroupIdentifier);
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object _obOjc) {
        if (this == _obOjc) {
          return true;
        } else if (_obOjc != null && this.getClass() == _obOjc.getClass()) {
          if (!super.equals(_obOjc)) {
            return false;
          } else {

            LeaderRec leaderRec = (LeaderRec) _obOjc;
            return Objects.equals(this.pooeConsensusNodeId, leaderRec.pooeConsensusNodeId) &&
                Objects.equals(this.setGpNodeGroupIdentifier, leaderRec.setGpNodeGroupIdentifier);
          }
        } else {
          return false;
        }
      }


      public ConsensusNodeId getPooeConsensusNodeId() {
        return this.pooeConsensusNodeId;
      }


      public Set<NodeGroupIdentifier> getSetGpNodeGroupIdentifier() {
        return this.setGpNodeGroupIdentifier;
      }

      @Override
      public int hashCode() {
        return Objects.hash(super.hashCode(), this.pooeConsensusNodeId,
            this.setGpNodeGroupIdentifier);
      }


    }
  }


  interface MsgCreatorService {


    class Ask extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final SyncableData btval;


      public Ask(SyncableData btval, ConsensusNodeId _frConsensusNodeId) {
        super(_frConsensusNodeId, true, false,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.NIT_REQ);
        this.btval = btval;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {

          boolean _isVr00;
          label35:
          {

            Ask ask = (Ask) obj;
            if (this.btval != null) {
              if (this.btval.equals(ask.btval)) {
                break label35;
              }
            } else if (ask.btval == null) {
              break label35;
            }

            _isVr00 = false;
            return _isVr00;
          }

          _isVr00 = true;
          return _isVr00;
        } else {
          return false;
        }
      }


      public SyncableData getBtval() {
        return this.btval;
      }

      @Override
      public int hashCode() {
        return this.btval != null ? this.btval.hashCode() : 0;
      }


    }


    class BulkAsk extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final List<SyncableData> listBthSyncableData;

      public BulkAsk(List<SyncableData> _listBthSyncableData) {
        super(null, true, false,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.NBLK_REQ);
        this.listBthSyncableData = _listBthSyncableData;
      }


      public List<SyncableData> cottList() {
        return Collections.unmodifiableList(this.listBthSyncableData);
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
          if (!super.equals(obj)) {
            return false;
          } else {

            BulkAsk bulkAsk = (BulkAsk) obj;
            return Objects.equals(this.listBthSyncableData, bulkAsk.listBthSyncableData);
          }
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return Objects.hash(super.hashCode(), this.listBthSyncableData);
      }


    }
  }


  interface Processor<T, E extends Exception> {


    T process(CandidateVoteMessage.Ask _ask) throws E;


    T process(CandidateVoteMessage.Reply _reply) throws E;


    T process(VotePreparationMessage.Ask _ask) throws E;


    T process(VotePreparationMessage.Reply _reply) throws E;


    T process(TransactionLogAddMessage.Ask _ask) throws E;


    T process(TransactionLogAddMessage.Reply _reply) throws E;


    T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _aliveNoReplyMessage)
        throws E;


    T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _aliveReplyMessage)
        throws E;


    T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _requestTransactionLogCZMetaMessage)
        throws E;


    T process(Timeoutable.ConsensusElectionTimeout _consensusElectionTimeout) throws E;


    T process(Timeoutable.AliveMsg _aliveMsg) throws E;


    T process(MsgCreatorService.Ask _ask) throws E;


    T process(MsgCreatorService.BulkAsk _bulkAsk) throws E;


    T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _logClipRequestMessage)
        throws E;


    T process(LeaderChangeService.LeaderRec _leaderRec) throws E;


    T process(LeaderChangeService.AskToChange _askToChange) throws E;


    T process(LeaderChangeService.LeaderNotAccepted _leaderNotAccepted) throws E;


    T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _infoReplyMessage)
        throws E;
  }


  interface Timeoutable {


    class AliveMsg extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {

      public AliveMsg(ConsensusNodeId _fConsensusNodeId) {
        super(_fConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.HEALTH_PING_TO);
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }


    }


    class ConsensusElectionTimeout extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {

      public ConsensusElectionTimeout(ConsensusNodeId _frConsensusNodeId) {
        super(_frConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_ELECT_TO);
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }


    }
  }


  interface TransactionLogAddMessage {


    class Ask extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final long befLT;


      private final long begLIdx;


      private final ConsensusLogEntry[] etisConsensusLogEntryArray;


      private final long ldrComLng;


      private final long lgLt;


      public Ask(long befLT, long begLIdx, ConsensusLogEntry[] _etisConsensusLogEntryArray,
          ConsensusNodeId _fConsensusNodeId, long ldrComLng, long _lgLt) {
        super(_fConsensusNodeId, true, true,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ);
        Objects.requireNonNull(_etisConsensusLogEntryArray);

        assert (begLIdx != -1L || befLT == -1L) && (befLT != -1L || begLIdx == -1L) :
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask.format"),
                begLIdx,
                befLT);

        this.etisConsensusLogEntryArray = _etisConsensusLogEntryArray;
        this.lgLt = _lgLt;
        this.begLIdx = begLIdx;
        this.befLT = befLT;
        this.ldrComLng = ldrComLng;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {

          Ask ask = (Ask) obj;
          return Objects.equals(this.lgLt, ask.lgLt) && Objects.equals(this.begLIdx, ask.begLIdx) &&
              Objects.equals(this.befLT, ask.befLT) && Objects.equals(this.ldrComLng, ask.ldrComLng)
              &&
              Arrays.equals(this.etisConsensusLogEntryArray, ask.etisConsensusLogEntryArray);
        } else {
          return false;
        }
      }


      public long getBefLT() {
        return this.befLT;
      }


      public long getBegLIdx() {
        return this.begLIdx;
      }


      public ConsensusLogEntry[] getEtisConsensusLogEntryArray() {
        return this.etisConsensusLogEntryArray;
      }


      public long getLdrComLng() {
        return this.ldrComLng;
      }


      public long getLgLt() {
        return this.lgLt;
      }

      @Override
      public int hashCode() {
        return Objects.hash(this.lgLt, this.begLIdx, this.befLT,
            Arrays.hashCode(this.etisConsensusLogEntryArray), this.ldrComLng);
      }


    }


    class Reply extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final boolean isSces;


      private final long lgIa;


      private final long lgIm;


      private final long lgT;


      public Reply(ConsensusNodeId _froConsensusNodeId, boolean _isSces, long _lgIa, long _lgIm,
          long _lgTe) {
        super(_froConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_ANS);
        this.lgT = _lgTe;
        this.isSces = _isSces;
        this.lgIm = _lgIm;
        this.lgIa = _lgIa;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
          if (!super.equals(obj)) {
            return false;
          } else {

            Reply reply = (Reply) obj;
            return this.lgT == reply.lgT && this.isSces == reply.isSces && this.lgIm == reply.lgIm
                &&
                this.lgIa == reply.lgIa;
          }
        } else {
          return false;
        }
      }


      public boolean getIsSces() {
        return this.isSces;
      }


      public long getLgIa() {
        return this.lgIa;
      }


      public long getLgIm() {
        return this.lgIm;
      }


      public long getLgT() {
        return this.lgT;
      }

      @Override
      public int hashCode() {
        return Objects.hash(super.hashCode(), this.lgT, this.isSces, this.lgIm, this.lgIa);
      }


    }
  }


  interface VotePreparationMessage {


    class Ask extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final ConsensusNodeId cniaeConsensusNodeId;


      private final long lgIll;


      private final long lgT;


      private final long lgTll;


      public Ask(ConsensusNodeId _cniaeConsensusNodeId, ConsensusNodeId _fConsensusNodeId,
          long _lgIll, long _lgTe, long _lgTll) {
        super(_fConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.PI_CONS_VOTE_REQ);
        this.lgT = _lgTe;
        this.cniaeConsensusNodeId = _cniaeConsensusNodeId;
        this.lgIll = _lgIll;
        this.lgTll = _lgTll;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {

          Ask ask = (Ask) obj;
          return this.lgIll == ask.lgIll && this.lgTll == ask.lgTll && this.lgT == ask.lgT &&
              this.cniaeConsensusNodeId.equals(ask.cniaeConsensusNodeId);
        } else {
          return false;
        }
      }


      public ConsensusNodeId getCniaeConsensusNodeId() {
        return this.cniaeConsensusNodeId;
      }


      public long getLgIll() {
        return this.lgIll;
      }


      public long getLgT() {
        return this.lgT;
      }


      public long getLgTll() {
        return this.lgTll;
      }

      @Override
      public int hashCode() {

        int _iRsl = (int) this.lgT;
        _iRsl = 31 * _iRsl + this.cniaeConsensusNodeId.hashCode();
        _iRsl = 31 * _iRsl + (int) (this.lgIll ^ this.lgIll >>> 32);
        _iRsl = 31 * _iRsl + (int) (this.lgTll ^ this.lgTll >>> 32);
        return _iRsl;
      }


    }


    class Reply extends
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


      private final boolean isGv;


      private final long lgT;


      public Reply(ConsensusNodeId _fConsensusNodeId, boolean _isGv, long _lgTer) {
        super(_fConsensusNodeId,
            io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.PI_CONS_VOTE_ANS);
        this.lgT = _lgTer;
        this.isGv = _isGv;
      }

      @Override
      public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
        return processor.process(this);
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {

          Reply reply = (Reply) obj;
          return this.lgT == reply.lgT && this.isGv == reply.isGv;
        } else {
          return false;
        }
      }


      public boolean getIsGv() {
        return this.isGv;
      }


      public long getLgT() {
        return this.lgT;
      }

      @Override
      public int hashCode() {

        int _iRsl = (int) this.lgT;
        _iRsl = 31 * _iRsl + (this.isGv ? 1 : 0);
        return _iRsl;
      }


    }
  }


  abstract class AbstractConsensusMessage {


    protected final ConsensusNodeId froConsensusNodeId;


    private final boolean isDc;


    private final boolean isOr;


    private final io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme;


    AbstractConsensusMessage(ConsensusNodeId _fConsensusNodeId, boolean _isCd, boolean _isOr,
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme) {
      this.froConsensusNodeId = _fConsensusNodeId;
      this.isDc = _isCd;
      this.isOr = _isOr;
      this.tNme = tNme;
    }

    AbstractConsensusMessage(ConsensusNodeId _fConsensusNodeId,
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme) {
      this(_fConsensusNodeId, false, false, tNme);
    }


    public abstract <T, E extends Exception> T dipc(Processor<T, E> _processorVate) throws E;

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage _thAbstractConsensusMessage =
            (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) obj;
        return
            Objects.equals(this.froConsensusNodeId, _thAbstractConsensusMessage.froConsensusNodeId)
                &&
                this.tNme == _thAbstractConsensusMessage.tNme;
      } else {
        return false;
      }
    }


    public ConsensusNodeId getFroConsensusNodeId() {
      return this.froConsensusNodeId;
    }


    public boolean getIsDc() {
      return this.isDc;
    }


    public boolean getIsOr() {
      return this.isOr;
    }


    public io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType getTNme() {
      return this.tNme;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.froConsensusNodeId, this.tNme);
    }
  }


  class AliveNoReplyMessage extends
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


    private final long lgIc;


    private final long lgLt;


    private final long lgTic;


    public AliveNoReplyMessage(ConsensusNodeId _fConsensusNodeId, long _lgIc, long _lgLt,
        long _lgTic) {
      super(_fConsensusNodeId,
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.HEALTH_PING_REQ);
      this.lgLt = _lgLt;
      this.lgIc = _lgIc;
      this.lgTic = _lgTic;
    }

    @Override
    public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
      return processor.process(this);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {
        if (!super.equals(obj)) {
          return false;
        } else {

          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage =
              (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage) obj;
          return this.lgLt == _hatetAliveNoReplyMessage.lgLt
              && this.lgIc == _hatetAliveNoReplyMessage.lgIc &&
              this.lgTic == _hatetAliveNoReplyMessage.lgTic;
        }
      } else {
        return false;
      }
    }


    public long getLgIc() {
      return this.lgIc;
    }


    public long getLgLt() {
      return this.lgLt;
    }


    public long getLgTic() {
      return this.lgTic;
    }

    @Override
    public int hashCode() {

      int _iRsl = super.hashCode();
      _iRsl = 31 * _iRsl + (int) (this.lgLt ^ this.lgLt >>> 32);
      _iRsl = 31 * _iRsl + (int) (this.lgIc ^ this.lgIc >>> 32);
      _iRsl = 31 * _iRsl + (int) (this.lgTic ^ this.lgTic >>> 32);
      return _iRsl;
    }


  }


  class AliveReplyMessage extends
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {

    public AliveReplyMessage(ConsensusNodeId _frConsensusNodeId) {
      super(_frConsensusNodeId,
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.HEALTH_PING_ANS);
    }

    @Override
    public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
      return processor.process(this);
    }


  }


  final class ArrivingMessageManager<RM extends io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> {


    private final Instant arInstant;


    private final ConsensusMemberGroupId consensusMemberGroupId;


    private final RM m;

    private ArrivingMessageManager(Instant _arInstant,
        ConsensusMemberGroupId consensusMemberGroupId, RM m) {
      Objects.requireNonNull(m);
      this.consensusMemberGroupId = consensusMemberGroupId;
      this.arInstant = _arInstant;
      this.m = m;
    }


    public static <RM extends io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<RM> ofConsensusMessageServiceMetaArrivingMessageManager(
        Instant _arInstant, ConsensusMemberGroupId consensusMemberGroupId, RM m) {
      return new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager(
          _arInstant, consensusMemberGroupId,
          m);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerThObject =
            (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager) obj;
        return Objects.equals(this.arInstant, _arrivingMessageManagerThObject.arInstant) &&
            Objects.equals(this.consensusMemberGroupId,
                _arrivingMessageManagerThObject.consensusMemberGroupId) &&
            Objects.equals(this.getM(), _arrivingMessageManagerThObject.getM());
      } else {
        return false;
      }
    }


    public Instant getArInstant() {
      return this.arInstant;
    }


    public ConsensusMemberGroupId getConsensusMemberGroupId() {
      return this.consensusMemberGroupId;
    }


    public RM getM() {
      return this.m;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.arInstant, this.consensusMemberGroupId, this.getM());
    }


  }


  final class DepartingMessageManager<RM extends io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> {


    private final ConsensusMemberGroupId consensusMemberGroupId;


    private final RM m;

    private DepartingMessageManager(ConsensusMemberGroupId consensusMemberGroupId, RM m) {
      Objects.requireNonNull(m);
      this.consensusMemberGroupId = consensusMemberGroupId;
      this.m = m;
    }


    public static <RM extends io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<RM> ofConsensusMessageServiceMetaDepartingMessageManager(
        ConsensusMemberGroupId consensusMemberGroupId, RM m) {
      return new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager(
          consensusMemberGroupId, m);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?> _departingMessageManagerThaObject =
            (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager) obj;
        return Objects.equals(this.consensusMemberGroupId,
            _departingMessageManagerThaObject.consensusMemberGroupId) &&
            Objects.equals(this.getM(), _departingMessageManagerThaObject.getM());
      } else {
        return false;
      }
    }


    public ConsensusMemberGroupId getConsensusMemberGroupId() {
      return this.consensusMemberGroupId;
    }


    public RM getM() {
      return this.m;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.consensusMemberGroupId, this.getM());
    }


  }


  class InfoReplyMessage extends
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


    private final UUID irUUID;


    private final State stat;


    public InfoReplyMessage(ConsensusNodeId _fConsensusNodeId, UUID _riUUID, State stat) {
      super(_fConsensusNodeId,
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.INFO_REQ);
      this.stat = stat;
      this.irUUID = _riUUID;
    }

    @Override
    public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
      return processor.process(this);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {
        if (!super.equals(obj)) {
          return false;
        } else {

          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _thInfoReplyMessage =
              (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage) obj;
          return Objects.equals(this.stat, _thInfoReplyMessage.stat) && Objects.equals(this.irUUID,
              _thInfoReplyMessage.irUUID);
        }
      } else {
        return false;
      }
    }


    public UUID getIrUUID() {
      return this.irUUID;
    }


    public State getStat() {
      return this.stat;
    }

    @Override
    public int hashCode() {
      return Objects.hash(super.hashCode(), this.stat, this.irUUID);
    }


  }


  class LogClipRequestMessage extends
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


    private final long lgIp;

    public LogClipRequestMessage(long _lgPi) {
      super(null,
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_PRN_REQ);
      this.lgIp = _lgPi;
    }

    @Override
    public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
      return processor.process(this);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {
        if (!super.equals(obj)) {
          return false;
        } else {

          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _tLogClipRequestMessage =
              (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage) obj;
          return this.lgIp == _tLogClipRequestMessage.lgIp;
        }
      } else {
        return false;
      }
    }


    public long getLgIp() {
      return this.lgIp;
    }

    @Override
    public int hashCode() {
      return Objects.hash(super.hashCode(), this.lgIp);
    }


  }


  class Messager {


    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m;


    ConsensusNodeId toConsensusNodeId;


    public Messager(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m,
        ConsensusNodeId _tConsensusNodeId) {
      this.m = m;
      this.toConsensusNodeId = _tConsensusNodeId;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager _drceMessager =
            (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager) obj;
        return Objects.equals(this.toConsensusNodeId, _drceMessager.toConsensusNodeId)
            && Objects.equals(this.m, _drceMessager.m);
      } else {
        return false;
      }
    }


    public io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage getM() {
      return this.m;
    }


    public ConsensusNodeId getToConsensusNodeId() {
      return this.toConsensusNodeId;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.toConsensusNodeId, this.m);
    }


  }


  abstract class ProcessorAdaptor<T, E extends Exception> implements Processor<T, E> {

    @Override
    public T process(CandidateVoteMessage.Ask ask) throws E {
      return null;
    }

    @Override
    public T process(CandidateVoteMessage.Reply reply) throws E {
      return null;
    }

    @Override
    public T process(VotePreparationMessage.Ask ask) throws E {
      return null;
    }

    @Override
    public T process(VotePreparationMessage.Reply reply) throws E {
      return null;
    }

    @Override
    public T process(TransactionLogAddMessage.Ask ask) throws E {
      return null;
    }

    @Override
    public T process(TransactionLogAddMessage.Reply reply) throws E {
      return null;
    }

    @Override
    public T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage)
        throws E {
      return null;
    }

    @Override
    public T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage)
        throws E {
      return null;
    }

    @Override
    public T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _iclRequestTransactionLogCZMetaMessage)
        throws E {
      return null;
    }

    @Override
    public T process(Timeoutable.ConsensusElectionTimeout consensusElectionTimeout) throws E {
      return null;
    }

    @Override
    public T process(Timeoutable.AliveMsg aliveMsg) throws E {
      return null;
    }

    @Override
    public T process(MsgCreatorService.Ask ask) throws E {
      return null;
    }

    @Override
    public T process(MsgCreatorService.BulkAsk bulkAsk) throws E {
      return null;
    }

    @Override
    public T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage)
        throws E {
      return null;
    }

    @Override
    public T process(LeaderChangeService.LeaderRec leaderRec) throws E {
      return null;
    }

    @Override
    public T process(LeaderChangeService.AskToChange askToChange) throws E {
      return null;
    }

    @Override
    public T process(LeaderChangeService.LeaderNotAccepted leaderNotAccepted) throws E {
      return null;
    }

    @Override
    public T process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _srInfoReplyMessage)
        throws E {
      return null;
    }
  }


  class RequestTransactionLogCZMetaMessage extends
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage {


    private final long befIdx;


    private final long lgLt;


    public RequestTransactionLogCZMetaMessage(long befIdx, ConsensusNodeId _frConsensusNodeId,
        long _lgTl) {
      super(_frConsensusNodeId,
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LCS_META);
      this.lgLt = _lgTl;
      this.befIdx = befIdx;
    }

    @Override
    public <T, E extends Exception> T dipc(Processor<T, E> processor) throws E {
      return processor.process(this);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {
        if (!super.equals(obj)) {
          return false;
        } else {

          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage
              _ohrRequestTransactionLogCZMetaMessage =
              (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage) obj;
          return this.lgLt == _ohrRequestTransactionLogCZMetaMessage.lgLt
              && this.befIdx == _ohrRequestTransactionLogCZMetaMessage.befIdx;
        }
      } else {
        return false;
      }
    }


    public long getBefIdx() {
      return this.befIdx;
    }


    public long getLgLt() {
      return this.lgLt;
    }

    @Override
    public int hashCode() {

      int _iRsl = super.hashCode();
      _iRsl = 31 * _iRsl + (int) (this.lgLt ^ this.lgLt >>> 32);
      _iRsl = 31 * _iRsl + (int) (this.befIdx ^ this.befIdx >>> 32);
      return _iRsl;
    }


  }
}
