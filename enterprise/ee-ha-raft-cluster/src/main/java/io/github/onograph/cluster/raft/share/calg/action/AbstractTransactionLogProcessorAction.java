package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.share.calg.ConsensusTransactionLogProcessor;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeElectionEnv;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import java.util.Arrays;


public abstract class AbstractTransactionLogProcessorAction {


  public abstract void apltoForCoLe(
      ConsensusTransactionLogProcessor _consensusTransactionLogProcessor,
      LeaderNodeElectionEnv _leaderNodeElectionEnv);


  public static class FindComAction extends AbstractTransactionLogProcessorAction {


    private final long lgImn;


    private final Object obTre;

    public FindComAction(long _lgImn, Object _obTre) {
      this.lgImn = _lgImn;
      this.obTre = _obTre;
    }

    @Override
    public void apltoForCoLe(ConsensusTransactionLogProcessor _slrConsensusTransactionLogProcessor,
        LeaderNodeElectionEnv _lcLeaderNodeElectionEnv) {
      if (_slrConsensusTransactionLogProcessor.getFloeConsensusNodeId().equals(this.obTre)) {
        _slrConsensusTransactionLogProcessor.onmahForLe(_lcLeaderNodeElectionEnv, this.lgImn);
      }
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction _mthFindComAction =
            (io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction) obj;
        return this.lgImn == _mthFindComAction.lgImn && this.obTre.equals(_mthFindComAction.obTre);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {

      int _iRsl = (int) (this.lgImn ^ this.lgImn >>> 32);
      _iRsl = 31 * _iRsl + this.obTre.hashCode();
      return _iRsl;
    }


  }


  public static class FinishChangeAction extends AbstractTransactionLogProcessorAction {

    @Override
    public void apltoForCoLe(ConsensusTransactionLogProcessor _slrConsensusTransactionLogProcessor,
        LeaderNodeElectionEnv _lcLeaderNodeElectionEnv) {
      _slrConsensusTransactionLogProcessor.oncoiuptForLe(_lcLeaderNodeElectionEnv);
    }


  }


  public static class IncomingAction extends AbstractTransactionLogProcessorAction {


    private final long befLT;


    private final long begLIdx;


    private final ConsensusLogEntry[] elnConsensusLogEntryArray;


    public IncomingAction(long befLT, long begLIdx,
        ConsensusLogEntry[] _elnConsensusLogEntryArray) {
      this.befLT = befLT;
      this.begLIdx = begLIdx;
      this.elnConsensusLogEntryArray = _elnConsensusLogEntryArray;
    }

    @Override
    public void apltoForCoLe(ConsensusTransactionLogProcessor _slrConsensusTransactionLogProcessor,
        LeaderNodeElectionEnv _clLeaderNodeElectionEnv) {
      _slrConsensusTransactionLogProcessor.onneeniForCoLe(this.befLT, this.begLIdx,
          _clLeaderNodeElectionEnv, this.elnConsensusLogEntryArray);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction _enIncomingAction =
            (io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction) obj;
        if (this.begLIdx != _enIncomingAction.begLIdx) {
          return false;
        } else {
          return this.befLT == _enIncomingAction.befLT &&
              Arrays.equals(this.elnConsensusLogEntryArray,
                  _enIncomingAction.elnConsensusLogEntryArray);
        }
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {

      int _iRsl = (int) (this.begLIdx ^ this.begLIdx >>> 32);
      _iRsl = 31 * _iRsl + (int) (this.befLT ^ this.befLT >>> 32);
      _iRsl = 31 * _iRsl + Arrays.hashCode(this.elnConsensusLogEntryArray);
      return _iRsl;
    }


  }


  public static class NoComAction extends AbstractTransactionLogProcessorAction {


    private final long lgIarl;


    private final Object obTre;

    public NoComAction(long _lgIarl, Object _obTre) {
      this.lgIarl = _lgIarl;
      this.obTre = _obTre;
    }

    @Override
    public void apltoForCoLe(ConsensusTransactionLogProcessor _slrConsensusTransactionLogProcessor,
        LeaderNodeElectionEnv _clLeaderNodeElectionEnv) {
      if (_slrConsensusTransactionLogProcessor.getFloeConsensusNodeId().equals(this.obTre)) {
        _slrConsensusTransactionLogProcessor.onmiahForLe(_clLeaderNodeElectionEnv, this.lgIarl);
      }
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction _msacNoComAction =
            (io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction) obj;
        return this.lgIarl == _msacNoComAction.lgIarl && this.obTre.equals(_msacNoComAction.obTre);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {

      int _iRsl = (int) (this.lgIarl ^ this.lgIarl >>> 32);
      _iRsl = 31 * _iRsl + this.obTre.hashCode();
      return _iRsl;
    }


  }
}
