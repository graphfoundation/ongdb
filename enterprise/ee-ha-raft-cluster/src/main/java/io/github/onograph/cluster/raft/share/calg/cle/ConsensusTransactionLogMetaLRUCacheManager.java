package io.github.onograph.cluster.raft.share.calg.cle;

import java.util.Objects;
import java.util.Set;
import java.util.function.LongPredicate;
import org.neo4j.internal.helpers.collection.LruCache;


public class ConsensusTransactionLogMetaLRUCacheManager {


  private final LruCache<Long, io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo>
      lruCacheCelrlc;

  public ConsensusTransactionLogMetaLRUCacheManager(int _iScel) {
    this.lruCacheCelrlc = new LruCache(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.iScel"),
        _iScel);
  }


  private void _reoForLo(LongPredicate _longPredicate) {

    Set<Long> _setVr00Long = this.lruCacheCelrlc.keySet();
    Objects.requireNonNull(_longPredicate);
    _setVr00Long.removeIf(_longPredicate::test);
  }


  public io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo cahmedaConsensusTransactionLogMetaLRUCacheManagerConsensusTransactionLogInfo(
      long lgIdx, long _lgTe, org.neo4j.kernel.impl.transaction.log.LogPosition _logPosition) {

    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo
        _rslConsensusTransactionLogInfo =
        new io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo(
            _lgTe,
            _logPosition);
    this.lruCacheCelrlc.put(lgIdx, _rslConsensusTransactionLogInfo);
    return _rslConsensusTransactionLogInfo;
  }


  public void cla() {
    this.lruCacheCelrlc.clear();
  }


  public io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo gematConsensusTransactionLogMetaLRUCacheManagerConsensusTransactionLogInfo(
      long lgIdx) {
    return this.lruCacheCelrlc.get(lgIdx);
  }


  public void reeurfo(long _lgSf) {
    this._reoForLo((key) ->
    {
      return key >= _lgSf;
    });
  }


  public void reouto(long _lgU) {
    this._reoForLo((key) ->
    {
      return key <= _lgU;
    });
  }


  public static class ConsensusTransactionLogInfo {


    private final long lgTe;


    private final org.neo4j.kernel.impl.transaction.log.LogPosition psLogPosition;

    public ConsensusTransactionLogInfo(long _lgTe,
        org.neo4j.kernel.impl.transaction.log.LogPosition _psLogPosition) {
      Objects.requireNonNull(_psLogPosition);
      this.lgTe = _lgTe;
      this.psLogPosition = _psLogPosition;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo
            _thaConsensusTransactionLogInfo =
            (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo) obj;
        return this.lgTe == _thaConsensusTransactionLogInfo.lgTe && this.psLogPosition.equals(
            _thaConsensusTransactionLogInfo.psLogPosition);
      } else {
        return false;
      }
    }


    public long getLgTe() {
      return this.lgTe;
    }

    @Override
    public int hashCode() {

      int _iRsl = (int) (this.lgTe ^ this.lgTe >>> 32);
      _iRsl = 31 * _iRsl + this.psLogPosition.hashCode();
      return _iRsl;
    }


  }
}
